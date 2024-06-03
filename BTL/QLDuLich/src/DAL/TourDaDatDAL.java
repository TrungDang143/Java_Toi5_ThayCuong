/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.TourDaDat;
import Tools.DocFile;
import Tools.GhiFile;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class TourDaDatDAL {
    public static ArrayList<TourDaDat> showAll(){
        try{
            ArrayList<TourDaDat> a = DocFile.Doc_TourDaDat_Tu_File();
            
            return a;
        }
        catch(IOException e){
            return null;
        }
        catch(ClassNotFoundException e){
            return null;
        }
    }
    
    public static ArrayList<TourDaDat> show(String maTaiKhoan){
        try{
            ArrayList<TourDaDat> a = DocFile.Doc_TourDaDat_Tu_File(), b = new ArrayList<TourDaDat>();
            for(TourDaDat i:a){
                if(i.getMaTaiKhoan().equals(maTaiKhoan))
                    b.add(i);
            }
            return b;
        }
        catch(IOException e){
            return null;
        }
        catch(ClassNotFoundException e){
            return null;
        }
    }
    
    public static String showTenDK(String maTaiKhoan) throws IOException, ClassNotFoundException{
        ArrayList<TourDaDat> a = DocFile.Doc_TourDaDat_Tu_File(), b = new ArrayList<TourDaDat>();
            for(TourDaDat i:a){
                if(i.getMaTaiKhoan().equals(maTaiKhoan))
                    return i.getTenDK();
            }
        return "";
    }
    
    public static boolean insert(ArrayList<TourDaDat> list, TourDaDat a) throws IOException{
        if(a.getMaTaiKhoan().equals("")){
            JOptionPane.showMessageDialog(null,"Vui lòng đăng nhập để thực hiện");
            return false;
        }
        list.add(a);
        GhiFile.ghi_TourDaDat_Vao_File(list);
        return true;
    }
    
    public static boolean delete(ArrayList<TourDaDat> list, TourDaDat a) throws IOException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaTaiKhoan().equals(list.get(i).getMaTaiKhoan()) && 
                    a.getTourDaChon().getMaTour().equals(list.get(i).getTourDaChon().getMaTour())){
                index = i;
            }
        if(index!=-1){
            list.remove(index);
            GhiFile.ghi_TourDaDat_Vao_File(list);
            return true;
        }
        else
        return false;
    }
}
