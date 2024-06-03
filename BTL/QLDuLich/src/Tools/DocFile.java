/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import Entities.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Logger;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class DocFile {
    public static ArrayList<NhanVien> Doc_NhanVien_Tu_File() throws IOException, ClassNotFoundException{
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("NhanVien.DAT"));
            ArrayList<NhanVien> s=(ArrayList<NhanVien>)in.readObject();
            in.close();
            return s;
        }
        catch(FileNotFoundException e){
            Logger.getLogger("NhanVien.DAT", e.getMessage());
            return new ArrayList<NhanVien>();
        }
    }
    
    public static ArrayList<TaiKhoan> Doc_TaiKhoan_Tu_File() throws IOException, ClassNotFoundException{
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("TaiKhoan.DAT"));
            ArrayList<TaiKhoan> s=(ArrayList<TaiKhoan>)in.readObject();
            in.close();
            return s;
        }
        catch(FileNotFoundException e){
            Logger.getLogger("TaiKhoan.DAT", e.getMessage());
            return new ArrayList<TaiKhoan>();
        }
    }
    
    public static ArrayList<KhachSan> Doc_KhachSan_Tu_File() throws IOException, ClassNotFoundException{
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("KhachSan.DAT"));
            ArrayList<KhachSan> s=(ArrayList<KhachSan>)in.readObject();
            in.close();
            return s;
        }
        catch(FileNotFoundException e){
            Logger.getLogger("KhachSan.DAT", e.getMessage());
            return new ArrayList<KhachSan>();
        }
    }
    
    public static ArrayList<Tour> Doc_Tour_Tu_File() throws IOException, ClassNotFoundException{
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Tour.DAT"));
            ArrayList<Tour> s=(ArrayList<Tour>)in.readObject();
            in.close();
            return s;
        }
        catch(FileNotFoundException e){
            Logger.getLogger("Tour.DAT", e.getMessage());
            return new ArrayList<Tour>();
        }
    }
    
    public static ArrayList<Ve> Doc_Ve_Tu_File() throws IOException, ClassNotFoundException{
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Ve.DAT"));
            ArrayList<Ve> s=(ArrayList<Ve>)in.readObject();
            in.close();
            return s;
        }
        catch(FileNotFoundException e){
            Logger.getLogger("Ve.DAT", e.getMessage());
            return new ArrayList<Ve>();
        }
    }
    
    public static ArrayList<Xe> Doc_Xe_Tu_File() throws IOException, ClassNotFoundException{
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Xe.DAT"));
            ArrayList<Xe> s=(ArrayList<Xe>)in.readObject();
            in.close();
            return s;
        }
        catch(FileNotFoundException e){
            Logger.getLogger("Xe.DAT", e.getMessage());
            return new ArrayList<Xe>();
        }
    }
    
    public static ArrayList<TourDaDat> Doc_TourDaDat_Tu_File() throws IOException, ClassNotFoundException{
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("TourDaDat.DAT"));
            ArrayList<TourDaDat> s=(ArrayList<TourDaDat>)in.readObject();
            in.close();
            return s;
        }
        catch(FileNotFoundException e){
            Logger.getLogger("TourDaDat.DAT", e.getMessage());
            return new ArrayList<TourDaDat>();
        }
    }
}
