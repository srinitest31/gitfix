package api.google;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;


@WebServlet( urlPatterns = { "/callback" })
public class Callback extends HttpServlet {
		
		protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
			System.out.println("inside thee ");
			String auth_code=request.getParameter("code");
			System.out.println(auth_code);
			
			HttpClient client=HttpClientBuilder.create().build();
			HttpPost post = new HttpPost("https://www.googleapis.com/oauth2/v4/token");
			List<NameValuePair> arguments = new ArrayList<>();
			arguments.add(new BasicNameValuePair("code", auth_code));
			arguments.add(new BasicNameValuePair("client_id", "206338662524-q8f0i2o1o90d08qdv4h1i55jopmi1d9h.apps.googleusercontent.com"));
			arguments.add(new BasicNameValuePair("client_secret", "mm5PFudrduNnveozD83eHn_f"));
			arguments.add(new BasicNameValuePair("redirect_uri", "https://our-shield-216912.appspot.com/callback"));
			arguments.add(new BasicNameValuePair("grant_type", "authorization_code"));
			arguments.add(new BasicNameValuePair("access_type", "offline"));

			try {
				post.setEntity(new UrlEncodedFormEntity(arguments));
				org.apache.http.HttpResponse resp=client.execute(post);
				response.getWriter().println(EntityUtils.toString(resp.getEntity()));
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();	
			}
			
			
		}
	}

