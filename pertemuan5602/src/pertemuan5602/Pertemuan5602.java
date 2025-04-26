/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5602;

import java.util.Scanner;

/**
 *
 * @author Sri Andayani
 * TGL : 26/04/2025
 */
public class Pertemuan5602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
        Scanner input = new Scanner(System.in);
        LuasSegitiga Segitiga01 = new LuasSegitiga();
        
        System.out.println("================================");
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("================================");
        System.out.print("Masukkan Alas : ");
        Segitiga01.alas = input.nextInt();
        
        System.out.print("Masukkan Tinggi : ");
        Segitiga01.tinggi = input.nextInt();
        
//        Segitiga01.alas = 8;
//        Segitiga01.tinggi = 5;
        System.out.println("================================");
        System.out.println("Hasil Luas Segitiga: "+Segitiga01.HitungLuas());
        System.out.println("================================");
    }
    
}
