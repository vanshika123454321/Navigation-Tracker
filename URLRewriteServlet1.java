import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class URLRewriteServlet1 extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String nav = req.getParameter("nav");

        if(nav == null)
            nav = "Home";
        else
            nav = nav + " ; Home";

        out.println("<h2>Page 1</h2>");
        out.println("<p>Navigation Path: " + nav + "</p>");

        out.println("<a href='URLRewriteServlet2?nav=" + nav + "'>Go to Page 2</a>");
    }
}