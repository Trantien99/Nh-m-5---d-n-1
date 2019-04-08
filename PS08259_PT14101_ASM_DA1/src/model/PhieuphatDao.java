/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbchelp.JdbcHelper;

/**
 *
 * @author My PC
 */
public class PhieuphatDao {

    public static void capnhatttPP() throws SQLException {
        String sql = "SELECT maphieumuon, (-DATEDIFF(day, GETDATE() , ngaytra)) as songayhethan FROM PHIEUMUON WHERE ngaytra < GETDATE() and trangthai = 1";
        ResultSet rs = JdbcHelper.executeQuery(sql);
        while (rs.next()) {
            List<Phieuphat> listpp = new ArrayList<>();
            listpp = PhieuphatDao.layttPhieuphat("");
            String mapp = null;
            int a;
            AD:
            for (int i = 1; i < 5000; i++) {
                a = i;
                String b = Integer.toString(a);
                if (b.length() == 1) {
                    mapp = "PP00" + a;
                } else if (b.length() == 2) {
                    mapp = "PP0" + a;
                } else if (b.length() > 2) {
                    mapp = "PP" + a;
                } else {
                }
                boolean khIsExixst = false;
                for (Phieuphat pp : listpp) {
                    if (pp.getMapp().equals(mapp)) {
                        khIsExixst = true;
                        break;
                    }
                }
                if (!khIsExixst) {
                    break;
                }
            }
            String maphieumuon = rs.getString(1);
            String songayhethan = rs.getString(2);
            int ngayhh = Integer.parseInt(songayhethan);
            boolean ckmadg = false;
            for (Phieuphat pp : listpp) {
                if (pp.getMapm().equals(maphieumuon)) {
                    ckmadg = true;
                    break;
                }
            }
            if (!ckmadg) {
                String tienphat = (ngayhh * 1000) + "";
                String tt = "1";
                String sql0 = "INSERT INTO PHIEUPHAT VALUES('" + mapp + "','" + maphieumuon + "'," + songayhethan + "," + tienphat + "," + tt + ")";
                JdbcHelper.executeUpdate(sql0);
            }

        }

    }

    public static List<Phieuphat> layttPhieuphat(String ma) throws SQLException {
        List<Phieuphat> listpp = new ArrayList<>();
        String sql = "SELECT* FROM PHIEUPHAT";
        if(ma.length()>0){
        sql+= " " + ma;
        }
        ResultSet rs = JdbcHelper.executeQuery(sql);
        while (rs.next()) {
            String mapp = rs.getString(1);
            String maphieumuon = rs.getString(2);
            String songayhh = rs.getString(3);
            String tienphat = rs.getString(4);
            String trangthai = rs.getString(5);
            Phieuphat pp = new Phieuphat(mapp, maphieumuon, songayhh, tienphat, trangthai);
            listpp.add(pp);
        }
        return listpp;

    }

    public static List<PhieuphatBS> layttPhieuphatCT(String ma) throws SQLException {
        List<PhieuphatBS> listpp = new ArrayList<>();
        String sql = "SELECT p.mapp,p.mapm, m.madg,CONVERT(varchar,m.ngaytra,103) as ngayhethan, (-DATEDIFF(day, GETDATE() , m.ngaytra)) as songayhethan ,  p.tienphat,p.trangthai  FROM PHIEUMUON m ,PHIEUPHAT p\n"
                + "where m.maphieumuon = p.mapm";
        if(ma.length()>0){
        sql+= " " + ma;
        }
        ResultSet rs = JdbcHelper.executeQuery(sql);
        while (rs.next()) {
            String mapp = rs.getString(1);
            String maphieumuon = rs.getString(2);
            String madg = rs.getString(3);
            String ngayhh = rs.getString(4);
            String songayhh = rs.getString(5);
            String tienphat = rs.getString(6);
            String trangthai = rs.getString(7);
            PhieuphatBS pp = new PhieuphatBS(mapp, maphieumuon, madg, ngayhh, songayhh, tienphat, trangthai);
            listpp.add(pp);
        }
        return listpp;

    }
    
    public static void suaPhieuphat(String mapp,String tt) {
        String sql = "UPDATE PHIEUPHAT SET trangthai = "+tt+" WHERE mapp ='"+mapp+"'";
        JdbcHelper.executeUpdate(sql);

    }
    
    public static void xoaPhieuphat(String mapm) {
        String sql = "DELETE PHIEUPHAT WHERE mapm ='"+mapm+"'";
        JdbcHelper.executeUpdate(sql);

    }
    

}
