import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

    int[] newArr= new int[]{2, 1, 4, 3, 6, 5, 7, 10, 9};
    missingNumber(newArr, 10);
    }

    public static int missingNumber(int[] intArray, int maxNum) {
        //summation of first natural numbers
        int total = maxNum * (maxNum + 1) / 2;
        int sumArr = 0;
        for (int i = 0; i < maxNum-1; i++) {
            sumArr += intArray[i];
        }
        int missing = total - sumArr;

        System.out.println(missing);
        return missing;
    }
}
