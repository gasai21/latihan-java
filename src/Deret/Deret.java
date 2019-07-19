/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deret;

/**
 *
 * @author XiauXiau
 */
import java.util.Scanner;
public class Deret {
    public static void main (String[] args) {
        //Scanner
        Scanner suku = new Scanner(System.in);
        Scanner beda = new Scanner(System.in);
        Scanner awal = new Scanner(System.in);
        
        //Mulai menghitung
       for(int i=1; i==1;){ 
        //buat tipe data dan variabelnya
          int n,Un,a,b;
          
           System.out.println("\t\t\tDeret");
           System.out.println("Menghitung nilai suku ke-n");
           System.out.print("Masukan Suku Pertama (a) =");
           a = awal.nextInt();
           System.out.print("Masukan nilai beda (b) =");
           b = beda.nextInt();
           System.out.print("Masukan Banyak Suku (n) =");
           n = suku.nextInt();
           
        //rumusnya
           Un= (a+(n-1)*b);
        //outputnya
           System.out.println("Un = "+a+"+("+n+"-"+1+")*"+b);
           System.out.println(Un);
       }    
    }
}
