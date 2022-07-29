/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author HUY PHAM
 */
public class Sach implements Serializable{
    private int ma;
    private String ten,tacGia,cn;
    private int namXb;
    private static int sma=10000;

    public Sach() {
    }

    public Sach(String ten, String tacGia, String cn, int namXb) throws TrongException {
        if(ten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ten = ten;
        this.tacGia = tacGia;
        this.cn = cn;
        this.namXb = namXb;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public int getNamXb() {
        return namXb;
    }

    public void setNamXb(int namXb) {
        this.namXb = namXb;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Sach.sma = sma;
    }

    
    public Object[] toObject(){
        return new Object[]{
            ma,ten,tacGia,cn,namXb
        };
    }
}
