
package Percobaan3;

/**
 *
 * @author 21343013-Ranny Erzitha
 */
public class InformatikaUNP {
    public static void main(String[] args) {
        mahasiswa Informatika = new mahasiswa();
        mahasiswa elektronika = new mahasiswa();
        
        Informatika.nama = "Happy Alicia";
        Informatika.nim = 1;
        Informatika.jur = "S1 Informatika";
        Informatika.univ = "Universitas Negeri Padang";
        
        elektronika.nama = "Wilson";
        elektronika.nim = 2;
        elektronika.jur = "S1 Elektronika";
        elektronika.univ = "Universitas Negeri Padang";
        
        System.out.println("Data Mahasiswa Informatika");
        System.out.println("Nama :"+ Informatika.nama);
        System.out.println("NIM :"+ Informatika.nim);
        System.out.println("Jurusan :"+ Informatika.jur);
        System.out.println("Status :"+ Informatika.univ);
        
        System.out.println("--------------------------");
        
        System.out.println("Data Mahasiswa Elektronika");
        System.out.println("Nama :"+ elektronika.nama);
        System.out.println("NIM :"+ elektronika.nim);
        System.out.println("Jurusan :"+ elektronika.jur);
        System.out.println("Status :"+ elektronika.univ);
        
                
              
    }

}
