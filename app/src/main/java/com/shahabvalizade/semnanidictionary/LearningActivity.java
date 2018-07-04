package com.shahabvalizade.semnanidictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class LearningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<LearningItem> learningItemArrayList = new ArrayList<LearningItem>();
        learningItemArrayList.add(new LearningItem("زبان سمنانی",R.drawable.semnan));
        learningItemArrayList.add(new LearningItem("زبان ترکی (به زودی)",R.drawable.comingsoon));
        learningItemArrayList.add(new LearningItem("زبان مازنی (به زودی)",R.drawable.comingsoon));
        learningItemArrayList.add(new LearningItem("زبان کردی (به زودی)",R.drawable.comingsoon));
        learningItemArrayList.add(new LearningItem("زبان لری (به زودی)",R.drawable.comingsoon));
        learningItemArrayList.add(new LearningItem("زبان بلوچی (به زودی)",R.drawable.comingsoon));
        learningItemArrayList.add(new LearningItem("زبان پشتو (به زودی)",R.drawable.comingsoon));
        learningItemArrayList.add(new LearningItem("زبان لکی (به زودی)",R.drawable.comingsoon));
        learningItemArrayList.add(new LearningItem("زبان زازاکی (به زودی)",R.drawable.comingsoon));
        learningItemArrayList.add(new LearningItem("زبان تالشی (به زودی)",R.drawable.comingsoon));
        learningItemArrayList.add(new LearningItem("زبان آسی (به زودی)",R.drawable.comingsoon));

        LearningAdapter learningAdapter = new LearningAdapter(this,learningItemArrayList);
        ListView learningList = (ListView) findViewById(R.id.list);
        learningList.setAdapter(learningAdapter);
        learningList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            if (position==0){

                Intent intent = new Intent (LearningActivity.this,SemnaniActivity.class);
                startActivity(intent);
            }
            }
        });
    }
}
