// No 6 tugas 9
//program Method-local Inner Class

/*
Nama		: Fadhilah Rifqi
Stambuk	: 13020180091
Kelas	: B2
*/

class Luar {
    void MethodeLuar() { 
        // method-local inner class
        class Dalam{ 
			int sum=0;
            void MethodeDalam() { 
                for(int i=0; i<=10; i++){
					sum+=i;
				}
				System.out.println("Hasil penjumlahan dari 1 sampai 10 adalah "+sum); 
            } 
        } 
		//membuat instance dari method-local inner class
		//yang harus berada di dalam method dan setelah definisi inner class
        Dalam print = new Dalam(); 
        print.MethodeDalam(); 
    } 
} 
class MethodInnerClass { 
    public static void main(String[] args) { 
        Luar x = new Luar(); 
        x.MethodeLuar(); 
    } 
}

/*
output:
Hasil penjumlahan dari 1 sampai 10 adalah 55.

penjelasan :
hasil di atas menggunakan method-local inner class.
terdapat class luar di dalam class luar terdapat methodeLuar di dalam metodeLuar
terdapat method-local inner class yaitu class Dalam yang di dalamnya terdapat 
methodeDalam yang berisi proses penjumlahan dari 1 sampai 10 dengan perulangan for
kemudian seteleh inner class, harus membuat instance dari method-local inner class
yang berada di dalam methode dan didefinisikan setelah pembuatan inner class tersebut.
selanjutnya di fungsi main tinggal pemanggilang dari class luarnya.
*/