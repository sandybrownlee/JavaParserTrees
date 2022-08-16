public class Maths {
    public static int sum(int[] values) {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total = total + values[i];
        }

        return total;
    }

    public static int add(int a, int b) {
        int c = a + b;

        return c;
    }

    public static boolean aIsBigger(int a, int b) {
        if (a > b) {
            return true;
        } else {
            return false;
        }
    }
}
