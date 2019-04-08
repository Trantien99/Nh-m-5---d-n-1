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
public class PhieunhapsachDao {

    public static List<Phieunhapsach> laydulieuPhieunhap(String ma) throws SQLException {
        List<Phieunhapsach> list = new ArrayList<>();
        String sql = "SELECT * FROM PHIEUNHAPSACH";
        if(ma.length()>0){
        sql+= " " + ma;
        }
        ResultSet rs = JdbcHelper.executeQuery(sql);
        while (rs.next()) {
            String maphieunhap = rs.getString(1);
            String masach = rs.getString(2);
            String soluong = rs.getString(3);
            String ngaynhap = rs.getString(4);
            int gia = rs.getInt(5);
            String manv = rs.getString(6);
            int sl = Integer.parseInt(soluong);
            String gia1 = Integer.toString(gia);
            Phieunhapsach pn = new Phieunhapsach(maphieunhap, masach, sl, ngaynhap, gia1, manv);
            list.add(pn);
        }
        return list;
    }

    public static void themPhieunhap(Phieunhapsach object) {
        Phieunhapsach pn = object;
        String sql = "INSERT INTO PHIEUNHAPSACH VALUES ('" + pn.getMaphieunhap() + "','" + pn.getMasach() + "'," + pn.getSoluong() + ",'" + pn.getNgaynhap() + "'," + pn.getGia() + ",'" + pn.getManv() + "')";
        JdbcHelper.executeUpdate(sql);
    }

    public static void capnhatPhieunhap(Phieunhapsach object) {
        Phieunhapsach pn = object;
        String sql = "UPDATE PHIEUNHAPSACH SET masach = ?,soluong = ?,ngaynhap = ?,gia = ?,manv = ? WHERE maphieunhap = ?";
        JdbcHelper.executeUpdate(sql, pn.getMasach(), pn.getSoluong(), pn.getNgaynhap(), pn.getGia(), pn.getManv(), pn.getMaphieunhap());
    }

    public static void xoaPhieunhap(String maphieunhap) {
        String sql = "DELETE FROM PHIEUNHAPSACH WHERE maphieunhap = ?";
        JdbcHelper.executeUpdate(sql, maphieunhap);
    }
}
