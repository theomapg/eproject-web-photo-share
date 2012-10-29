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
public class Photo {
    private int photoId;
    private String image;
    private int albumsId;
    private String description;
    private String uploadDate;

    private Connect conn;
    private PreparedStatement ps;
    private String sql;
    private Statement stmt;

    
    public Photo() {
        conn = new Connect();
    }

    public Photo(int photoId, String image, int albumsId, String description, String uploadDate) {
        this.photoId = photoId;
        this.image = image;
        this.albumsId = albumsId;
        this.description = description;
        this.uploadDate = uploadDate;
        conn = new Connect();
    }
    
    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getAlbumsId() {
        return albumsId;
    }

    public void setAlbumsId(int albumsId) {
        this.albumsId = albumsId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public boolean insert(String image, int albumsId, String description, String uploadDate) {
        try {
            sql = "INSERT INTO PHOTO(Image, AlbumsId, Description, UploadDate) VALUES(?,?,?,?)";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, image);
            ps.setObject(2, albumsId);
            ps.setObject(3, description);
            ps.setObject(4, uploadDate);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Photo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            conn.closeConn();
        }
    }

    public boolean update(int photoId, String image,  int albumsId, String description, String uploadDate) {
        try {
            sql = "UPDATE PHOTO SET Image =?, AlbumsId =?, Description =?, UploadDate =? where PhotoId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, image);
            ps.setObject(2, albumsId);
            ps.setObject(3, description);
            ps.setObject(4, uploadDate);
            ps.setObject(5, photoId);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Photo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            conn.closeConn();
        }
    }

    public boolean delete(int photoId) {
        try {
            sql = "delete from PHOTO where PhotoId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setInt(1, photoId);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Photo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            conn.closeConn();
        }
    }

    public ArrayList getAll() {
        try {
            stmt = conn.getConn().createStatement();
            sql = "SELECT * from PHOTO";
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList arrLst = new ArrayList();
            if (rs != null) {
                int count = 0;
                while (rs.next()) {
                    count++;
                    Photo p = new Photo();
                    p.setPhotoId(rs.getInt("PhotoId"));
                    p.setImage(rs.getString("Image"));
                    p.setAlbumsId(rs.getInt("AlbumsId"));
                    p.setDescription(rs.getString("Description"));
                    p.setUploadDate(rs.getDate("UploadDate").toString());
                    arrLst.add(p);
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
            Logger.getLogger(Photo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }

    }

    public Photo getById( int photoId) {
        try {
            sql = "SELECT * from PHOTO where PhotoId=?";
            ps = conn.getConn().prepareStatement(sql);
            ps.setObject(1, photoId);
            ResultSet rs = ps.executeQuery();
            ArrayList arrLst = new ArrayList();
            if (rs != null) {
                int count = 0;
                while (rs.next()) {
                    count++;
                    Photo p = new Photo();
                    p.setPhotoId(rs.getInt("PhotoId"));
                    p.setImage(rs.getString("Image"));
                    p.setAlbumsId(rs.getInt("AlbumsId"));
                    p.setDescription(rs.getString("Description"));
                    p.setUploadDate(rs.getDate("UploadDate").toString());
                    arrLst.add(p);
                }
                if (count > 0) {
                    return (Photo) arrLst.get(0);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Photo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }
    }

    public ArrayList search(Hashtable htb) {
        try {
            sql = "SELECT * from PHOTO";
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
                    Photo p = new Photo();
                    p.setPhotoId(rs.getInt("PhotoId"));
                    p.setImage(rs.getString("Image"));
                    p.setAlbumsId(rs.getInt("AlbumsId"));
                    p.setDescription(rs.getString("Description"));
                    p.setUploadDate(rs.getDate("UploadDate").toString());
                    arrLst.add(p);
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
            Logger.getLogger(Photo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            conn.closeConn();
        }
    }

}
