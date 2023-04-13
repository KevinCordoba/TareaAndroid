package com.example.foodrest_tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Hoteles;
    Button mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Hoteles=(Button)findViewById(R.id.button1);

        Hoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        mapa=(Button)findViewById(R.id.button2);

        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityMap();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Hoteles_Page.class);
        startActivity(intent);
    }

    public void openActivityMap() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}