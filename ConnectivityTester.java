import java.net.*;
import java.io.*;

public class ConnectivityTester {
	
	public static void main(String[] args) {
		try {
			URL theURL =  new URL("https://www.janderclandermorenao.com");
			URLConnection yc = theURL.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
			}
			in.close();
			System.out.println("Hello World!");
		} catch(Exception e) {
			System.out.println("There was an error... Details: \n");
		       	e.printStackTrace();
		}
	}
}
