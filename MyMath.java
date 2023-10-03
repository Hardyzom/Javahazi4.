public class MyMath {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        System.out.println("Nagyobb: " + max(a, b));
    }
}
