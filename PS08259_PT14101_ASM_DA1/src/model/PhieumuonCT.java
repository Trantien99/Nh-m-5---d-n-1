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
public class PhieumuonCT implements java.io.Serializable {

    private String maphieumuonct;
    private String masach;
    private String maphieumuon;

    public PhieumuonCT() {
    }

    public PhieumuonCT(String maphieumuonct, String masach, String maphieumuon) {
        this.maphieumuonct = maphieumuonct;
        this.masach = masach;
        this.maphieumuon = maphieumuon;
    }

    public String getMaphieumuonct() {
        return maphieumuonct;
    }

    public void setMaphieumuonct(String maphieumuonct) {
        this.maphieumuonct = maphieumuonct;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getMaphieumuon() {
        return maphieumuon;
    }

    public void setMaphieumuon(String maphieumuon) {
        this.maphieumuon = maphieumuon;
    }

}
