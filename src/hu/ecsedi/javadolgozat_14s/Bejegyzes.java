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
        this.likeok=0;
        this.letrejott=LocalDateTime.now();
        this.szerkesztve=LocalDateTime.now();
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



        return likeok;
    }

    public LocalDateTime getLetrejott() {



        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {





        return szerkesztve;
    }

    public void like(){


        this.likeok++ ;

    }

    @Override
    public String toString() {




        return this.szerzo+"-"+this.likeok+"-"+this.letrejott+"\n szerkesztve:"+this.szerkesztve+"\n"+this.tartalom;
    }

}
