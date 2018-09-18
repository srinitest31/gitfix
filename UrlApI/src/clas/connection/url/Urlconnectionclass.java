package clas.connection.url;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Urlconnectionclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		URL url=new URL("http://www.javatpoint.com");  
		URLConnection urlcon=url.openConnection();  
		InputStream stream=urlcon.getInputStream();  
		int i;
		while((i=stream.read())!=-1){  
		System.out.print((char)i);  
		}  
		

	}

}
