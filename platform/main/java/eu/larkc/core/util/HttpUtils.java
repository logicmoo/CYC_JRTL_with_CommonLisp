/*
 * LarKC
 */
package eu.larkc.core.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * A collection of handy HTTP methods.
 */
public class HttpUtils {
	/**
	 * HTTP GET request with text/xml content type.
	 * 
	 * @param url The URL to the resource.
	 * @return The returned content.
	 */
	public static String sendGetRequest( String url ) {
		return sendGetRequest( url, "text/xml" );
	}

	/**
	 * Send an HTTP GET request to the given url
	 * 
	 * @param resourceUrl - The full URL of the resource
	 * @return - The response from the end point
	 */
	public static String sendGetRequest( String resourceUrl, String contentType ) {
		String response = mCache.get( resourceUrl );
		if( response == null ) {
			response = "";
			if( resourceUrl.startsWith( "http://" ) ) {
				// Send a GET request
				try {
					// Send data
					URL url = new URL( resourceUrl );
					URLConnection conn = url.openConnection();
					conn.setRequestProperty( "Content-type", contentType + "; charset=UTF-8" );

					// Get the response
					BufferedReader rd = new BufferedReader( new InputStreamReader( conn.getInputStream() ) );
					StringBuffer sb = new StringBuffer();
					String line;
					while( (line = rd.readLine()) != null ) {
						sb.append( line );
					}
					rd.close();
					response = sb.toString();

					mCache.put( resourceUrl, response );
				}
				catch( Exception e ) {
					e.printStackTrace();
				}
			}
		}

		return response;
	}

	/**
	 * Reads data from the data reader and posts it to a server via a POST request.
	 * @param data The data to send
	 * @param endpoint The server's address
	 * @param output Where to write the server's response
	 * 
	 * @throws Exception 
	 */
	public static void postData( Reader data, URL endpoint, Writer output ) throws IOException {
		HttpURLConnection urlc = null;
		try {
			urlc = (HttpURLConnection) endpoint.openConnection();
			try {
				urlc.setRequestMethod( "POST" );
			}
			catch( ProtocolException e ) {
				throw new RuntimeException( "Shouldn't happen: HttpURLConnection doesn't support POST??", e );
			}
			urlc.setDoOutput( true );
			urlc.setDoInput( true );
			urlc.setUseCaches( false );
			urlc.setAllowUserInteraction( false );
			urlc.setRequestProperty( "Content-type", "text/xml; charset=" + "UTF-8" );

			OutputStream out = urlc.getOutputStream();

			try {
				Writer writer = new OutputStreamWriter( out, "UTF-8" );
				pipe( data, writer );
				writer.close();
			}
			finally {
				if( out != null ) {
					try {
	                    out.close();
                    }
                    catch( Exception e ) {
                    }
				}
			}

			InputStream in = urlc.getInputStream();
			try {
				Reader reader = new InputStreamReader( in );
				pipe( reader, output );
				reader.close();
			}
			finally {
				if( in != null )
					in.close();
			}

		}
		finally {
			if( urlc != null )
				urlc.disconnect();
		}
	}

	/**
	 * Pipes everything from the reader to the writer via a buffer
	 */
	private static void pipe( Reader reader, Writer writer ) throws IOException {
		char[] buf = new char[ 1024 ];
		int read = 0;
		while( (read = reader.read( buf )) >= 0 ) {
			writer.write( buf, 0, read );
		}
		writer.flush();
	}

	// Very naive cache!
	private static Map<String, String> mCache = Collections.synchronizedMap( new HashMap<String, String>() );
}
