import java.util.*;

public class SelectionSort
{
    public static void main (String[] args)
    {
        int n, i, j, tempvar;
        Scanner sc = new Scanner(System.in); //Ngescan sesuatu atau meminta input dari user
        System.out.println("Masukan ukuran dari array: \n");
        n = sc.nextInt();
        int array[] = new int[n]; //menginisialisasi array dengan ukuran n (input user)
        System.out.print("Masukkan elemen yanggg akan dimasukan ke dalam array: \n");
        //Masukan elemen ke dalam arraynya
        for(i=0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("isi array sebelum disorting adalah : \n" + Arrays.toString(array));
        //dibawah ini merupakan selection shortnya
        for(i=0; i<n; i++)
        {
            for(j=i+1; j<n; j++) //membandingkan elemen pertama dengan elemen setelahnya
            {
                if(array[i]>array[j])//jika elemen pertama lebih besar dari elemen-elemen setelahnya
                {
                tempvar = array[i];
                array[i] = array[j];
                array[j] = tempvar;
                }
            }
        }
        System.out.println("Isi array setelah disorting adalah :\n");
        for(i=0; i<n; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
            
            
                
