package com.example.android.msapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView electro = (TextView) findViewById(R.id.electro_view);
        TextView rock = (TextView) findViewById(R.id.rock_view);
        TextView classical = (TextView) findViewById(R.id.classical_view);
        TextView ethnic = (TextView) findViewById(R.id.ethnic_view);

        electro.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the electro View is clicked on.
            @Override
            public void onClick(View view) {
                Intent electroIntent = new Intent(MainActivity.this, ElectroActivity.class);
                startActivity(electroIntent);
            }
        });
        rock.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the electro View is clicked on.
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(rockIntent);
            }
        });
        classical.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the electro View is clicked on.
            @Override
            public void onClick(View view) {
                Intent classicalIntent = new Intent(MainActivity.this, ClassicalActivity.class);
                startActivity(classicalIntent);
            }
        });
        ethnic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the electro View is clicked on.
            @Override
            public void onClick(View view) {
                Intent ethnicIntent = new Intent(MainActivity.this, EthnicActivity.class);
                startActivity(ethnicIntent);
            }
        });

    }
}