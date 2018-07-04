package com.shahabvalizade.semnanidictionary;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import static com.shahabvalizade.semnanidictionary.R.id.learningText;


public class LearningStepsAdapter extends ArrayAdapter {
    public LearningStepsAdapter (Context context, ArrayList<String> learningList){
        //farakhani constructor superclass
        super(context,0,learningList);
    }

    @NonNull
    @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View learningSteps = convertView;
        //ejad object jadid agar view ghabele tajdid nist
            if(learningSteps == null)
                learningSteps = LayoutInflater.from(this.getContext()).inflate(R.layout.activity_learning_steps, parent, false);

            String currentView = getItem(position).toString();
        //eslah matn textview ba meghdar sahih
            TextView learningSteptext = (TextView) learningSteps.findViewById(R.id.learningSteps);
            learningSteptext.setText(currentView);

        return learningSteps;
    }
}
