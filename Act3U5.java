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
        promedio();
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
    
    public static void promedio (){
        double [] ar = {1.1, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.1, 10.2};
        double sum = 0;
        for (double elemento : ar){
            sum+= elemento;
        }
        double prom = sum/10;
        System.out.println(""+prom);
    } 
    

}

