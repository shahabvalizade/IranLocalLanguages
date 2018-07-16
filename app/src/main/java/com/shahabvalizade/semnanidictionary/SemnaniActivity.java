package com.shahabvalizade.semnanidictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SemnaniActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //moshakhas kardan ajzaye list
        ArrayList<String> learningSteps = new ArrayList<String>();
        learningSteps.add("قدم اول: مقدمه و اطلاعات اولیه درباره زبان سمنانی");
        learningSteps.add("قدم دوم: سلام و احوال پرسی کردن");
        learningSteps.add("قدم سوم: پرسیدن سوال (قسمت اول)");
        learningSteps.add("قدم چهارم: پرسیدن سوال (قسمت دوم)");
        learningSteps.add("قدم پنجم: پرسیدن آدرس (قسمت اول)");
        learningSteps.add("قدم پنجم: پرسیدن آدرس (قسمت دوم)");
        learningSteps.add("قدم پنجم: تشکر و تعارف");
        learningSteps.add("ادامه دارد ... (به زودی)");

        //etesal adapter
        LearningStepsAdapter learningStepsAdapter = new LearningStepsAdapter(this,learningSteps);
        ListView learningStepsList = (ListView) findViewById(R.id.list);
        learningStepsList.setAdapter(learningStepsAdapter);
        //مشخص کردن مقصد هر کدام از المانهای لیست
        learningStepsList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent intent = new Intent(SemnaniActivity.this,SemnaniActivityStep1.class);
                    startActivity(intent);
                }
            }
        });
    }
}
