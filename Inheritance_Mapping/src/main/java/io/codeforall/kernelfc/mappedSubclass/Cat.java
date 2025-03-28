package io.codeforall.kernelfc.mappedSubclass;

import javax.persistence.*;

@Entity
@Table(name = "cat")
public class Cat extends Animal {
    private String catBreed;
    private String catColor;

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public String getCatColor() {
        return catColor;
    }

    public void setCatColor(String catColor) {
        this.catColor = catColor;
    }
}


