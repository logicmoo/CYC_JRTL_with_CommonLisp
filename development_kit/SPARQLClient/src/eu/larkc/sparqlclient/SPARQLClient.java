package eu.larkc.sparqlclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SPARQLClient {

	private String sServerHttp;
	public SPARQLClient(String sServerAddress){
		sServerHttp=sServerAddress+"/sparql/";
	}
	
	public String askQuery(String sQuery){
		Logger log = LoggerFactory.getLogger(SPARQLClient.class);
		try {
			String sUrlEncodedQ ="query="+URLEncoder.encode(sQuery,"UTF-8");
			log.info(sUrlEncodedQ);
			
			String reply = fetchUrl(sServerHttp+"?"+ sUrlEncodedQ);
			
			return reply;
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return sQuery;
	}
	
	
	private String fetchUrl(String urlStr) {
		String pageStr = null;
		HttpURLConnection connection = null;
		try {
			URL url = new URL(urlStr);
			if (url.getProtocol().equals("http")) {
				// connect to the web server
				connection = (HttpURLConnection) url
						.openConnection();
				connection.setRequestMethod("GET");
				connection.connect();
				// retrieve the content
				InputStream stream = connection.getInputStream();
				pageStr = convertStreamToString(stream);
				
			}
		} catch (IOException e) {
			InputStream stream = connection.getErrorStream();
			if (stream == null) return "Cannot reach server";
			return convertStreamToString(stream);
			//System.out.println();
			//e.printStackTrace();
			
			// handle any errors ...
		}
		return pageStr;
	}
	
	private String convertStreamToString(InputStream is) {
		/*
		 * To convert the InputStream to String we use the
		 * BufferedReader.readLine() method. We iterate until the BufferedReader
		 * return null which means there's no more data to read. Each line will
		 * appended to a StringBuilder and returned as String.
		 */
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();

		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
		} catch (IOException e) {
			// handle errors ...
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return sb.toString();
	}
	
}
