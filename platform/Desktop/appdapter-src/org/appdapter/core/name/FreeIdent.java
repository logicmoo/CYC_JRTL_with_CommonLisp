package org.appdapter.core.name;

import java.util.HashMap;
import org.appdapter.core.log.Debuggable;
import java.net.URI;
import org.slf4j.Logger;
import java.util.Map;

public class FreeIdent implements Ident
{
    private final String myAbsUri;
    private final String myLocalName;
    public static boolean THROW_ON_CHANGE;
    public static boolean AUTO_CORRECT_CHANGES;
    static Map<String, String> fragmentToURI;
    static Map<String, String> autoCorrectedURI;
    static final Map<String, Throwable> fragmentToCreationFrame;
    static final Logger theLogger;
    
    public FreeIdent(final Ident src) {
        this(src.getAbsUriString(), src.getLocalName());
    }
    
    public FreeIdent(final String absUri, final String localName) {
        if (!absUri.endsWith(localName)) {
            throw new RuntimeException("Uri[" + absUri + "] does not end with LocalName[" + localName + "]");
        }
        this.myLocalName = localName;
        this.myAbsUri = previousURI(absUri);
    }
    
    public FreeIdent(final String absUriWithOneHash) {
        final int len = absUriWithOneHash.length();
        final int hashIndex = absUriWithOneHash.indexOf(35);
        if (hashIndex < 0 || hashIndex > len - 2) {
            throw new RuntimeException("Uri does not contain text after hash '#' [" + absUriWithOneHash + "]");
        }
        this.myLocalName = absUriWithOneHash.substring(hashIndex + 1);
        this.myAbsUri = previousURI(absUriWithOneHash);
    }
    
    public String getAbsUriString() {
        return this.myAbsUri;
    }
    
    public String getLocalName() {
        return this.myLocalName;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != null && o instanceof Ident) {
            final String otherAbsUri = ((Ident)o).getAbsUriString();
            return this.myAbsUri.equals(otherAbsUri);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.myAbsUri.hashCode();
    }
    
    @Override
    public String toString() {
        return "FreeIdent[absUri=" + this.myAbsUri + "]";
    }
    
    public Ident getIdent() {
        return (Ident)this;
    }
    
    public static String previousURI(final String uri) {
        synchronized (FreeIdent.autoCorrectedURI) {
            String newSuggest = FreeIdent.autoCorrectedURI.get(uri);
            if (FreeIdent.AUTO_CORRECT_CHANGES && newSuggest != null) {
                return newSuggest;
            }
            newSuggest = correctURI(uri);
            if (newSuggest.equals(uri)) {
                return uri;
            }
            if (FreeIdent.AUTO_CORRECT_CHANGES) {
                return newSuggest;
            }
            return uri;
        }
    }
    
    public static String correctURI(String uri) {
        synchronized (FreeIdent.fragmentToCreationFrame) {
            try {
                final URI good = URI.create(uri);
                final String fragment = getFragmentKey(good, uri);
                if (fragment == null) {
                    Debuggable.oldBug("(not a QNAME?) " + uri + " debuggable=" + Debuggable.getStackVars(), new Object[0]);
                    return uri;
                }
                if (fragment.length() < 3) {
                    if ("0123456789.".indexOf(fragment.charAt(0)) != -1) {
                        Debuggable.showFrame((Throwable)Debuggable.createFrame("(number) " + uri + " debuggable=" + Debuggable.getStackVars()));
                        return fragment;
                    }
                    FreeIdent.theLogger.debug("MAYBE BUG: (short name) " + uri + " debuggable=" + Debuggable.getStackVars());
                    return uri;
                }
                else {
                    final String old = FreeIdent.fragmentToURI.get(fragment);
                    Debuggable.oldBug("LocalName Prefix ", new Object[] { fragment, old, uri });
                    if (old == null) {
                        uri = uri.intern();
                        FreeIdent.fragmentToCreationFrame.put(fragment, (Throwable)Debuggable.createFrame("Creation frame for " + uri));
                        FreeIdent.fragmentToURI.put(fragment, uri);
                        return uri;
                    }
                    return old;
                }
            }
            catch (Throwable e) {
                final Throwable rc = e.getCause();
                if (rc != e && rc != null) {
                    e = rc;
                }
                Debuggable.oldBug("BAD JENA RESOURCE " + uri + " " + e, new Object[0]);
                return uri;
            }
        }
    }
    
    private static String getFragmentKey(final URI good, final String uri) {
        String frag = uri;
        if (good != null) {
            frag = good.getFragment();
        }
        if (frag == null) {
            int li = uri.lastIndexOf(35);
            if (li > -1) {
                frag = uri.substring(li + 1);
            }
            else {
                li = uri.lastIndexOf(47);
                frag = uri.substring(li + 1);
            }
        }
        return frag;
    }
    
    public static boolean verifyURI(final String uri) {
        try {
            if (uri.equals("#Property Name")) {
                return false;
            }
            previousURI(uri);
            return true;
        }
        catch (Exception e) {
            FreeIdent.theLogger.error("OLD BUG:  BAD JENA RESOURCE " + uri + " " + e);
            return false;
        }
    }
    
    public static boolean checkChanged(final String what, final String localName, final String prevURI, final String uri) {
        if (prevURI == null || prevURI.equals(uri)) {
            return true;
        }
        final String err = what + " Change: " + uri + " WAS " + prevURI;
        FreeIdent.theLogger.error(err);
        if (Debuggable.isTesting()) {
            Debuggable.showFrame((Throwable)FreeIdent.fragmentToCreationFrame.get(localName));
            Debuggable.showFrame((Throwable)Debuggable.createFrame(err));
        }
        if (FreeIdent.THROW_ON_CHANGE) {
            throw new RuntimeException(err);
        }
        return false;
    }
    
    static {
        FreeIdent.THROW_ON_CHANGE = false;
        FreeIdent.AUTO_CORRECT_CHANGES = false;
        FreeIdent.fragmentToURI = new HashMap<String, String>();
        FreeIdent.autoCorrectedURI = new HashMap<String, String>();
        fragmentToCreationFrame = new HashMap<String, Throwable>();
        theLogger = Debuggable.getLogger((Class)FreeIdent.class);
    }
}

/*

	Total time: 57 ms
	
*/