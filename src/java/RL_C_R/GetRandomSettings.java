/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RL_C_R;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;


/**
 *
 * @author mblok
 */
public class GetRandomSettings extends HttpServlet {

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
            out.println("<title>Servlet RLCameraRandomizer</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>You are not supposed to be here!</h1>");
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
        
        int fovMin = 60; //steps of 1
        int fovMax = 110; //steps of 1
        
        int distanceMin = 100; //steps of 10
        int distanceMax = 400; //steps of 10
        
        int heightMin = 40; //steps of 10
        int heightMax = 200; //steps of 10
        
        Random randNumber = new Random();
        
        int fovRandom = randNumber.nextInt(fovMax - fovMin) + fovMin;
        int distanceRandom = randNumber.nextInt(distanceMax - fovMin) + distanceMin;
        int heightRandom = randNumber.nextInt(heightMax - heightMin) + heightMin;
        int angleRandom = randNumber.nextInt(15); //AngleMin = -15, AngleMac = 0, Steps of 1
        double stiffnessRandom = randNumber.nextDouble(); //stiffnessMin = 0, stiffnessMax = 1, Steps of 0.05
        double swivelspeedRandom = randNumber.nextInt(100) + 1; //swivelspeedMin = 1, swivelspeedMax = 10, Steps of 0.10
        double transitionspeedRandom = randNumber.nextDouble(); //transitionspeedMin = 1, transitionspeedMax = 2, Steps of 0.10
        
        DecimalFormat df = new DecimalFormat("####0.00");
        
        distanceRandom = (int) (Math.round(distanceRandom/10.0) * 10);
        heightRandom = (int) (Math.round(heightRandom/10.0) * 10);
        
        swivelspeedRandom /= 10;
        transitionspeedRandom += 1;
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>RL Random Camera Settings</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Rocket League random camera settings generator</h2>");
            out.println("<button onClick=\"window.location.reload();\">Generate new settings</button><br><br>");
            out.println("FOV: " + fovRandom + "<br>");
            out.println("Distance: " + distanceRandom + "<br>");
            out.println("Height: " + heightRandom + "<br>");
            out.println("Angle: -" + angleRandom + "<br>");
            out.println("Stiffness: " + df.format(stiffnessRandom) + "<br>");
            out.println("Swivel Speed: " + swivelspeedRandom + "<br>");
            out.println("Transition Speed: " + df.format(transitionspeedRandom) + "<br>");
            out.println("</body>");
            out.println("</html>");
            
            
        }
        
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
