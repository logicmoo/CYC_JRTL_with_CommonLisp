/**
 *
 */
package eu.larkc.core.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Implementation of Natural Language Document which is stored as URL and
 * retrieves the content when needed, once retrieved content is cached
 *
 * @author Blaz Fortuna
 *
 */
public class NaturalLanguageDocumentUrl implements NaturalLanguageDocument {

	// link to document
	private String urlStr;
	// retrieved document
	private String documentStr;

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

	// retrieves link stored in urlStr and stores the content in the documentStr
	private void retrieve() {
		try {
			URL url = new URL(urlStr);
			if (url.getProtocol().equals("http")) {
				// connect to the web server
				HttpURLConnection connection = (HttpURLConnection) url
						.openConnection();
				connection.setRequestMethod("GET");
				connection.connect();
				// retrieve the content
				InputStream stream = connection.getInputStream();
				documentStr = convertStreamToString(stream);
			}
		} catch (Exception e) {
			// handle any errors ...
		}
	}

	public NaturalLanguageDocumentUrl(String _urlStr) {
		urlStr = _urlStr;
		documentStr = null;
	}

	public String getText() {
		if (documentStr == null) {
			retrieve();
		}
		return documentStr;
	}

	public String getUrl() {
		return urlStr;
	}
}
