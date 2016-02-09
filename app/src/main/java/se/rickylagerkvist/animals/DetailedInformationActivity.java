package se.rickylagerkvist.animals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import se.rickylagerkvist.animals.Data.Animal;
import se.rickylagerkvist.animals.Data.Zoo;

public class DetailedInformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_information);

        // Hämta view från vår layout-fil
        ImageView animalPortrait = (ImageView) findViewById(R.id.animal_portrait);
        TextView animalHeadline = (TextView) findViewById(R.id.animal_headline);
        TextView animalDesciption = (TextView) findViewById(R.id.animal_description);

        // Vilket djur ska vi visa upp?
        Intent intent = getIntent();
        String animalToDisplay = intent.getStringExtra("animal");

        // Skapa ett Zoo
        Zoo theZoo = new Zoo();

        // Hämta ut ett djur
        Animal animal = theZoo.getAnimal(animalToDisplay);

        if(animal != null){
            animalHeadline.setText(animal.getName());
            animalDesciption.setText(animal.getDescription());
            animalPortrait.setImageResource(animal.getImageId());
       }


    }


}
