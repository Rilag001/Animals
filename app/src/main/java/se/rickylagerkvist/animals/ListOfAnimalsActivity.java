package se.rickylagerkvist.animals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import se.rickylagerkvist.animals.Data.Animal;
import se.rickylagerkvist.animals.Data.Zoo;

public class ListOfAnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_animal);

        // RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.cardList);
        recyclerView.setHasFixedSize(true);

        // LinearLayoutManager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        // PageAdapter
        AnimalCardAdapter ca = new AnimalCardAdapter(createList());
        recyclerView.setAdapter(ca);
    }

    // Create ArrayList to put in AnimalCardAdapter and create nine animals
    private ArrayList createList() {

        ArrayList<Animal> animalList = new ArrayList<>();

        animalList.add(new Animal(R.drawable.tiger, "Tiger", "Tiger (Panthera tigris) är ett kattdjur som endast lever i Asien. Tigern är det största nu levande kattdjuret. Man delar upp de idag förekommande bestånden i sex underarter. Utöver detta känner man till tre utdöda underarter. De flesta tigrar lever i fuktig tropisk och subtropisk lövskog, men finns även i tempererade löv- och barrskogar. I denna miljö utgör pälsens mönster bra kamouflage. Källa text och bild: https://sv.wikipedia.org/wiki/Tiger"));
        animalList.add(new Animal(R.drawable.bear, "Björn", "Björnar (Ursidae) är en familj av större rovdjur och som idag omfattar åtta arter som förekommer över stora delar av norra- och södra halvklotet. Björnar lever i Eurasien, Nord- och Sydamerika och de fanns tidigare även i norra Afrika. Arterna är främst allätaremed undantag av jättepandan som huvudsakligen lever av bambuskott och isbjörnen som har kött som huvudföda. Källa text och bild: https://sv.wikipedia.org/wiki/Bj%C3%B6rnar"));
        animalList.add(new Animal(R.drawable.uggla, "Uggla", "Ugglor (Strigidae) är en familj inom ordningen ugglefåglar (Strigiformes). Det finns nästan 200 olika arter inom 21 släkten i familjen äkta ugglor i världen. Källa text och bild: https://sv.wikipedia.org/wiki/Ugglor"));

        animalList.add(new Animal(R.drawable.tiger, "Tiger", "Tiger (Panthera tigris) är ett kattdjur som endast lever i Asien. Tigern är det största nu levande kattdjuret. Man delar upp de idag förekommande bestånden i sex underarter. Utöver detta känner man till tre utdöda underarter. De flesta tigrar lever i fuktig tropisk och subtropisk lövskog, men finns även i tempererade löv- och barrskogar. I denna miljö utgör pälsens mönster bra kamouflage. Källa text och bild: https://sv.wikipedia.org/wiki/Tiger"));
        animalList.add(new Animal(R.drawable.bear, "Björn", "Björnar (Ursidae) är en familj av större rovdjur och som idag omfattar åtta arter som förekommer över stora delar av norra- och södra halvklotet. Björnar lever i Eurasien, Nord- och Sydamerika och de fanns tidigare även i norra Afrika. Arterna är främst allätaremed undantag av jättepandan som huvudsakligen lever av bambuskott och isbjörnen som har kött som huvudföda. Källa text och bild: https://sv.wikipedia.org/wiki/Bj%C3%B6rnar"));
        animalList.add(new Animal(R.drawable.uggla, "Uggla", "Ugglor (Strigidae) är en familj inom ordningen ugglefåglar (Strigiformes). Det finns nästan 200 olika arter inom 21 släkten i familjen äkta ugglor i världen. Källa text och bild: https://sv.wikipedia.org/wiki/Ugglor"));

        animalList.add(new Animal(R.drawable.tiger, "Tiger", "Tiger (Panthera tigris) är ett kattdjur som endast lever i Asien. Tigern är det största nu levande kattdjuret. Man delar upp de idag förekommande bestånden i sex underarter. Utöver detta känner man till tre utdöda underarter. De flesta tigrar lever i fuktig tropisk och subtropisk lövskog, men finns även i tempererade löv- och barrskogar. I denna miljö utgör pälsens mönster bra kamouflage. Källa text och bild: https://sv.wikipedia.org/wiki/Tiger"));
        animalList.add(new Animal(R.drawable.bear, "Björn", "Björnar (Ursidae) är en familj av större rovdjur och som idag omfattar åtta arter som förekommer över stora delar av norra- och södra halvklotet. Björnar lever i Eurasien, Nord- och Sydamerika och de fanns tidigare även i norra Afrika. Arterna är främst allätaremed undantag av jättepandan som huvudsakligen lever av bambuskott och isbjörnen som har kött som huvudföda. Källa text och bild: https://sv.wikipedia.org/wiki/Bj%C3%B6rnar"));
        animalList.add(new Animal(R.drawable.uggla, "Uggla", "Ugglor (Strigidae) är en familj inom ordningen ugglefåglar (Strigiformes). Det finns nästan 200 olika arter inom 21 släkten i familjen äkta ugglor i världen. Källa text och bild: https://sv.wikipedia.org/wiki/Ugglor"));

        return animalList;
    }




    // Button "explore"
    public void exploreAnimal(View view){

        // Which explore button?
        String tag = view.getTag().toString();

        Intent intent = new Intent(this, DetailedInformationActivity.class);
        intent.putExtra("animal", tag); // key & value
        startActivity(intent);
    }

    // Button "SHARE" tiger
    public void shareTigerInformation(View view){

        // Visa upp en "Toast" med att vi klickat på knappen
        Toast.makeText(ListOfAnimalsActivity.this, "Du har klickat på knappen!", Toast.LENGTH_SHORT).show();

        // Skapa en implicit intent, dvs skicka info som kan tas emot av en annan app
        // (this, annanActivity.class för att gå till annan activity)
        Intent intent = new Intent();
        // Vad vill vi göra? Skicka text
        intent.setAction(Intent.ACTION_SEND);
        // Vilken text ska vi skicka?
        intent.putExtra(intent.EXTRA_TEXT, "Tiger is very Tigery!"); //Nyckel och meddelende
        // Vad är det för något vi skickar?
        intent.setType("text/plain");

        startActivity(intent);
    }

    // Button "SHARE" Owl
    public void shareUgglaInformation(View view) {

        // Visa upp en "Toast" med att vi klickat på knappen
        Toast.makeText(ListOfAnimalsActivity.this, "Du har klickat på knappen!", Toast.LENGTH_SHORT).show();

        // Skapa en implicit intent, dvs skicka info som kan tas emot av en annan app
        // (this, annanActivity.class för att gå till annan activity)
        Intent intent = new Intent();
        // Vad vill vi göra? Skicka text
        intent.setAction(Intent.ACTION_SEND);
        // Vilken text ska vi skicka?
        intent.putExtra(intent.EXTRA_TEXT, "Owl, hoho!"); //Nyckel och meddelende
        // Vad är det för något vi skickar?
        intent.setType("text/plain");
        // Skicka
        startActivity(intent);

    }

    // Button "SHARE" Bear
    public void shareBearInformation (View view) {

        // Visa upp en "Toast" med att vi klickat på knappen
        Toast.makeText(ListOfAnimalsActivity.this, "Björnen sover, björnen sover!", Toast.LENGTH_SHORT).show();

        // Skapa en implicit intent, dvs skicka info som kan tas emot av en annan app
        // (this, annanActivity.class för att gå till annan activity)
        Intent intent = new Intent();
        // Vad vill vi göra? Skicka text
        intent.setAction(Intent.ACTION_SEND);
        // Vilken text ska vi skicka?
        intent.putExtra(intent.EXTRA_TEXT, "Tiger is very Tigery!"); //Nyckel och meddelende
        // Vad är det för något vi skickar?
        intent.setType("text/plain");

        startActivity(intent);

    }
}
