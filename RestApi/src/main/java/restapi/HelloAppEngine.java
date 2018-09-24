package restapi;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.api.services.discovery.model.RestMethod.Request;
import com.google.cloud.sql.jdbc.internal.Url;

@WebServlet("/signin")
public class HelloAppEngine extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) {
		try {
			String url="https://accounts.google.com/o/oauth2/auth?redirect_uri=http://oauthmaven.appspot.com/callback&response_type=code&client_id=1011644038766-je2gj4jqve2ikns4o00jh4j49m6keh64.apps.googleusercontent.com&scope=https://www.googleapis.com/auth/analytics.readonly+https://www.googleapis.com/auth/userinfo.email&approval_prompt=force&access_type=offline";
			  
			response.sendRedirect(url);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}