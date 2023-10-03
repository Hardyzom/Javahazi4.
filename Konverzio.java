public class Konverzio {
    public static void main(String[] args) {
        // Sztring átalakítása long típussá
        String szamSztring = "123";
        long longSzam = Long.parseLong(szamSztring);
        System.out.println("Sztring atalakitva long-a: " + longSzam);

        // Sztring átalakítása float típussá
        String floatSztring = "3.14";
        float floatSzam = Float.parseFloat(floatSztring);
        System.out.println("Sztring atalakitva float-ta: " + floatSzam);

        // Sztring átalakítása double típussá
        String doubleSztring = "7.89";
        double doubleSzam = Double.parseDouble(doubleSztring);
        System.out.println("Sztring atalakitva double-a: " + doubleSzam);

        // Sztring első karakterének átalakítása char típussá
        String karakterSztring = "a";
        char karakter = karakterSztring.charAt(0);
        System.out.println("Sztring elso karaktere atalakitva char-ra: " + karakter);
    }
}
