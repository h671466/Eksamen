package H2018.oppgave3;

public class KontantAbn extends Abonnement{
    private double balanse;

    //e
    public KontantAbn (String navn, int fødselsnummer, int telefonnummer, double minuttpris, double balanse){

        super(navn, fødselsnummer, telefonnummer, minuttpris);
        this.balanse = balanse;

    }

    //f
    @Override
    public double pris(int telefonnummer, int samtalelengde){

        return super.getMinuttpris() * samtalelengde;
    }

}