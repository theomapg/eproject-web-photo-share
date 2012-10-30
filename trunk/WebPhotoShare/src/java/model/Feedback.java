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
    private String questionF;
    private int accountId;
    private String answerF;
    private String dateCreate;
    private boolean status;
    private String username;

    private Connect conn;
    private PreparedStatement ps;
    private String sql;
    private Statement stmt;
    
    public Feedback() {
        conn = new Connect();
    }

    public Feedback(int feedbackId, String questionF, int accountId, String answerF, String dateCreate, boolean status) {
        this.feedbackId = feedbackId;
        this.questionF = questionF;
        this.accountId = accountId;
        this.answerF = answerF;
        this.dateCreate = dateCreate;
        this.status = status;
        conn = new Connect();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    
    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getQuestionF() {
        return questionF;
    }

    public void setQuestionF(String questionF) {
        this.questionF = questionF;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAnswerF() {
        return answerF;
    }

    public void setAnswerF(String answerF) {
        this.answerF = answerF;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

   
    
    public boolean insert(String questionF, int accountId, String answerF, String dateCreate, boolean status) {
        try {
            sql = "INSERT INTO FEEDBACK (QuestionF, AccountId, AnswerF, DateCreate, Status) VALUES(?,?,?,?,?)";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, questionF);
            ps.setObject(2, accountId);
            ps.setObject(3, answerF);
            ps.setObject(4, dateCreate);
            ps.setObject(5, status);
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

    public boolean update(int feedbackId, String questionF, int accountId, String answerF, String dateCreate, boolean status) {
        try {
            sql = "UPDATE  FEEDBACK SET QuestionF =?, AccountId =?, AnswerF =?, DateCreate =?, Status =? where FeedbackId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, questionF);
            ps.setObject(2, accountId);
            ps.setObject(3, answerF);
            ps.setObject(4, dateCreate);
            ps.setObject(5, status);
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
            sql = "SELECT FEEDBACK.*, ACCOUNT.UserName FROM   ACCOUNT INNER JOIN  FEEDBACK ON ACCOUNT.AccountId = FEEDBACK.AccountId";
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList arrLst = new ArrayList();
            if (rs != null) {
                int count = 0;
                while (rs.next()) {
                    count++;
                    Feedback f = new Feedback();
                    f.setFeedbackId(rs.getInt("FeedbackId"));
                    f.setQuestionF(rs.getString("QuestionF"));
                    f.setAccountId(rs.getInt("AccountId"));
                    f.setAnswerF(rs.getString("AnswerF"));
                    f.setDateCreate(rs.getDate("DateCreate").toString());
                    f.setStatus(rs.getBoolean("Status"));
                    f.setUsername(rs.getString("UserName"));
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
            sql = "SELECT FEEDBACK.*, ACCOUNT.UserName FROM   ACCOUNT INNER JOIN  FEEDBACK ON ACCOUNT.AccountId = FEEDBACK.AccountId where FeedbackId=?";
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
                    f.setQuestionF(rs.getString("QuestionF"));
                    f.setAccountId(rs.getInt("AccountId"));
                    f.setAnswerF(rs.getString("AnswerF"));
                    f.setDateCreate(rs.getDate("DateCreate").toString());
                    f.setStatus(rs.getBoolean("Status"));
                    f.setUsername(rs.getString("UserName"));
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
            sql = "SELECT FEEDBACK.*, ACCOUNT.UserName FROM ACCOUNT INNER JOIN  FEEDBACK ON ACCOUNT.AccountId = FEEDBACK.AccountId";
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
                    f.setQuestionF(rs.getString("QuestionF"));
                    f.setAccountId(rs.getInt("AccountId"));
                    f.setAnswerF(rs.getString("AnswerF"));
                    f.setDateCreate(rs.getDate("DateCreate").toString());
                    f.setStatus(rs.getBoolean("Status"));
                    f.setUsername(rs.getString("UserName"));
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
