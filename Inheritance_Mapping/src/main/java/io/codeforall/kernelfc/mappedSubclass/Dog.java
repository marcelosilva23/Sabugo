package io.codeforall.kernelfc.mappedSubclass;

import javax.persistence.*;

@Entity
@Table(name = "dog")
public class Dog extends Animal{

    private String dogBreed;
    private String dogColor;



    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getDogColor() {
        return dogColor;
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }
}




