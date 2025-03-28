package io.codeforall.kernelfc;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Playground {

    public static void main(String[] args) {

        Car car = new Car();
        Engine engine = new Engine();
        Customer customer = new Customer();

        engine.setType("Sport");
        engine.setDisplacement(4.0);
        engine.setHorsepower(400);

        customer.setFirst_name("Alfred");
        customer.setEmail("alfredrocher@email.com");

        car.setYear(2024);
        car.setModel("Panda");

        car.setEngine(engine);
        car.setCustomer(customer);

// Use the test persistence unit to configure a new
// entity manager factory and start up JPA
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        Crud crud = new Crud(emf);
        crud.saveOrUpdate(car);
        System.out.println(crud.findById(1));

// Shutdown JPA
        emf.close();
    }
}
