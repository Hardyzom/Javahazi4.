import java.math.BigInteger;

public class Felho {
    public static void main(String[] args) {
        // Számítás a 2^1024 értékére
        BigInteger number = new BigInteger("2").pow(1024);
        
        // Konvertáljuk a számot stringgé
        String numberStr = number.toString();
        
        // Szomszédos felhőkarcolók magasságkülönbségének összegzése
        int sumOfDifferences = 0;
        for (int i = 0; i < numberStr.length() - 1; i++) {
            int currentDigit = Character.getNumericValue(numberStr.charAt(i));
            int nextDigit = Character.getNumericValue(numberStr.charAt(i + 1));
            int difference = Math.abs(currentDigit - nextDigit);
            sumOfDifferences += difference;
        }
        
        System.out.println("Szomszédos felhőkarcolók magasságkülönbségének összege: " + sumOfDifferences);
    }
}
