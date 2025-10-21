/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act3u5;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Act3U5 {
    public static void main(String[] args) {
        double [] arrg = {1.1, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.1, 10.2};
        Scanner sc = new Scanner(System.in);
        double rs = Act3U5.decimales(0);
        mostrarContenido();
        double resultado = promedio();
    }


    public static double decimales (double arreg){
        
     Scanner sc = new Scanner (System.in);
        System.out.println("ingresa los decimales");
        for (double i= 0; i<=9; i++){
            System.out.println("num"+(i+1)+ "; ");
            arreg = sc.nextDouble();
            
        } 
        return arreg;
    }       
   
    public static void mostrarContenido (){
        System.out.println("1.1, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.1, 10.2");
    }
    
    public static double promedio (double prom){
        double [] ar = {1.1, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.1, 10.2};
        double sum= ar[0]+ar[1]+ar[2]+ar[3]+ar[4]+ar[5]+ar[6]+ar[7]+ar[8]+ar[9];
        prom =  (float) (sum/10);
        return prom;
    } 
    

}

