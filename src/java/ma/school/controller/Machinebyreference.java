/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.school.controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ma.school.beans.Machine;
import ma.school.service.MachineService;
import ma.school.service.MarqueService;

/**
 *
 * @author LENOVO
 */
@WebServlet(name = "Machinebyreference", urlPatterns = {"/Machinebyreference"})

        public class Machinebyreference extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Récupérez la référence depuis la requête
        String reference = request.getParameter("reference");

        // Filtrez les machines par référence (remplacez cela par votre logique de filtrage)
        List<Machine> filteredMachines = filterMachinesByReference(reference);

        // Transformez les résultats en format JSON
        String json = new Gson().toJson(filteredMachines);

        // Configurez la réponse HTTP pour renvoyer du JSON
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
    }

    private List<Machine> filterMachinesByReference(String reference) {
        // Implémentez votre logique de filtrage ici
        // Remplacez cela par l'accès à vos données et le filtrage réel
        return MachineService.filterByReference(reference);
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
       
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   



