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
public class PhieumuonCTDao {

    public static List<PhieumuonCT> laydulieuPhieumuonCT(String ma) throws SQLException {
        List<PhieumuonCT> list = new ArrayList<>();
        String sql = "SELECT * FROM PHIEUMUONCT";
        if(ma.length()>0){
        sql+= " " + ma;
        }
        ResultSet rs = JdbcHelper.executeQuery(sql);
        while (rs.next()) {
            String maphieumuonct = rs.getString(1);
            String masach = rs.getString(2);
            String maphieumuon = rs.getString(3);
            PhieumuonCT pmct = new PhieumuonCT(maphieumuonct, masach, maphieumuon);
            list.add(pmct);
        }
        return list;
    }

    public static void themPhieumuonCT(PhieumuonCT object) {
        PhieumuonCT pmct = object;
        String sql = "INSERT INTO PHIEUMUONCT VALUES ('" + pmct.getMaphieumuonct()+ "','" + pmct.getMasach() + "','" + pmct.getMaphieumuon() + "')";
        JdbcHelper.executeUpdate(sql);
    }

    public static void capnhatPhieumuonCT(PhieumuonCT object) {
        PhieumuonCT pmct = object;
        String sql = "UPDATE PHIEUMUONCT SET masach = ?,maphieumuon = ? WHERE maphieumuonct = ?";
        JdbcHelper.executeUpdate(sql, pmct.getMasach(), pmct.getMaphieumuon(), pmct.getMaphieumuonct());
    }

    public static void xoaPhieumuonCT(String maphieumuonct) {
        String sql = "DELETE FROM PHIEUMUONCT WHERE maphieumuonct = ?";
        JdbcHelper.executeUpdate(sql, maphieumuonct);
    }
}
