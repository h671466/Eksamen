package H2021.oppgave3;

public class Fysisk extends Kurs{
    private String romkode;
    private int maksplasser;
    private Campus campus;

    public enum Campus {
        
        BERGEN, FORDE, HAUGESUND, SOGNDAL, STORD
        
    }

    public Fysisk(String kurskode, String romkode, int maksplasser, Campus campus){

        super(kurskode);
        this.romkode = romkode;
        this.maksplasser = maksplasser;
        this.campus = campus;

    }

    public boolean ledigPlass(){

        return super.getAntallDeltakere() < maksplasser;
        
    }

}
