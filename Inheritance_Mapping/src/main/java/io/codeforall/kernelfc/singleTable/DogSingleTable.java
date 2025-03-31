package io.codeforall.kernelfc.singleTable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "DogSingleTable")
@DiscriminatorValue("dog")
public class DogSingleTable extends AnimalSingleTable {

    private String dogBreed;
    private String dogcolor;

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getDogcolor() {
        return dogcolor;
    }

    public void setDogcolor(String dogcolor) {
        this.dogcolor = dogcolor;
    }
}
