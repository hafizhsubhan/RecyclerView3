package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Hafizh Subhan Mahdiy on 01/11/2016.
 */

public class Hotel {
    public String judul;
    public String desikripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.desikripsi = deskripsi;
        this.foto = foto;
    }
}
