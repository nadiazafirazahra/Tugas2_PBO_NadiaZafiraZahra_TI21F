
/**
 * Nama: Nadia Zafira Zahra
 * NIM: 20210040174
 * Kelas: TI21F
 * PBO Sesi 2 No 4
 * @author Acer
 */
public class Handphone {
    String jenis_hp;
    int tahun_pembuatan;
    
    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    
    public String getJenisHP(){
        return this.jenis_hp;
        
    }
    
    public int getTahun_pembuatan(){
        return this.tahun_pembuatan;
        
    }
    public static void main(String[] args){
        Handphone hp = new Handphone();
        hp.setDataHP("Vivo",2020);
        
    System.out.println(hp.getTahun_pembuatan());
    }

}