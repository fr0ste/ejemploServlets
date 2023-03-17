<%-- 
    Document   : crearUsuarioForm
    Created on : 16 mar 2023, 16:48:12
    Author     : labingsw05
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="../../UsuarioServlet?accion=crear" method="post">

            <label>nombre</label>
            <input type="text" name="name" placeholder="nombre">

            <br>
            <label>contraseña</label>
            <input type="text" value="" name="pass" placeholder="pass">

            <button>enviar</button>


          
        </form>
    </body>
</html>
