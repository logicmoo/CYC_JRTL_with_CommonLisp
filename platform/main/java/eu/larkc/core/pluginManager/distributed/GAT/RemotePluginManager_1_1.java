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

	protected GATResource resource;
	protected String input_output_ID;
	

	/**
	* Prestages input data (method's parameters) to the remote machine with GAT as a disk file with the given ID (this.inputpu_output_ID).
	*  
	* @param params
	*            list of input parameters to be prestaged.
	* @return ID of the stored data (disk file on the remote resource)
	*/
	protected String doPrestage(Object... params) {

		String DataInputID = input_output_ID; // here we will have a check whether the given input_ID exists. 
											  // otherwise DataIntputID will be generated
		
		java.io.FileOutputStream fos;
		java.io.ObjectOutputStream oos;
		
		try{
			fos = new java.io.FileOutputStream("input");
			oos= new java.io.ObjectOutputStream(fos);
			for (int i=0; i<params.length; i++)
				oos.writeObject(params[i]);
			oos.close(); fos.close();
		} catch(IOException ex) {
				ex.printStackTrace();
		} 

		
		GATContext context = GAT.getDefaultGATContext();
		Preferences gatprefs = new Preferences();
		gatprefs.put("File.adaptor.name", resource.FileAdaptor);    
		context.addPreferences(gatprefs);
		try {
			GAT.createFile(context, "input").copy(new URI("any://" + resource.URI + "/" + resource.WorkDir + "/" + DataInputID));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return DataInputID;
	}
	
	/**
	* Poststages output data (specified with this.inputpu_output_ID) to the local machine
	*  
	* @return List of objects contained in the poststaged data file
	*/
	protected ArrayList<Object> doPoststage() {

		ArrayList<Object> result = new ArrayList<Object>();
		
		String DataOutputID = input_output_ID; // here we will have a check whether the given output_ID exists. 
											   // otherwise DataOuttputID will be generated
						
		try{
			GATContext context = GAT.getDefaultGATContext();
			Preferences gatprefs = new Preferences();
			gatprefs.put("File.adaptor.name", resource.FileAdaptor);    
			context.addPreferences(gatprefs);
			try {
				GAT.createFile(context,"any://" + resource.URI + "/" + resource.WorkDir + "/" + DataOutputID).copy(new URI("output"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
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
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return result;
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
	protected String runJob(Object... params) {

		Class managedClass = (Class) params[0];
		String inputDataID = (String) params[1];

		try{
			
			//Step 1. Submission preparation

				GATContext context = GAT.getDefaultGATContext();
				Preferences gatprefs = new Preferences();
		        gatprefs.put("ResourceBroker.adaptor.name", resource.Broker);
		        context.addPreferences(gatprefs);
		        
				JavaSoftwareDescription sd = new JavaSoftwareDescription();
				// !!!!Fix me to add the iterator for plug-in/lib entries  !!!!
				String managedPluginURI = managedClass.getCanonicalName().split("\\.")[managedClass.getCanonicalName().split("\\.").length - 1];
				
				String classpath = resource.LarKCDir+"/bin/larkc-platform.jar:" + resource.LarKCDir+"/plugins/"+managedPluginURI+":" + resource.LarKCDir+"/plugins/"+managedPluginURI+"/lib";	
				java.io.File pluginLibDir = new java.io.File("plugins/"+managedPluginURI+"/lib");											
				for (java.io.File file : pluginLibDir.listFiles())
					if (file.isFile())
						if (file.getAbsolutePath().endsWith(".jar") || file.getAbsolutePath().endsWith(".class")  )
							classpath += ":"+ resource.LarKCDir+"/plugins/"+managedPluginURI+"/lib/"+file.getName();
				
				System.out.println("Classpath: " + classpath);
				sd.setJavaClassPath(classpath);
				
				sd.setJavaMain(this.getClass().getCanonicalName());
			
				// we set some necessary system properties: JavaGAT will automatically
				// configure these on the remote JVM
				Map<String, String> properties = new HashMap<String, String>();
				properties.put("larkc.job.input", resource.WorkDir + "/" + inputDataID);
				properties.put("larkc.job.output", resource.WorkDir + "/" + input_output_ID);
				properties.put("larkc.location", resource.LarKCDir);
				sd.setJavaSystemProperties(properties);

				sd.setExecutable(resource.JavaDir + "/java");
				sd.setJavaArguments(resource.JavaArgs);
										
				// finally, we redirect stdout/stderr for debugging, and setup pre- and
				// post-staging
				sd.setStdout(GAT.createFile("stdout"));
				sd.setStderr(GAT.createFile("stderr"));
				
				sd.addAttribute("sandbox.delete", "false");
			
			// Step 2 - Job submission
				
				JobDescription jd = new JobDescription(sd);
				ResourceBroker broker = GAT.createResourceBroker(new URI(
						"any://" + resource.URI));

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
		
			// Step 3 - analysis of the job execution
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
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return input_output_ID;
	}
	
	
	/**
	* Contains the code executed on the remote machine
	* 
	* @param stub 
	*            stub for adapting to a concrete plug-in type
	*/
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