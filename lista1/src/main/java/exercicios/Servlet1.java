package exercicios;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet1", value = "/requisicao")
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String met = request.getMethod();
        String uri = request.getRequestURI();
        String pro = request.getProtocol();
        String ad = request.getRemoteAddr();
        PrintWriter out = response.getWriter();

        out.println("Metodo: " + met);
        out.println("URI do Pedido: " + uri);
        out.println("Protocolo: " + pro);
        out.println("Endereco Remoto: " + ad);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
