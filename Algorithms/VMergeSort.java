import java.util.Arrays;
import java.util.Scanner;

public class VMergeSort {
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

        VMergeSort ms = new VMergeSort();

        ms.quickSort(arr, 0, arr.length-1);

        System.out.println("Array is sorted. Array: " + Arrays.toString(arr));
    }

    public void quickSort(int[] arr, int start, int end){

        if(start < end){
            int mid = (start + end)/2;

            quickSort(arr, start, mid);
            quickSort(arr, mid+1, end);

            merge(arr, start, mid, end);
        }
    }

    public void merge(int[] arr, int start, int mid, int end){

        //create a copy of arrays to be merged
        int c1Size = mid - start + 1;
        int c2Size = end - mid;

        int[] c1 = new int[c1Size];
        int[] c2 = new int[c2Size];

        for(int i = 0; i < c1Size; i++){
            c1[i] = arr[start+i];
        }

        for(int j = 0; j < c2Size; ++j){
            c2[j] = arr[mid+1+j];
        }

        //merge the sorted arrays and copy it back to main array
        int i=0, j=0, k = start;
        while(i<c1Size && j<c2Size){
            if(c1[i]<=c2[j]){
                arr[k++] = c1[i++];
            }
            else{
                arr[k++] = c2[j++];
            }
        }

        while(i<c1Size){
            arr[k++] = c1[i++];
        }

        while(j<c2Size){
            arr[k++] = c2[j++];
        }
    }
}
