class Person
{
    private String lastName;
    private String firstName;
    private int age;
    
    public Person(String last, String first, int a)
    {
        lastName = last;
        firstName = first;
        age = a;
    }
    
    public void displayPerson()
    {
        System.out.println(" Last name:" + lastName);
        System.out.println(", First name:" + firstName);
        System.out.println(", Age:" + age);
    }
    
    public String getLast() //masukan nama akhir
    {return lastName;}
}

class ClassDataArray
{
    private Person[] a; //referensi ke array
    private int nElems; //jumlah elemen dalam array
    
    public ClassDataArray(int max)
    {
        a = new Person[max]; //membuat sebuah array
        nElems = 0; //inisialiasi
    }
    
    public Person find(String searchName)
    {
        int j;
        for(j=0; j<nElems; j++)
        {
            if(a[j].getLast().equals(searchName)) //apakah ketemu?
            {break;}
        }
        if(j==nElems) //tidak ketemu
        {return null;}
        else //ketemu
        {return a[j];}
    }
    
    public void insert(String last, String first, int age)
    {
        a[nElems] = new Person(last, first, age);
        nElems++; //tambahkan ukuran arraynya
    }
    
    public boolean delete(String searchName)
    {
        int j;
        for(j=0; j<nElems; j++)
        {
            if(a[j].getLast().equals(searchName))
            {break;}
        }
        
        if(j==nElems) //tidak ketemu
        {return false;}
        else //ketemu
        {
            for(int k=j; k<nElems; k++)
            {a[k] = a[k+1];}
            nElems--;
            return true;
        }
    }
    
    public void displayA()
    {
        for(int j=0; j<nElems; j++)
        {a[j].displayPerson();}
    }
}
    
    class ClassDataApp
    {
        public static void main (String[] args)
        {
            int maxSize = 100;
            ClassDataArray arr;
            arr = new ClassDataArray(maxSize); //buat arraynya
            
            //masukan 10 item
            arr.insert("Evans", "Patty", 24);
            arr.insert("Smith", "Lorraine", 37);
            arr.insert("Yee", "Tom", 43);
            arr.insert("Adams", "Henry", 63);
            arr.insert("Hashimoto", "Sato", 21);
            arr.insert("Stimson", "Henry", 29);
            arr.insert("Velasquez", "Jose", 72);
            arr.insert("Lamarque", "Henry", 54);
            arr.insert("Vang", "Minh", 22);
            arr.insert("Creswell", "Lucinda", 18);
            
            arr.displayA();
            
            String searchKey = "Stimson"; //cari sebuah item
            Person found;
            found=arr.find(searchKey);
            if(found!=null)
            {
                System.out.println("Found");
                found.displayPerson();
            }
            else
            {System.out.println("Can't find" + searchKey);}
            
            System.out.println("Deleting Smith, Yee, and Creswell");
            arr.delete("Smith");
            arr.delete("Yee");
            arr.delete("Creswell");
            
            arr.displayA();
        }
    }
        