/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;

/**
 *
 * @author ddtru
 */
public class DSHinhTron {
    private ArrayList<HinhTron> dsht = new ArrayList<HinhTron>();

    public DSHinhTron() {
    
    }
    
    
    public boolean themHinhTron(HinhTron a){
        return dsht.add(a);
    }
    
    public int layKichThuoc(){
        return dsht.size();
    }
    
    public HinhTron layHinhTron(int i){
        return dsht.get(i);
    }
    
    public void ganHinhTron(int vt, HinhTron ht){
        dsht.set(vt, ht);
    }
    
    public double tongDT(){
        double kq = 0;
        for (HinhTron i : dsht){
            kq+=i.tinhDT();
        }
        return Math.round(kq*100)/100.0;
    }
    
    private int tknp(int l, int r, boolean isMax){
        if (l==r){
            return (r);
        }
        else{
            int m = (l+r)/2;
            int vtMaxL = tknp(l, m, isMax);
            int vtMaxR = tknp(m+1, r, isMax);
            
            if(isMax)
                return this.layHinhTron(vtMaxL).tinhDT() > this.layHinhTron(vtMaxR).tinhDT() ? vtMaxL:vtMaxR;
            else
                return this.layHinhTron(vtMaxL).tinhDT() < this.layHinhTron(vtMaxR).tinhDT() ? vtMaxL:vtMaxR;

        }
    }
    public int vtMax(boolean isMax){
        return tknp(0, this.layKichThuoc()-1, isMax);
    }
}
