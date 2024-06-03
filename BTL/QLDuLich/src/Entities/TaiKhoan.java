/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Tools.DocFile;
import Tools.GhiFile;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class TaiKhoan implements Serializable{
    private String MaTaiKhoan;
    private String MatKhau;
    private String VaiTro;

    public TaiKhoan() {
    }

    public TaiKhoan(String MaTaiKhoan, String MatKhau, String VaiTro) {
        this.MaTaiKhoan = MaTaiKhoan;
        this.MatKhau = MatKhau;
        this.VaiTro = VaiTro;
    }

    public String getMaTaiKhoan() {
        return MaTaiKhoan;
    }

    public void setMaTaiKhoan(String MaTaiKhoan) {
        this.MaTaiKhoan = MaTaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "MaTaiKhoan=" + MaTaiKhoan + ", MatKhau=" + MatKhau + ", VaiTro=" + VaiTro + '}';
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        //ArrayList<TaiKhoan> listTK = DocFile.Doc_TaiKhoan_Tu_File();
        
          //Tạo file tài khoản
          ArrayList<TaiKhoan> s = new ArrayList<>();     
          TaiKhoan n1 = new TaiKhoan("admin1","123456","Admin");
          TaiKhoan n2 = new TaiKhoan("admin2","123456","Admin");
          TaiKhoan n3 = new TaiKhoan("admin3","123456","Admin");
          TaiKhoan n4 = new TaiKhoan("admin4","123456","Admin");
          TaiKhoan n5 = new TaiKhoan("user1","123456","User");
          TaiKhoan n6 = new TaiKhoan("user2","123456","User");
          TaiKhoan n7 = new TaiKhoan("user3","123456","User");
          TaiKhoan n8 = new TaiKhoan("user5","123456","User");
          s.add(n1);
          s.add(n2);
          s.add(n3);
          s.add(n4);
          s.add(n5);
          s.add(n6);
          s.add(n7);
          s.add(n8);
          
          GhiFile.ghi_TaiKhoan_Vao_File(s);
    }
}
