package level2;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class SecondLargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("so phan tu: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("array number: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Second largest number: " + findSecondLargestNumber(a));

    }

    public static int findSecondLargestNumber(int[] numbers){
        if(numbers.length<2){
            throw new IllegalArgumentException("Array must contain least 2 elements");
        }

        if(allElementsEqual(numbers)){
            throw new IllegalArgumentException("all elements equal");
        }

        int maxNumber = Integer.MIN_VALUE;
        int secondMaxNumber = Integer.MIN_VALUE;

        for (int num : numbers) {
            if(num > maxNumber){
                secondMaxNumber = maxNumber;
                maxNumber = num;
            } else if (num > secondMaxNumber && num != maxNumber){
                secondMaxNumber = num;
            }
        }
        return secondMaxNumber;
    }

    private static boolean allElementsEqual(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[0]) {
                return false;
            }
        }
        return true;
    }
}
