public class Wrapper {
    public static void main(String[] args) {
        // Character osztály statikus metódusok
        System.out.println("Character osztaly statikus metodusok:");

        char c1 = '5';
        System.out.println("isDigit(): Is '" + c1 + "' egy szamjegy? " + Character.isDigit(c1));

        char c2 = 'A';
        System.out.println("isLetter(): Is '" + c2 + "' egy betu? " + Character.isLetter(c2));

        System.out.println("--------------------------------------------------");

        // Integer osztály statikus metódusok
        System.out.println("Integer osztaly statikus metodusok:");

        String str1 = "42";
        int parsedInt = Integer.parseInt(str1);
        System.out.println("parseInt(): A szoveg '" + str1 + "' int-e alakitva: " + parsedInt);

        int num = 19;
        String binaryStr = Integer.toBinaryString(num);
        System.out.println("toBinaryString(): A szam " + num + " binaris alakja: " + binaryStr);

        System.out.println("--------------------------------------------------");

        // Double osztály statikus metódusok
        System.out.println("Double osztaly statikus metodusok:");

        double d1 = Double.NaN;
        System.out.println("isNaN(): Is '" + d1 + "' NaN (nem szam)? " + Double.isNaN(d1));

        double x = 5.5;
        double y = 7.7;
        int compareResult = Double.compare(x, y);
        System.out.println("compare(): Osszehasonlitas " + x + " es " + y + " kozott: " + compareResult);

        System.out.println("--------------------------------------------------");

        // Boolean osztály statikus metódusok
        System.out.println("Boolean osztaly statikus metodusok:");

        String boolStr = "true";
        boolean boolValue = Boolean.valueOf(boolStr);
        System.out.println("valueOf(): A szoveg '" + boolStr + "' bool erteke: " + boolValue);
       
        boolean b1 = true;
        boolean b2 = false;
        boolean result = Boolean.logicalOr(b1, b2);
        System.out.println("logicalOr(): Logikai 'vagy' muvelet: " + b1 + " vagy " + b2 + " eredmenye: " + result);
    }
}
