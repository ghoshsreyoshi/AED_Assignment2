/*
 * 
o change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UberCarManagement;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

 /*
 * @author sreyoshighosh
 */
public class CarDetails {
      
    private ArrayList<UberCar> selectcar;
    private ArrayList<UberCar> manufacturelist;

    public ArrayList<UberCar> getManufacturelist() {
        return manufacturelist;
    }

    public void setManufacturelist(ArrayList<UberCar> manufacturelist) {
        this.manufacturelist = manufacturelist;
    }
    public CarDetails(){
        this.selectcar = new ArrayList<>();         
    }
    
    public ArrayList<UberCar> getSelectcar() {
        return selectcar;
    }
    
    public void setSelectcar(ArrayList<UberCar> selectcar) {
        this.selectcar = selectcar;
    } 

 public UberCar addcar(){
     UberCar car = new UberCar();
     selectcar.add(car);
     return car;
 }  
 
 public void deletecar(UberCar car){
     selectcar.remove(car);
 }
  
 public ArrayList<UberCar> getmanufacturelist(int manufactured_year){
      ArrayList<UberCar> mgmanuc = new ArrayList<>();
     for(UberCar car : selectcar){
            if(car.getManufacture()== manufactured_year){
                mgmanuc.add(car);
 }
     }
return mgmanuc;
 } 
 
  public ArrayList<UberCar> getsrlist(int serial_num){
      ArrayList<UberCar> mglist = new ArrayList<>();
     for(UberCar car : selectcar){
            if(car.getSrnumber()== serial_num){
                mglist.add(car);
 }
     }
return mglist;
 }
 
     public ArrayList<UberCar> getbrndlist(String brand){
      ArrayList<UberCar> brandlist = new ArrayList<>();
     for(UberCar car : selectcar){
            if(car.getBrand().equals(brand)){
                brandlist.add(car);
 }
     }
return brandlist;
 }
     
     public ArrayList<UberCar> getmodel(String model_number){
      ArrayList<UberCar> modlist = new ArrayList<>();
     for(UberCar car : selectcar){
            if(car.getModnumber().equals(model_number)){
                modlist.add(car);
 }
     }
return modlist;
 }
     
     public ArrayList<UberCar> getmntcertif(){         
         ArrayList<UberCar> mtlist = new ArrayList<>();
         for(UberCar car: selectcar){
             if(car.isMaintcert() == false)
                 mtlist.add(car);
         }
return mtlist;
     }    
    
   public ArrayList<UberCar> getAvailCars(String availble_city){
       ArrayList<UberCar> avblcity = new ArrayList<>();
       for(UberCar car: selectcar){
           if(car.getCityAvailable().equals(availble_city) && car.isAvailable()==true)
               avblcity.add(car);           
       }
return avblcity;
   }
    
       public ArrayList<UberCar> gettotavail(){
               ArrayList<UberCar> totavail = new ArrayList<>();              
               for(UberCar car: selectcar){
                   if(car.isAvailable()==true)
                       totavail.add(car);                                                        
        }
return totavail;                     
}
              
        public ArrayList<UberCar> gettotunavail(){
               ArrayList<UberCar> totunavail = new ArrayList<>();              
               for(UberCar car: selectcar){
                   if(car.isAvailable()==false)
                       totunavail.add(car);                                                        
               }
return totunavail;       
}

        public ArrayList<UberCar> getfirstavail(){
        ArrayList<UberCar> fstavailable=new ArrayList<>();        
        for(UberCar car: selectcar){
            if(car.isAvailable()==true){
                fstavailable.add(car);
                break;
            }
        }
return fstavailable;
        }        
        
        public ArrayList<UberCar> getmaxindetail(int max_seats, int min_seats){
            ArrayList<UberCar> mxmnlist = new ArrayList<>();
            for(UberCar car : selectcar){
                if(car.getMaxseats()<=max_seats && car.getMinseats()>=min_seats){
                mxmnlist.add(car);
            }
            }  
return mxmnlist;
        }
       
       public ArrayList<String> getall(){
           ArrayList<String> albrand = new ArrayList<>();
           for(UberCar car: selectcar){               
               if(car.getBrand()!="")
               albrand.add(car.getBrand());
           }
return albrand;
       }
}