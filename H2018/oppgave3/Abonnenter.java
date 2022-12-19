package H2018.oppgave3;

import java.util.HashMap;

public class Abonnenter {
    
    private HashMap <Integer, Abonnement> abonnenter;

    public Abonnenter(){

        abonnenter = new HashMap <Integer, Abonnement>();

    }

    public double finnPris(int tlfnr1, int tlfnr2, int lengde){

        Abonnement abb1 = abonnenter.get(tlfnr1);
        Abonnement abb2 = abonnenter.get(tlfnr2);

        if(abb1 != null && abb2 != null){
            
           return abb1.pris(tlfnr2, lengde); 

        }else{

            return 0.0;

        }
    }
}
