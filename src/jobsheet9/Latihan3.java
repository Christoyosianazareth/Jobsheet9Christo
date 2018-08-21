package jobsheet9;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author GL553VD
 */
public class Latihan3 {
    public static void hitung(int a, int b){
        System.out.println("Hasil:"+ (a+b) );
    }
    
    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan bilang I:");
        int bilI = input.nextInt();
        
        System.out.print("Masukkan bilangan II:");
        int bilII = input.nextInt();
        
        hitung (bilI, bilII);
    }
}
