package level5;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("So phan tu: ");
        int n = sc.nextInt();

        String[] strings = new String[n];
        System.out.println("Strings Array: ");
        for( int i=0; i<n; i++){
            strings[i] = sc.next();
        }
        System.out.println("Số phần tử chỉ định: ");
        int m = sc.nextInt();

        String[][] chunks = chunk(strings, m);
        printChunks(chunks);


    }
    public static String[][] chunk(String[] array, int numChunks) {
        int arrayLength = array.length;
        int chunkSize = (int) Math.ceil((double) arrayLength / numChunks);

        String[][] result = new String[numChunks][];

        int start = 0;
        int end;

        for (int i = 0; i < numChunks; i++) {
            end = Math.min(start + chunkSize, arrayLength);
            int chunkLength = end - start;
            result[i] = new String[chunkLength];
            for (int j = start, k = 0; j < end; j++, k++) {
                result[i][k] = array[j];
            }
            start += chunkSize;
        }

        return result;
    }

    public static void printChunks(String[][] chunks) {
        for (String[] chunk : chunks) {
            for (String element : chunk) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
