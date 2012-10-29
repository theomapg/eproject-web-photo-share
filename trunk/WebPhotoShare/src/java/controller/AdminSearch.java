/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

/**
 *
 * @author an
 */
public class AdminSearch extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Hashtable table = new Hashtable();
        String key = request.getParameter("field");
        String value = request.getParameter("search");

        if (!value.equalsIgnoreCase("") && key.equalsIgnoreCase("username")) {
            table.put("Username", value);
        } else if (!value.equalsIgnoreCase("") && key.equalsIgnoreCase("email")) {
            table.put("Email", value);
        } else if (value.equalsIgnoreCase("wait") && key.equalsIgnoreCase("status")) {
            table.put("Status", 0);
        } else if (value.equalsIgnoreCase("active") && key.equalsIgnoreCase("status")) {
            table.put("Status", 1);
        } else if (value.equalsIgnoreCase("noactive") && key.equalsIgnoreCase("status")) {
            table.put("Status", 2);
        } else if (key.equalsIgnoreCase("admin")) {
            table.put("ACCOUNT.RoleId", 1);
        }

        Account a = new Account();
        ArrayList arr = a.search(table);
        request.setAttribute("info", arr);
        RequestDispatcher rd = request.getRequestDispatcher("ManagementAccount.jsp");
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
