/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package app.servlet.maven.controller;

import app.servlet.maven.entity.Usuario;
import app.servlet.maven.model.IUsuarioModel;
import app.servlet.maven.model.UsuarioModelImpl;
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
    private IUsuarioModel service = new UsuarioModelImpl();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        
        Usuario usuario = new Usuario();
        usuario.setNombre(request.getParameter("name"));
        usuario.setPass(request.getParameter("pass"));
        
        switch (accion) {
            case "crear":
                System.out.println("crear");
                service.crearRegistro(usuario);
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
