/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author an
 */
public class Feedback {
    private int feedbackId;
    private String title;
    private int accountId;
    private String description;
    private String dateCreate;
    private int titleId;

    private Connect conn;
    private PreparedStatement ps;
    private String sql;
    private Statement stmt;
    
    public Feedback() {
        conn = new Connect();
    }

    public Feedback(int feedbackId, String title, int accountId, String description, String dateCreate, int titleId) {
        this.feedbackId = feedbackId;
        this.title = title;
        this.accountId = accountId;
        this.description = description;
        this.dateCreate = dateCreate;
        this.titleId = titleId;
        conn = new Connect();
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }
    
    public boolean insert(String title, int accountId, String description, String dateCreate, int titleId) {
        try {
            sql = "INSERT INTO FEEDBACK (Title, AccountId, Description, DateCreate, TitleId) VALUES(?,?,?,?,?)";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, title);
            ps.setObject(2, accountId);
            ps.setObject(3, description);
            ps.setObject(4, dateCreate);
            ps.setObject(5, titleId);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Feedback.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            conn.closeConn();
        }
    }

    public boolean update(int feedbackId, String title, int accountId, String description, String dateCreate, int titleId) {
        try {
            sql = "UPDATE  FEEDBACK SET Title =?, AccountId =?, Description =?, DateCreate =?, TitleId =? where FeedbackId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, title);
            ps.setObject(2, accountId);
            ps.setObject(3, description);
            ps.setObject(4, dateCreate);
            ps.setObject(5, titleId);
            ps.setObject(6, feedbackId);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Feedback.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            conn.closeConn();
        }
    }

    public boolean delete(int feedbackId) {
        try {
            sql = "delete from FEEDBACK where FeedbackId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setInt(1, feedbackId);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Feedback.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            conn.closeConn();
        }
    }

    public ArrayList getAll() {
        try {
            stmt = conn.getConn().createStatement();
            sql = "SELECT * from FEEDBACK";
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList arrLst = new ArrayList();
            if (rs != null) {
                int count = 0;
                while (rs.next()) {
                    count++;
                    Feedback f = new Feedback();
                    f.setFeedbackId(rs.getInt("FeedbackId"));
                    f.setTitle(rs.getString("Title"));
                    f.setAccountId(rs.getInt("AccountId"));
                    f.setDescription(rs.getString("Description"));
                    f.setDateCreate(rs.getDate("DateCreate").toString());
                    f.setTitleId(rs.getInt("TitleId"));
                    arrLst.add(f);
                }
                if (count > 0) {
                    return arrLst;
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Feedback.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }

    }

    public Feedback getById(int feedbackId) {
        try {
            sql = "SELECT * from FEEDBACK where FeedbackId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, feedbackId);
            ResultSet rs = ps.executeQuery();
            ArrayList arrLst = new ArrayList();
            if (rs != null) {
                int count = 0;
                while (rs.next()) {
                    count++;
                    Feedback f = new Feedback();
                    f.setFeedbackId(rs.getInt("FeedbackId"));
                    f.setTitle(rs.getString("Title"));
                    f.setAccountId(rs.getInt("AccountId"));
                    f.setDescription(rs.getString("Description"));
                    f.setDateCreate(rs.getDate("DateCreate").toString());
                    f.setTitleId(rs.getInt("TitleId"));
                    arrLst.add(f);
                }
                if (count > 0) {
                    return (Feedback) arrLst.get(0);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Feedback.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }
    }

    public ArrayList search(Hashtable htb) {
        try {
            sql = "SELECT * from FEEDBACK";
            Set set = htb.entrySet();
            Iterator it = set.iterator();

            Set setTemp = htb.entrySet();
            Iterator itTemp = setTemp.iterator();
            ResultSet rs = null;
            if (htb.size() == 0) {
                stmt = conn.getConn().createStatement();
                rs = stmt.executeQuery(sql);
            } else if (htb.size() == 1) {
                sql += " where ";
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    sql += entry.getKey() + " = ? ";
                }
                ps = conn.getConn().prepareStatement(sql);
                System.out.println(sql);
                int i = 0;
                while (itTemp.hasNext()) {
                    i++;
                    Map.Entry entry = (Map.Entry) itTemp.next();
                    ps.setObject(i, entry.getValue());
                }
                rs = ps.executeQuery();
            } else if (htb.size() > 1) {
                sql += " where ";
                int count = htb.size();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    count--;
                    if (count == 0) {
                        sql += entry.getKey() + "=? ";
                    } else {
                        sql += entry.getKey() + "=? and ";
                    }
                }
                ps = conn.getConn().prepareStatement(sql);
                System.out.println(sql);
                int i = 0;
                while (itTemp.hasNext()) {
                    i++;
                    Map.Entry entry = (Map.Entry) itTemp.next();
                    ps.setObject(i, entry.getValue());
                }
                rs = ps.executeQuery();
            }

            ArrayList arrLst = new ArrayList();
            if (rs != null) {
                int count = 0;
                while (rs.next()) {
                    count++;
                    Feedback f = new Feedback();
                    f.setFeedbackId(rs.getInt("FeedbackId"));
                    f.setTitle(rs.getString("Title"));
                    f.setAccountId(rs.getInt("AccountId"));
                    f.setDescription(rs.getString("Description"));
                    f.setDateCreate(rs.getDate("DateCreate").toString());
                    f.setTitleId(rs.getInt("TitleId"));
                    arrLst.add(f);
                }
                if (count > 0) {
                    return arrLst;
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Feedback.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }
    }
    
    
    
}
