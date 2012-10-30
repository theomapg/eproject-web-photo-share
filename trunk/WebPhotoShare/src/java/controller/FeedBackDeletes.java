/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Faqs;
import model.Feedback;

/**
 *
 * @author an
 */
public class FeedBackDeletes extends HttpServlet {

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
        HttpSession session = request.getSession();
        Account a = (Account) session.getAttribute("account");
        if (a == null) {
            out.print("<script>alert('You must be login system');window.location='AdminLogin.jsp';</script>");
        } else {
            
            String[] items;
            items = request.getParameterValues("items");
            String strMsg="FeedBack ID: ";
            int cnt=0;
            if (items != null) {
                for (int i = 0; i < items.length; i++) {
                    Feedback f=new Feedback();
                    if(!f.delete(Integer.parseInt(items[i]))) {
                        cnt++;
                        strMsg+=items[i]+ " ";
                    }  
                }
                strMsg+=", Exist data. Could not delete";
                if(cnt>0) {
                    request.setAttribute("msg", strMsg);
                    RequestDispatcher rd = request.getRequestDispatcher("ManagementFeedback.jsp");
                    rd.forward(request, response);
                }else{
                     request.setAttribute("msg", "Delete successful");
                    RequestDispatcher rd = request.getRequestDispatcher("ManagementFeedback.jsp");
                    rd.forward(request, response);
                }
            }
        }
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
