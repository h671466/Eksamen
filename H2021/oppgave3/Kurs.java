package H2021.oppgave3;

import java.util.ArrayList;

import H2021.oppgave3.Fysisk.Campus;

public abstract class Kurs {
    
    private String kurskode;
    private ArrayList<Integer> deltakere;

    public Kurs(String Kode){

        kurskode = Kode;
        deltakere = new ArrayList<Integer>();

    }

    public String getKurskode(){

        return kurskode;

    }

    public void setKurskode(String Kode){

        kurskode = Kode;

    }

    @Override
    public String toString(){

        return kurskode + " " + deltakere.toString();

    }

    public abstract boolean ledigPlass();

    //bare for å ikkje få error
    public int getAntallDeltakere() {

        return 0;

    }
    
    public static void main(String[] args) {
    
        int snr = 800000;

        Kurs Nett = new Nett("dat100", "https://hvl.zoom.us/j/66732221140");
        Kurs Fysisk = new Fysisk("MAT100", "B117", 190, Campus.BERGEN);

        if(Fysisk.ledigPlass()){

            Fysisk.leggTilStudent(snr);

        }else{

            Nett.leggTilStudent(snr);

        }

    }
}
