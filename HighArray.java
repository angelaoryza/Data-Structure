class HighArray
{
    private long[] a; //definisiin arraynya dulu
    private int nElems; //jumlah elemen yang bakal diinput ke dalam array
    
    public HighArray(int max) 
    {
        a= new long[max]; //insialisasi array
        nElems = 0;
    }
    
    public boolean find(long searchKey) //
    {
        int j;
        for(j=0; j<nElems; j++)
        {
        if(a[j]== searchKey)
        {break;}
        }
        if(j == nElems)
        {return false;}
        else
        {return true;}
    }
    
    public void insert(long value) //masukin data ke dalam array
    {
        a[nElems] = value; //masukkan data nya ke array
        nElems ++; //besarkan ukuran array
    }

    public boolean delete(long value) //mengjapus data dalam array indeks tertentu
    {
        int j;
        for(j=0; j<nElems; j++)
        { 
            if(value == a[j])
            {break;}
        }
        if(j==nElems)
        {return false;}
        else
        {
        for(int k=j; k<nElems; k++)
        {
            a[k] = a[k+1];
            nElems--;
        }
                    return true;
        }
    }

    
    public void display() //menampilkan data dalam array
    {
        for(int j=0; j<nElems; j++)
        {
            System.out.println(a[j] + " ");
        }
        System.out.println(" ");
    }
}

class HighArrayApp
{
    public static void main (String[] args)
    {
        int maxSize = 100; //ukuran dari array
        HighArray arr;
        arr = new HighArray(maxSize); //membuat sebuah array
        
        arr.insert(77); arr.insert(99); arr.insert(44); arr.insert(55);
        arr.insert(22); arr.insert(88); arr.insert(11); arr.insert(00);
        arr.insert(66); arr.insert(33);
        
        arr.display(); //menampilkan semua elemen array
        
        //menghapus 3 elemen pada array
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);
        
        arr.display();//tampilkan arraynya lagi
    }
}
    
    
