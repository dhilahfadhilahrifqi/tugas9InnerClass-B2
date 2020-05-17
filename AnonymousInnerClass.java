// No 8 tugas 9
//program Anonymous Inner Class

/*
Nama		: Fadhilah Rifqi
Stambuk	: 13020180091
Kelas	: B2
*/

interface Kata
{ 
    void kata1();
} 

// Myclass implement the methods of Age Interface 
interface KataKata extends Kata 
{ 
    void kata2();
}

class AnonymousInnerClass 
{ 
    public static void main(String[] args)  
    { 
        // Myclass is implementation class of Age interface 
        KataKata obj = new KataKata(){
			public void kata1(){
				System.out.println("Fadhilah");
			}
			public void kata2(){
				System.out.println("Rifqi");
			}
		}; 
  
        // calling getage() method implemented at Myclass 
        obj.kata1(); obj.kata2();      
    } 
} 

/*
output:
Fadhilah
Rifqi

penjelasan:
pada hasil di atas menggunakan Anonymous Inner Class.  
variabel obj mereferensi ke suatu intance anonymous inner class yang merupakan 
implementasi dari interface Kata dan KataKata
*/
  
 