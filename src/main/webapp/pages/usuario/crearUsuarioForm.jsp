<%-- Document : crearUsuarioForm Created on : 16 mar 2023, 16:48:12 Author : labingsw05 --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
            <link rel="stylesheet" href="../../webjars/bootstrap/5.2.3/css/bootstrap.min.css" />
        </head>

        <body>

            <div class="container">
                <form action="../../UsuarioServlet?accion=crear" method="post">
                    <div class="card">

                        <div class="card-header">header</div>
                        <div class="card-content">


                            <label>nombre</label>
                            <input type="text" name="name" placeholder="nombre">

                            <br>
                            <label>contraseña</label>
                            <input type="text" value="" name="pass" placeholder="pass">

                        </div>
                        <div class="card-footer"><button>enviar</button></div>

                    </div>




                </form>


            </div>

            </div>
        </body>

        </html>