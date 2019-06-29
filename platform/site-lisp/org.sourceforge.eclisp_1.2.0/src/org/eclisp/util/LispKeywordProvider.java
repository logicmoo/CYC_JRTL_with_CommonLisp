/*
 * Created on 19.04.2004
 *
 * 
 */
package org.eclisp.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Plugin;
import org.eclisp.EclispPlugin;


/**
 * The LispKeywordProvider is a Singleton which retrieves the lisp keywords from file.
 * It stores them for retrival later on.
 * 
 * @author Moritz Post
 *
 */
public class LispKeywordProvider {

    
    private static ArrayList keywords = null;
    
    private static ArrayList generateKeywordList() {
    
        ArrayList list = new ArrayList(1000);
        String str;
        InputStream lispKeywordsFile = null;

        Plugin eclispPlugin = EclispPlugin.getDefault();        
        
        try {
            lispKeywordsFile = eclispPlugin.openStream(new Path("lisp-keywords.txt"));
            
            BufferedReader in = new BufferedReader(new InputStreamReader( lispKeywordsFile ));
            
            while ((str = in.readLine()) != null) {
                list.add(str.trim());
            }
            in.close();
            
        } catch (IOException e1) {            
            e1.printStackTrace();
        }

        //File file = new File("D:/java/projects/eclipse/eclisp/lisp-keywords.txt");
         
        return list;
    }
    
    public static ArrayList getKeywordList() {
        if(keywords == null) {
            return generateKeywordList();
        } else {
            return keywords;
        }
    }
}
