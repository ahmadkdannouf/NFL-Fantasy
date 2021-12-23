public class Runningbacks extends Players{
    int rushing_yards;


    public Runningbacks(int rank, String position, String name, int rushing_yards) {
        super(rank, position, name);
        this.rushing_yards = rushing_yards;

    }

    @Override
    public String toString() {
        return "" +
                "RB:rank=" + rank +
                ", position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", rushing yards=" + rushing_yards
                ;
    }

}
