package H2018.oppgave3;

public abstract class Abonnement {
    
    //a
    private String navn;
    private int fødselsnummer;
    private int telefonnummer;
    private double minuttpris;
    
    //b
    public Abonnement(String navn, int fødselsnummer, int telefonnummer, double minuttpris){

        super();
        this.navn = navn;
        this.fødselsnummer = fødselsnummer;
        this.telefonnummer = telefonnummer;
        this.minuttpris = minuttpris;

    }

    //C
    public String getNavn(){

        return navn;

    }

    public void setNavn(String navn){

        this.navn = navn;

    }

    public int getFødselsnummer(){

        return fødselsnummer;

    }

    public void setFødselsnummer(int fødselsnummer){

        this.fødselsnummer = fødselsnummer;

    }

    public int getTelefonnummer(){

        return telefonnummer;

    }

    public void setTelefonnummer(int telefonnummer){

        this.telefonnummer = telefonnummer;

    }

    public double getMinuttpris(){

        return minuttpris;

    }

    public void setMinuttpris(double minuttpris){

        this.minuttpris = minuttpris;

    }

    public abstract double pris(int telefonnummer, int samtalelengde);
}


