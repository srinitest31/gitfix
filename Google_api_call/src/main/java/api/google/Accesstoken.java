package api.google;



import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Accesstoken
 */
@WebServlet("/Accesstoken")
public class Accesstoken extends HttpServlet {
	protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String access_token=request.getParameter("access_token");
		String refresh_token=request.getParameter("refresh_token");
		response.getWriter().println("Access_token = "+access_token);
		response.getWriter().println("Refresh_Token = "+refresh_token);
		
		response.getWriter().println("Hi am srinivasasn");
	}
}
