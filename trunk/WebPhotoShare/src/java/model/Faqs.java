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
public class Faqs {
    private int faqsId;
    private String title;
    private String question;
    private String answer;
    private String dateCreate;

    private Connect conn;
    private PreparedStatement ps;
    private String sql;
    private Statement stmt;

    
    public Faqs() {
        conn = new Connect();
    }

    public Faqs(int faqsId, String title, String question, String answer, String dateCreate) {
        this.faqsId = faqsId;
        this.title = title;
        this.question = question;
        this.answer = answer;
        this.dateCreate = dateCreate;
        conn = new Connect();
    }
    
    public int getFaqsId() {
        return faqsId;
    }

    public void setFaqsId(int faqsId) {
        this.faqsId = faqsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    
    
        public boolean insert(String title, String question, String answer, String dateCreate) {
        try {
            sql = "INSERT INTO FAQS (Title, Question, Answer, DateCreate) VALUES(?,?,?,?)";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, title);
            ps.setObject(2, question);
            ps.setObject(3, answer);
            ps.setObject(4, dateCreate);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Faqs.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            conn.closeConn();
        }
    }

    public boolean update(int faqsId, String title, String question, String answer, String dateCreate) {
        try {
            sql = "UPDATE FAQS SET Title =?, Question =?, Answer =?, DateCreate =? where FaqsId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, title);
            ps.setObject(2, question);
            ps.setObject(3, answer);
            ps.setObject(4, dateCreate);
            ps.setObject(5, faqsId);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Faqs.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            conn.closeConn();
        }
    }

    public boolean delete(int faqsId) {
        try {
            sql = "DELETE FROM FAQS where FaqsId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, faqsId);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Faqs.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            conn.closeConn();
        }
    }

    public ArrayList getAll() {
        try {
            stmt = conn.getConn().createStatement();
            sql = "SELECT * FROM FAQS";
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList arrLst = new ArrayList();
            if (rs != null) {
                int count = 0;
                while (rs.next()) {
                    count++;
                    Faqs f = new Faqs();
                    f.setFaqsId(rs.getInt("FaqsId"));
                    f.setTitle(rs.getString("Title"));
                    f.setQuestion(rs.getString("Question"));
                    f.setAnswer(rs.getString("Answer"));
                    f.setQuestion(rs.getString("Question"));
                    f.setDateCreate(rs.getDate("dateCreate").toString());
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
            Logger.getLogger(Faqs.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }
    }

    public Faqs getById(int faqsId) {
        try {
            sql = "SELECT * from FAQS where FaqsId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, faqsId);
            ResultSet rs = ps.executeQuery();
            ArrayList arrLst = new ArrayList();
            if (rs != null) {
                int count = 0;
                while (rs.next()) {
                    count++;
                    Faqs f = new Faqs();
                    f.setFaqsId(rs.getInt("FaqsId"));
                    f.setTitle(rs.getString("Title"));
                    f.setQuestion(rs.getString("Question"));
                    f.setAnswer(rs.getString("Answer"));
                    f.setQuestion(rs.getString("Question"));
                    f.setDateCreate(rs.getDate("dateCreate").toString());
                    arrLst.add(f);
                }
                if (count > 0) {
                    return (Faqs) arrLst.get(0);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Faqs.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }
    }

    public ArrayList search(Hashtable htb) {
        try {
            sql = "SELECT * from FAQS";
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
                    Faqs f = new Faqs();
                    f.setFaqsId(rs.getInt("FaqsId"));
                    f.setTitle(rs.getString("Title"));
                    f.setQuestion(rs.getString("Question"));
                    f.setAnswer(rs.getString("Answer"));
                    f.setQuestion(rs.getString("Question"));
                    f.setDateCreate(rs.getDate("dateCreate").toString());
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
            Logger.getLogger(Faqs.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }
    }
}
