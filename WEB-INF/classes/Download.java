// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class Download extends HttpServlet {
 


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
       // Actual logic goes here.
      out.println("Putin Huilo");
  }
  
  public void destroy()
  {
      // do nothing.
  }
}

