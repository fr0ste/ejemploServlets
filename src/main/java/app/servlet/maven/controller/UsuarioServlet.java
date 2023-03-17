/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package app.servlet.maven.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author labingsw05
 */
public class UsuarioServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        
        switch (accion) {
            case "crear":
                System.out.println("crear");
                
                break;
            case "listar":
                System.out.println("listar");
                
                break;
            case "eliminar":
                System.out.println("eliminar");
                
                break;
            case "actualizar":
                System.out.println("actualizar");
                
                break;
            case "elemento":
                System.out.println("elemento");
                
                break;
            default:
                throw new AssertionError();
        }
        
    }
}
