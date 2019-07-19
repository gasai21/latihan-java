/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deret;

import java.util.Scanner;

/**
 *
 * @author XiauXiau
 */
public class MatrikSegitigaKiri {
    public static void main(String[] args) {
        
//      buat Scanner
        Scanner jumlah = new Scanner(System.in);
       
//      buat tipe data
        int n;
        
        System.out.println("Matrik Segitiga Kiri");
        
        System.out.println("Masukan jumlah Angka = ");
        n = jumlah.nextInt();
        System.out.println("");
//      buat Perhitungan
       for(int i=n; i>=1; --i){
           for(int j=1; j<=i; ++j){
               System.out.println(j+"");
           }
//        cetak hasil nya
           System.out.println("");
       }

      
    }
}
