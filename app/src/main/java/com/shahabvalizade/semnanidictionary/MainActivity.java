package com.shahabvalizade.semnanidictionary;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //moshakhas kardan masir har TextView be komak intent
        TextView learningTextView = (TextView) findViewById(R.id.learning);
        learningTextView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,LearningActivity.class);
                startActivity(intent);
            }
        } );

        TextView languageTextView = (TextView) findViewById(R.id.language);
        languageTextView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LanguageActivity.class);
                startActivity(intent);
            }
        } );

        TextView dictionaryTextView = (TextView) findViewById(R.id.dictionary);
        dictionaryTextView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DictionaryActivity.class);
                startActivity(intent);
            }
        } );

        TextView aboutTextView = (TextView) findViewById(R.id.about);
        aboutTextView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        } );
    }
}
