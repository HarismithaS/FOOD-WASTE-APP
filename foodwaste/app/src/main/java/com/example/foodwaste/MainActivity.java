package com.example.foodwaste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
RelativeLayout searchfood,donatefood,updatefood,mycart,createcity,createplace,myprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchfood=findViewById(R.id.searchfood);
        donatefood=findViewById(R.id.donatefood);
        updatefood=findViewById(R.id.updatefood);
        createcity=findViewById(R.id.createcity);
        createplace=findViewById(R.id.createplace);
        myprofile=findViewById(R.id.myprofile);
        searchfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this,searchfood.class);
                startActivity(Intent);

            }
        });
        donatefood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this,donatefood.class);
                startActivity(Intent);


            }
        });
        updatefood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this,updatefood.class);
                startActivity(Intent);


            }
        });
        mycart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this,mycart.class);
                startActivity(Intent);


            }
        });
        createcity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this,createcity.class);
                startActivity(Intent);


            }
        });
        createplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this,createplace.class);
                startActivity(Intent);


            }
        });
        myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this,myprofile.class);
                startActivity(Intent);


            }
        });
    }
}