public class Kickers extends Players{
    int kicks_made;


    public Kickers(int rank, String position, String name, int kicks_made) {
        super(rank, position, name);
        this.kicks_made = kicks_made;

    }

    @Override
    public String toString() {
        return "" +
                "K:rank=" + rank +
                ", position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", Number of kicks made=" + kicks_made
                ;
    }

}