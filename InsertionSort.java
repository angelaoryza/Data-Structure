import java.util.*;
public class InsertionSort
{
    public static void InsertionSort (int arr[])
    {
        for(int j=1; j<arr.length; j++)
        {
            int key = arr[j];
            int i =j-1;
        while((i>-1) && (arr[i]>key))
        {
            arr[i+1] = arr [i];
            i--;
        }
        arr[i+1] = key;
    }
}
    
    static void printArray (int arr[])
    { //digunakan untuk ngeprint elemen yang ada dalam array
        int len = arr.length;
        for(int i=0; i<len; i++)
        {
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }
        
    public static void main (String args[])
    {
         int[] arr1 = {21, 18, 15, 23, 52, 12, 61};
         //panggil fungsi untuk ngesort elemennya
         InsertionSort(arr1);
         //panggil fungsi untuk ngeprint elemen
         printArray(arr1);
    }
}
            


