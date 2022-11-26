import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pflanze sonnenblume = new Pflanze(Lebend.LEBEN, 500);
        Lebewesen mensch = new Lebewesen(Lebend.TOD, 1050);
        Lebewesen ei = new Lebewesen(Lebend.LEBEN, 1550);

        Tier huhn = new Tier(Lebend.LEBEN, 1500);
        Pflanze mais = new Pflanze(Lebend.LEBEN, 300);

        ArrayList<Lebewesen> zoo = new ArrayList<>();
        zoo.add(mais);
        zoo.add(huhn);

    }
}
