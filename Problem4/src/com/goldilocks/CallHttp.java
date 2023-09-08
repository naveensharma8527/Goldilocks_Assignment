package com.goldilocks;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CallHttp {
	 public static void main(String[] args) throws Exception{
			
		 	String urlAddress="http://127.0.0.1:8999/test?value=p";
			URL url = null;
			String line;
			HttpURLConnection connection;
			try {
				url = new URL(urlAddress);
				connection=(HttpURLConnection)url.openConnection();
				connection.setRequestMethod("GET");
				int resCode=connection.getResponseCode();
				System.out.println(resCode);
				if(resCode>299) {
					connection.disconnect();
					throw new Exception("NO Response");
				}
				BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
				String ans ="";
				while((line=reader.readLine())!=null){
					ans+=line;
				}
				reader.close();
				connection.disconnect();
				System.out.println("Response from Url provided is printed below");
				System.out.println(ans);
			} catch (IOException e) {
				e.printStackTrace();
			} 
				
			
		}

}
