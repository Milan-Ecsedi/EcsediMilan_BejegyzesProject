package hu.ecsedi.javadolgozat_14s;

import java.time.LocalDateTime;

public class Bejegyzes {

    private String szerzo;
    private String tartalom;
    private int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;


    public Bejegyzes(String szerzo, String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
    }

    public int getLikeok() {

        //this.likeok=0;

        return likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    public void like(){




    }



}
