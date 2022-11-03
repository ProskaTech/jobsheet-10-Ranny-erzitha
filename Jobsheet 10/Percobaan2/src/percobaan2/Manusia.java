
package percobaan2;

import java.util.Scanner;

/**
 *
 * @author 21343013-Ranny Erzitha
 */
public class Manusia {
    String nama,tempat_lahir,tgl_lahir;
    int berat_badan,tinggi_badan;
    
    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap\t: ");
        nama = input.nextLine();
        System.out.print("Masukkan tempat lahir:\t");
        tempat_lahir = input.nextLine();
        System.out.print("Masukkan tanggal lahir :\t");
        tgl_lahir= input.nextLine();
        System.out.print("Masukkan berat badan : \t");
        berat_badan = input.nextInt();
        System.out.print("Masukkan Tinggi Badan :\t");
        tinggi_badan = input.nextInt();
    }
    public void Identitas(){
        System.out.println("Nama Saya \t : "+nama);
        System.out.println("Tempat lahir \t :"+tempat_lahir);
        System.out.println("Tanggal lahir \t : "+tgl_lahir);
        System.out.println("Berat badan \t : "+berat_badan+ "kg");
        System.out.println("Tinggi Badan \t : "+tinggi_badan+ "cm");
        
        
    }
    public static void main(String[] args) {
        Manusia A = new Manusia();
        A.inputData();
        A.Identitas();
    }
}
