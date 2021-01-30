public class ArrayRotation {

    static int[] rotLeft(int[] a, int d) {

        final int[] newArray = new int[a.length];

        for (int i = 0;i<a.length;i++) {
            int newIndex = i-d;
            if (newIndex < 0) {
                newArray[a.length + newIndex] = a[i];
            } else {
                newArray[newIndex] = a[i];
            }

        }

        return newArray;
    }

    public static void main(String[] args) {

        int[] x = rotLeft(new int[]{1, 2, 3, 4, 5}, 2);
        System.out.println(x);
    }

}
