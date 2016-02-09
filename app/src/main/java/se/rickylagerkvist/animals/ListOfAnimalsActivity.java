package se.rickylagerkvist.animals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ListOfAnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_animal);

        // Lägg till view med java
        TextView dummyTextView = new TextView(this);
        dummyTextView.setText("Hello");

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.outerLayout);
        linearLayout.addView(dummyTextView);
    }

        // Instansmetoder

    // Vad som händer när man klickar på button "SHARE"
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

    // Klicka på knappen "explore"
    public void exploreAnimal(View view){

        // Vilken knapp klickade vi på?
        String tag = view.getTag().toString();

        Intent intent = new Intent(this, DetailedInformationActivity.class);
        intent.putExtra("animal", tag); // key & value
        startActivity(intent);
    }



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
