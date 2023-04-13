package com.example.foodrest_tarea;

import com.example.foodrest_tarea.controller.controller;
import com.example.foodrest_tarea.model.Restaurante;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button Hoteles;
    Button mapa;

    controller Controlador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Restaurante 1
        String[] Menu1= {"arroz","frijoles","pollo frito","ensalada"};
        ArrayList<String> Array1 = new ArrayList<>(Arrays.asList(Menu1));
        Restaurante Restaurante1 = new Restaurante("Comedor TEC","Lunes a Viernes de 7am a 8pm",Array1,-83.912867,9.8553526);

        // Restaurante 2
        String[] Menu2 = {"sandwich de pollo", "sandwich de carne", "hamburguesa"};
        ArrayList<String> Array2 = new ArrayList<>(Arrays.asList(Menu2));

        Restaurante Restaurante2 = new Restaurante("Soda Deportiva","Lunes a Viernes de 7am a 4pm",Array2,-83.9108464,9.8573249);

        // Restaurante 3
        String[] Menu3 = {"arroz", "queso", "fideos","café"};
        ArrayList<String> Array3 = new ArrayList<>(Arrays.asList(Menu3));
        Restaurante Restaurante3 = new Restaurante("Forestal","Lunes a Viernes de 7am a 4pm",Array3,-83.9103832,9.8495901);

        // Restaurante 4
        String[] Menu4 = {"pizza de jamón", "pizza de pepperoni", "pizza italiana","pizza suprema"};
        ArrayList<String> Array4 = new ArrayList<>(Arrays.asList(Menu4));
        Restaurante Restaurante4 = new Restaurante("Soda del Este","Lunes a Viernes de 7am a 5pm",Array4,-83.907131,9.853815);

        Restaurante[] Restaurantes = {Restaurante1,Restaurante2,Restaurante3,Restaurante4};
        this.Controlador = new controller(Restaurantes);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Hoteles= (Button)findViewById(R.id.button1);

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

        SearchView searchView = (SearchView) findViewById(R.id.searchView);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Manejar evento de búsqueda cuando se presiona el botón de búsqueda
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                ArrayList<Restaurante> resultados = Controlador.BuscarPorComida(newText);
                for(Restaurante res: resultados){
                    System.out.println(res.getNombre());
                }
                return true;
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