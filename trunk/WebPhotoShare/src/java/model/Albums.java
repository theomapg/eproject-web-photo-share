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
public class Albums {

    private Connect conn;
    private PreparedStatement ps;
    private String sql;
    private Statement stmt;
    private int albumsId;
    private String albumsName;
    private String description;
    private String dateCreate;
    private int cateId;
    private int accountId;

    public Albums() {
        conn = new Connect();
    }

    public Albums(int albumsId, String albumsName, String description, String dateCreate, int cateId, int accountId) {
        this.albumsId = albumsId;
        this.albumsName = albumsName;
        this.description = description;
        this.dateCreate = dateCreate;
        this.cateId = cateId;
        this.accountId = accountId;
        conn = new Connect();
    }

    public int getAlbumsId() {
        return albumsId;
    }

    public void setAlbumsId(int albumsId) {
        this.albumsId = albumsId;
    }

    public String getAlbumsName() {
        return albumsName;
    }

    public void setAlbumsName(String albumsName) {
        this.albumsName = albumsName;
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

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public boolean insert(String albumsName, String description, String dateCreate, int cateId, int accountId) {
        try {
            sql = "INSERT INTO ALBUMS (AlbumsName, Description, DateCreate, CateId, AccountId) VALUES(?,?,?,?,?)";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, albumsName);
            ps.setObject(2, description);
            ps.setObject(3, dateCreate);
            ps.setObject(4, cateId);
            ps.setObject(5, accountId);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Albums.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            conn.closeConn();
        }
    }

    public boolean update(int albumsId, String albumsName, String description, String dateCreate, int cateId, int accountId) {
        try {
            sql = "UPDATE  ALBUMS SET AlbumsName =?, Description =?, DateCreate =?, CateId =?, AccountId =? where AlbumsId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, albumsName);
            ps.setObject(2, description);
            ps.setObject(3, dateCreate);
            ps.setObject(4, cateId);
            ps.setObject(5, accountId);
            ps.setObject(6, albumsId);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Albums.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            conn.closeConn();
        }
    }

    public boolean delete(int albumsId) {
        try {
            sql = "DELETE FROM ALBUMS where AlbumsId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, albumsId);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Albums.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            conn.closeConn();
        }
    }

    public ArrayList getAll() {
        try {
            stmt = conn.getConn().createStatement();
            sql = "SELECT * FROM ALBUMS";
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList arrLst = new ArrayList();
            if (rs != null) {
                int count = 0;
                while (rs.next()) {
                    count++;
                    Albums al = new Albums();
                    al.setAlbumsId(rs.getInt("AlbumsId"));
                    al.setAlbumsName(rs.getString("AlbumsName"));
                    al.setDescription(rs.getString("Description"));
                    al.setDateCreate(rs.getDate("DateCreate").toString());
                    al.setCateId(rs.getInt("CateId"));
                    al.setAccountId(rs.getInt("AccountId"));
                    arrLst.add(al);
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
            Logger.getLogger(Albums.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }
    }
    
    public Albums getById(int albumsId) {
        try {
            sql = "SELECT * from ALBUMS where AlbumsId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, albumsId);
            ResultSet rs = ps.executeQuery();
            ArrayList arrLst = new ArrayList();
            if (rs != null) {
                int count = 0;
                while (rs.next()) {
                    count++;
                    Albums al = new Albums();
                    al.setAlbumsId(rs.getInt("AlbumsId"));
                    al.setAlbumsName(rs.getString("AlbumsName"));
                    al.setDescription(rs.getString("Description"));
                    al.setDateCreate(rs.getDate("DateCreate").toString());
                    al.setCateId(rs.getInt("CateId"));
                    al.setAccountId(rs.getInt("AccountId"));
                    arrLst.add(al);
                }
                if (count > 0) {
                    return (Albums)arrLst.get(0);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Albums.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }
    }
    
    public ArrayList search(Hashtable htb) {
        try {
            sql = "SELECT * from ALBUMS";
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
                    Albums al = new Albums();
                    al.setAlbumsId(rs.getInt("AlbumsId"));
                    al.setAlbumsName(rs.getString("AlbumsName"));
                    al.setDescription(rs.getString("Description"));
                    al.setDateCreate(rs.getDate("DateCreate").toString());
                    al.setCateId(rs.getInt("CateId"));
                    al.setAccountId(rs.getInt("AccountId"));
                    arrLst.add(al);
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
            Logger.getLogger(Albums.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }
    }
}
