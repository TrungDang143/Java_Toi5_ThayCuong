/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.Xe;
import Tools.DocFile;
import Tools.GhiFile;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class XeDAL {
    public static ArrayList<Xe> show(){
        try{
            ArrayList<Xe> a = new ArrayList<Xe>();
            a = DocFile.Doc_Xe_Tu_File();
            return a;
        }
        catch(IOException e){
            return null;
        }
        catch(ClassNotFoundException e){
            return null;
        }
    }
    
//    public static String GetTenXe(String maXe){
//        ArrayList<Xe> a = show();
//        for(Xe item:a){
//            if(item.getMaXe().equals(maXe))
//                return item.getTenXe();
//        }
//        return "";
//    }
    
    public static boolean insert(ArrayList<Xe> list, Xe a) throws IOException{
        if(a.getMaXe().equals("")){
            JOptionPane.showMessageDialog(null,"Mã xe không được để trống");
            return false;
        }
        for(Xe item : list)
            if(a.getMaXe().equals(item.getMaXe())){
                JOptionPane.showMessageDialog(null,"Mã xe đã tồn tại");
                return false;
            }
        int index = list.size();
        for(int i=0;i<list.size();i++){
            if(a.getMaXe().compareTo(list.get(i).getMaXe())>0)
                index = i+1;
        }
        list.add(index,a);
        GhiFile.ghi_Xe_Vao_File(list);
        return true;
    }
    
    public static boolean update(ArrayList<Xe> list, Xe a) throws IOException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaXe().equals(list.get(i).getMaXe())){
                index = i;
            }
        if(index != -1){
            list.set(index,a);
            GhiFile.ghi_Xe_Vao_File(list);
            return true;
        }
        return false;
        
    }
    
    public static boolean delete(ArrayList<Xe> list, Xe a) throws IOException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaXe().equals(list.get(i).getMaXe())){
                index = i;
            }
        if(index!=-1){
            list.remove(index);
            GhiFile.ghi_Xe_Vao_File(list);
            return true;
        }
        else
        return false;
    }
}
