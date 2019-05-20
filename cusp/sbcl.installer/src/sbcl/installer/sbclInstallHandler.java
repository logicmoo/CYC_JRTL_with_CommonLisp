package sbcl.installer;

import org.eclipse.update.core.BaseInstallHandler;
import org.eclipse.update.core.IFeatureContentConsumer;
import org.eclipse.update.core.IFeature;

public class sbclInstallHandler extends BaseInstallHandler {

	private String getArchiveFolder(IFeatureContentConsumer consumer){
		IFeature feature = consumer.getFeature();
		String path = feature.getSite().getURL().getPath();
		String os = System.getProperty("os.name").toLowerCase();
		if( os.contains("windows")){
			path = path.substring(1);
		}
		path += "plugins/";
		path += feature.getVersionedIdentifier().getIdentifier();
		path += "_"+feature.getVersionedIdentifier().getIdentifier();

		return path;
	}

	private String getMsiPath(IFeatureContentConsumer consumer){
		String path = getArchiveFolder(consumer) + "/sbcl.msi";

		path = path.replace('/', '\\');
		System.out.println(path);

		return path;
	}

	private String getArchivePath(IFeatureContentConsumer consumer){
		String path = getArchiveFolder(consumer) + "/sbcl.zip";
		System.out.println(path);

		return path;
	}

	private String getSbclInstallPath(IFeatureContentConsumer consumer){

		/*
		IFeature feature = consumer.getFeature();
		String path = feature.getSite().getURL().getPath();
		String os = System.getProperty("os.name").toLowerCase();
		if( os.contains("windows")){
			path = path.substring(1);
		}
		path = "plugins/sbcl";
		*/
		String path = getArchiveFolder(consumer);
		return path;
	}

	public void completeInstall(IFeatureContentConsumer consumer){
		try{
			String os = System.getProperty("os.name").toLowerCase();
			String cmd = "";
			if (os.contains("windows")){
				cmd = "msiexec /qb! /i \""+getMsiPath(consumer);
				cmd += "\" INSTALLDIR=\""+(getSbclInstallPath(consumer)+"/sbcl/").replace('/', '\\')+"\"";
				System.out.println(cmd);
			} else {
				cmd = "unzip "+getArchivePath(consumer)+" -d ";
				cmd += getSbclInstallPath(consumer);
			}
			System.out.println(cmd);
			Runtime.getRuntime().exec(cmd);
		} catch ( Exception e ){
			e.printStackTrace();
		}
	}

	public void uninstallInitiated(){
		try{
			String os = System.getProperty("os.name").toLowerCase();
			String cmd = "";
			if (os.contains("windows")){
				cmd = "msiexec /qb! /x {2C41C9F0-0C3A-4A8F-BA05-B8B80E4604AF}";
				System.out.println(cmd);
				Runtime.getRuntime().exec(cmd);
			}
		} catch ( Exception e ){
			e.printStackTrace();
		}
	}
}
