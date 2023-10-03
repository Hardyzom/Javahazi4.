import java.util.ArrayList;
import java.util.List;

public class Tobbertek1 {
    public static void main(String[] args) {
        List<Integer> szamok = new ArrayList<Integer>(List.of(5, 6, 3, 9, 4, 2, 7, 99, 1));

        int min = szamok.get(0);
        int max = szamok.get(0);

        for (int szam : szamok) {
            if (szam < min) {
                min = szam;
            }
            if (szam > max) {
                max = szam;
            }
        }

        System.out.println("Legkisebb elem: " + min);
        System.out.println("Legnagyobb elem: " + max);
    }
}

//Hagyományos iteráció