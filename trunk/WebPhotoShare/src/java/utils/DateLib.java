package utils;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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

    public static String getDay(String d) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
 
        try {
            Date today = df.parse(d);
            return today.getDate()+1900+"";
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static String getMonth(String d) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
 
        try {
            Date today = df.parse(d);
            return today.getMonth()+1+"";
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static String getYear(String d) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
 
        try {
            Date today = df.parse(d);
            return today.getYear()+1900+"";
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(DateLib.getDay("1999-10-15"));
    }
}
