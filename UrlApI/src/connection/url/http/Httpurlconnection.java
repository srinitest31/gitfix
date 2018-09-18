package connection.url.http;

import java.net.HttpURLConnection;
import java.net.URL;

public class Httpurlconnection {

	public static void main(String[] args) {
		 try{    
		URL url=new URL("http://www.javatpoint.com/java-tutorial");    
		HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
		for(int i=1;i<=10;i++){  
		System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
		}  
		huc.disconnect();   
		}catch(Exception e){System.out.println(e);}    
		} 

	}


