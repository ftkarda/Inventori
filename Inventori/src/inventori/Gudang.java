/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventori;

/**
 *
 * @author ardaf
 */
public class Gudang {
    private Barang[] daftarBarang;
    private String lokasi;
    
    public void addBarang(Barang b){
        
    }
    
    public void setLokasiBrg(String lokasi){
        this.lokasi= lokasi;
    }
    
    public String getLokasiBrg(){
        return lokasi;
    }
    
    public void hapusBarang(){
        
    }
    
    public void display(){
        System.out.println("Lokasi Barang: "+ getLokasiBrg());
    }
}