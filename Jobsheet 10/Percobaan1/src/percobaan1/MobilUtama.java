
package percobaan1;

/**
 *
 * @author Ranny Erzitha-21343013
 */
public class MobilUtama {
    public static void main(String[] args) {
        Mobil Honda = new Mobil();
        Honda.merk = "Civic";
        Honda.tahunProduksi = 2020;
        System.out.println("Merek\t:" +Honda.merk);
        System.out.println("Warna\t:" + Honda.warna);
        System.out.println("Tahun\t:" + Honda.tahunProduksi);
        Honda.Maju();
        Honda.Maju();
        Honda.Mundur();
    }
}
