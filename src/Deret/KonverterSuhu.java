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
public class KonverterSuhu {
    public static void main(String[] args) {
        
   
//    buat Scanner
    Scanner input = new Scanner(System.in);
//    buat tipe data
    double suhuawal,celcius,reamur,fahrenheit,kelvin;
    
        System.out.println("Konverter Suhu");
        System.out.println("Masukan suhu(dalamCelcius) =");
        suhuawal=input.nextDouble();
        System.out.println("nomor\tCelcius\t\tReamur\t\tfahrenheit\t\tkelvin");
//    buat Perhitungan
    for(int i=1; i<=10; i++){
        celcius=(suhuawal*i);
        reamur=((suhuawal*i)*0.8);
        fahrenheit=((suhuawal*i)*1.8+32);
        kelvin=((suhuawal*i)+237.15);
    
//    cetak hasil nya
        System.out.println(i + "\t"+celcius+"\t\t"+reamur+"\t\t"+fahrenheit+"\t\t"+kelvin);
    }
    } 
}
