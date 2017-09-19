package WebsiteReader;
import java.net.*;
import java.io.*;

public class ReadWebsite {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		URL oracle = new URL("http://ooty.xyz/bangalore-to-ooty-by-train");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();

	}

}
