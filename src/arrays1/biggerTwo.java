package arrays1;

public class biggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        int sumA=0;
        int sumB=0;

        for (int i = 0; i < a.length; i++) {
        sumA += a[i];
        }
        for (int i = 0; i <b.length ; i++) {
            sumB += b[i];
        }
        if (sumA >=sumB){
            return a;
        } else
            return b;
    }
}
