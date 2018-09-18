package clas.url;

import java.net.*;

public class Urlclass {

	public static void main(String[] args) throws MalformedURLException {
		URL url=new URL("http://www.javatpoint.com/java-tutorial");  
		
		System.out.println(url.getProtocol());
		System.out.println(url.getFile());
		System.out.println(url.getPath());
		
		System.out.println(url.getHost());
		System.out.println(url.getPort());

	}

}
