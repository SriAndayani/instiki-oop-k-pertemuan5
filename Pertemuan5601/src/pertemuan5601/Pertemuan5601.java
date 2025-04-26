/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5601;

/**
 *
 * @author Sri Andayani
 * TGL : 26 April 2025
 */
public class Pertemuan5601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        manusia johan = new manusia("L");
        johan.warnakulit="brown";
        johan.setWarnaRambut("hitam");
        
        manusia yani = new manusia("P");
        yani.warnakulit="sawo matang";
        yani.setWarnaRambut("dark brown");
        
        manusia anton = new manusia("L");
        anton.warnakulit="sawo matang";
        anton.setWarnaRambut("red");
        
        manusia indah = new manusia("L");
        
    }
    
}

class manusia{
    public String warnakulit="";
    private String warnarambut="";
    private String jeniskelamin="";
    
    public manusia(String jkel) {
        this.jeniskelamin = jkel;
    }
    
    public void setWarnaRambut(String warna){
        // menambahkan kode identifikasi
        this.warnarambut = warna;
    }
}

