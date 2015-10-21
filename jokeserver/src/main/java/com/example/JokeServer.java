package com.example;

import com.example.adampodraza.myapplication.backend.myApi.MyApi;

public class JokeServer {
    private static MyApi myApiService = null;

    private static final String joke = "THIS IS A JOKE HAHAHAHAHA";

    public static String getJoke() {
        return joke;
    }

}
