public class Widereceivers extends Players{
    int receiving_yards;


    public Widereceivers(int rank, String position, String name, int receiving_yards) {
        super(rank, position, name);
        this.receiving_yards = receiving_yards;

    }

    @Override
    public String toString() {
        return "" +
                "WR:rank=" + rank +
                ", position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", receiving yards=" + receiving_yards
                ;
    }

}
