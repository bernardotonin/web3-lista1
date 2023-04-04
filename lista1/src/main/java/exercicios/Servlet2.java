package exercicios;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet2", value = "/cabecalho")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String host = request.getHeader("HOST");
        String ag = request.getHeader("USER-AGENT");
        String enc = request.getHeader("ACCEPT-ENCODING");
        String ac = request.getHeader("ACCEPT-LANGUAGE");

        PrintWriter out = response.getWriter();

        out.println("host: " + host);
        out.println("user-agent: " + ag);
        out.println("accept-encoding: " + enc);
        out.println("accept-language: " + ac);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
