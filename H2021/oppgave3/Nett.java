package H2021.oppgave3;

public class Nett extends Kurs {
    private String zoomlenke;

    public Nett(String Kode, String zoomlenke){

        super(Kode);
        this.zoomlenke = zoomlenke;

    }

    @Override
    public String toString(){

        return super.toString() + "\nLenke;" + zoomlenke;

    }
    
    @Override
    public boolean ledigPlass(){

        return true;

    }
}
