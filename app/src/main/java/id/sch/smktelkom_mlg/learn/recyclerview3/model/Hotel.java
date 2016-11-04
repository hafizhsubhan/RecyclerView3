package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import java.io.Serializable;

/**
 * Created by Hafizh Subhan Mahdiy on 01/11/2016.
 */

public class Hotel implements Serializable {
    public String judul;
    public String desikripsi;
    public String detail;
    public String lokasi;
    public String foto;

    public Hotel(String judul, String deskripsi, String detail, String lokasi,
                 String foto) {
        this.judul = judul;
        this.desikripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
    }
}
