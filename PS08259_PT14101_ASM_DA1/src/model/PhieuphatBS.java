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
public class PhieuphatBS implements java.io.Serializable {
    private String mapp;
    private String maphieumuon;
    private String madg;
    private String ngaytra;
    private String songayhethan;
    private String tienphat;
    private String trangthai;

    public PhieuphatBS() {
    }

    public PhieuphatBS(String mapp, String maphieumuon, String madg, String ngaytra, String songayhethan, String tienphat, String trangthai) {
        this.mapp = mapp;
        this.maphieumuon = maphieumuon;
        this.madg = madg;
        this.ngaytra = ngaytra;
        this.songayhethan = songayhethan;
        this.tienphat = tienphat;
        this.trangthai = trangthai;
    }

    public String getMapp() {
        return mapp;
    }

    public void setMapp(String mapp) {
        this.mapp = mapp;
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

    public String getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(String ngaytra) {
        this.ngaytra = ngaytra;
    }

    public String getSongayhethan() {
        return songayhethan;
    }

    public void setSongayhethan(String songayhethan) {
        this.songayhethan = songayhethan;
    }

    public String getTienphat() {
        return tienphat;
    }

    public void setTienphat(String tienphat) {
        this.tienphat = tienphat;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    

}
