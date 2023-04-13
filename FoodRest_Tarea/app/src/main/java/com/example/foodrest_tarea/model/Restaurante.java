package com.example.foodrest_tarea.model;

import java.util.ArrayList;

public class Restaurante {
    private String nombre;
    private String Horario;
    private ArrayList<String> Menu;
    private double latitude;
    private double longitude;

    public Restaurante(String pNombre, String pHorario, ArrayList<String> pMenu, double pLongitude, double pLatitude){
        this.Horario = pHorario;
        this.Menu = pMenu;
        this.nombre = pNombre;
        this.latitude = pLatitude;
        this.longitude = pLongitude;

    }
    public String getHorario() {
        return Horario;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getMenu() {
        return Menu;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public void setMenu(ArrayList<String> menu) {
        Menu = menu;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
