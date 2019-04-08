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
public class Phieumuon implements java.io.Serializable {

    private String maphieumuon;
    private String madg;
    private String manv;
    private String ngaymuon;
    private String ngaytra;
    private int trangthai;

    public Phieumuon() {
    }

    public Phieumuon(String maphieumuon, String madg, String manv, String ngaymuon, String ngaytra, int trangthai) {
        this.maphieumuon = maphieumuon;
        this.madg = madg;
        this.manv = manv;
        this.ngaymuon = ngaymuon;
        this.ngaytra = ngaytra;
        this.trangthai = trangthai;
    }

    public String getMaphieumuon() {
        return maphieumuon;
    }

    public void setMaphieumuon(String maphieumuon) {
        this.maphieumuon = maphieumuon;
    }

    public String getMadg() {
        return madg;
    }

    public void setMadg(String madg) {
        this.madg = madg;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public String getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(String ngaytra) {
        this.ngaytra = ngaytra;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

}
