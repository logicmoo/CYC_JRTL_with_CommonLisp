package org.appdapter.core.store;

import java.util.Map;
import com.hp.hpl.jena.rdf.model.Model;

public class RepoModelEvent
{
    public static final String REPO_EVENT_NAMESPACE = "ccrt:";
    public static final String repoKey = "repo";
    public static final String sheetName = "modelName";
    public static final String loadStatus = "loadStatus";
    public static final String timestamp = "timeStampMS";
    public static final String pending = "Pending";
    public static final String loading = "Loading";
    public static final String loaded = "Loaded";
    public static final String unloading = "Unloading";
    public static final String unloaded = "Unloaded";
    public static final String cancelling = "Cancelling";
    public static final String cancelled = "Cancelled";
    public static final String error = "Error";
    
    public static void createEvent(final Model saveEventsTo2, final Map eventProps) {
    }
}

/*

	Total time: 13 ms
	
*/