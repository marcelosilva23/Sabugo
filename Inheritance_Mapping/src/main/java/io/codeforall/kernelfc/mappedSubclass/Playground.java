package io.codeforall.kernelfc.mappedSubclass;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Playground {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("animal");
        Operations operations = new Operations();
        operations.setEmf(emf);

        Cat cat = new Cat();
        Dog dog = new Dog();


        dog.setDogBreed("Yorkshire terrier");
        dog.setDogColor("Black");
        dog.setName("Sampa");
        dog.setAge(11);
        operations.saveOrUpdate(dog);
        operations.findDogById(1);


        cat.setCatBreed("Sphynx");
        cat.setCatColor("Whites");
        cat.setName("Olivia");
        cat.setAge(3);
        operations.saveOrUpdate(cat);
        operations.findCatById(1);

        Cat cat1 = new Cat();




// Shutdown JPA
        emf.close();
    }
}
