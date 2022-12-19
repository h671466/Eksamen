package H2018.oppgave2;

public class HeltallMengde {
    private boolean[] mengde;

    //a
    public HeltallMengde (int n){

        mengde = new boolean[n];

    }

    //b
    public String toString(){
        String str = "{";

        for(int i = 0; i < mengde.length; i++){

            if(i != mengde.length - 1){

                str += mengde[i] + ", ";

            }else{

                str += mengde[i] + "}";

            }

        }

        return str;

    }

    //c
    public Boolean erMed(int t){

        return mengde[t];

    }

    //d
    public void leggtil(int t){

        mengde[t] = true;

    }

    //e
    public Boolean erDelmengde(int[] itab){

        for(int t : itab){
            
            if(!erMed(t)){
                
                return false;
            
            }
        }

        return true;

    }

    //f
    /*public void komplement(){


    }*/

    public boolean sjekkerMed(int t){

        if(t >= 0 && t < mengde.length){

            return mengde[t];

        }else{

            throw new RuntimeException("utenfor index");
        }
    }
    
    }
    