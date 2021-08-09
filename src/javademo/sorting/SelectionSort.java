package javademo.sorting;

public class SelectionSort {

    void sort(int array[]){
        int n =array.length;
        for (int i =0 ; i <n-1 ;i++){
            //find the minimum element in unsorted array
            int minIndex=i;
            for(int j=i+1;j<n ;j++){
                if(array[j] <array[minIndex]){
                    minIndex=j;
                }
            }
            //swap the minimum elements with the first element
            int temp=array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }
    }
    //prints the array
    void printArray(int array[]){
        int n =array.length;
        for(int i =0 ; i < n ;++i){
            System.out.print(array[i]+" " );
            System.out.println();
        }
    }
    public static void main(String[] args){
        SelectionSort selectionSort= new SelectionSort();
        int array[]={12,17,84,58,96,78,96};
        selectionSort.sort(array);
        System.out.println("Sorted Array");
        selectionSort.printArray(array);
    }



}
