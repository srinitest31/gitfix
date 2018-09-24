package api.google;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

   
    String url="https://accounts.google.com/o/oauth2/auth?redirect_uri=https://our-shield-216912.appspot.com/callback&response_type=code&client_id=206338662524-q8f0i2o1o90d08qdv4h1i55jopmi1d9h.apps.googleusercontent.com&scope=https://www.googleapis.com/auth/analytics.readonly+https://www.googleapis.com/auth/userinfo.email&approval_prompt=force&access_type=offline";
    
    response.sendRedirect(url);

  }
}