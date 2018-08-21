/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;

import java.util.Scanner;

/**
 *
 * @author GL553VD
 */
public class Latihan5 {
    public static void hitung(int a, int b){
        System.out.println("Kecepatan:"+ (a/b)+"km/jam" );
    }
    
    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Jarak:");
        int bilI = input.nextInt();
        
        System.out.print("Waktu tempuh:");
        int bilII = input.nextInt();
        
        hitung (bilI, bilII);
    }
}
