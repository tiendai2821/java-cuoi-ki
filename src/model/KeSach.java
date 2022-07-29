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
public class KeSach implements Serializable {
    private int ma;
    private String ten, loai;
    int soLuong;
    private static int sma=100;

    public KeSach() {
    }

    public KeSach(String ten, String loai, int soLuong) throws TrongException {
        if(ten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ten = ten;
        this.loai = loai;
        this.soLuong = soLuong;
    }

    public KeSach(int ma, String ten, String loai, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.soLuong = soLuong;
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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KeSach.sma = sma;
    }
    
    
    public Object[] toObject(){
        return new Object[]{
           ma,ten,loai,soLuong
        };
    }
}
