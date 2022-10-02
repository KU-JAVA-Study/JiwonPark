package chapter04;

class ArrayUtil {
    public static int[] concat(int[] a, int[] b) {
        int[] temp = new int[a.length + b.length];
        int i;
        for (i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }

        for (i = 0; i < a.length + b.length; i++) {
            temp[i] = b[i - a.length];
        }
        return temp;

    }

    public static void print(int[] a) {
        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}