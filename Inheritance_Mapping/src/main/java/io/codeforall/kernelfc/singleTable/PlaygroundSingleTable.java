package io.codeforall.kernelfc.singleTable;

import io.codeforall.kernelfc.mappedSubclass.Cat;
import io.codeforall.kernelfc.mappedSubclass.Dog;
import io.codeforall.kernelfc.mappedSubclass.Operations;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PlaygroundSingleTable {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("animal_st");
        OperationsSingleTable operations = new OperationsSingleTable();
        operations.setEmf(emf);


        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.setName("Careca");
        cat.setAge(2);
        cat.setCatBreed("Siamese");
        cat.setCatColor("White");

        dog.setName("Bob");
        dog.setAge(11);
        dog.setDogBreed("YorkShire");
        dog.setDogColor("Brown and Grey");

        operations.saveOrUpdate(cat);
        operations.saveOrUpdate(dog);

        operations.findCatById(cat.getId());
        operations.findDogById(dog.getId());

        emf.close();
    }

}
