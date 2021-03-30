import java.util.Scanner;

/**
 * Write a description of class Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayApp
{
    public static void main (String[] args)
    {
        long arr[];
        arr = new long[100];
        long searchKey;
        int j;
        int nElems = 10;
        arr[0] = 77; arr[1] = 99; arr[2] = 44; arr[3] = 55;
        arr[4] = 22; arr[5] = 88; arr[6] = 11; arr[7] = 00;
        arr[8] = 66; arr[9] = 33;
        
        //print semua elemennya
        System.out.println("Below here are the elements of the array\n");
        for(j=0; j<nElems; j++)
        {
            System.out.println(arr[j] + " ");
            System.out.println("\n");
        }
        
        //Nyari elemennya
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the element you're searching for");
        searchKey = scan.nextLong();
        
        for(j=0; j<nElems; j++)
        {
            if(arr[j] == searchKey)
            {
                break;
            }
        }
        if(j == 10)
        {System.out.println("Can't find" + searchKey);}
        else
        {System.out.println("Found" + searchKey);}
        
        //Untuk menghapus 
        System.out.println("Please input the element you wish to delete");
        long delKey = scan.nextLong(); //Scan dulu yang mau dihapus yang mana
        
        for(j=0; j<nElems; j++) //Cari dulu elemen yang mau dihapus
        {
            if(arr[j] == delKey)
            {break;}
        }
        /*
         * Pindahkan array dengan indeks lebih tinggi 
         * dari elemen yang dicari, ke bawah
         */
        for(int k=j; k<nElems; k++) 
        {
            arr[k] = arr[k+1];
            nElems--;
        }
        
        for(j=0; j<nElems; j++) //Print elemen sisanya
        {
            System.out.println(arr[j] + " ");
            System.out.println("\n");
        }       
    }
}
        
            

        
