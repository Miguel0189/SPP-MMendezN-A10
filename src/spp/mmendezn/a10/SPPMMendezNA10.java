/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mmendezn.a10;
import java.util.Scanner;
/**
 *
 * @author migue
 */
public class SPPMMendezNA10 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int tamaño=solicitaTamaño();
        int [][] a = arreglo ("A", tamaño);
        int [][] b = arreglo ("B", tamaño);
        sumaM(a,b);
        restaM(a,b);
        multiplicaciónM(a,b);
    }
    public static int solicitaEntero(){
        Scanner kb= new Scanner (System.in);
        boolean flag;
        int n=0;
        do{
            System.out.println("Introduce un número entero");
            try{
                n=kb.nextInt();
                flag=false;  
            }
            catch(Exception er){
                System.out.println("Intentalo de nuevo");
                flag=true;
                kb.nextLine();
            }
        }while (flag);
        
        return n;
    }
    public static int solicitaTamaño(){
        Scanner key = new Scanner (System.in);
        boolean flag;
        int a = 0;
        do{
            try{
                System.out.println("Ingrese el tamaño de la matriz deseada: ");
                a = key.nextInt();
                flag = false;
            }
            catch (Exception er){
                System.out.println("error");
                key.next();
                flag = true;      }
        }
        while (flag);
        return a;
    }
    public static int [][] arreglo (String a, int tam){
        int [][]arreglo = new int [tam][tam];
        System.out.println("Matriz: " + a);
        for (int i = 0; i < arreglo.length; i++){
        for (int j = 0; j < arreglo[i].length; j++){
        arreglo [i][j] = solicitaEntero();
        }
        }
        return arreglo;
    }  
    public static int [][] sumaM (int [][]a, int[][]b){
        int [][] resultado = new int [a.length] [a.length];
        
        System.out.println("la suma de las matrices es : ");
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
        resultado[i][j] = a[i][j] + b[i][j];
        System.out.println("["+resultado[i][j]+"]");   
    }
    }
        return resultado; 
    }

    public static int [][] restaM (int [][]a, int[][]b){
        int [][] resultado = new int [a.length] [a.length];
        System.out.println("Su resta es: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        resultado[i][j] = a[i][j] - b[i][j];
        System.out.println("["+resultado[i][j]+"]");   }
    }
        return resultado; 
    }
     public static int [][] multiplicaciónM (int [][]a, int[][]b){
        int [][] result = new int [a.length] [a.length];
        System.out.println("la multiplicacion de las matrices es : ");
        for (int i = 0; i < a.length; i++){
         for (int j = 0; j < a[i].length; j++){
        result[i][j] = a[i][j] * b[i][j];
        System.out.println("["+result[i][j]+"]");   
    }
    }
        return result; 
         
    } 
   
}
