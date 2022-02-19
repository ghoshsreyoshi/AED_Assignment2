/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UberCarManagement;

import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author sreyoshighosh
 */
    public class UberCar {

    public static void setMinseats(JTextField txtminseat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String brand;
    private String modnumber;
    private int minseats;
    private int maxseats;
    private int srnumber;    
    private int manufacture;
    private String CityAvailable;
    private boolean maintcert;
    private boolean available;        
    private Date UpdatedOn;

    public Date getUpdatedOn() {
        return UpdatedOn;
    }

   public UberCar(boolean available, String brand, int yearmanufact, int minseatno, int maxseatno, int serialnumber, String modelnumber, String caravailability, boolean maintcerti) {
        this.available = available;
        this.brand = brand;
        this.manufacture = yearmanufact;
        this.minseats = minseatno;
        this.maxseats = maxseatno;
        this.srnumber = serialnumber;
        this.modnumber = modelnumber;
        this.CityAvailable = caravailability;
        this.maintcert = maintcerti;
        this.UpdatedOn=new Date();
                
    }

    public UberCar(){
        this.UpdatedOn=new Date();
    }
    
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getManufacture() {
        return manufacture;
    }

    public void setManufacture(int manufacture) {
        this.manufacture = manufacture;
    }

    public int getMinseats() {
        return minseats;
    }

    public void setMinseats(int minseats) {
        this.minseats = minseats;
    }

    public int getMaxseats() {
        return maxseats;
    }

    public void setMaxseats(int maxseats) {
        this.maxseats = maxseats;
    }

    public int getSrnumber() {
        return srnumber;
    }

    public void setSrnumber(int srnumber) {
        this.srnumber = srnumber;
    }

    public String getModnumber() {
        return modnumber;
    }

    public void setModnumber(String modnumber) {
        this.modnumber = modnumber;
    }

    public String getCityAvailable() {
        return CityAvailable;
    }

    public void setCityAvailable(String CityAvailable) {
        this.CityAvailable = CityAvailable;
    }

    public boolean isMaintcert() {
        return maintcert;
    }

    public void setMaintcert(boolean maintcert) {
        this.maintcert = maintcert;
    }
    
    @Override
    public String toString(){
       return String.valueOf(this.brand);
    }
    
}
