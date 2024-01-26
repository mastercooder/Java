/*
package example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.servletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class book_problum4 {
    public class SumServlet extends HttpServlet {
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws servletException, IOException {
            
            int n1, n2, n3;

            n1 = 10;
            n2 = 20;
            n3 = n1+n2;

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("<html>");
            out.println("<head>");
            out.println("<title>sum of Two Number</title>");
            out.println("</head>");

            out.println("<body>");
            out.println("<Sum of " + n1 + " and " + n2 + " is " + n3);
            out.println("<body>");
            out.println("</html>");
            out.close();
        }
    }
}
*/