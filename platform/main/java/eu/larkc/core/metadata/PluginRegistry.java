/***
 *   Copyright (c) 1995-2009 Cycorp R.E.R. d.o.o
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package eu.larkc.core.metadata;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;

import eu.larkc.core.orchestrator.CycUtil;
import eu.larkc.plugin.Plugin;
import eu.larkc.plugin.decide.Decider;

/**
 * The LarKC platform plug-in registry.
 * This class stores all the plug-in meta data and is able to instantiate 
 * plug-ins
 * 
 * @author Blaz Fortuna, Luka Bradesko
 *
 */
public class PluginRegistry {
	private static Logger logger = Logger.getLogger(PluginRegistry.class.getCanonicalName());
	
	//count for registered plug-ins. Used also to generate unique id in the internal kb.
   static int iPluginCount=0;
   private final HashMap<String, Class<?>> pluginClassH;
   private Class<Decider> decider=null;
	
   public PluginRegistry() {
      initializeLarkcKb();
      pluginClassH = new HashMap<String, Class<?>>();
   }
	
   /**
    * Generates and returns a new instance of plug-in
    * 
    * @param pluginIdentifier
    *            unique identifier
    * @return new instance of the plug-in
    */
   public Plugin getNewPluginInstance(String pluginId) 
   							throws InstantiationException, IllegalAccessException {
	  if (pluginClassH.containsKey(pluginId)) {
	     Plugin plugin = (Plugin)pluginClassH.get(pluginId).newInstance();
	     return plugin;
	  }
     return null;
   }
	
	/**
	 * Generates and returns a new instance of plug-in
	 * @param pluginIdentifier unique identifier
	 * @return new instance of the plug-in
	 */
	public Plugin getNewPluginInstance(URI pluginId) 
								throws InstantiationException, IllegalAccessException {
		String sPluginId = pluginId.getLocalName();
		return this.getNewPluginInstance(javaTypeToCycConstant(sPluginId));
	}
	
	
	/**
	 * Initialize the core concepts of the Larkc upper-level ontology.
	 */
	private void initializeLarkcKb() {		
		// read larkc ontology
		String LARKC_RDF = "larkc.rdf";
		LARKC_RDF = hereOrConf(LARKC_RDF);
		
		InputStream fstream = asInputStream(LARKC_RDF);
		try {
			if (fstream==null) {
				logger.severe("Cannot find the "+ LARKC_RDF+ " file. PLUGIN REGISTRY MIGHT NOT WORK!!");
				return;
			}
				
			CycUtil.loadRdfTurtle(fstream);
		} catch (Exception e) {
			logger.severe("Error parsing the "+ LARKC_RDF+ ". PLUGIN REGISTRY MIGHT NOT WORK!! "+e.getMessage());
		} 
			
		// add a rule used for inferring connections between plug-ins
		String mtStr = "BaseKB";
		// CycUtil.addConst("pluginByDataConnectsTo");
		// CycUtil.addAssertion(CycUtil.toAssertion("isa", "pluginByDataConnectsTo", "TransitiveBinaryPredicate"), mtStr);
		String forwardRuleStr = 
			  "(#$implies " 
			+ "  (#$and "
			+ "    (#$genls ?X #$larkc-Plugin) "
			+ "    (#$genls ?Y #$larkc-Plugin) "
			+ "    (#$larkc-hasOutputType ?X ?TYPE) "
			+ "    (#$larkc-hasInputType ?Y ?TYPE1) "
			+ "    (#$genls ?TYPE ?TYPE1))"
		//	+ "    (#$isa ?Z ?X)"
		//	+ "    (#$isa ?V ?Y))"
			+ "  (#$larkc-pluginByDataConnectsTo ?X ?Y))";
		CycUtil.addForwardRule(forwardRuleStr, mtStr);
	}

	private InputStream asInputStream(String LARKC_RDF)  {
		InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream(LARKC_RDF);
		if(is!=null) return is;
		is = PluginRegistry.class.getClassLoader().getResourceAsStream(LARKC_RDF);
		if(is!=null) return is;
		is = ClassLoader.getSystemResourceAsStream(LARKC_RDF);
		if(is!=null) return is;
		try {
			return new FileInputStream(new File(LARKC_RDF));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * Load plug-ins from the ini file and from PLATFORM/plugins.
	 */
	public void loadPlugins() {
		String PLUGINS_INI = "plugins.ini";
		PLUGINS_INI = hereOrConf(PLUGINS_INI);
		//checks files and directories in PLATFORM/plugins
		File pluginsDir = new File ("." +File.separatorChar+ "plugins");	
		File[] pluginFiles = pluginsDir.listFiles();
		if (pluginFiles!=null && pluginFiles.length!=0){
			for (File file : pluginFiles) {
				registerPlugins(file);
			}
		}
		else
			logger.warning("No plug-ins in the plugins directory in the " +
								"platform's home directory. Using only plugins.ini");
		
		try {
			// Open the file where the additional plug-in list is written
			InputStream fstream = asInputStream(PLUGINS_INI);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				if (strLine.startsWith("//") || strLine.trim().isEmpty())
					continue;
				if (strLine.endsWith(".wsdl") || strLine.endsWith(".larkc")){
					strLine.replace('/', File.separatorChar);
			    	strLine.replace('\\', File.separatorChar);
					registerPlugins(new File(strLine));
				}
				else
					logger.warning("Invalid line in the " + PLUGINS_INI + " file:" + strLine);
			}// read plugins.ini
			in.close();
			if (this.decider == null) {
				logger.severe("Decider for this instance of the LarKC platform is not specified. "
						+ "Platform cannot run without the decider! Pleas check " + PLUGINS_INI
						+ " file.");
			}
		} catch (IOException e) {
			logger.severe("Error reading the " + PLUGINS_INI + " file:" + e.getMessage());
			Errors.handleError(e);
		}
	}

	private String hereOrConf(String PLUGINS_INI) {
		String was = PLUGINS_INI;
		if(!new File(PLUGINS_INI).canRead()) {
			PLUGINS_INI = "." +File.separatorChar+ "conf" +File.separatorChar+ PLUGINS_INI;
		}
		if(!new File(PLUGINS_INI).canRead()) {
			return was;
		}
		return PLUGINS_INI;
	}
	
	
	/**
	 * Registers the plug-in or more plug-ins in the directory, but only one level deep
	 * 
	 * @param fileOrDir directory or a file location of the plug-in
	 */
	private void registerPlugins(File fileOrDir){
		InputStream wsdlFile = null;
		File fileSource = null;
		
		if (fileOrDir.isDirectory()){
			for (File file : fileOrDir.listFiles()) {
				if (!file.isDirectory())//only check directories one level deep
					registerPlugins(file);
			}//list files in the subdirectory
			return;//after scanned all the files it already registered whatewer it had. So the method should end.
		}//if directory
		else if (fileOrDir.getName().endsWith(".wsdl"))
		{
			try {
				wsdlFile = new FileInputStream(fileOrDir);
			} catch (FileNotFoundException e) {
				logger.warning("File doesn't exists: "+fileOrDir.getAbsolutePath());
				return;
			}
			fileSource = fileOrDir.getParentFile();
		}
		else if (fileOrDir.getName().endsWith(".larkc") ||fileOrDir.getName().endsWith(".jar")){
			try {
				String fileDir = fileOrDir.getName().split("\\.")[0];
				File where = new File(fileOrDir.getParentFile().getAbsolutePath()+ File.separator + fileDir);
				if (where.exists())//if the directory exists already, no need for unzipping
					return;
				unzip(fileOrDir,fileDir);
				registerPlugins(where);
				return;
				
			} catch (ZipException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else 
			return;
		
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder documentBuilder;
		
    	Document document;
		try {
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
			document = documentBuilder.parse(wsdlFile);
		} catch (Exception e) {
			logger.warning("Error parsing the wsdl file in:"+fileOrDir.getAbsolutePath());
			return;
		}
		
		NodeList plugins = document.getElementsByTagName("wsdl:service");
		for (int iPluginNum = 0; iPluginNum < plugins.getLength(); iPluginNum++) {
			Element plugin = (Element) plugins.item(iPluginNum);
			String sPluginId = plugin.getAttribute("name");
			String[] sRdfReferece = plugin.getAttribute("sawsdl:modelReference").split("#");
			String sRdfFile = sRdfReferece[0];
			
			InputStream  fstream = findFileInJarOrDir(fileSource, ".rdf");
			if (fstream== null){
				logger.warning("Error finding the rdf file in " + fileSource.getAbsolutePath() + ". Checking if old (obsolete) plug-in model is used... ");
				File oldRdfLocation = new File(fileSource.getAbsolutePath() + File.separator + sRdfFile);
				try {
					fstream = new FileInputStream(oldRdfLocation);
				} catch (FileNotFoundException e) {
					logger.warning("Cannot find the rdf file in " + oldRdfLocation.getAbsolutePath() + ". Skipping this plug-in registration ");
					return;
				}
			}

			String sRdfClass = sRdfReferece[1];
			try{
				CycUtil.loadRdfTurtle(fstream);
			}
			catch (Exception e)
			{
				logger.warning("Error parsing the "+ sRdfFile + "("+e.getMessage()+")");
			}
				
			NodeList endpoints = plugin.getElementsByTagName("wsdl:endpoint");
			String sLocation = ((Element)endpoints.item(0)).getAttribute("location");
			
			if (sLocation.startsWith("java:")){
				registerJavaPlugin(new URIImpl(sPluginId), sLocation, sRdfClass);
				registerPlugin(sLocation.substring(5),fileSource);
				logger.fine("Registered the " + sLocation.substring(5));
			}
			else{
				logger.warning("Other endpoints than java: are currently not supported ("+sLocation+")");
			}
		}//for all services in wsdl
	}	
	
	/**
	 * Lists the files from given jar file or directory and returns the first occurrence of .wsdl file
	 * @param _theJar
	 * @return tha InputStream of the wsdl file
	 */
	private InputStream findFileInJarOrDir(File _theJar, String _suffix){
		try {
			if (_theJar.isDirectory())
			{
				for (File file : _theJar.listFiles()) {
					if (!file.isDirectory() && file.getName().endsWith(_suffix)){
						return new FileInputStream(file);
					}
				}//list files in the subdirectory
			}
			else
			{
				JarFile jarFile;
				jarFile = new JarFile(_theJar);
			
				Enumeration<JarEntry> enumr = jarFile.entries();
				while (enumr.hasMoreElements()) {
					JarEntry entry = (JarEntry)enumr.nextElement();
			    	if (entry.getName().endsWith(_suffix)){
			    		URLClassLoader cl = URLClassLoader.newInstance(new URL[]{_theJar.toURI().toURL()});
						InputStream is = cl.getResourceAsStream(entry.getName()); 
			    		return is;
			    	}
			    }
			}
			
		} catch (IOException e) {
			logger.warning("Error reading from the "+_theJar.getAbsolutePath());
		} 
		return null;
	}//findWsdlInJar
	
		
	
	/**
	 * Register the plug-in and it's endpoint into the internalKb
	 * @param plugin's URI
	 * @param plugin's endpoint
	 * @param class of this plug-in instance
	 */
	private void registerJavaPlugin(URI _pluginName, String _endpoint, String _class) {		
	   try {
	      String sPluginId = "larkc-pluginInstance-" + iPluginCount;
	      CycUtil.addConst(sPluginId);
	      CycUtil.toConst("http://larkc.eu/plugin#hasUri");
	      
	      /*CycUtil.addRdfTriple(st)
	   	 
	   	 
			// Create a File object on the root of the directory containing the class file
	    	File file = new File(pluginPath);
	        // Convert File to a URL
	        URL url = file.toURI().toURL();
	        URL[] urls = new URL[] { url };    
	        // Create a new class loader with the directory
	        ClassLoader classLoader = new URLClassLoader(urls);	        
	        // Load in the class; MyClass.class should be located in
	        // the directory file:/c:/myplugins/com/myplugin/reasoner
	        Class<? extends Plugin> pluginClass = classLoader.loadClass(pluginName).asSubclass(Plugin.class);
	        
	        //check whether it is a Decider
	        for (Class<?> iface : pluginClass.getInterfaces()) {
				if (iface.getName().equals(Decider.class.getName()))
				{
					this.setDecider((Class<Decider>)pluginClass);//unchecked warning, but it is checked within If statement
					return;//if decider, then no need to register it and its metadata.
				}
			}
	      
	        // register the meta-data
	        String pluginIdentifier = registerPluginMetadata(pluginClass);   
	        // register the plug-in class
	        pluginClassH.put(pluginIdentifier, pluginClass);*/
	   // } catch (MalformedURLException e) {
	   // 	Errors.handleError(e);
	  //  } catch (ClassNotFoundException e) {
	   // 	Errors.handleError(e);
	    } catch (ClassCastException e){
	    //	Errors.handleError("Plugin \""+pluginName +"\" must implement" + Plugin.class.getName()+ " interface",e);
	    }catch (Exception e){
	    //	Errors.handleError("Plugin \""+pluginName +"\" Error",e);
	    }
	    
	}
	

	/**
	 * Finds the class file and loads it with ClassLoader
	 * @param pluginName name with package included
	 * @param pluginPath path to the root of where the class is
	 */
	@SuppressWarnings("unchecked")
	private void registerPlugin(String pluginName, File file) {		
		try {
			//find external plug-in libraries
			ArrayList<URL> vUrl = new ArrayList<URL>();
	    	File libDir = new File(file.getCanonicalPath()+ File.separator + "lib");
	    	if (libDir.exists()){
				for (File jarlib : libDir.listFiles()) {
					if (jarlib.getName().endsWith(".jar"))
					{
						vUrl.add(jarlib.toURI().toURL());
					}
				}//list files in the subdirectory
	    	}
	    	else
			{
	    		logger.warning("Can not find the "+ libDir.getCanonicalPath() +
	    						  ". Assuming this plug-in doesn't have any libraries");
			}
	    	
	      URL url = file.toURI().toURL();
	      vUrl.add(url);
	      URL[] urls = new URL[vUrl.size()];
	      for (int i = 0; i < vUrl.size(); i++) {
	      	urls[i]=vUrl.get(i);
	      }
	      // Create a new class loader with the directory
	      ClassLoader classLoader = new URLClassLoader(urls);	        
	      //load the class
	      Class<? extends Plugin> pluginClass = 
	      				classLoader.loadClass(pluginName).asSubclass(Plugin.class);
	        
	      //check whether it is a Decider
	      for (Class<?> iface : pluginClass.getInterfaces()) {
	      	if (iface.getName().equals(Decider.class.getName()))
				{
	      		if (this.decider != null)
	      			logger.warning("Default decider switched to: " +
	      													pluginClass.getCanonicalName());
					this.setDecider((Class<Decider>)pluginClass);
					logger.info("Decider set to: " + pluginClass.getCanonicalName());
					return;//if decider, then no need to register it and its metadata.
				}
			}
	      
	      // register the meta-data
	      String pluginIdentifier = registerPluginMetadata(pluginClass);   
	      // register the plug-in class
	      pluginClassH.put(pluginIdentifier, pluginClass);
		} catch (MalformedURLException e) {
	    	Errors.handleError(e);
	   } catch (ClassNotFoundException e) {
	    	logger.warning("Classloader cannot find class: "+ e.getMessage() + 
	    																 "! Plug-in not loaded!");
	   } catch (ClassCastException e){
	    	Errors.handleError("Plugin \""+pluginName +"\" must implement" + 
	    											 Plugin.class.getName()+ " interface",e);
	   }catch (Exception e){
	    	Errors.handleError("Plugin \""+pluginName +"\" Error",e);
	   }  
	}

	/**
	 * reads the plug-in meta-data and stores it into the internal platform kb
	 * @param plugin class
	 * @return unique string identifier representing the plugin (package + class name)
	 */
	private String registerPluginMetadata(Class<?> pluginClass) {
		//TODO: temporary hack, until we get the core meta-data through the WSMO file
		//MetaData pluginMetadata = null;
		URI pluginID=null;
		try {
			Plugin plugin = (Plugin)pluginClass.newInstance();
			//pluginMetadata = plugin.getMetaData();
			pluginID = plugin.getIdentifier();
	    } catch (InstantiationException e) {
	    	Errors.handleError(e);
	    	return "";
		} catch (IllegalAccessException e) {
			Errors.handleError(e);
			return "";
		}

		/*get unique identifier for the plug-in using it's package and class name
		 OLD:pluginClass.getCanonicalName().replace('.', '-');	
		 TODO: until we add PluginFN which will resolve URI to the plugin, we suppose that URI is
		 like urn:javaPackage.javaClas		*/
		String pluginIdentifier =  pluginID.getLocalName().replace('.', '-');		
		
		/*
		// add plug-in proxy to the KB
		CycUtil.addConst(pluginIdentifier);
		
		// prepare the micro-theory in which the meta-data is stored
		String mtStr = "UniversalVocabularyMt";
		
		// get the plug-in type
		String pluginType = javaTypeToCycConstant(pluginMetadata.getPluginType());
		// add plug-in type to the KB
		CycUtil.addConst(pluginType);
		// assert that the plug-in type is a collection
		CycUtil.addAssertion(CycUtil.toAssertion("isa", pluginType, "Collection"), mtStr);
		// assert that the plug-in type is a subset of all LarKC plug-ins
		CycUtil.addAssertion(CycUtil.toAssertion("genls", pluginType, "LarkcPlugin"), mtStr);
		// assert connection between the plug-in to its type
		CycUtil.addAssertion(CycUtil.toAssertion("isa", pluginIdentifier, pluginType), mtStr);
		
		// load the methods plug-in exposes to the KB
		// TODO: for now we just add the first method
		MethodMetaData methodMetaData = pluginMetadata.getMethods()[0];
		// assert all the input types the plug-in can handle	
		int inputTypes = methodMetaData.getInputs();
		for (int inputTypeN = 0; inputTypeN < inputTypes; inputTypeN++) {
			for (String dirtyParameterType : methodMetaData.getInputTypes(inputTypeN)) {
				// clean the name of the data type so it is in Cyc-friendly form
				String parameterType = javaTypeToCycConstant(dirtyParameterType);
				// add the type's proxy constant to the KB, in case not there already
				CycUtil.addConst(parameterType);
				// assert that the plug-in accepts this type on the input
				CycUtil.addAssertion(CycUtil.toAssertion(
						"acceptsParameterType", pluginIdentifier,
						inputTypeN + 1, parameterType), mtStr);
			}
		}
		
		// assert output types of the plug-ins
		for (String dirtyParameterType : methodMetaData.getOutputTypes()) {
			// clean the name of the data type so it is in Cyc-friendly form
			String parameterType = javaTypeToCycConstant(dirtyParameterType);
			// add the type's proxy constant to the KB, in case not there already
			CycUtil.addConst(parameterType);
			// assert that the plug-in returns this type on the input
			CycUtil.addAssertion(CycUtil.toAssertion("returnsParameterType",
					pluginIdentifier, parameterType), mtStr);
		}
		*/
		
		// return the identifier string
		return pluginIdentifier;
	}	
		
	public Decider startDecider() {
		try {
			if (decider != null)
				return decider.newInstance();
		} catch (InstantiationException e) {
			Errors.handleError(e);
		} catch (IllegalAccessException e) {
			Errors.handleError(e);
		}		
		return null;
	}
	
	private String javaTypeToCycConstant(String inLarkcConstant) {
		// clean the name of the data type so it is in Cyc-friendly form
		String outCycConstant = inLarkcConstant.replace('.', '-');
		outCycConstant = outCycConstant.replace('<', '_');
		outCycConstant = outCycConstant.replace('>', '_');
		return outCycConstant;
	}
	
	
	private void setDecider(Class<Decider> theDecider) {
		this.decider = theDecider;
	}

	/**
	 * Unzips the .larkc or other file into unzipSubDir directory
	 */
	private void unzip(File file, String unzipSubDir) throws ZipException, 
																				IOException{
		int BUFFER = 2048;
		BufferedOutputStream dest = null;
		BufferedInputStream is = null;
      ZipEntry entry;
      ZipFile zipfile = new ZipFile(file);
      
      Enumeration<? extends ZipEntry> e = zipfile.entries();
      while(e.hasMoreElements()) {
      	entry = (ZipEntry) e.nextElement();
         is = new BufferedInputStream(zipfile.getInputStream(entry));
         int count;
         byte data[] = new byte[BUFFER];
            
         File where = new File(file.getParentFile().getAbsolutePath()+ 
         		                File.separator + unzipSubDir + 
         		                File.separator + entry.getName());
         if (entry.isDirectory()) {
         	where.mkdirs();
            continue;
         } else {
         	where.getParentFile().mkdirs();
            where.createNewFile();
         }
         
         FileOutputStream fos = new FileOutputStream(where.getCanonicalFile());
         dest = new BufferedOutputStream(fos, BUFFER);
         while ((count = is.read(data, 0, BUFFER)) != -1) {
         	dest.write(data, 0, count);
         }
         dest.flush();
         dest.close();
         is.close();
      }
	}
}
