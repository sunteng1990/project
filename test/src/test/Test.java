package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) throws Exception {  
		URL u = new URL("http://www.douban.com");
		HttpURLConnection connection = (HttpURLConnection) u.openConnection();
        connection.setUseCaches(false);
        connection.setConnectTimeout(30000);
        connection.setReadTimeout(30000);
        connection.connect();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String lines = reader.readLine();
        while(lines!= null){
        	System.out.println(lines);
        	lines = reader.readLine();
        }
        reader.close();
        connection.disconnect();
	}
}
