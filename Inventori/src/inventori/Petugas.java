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
public class Petugas extends Orang {
    private long idPtgs;

    public Petugas(String nama) {
        super(nama);
    }
    
    public long setIdPtgs(long idPtgs){
        return idPtgs;
    }
    
    public long getIdPtgs(){
        return idPtgs;
    }
    
    @Override
    public void display(){
        System.out.println("Nama: " + super.getNama());
        System.out.println("ID Petugas: " + getIdPtgs());
    }
  
}

