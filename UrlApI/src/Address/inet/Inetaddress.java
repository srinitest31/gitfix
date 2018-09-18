package Address.inet;

import java.net.InetAddress;

public class Inetaddress {

	public static void main(String[] args) {
		try{  
			InetAddress ip=InetAddress.getByName("www.facebook.com");  
			  
			System.out.println("Host Name: "+ip.getHostName());  
			System.out.println("IP Address: "+ip.getHostAddress());  
			}catch(Exception e){System.out.println(e);}  
			}  

	}


