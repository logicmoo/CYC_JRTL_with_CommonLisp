package org.opencyc.api;

import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

public class OpenCycBuildInfo extends Properties
{
    public OpenCycBuildInfo() throws IOException {
        final InputStream is = this.getClass().getClassLoader().getResourceAsStream(this.getResourcePath());
        if (is == null) {
            throw new IOException("Could not load resource [" + this.getResourcePath() + "]");
        }
        this.load(is);
    }
    
    public String getResourcePath() {
        return this.getClass().getPackage().getName().replace(".", System.getProperty("file.separator")) + "/BuildInfo.properties";
    }
    
    public void printAll() {
        final String header = "==  " + this.getClass().getSimpleName() + "  ===================================================";
        System.out.println(header);
        System.out.println("Resource Path: " + this.getResourcePath());
        final List<String> keys = new ArrayList<String>(this.stringPropertyNames());
        Collections.sort(keys);
        for (final String key : keys) {
            System.out.println("  " + key + ": " + this.getProperty(key));
        }
        for (int i = 0; i < header.length(); ++i) {
            System.out.print("=");
        }
        System.out.println();
    }
    
    public static void main(final String[] args) {
        try {
            final OpenCycBuildInfo info = new OpenCycBuildInfo();
            info.printAll();
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
        finally {
            System.exit(0);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 73 ms
	
	Decompiled with Procyon 0.5.32.
*/