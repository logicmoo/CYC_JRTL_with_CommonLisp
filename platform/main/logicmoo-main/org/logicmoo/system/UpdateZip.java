/**
 *
 */
package org.logicmoo.system;
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class UpdateZip {
	public static void main(String[] args) throws IOException {
		updateUnits(args[0]);
		args = org.logicmoo.system.Startup.extractOptions(UpdateZip.class, args);
	}

	static boolean startedUpdateUnits = false;

	/**
	* @throws MalformedURLException
	* @throws IOException
	*/
	public synchronized static void updateUnits(String name) {
		if (startedUpdateUnits)
			return;
		startedUpdateUnits = true;
		try {
			zipMap("units/" + name + "/unrepresented-terms.cfasl", "units" + name + ".zip", "units/");
			zipMap("data/caches/" + name + "/generic-singular-nl-generation-fort-cache.fht", "data" + name + ".zip", "data/");
			zipMap("data/scg-repo-v2/service.properties", "scg-repo-v2.zip", "data/");
			//zipMap("webapps/webapp-manifest.xml", "webapps" + name + ".zip", "./");
			zipMap("httpd/htdocs/javascript/similarity.js", "httpd.zip", "httpd/");
		} catch (Throwable t) {
			Startup.addUncaught(t);
		}

	}

	public static void zipMap(String fileName, String zipname, String outDir) {
		try {

			File fileDir2 = new File(new File(".."), "platform");
			if (!fileDir2.isDirectory()) {
				if (!Startup.isUnderAjax() && !Startup.keepGoing)
					throw new RuntimeException("Not exists dir " + fileDir2);
			}
			Startup.getSetProp("LARKC_HOME", "larkc.home");
			File fileDir = new File(System.getProperty("larkc.home", fileDir2.getAbsolutePath()));
			File testfile = new File(fileDir, fileName);
			if (!testfile.exists()) {
				System.err.println("Not exists " + testfile);
				URL url;
				url = new URL("http://www.logicmoo.org/downloads/" + zipname);
				// dmiles machine url = new
				// URL("http://10.0.0.180/downloads/units5022.zip");
				System.err.println("Downloading " + url);
				File del = unpackArchive(url, new File(fileDir, outDir));
				del.delete();
			} else {
				System.err.println("Exists " + testfile);
			}
		} catch (Throwable e) {
			Startup.addUncaught(e);
			e.printStackTrace();
			if (!Startup.keepGoing)
				throw new RuntimeException(e);
		}
	}

	/**
	 * Unpack an archive from a URL
	 *
	 * @param url
	 * @param targetDir
	 * @return the file to the url
	 * @throws IOException
	 */
	public static File unpackArchive(URL url, File targetDir) throws IOException {
		if (!targetDir.exists()) {
			targetDir.mkdirs();
		}
		InputStream in = new BufferedInputStream(url.openStream(), 1024);
		// make sure we get the actual file
		File zip = File.createTempFile("arc", ".zip", targetDir);
		zip.deleteOnExit();
		OutputStream out = new BufferedOutputStream(new FileOutputStream(zip));
		copyInputStream(in, out);
		in.close();
		out.close();
		System.err.println(".. ");
		System.err.println("Unpacking.. " + zip);
		unpackArchive(zip, targetDir);
		System.err.println("Completed " + targetDir.getAbsolutePath());
		return zip;
	}

	/**
	 * Unpack a zip file
	 *
	 * @param theFile
	 * @param targetDir
	 * @return the file
	 * @throws IOException
	 */
	public static File unpackArchive(File theFile, File targetDir) throws IOException {
		if (!theFile.exists()) {
			throw new IOException(theFile.getAbsolutePath() + " does not exist");
		}
		if (!buildDirectory(targetDir)) {
			throw new IOException("Could not create directory: " + targetDir);
		}
		ZipFile zipFile = new ZipFile(theFile);
		for (Enumeration entries = zipFile.entries(); entries.hasMoreElements();) {
			ZipEntry entry = (ZipEntry) entries.nextElement();
			File file = new File(targetDir, File.separator + entry.getName());
			if (!buildDirectory(file.getParentFile())) {
				throw new IOException("Could not create directory: " + file.getParentFile());
			}
			if (!entry.isDirectory()) {
				copyInputStream(zipFile.getInputStream(entry), new BufferedOutputStream(new FileOutputStream(file)));
			} else {
				if (!buildDirectory(file)) {
					throw new IOException("Could not create directory: " + file);
				}
			}
		}
		zipFile.close();
		return theFile;
	}

	public static void copyInputStream(InputStream in, OutputStream out) throws IOException {
		byte[] buffer = new byte[1024 * 1024];
		int len = in.read(buffer);
		while (len >= 0) {
			out.write(buffer, 0, len);
			len = in.read(buffer);
		}
		out.flush();
		System.err.flush();
	}

	public static boolean buildDirectory(File file) {
		return file.exists() || file.mkdirs();
	}
}