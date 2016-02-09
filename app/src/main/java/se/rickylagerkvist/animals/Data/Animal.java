package se.rickylagerkvist.animals.Data;

/**
 * Created by Ricky on 2016-02-02.
 */
public class Animal {

    // instansvariabler
    /*
     ID i XLM
     @drawable/image_of_panda
     
     ID i JAVA
     R.drawable.image_of_panda
    */

    private int imageId;
    private String name;
    private String description;

    // klassvariabler

    // Konstruktorer
    public Animal () {

    }

    public Animal(int imageId, String name, String description) {
        this.imageId = imageId;
        this.name = name;
        this.description = description;
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // instansmetoder

    // klassmetoder
}
