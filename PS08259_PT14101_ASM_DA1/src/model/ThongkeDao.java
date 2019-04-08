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
public class ThongkeDao {

    public static List<Thongke> thongketongluotmuon() throws SQLException {
        List<Thongke> list = new ArrayList<>();
        String sql = "Select COUNT(pmct.maphieumuonct) as luotmuon,s.tensach,tg.tentacgia ,tl.tentl from SACH s,PHIEUMUONCT pmct, THELOAI tl,TACGIA tg\n"
                + "where pmct.masach = s.masach and s.matl = tl.matl and s.matacgia = tg.matacgia\n"
                + "group by s.tensach ,s.masach,tl.tentl ,tg.tentacgia\n"
                + "order by luotmuon DESC";
        ResultSet rs = JdbcHelper.executeQuery(sql);
        while (rs.next()) {
            String luotmuon = rs.getString(1);
            String tensach = rs.getString(2);
            String tacgia = rs.getString(3);
            String theloai = rs.getString(4);
            String ngaythang = "";
            String nam = "";
            Thongke tk = new Thongke(luotmuon, tensach, tacgia, theloai, ngaythang, nam);
            list.add(tk);
        }
        return list;
    }

    public static List<Thongke> thongkeluotmuontheongay(String ma) throws SQLException {
        List<Thongke> list = new ArrayList<>();
        String sql = "Select COUNT(pmct.maphieumuonct) as luotmuon,s.tensach,tg.tentacgia,tl.tentl,pm.ngaymuon from SACH s,PHIEUMUONCT pmct ,PHIEUMUON pm, THELOAI tl,TACGIA tg\n"
                + "where pmct.masach = s.masach and pm.maphieumuon = pmct.maphieumuon and s.matl = tl.matl and s.matacgia = tg.matacgia \n"
                + "group by s.tensach ,pm.ngaymuon ,tl.tentl ,tg.tentacgia\n"
                + "order by luotmuon DESC";
        if(ma.length()>0){
        sql = "Select COUNT(pmct.maphieumuonct) as luotmuon,s.tensach,tg.tentacgia,tl.tentl,pm.ngaymuon from SACH s,PHIEUMUONCT pmct ,PHIEUMUON pm, THELOAI tl,TACGIA tg\n"
                + "where pmct.masach = s.masach and pm.maphieumuon = pmct.maphieumuon and s.matl = tl.matl and s.matacgia = tg.matacgia and pm.ngaymuon = '" +ma+ "'\n"
                + "group by s.tensach ,pm.ngaymuon ,tl.tentl ,tg.tentacgia\n"
                + "order by luotmuon DESC";
        }
        ResultSet rs = JdbcHelper.executeQuery(sql);
        while (rs.next()) {
            String luotmuon = rs.getString(1);
            String tensach = rs.getString(2);
            String tacgia = rs.getString(3);
            String theloai = rs.getString(4);
            String ngaythang = rs.getString(5);
            String nam = "";
            Thongke tk = new Thongke(luotmuon, tensach, tacgia, theloai, ngaythang, nam);
            list.add(tk);
        }
        return list;
    }

    public static List<Thongke> thongkeluotmuontheothang(String ma1, String ma2) throws SQLException {
        List<Thongke> list = new ArrayList<>();
        String sql = "Select COUNT(pmct.maphieumuonct) as luotmuon,s.tensach,tg.tentacgia,tl.tentl,month(pm.ngaymuon) as thang , year(pm.ngaymuon)as nam from SACH s,PHIEUMUONCT pmct ,PHIEUMUON pm, THELOAI tl,TACGIA tg\n"
                + "where pmct.masach = s.masach and pm.maphieumuon = pmct.maphieumuon and s.matl = tl.matl and s.matacgia = tg.matacgia\n"
                + "group by s.tensach,month(pm.ngaymuon), year(pm.ngaymuon),tl.tentl ,tg.tentacgia\n"
                + "order by luotmuon DESC";
        if(ma1.length()>0 && ma2.length() >0){
        sql = "Select COUNT(pmct.maphieumuonct) as luotmuon,s.tensach,tg.tentacgia,tl.tentl,month(pm.ngaymuon) as thang , year(pm.ngaymuon)as nam from SACH s,PHIEUMUONCT pmct ,PHIEUMUON pm, THELOAI tl,TACGIA tg\n"
                + "where pmct.masach = s.masach and pm.maphieumuon = pmct.maphieumuon and s.matl = tl.matl and s.matacgia = tg.matacgia and month(pm.ngaymuon) = '" + ma1 + "' and year(pm.ngaymuon) = '" + ma2 + "'\n"
                + "group by s.tensach,month(pm.ngaymuon), year(pm.ngaymuon),tl.tentl ,tg.tentacgia \n"
                + "order by luotmuon DESC";
        }
        ResultSet rs = JdbcHelper.executeQuery(sql);
        while (rs.next()) {
            String luotmuon = rs.getString(1);
            String tensach = rs.getString(2);
            String tacgia = rs.getString(3);
            String theloai = rs.getString(4);
            String ngaythang = rs.getString(5);
            String nam = rs.getString(6);
            Thongke tk = new Thongke(luotmuon, tensach, tacgia, theloai, ngaythang, nam);
            list.add(tk);
        }
        return list;
    }

    public static List<Thongke> thongkeluotmuontheonam(String ma) throws SQLException {
        List<Thongke> list = new ArrayList<>();
        String sql = "Select COUNT(pmct.maphieumuonct) as luotmuon,s.tensach,tg.tentacgia,tl.tentl, year(pm.ngaymuon)as nam from SACH s,PHIEUMUONCT pmct ,PHIEUMUON pm, THELOAI tl,TACGIA tg\n"
                + "where pmct.masach = s.masach and pm.maphieumuon = pmct.maphieumuon and s.matl = tl.matl and s.matacgia = tg.matacgia\n"
                + "group by s.tensach, year(pm.ngaymuon),tl.tentl,tg.tentacgia\n"
                + "order by luotmuon DESC";
        if(ma.length()>0){
        sql = "Select COUNT(pmct.maphieumuonct) as luotmuon,s.tensach,tg.tentacgia,tl.tentl, year(pm.ngaymuon)as nam from SACH s,PHIEUMUONCT pmct ,PHIEUMUON pm, THELOAI tl,TACGIA tg\n"
                + "where pmct.masach = s.masach and pm.maphieumuon = pmct.maphieumuon and s.matl = tl.matl and s.matacgia = tg.matacgia and year(pm.ngaymuon) = '" + ma + "'\n"
                + "group by s.tensach, year(pm.ngaymuon),tl.tentl,tg.tentacgia\n"
                + "order by luotmuon DESC";
        }
        ResultSet rs = JdbcHelper.executeQuery(sql);
        while (rs.next()) {
            String luotmuon = rs.getString(1);
            String tensach = rs.getString(2);
            String tacgia = rs.getString(3);
            String theloai = rs.getString(4);
            String nam = rs.getString(5);
            String ngaythang = "";
            Thongke tk = new Thongke(luotmuon, tensach, tacgia, theloai, ngaythang, nam);
            list.add(tk);
        }
        return list;
    }
}
