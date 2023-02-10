/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hypermarket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.* ;
import javax.swing.JOptionPane;

public class Products extends Create{
    private double price , discount, offer_price;
    private int quantity , minquant ;
    private String EX_date ;
    Date date = new Date();
    public static long counter = 0 ;
    
    database db = new database();
    
    public Products(){
        
    }
    
    public Products(int id, String name, double price, int quant, int minQuant, String Ex_Date){
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setQuantity(quant);
        this.setMinquant(minQuant);
        this.setEX_date(Ex_Date);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setMinquant(int minquant) {
        this.minquant = minquant;
    }

    public void setEX_date(String EX_date) {
        this.EX_date = EX_date;
    }

    public void setDiscount(double discount){
        this.discount = (discount * this.price) / 100;
    }
    
    public void setOffer_price(double offer_price) {
        this.offer_price = offer_price;
    }
    
    public double getDiscount(){
        return discount;
    }

    public double getOffer_price() {
        return offer_price;
    }
    
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMinquant() {
        return minquant;
    }

    public String getEX_date() {
        return EX_date;
    }
    
    // Has to be modified
    /*public boolean IsExpired(Products p){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd") ;
        LocalDateTime now = LocalDateTime.now();
        String today_day = dtf.format(now);
        if (today_day.equals(p.getEX_date())) {
            return true;
        }
        return false;
    }*/

    public int getId() {
        return id;
    }
}
