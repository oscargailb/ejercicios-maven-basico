package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static Persona convertirJsonAPersona(String json) {

        Gson gson = new Gson();

        return gson.fromJson(json, Persona.class);
    }

    public static List<Persona> convertirJsonAPersonas(String json) {
        Gson gson = new Gson();

        JsonArray jsonArray = gson.fromJson(json, JsonArray.class);

        List<Persona> personas = new ArrayList<>();

        for (JsonElement elemento : jsonArray) {
            Persona persona = gson.fromJson(elemento, Persona.class);
            personas.add(persona);
        }

        return personas;
    }

    public static void main(String[] args) {

        String json = "[{\"nombre\":\"Oscar\",\"edad\":22}, {\"nombre\":\"Ana\",\"edad\":30}, {\"nombre\":\"Luis\",\"edad\":25}]";

        List<Persona> personas = convertirJsonAPersonas(json);

        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("---------------");
        }
    }
}