package io.full;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
      
    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");

    response.getWriter().print("Hello App Engine!\r\n");
    
     final Logger logger = Logger.getLogger(HelloAppEngine.class.getName());
     PrintWriter out=response.getWriter();
     out.println("srini"+request.getParameter("a"));
     logger.info("Your information log message."+request.getParameter("a"));
     Class2 ob=new Class2();
     logger.info(ob.str);
   

  }
}