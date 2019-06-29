/*
 * Created on Mar 1, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package eclisp;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedList;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.core.runtime.CoreException;
import com.franz.jlinker.*;

/**
 * @author tmdias
 * 
 *         TODO To change the template for this generated type comment go to
 *         Window - Preferences - Java - Code Style - Code Templates
 */
public class EclispServer {

	public static void runServer() {
		Thread t = new Thread() {
			public void run() {
				com.franz.jlinker.LispConnector.class.getName();
				String s = System.getProperty("user.home") + "/JavaToLisp.trp";
				com.franz.jlinker.JavaLinkDist.advertise(s, "", 0, -1);
			}
		};
		t.start();
	}

	private static IJavaProject getProject(String projectName) {
		return JavaCore.create(ResourcesPlugin.getWorkspace().getRoot().getProject(projectName));
	}

	private static ICompilationUnit getProjectUnit(String projectName, String qualifiedUnitName)
			throws JavaModelException, CoreException {
		IJavaProject project = getProject(projectName);
		ICompilationUnit unit = null;

		unit = project.findType(qualifiedUnitName).getCompilationUnit();

		return unit;
	}

	public static LinkedList getProjectUnitNames(String projectName) throws JavaModelException, CoreException {
		IPackageFragment[] projectPackages = null;
		LinkedList units = new LinkedList();

		projectPackages = getProject(projectName).getPackageFragments();
		ArrayList foo = new ArrayList();

		for (int i = 0; i < projectPackages.length; i++) {
			if (projectPackages[i].getKind() == IPackageFragmentRoot.K_SOURCE) {
				ICompilationUnit[] packageUnits = projectPackages[i].getCompilationUnits();
				for (int j = 0; j < packageUnits.length; j++) {
					try {
						final ICompilationUnit iCompilationUnit = packageUnits[j];
						if (iCompilationUnit != null) {
							final IType findPrimaryType = iCompilationUnit.findPrimaryType();
							if (findPrimaryType != null) {
								final String fullyQualifiedName = findPrimaryType.getFullyQualifiedName();
								if (fullyQualifiedName != null) {
									units.add(fullyQualifiedName);
								} else {
									warn("null findPrimaryType= " + findPrimaryType + "getFullyQualifiedName");
								}
							} else {
								warn("null iCompilationUnit= " + iCompilationUnit + "findPrimaryType");
							}
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}

		return units;
	}

	/**
	 * @param string
	 */
	private static void warn(String string) {
		// TODO Auto-generated method stub
		System.err.println(string);

	}

	public static ASTNode parseProjectUnit(String projectName, String qualifiedUnitName)
			throws JavaModelException, CoreException {
		ASTParser parser = ASTParser.newParser(AST.JLS2);
		parser.setSource(getProjectUnit(projectName, qualifiedUnitName));
		parser.setResolveBindings(true);
		if (true)
			return parser.createAST(null);
		try {
			return (ASTNode) parser.getClass()
					.getDeclaredMethod("createAST", Class.forName(" org.eclipse.core.runtime.IProgressMonitor"))
					.invoke(parser, null);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (true)
				throw new AbstractMethodError("EclispServer.parseProjectUnit throw IllegalAccessException");

		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (true)
				throw new AbstractMethodError("EclispServer.parseProjectUnit throw IllegalArgumentException");

		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (true)
				throw new AbstractMethodError("EclispServer.parseProjectUnit throw InvocationTargetException");

		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (true)
				throw new AbstractMethodError("EclispServer.parseProjectUnit throw NoSuchMethodException");

		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (true)
				throw new AbstractMethodError("EclispServer.parseProjectUnit throw SecurityException");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (true)
				throw new AbstractMethodError("EclispServer.parseProjectUnit throw ClassNotFoundException");

		}
		return null;
	}
}