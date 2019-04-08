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
public class Thongke {

    private String luotmuon;
    private String tensach;
    private String tacgia;
    private String theloai;
    private String ngaythang;
    private String nam;

    public Thongke(String luotmuon, String tensach, String tacgia, String theloai, String ngaythang, String nam) {
        this.luotmuon = luotmuon;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.theloai = theloai;
        this.ngaythang = ngaythang;
        this.nam = nam;
    }

    public String getLuotmuon() {
        return luotmuon;
    }

    public void setLuotmuon(String luotmuon) {
        this.luotmuon = luotmuon;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getNgaythang() {
        return ngaythang;
    }

    public void setNgaythang(String ngaythang) {
        this.ngaythang = ngaythang;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    

}
