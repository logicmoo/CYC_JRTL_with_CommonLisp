/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package eu.larkc.core.pluginManager.distributed.GAT;

import eu.larkc.core.data.InformationSet;
import eu.larkc.core.metadata.PluginRegistry;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.queue.Queue;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.net.InetAddress;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.gridlab.gat.GAT;
import org.gridlab.gat.GATContext;
import org.gridlab.gat.GATInvocationException;
import org.gridlab.gat.GATObjectCreationException;
import org.gridlab.gat.URI;
import org.gridlab.gat.io.File;
import org.gridlab.gat.io.FileInputStream;
import org.gridlab.gat.io.FileOutputStream;
import org.gridlab.gat.resources.JavaSoftwareDescription;
import org.gridlab.gat.resources.JobDescription;
import org.gridlab.gat.resources.ResourceBroker;
import org.gridlab.gat.resources.Job.JobState;

import eu.larkc.core.util.FileTraversal;
import eu.larkc.plugin.Plugin;
import eu.larkc.plugin.transform.InformationSetTransformer;

import java.util.Hashtable;
import org.gridlab.gat.Preferences;
import org.gridlab.gat.GATContext;
import org.gridlab.gat.GAT;
import org.gridlab.gat.URI;
import org.gridlab.gat.io.File;
import org.gridlab.gat.resources.Job;
import org.gridlab.gat.resources.JobDescription;
import org.gridlab.gat.resources.ResourceBroker;
import org.gridlab.gat.resources.SoftwareDescription;
import org.gridlab.gat.resources.Job.JobState;
import org.gridlab.gat.resources.HardwareResourceDescription;
import eu.larkc.core.gatresource.GATResource;


/**
 * RemotePluginManager is a particular implementation of PluginManger that runs within a thread on a 
 * remote machine. A workflow made using LocalPluginManager's has a number of strongly type queues 
 * between each PluginManager that represent the input and output streams to and from the plugin in
 * question.
 * 
 * @author Alexey Cheptsov
 *
 * @param <E> The Input type of the queue that the PluginManager should accept 
 * @param <F> The Output type of the queue that the PluginManager should produce
 */
public abstract class RemotePluginManager <E, F> implements PluginManager {

	/**
	 * The queue for storing and accessing control methods sent by other PluginManagers
	 * 
	 * @see PluginManager.Message
	 */
	private Queue<PluginManager.Message> mControlQueue = new Queue<PluginManager.Message>();
	
	/**
	 * The PluginManager managing the previous plugin in the pipeline
	 */
	private PluginManager mPreviousPlugin;
	
	/**
	 * The thread that the plugin management goes on within
	 */
	private Thread thread;
	
	/**
	 * The queue from which input messages will come from the previous plugin in the pipeline 
	 */
	private Queue<E> inputQueue;
	/**
	 * The queue onto which output messages should be put to send them to the next plugin in the pipeline 
	 */
	private Queue<F> outputQueue;
	
	/**
	 * Constructor thats takes the input and output queues, resource properties, and input/output ID as input
	 * 
	 * @param theInputQueue The queue from which input messages will come from the previous plugin in the pipeline 
	 * @param theOutputQueue The queue onto which output messages should be put to send them to the next plugin in the pipeline 
	 * @param resourceURI The URI of the resource the job is sent to
	 * @param LarKC_Location  The path to LarKC on the remote resource
	 */
	public RemotePluginManager(Queue<E> theInputQueue, Queue<F> theOutputQueue, String resourceURI, String LarKC_Location){
		this.inputQueue = theInputQueue;
		this.outputQueue = theOutputQueue;
		this.LarKC_Location = LarKC_Location;
		this.resourceURI = resourceURI;
	}

	/**
	 * Constructor thats takes the input and output queues, resource properties, and input/output ID as input
	 * 
	 * @param theInputQueue The queue from which input messages will come from the previous plugin in the pipeline 
	 * @param theOutputQueue The queue onto which output messages should be put to send them to the next plugin in the pipeline 
	 * @param resource The GATResource instance which describes the resource parameters
	 * @param input_output_ID The input (for prestage plug-ins) and output (for execute and poststage plug-ins) ID (disk file name)  
	 */
	public RemotePluginManager(Queue<E> theInputQueue, Queue<F> theOutputQueue, GATResource resource, String input_output_ID){
		this.inputQueue = theInputQueue;
		this.outputQueue = theOutputQueue;
		this.resource = resource;
		this.input_output_ID = input_output_ID; // acts as inputID for prestage and outputID for executor
	}
	
	
	/**
	 * @see eu.larkc.core.pluginManager.PluginManager#accept(eu.larkc.core.pluginManager.PluginManager.Message)
	 */
	@Override
	public void accept(Message message) {
		mControlQueue.put(message);
	}
	
	/**
	 * This method enables the next control message that was sent to this PluginManager to be retrieved
	 * 
	 * @return the next control message
	 */
	public Message getNextControlMessage(){
		return mControlQueue.take();
	}

	/**
	 * @see eu.larkc.core.pluginManager.PluginManager#setPrevious(eu.larkc.core.pluginManager.PluginManager)
	 */
	@Override
	public void setPrevious(PluginManager provider) {
		this.mPreviousPlugin = provider;
	}
	
	/**
	 * This method should be called in order to tell the previous plugin in the pipeline to stop sending input on the input queue
	 */
	protected void stopPrevious(){
		if (mPreviousPlugin != null){
			mPreviousPlugin.accept(PluginManager.Message.STOP);
		}
	}
	
	/**
	 * This method should be called in order to tell the previous plugin in the pipeline to send the next piece of input on the input queue
	 */
	protected void alertPrevious(){
		if (mPreviousPlugin != null){
			mPreviousPlugin.accept(PluginManager.Message.NEXT);
		}
	}

	/**
	 * @see eu.larkc.core.pluginManager.PluginManager#start()
	 */
	@Override
	public void start() {
		if (thread != null) {
			thread.start();
		}
	}
	
	/**
	 * This method is used to specify the thread in which the plugin management occurs
	 * 
	 * @param theThread The Thread in which the plugin management occurs
	 */
	protected void setThread(Thread theThread){
		this.thread = theThread;
	}
	
	/**
	 * This method should be called to get the next input from the input queue
	 * 
	 * @return the next element on the input queue
	 */
	protected E getNextInput(){
		return inputQueue.take();
	}
	
	/**
	 * This method should be called to put an output on the output queue
	 * 
	 * @param theF The element to put on the output queue
	 */
	protected void putNextOutput(F theF){
		outputQueue.put(theF);
	}
	
	/* The stuff for the remote execution */
	
	private static Logger log = Logger.getLogger(PluginManager.class
			.getCanonicalName());

	protected String resourceURI;
	protected String LarKC_Location;	
	protected JavaSoftwareDescription sd;
	protected HardwareResourceDescription hd;
	protected JobDescription jd;
	protected File outputFile;
	protected File inputFile;
	protected File ioDir;
	
	/**
	* A simple method for scanning the directory tree and creating a list
	* of prestaged files 
	* 
	* 
	* @param Files 
	* 			The list of files to be scanned
	* @param classpath 
	* 			The classpath variable where the files are enrolled to
	* @param Filter 
	* 			The part of the file path to be cut before enrolling to classpath
	* @param prefix 
	* 			The prefix which is added to the file instead of the value of the Filter parameter
	*            
	*/
	
	private void FileTraversal(java.io.File[] Files, ArrayList<String> classpath, String Filter, String prefix, GATContext context, Preferences gatprefs)
	throws GATObjectCreationException, IOException, URISyntaxException, GATInvocationException
	{
		for (java.io.File file : Files) {
			if (file.isFile()) {
				if (file.getAbsolutePath().endsWith(".jar") || file.getAbsolutePath().endsWith(".class")  ) {
					File src = GAT.createFile(file.getAbsolutePath());
					File dst = GAT.createFile(prefix + file.getCanonicalPath().split(Filter)[1] );
					
					if (file.getAbsolutePath().endsWith(".jar"))
							classpath.add(prefix + file.getCanonicalPath().split(Filter)[1] );

					sd.addPreStagedFile(src, dst);	
				}
			}
			else if (file.isDirectory()) {
				classpath.add(prefix + file.getCanonicalPath().split(Filter)[1] );

				FileTraversal( file.listFiles(), classpath, Filter, prefix, context, gatprefs);
			}
		}
	}
	
	
	/*
	private void FileTraversal(java.io.File[] Files, ArrayList<String> classpath, String Filter, String prefix, GATContext context, Preferences gatprefs)
	throws GATObjectCreationException, IOException, URISyntaxException, GATInvocationException
	{
		for (java.io.File file : Files) {
			if (file.isFile()) {
				if (file.getAbsolutePath().endsWith(".jar") || file.getAbsolutePath().endsWith(".class")  ) {
					File prestage = GAT.createFile("any://" + file.getAbsolutePath());
					sd.addPreStagedFile(prestage);
					classpath.add(file.getName());
				}
			}
			else if (file.isDirectory()) {
				FileTraversal(file.listFiles(), classpath, Filter, prefix, context, gatprefs);
			}
		}
	}
	*/

	
	private void prepareSubmission(Object... params) throws GATObjectCreationException,
	IOException, URISyntaxException, GATInvocationException {

			Class managedClass = (Class) params[0];
						
			String managedPluginURI = managedClass.getCanonicalName().split("\\.")[managedClass.getCanonicalName().split("\\.").length - 1];
			
			// Find out the platform and plug-in files for copying to remote resource
			final String platformPath = new java.io.File("./dist").getCanonicalPath() 
					+ File.separatorChar + "bin" + File.separatorChar;
			java.io.File platformDir =  new java.io.File(platformPath);
			final String pluginPath = new java.io.File("./dist").getCanonicalPath() 
					+ File.separatorChar + "plugins" + File.separatorChar + managedPluginURI;
			java.io.File pluginDir = new java.io.File(pluginPath);

			GATContext context = GAT.getDefaultGATContext();
			Preferences gatprefs = new Preferences();
	        gatprefs.put("ResourceBroker.adaptor.name", "local");    
	        //gatprefs.put("ResourceBroker.adaptor.name", "wsgt4new");
	        //gatprefs.put("File.adaptor.name", "gridftp");
	        context.addPreferences(gatprefs);
			
	        try
			{
				java.io.FileOutputStream fos = new java.io.FileOutputStream("input");
				java.io.ObjectOutputStream oos= new java.io.ObjectOutputStream(fos);
				for (int i=0; i<params.length; i++)
					oos.writeObject(params[i]);
					oos.close(); fos.close();
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
			
		        
			//create local files for plugin input/output. these will be prestaged
			// to the remote machine by JavaGAT, making them available to the plugin
			// running remotely.
			inputFile = GAT.createFile("input");
			outputFile = GAT.createFile("output");
			//inputFile.deleteOnExit();
			//outputFile.deleteOnExit();

			// open an object output stream, to which we'll write the plugin's input
			// data
			
			// we create a sofware description of the remote job, including
			// classpath and main class
			sd = new JavaSoftwareDescription();
			
						
			final ArrayList<String> classpath = new ArrayList<String>();
			// we build up the classpath by iterating through all files on the LarKC
			// platform/plugin path
			// pre-staging platform files
			FileTraversal(platformDir.listFiles(), classpath, platformPath, "platform/", context, gatprefs);
			classpath.add("platform");
			classpath.add("platform/bin");
			// pre-staging plug-in files
			FileTraversal(pluginDir.listFiles(), classpath, pluginPath.split("plugins" + File.separatorChar + managedPluginURI)[0], "", context, gatprefs);
			classpath.add("plugins");
			classpath.add("plugins/" + managedPluginURI );
			
			// now we construct the java class path from the list of jars
			String tmp = eu.larkc.core.util.StringUtils.join(classpath, ":");
			sd.setJavaClassPath(eu.larkc.core.util.StringUtils.join(classpath, ":"));
			// and set the RemotePluginManager as main class for running on a remote machine
			sd.setJavaMain(this.getClass().getCanonicalName());
			
			// we set some necessary system properties: JavaGAT will automatically
			// configure these on the remote JVM
			//Map<String, String> properties = new HashMap<String, String>();
			//properties.put("larkc.job.input", inputFile.getPath());
			//properties.put("larkc.job.output", outputFile.getPath());
			//properties.put("gat.adaptor.path", "platform/javagat/adaptors");
			//sd.setJavaSystemProperties(properties);
			
			sd.setJavaArguments("-Xmx1024M");
						
			// finally, we redirect stdout/stderr for debugging, and setup pre- and
			// post-staging
			sd.setStdout(GAT.createFile("stdout"));
			sd.setStderr(GAT.createFile("stderr"));
			sd.addPreStagedFile(inputFile);
			sd.addPostStagedFile(outputFile);
			
			sd.addAttribute("sandbox.delete", "false");
			
			// in the following we should also add hardware description
			//			Hashtable hattr = new Hashtable();
			//	        hattr.put("username", "myname");
			//	        hattr.put("jobname", "myjob");
			//	        hattr.put("machine.node", "frbw.dgrid.hlrs.de");
	        //	        hd = new HardwareResourceDescription(hattr);
	}

	/**
	* Runs a job on a remote machine. This method will copy all required files
	* to the remote machine, transfer the input data to the remote machine,
	* start the remote job, and transfer the output data back to this machine.
	* The first param must be the class managed.
	* 
	* @param params
	*            list of input parameters to the remote job.
	* @return the output object returned by the remote job.
	*/
	protected ArrayList<Object> runJob(Object... params) {

		ArrayList<Object> result = new ArrayList<Object>();
		
		// we prepare the job submission (setting up prestaging, classpath
		// etc)
		try{
			prepareSubmission(params);
				
			// and submit the job (JavaGAT will transfer the prestage files
			// automatically)
			// on the remote side, the main() method will be executed
			submitJob();
		
			//redirecting the job output to the standard output
			System.out.println("Stdout from the remote Plug-in: ");
			System.out.println("--------------------------------");
			java.io.File stdoutFile = new java.io.File("stdout");
		    java.io.FileInputStream stdoutFis = null;
		    java.io.BufferedInputStream stdoutBis = null;
		    java.io.DataInputStream stdoutDis = null;
			
		    stdoutFis = new java.io.FileInputStream(stdoutFile);
		    stdoutBis = new java.io.BufferedInputStream(stdoutFis);
		    stdoutDis = new java.io.DataInputStream(stdoutBis);
	
		    while (stdoutDis.available() != 0)
		        System.out.println(stdoutDis.readLine());
		    System.out.println("--------------------------------");
		    stdoutFis.close(); stdoutBis.close(); stdoutDis.close();
	
			System.out.println("Stderr from the remote Plug-in: ");
			System.out.println("--------------------------------");
			stdoutFile = new java.io.File("stderr");
		    stdoutFis = null;
		    stdoutBis = null;
		    stdoutDis = null;
			
		    stdoutFis = new java.io.FileInputStream(stdoutFile);
		    stdoutBis = new java.io.BufferedInputStream(stdoutFis);
		    stdoutDis = new java.io.DataInputStream(stdoutBis);
		    	    
		    while (stdoutDis.available() != 0)
		        System.out.println(stdoutDis.readLine());
		    System.out.println("--------------------------------");
		    stdoutFis.close(); stdoutBis.close(); stdoutDis.close();
			
			// and after the job finishes, we read its output (the output file
			// was post-staged to us by JavaGAT automatically)
		    	    
		    java.io.FileInputStream inputStream = new java.io.FileInputStream("output");
			java.io.ObjectInputStream oin = new java.io.ObjectInputStream(inputStream);
			
			while(true) {
				try{
					Object readObj = (Object) oin.readObject();
					result.add(readObj);
				}
				catch(java.io.EOFException e){
					break;
				}
			}
			 
				 
			//outputStream = new ObjectInputStream(GAT.createFileInputStream(outputFile));
			//result = outputStream.readObject();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	* Submits prepared job to remote machine. This method blocks until the
	* remote job finishes.
	*/
	private void submitJob() throws GATObjectCreationException,
		URISyntaxException, GATInvocationException, IOException {
		
		jd = new JobDescription(sd);
		ResourceBroker broker = GAT.createResourceBroker(new URI(
				//"any://localhost"));
				resourceURI));

		org.gridlab.gat.resources.Job job = broker.submitJob(jd);
		
		log.fine("job submitted");
		
		while (job.getState() != JobState.STOPPED
				&& job.getState() != JobState.SUBMISSION_ERROR) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
		}
		log.fine("job done");
		
	}
	
	protected static void runRemoteJob(RemoteContainerStub stub){
				
			System.out.println("Hello from remote (maybe transformer) plug-in");

			//getting the remote machine's hostname
			try{
				java.net.InetAddress localMachine =
						java.net.InetAddress.getLocalHost();	
				System.out.println ("The plug-in is executed on: " +
						localMachine.getHostName());
			} catch(java.net.UnknownHostException e){
				e.printStackTrace();
			}
			
			System.out.println ("The LarKC location is: " +
					System.getProperty("larkc.location"));

			System.out.println ("The input is: " +
					System.getProperty("larkc.job.input"));
			
			System.out.println ("The output is: " +
					System.getProperty("larkc.job.output"));

			ArrayList<Object> parameters = new ArrayList<Object>();
			
			try {
				java.io.FileInputStream inputStream = new java.io.FileInputStream(System.getProperty("larkc.job.input","input));
				java.io.ObjectInputStream oin = new java.io.ObjectInputStream(inputStream);
			
				// read our startup parameters from local input file
				while(true) {
					try{
						Object readObj = (Object) oin.readObject();
						parameters.add(readObj);
					}
					catch(java.io.EOFException e){
						break;
					}
				}
				
				inputStream.close(); oin.close();
				
			} catch(Exception e){
				e.printStackTrace();
			}
			
			Integer size = parameters.size();
			System.out.println(size.toString() + " properties are available");
			
			//Invoking the plug-in
			ArrayList<Object> result = new ArrayList<Object>();
			
			try {
				result = stub.invoke(parameters);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {		
				java.io.FileOutputStream outputStream = new java.io.FileOutputStream(System.getProperty("larkc.job.output", "output"));
				java.io.ObjectOutputStream outStream = new java.io.ObjectOutputStream(outputStream);
			
				for (int i=0; i<result.size(); i++)	{
					Object result_tmp = result.get(i);
					outStream.writeObject(result_tmp);
				}
				
				outStream.close(); outputStream.close();
			} catch(Exception e){
				e.printStackTrace();
			}		
	}
	
	
	protected interface RemoteContainerStub {
			public ArrayList<Object> invoke(ArrayList<Object> params) throws Exception;
	}
	
}