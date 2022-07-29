/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TrongException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HUY PHAM
 */
public class QLSach implements Serializable{
    private Sach s;
    private KeSach ks;
    private int soLuong;
    private String tinhTrang;

    public QLSach() {
    }

    public QLSach(Sach mh, KeSach sv, int sl, String tt) {
        this.s = mh;
        this.ks = sv;
        this.soLuong = sl;
        this.tinhTrang =tt;
    }
    public String getMaVaTen(){
        String s = ks.getMa()+"\t"+ks.getTen();
        return s;
    }
    public Sach getS() {
        return s;
    }

    public void setS(Sach s) {
        this.s = s;
    }

    public KeSach getKs() {
        return ks;
    }

    public void setKs(KeSach ks) {
        this.ks = ks;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int sl) {
        this.soLuong = sl;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    
    
    
    public Object[] toObject(){
        return new Object[]{
            ks.getTen(),s.getTen(),soLuong,tinhTrang
        };
    }
}
