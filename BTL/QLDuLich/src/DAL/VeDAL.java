/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.Ve;
import Tools.DocFile;
import Tools.GhiFile;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class VeDAL {
    public static ArrayList<Ve> show(){
        try{
            ArrayList<Ve> a = new ArrayList<Ve>();
            a = DocFile.Doc_Ve_Tu_File();
            return a;
        }
        catch(IOException e){
            return null;
        }
        catch(ClassNotFoundException e){
            return null;
        }
    }
    
    public static double GetGiaVe(String maTour){
        ArrayList<Ve> a = show();
        for(Ve item:a){
            if(item.getMaTour().equals(maTour))
                return item.getGiaVe();
        }
        return 0;
    }
    
    public static boolean insert(ArrayList<Ve> list, Ve a) throws IOException{
        if(a.getMaVe().equals("")){
            JOptionPane.showMessageDialog(null,"Mã vé không được để trống");
            return false;
        }
        for(Ve item : list)
            if(a.getMaVe().equals(item.getMaVe())){
                JOptionPane.showMessageDialog(null,"Mã vé đã tồn tại");
                return false;
            }
        
        int index = list.size();
        for(int i=0;i<list.size();i++){
            if(a.getMaVe().compareTo(list.get(i).getMaVe())>0)
                index = i+1;
        }
        list.add(index,a);
        GhiFile.ghi_Ve_Vao_File(list);
        return true;
    }
    
    public static boolean update(ArrayList<Ve> list, Ve a) throws IOException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaVe().equals(list.get(i).getMaVe())){
                index = i;
            }
        if(index != -1){
            list.set(index,a);
            GhiFile.ghi_Ve_Vao_File(list);
            return true;
        }
        return false;
        
    }
    
    public static boolean delete(ArrayList<Ve> list, Ve a) throws IOException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaVe().equals(list.get(i).getMaVe())){
                index = i;
            }
        if(index!=-1){
            list.remove(index);
            GhiFile.ghi_Ve_Vao_File(list);
            return true;
        }
        else
        return false;
    }
}
