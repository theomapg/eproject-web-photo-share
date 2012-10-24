/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    public boolean insert(int roleId,String roleName, String description) {
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
