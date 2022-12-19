package H2018.oppgave3;

public class MaanedAbn extends Abonnement {
    private Abonnement [] gratis;
    
    public MaanedAbn (String navn, int fødselsnummer, int telefonnummer, double minuttpris){

        super(navn, fødselsnummer, telefonnummer, minuttpris);
        gratis = new Abonnement [4];

    }

    @Override
    public double pris(int telefonnummer, int samtalelengde){

        boolean funnet = false;
        int i = 0;

        while((i < gratis.length) && (!funnet)){

            if (gratis[i] != null && (gratis[i].getTelefonnummer() == telefonnummer)){

                funnet = true;

            }
            i++;
        }

        if(funnet){
            
            return 0;

        }else{

            return(super.getMinuttpris()*samtalelengde);
            
        }

    }

}
