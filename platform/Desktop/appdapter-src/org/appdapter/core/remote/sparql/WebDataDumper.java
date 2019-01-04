package org.appdapter.core.remote.sparql;

import org.apache.http.HttpResponse;
import org.apache.http.Header;
import org.slf4j.Logger;
import org.apache.http.client.methods.HttpPost;

public class WebDataDumper
{
    public static void dumpRequestInfo(final HttpPost postReq, final Logger log) {
        log.info("Request method: " + postReq.getMethod());
        log.info("Request line: " + postReq.getRequestLine());
        final Header[] allHeaders = postReq.getAllHeaders();
        log.info("POST header count: " + allHeaders.length);
        for (final Header h : allHeaders) {
            log.info("Header: " + h);
        }
    }
    
    public static void dumpResponseInfo(final HttpResponse response, final String rqSummary, final String entityText, final Logger log) throws Throwable {
        log.info("Request Summary: " + rqSummary);
        if (response != null) {
            log.info("Response status line: " + response.getStatusLine());
        }
        else {
            log.warn("Got null response to request: " + rqSummary);
        }
        if (entityText != null) {
            log.info("Entity Text: " + entityText);
        }
    }
}

/*

	Total time: 27 ms
	
*/