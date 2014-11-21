import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class VS extends HttpServlet {
 


  public void init() throws ServletException
  {
      // Our generated content

  }

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // Set response content type
      response.setContentType("text/html");

     
      PrintWriter out = response.getWriter();
      request.getRequestDispatcher("/header.jsp").include(request, response);
              request.getRequestDispatcher("/right.jsp").include(request, response);


       // Dynamic generation goes here.
      if ( (request.getParameterValues("username") != null) && (request.getParameterValues("passwd") != null) ) {
         String[] person = request.getParameterValues("username");
         String[] pass = request.getParameterValues("passwd");

        if ( (person[0].equals("Putin")) && (pass[0].equals("1")) ) {
              out.println("<iframe width=\"640\" height=\"390\" src=\"//www.youtube.com/embed/YXU0SaDkLks\" frameborder=\"0\" allowfullscreen></iframe>");
            }
            else { //для одного радка не обов'язково ставити фігурні кавички
              out.println("Figa");
            }
        } else if (request.getParameterValues("action") != null) {
            // link processing section
            String[] required_action = request.getParameterValues("action");

            if (required_action.length > 0 && required_action[0].equals("help")) {
              out.println("/help.jsp");
            }
            // eto tvoe DZ: obrabotai ssylki! 
        } else {
          out.println("No param");
        }
        request.getRequestDispatcher("/footer.jsp").include(request, response);
  }
  public void destroy()
  {
      // do nothing.
  }
}

