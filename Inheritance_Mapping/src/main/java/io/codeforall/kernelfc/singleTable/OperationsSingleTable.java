package io.codeforall.kernelfc.singleTable;

import io.codeforall.kernelfc.mappedSubclass.Animal;
import io.codeforall.kernelfc.mappedSubclass.Cat;
import io.codeforall.kernelfc.mappedSubclass.Dog;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.RollbackException;

public class OperationsSingleTable {

    private EntityManagerFactory emf;

    public Cat findCatById (Integer id) {


        EntityManager em = emf.createEntityManager();

        try {

            return em.find(Cat.class, id);
        } finally {
            em.close();
        }
    }

    public Dog findDogById (Integer id) {


        EntityManager em = emf.createEntityManager();

        try {
            return em.find(Dog.class, id);
        } finally {
            em.close();
        }
    }
    public Animal saveOrUpdate (Animal animal) {

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Animal savedAnimal= em.merge(animal);
            em.getTransaction().commit();
            return savedAnimal;

        } catch (RollbackException ex) {
            em.getTransaction().rollback();
            return null;
        } finally {
            em.close();
        }
    }

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }
}
