import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tobbertek2 {
    public static void main(String[] args) {
        List<Integer> szamok = new ArrayList<Integer>(List.of(5, 6, 3, 9, 4, 2, 7, 99, 1));

        // Lista rendezése
        Collections.sort(szamok);

        int min = szamok.get(0);
        int max = szamok.get(szamok.size() - 1);

        System.out.println("Legkisebb elem: " + min);
        System.out.println("Legnagyobb elem: " + max);
    }
}


// lista rendezése