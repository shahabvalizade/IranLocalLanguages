package com.shahabvalizade.semnanidictionary;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Shahab on 6/27/2018.
 */

public class LearningAdapter extends ArrayAdapter<LearningItem> {
    LearningAdapter(Context context, ArrayList<LearningItem> learningList){
        super(context,0,learningList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View learningItem = convertView;
        if(learningItem == null)
        learningItem = LayoutInflater.from(this.getContext()).inflate(R.layout.activity_learning_item, parent, false);

        LearningItem currentView = getItem(position);

        TextView learningText = (TextView) learningItem.findViewById(R.id.learningText);
        learningText.setText(currentView.getLearningTitle());

        ImageView learningImage = (ImageView) learningItem.findViewById(R.id.learningImage);
        learningImage.setImageResource(currentView.getImageSrc());

        return learningItem;
    }
}
