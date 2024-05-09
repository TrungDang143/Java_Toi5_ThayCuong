/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author ddtru
 */
public class HinhTron {
    private double r;

    public HinhTron() {
        r = 0;
    }

    public HinhTron(double r) {
        this.r = r;
    }
    
    public double tinhDT(){
        return Math.round(Math.PI*r*r*100)/100.0;
    }

    @Override
    public String toString() {
        return "HinhTron{" + "r = " + Math.round(r*100)/100.0 + "\tS = "+tinhDT()+"}\n";
    }
    
}
