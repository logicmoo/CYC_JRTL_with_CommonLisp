package eu.larkc.core.pluginManager.distributed.GAT;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.distributed.GAT.RemotePluginManager.RemoteContainerStub;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.Reasoner;
import eu.larkc.plugin.transform.InformationSetTransformer;

/**
 * LocalCollectionInformationSetTransformManager is a LocalPluginManager for InformationSetTransformer plugins
 *
 * It will generate a Collection<InformationSet> on the output queue for each Collection<InformationSet> that comes in
 * on the input stream
 *
 * @author Mick Kerrigan, Barry Bishop
 */
public class RemoteCollectionInformationSetTransformManager extends RemotePluginManager <Collection<InformationSet>, Collection<InformationSet>> {

	/**
	 * The InformationSetTransformer plugin to be managed
	 */
	private final InformationSetTransformer mTransformer;

	/**
	 * Constructor thats takes the plugin to be manages, the input, and the output queues as input
	 *
	 * @param transformer The InformationSetTransformer plugin to be managed
	 * @param inputQueue The queue from which input messages will come from the previous plugin in the pipeline
	 * @param outputQueue The queue onto which output messages should be put to send them to the next plugin in the pipeline
	 * @param resourceURI The URI of the resource the job is sent to
	 * @param LarKC_Location  The path to LarKC on the remote resource, empty if LarKC is not preinstalled
	 */
	public RemoteCollectionInformationSetTransformManager(InformationSetTransformer transformer, Queue<Collection<InformationSet>> inputQueue, Queue<Collection<InformationSet>> outputQueue, String resourceURI, String LarKC_Location) {
		super(inputQueue, outputQueue, resourceURI, LarKC_Location);
		mTransformer = transformer;
		super.setThread(new TransformerThread());
	}

	/**
	 * The Thread within which the InformationSetTransformer Management occurs
	 *
	 * @author Mick Kerrigan, Barry Bishop
	 */
	class TransformerThread extends Thread {
		TransformerThread() {
			super("Information Set Transformer");
		}

		@Override
		public void run() {
			for (;;) {
				PluginManager.Message controlMessage = getNextControlMessage();

				if (controlMessage.equals(PluginManager.Message.NEXT)) {
					alertPrevious();

					Collection<InformationSet> resource = getNextInput();

					if (resource == null) {
						putNextOutput(null);
						break;
					}

					Collection <InformationSet> transformedResources = new ArrayList <InformationSet> ();

					int count=0;
					for (InformationSet is : resource){
						//transformedResources.add(mTransformer.transform(is, new Contract() {}, new Context() {}));
						count++;
						//DEBUG

							try
							{
								java.io.FileOutputStream fos = new java.io.FileOutputStream("input_from_remote_adaptor_" + count);
								java.io.ObjectOutputStream oos= new java.io.ObjectOutputStream(fos);
								oos.writeObject(is);
								oos.close(); fos.close();
							}
							catch(IOException ex)
							{
								ex.printStackTrace();
							}


							ArrayList<Object> result_is = runJobAL(mTransformer.getClass(), is, new Contract() {}, new Context() {});
							InformationSet isnew = (InformationSet) result_is.get(0);
							is = (InformationSet) result_is.get(1);

							try
							{
								java.io.FileOutputStream fos = new java.io.FileOutputStream("output_from_remote_adaptor_" + count);
								java.io.ObjectOutputStream oos= new java.io.ObjectOutputStream(fos);
								oos.writeObject(isnew);
								oos.close(); fos.close();
							}
							catch(IOException ex)
							{
								ex.printStackTrace();
							}
							try
							{
								java.io.FileOutputStream fos = new java.io.FileOutputStream("output_from_remote_adaptor_" + count + "_is");
								java.io.ObjectOutputStream oos= new java.io.ObjectOutputStream(fos);
								oos.writeObject(is);
								oos.close(); fos.close();
							}
							catch(IOException ex)
							{
								ex.printStackTrace();
							}
						//DEBUG


						/*
						//DEBUG
							try
							{
								java.io.FileOutputStream fos = new java.io.FileOutputStream("input_from_local_adaptor_" + count);
								java.io.ObjectOutputStream oos= new java.io.ObjectOutputStream(fos);
								oos.writeObject(is);
								oos.close(); fos.close();
							}
							catch(IOException ex)
							{
								ex.printStackTrace();
							}

							InformationSet isnew1 = mTransformer.transform(is, new Contract() {}, new Context() {});

							try
							{
								java.io.FileOutputStream fos = new java.io.FileOutputStream("output_from_local_adaptor_" + count);
								java.io.ObjectOutputStream oos= new java.io.ObjectOutputStream(fos);
								oos.writeObject(isnew1);
								oos.close(); fos.close();
							}
							catch(IOException ex)
							{
								ex.printStackTrace();
							}

						//DEBUG
						*/

						//!!!!!!!!!!!!!!!!!!!!!!!!!!!!ACHTUNG!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! isnew1 !!!!!!!!!!!!!!!!
						transformedResources.add(isnew);
					}

					putNextOutput(transformedResources);
				}
				else if (controlMessage.equals(PluginManager.Message.STOP)) {
					break;
				}
			}
			stopPrevious();
		}
	}

	public ArrayList<Object> runJobAL(Class<?> klass, InformationSet is, Contract contract, Context context) {
		return (ArrayList<Object>) super.runJobAL(klass, is);
	}

	public static void main(String[] args) {
		runRemoteJob(new RemoteContainerStub() {
			@Override
			public ArrayList<Object> invoke(ArrayList<Object> params) throws Exception {
				Class<?> transformerClass = (Class<?>) params.get(0);
				InformationSet is = null;
				is = (InformationSet) params.get(1);

				InformationSetTransformer transformer = (InformationSetTransformer) transformerClass.getConstructor().newInstance();
				InformationSet isnew = transformer.transform(is, new Contract() {}, new Context() {});

				ArrayList<Object> result = new ArrayList<Object>();
				result.add(isnew);
				result.add(is);

				return result;
			}
		});
		/*
		try {
			System.out.println("Hallo from remote transformer");

			Map<String, String> properties = new HashMap<String, String>();
			properties.put("larkc.job.input", "input");

			File input = GAT.createFile("input");
			FileInputStream inputStream = GAT.createFileInputStream(input);
			ObjectInputStream oin = new ObjectInputStream(inputStream);

			Object parameters = oin.readObject();

			System.out.println(parameters);


		} catch (Exception e) {
			e.printStackTrace();
		}
			*/

	}


}
