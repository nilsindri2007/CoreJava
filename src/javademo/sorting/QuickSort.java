package javademo.sorting;

import java.util.Arrays;

public class QuickSort {

    public int partition(int arr[] , int low , int high){
        //8,12,52,65,3,6,9
        int pivot=arr[high]; //pivot=9
        int i=(low-1); //index of smaller element => i=0
        for(int j=low; j<high;j++){
            //if current element is smaller than or equal to pivot
            if(arr[j]<=pivot){  //8 <=9
                i++;  //i=1
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        //swap arr[i+1] ad arr[high ] or pivot
        int temp=arr[i+1];
        arr[i]=arr[high];
        arr[high]=temp;
        return i+1;

    }


    public void sort(int arr[] , int low , int high){
        if(low < high){
            int p=partition(arr , low , high );
            sort(arr, low , p-1);
            sort(arr, p+1, high);
        }
        
    }


    public void  printArray(int[] array){
        Arrays.stream(array)
                .forEach( e-> System.out.print(e+" "));
    }

    public static void main (String[] args){
        QuickSort quickSort= new QuickSort();
        int [] array= {87,98,7,8,51,3,5,45};
        System.out.println("Unsorted array");
        quickSort.printArray(array);
        quickSort.sort(array , 0,array.length-1);
        quickSort.printArray(array);


    }

}
