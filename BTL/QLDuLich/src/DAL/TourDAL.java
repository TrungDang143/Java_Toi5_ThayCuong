/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.Tour;
import Tools.DocFile;
import Tools.GhiFile;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class TourDAL {
    public static ArrayList<Tour> show(){
        try{
            ArrayList<Tour> a = new ArrayList<Tour>();
            a = DocFile.Doc_Tour_Tu_File();
            return a;
        }
        catch(IOException e){
            return null;
        }
        catch(ClassNotFoundException e){
            return null;
        }
    }
    
    public static Tour GetTour(String tenTour){
        ArrayList<Tour> a = show();
        for(Tour item:a){
            if(item.getTenTour().equals(tenTour))
                return item;
        }
        return null;
    }
    
    public static boolean insert(ArrayList<Tour> list, Tour a) throws IOException{
        if(a.getMaTour().equals("")){
            JOptionPane.showMessageDialog(null,"Mã tour không được để trống");
            return false;
        }
        for(Tour item : list)
            if(a.getMaTour().equals(item.getMaTour())){
                JOptionPane.showMessageDialog(null,"Mã tour đã tồn tại");
                return false;
            }
        
        int index = list.size();
        for(int i=0;i<list.size();i++){
            if(a.getMaTour().compareTo(list.get(i).getMaTour())>0)
                index = i+1;
        }
        list.add(index,a);
        GhiFile.ghi_Tour_Vao_File(list);
        return true;
    }
    
    public static boolean update(ArrayList<Tour> list, Tour a) throws IOException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaTour().equals(list.get(i).getMaTour())){
                index = i;
            }
        if(index != -1){
            list.set(index,a);
            GhiFile.ghi_Tour_Vao_File(list);
            return true;
        }
        return false;
        
    }
    
    public static boolean delete(ArrayList<Tour> list, Tour a) throws IOException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaTour().equals(list.get(i).getMaTour())){
                index = i;
            }
        if(index!=-1){
            list.remove(index);
            GhiFile.ghi_Tour_Vao_File(list);
            return true;
        }
        else
        return false;
    }
}
