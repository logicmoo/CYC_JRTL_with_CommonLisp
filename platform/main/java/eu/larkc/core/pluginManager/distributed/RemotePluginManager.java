package eu.larkc.core.pluginManager.distributed;

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
	 * Constructor thats takes the input and output queues as input
	 * 
	 * @param theInputQueue The queue from which input messages will come from the previous plugin in the pipeline 
	 * @param theOutputQueue The queue onto which output messages should be put to send them to the next plugin in the pipeline 
	 */
	public RemotePluginManager(Queue<E> theInputQueue, Queue<F> theOutputQueue, String resourceURI){
		this.inputQueue = theInputQueue;
		this.outputQueue = theOutputQueue;
		
		this.resourceURI = resourceURI;
	}
	
	/**
	 * @see eu.larkc.core.pluginManager.PluginManager#accept(eu.larkc.core.pluginManager.PluginManager.Message)
	 */
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
	protected JavaSoftwareDescription sd;
	protected HardwareResourceDescription hd;
	protected JobDescription jd;
	protected ObjectOutputStream inputStream;
	protected ObjectInputStream outputStream;
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
	private void FileTraversal(java.io.File[] Files, ArrayList<String> classpath, String Filter, String prefix)
	throws GATObjectCreationException, IOException, URISyntaxException, GATInvocationException
	{
		for (java.io.File file : Files) {
			if (file.isFile()) {
				if (file.getAbsolutePath().endsWith(".jar") || file.getAbsolutePath().endsWith(".class")  ) {
					File src = GAT.createFile(file.getAbsolutePath());
					File dst = GAT.createFile(prefix + file.getCanonicalPath().split(Filter)[1] );
					classpath.add(prefix + file.getCanonicalPath().split(Filter)[1] );

					sd.addPreStagedFile(src, dst);	
				}
			}
			else if (file.isDirectory()) {
				classpath.add(prefix + file.getCanonicalPath().split(Filter)[1] );

				FileTraversal( file.listFiles(), classpath, Filter, prefix);
			}
		}
	}
	
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
			
			// create local files for plugin input/output. these will be prestaged
			// to the remote machine by JavaGAT, making them available to the plugin
			// running remotely.
			inputFile = GAT.createFile(context, "any:///input");
			outputFile = GAT.createFile(context, "any:///output");
			inputFile.deleteOnExit();
			outputFile.deleteOnExit();

			// open an object output stream, to which we'll write the plugin's input
			// data
			inputStream = new ObjectOutputStream(GAT
					.createFileOutputStream(inputFile));
			
			// we create a sofware description of the remote job, including
			// classpath and main class
			sd = new JavaSoftwareDescription();
			
			final ArrayList<String> classpath = new ArrayList<String>();
			// we build up the classpath by iterating through all files on the LarKC
			// platform/plugin path
			// pre-staging platform files
			FileTraversal(platformDir.listFiles(), classpath, platformPath, "platform/");
			classpath.add("platform");
			classpath.add("platform/bin");
			// pre-staging plug-in files
			FileTraversal(pluginDir.listFiles(), classpath, pluginPath.split("plugins" + File.separatorChar + managedPluginURI)[0], "");
			classpath.add("plugins");
			classpath.add("plugins/" + managedPluginURI );
			
			// now we construct the java class path from the list of jars
			String tmp = eu.larkc.core.util.StringUtils.join(classpath, ":");
			sd.setJavaClassPath(eu.larkc.core.util.StringUtils.join(classpath, ":"));
			// and set the RemotePluginManager as main class for running on a remote machine
			sd.setJavaMain(this.getClass().getCanonicalName());
			
			// we set some necessary system properties: JavaGAT will automatically
			// configure these on the remote JVM
			Map<String, String> properties = new HashMap<String, String>();
			properties.put("larkc.job.input", inputFile.getPath());
			properties.put("larkc.job.output", outputFile.getPath());
			properties.put("gat.adaptor.path", "platform/javagat/adaptors");
			sd.setJavaSystemProperties(properties);
			
			// finally, we redirect stdout/stderr for debugging, and setup pre- and
			// post-staging
			sd.setStdout(GAT.createFile(context, "stdout"));
			sd.setStderr(GAT.createFile(context, "stderr"));
			sd.addPreStagedFile(inputFile);
			sd.addPostStagedFile(outputFile);
			
			
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
	protected Object runJob(Object... params) {
	Object result = null;
	try {
		// we prepare the job submission (setting up prestaging, classpath
		// etc)
		prepareSubmission(params);
	
		// then we write input parameters to input file
		for (int i=0; i<params.length; i++)
			inputStream.writeObject(params[i]);
		
		// and submit the job (JavaGAT will transfer the prestage files
		// automatically)
		// on the remote side, the main() method will be executed
		submitJob();
	
		//redirecting the job output to the standard output
		System.out.println("Output from the remote Plug-in: ");
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

		
		// and after the job finishes, we read its output (the output file
		// was post-staged to us by JavaGAT automatically)
		result = outputStream.readObject();
		
	} catch (StreamCorruptedException e) {
		log.severe("could not read job's output stream");
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		log.severe("could not cast job output");
		e.printStackTrace();
	} catch (IOException e) {
		log.severe("I/O error");
		e.printStackTrace();
	} catch (GATObjectCreationException e) {
		log.severe("GAT file creation error");
		e.printStackTrace();
	} catch (GATInvocationException e) {
		log.severe("GAT job invocation error");
		e.printStackTrace();
	} catch (URISyntaxException e) {
		log.severe("GAT URI syntax error");
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
		outputStream = new ObjectInputStream(GAT.createFileInputStream(outputFile));
		
	}
	
	protected static void runRemoteJob(RemoteContainerStub stub){
		try {
		
			System.out.println("Hello from remote transformer");

			//getting the remote machine's hostname
			try{
				java.net.InetAddress localMachine =
						java.net.InetAddress.getLocalHost();	
				System.out.println ("The plug-in is executed on: " +
						localMachine.getHostName());
			} catch(java.net.UnknownHostException e){
				e.printStackTrace();
			}

			// setup object inputstream from the local input file
			File input = GAT.createFile(System.getProperty("larkc.job.input"));
			FileInputStream inputStream = GAT.createFileInputStream(input);
			ObjectInputStream oin = new ObjectInputStream(inputStream);
			
			// read our startup parameters from local input file
			ArrayList<Object> parameters = new ArrayList<Object>();
			while(true) {
				try{
					Object readObj = (Object) oin.readObject();
					parameters.add(readObj);
				
				}
				catch(java.io.EOFException e){
					break;
				}
			}
			Integer size = parameters.size();
			System.out.println(size.toString() + " properties are available");
			
			//Invoking the plug-in
			Object result = stub.invoke(parameters);
			
			// create the local output file
			File output = GAT.createFile(System.getProperty("larkc.job.output"));
			ObjectOutputStream outStream = new ObjectOutputStream(GAT.createFileOutputStream(output));
			outStream.writeObject(result);
			outStream.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	
	protected interface RemoteContainerStub {
			public Object invoke(ArrayList<Object> params) throws Exception;
	}
	
}