package com.example.foodrest_tarea.controller;
import com.example.foodrest_tarea.model.Restaurante;

import java.util.ArrayList;
import java.util.Locale;

public class controller {

    private Restaurante[] Restaurantes;

    public controller(Restaurante[] pRestaurantes){
        this.Restaurantes = pRestaurantes;
    }

    public ArrayList<Restaurante> BuscarPorComida(String comida){

        ArrayList<Restaurante> RestTiene = new ArrayList<Restaurante>();
        for(Restaurante res : Restaurantes){
            if(res.getMenu().indexOf((comida.toLowerCase())) != -1){
                RestTiene.add(res);
            }
        }
        return  RestTiene;
    }
}
