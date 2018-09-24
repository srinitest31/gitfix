package restapi;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import org.apache.http.NameValuePair;

import org.apache.http.impl.client.HttpClientBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.google.api.client.http.HttpResponse;

import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;

/**
 * Servlet implementation class Callback
 */
@WebServlet( urlPatterns = { "/callback" })
public class Callback extends HttpServlet {
		
		protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
			String auth_code = request.getParameter("code");
			
			//String url="https://www.googleapis.com/oauth2/v4/token?code="+auth_code+"&client_id=
			//244853561187-0be3uc55no0vfht0ldbobl0ob0angksa.apps.googleusercontent.com&redirect_uri=
			//http://datastore-21.appspot.com/Accesstoken&client_secret=xVKTpPUXshuVPx4zjMSTx2AC&grant_type=
			//authorization_code&access_type=offline";
	
			
			//HttpClient client=HttpClientBuilder.create().build();
			HttpPost post = new HttpPost("https://www.googleapis.com/oauth2/v4/token");
			List<NameValuePair> arguments = new ArrayList<>();
			arguments.add(new BasicNameValuePair("code", auth_code));
			arguments.add(new BasicNameValuePair("client_id", "1011644038766-je2gj4jqve2ikns4o00jh4j49m6keh64.apps.googleusercontent.com"));
			arguments.add(new BasicNameValuePair("client_secret", "QzS-USpYGaTyl7pD9UlszxnI"));
			arguments.add(new BasicNameValuePair("redirect_uri", "http://oauthmaven.appspot.com/callback"));
			arguments.add(new BasicNameValuePair("grant_type", "authorization_code"));
			arguments.add(new BasicNameValuePair("access_type", "offline"));
			
			
//			URL ur = new URL(url);
//			HttpsURLConnection con = (HttpsURLConnection) ur.openConnection();
//			con.setRequestMethod("POST");
			try {
				post.setEntity(new UrlEncodedFormEntity(arguments));
				org.apache.http.HttpResponse resp=((HttpClient) post).execute(post);
				response.getWriter().println(EntityUtils.toString(resp.getEntity()));
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();	
			}
			
			
		}
	}
