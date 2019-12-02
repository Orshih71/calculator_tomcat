import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "Calculator",
        urlPatterns = {"/"}
)
public class Calculator extends HttpServlet {
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<html><head><title>Test</title></head><body>");
        out.print("<form action=\"/\" method=\"post\">\n" +
                "    <label>\n" +
                "        <input name=\"num1\" type=\"number\"/>\n" +
                "    </label>\n" +
                "    +\n" +
                "    <label>\n" +
                "        <input name=\"num2\" type=\"number\"/>\n" +
                "    </label>\n" +
                "    =\n" +
                "    <label>\n" +
                "        <input name=\"result1\" type=\"number\"/>\n" +
                "    </label>\n" +
                "    <br/>\n" +
                "    <br/>\n" +
                "    <label>\n" +
                "        <input name=\"num3\" type=\"number\"/>\n" +
                "    </label>\n" +
                "    *\n" +
                "    <label>\n" +
                "        <input name=\"num4\" type=\"number\"/>\n" +
                "    </label>\n" +
                "    =\n" +
                "    <label>\n" +
                "        <input name=\"result2\" type=\"number\"/>\n" +
                "    </label>\n" +
                "    <br/>\n" +
                "    <br/>\n" +
                "    <button type=\"submit\">Submit</button>\n" +
                "</form>");
        out.print("</body></html>");
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<html><head><title>Test</title></head><body>");
        out.print("<form action=\"/\" method=\"post\">\n");
        if (request.getParameter("num1") != null && request.getParameter("num2") != null) {
            out.print("<label>\n" +
                    "        <input name=\"num1\" type=\"number\" value=\"" + request.getParameter("num1") + "\"/>\n" +
                    "    </label>\n" +
                    "    +\n" +
                    "    <label>\n" +
                    "        <input name=\"num2\" type=\"number\" value=\"" + request.getParameter("num2") + "\"/>\n" +
                    "    </label>\n" +
                    "    =\n" +
                    "    <label>\n" +
                    "        <input name=\"result1\" type=\"number\" value=\"" + (Integer.parseInt(request.getParameter("num1")) + Integer.parseInt(request.getParameter("num2"))) + "\"/>\n" +
                    "    </label>\n");
        } else {
            out.print("<label>\n" +
                    "        <input name=\"num1\" type=\"number\"/>\n" +
                    "    </label>\n" +
                    "    +\n" +
                    "    <label>\n" +
                    "        <input name=\"num2\" type=\"number\"/>\n" +
                    "    </label>\n" +
                    "    =\n" +
                    "    <label>\n" +
                    "        <input name=\"result1\" type=\"number\"/>\n" +
                    "    </label>\n");
        }
        out.print("<br/>");
        out.print("<br/>");
        if (request.getParameter("num3") != null && request.getParameter("num4") != null) {
            out.print("<label>\n" +
                    "        <input name=\"num3\" type=\"number\" value=\"" + request.getParameter("num3") + "\"/>\n" +
                    "    </label>\n" +
                    "    *\n" +
                    "    <label>\n" +
                    "        <input name=\"num4\" type=\"number\" value=\"" + request.getParameter("num4") + "\"/>\n" +
                    "    </label>\n" +
                    "    =\n" +
                    "    <label>\n" +
                    "        <input name=\"result2\" type=\"number\" value=\"" + (Integer.parseInt(request.getParameter("num3")) * Integer.parseInt(request.getParameter("num4"))) + "\"/>\n" +
                    "    </label>\n");
        } else {
            out.print("<label>\n" +
                    "        <input name=\"num3\" type=\"number\"/>\n" +
                    "    </label>\n" +
                    "    +\n" +
                    "    <label>\n" +
                    "        <input name=\"num4\" type=\"number\"/>\n" +
                    "    </label>\n" +
                    "    =\n" +
                    "    <label>\n" +
                    "        <input name=\"result1\" type=\"number\"/>\n" +
                    "    </label>\n");
        }
        out.print("<br/>");
        out.print("<br/>");
        out.print("<button type=\"submit\">Submit</button>");
        out.print("</form>");
        out.print("</body></html>");

    }

}
