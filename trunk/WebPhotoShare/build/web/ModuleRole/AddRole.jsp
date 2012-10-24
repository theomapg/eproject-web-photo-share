<%-- 
    Document   : AddRole
    Created on : Oct 24, 2012, 10:58:08 AM
    Author     : an
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="../AddNewRole">
            <table border="0">
                
                <tbody>
                    <tr>
                        <td>RoleID:</td>
                        <td><input type="text" name="txtRoleId" value="" /></td>
                    </tr>
                    <tr>
                        <td>RoleName:</td>
                        <td><input type="text" name="txtRoleName" value="" /></td>
                    </tr>
                    <tr>
                        <td>Description:</td>
                        <td><textarea name="txtDes" rows="4" cols="20">
		
                            </textarea></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Submit" name="Submit" /></td>
                        
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
