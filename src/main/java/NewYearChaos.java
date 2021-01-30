public class NewYearChaos {


    static void minimumBribes(int[] q) {

        int bribes = 0;
        for (int i = 0;i< q.length;i++) {
            int expectedIndex = i+1;
            int actualIndex = q[i];
            if (actualIndex > expectedIndex) {
                int difference = (actualIndex - expectedIndex);
                if (difference > 2) {
                    System.out.println("Too chaotic");
                    return;
                }
                bribes =  bribes + difference;
            }

        }
        System.out.println(bribes);

    }

    public static void main(String[] args) {
        
        minimumBribes(new int[]{1,2,5,3,7,8,6,4});
    }
}
