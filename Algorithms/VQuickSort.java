import java.util.Arrays;
import java.util.Scanner;

public class VQuickSort{
    public static void main(String[] args){
        Scanner userIp = new Scanner(System.in);

        System.out.println("Enter Size of Array");

        int size = userIp.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Array Elements one at a time");

        for(int i=0; i<size; ++i){
            arr[i] = userIp.nextInt();
        }

        System.out.println("Array is full. Array: " + Arrays.toString(arr));

        VQuickSort qs = new VQuickSort();

        qs.sort(arr, 0, arr.length-1);

        System.out.println("Array is sorted. Array: " + Arrays.toString(arr));
    }

    public void sort(int[] arr, int start, int end){
        if(start < end){
            int pivot = partition(arr, start, end);

            sort(arr, start, pivot-1);
            sort(arr, pivot, end);
        }
    }

    public void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public int partition(int[] arr, int start, int end){
        
        int pivot = arr[end];

        int indexToSwap = start - 1;

        for(int i = start; i < end; ++i){
            if(arr[i] <= pivot){
                indexToSwap++;
                swap(arr, indexToSwap, i);
            }
        }

        ++indexToSwap;
        swap(arr, indexToSwap, end);

        return indexToSwap;
    }
}