package org.appdapter.core.store;

import java.net.URL;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.File;
import java.net.MalformedURLException;
import org.appdapter.core.boot.ClassLoaderUtils;
import java.io.InputStream;
import org.appdapter.core.debug.UIAnnotations;
import java.util.Iterator;
import com.hp.hpl.jena.util.FileManager;
import org.appdapter.bind.rdf.jena.model.JenaFileManagerUtils;
import com.hp.hpl.jena.rdf.model.Model;
import java.util.List;
import java.util.Map;
import org.appdapter.fileconv.FileStreamUtils;

public class ExtendedFileStreamUtils extends FileStreamUtils
{
    @UIAnnotations.UISalient
    public static Model getModelIfAvailable(final String sheetLocation, final String sheetName, final Map nsMap, final List<ClassLoader> fileModelCLs) {
        final FileManager fm = JenaFileManagerUtils.getDefaultJenaFM();
        for (final ClassLoader cl : fileModelCLs) {
            fm.addLocatorClassLoader(cl);
        }
        Model m = getModelIfAvailable(sheetLocation + sheetName, fm);
        if (m != null) {
            return m;
        }
        m = getModelIfAvailable(sheetName, fm);
        if (m != null) {
            return m;
        }
        try {
            return fm.loadModel(sheetName, sheetLocation);
        }
        catch (Exception e) {
            return null;
        }
    }
    
    public InputStream openInputStream(String srcPath, List<ClassLoader> cls) throws IOException {
        if (cls == null) {
            cls = (List<ClassLoader>)ClassLoaderUtils.getCurrentClassLoaderList();
        }
        if (srcPath == null) {
            throw new MalformedURLException("URL = NULL");
        }
        IOException ioe = null;
        final File file = new File(srcPath);
        if (file.exists()) {
            try {
                return new FileInputStream(file);
            }
            catch (IOException io) {
                ioe = io;
            }
        }
        if (srcPath.contains(":")) {
            try {
                return new URL(srcPath).openStream();
            }
            catch (MalformedURLException maf) {
                if (ioe == null) {
                    ioe = maf;
                }
            }
            catch (IOException e) {
                ioe = e;
            }
        }
        for (final ClassLoader classLoader : cls) {
            InputStream is = null;
            final URL url = classLoader.getResource(srcPath);
            if (url != null) {
                try {
                    is = url.openStream();
                }
                catch (IOException e2) {
                    ioe = e2;
                }
            }
            else {
                is = classLoader.getResourceAsStream(srcPath);
            }
            if (is != null) {
                return is;
            }
        }
        if (!srcPath.contains(":")) {
            final InputStream is2 = ClassLoader.getSystemResourceAsStream(srcPath);
            if (is2 != null) {
                return is2;
            }
            srcPath = "file:" + srcPath;
            try {
                return new URL(srcPath).openStream();
            }
            catch (MalformedURLException maf2) {
                if (ioe == null) {
                    ioe = maf2;
                }
            }
            catch (IOException e3) {
                ioe = e3;
            }
            if (ioe != null) {
                throw ioe;
            }
        }
        return null;
    }
    
    public InputStream openInputStreamOrNull(final String srcPath, final List<ClassLoader> cls) {
        try {
            return this.openInputStream(srcPath, cls);
        }
        catch (Throwable e) {
            getLogger().error("Bad srcPath={}", (Object)srcPath, (Object)e);
            return null;
        }
    }
}

/*

	Total time: 40 ms
	
*/