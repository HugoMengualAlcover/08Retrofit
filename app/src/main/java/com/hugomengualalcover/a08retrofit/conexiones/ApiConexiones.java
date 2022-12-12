package com.hugomengualalcover.a08retrofit.conexiones;

import com.hugomengualalcover.a08retrofit.modelos.Album;
import com.hugomengualalcover.a08retrofit.modelos.Photo;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiConexiones {
    //Aqui especifico todos los endpoint s y retornos de la api

    @GET("/albums")
    Call<ArrayList<Album>> getAlbums();
    
    @GET("/albums/{idAlbum}")
    Call<Album> getAlbum(@Path("idAlbum") String idAlbum);

    //photos?albumId=2
    @GET("/photos?")
    Call<ArrayList<Photo>> getPhotosAlbum(@Query("albumId") String idAlbum);
}
