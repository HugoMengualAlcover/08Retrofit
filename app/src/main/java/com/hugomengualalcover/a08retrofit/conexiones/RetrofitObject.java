package com.hugomengualalcover.a08retrofit.conexiones;

import com.google.gson.Gson;
import com.hugomengualalcover.a08retrofit.configuraciones.Constantes;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitObject {
    public static Retrofit getConnection(){
        return new Retrofit.Builder().baseUrl(Constantes.BASE_URL).
                addConverterFactory(GsonConverterFactory.create()).build();
    }
}
