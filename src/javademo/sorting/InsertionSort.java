package javademo.sorting;

import java.util.Arrays;

public class InsertionSort {
    void sort(int array[]){
        int n =array.length;
        for (int i=1 ; i< n-1;i++){
            int key=array[i];
            int j=i-1;
            //move elements of arr[0..i-1] , that are greater than key
            //to one position ahead of their current position
            while (j>=0 && array[j]>key){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=key;
        }
    }

    public void  printArray(int[] array){
        Arrays.stream(array).forEach(e-> System.out.print(e+" "));
    }
    public static void main (String[] args){
        int array[]={65,98,75,4,5,42,45,1,2};
        InsertionSort insertionSort= new InsertionSort();
        insertionSort.printArray(array);
        insertionSort.sort(array);
        System.out.println("After Sorting");
        insertionSort.printArray(array);
    }

}
