class OrdArray
{
    private long[] a; //buat sebuah array a
    private int nElems; //jumlah elemen yang akan dimasukan ke dalam array
    
    public OrdArray(int max)
    {
        a = new long[max]; // deklarasiin arraynya
        nElems = 0;
    }
    
    public int size()
    {return nElems;}
    
    public int find(long searchKey)
    {
        int lowerBound = 0;
        int upperBound = nElems-1;
        int curln;
        
        while(true)
        {
            curln = (lowerBound + upperBound)/2;
            if(a[curln] == searchKey)
            {return curln;} //ketemu
            else if(lowerBound>upperBound)
            {return nElems;} //tidak ketemu
            else
            {
                if(a[curln] < searchKey)
                {lowerBound = curln+1;} //ada di bagian atas
                else
                {upperBound = curln-1;} //ada di bagian bawah
            }
        }
    }
    
    public void insert(long value) //memasukan elemen ke dalam array secara berurutan
    {
        int j;
        for(j=0; j<nElems; j++) //cari lokasi indeks yang tepat
        {
            if(a[j]>value) 
            {break;}
        }
        
        for(int k=nElems; k>j; k--) //yang lebih besar dipindahkan satu ke kiri
        {
            a[k] = a[k-1];
        }
        
        a[j] = value; //masukan data elemennya
        nElems++; //perbesar ukuran arraynya
    }
    
    public boolean delete(long value)
    {
        int j = find(value);
        if(j==nElems) //tidak dapat menemukannya
        {return false;}
        else
        {
            for(int k=j; k<nElems; k++) //yang lebih besar digeser ke kanan
            {a[k] = a[k+1];}
            nElems--; //mengurangi ukuran arraynya
            return true;
        }
    }
    
    public void display()
    {
        for(int j=0; j<nElems; j++) //untuk semua elemen
        {System.out.println(a[j] + " ");} //tampilkan
        System.out.println("");
    }
    
}

class OrderedArrayApp
{
    public static void main (String[] args)
    {
        int maxSize = 100; //ukuran dari sebuah array
        OrdArray arr; //referensi ke array
        arr = new OrdArray(maxSize); //membuat array
        
        arr.insert(77); arr.insert(99); arr.insert(44); arr.insert(55);
        arr.insert(22); arr.insert(88); arr.insert(11); arr.insert(00);
        arr.insert(66); arr.insert(33);
        
        int searchKey = 55; //mencari item dengan value 55
        
        if(arr.find(searchKey) != arr.size())
        {System.out.println("Found" + searchKey);}
        else
        {System.out.println("Can't find" + searchKey);}
        
        arr.display(); //tampilkan elemen-elemen array
        
        //hapus 3 item dalam array
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);
        
        arr.display(); //tampilkan setelah dihapus
    }
}
