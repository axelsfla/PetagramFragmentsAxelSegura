package com.coursera.sacbe.petagramaxelsegura.pojo;

/**
 * Created by Sacbe on 10/09/2016.
 */
public class FotoMascota {

    private int foto;
    private int raiting;

    public FotoMascota(int foto, int raiting) {
        this.foto = foto;
        this.raiting = raiting;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

}
