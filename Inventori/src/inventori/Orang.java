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
public class Orang {
    String nama;
    private String pass;
    
    public Orang(String nama){
        this.nama= nama;
    }
    
    public void setNama (String nama){
        this.nama= nama;
    }
    
    public void setPass(String pass){
        this.pass= pass;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getPass(){
        return pass;
    }
    
    public void display(){
    }
}

