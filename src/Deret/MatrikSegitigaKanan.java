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
public class MatrikSegitigaKanan {
    public static void main(String[] args) {
        
//      buat Scanner
        Scanner jumlah = new Scanner(System.in);
//      buat tipe data
        int n;
        
        System.out.println("matrik Segitiga Kanan ");
        System.out.println("Masukan Jumlah angka = ");
        n = jumlah.nextInt();
        System.out.println("");
//      buat Perhitungan
        for(int i=n; i>1; i-- ){
        for(int j=1; j<= n -i; ++j){
            System.out.println("");
        for(int k=1; k<=i; ++k){
            System.out.println(k+"");
        }
//        cetak hasil nya
                System.out.println("\n");
        }
      }
    }
}
    

