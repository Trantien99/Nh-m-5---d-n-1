/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author My PC
 */
public class Phieunhapsach implements java.io.Serializable{
    
    private String maphieunhap;
    private String masach;
    private int soluong;
    private String ngaynhap;
    private String gia;
    private String manv;
    
    public Phieunhapsach(){}
    
    public Phieunhapsach(String maphieunhap, String masach, int soluong, String ngaynhap, String gia, String manv) {
        this.maphieunhap = maphieunhap;
        this.masach = masach;
        this.soluong = soluong;
        this.ngaynhap = ngaynhap;
        this.gia = gia;
        this.manv = manv;
    }

    public String getMaphieunhap() {
        return maphieunhap;
    }

    public void setMaphieunhap(String maphieunhap) {
        this.maphieunhap = maphieunhap;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }
    
    
    
}
