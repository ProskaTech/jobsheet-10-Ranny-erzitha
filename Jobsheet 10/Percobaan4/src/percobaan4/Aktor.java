
package percobaan4;

/**
 *
 * @author 21343013-Ranny Erzitha
 */
public class Aktor {
    String nama;
    int umur;
    
    Aktor (String n,int u){ //Aktor adalah construktor
        nama=n;
        umur=u;
    }
    
    void tampilAktor(){
        System.out.println("Namaku : "+nama);
        System.out.println("Umurku : "+umur+"Tahun");
    }

    public static void main(String[] args) {
        Aktor a;
        a=new Aktor("Ronaldo", 33);
        a.tampilAktor();
        System.out.println("==========================");
        
        a=new Aktor("Messi", 34);
        a.tampilAktor();
        System.out.println("==========================");

    
    }
    
}
