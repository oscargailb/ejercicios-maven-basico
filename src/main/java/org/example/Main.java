package org.example;

import com.google.gson.Gson;


public class Main {

    public static Persona convertirJsonAPersona(String json) {

        Gson gson = new Gson();

        return gson.fromJson(json, Persona.class);
    }

    public static void main(String[] args) {

        String json = "{\"nombre\":\"Oscar\",\"edad\":22}";

        Persona persona = convertirJsonAPersona(json);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}