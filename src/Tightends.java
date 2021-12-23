public class Tightends extends Players{
    int receiving_yards;


    public Tightends(int rank, String position, String name, int receiving_yards) {
        super(rank, position, name);
        this.receiving_yards = receiving_yards;

    }

    @Override
    public String toString() {
        return "" +
                "TE:rank=" + rank +
                ", position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", receiving yards=" + receiving_yards
                ;
    }

}