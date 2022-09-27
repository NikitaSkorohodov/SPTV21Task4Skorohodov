/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sptv21task4skorohodov;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author NikitaSkr
 */
public class SPTV21Task4Skorohodov {

    public static void main(String[] args) {
        int [][] matrixa= new int[10][10];
        Random rnd= new Random();
        int sum = 0;
        int siz=100;
        for (int i = 0; i < matrixa.length; i++){
            for(int j = 0; j<matrixa[i].length;j++){
                matrixa[i][j]=rnd.nextInt(100);
                sum = sum + matrixa[i][j];
               
                if(matrixa[i][j]==0){
                    siz--;}

                System.out.print(matrixa[i][j]+"\t");
                
            }
            System.out.println();
        
    }
        double chi=sum / (double)siz;
        System.out.println("среднее арефметическое "+chi);
}
}