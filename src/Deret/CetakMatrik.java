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
public class CetakMatrik {
    public static void main(String[] args) {
//       Buat Scanner
Scanner ordo = new Scanner (System.in);

int n;

        System.out.println("cetak Matrik");
        System.out.println("");
        System.out.println("Masukan bentuk ordo(2/3/4)");
        n = (char) ordo.nextInt();
        
        if((n==2)){
            int ordo2[][] = new int [2][2];
            ordo2[0][0] =1;
            ordo2[0][1] =-1;
            ordo2[1][0] =-1;
            ordo2[1][1] =1;
            
            for (int i=0; i < ordo2.length; i++){
                for (int j=0; j< ordo2[0].length; j++){
                    System.out.println(ordo2[i][j] + "");
                }
                System.out.println();
            }
            
        }
        else if((n==3)){
            int ordo3[][]= new int[3][3];
            ordo3[0][0] = 1;
            ordo3[0][1] = 0;
            ordo3[0][2] = -1;
            ordo3[1][0] = 0;
            ordo3[1][1] = 0;
            ordo3[1][2] = 0;
            ordo3[2][0] = -1;
            ordo3[2][1] = 0;
            ordo3[2][2] = 1;
            
            for (int i=0; i < ordo3.length; i++){
                for (int j=0; j < ordo3[0].length; j++){
                    System.out.print(ordo3[i][j]+ " ");
                }
                System.out.println();
            }
        }
   
    else if((n==4)){
            int ordo4[][]= new int[4][4];
            ordo4[0][0] = 1;
            ordo4[0][1] = 0;
            ordo4[0][2] = 0;
            ordo4[0][3] = -1;
            ordo4[1][0] = 0;
            ordo4[1][1] = 1;
            ordo4[1][2] = -1;
            ordo4[1][3] = 0;
            ordo4[2][0] = 0;
            ordo4[2][1] = -1;
            ordo4[2][2] = 1;
            ordo4[2][3] = 0;
            ordo4[3][0] = -1;
            ordo4[3][1] = 0;
            ordo4[3][2] = 0;
            ordo4[3][3] = 1;
            
            for (int i=0; i < ordo4.length; i++){
                for (int j=0; j < ordo4[0].length; j++){
                    System.out.print(ordo4[i][j]+ " ");
                }
                System.out.println();
            }
        }
    else {
            System.out.println("coba lagi");
        }
    }
}