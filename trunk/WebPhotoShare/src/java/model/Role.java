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
public class Role {

    private int roleId;
    private String roleName;
    private String description;
    private Connect conn;
    private PreparedStatement ps;
    private String sql;
    private Statement stmt;

    public Role() {
        conn = new Connect();
    }

    public Role(int roleId, String roleName, String description) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.description = description;
        conn = new Connect();
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean insert(int roleId, String roleName, String description) {
        try {
            sql = "insert into Role(RoleId,RoleName,Description) values(?,?,?)";
            ps = conn.getConn().prepareStatement(sql);
            ps.setInt(1, roleId);
            ps.setString(2, roleName);
            ps.setString(3, description);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            conn.closeConn();
        }
    }

    public boolean update(String roleName, String description, int roleId) {
        try {
            sql = "update Role set RoleName=?,Description=? where RoleId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setString(1, roleName);
            ps.setString(2, description);
            ps.setInt(3, roleId);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            conn.closeConn();
        }
    }

    public boolean delete(int roleId) {
        try {
            sql = "delete from Role where RoleId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setInt(1, roleId);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Role.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            conn.closeConn();
        }
    }

    public ArrayList getAll() {
        try {
            stmt = conn.getConn().createStatement();
            sql = "SELECT * from Role";
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList arrLst = new ArrayList();
            if (rs != null) {
                int count = 0;
                while (rs.next()) {
                    count++;
                    Role r = new Role();
                    r.setRoleId(rs.getInt("RoleId"));
                    r.setRoleName(rs.getString("RoleName"));
                    r.setDescription(rs.getString("Description"));
                    arrLst.add(r);
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
            Logger.getLogger(Role.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }

    }

    public Role getById(int roleId) {
        try {
            sql = "SELECT * from Role where RoleId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, roleId);
            ResultSet rs = ps.executeQuery();
            ArrayList arrLst = new ArrayList();
            if (rs != null) {
                int count = 0;
                while (rs.next()) {
                    count++;
                    Role r = new Role();
                    r.setRoleId(rs.getInt("RoleId"));
                    r.setRoleName(rs.getString("RoleName"));
                    r.setDescription(rs.getString("Description"));
                    arrLst.add(r);
                }
                if (count > 0) {
                    return (Role) arrLst.get(0);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Role.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }
    }

    public ArrayList search(Hashtable htb) {
        try {
            sql = "SELECT * from Role";
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
                    Role r = new Role();
                    r.setRoleId(rs.getInt("RoleId"));
                    r.setRoleName(rs.getString("RoleName"));
                    r.setDescription(rs.getString("Description"));
                    arrLst.add(r);
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
            Logger.getLogger(Role.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }
    }

    public static void main(String[] args) {
//        Role r=new Role();
//        if(r.insert(0,"admin", "sa")) {
//            System.out.println("ok");
//        }else{
//            System.out.println("fail");
//        }
    }
}
