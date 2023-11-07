import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(biggestPair(new int[]{3,2,-2,5,-3})));
        System.out.println(Arrays.toString(biggestPair(new int[]{1,1,2,-1,2,-1})));
        System.out.println(Arrays.toString(biggestPair(new int[]{1,2,3,-4})));
        System.out.println(Arrays.toString(biggestPair(new int[]{1,1})));
    }
    public static int[] biggestPair(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j] == (-1) * arr[i]){
                        max = arr[i];
                        break;
                    }
                }
            }
        }
        if(max == 0) return new int[]{-1};
        return new int[]{max,(-1) * (max)};
    }
}