package com.example.adampodraza.myapplication.backend;

/**
 * The object model for the data we are sending through endpoints
 */
public class JokeObj {

    private static final String joke = "THIS IS A JOKE HAHAHAHAHA";

    public static String getJoke() {
        return joke;
    }


}