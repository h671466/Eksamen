package H2021.oppgave4;

public class Utleiefirma {
    
    private String navn;
    private Hytte[] hytter;
    private int antall;
    private static final int START_ANTALL = 5;

    public Utleiefirma(String navn){

        this.navn = navn;
        hytter = new Hytte[START_ANTALL];
        antall = 0;

    }

    public void leggTil(Hytte hytte){

        
    }
}
