public class Players {
    int rank;
    String position;
    String name;

    public Players(int rank, String position, String name) {
        this.rank = rank;
        this.position = position;
        this.name = name;
    }

    public void stats(int yards){
        System.out.println("Yards 2021: " + yards);

    }

    public int getRank() {
        return rank;
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
