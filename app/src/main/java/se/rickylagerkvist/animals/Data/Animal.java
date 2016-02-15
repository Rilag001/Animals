package se.rickylagerkvist.animals.Data;

/**
 * Created by Ricky on 2016-02-02.
 */
public class Animal {

    public String name;
    public String description;
    public int imageId;

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
