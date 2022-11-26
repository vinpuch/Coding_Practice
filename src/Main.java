import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pflanze sonnenblume = new Pflanze(Lebend.LEBEN, 500);
        Lebewesen mensch = new Lebewesen(Lebend.TOD, 1050);
        Lebewesen ei = new Lebewesen(Lebend.LEBEN, 1550);

        Pflanze mais = new Pflanze(Lebend.LEBEN, 300);


        Huhn huhn1 = new Huhn(Lebend.LEBEN, 1550);
        System.out.println(huhn1);

        huhn1.fressen(mais);
        ArrayList<Lebewesen> zoo = new ArrayList<>();
        zoo.add(mais);
        zoo.add(huhn1);

        System.out.println(huhn1);



    }
}
