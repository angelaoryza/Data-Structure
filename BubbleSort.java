import java.util.Scanner;
public class BubbleSort
{
    static void bubbleSort(int[] arraytest)
    {
        int n = arraytest.length; //nilai dari ukuran array diassign ke integer n
        int temp = 0; //variable sementara
        for(int i =0; i<n; i++)//loop pertama untuk melakukan beberapa iterasi
        {
            for(int j=1; j<n; j++)
            {
                if(arraytest[j-1] > arraytest[j]) //klau yang sebelah kiri lebih besar
                {
                    //tukar tempat dengan yang sebelah kanan
                    temp = arraytest[j-1]; //masukan bilangan yang lebih besar ke variable temp
                    arraytest[j-1] = arraytest[j]; //yang lebih kecil digeser ke kiri
                    arraytest[j] = temp; //yang lebih besar geser ke kanan
                }
            }
        }
    }  

    public static void main (String[] args)
    {
        int arraytest[] = {23, 16, 3, 42, 75, 536, 61}; //isi value ke dalam array
        System.out.println("Array Before Doing Bubble Sort");
        for(int i=0; i<arraytest.length; i++)
        {
            System.out.println(arraytest[i] + " ");
        }
        System.out.println();
        bubbleSort(arraytest); //diurutkan elemennya
        System.out.println("Array After Doing Bubble Sort");
        for(int i=0; i<arraytest.length; i++)
        {
            System.out.println(arraytest[i] + " ");
        }
    }
}


