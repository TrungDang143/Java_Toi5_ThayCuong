/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> ds = new ArrayList<Integer>();
        
        Random rand = new Random();
        int n = rand.nextInt(10)+5;
        
        for(int i = 0; i<n; i++)
        {
            boolean check = true;
            int tam;
            do{
                tam = rand.nextInt(200)-100;
                for(int j = 0; j<i; j++){
                    if(ds.contains(tam)){
                        check = false;
                        break;
                    }
                }
            }while(!check);
            
            ds.add(tam);
        }
        
        System.out.printf("\nXuat collection (n = %d): ", n);
        ds.forEach(i -> System.out.print(" "+i));
        
        System.out.print("\n\nTim kiem phan tu: ");
        Scanner sc = new Scanner(System.in);
        int tk = sc.nextInt();
        
        if(ds.contains(tk))
            System.out.print("--> Vi tri: "+ (ds.indexOf(tk)+1));
        else System.out.print("--> Khong co phan tu: "+tk);
        
        System.out.print("\nXuat SNT: ");
        ds.forEach(i -> {if(SNT(i)) 
                            System.out.print(" "+i);});
        
        System.out.print("\nSap xep tang dan: ");
        Collections.sort(ds);
        ds.forEach(i -> System.out.print(" "+i));

        System.out.print("\nSap xep giam dan: ");
        Collections.reverse(ds);
        ds.forEach(i -> System.out.print(" "+i));
        
        System.out.print("\nXoa phan tu dau: ");
        ds.removeFirst();
        ds.forEach(i -> System.out.print(" "+i));
        
        System.out.print("\nXoa phan tu cuoi: ");
        ds.removeLast();
        ds.forEach(i -> System.out.print(" "+i));
        
        int vt = rand.nextInt(n-2);
        System.out.printf("\nXoa phan thu %d: ", vt);
        ds.remove(vt);
        ds.forEach(i -> System.out.print(" "+i));
        
    }
    
    private static boolean SNT(int n){
        if(n<2){
            return false;
        }
        if(n<4){
            return true;
        }
        
        for(int i = 2; i<= Math.sqrt(n); i++)
        {
            if(n%i == 0)
                return false;
        }
        return true;
    }
    
    
    
}
