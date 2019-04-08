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
public class Phieuphat {

    private String mapp;
    private String mapm;
    private String songayhethan;
    private String tienphat;
    private String trangthai;

    public Phieuphat(String mapp, String mapm, String songayhethan, String tienphat, String trangthai) {
        this.mapp = mapp;
        this.mapm = mapm;
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

    public String getMapm() {
        return mapm;
    }

    public void setMapm(String mapm) {
        this.mapm = mapm;
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
