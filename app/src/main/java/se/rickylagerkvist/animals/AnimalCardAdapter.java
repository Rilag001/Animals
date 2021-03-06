package se.rickylagerkvist.animals;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import se.rickylagerkvist.animals.Data.Animal;


/**
 * Created by Ricky on 2016-02-15.
 */
public class AnimalCardAdapter extends RecyclerView.Adapter<AnimalCardAdapter.AnimalCardViewHolder> {

    // Var
    private ArrayList<Animal> animalList;


    // Constructor
    public AnimalCardAdapter(ArrayList<Animal> animalList){
        this.animalList = animalList;
    }

    // Methods
    @Override
    public int getItemCount() {
        return animalList.size();
    }

    // ViewHolder pattern
    @Override
    public void onBindViewHolder(AnimalCardViewHolder animalCardViewHolder, int i) {
        Animal animal = animalList.get(i);
        animalCardViewHolder.vHeadLine.setText(animal.name);
        animalCardViewHolder.vDescription.setText(animal.description);
        animalCardViewHolder.vPortrait.setImageResource(animal.imageId);
        animalCardViewHolder.vTAG.setTag(animal.exploreTAGButton);
    }

    // Where to inflate our data
    @Override
    public AnimalCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.animal_card, viewGroup, false);

        return new AnimalCardViewHolder(itemView);
    }

    // Implements ViewHolder pattern
    public static class AnimalCardViewHolder extends RecyclerView.ViewHolder {
        private TextView vHeadLine;
        private TextView vDescription;
        private ImageView vPortrait;
        private Button vTAG;

        public AnimalCardViewHolder(View v) {
            super(v);
            vHeadLine =  (TextView) v.findViewById(R.id.animal_card_headline);
            vDescription = (TextView)  v.findViewById(R.id.animal_card_description);
            vPortrait = (ImageView) v.findViewById(R.id.animal_card_portrait);
            vTAG = (Button) v.findViewById(R.id.explore_button);
        }
    }


}