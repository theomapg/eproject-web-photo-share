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
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author an
 */
public class Account {

    private int accountId;
    private String userName;
    private String password;
    private int roleId;
    private String roleName;
    private String email;
    private boolean gender;
    private String fullName;
    private String address;
    private String birthday;
    private String dateCreate;
    private boolean status;
    private Connect conn;
    private PreparedStatement ps;
    private String sql;
    private Statement stmt;

    public Account() {
        conn = new Connect();
    }

    public Account(int accountId, String userName, String password, int roleId, String email, boolean gender, String fullName, String address, String birthday, String dateCreate, boolean status) {
        this.accountId = accountId;
        this.userName = userName;
        this.password = password;
        this.roleId = roleId;
        this.email = email;
        this.gender = gender;
        this.fullName = fullName;
        this.address = address;
        this.birthday = birthday;
        this.dateCreate = dateCreate;
        this.status = status;
        conn = new Connect();
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public boolean insert(String userName, String password, int roleId, String email, boolean gender, String fullName, String address, String birthday, String dateCreate, boolean status) {
        try {
            sql = "insert into ACCOUNT(UserName,Password,RoleId,Email,Gender,FullName,Address,Birthday,DateCreate,Status) values(?,?,?,?,?,?,?,?,?,?)";
            ps = conn.getConn().prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, password);
            ps.setInt(3, roleId);
            ps.setString(4, email);
            ps.setBoolean(5, gender);
            ps.setString(6, fullName);
            ps.setString(7, address);
            ps.setString(8, birthday);
            ps.setString(9, dateCreate);
            ps.setBoolean(10, status);
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

    public boolean update(int accountId, String email, boolean gender, String fullName, String address, String birthday, String dateCreate, boolean status) {
        try {
            sql = "update ACCOUNT set Email=?,Gender=?,FullName=?,Address=?,Birthday=?,DateCreate=?,status=? where AccountId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setString(1, email);
            ps.setBoolean(2, gender);
            ps.setString(3, fullName);
            ps.setString(4, address);
            ps.setString(5, birthday);
            ps.setString(6, dateCreate);
            ps.setBoolean(7, status);
            ps.setInt(8, accountId);

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

    public boolean delete(int accountId) {
        try {
            sql = "delete from ACCOUNT where AccountId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setInt(1, accountId);
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

    public ArrayList getAll() {
        try {
            stmt = conn.getConn().createStatement();
            sql = "SELECT ACCOUNT.*, Role.* from ACCOUNT INNER JOIN Role ON ACCOUNT.RoleId = Role.RoleId";
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList arrLst = new ArrayList();
            if (rs != null) {
                int count = 0;
                while (rs.next()) {
                    count++;
                    Account acc = new Account();
                    acc.setAccountId(rs.getInt("AccountId"));
                    acc.setUserName(rs.getString("UserName"));
                    acc.setPassword(rs.getString("Password"));
                    acc.setRoleName(rs.getString("RoleName"));
                    acc.setEmail(rs.getString("Email"));
                    acc.setGender(rs.getBoolean("Gender"));
                    acc.setFullName(rs.getString("FullName"));
                    acc.setAddress(rs.getString("Address"));
                    acc.setBirthday(rs.getDate("Birthday").toString());
                    acc.setDateCreate(rs.getDate("DateCreate").toString());
                    acc.setStatus(rs.getBoolean("Status"));
                    arrLst.add(acc);
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
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }
    }

    public Account getById(int accountId) {
        try {
            sql = "SELECT ACCOUNT.*, Role.* from ACCOUNT INNER JOIN Role ON ACCOUNT.RoleId = Role.RoleId where AccountId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, accountId);
            ResultSet rs = ps.executeQuery();
            ArrayList arrLst = new ArrayList();
            if (rs != null) {
                int count = 0;
                while (rs.next()) {
                    count++;
                    Account acc = new Account();
                    acc.setAccountId(rs.getInt("AccountId"));
                    acc.setUserName(rs.getString("UserName"));
                    acc.setPassword(rs.getString("Password"));
                    acc.setRoleName(rs.getString("RoleName"));
                    acc.setEmail(rs.getString("Email"));
                    acc.setGender(rs.getBoolean("Gender"));
                    acc.setFullName(rs.getString("FullName"));
                    acc.setAddress(rs.getString("Address"));
                    acc.setBirthday(rs.getDate("Birthday").toString());
                    acc.setDateCreate(rs.getDate("DateCreate").toString());
                    acc.setStatus(rs.getBoolean("Status"));
                    arrLst.add(acc);
                }
                if (count > 0) {
                    return (Account) arrLst.get(0);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }
    }

    public boolean changePass(int accountId, String oldPass, String newPass) {
        if (oldPass.equals(newPass)) {
            return true;
        } else {
            try {
                sql = "update ACCOUNT set Password=? where AccountId=?";
                ps = conn.getConn().prepareStatement(sql);
                ps.setString(1, newPass);
                ps.setInt(2, accountId);
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
    }

    public ArrayList search(Hashtable htb) {
        try {
            sql = "SELECT ACCOUNT.*, Role.* from ACCOUNT INNER JOIN Role ON ACCOUNT.RoleId = Role.RoleId";
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
                    Account acc = new Account();
                    acc.setAccountId(rs.getInt("AccountId"));
                    acc.setUserName(rs.getString("UserName"));
                    acc.setPassword(rs.getString("Password"));
                    acc.setRoleName(rs.getString("RoleName"));
                    acc.setEmail(rs.getString("Email"));
                    acc.setGender(rs.getBoolean("Gender"));
                    acc.setFullName(rs.getString("FullName"));
                    acc.setAddress(rs.getString("Address"));
                    acc.setBirthday(rs.getDate("Birthday").toString());
                    acc.setDateCreate(rs.getDate("DateCreate").toString());
                    acc.setStatus(rs.getBoolean("Status"));
                    arrLst.add(acc);
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
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }
    }

    public Account checkLogin(String username, String password) {
        try {
            sql = "SELECT ACCOUNT.*, Role.* from ACCOUNT INNER JOIN Role ON ACCOUNT.RoleId = Role.RoleId where UserName=? and Password=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, username);
            ps.setObject(2, password);
            ResultSet rs = ps.executeQuery();
            ArrayList arrLst = new ArrayList();
            if (rs != null) {
                int count = 0;
                while (rs.next()) {
                    count++;
                    Account acc = new Account();
                    acc.setAccountId(rs.getInt("AccountId"));
                    acc.setUserName(rs.getString("UserName"));
                    acc.setPassword(rs.getString("Password"));
                    acc.setRoleName(rs.getString("RoleName"));
                    acc.setEmail(rs.getString("Email"));
                    acc.setGender(rs.getBoolean("Gender"));
                    acc.setFullName(rs.getString("FullName"));
                    acc.setAddress(rs.getString("Address"));
                    acc.setBirthday(rs.getDate("Birthday").toString());
                    acc.setDateCreate(rs.getDate("DateCreate").toString());
                    acc.setStatus(rs.getBoolean("Status"));
                    arrLst.add(acc);
                }
                if (count > 0) {
                    return (Account) arrLst.get(0);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }
    }

    public static void main(String[] args) {
//       ---------------------------------------------------------
//       Account acc = new Account();
//       boolean b = acc.insert("vuvietan", "123456", 0, "vuvietan1990@gmail.com", true, "vũ việt an", "hn","06/25/1990","06/25/1990",false);
//       boolean b=acc.delete(1);
//        if(b) {
//           System.out.println("ok");
//       }else{
//           System.out.println("fail");
//       }
//       ---------------------------------------------------------
//        Hashtable table = new Hashtable();
//        table.put("UserName", "vuvietan");
//        table.put("Password", "123456");       
//        //table.put("key2", "value1");
//        System.out.println(acc.search(table).size());
//        if(acc.getAll()==null) {
//            System.out.println("no item");
//        }else{
//            System.out.println(acc.getAll().size());
//        }
//        ---------------------------------------------------------
//        Account a=acc.checkLogin("vuvietan", "123456");
//        if(a!=null){
//            System.out.println("ok");
//            System.out.println(a.getDateCreate());
//        }else{
//            System.out.println("fail");
//        }
    }
}
