/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbhelpers.AddQuery;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.customers;

/**
 *
 * @author thewagdy
 */
@WebServlet(name = "AddServlet", urlPatterns = {"/addcustomer"})
public class AddServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Get the data
        String FirstName = request.getParameter("FIRSTSNAME");
        String LastName = request.getParameter("LASTNAME");
        String Addr1 = request.getParameter("ADDR1");
        String Addr2 = request.getParameter("ADDR2");
        String City = request.getParameter("CITY");
        String State = request.getParameter("STATE");
        String Zip = request.getParameter("ZIP");
        String EmailAddr = request.getParameter("EMAILADDR");
        int Age = Integer.parseInt(request.getParameter("AGE"));
        //Setup a new car object

        customers customer = new customers();
        customer.setFirstName(FirstName);
        customer.setLastName(LastName);
        customer.setAddr1(Addr1);
        customer.setAddr2(Addr2);
        customer.setCity(City);
        customer.setState(State);
        customer.setZip(Zip);
        customer.setEmailAddr(EmailAddr);
        customer.setAge(Age);

        //Set up an addQuery object
        AddQuery aq = new AddQuery();

        //pass the car to addQuery to add to the CARS DB
        aq.doAdd(customer);

        //pass execution control to the ReadServlet
        String url = "/read";
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);

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
