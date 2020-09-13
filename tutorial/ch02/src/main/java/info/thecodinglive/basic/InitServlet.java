package info.thecodinglive.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.Webservlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/init")
public class InitServlet extends HttpServlet{
    @override
    public void init() throws ServletException{
        System.out.println("intit call");
    }
}