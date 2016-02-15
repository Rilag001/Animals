package se.rickylagerkvist.animals.Data;

import java.util.ArrayList;

import se.rickylagerkvist.animals.Data.Animal;
import se.rickylagerkvist.animals.R;

/**
 * Created by Ricky on 2016-02-02.
 */
public class Zoo {

    private ArrayList<Animal> mAnimals = new ArrayList<>();


    // Klassens konstruktor skapar 3 djur
    public Zoo() {
        CreateNewAnimal(R.drawable.tiger, "Tiger", "Tiger (Panthera tigris) är ett kattdjur som endast lever i Asien. Tigern är det största nu levande kattdjuret. Man delar upp de idag förekommande bestånden i sex underarter. Utöver detta känner man till tre utdöda underarter. De flesta tigrar lever i fuktig tropisk och subtropisk lövskog, men finns även i tempererade löv- och barrskogar. I denna miljö utgör pälsens mönster bra kamouflage. Källa text och bild: https://sv.wikipedia.org/wiki/Tiger");
        CreateNewAnimal(R.drawable.bear, "Björn", "Björnar (Ursidae) är en familj av större rovdjur och som idag omfattar åtta arter som förekommer över stora delar av norra- och södra halvklotet. Björnar lever i Eurasien, Nord- och Sydamerika och de fanns tidigare även i norra Afrika. Arterna är främst allätaremed undantag av jättepandan som huvudsakligen lever av bambuskott och isbjörnen som har kött som huvudföda. Källa text och bild: https://sv.wikipedia.org/wiki/Bj%C3%B6rnar");
        CreateNewAnimal(R.drawable.uggla, "Uggla", "Ugglor (Strigidae) är en familj inom ordningen ugglefåglar (Strigiformes). Det finns nästan 200 olika arter inom 21 släkten i familjen äkta ugglor i världen. Källa text och bild: https://sv.wikipedia.org/wiki/Ugglor");
    }

    public void CreateNewAnimal (int imageId, String name, String description){
        mAnimals.add(new Animal(imageId, name, description));
    }


    /*public ArrayList<Animal> getAnimals(){
        return;
    }*/

    public Animal getAnimal(String whitchAnimal){

        int index = -1;

        switch (whitchAnimal) {
            case "Tiger":
                index = 0;
                break;
            case "Björn":
                index = 1;
                break;
            case "Uggla":
                index = 2;
                break;
        }

        if(index == -1) {
            return null;
        } else {
            return mAnimals.get(index);
        }

    }

}