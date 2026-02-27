import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class URLRewriteServlet2 extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String nav = req.getParameter("nav");

        if(nav == null)
            nav = "Page2";
        else
            nav = nav + " ; Page2";

        out.println("<h2>Page 2</h2>");
        out.println("<p>Navigation Path: " + nav + "</p>");

        out.println("<a href='URLRewriteServlet1?nav=" + nav + "'>Back to Page 1</a>");
    }
}