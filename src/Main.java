import java.util.*;

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


        Map<String, Integer> m = new HashMap<String, Integer>();
        m.put("Größe", 190);
        m.put("Alter", 21);

        System.out.println(m.get("Größe"));
        System.out.println(m.get("Alter"));

        var l = new HashMap<String, Pflanze>();
        l.put("MAis", new Pflanze(Lebend.LEBEN, 13));
        System.out.println(l.get("MAis"));


        var t = new HashMap<Tier, Pflanze>();
        t.put(new Tier(Lebend.AUFGEFRESSEN, 3), new Pflanze(Lebend.TOD, 200));
        System.out.println(t);


 Integer b = 50;
        System.out.println(zahl(5,8));
        System.out.println(tal(0));
    }




    public static void AllePflanzenFressen(Map<IPflanzenfresser, Pflanze> pMap){

        List<IPflanzenfresser> keys = new LinkedList<>(pMap.keySet());

    }

    public static ArrayList<Integer> zahl(int d, int b) {
        var c = new ArrayList<Integer>();

        for (int a = d; a < b; a++) {

            if (a % 2 == 0){

            }
            else{
            c.add(a);
            }
        }
        return c;
    }


    public static ArrayList<Integer> tal(int b) {

       var p = new ArrayList<Integer>(zahl(0,b));

        return p;
    }
}
