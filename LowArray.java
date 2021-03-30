import java.util.Scanner;

class LowArray
{
    private long[]a; //membuat sebuah array
    
    public LowArray(int size)
    {a = new long[size];} //insialisasi array
    public void setElem(int index, long value) //masukkan value ke dalam array
    { a[index] = value;}
    public long getElem (int index) //mendapatkan nilai dalam sebuah array
    {return a[index];}
} //struktur LowArray sampai disini

class LowArrayApp
{
    public static void main (String[] args)
    {
        LowArray arr;
        arr = new LowArray(100); //membuat sebuah array dengan ukutan 100
        int nElems = 0;
        int j;
        
        arr.setElem(0, 77); arr.setElem(1, 99); arr.setElem(2, 44); arr.setElem(3, 55);
        arr.setElem(4, 22); arr.setElem(5, 88); arr.setElem(6, 11); arr.setElem(7, 00);
        arr.setElem(8, 66); arr.setElem(9, 33);
        nElems = 10;
        
        for(j=0; j<nElems; j++) //digunakan untuk menampilkan isi pada array
        System.out.println(arr.getElem(j) + " ");
        System.out.println(" ");
        
        //Untuk mencari apakah data tersebut ada atau tidak
        Scanner scan = new Scanner(System.in);
        long searchKey = scan.nextLong();//scan angka yang ingin dicari pada array
        
        for(j=0; j<nElems; j++)
        {
            if(arr.getElem(j)==searchKey)
            {/* apabila isi dari indeks ke-j sama dengan yang dicari, maka */
            break;}
        }
            if (j == nElems) //kalau tidak ketemu
            System.out.println ("Can't find" + searchKey);
            else
            System.out.println("Found" + searchKey);
            
        //Untuk menghapus data tertentu
        System.out.println("Please input the element you wish to delete");
        long delKey = scan.nextLong(); //Scan dulu yang mau dihapus yang mana
        
        for(j=0; j<nElems; j++) //Cari dulu elemen yang mau dihapus
        {
            if(arr.getElem(j) == delKey)
            {break;}
        }
        
        /*
         * Pindahkan array dengan indeks lebih tinggi 
         * dari elemen yang dicari, ke bawah
         */
        for(int k=j; k<nElems; k++) 
        {
            arr.setElem(k, arr.getElem(k+1));
            nElems--;
        }
        
        for(j=0; j<nElems; j++) //Print elemen sisanya
        {
            System.out.println(arr.getElem(j) + " ");
            System.out.println("\n");
        }
    }
}
            
            