package utils;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author vuvietan
 */
public class DateLib {

    public static String getDateSystem() {
        Date todayD = new Date(System.currentTimeMillis());
        SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
        String todayS = dayFormat.format(todayD.getTime());
        return todayS;
    }

}
