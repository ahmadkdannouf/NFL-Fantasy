public class Quarterbacks extends Players{

    int passing_yards;



    public Quarterbacks(int rank, String position, String name, int passing_yards) {
        super(rank, position, name);
        this.passing_yards = passing_yards;

    }




    @Override
    public String toString() {
        return "" +
                "QB:rank=" + rank +
                ", position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", passing yards=" + passing_yards
                ;
    }



}
