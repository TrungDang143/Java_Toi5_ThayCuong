/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b2_hinhtron;

import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class B2_hinhtron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luon hinh tron: ");
        n = sc.nextInt();
        HinhTron[] m = new HinhTron[n];
        for (int i = 0; i<n; i++)
        {
            System.out.println("-- Nhap thong tin hinh tron thu "+(i+1));
            m[i] = new HinhTron();
            m[i].nhap();
        }
        
        System.out.println("----------------------");
        System.out.printf("\tTHONG TIN MANG %d HINH TRON",n);
        System.out.printf("\n%-10s %-10s %-10s","Ban kinh", "Chu vi", "Dien tich");
        for (int i = 0; i<n; i++)
        {
            m[i].xuat();
        }
    }
    
}
