package io.codeforall.kernelfc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;
import java.sql.*;

public class Crud {

    private EntityManagerFactory emf;

    public Crud(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public Car findById (Integer id) {


        EntityManager em = emf.createEntityManager();

        try {

            return em.find(Car.class, id);
        } finally {
                em.close();
            }
        }

    public Car saveOrUpdate (Car car) {

        EntityManager em = emf.createEntityManager();

        try {

            em.getTransaction().begin(); // open transaction
            Car savedCar = em.merge(car);
            em.getTransaction().commit(); // close transaction
            return savedCar;

        } catch (RollbackException ex) {

            // something went wrong, make sure db is consistent
            em.getTransaction().rollback();
            return null;

        } finally {
                em.close();
            }
        }
    }