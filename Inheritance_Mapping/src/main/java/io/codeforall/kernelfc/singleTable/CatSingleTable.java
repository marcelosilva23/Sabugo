package io.codeforall.kernelfc.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "CatSingleTable")
@DiscriminatorValue("cat")

public class CatSingleTable extends AnimalSingleTable {

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
