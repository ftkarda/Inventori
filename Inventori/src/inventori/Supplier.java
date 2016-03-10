/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventori;

/**
 *
 * @author hafizha
 */
public class Supplier extends Orang {
    private Barang[] daftarBarang;
    private int nBarang =0;
    private long idSpl;
    private String alamatSpl;
    private long telpSpl;
    private int thnMsk;

    public Supplier(String nama, int maksBarang) {
        super(nama);
        this.daftarBarang = new Barang[maksBarang];
    }
    
    public void createBarang(String namaBarang, int hargaBarang, long idBarang){
        Barang b = null;
        this.daftarBarang[this.nBarang++] = b;
    }
    
    public void setidSpl(long idSpl){
        this.idSpl= idSpl;
    }
    
    public void setAlamatSpl(String alamatSpl){
        this.alamatSpl= alamatSpl;
    }
    
    public void setTelpSpl(long telpSpl){
        this.telpSpl= telpSpl;
    }
    
    public void setThnMsk (int thnmsk){
        this.thnMsk= thnMsk;
    }
    
    public long getidSpl(){
        return idSpl;
    }
    
    public String getAlamatSpl(){
        return alamatSpl;
    }
    
    public long getTelpSpl(){
        return telpSpl;
    }
    
    public int getThnMsk(){
        return thnMsk;
    }
    
    public Barang getBarang(int index){
        int i = 0;
        return daftarBarang[i];
        
    }
    
    public void hapusBarang(){
        
    }
    
    @Override
    public void display(){
        System.out.println("Nama: " + super.getNama());
        System.out.println("ID Petugas: " + getidSpl());
    }
}

