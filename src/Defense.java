public class Defense extends Players{
    int yards_allowed;


    public Defense(int rank, String position, String name, int yards_allowed) {
        super(rank, position, name);
        this.yards_allowed = yards_allowed;

    }

    @Override
    public String toString() {
        return "" +
                "DE:rank=" + rank +
                ", position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", yards allowed=" + yards_allowed
                ;
    }

}
