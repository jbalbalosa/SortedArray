import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sorted Array!");

        int[] listArray;
        listArray = getIntegers(7);;
        listArray = sortIntegers(listArray); // sort the array descending
        printArray(listArray); // print the array
    }

    public static int[] getIntegers(int len){
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Enter an Integer: ");
            array[i] = scanner.nextInt(); //Integer.parseInt(scanner.nextLine());
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int temp = 0;
        boolean flag = true;

        while(flag){
            flag = false;
            for (int i = 0; i < array.length -1; i++) {
                if (array[i] < array[i + 1]){
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }
}