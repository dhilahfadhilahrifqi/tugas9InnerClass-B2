// No 5 tugas 9
//program Inner Class

/*
Nama		: Fadhilah Rifqi
Stambuk	: 13020180091
Kelas	: B2
*/

class Luas { 
	int sum=0;
   // Simple nested inner class 
   class Dalam { 
      public void hitung() { 
			for(int i=0; i<=10; i++){
				sum+=i;
			}
           System.out.println("Hasil penjumlahan dari 1 sampai 10 adalah "+sum); 
      } 
   } 
} 
class InnerClass { 
   public static void main(String[] args) { 
       Luar.Dalam tampil = new Luar().new Dalam(); 
       tampil.hitung(); 
   } 
} 

/*
output:
Hasil penjumlahan dari 1 sampai 10 adalah 55

penjelasan:
hasil di atas menggunakan inner class yang mana seperti class di dalam class.
di dalam class Luar ada class Dalam yang mana terdapat fungsi void hitung()
yang berisi proses penambahan 1 sampai 10 dengan menggunakan perulangan for.
setelah itu hasil dari proses itu di tampilkan dan di panggil di fungsi main
yang mana harus membuat instance objek terlebih dahulu dari inner class diatas
yaitu instance objek tampil dan panggil fungsi hitung.
*/