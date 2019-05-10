package org.appdapter.core.remote.sparql;

import org.apache.http.util.EntityUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.NameValuePair;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.HttpGet;
import org.slf4j.Logger;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.HttpClient;
import org.appdapter.core.log.BasicDebugger;

public class WebDataClient extends BasicDebugger
{
    protected HttpClient myHttpCli;
    
    public WebDataClient() {
        this.myHttpCli = (HttpClient)new DefaultHttpClient();
    }
    
    public String execGet(final String url, final boolean debugFlag, final String rqSummary) {
        String resultText = null;
        try {
            resultText = execGetRequest(this.myHttpCli, url, this.getLogger(), debugFlag, rqSummary);
        }
        catch (Throwable t) {
            this.getLogger().error("Problem during execGet", t);
        }
        return resultText;
    }
    
    protected static String execGetRequest(final HttpClient httpCli, final String url, final Logger log, final boolean debugFlag, final String rqSummary) throws Throwable {
        String resultText = null;
        final HttpGet getReq = new HttpGet(url);
        final HttpResponse response = httpCli.execute((HttpUriRequest)getReq);
        resultText = extractResponseEntityText(response, log, debugFlag, rqSummary);
        return resultText;
    }
    
    public String execPost(final String url, final List<NameValuePair> nvps, final boolean debugFlag) {
        String resultText = null;
        try {
            resultText = execPostRequest(this.myHttpCli, url, nvps, this.getLogger(), debugFlag);
        }
        catch (Throwable t) {
            this.getLogger().error("execPost() caught exception: {} \n================== Bonus Direct Stack Trace to STDERR", t);
            t.printStackTrace();
        }
        return resultText;
    }
    
    protected static String execPostRequest(final HttpClient httpCli, final String postURL, final List<NameValuePair> nvps, final Logger log, final boolean debugFlag) throws Throwable {
        log.info("Building post request for URL: " + postURL);
        final HttpPost postReq = new HttpPost(postURL);
        final UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity((List)nvps, "UTF-8");
        postReq.setEntity((HttpEntity)formEntity);
        String rqSummary = "Posting [URL=" + postURL + "]";
        if (debugFlag) {
            rqSummary = rqSummary + ", pairs=[" + nvps + "]";
            WebDataDumper.dumpRequestInfo(postReq, log);
        }
        final HttpResponse response = httpCli.execute((HttpUriRequest)postReq);
        log.debug("HttpClient returned a response, now extracting");
        final String resultText = extractResponseEntityText(response, log, debugFlag, rqSummary);
        if (debugFlag) {
            WebDataDumper.dumpResponseInfo(response, rqSummary, resultText, log);
        }
        return resultText;
    }
    
    protected static String extractResponseEntityText(final HttpResponse response, final Logger log, final boolean debugFlag, final String rqSummary) throws Throwable {
        String entityText = null;
        final HttpEntity resEntity = response.getEntity();
        if (resEntity != null) {
            if (debugFlag) {
                log.debug("Got response entity: " + resEntity);
                log.debug("Response content length: " + resEntity.getContentLength());
                log.debug("Chunked?: " + resEntity.isChunked());
            }
            entityText = EntityUtils.toString(resEntity);
            resEntity.consumeContent();
        }
        else {
            log.warn("No entity attached to response to request: " + rqSummary);
        }
        return entityText;
    }
}

/*

	Total time: 38 ms
	
*/