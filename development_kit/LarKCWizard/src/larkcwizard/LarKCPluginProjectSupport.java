package larkcwizard;

//import java.io.File;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;


import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IPathVariableManager;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;
import org.eclipse.ui.internal.ide.undo.FolderDescription;


public class LarKCPluginProjectSupport {

	public static String JAVA_NATURE = "org.eclipse.jdt.core.javanature";
	
	public static IProject createProject(String projectName, URI location,IPath _platformLocation, PluginTemplates.LarKCPlugin _pType) {
		Assert.isNotNull(projectName);
		Assert.isTrue(projectName.trim().length() > 0);
		 
		IProject project = null;
		try {
			project = createBaseProject(projectName, location,_platformLocation, _pType);
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		  
		return project;
	}


	 /**
     * Just do the basics: create a basic project.
     *
     * @param location
     * @param projectName
	 * @throws CoreException 
     */

    private static IProject createBaseProject(String projectName, URI location, 
    												IPath _platformLocation,PluginTemplates.LarKCPlugin _pType) throws CoreException {
    	//check if PLATFORM ROOT exists and create it if not.
    	IPathVariableManager varManager =  ResourcesPlugin.getWorkspace().getPathVariableManager();
    	if (varManager.getValue("PLATFORM_ROOT")==null)//create PLATFORM_ROOT linked resource
    	{
    		varManager.setValue("PLATFORM_ROOT", _platformLocation);
    	}
    	
    	IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
    	project.create(null);
    	project.open(null);
    	
    	//change the name of the project to not have spaces (if there are)
    	StringBuilder newPrjName = new StringBuilder();
		for (int i = 0; i < projectName.length(); i++) {
			if (!(projectName.charAt(i) == ' '))
					newPrjName.append(projectName.charAt(i));
			else
				newPrjName.append(Character.toUpperCase(projectName.charAt(++i)));
		}
		projectName =  newPrjName.toString();

    	
    	//add java nature
    	IProjectDescription description = project.getDescription();
    	description.setNatureIds(new String[] { JavaCore.NATURE_ID });
    	project.setDescription(description, null);
    	
    	//create real Java project
    	IJavaProject javaProject = JavaCore.create(project);
    	
    	//add bin folder (This have to be a link later)
    	IFolder binFolder = project.getFolder("bin");
    	if (!binFolder.exists()) {
    		new java.io.File(_platformLocation + File.separator +"plugins"+File.separator+projectName+File.separator).mkdir();
    		binFolder.createLink(new Path("PLATFORM_ROOT"+File.separator+"plugins"+File.separator+projectName+File.separator), IResource.NONE, null);
    		javaProject.setOutputLocation(binFolder.getFullPath(), null);
    
    		///tests
    		/*System.out.println("FULL PATH: "+binFolder.getFullPath());
    		System.out.println("LOCATION PATH: "+binFolder.getLocation());
    		System.out.println("RAWLOCATION PATH: "+binFolder.getRawLocation());
    		System.out.println("isLinked : "+binFolder.isLinked());*/	 
    	}
    	
    	//add java libraries to it
    	List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
    	IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
    	LibraryLocation[] locations = JavaRuntime.getLibraryLocations(vmInstall);
    	for (LibraryLocation element : locations) {
    	 entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
    	}
    	//add LarKC lib to it
    	JavaCore.setClasspathVariable("PLATFORM_ROOT", _platformLocation, null); // no progress
    	IClasspathEntry myJarEntry =JavaCore.newVariableEntry(new Path("PLATFORM_ROOT"+File.separator+"bin"+File.separator+"larkc-platform.jar"),null,null);
    	
    	entries.add(myJarEntry);
    	
    	//add libs to project class path
    	javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);
    	//javaProject.setRawClasspath(new  IClasspathEntry[] {myJarEntry}, null);
    	
    	//add source folder
    	IFolder sourceFolder = project.getFolder("src");
    	sourceFolder.create(false, true, null);
    	
    	//add source folder to classpath + project folder also to classpath
    	IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);
    	IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
    	IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 2];
    	System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
    	
    	IClasspathEntry prj= JavaCore.newSourceEntry(javaProject.getPath(),new IPath[] {new Path("src"+File.separator)});
    	
    	newEntries[oldEntries.length] = prj;
    	newEntries[oldEntries.length+1] = JavaCore.newSourceEntry(root.getPath());
    	javaProject.setRawClasspath(newEntries, null);
    	
    	//generate java class
    	IPackageFragment pack = root.createPackageFragment(_pType.defaultPackage(), false ,null);
    	pack.createCompilationUnit(projectName+".java", PluginTemplates.getPluginSource(_pType, projectName), false, null);

    	IFile wsdlFile =  javaProject.getProject().getFile(projectName+".wsdl");
    	InputStream oIn = new ByteArrayInputStream(PluginTemplates.getPluginWsdl(_pType, projectName).getBytes());
    	wsdlFile.create(oIn,  false,null);

    	InputStream oIn2 = new ByteArrayInputStream(PluginTemplates.getPluginRdf(_pType, projectName).getBytes());
    	IFile rdfFile =  javaProject.getProject().getFile(projectName+".rdf");
    	rdfFile.create(oIn2, false,null);
    	return project;
    }
}



