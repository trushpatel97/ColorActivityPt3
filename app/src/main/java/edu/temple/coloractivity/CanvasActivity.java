package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        String CurrentLang = Locale.getDefault().getLanguage();
        TextView text = findViewById(R.id.newColor);

        final View newBackground;
        newBackground = this.getWindow().getDecorView();
        System.out.println(Locale.getDefault().getLanguage());


        Intent i = getIntent();
         int pos = i.getIntExtra("position",0);


                
        }
        private void displayColorName(View newBackground,int pos,TextView text){
            String retrieve[] = getResources().getStringArray(R.array.myStrings);
            String color = retrieve[pos];
            text.setText(color);
        }



}
