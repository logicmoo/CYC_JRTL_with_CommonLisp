package jasko.tim.lisp.builder;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.cusp.LispNode;
import jasko.tim.lisp.cusp.LispParser;
import jasko.tim.lisp.cusp.CuspInterface;
import jasko.tim.lisp.cusp.CuspRunnable;
import jasko.tim.lisp.util.LispUtil;
import jasko.tim.lisp.util.TopLevelItem;
import jasko.tim.lisp.views.ReplView;


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;


import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.PlatformUI;

public class LispBuilder extends IncrementalProjectBuilder {

	public static final String BUILDER_ID = "jasko.tim.lisp.lispBuilder";
	
/*	// We ended up not using asd files for incremental build. However these couple of functions
    // might be useful for future code handling project management with asd files. So I leave them commented out.
	private ArrayList<IFile> asdFiles = null;
	private ArrayList<ArrayList<String>> filesInAsd = null;
	
	private void initAsdFiles(){
		try{
			asdFiles = new ArrayList<IFile>();
			filesInAsd = new ArrayList<ArrayList<String>>();
			for( IResource resource : getProject().members() ){
				if(resource.getType() == IResource.FILE){
					IFile file = (IFile)resource;
					if(file.getFileExtension().equalsIgnoreCase("asd")){
						asdFiles.add(file);
						filesInAsd.add(getFilesInAsd(file));
					}
				}
			}
			return;
		} catch (CoreException e) {
			return;
		}
	}
	
	private ArrayList<String> getFilesInAsd(IFile asdFile){
		ArrayList<String> res = new ArrayList<String>();
		LispNode code = LispParser.parse(asdFile);
		for( LispNode node: code.params ){
			if( node.isCarEqual("defsystem") ){
				for( LispNode subnode : node.getf(":components").params )
				{
					if( subnode.isCarEqual(":file")){
						res.add(subnode.cadr().value); //TODO: cannot handle files in subfolders
					}
				}
			}
		}
		return res;
	}
	
	//TODO: assumes that file is in same folder as asd
	private IFile getAsdForFile(IFile file){
		if( asdFiles == null || file == null){
			return null;
		} else {
			String ext = file.getFileExtension();
			if( ext.equalsIgnoreCase("lisp") || ext.equalsIgnoreCase("cl")){
				String name = file.getName();
				name = name.substring(0, name.length()-1-(ext.length()+1));
				for(int i = 0; i < asdFiles.size(); ++i){
					for(String filename: filesInAsd.get(i)){
						if(filename.equalsIgnoreCase(name)){
							return asdFiles.get(i);
						}
					}
				}
			}
			return null;
		}
	}
*/
	
	class LispDeltaVisitor implements IResourceDeltaVisitor {

		public boolean visit(IResourceDelta delta) throws CoreException {
			if(!LispPlugin.getDefault().getPreferenceStore().getString(PreferenceConstants.BUILD_TYPE)
					.equals(PreferenceConstants.USE_ECLIPSE_BUILD)){
				return true;
			}
			IResource resource = delta.getResource();
			if(resource instanceof IFile){
				IFile file = (IFile)resource;
				switch (delta.getKind()) {
				case IResourceDelta.ADDED:
					// handle added resource
					if ( checkLisp(file) ){
						compileFile(file,false);
					}
					break;
				case IResourceDelta.REMOVED:
					// handle removed resource - TODO: undefine all functions in file before file is removed?
					break;
				case IResourceDelta.CHANGED:
					// handle changed resource
					if ( checkLisp(file) ){
						compileFile(file,false);
					}
					break;
				}
			}
			//return true to continue visiting children.
			return true;
		}
	}

	class LispResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			if (resource.isAccessible()){
				if(LispPlugin.getDefault().getPreferenceStore().getString(PreferenceConstants.BUILD_TYPE)
						.equals(PreferenceConstants.USE_ECLIPSE_BUILD) 
						&&	(resource instanceof IFile && checkLisp((IFile)resource))	){
					compileFile((IFile)resource,false);
				}
				//return true to continue visiting children.
				return true;
			} else {
				return false;
			}
		}
	}


	@SuppressWarnings("unchecked")
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	
	protected void fullBuild(final IProgressMonitor monitor)
		throws CoreException {
		try {
			getProject().accept(new LispResourceVisitor());
		} catch (CoreException e) {
		}
	}


	protected void incrementalBuild(IResourceDelta delta,
		IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		delta.accept(new LispDeltaVisitor());
	}
	

	public static void compileFile(IFile file, boolean makeFasl){
		if( file == null ){
			return;
		}
		if( makeFasl ){
			try{
				CuspInterface cusp = LispPlugin.getDefault().getCusp();
				cusp.sendCompileFile(file.getLocation().toString(), 
						new CompileListener(file,true));
				System.out.printf("Compiling %s\n", file.getLocation().toString());
			} catch (Exception e) {
				e.printStackTrace();
			}			
		} else {
			compileFilePart(file,LispParser.fileToString(file),0);			
		}
	}

	public static void compileFilePart(IFile file, String expr, int offset){
		if(expr == null || expr == ""){
			return;
		}
		try{
			CuspInterface cusp = LispPlugin.getDefault().getCusp();
			if (cusp.isConnected()==true) {
				String filename = file.getName();

				String dir = file.getLocation().toPortableString();
				dir = dir.substring(0, dir.length() - filename.length());
				String pkg = LispUtil.getPackage(LispParser.fileToString(file),offset);
				cusp.sendCompileString(expr, filename, dir, offset, pkg, 
						new CompileListener(file,offset,expr.length()));
			} else {
				System.out.println ("WARNING: Trying to compile file but cusp isn't connected!");
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * This class updates compile markers in source code.
	 * @author sk
	 *
	 */
	public static class CompileListener extends CuspRunnable {
 		IFile file;
 		int offset;
 		int length;
 		boolean compiledByAsd = false;
 		String asdFile = "";
 		boolean removeCompileMarkers = true;
 		boolean switchToPackage = false; //only when compiledByAsd
  		
 		public CompileListener(IFile file, boolean removeCompileMarkers) {
 			this.file = file;
 			offset = 0;
 			length = 0;
 			compiledByAsd = false;
 			asdFile = "";
 			this.removeCompileMarkers = removeCompileMarkers;
  		}
  		
 		public CompileListener(boolean compByAsd, String asdfile, boolean switchToPackage) {
 			this.file = null;
 			offset = 0;
 			length = 0;
 			compiledByAsd = true;
 			asdFile = asdfile;
 			this.switchToPackage = switchToPackage;
  		}
 		
 		public CompileListener(IFile file, int offset, int length) {
 			this.file = file;
 			this.offset = offset;
 			this.length = length;
  		}
  		
  		public void run() {
 			ArrayList<String> files = new ArrayList<String>();
 			if ( file != null && length == 0 && removeCompileMarkers ){
 				LispMarkers.deleteCompileMarkers(file);
  			} else if ( file != null && length > 0) {
  				LispMarkers.deleteCompileMarkers(file,offset,length);
  			}
 			
			ReplView repl = LispPlugin.findREPL();
			if (repl!=null) {
			LispNode res = result;
  			LispNode guts = res.getf(":return").getf(":ok").getf(":cusp-compilation-unit");
  			if ( guts.isEmpty() || guts.value.equalsIgnoreCase("nil") ){
  				if( compiledByAsd ){
  					if( repl != null ){
  	  	  				repl.appendText("Loaded package " + asdFile + "\n");
  	  	  				File asdf = new File(asdFile);
  	  	  				String pkg = asdf.getName();
  	  	  				pkg = pkg.substring(0,pkg.length() - ".asd".length());
  	  	  				repl.switchPackage(pkg);
  					}
  				}
  			} else {
  				int nerrors = 0;
  				int nwarnings = 0;
 				IWorkspaceRoot wk = ResourcesPlugin.getWorkspace().getRoot();
				for (LispNode error: guts.params) {
					String msg = error.getf(":message").value;
					// Make some messages in SBCL prettier
					if( LispPlugin.getDefault().getCusp().implementation.lispType().equalsIgnoreCase("SBCL") ){
						String[] lines = msg.split("\n");
						String lastLine = lines[lines.length-1];
						if( msg.endsWith("is defined but never used.") 
								|| lastLine.startsWith("undefined variable:")){
							msg = lastLine;
						}
					}
					String severity = error.getf(":severity").value;
					LispNode location = error.getf(":location");
					String fileName = location.getf(":file").value.replace("\\", "/");
					String buffer = location.getf(":buffer").value;
					int offset = 0;
					try {
						offset = Integer.parseInt(location.getf(":position").value);
					} catch (NumberFormatException e) {
					}
					
					boolean isError = severity.equalsIgnoreCase(":error");
					if( isError ){
						++nerrors;
					} else {
						++nwarnings;
					}
					
 					if ( file == null && !fileName.equals("") ){
						IFile fl = wk.getFileForLocation(new Path(fileName));
 						if ( fl != null ) {
 							if ( compiledByAsd && !files.contains(fileName) ){
 								files.add(fileName);
 								LispMarkers.deleteCompileMarkers(fl);
 							}
 							LispMarkers.addCompileMarker(fl, offset, 1, msg, isError);
  						}
 					} else if ( file != null && (file.getLocation().toPortableString().equals(fileName)
 							|| file.getName().equals(buffer)
 							|| file.getLocation().toPortableString().equals(buffer))) {
 						LispMarkers.addCompileMarker(file, offset, 1, msg, isError);
  					} else { //cannot resolve error location
 					//	System.out.printf("CompileListener: Filename {%s} is not equal buffer {%s} or filename from compiler notes {%s}\n", 
 					//			file.getLocation().toString(), fileName, buffer);
  					}
				}
				if( compiledByAsd ){
 					String torepl = "Package " + asdFile + " is loaded with ";
 					if( nerrors > 0){
 						torepl += "errors ";
 						//FIXME: some errors and warnings are duplicates - one with file location
 						// and another without - I don't know why
 						// so showing how many errors and warnings lisp reported might be confusing
 						if( nwarnings > 0){
 							torepl = torepl + " and ";
 						} 
 					}
 					if( nwarnings > 0 ){
						torepl += "warnings";
 					}
 					if(repl != null){
 	 	  				repl.appendText(torepl); 						
 					}
				}
			}
			}
		}
	}

	private static boolean checkPackageDependence(LispNode code, IFile file){
		if( file == null ){
			return false;
		}
		try {
			boolean cancompile = true;
			// check if package dependence is satisfied:
			ArrayList<String> pkgs = LispPlugin.getDefault().getCusp().getAvailablePackages(3000);
			for( LispNode node: code.params ){
				String nodetype = node.car().value.toLowerCase();
				// == defpackage
				if( nodetype.equals("defpackage") ){
					pkgs.add(LispUtil.formatPackage(node.cadr().value));
					for( LispNode subnode: node.params){
						String subtype = subnode.car().value.toLowerCase();
						//process nicknames
						if(subtype.equals(":nicknames")){
							for(int i = 1; i < subnode.params.size(); ++i){
								pkgs.add(LispUtil.formatPackage(subnode.get(i).value));
							}
						//process :use	
						} else if (subtype.equals(":use")) {
							for(int i = 1; i < subnode.params.size(); ++i){
								LispNode usepkg = subnode.params.get(i);
								if(!pkgs.contains(LispUtil.formatPackage(usepkg.value))){
									LispMarkers.addPackageMarker(file, usepkg.offset, 
											usepkg.endOffset+1, usepkg.line, 
											LispUtil.formatPackage(usepkg.value));
									cancompile = false;
								}									
							}
						//process :shadowing-import-from and :import-from dependence	
						} else if (subtype.equals(":shadowing-import-from") ||
								    subtype.equals(":import-from")) {
							LispNode usepkg = subnode.cadr();
							if(!pkgs.contains(LispUtil.formatPackage(usepkg.value))){
								if (usepkg.offset == 0) {
									LispMarkers.addPackageMarker(file, subnode.offset,
											subnode.offset+subtype.length(),
											subnode.line, LispUtil.formatPackage(usepkg.value));
								} else {
									LispMarkers.addPackageMarker(file, usepkg.offset, 
											usepkg.endOffset, usepkg.line, 
											LispUtil.formatPackage(usepkg.value));
								}
								cancompile = false;
							}
						}
					}
				// == make-package
				} else if (nodetype.equals("make-package")) {
					pkgs.add(LispUtil.formatPackage(node.cadr().value));
					LispNode nicks = node.getf(":nicknames");
					if(nicks != null){
						for(LispNode nick: nicks.params){
							pkgs.add(LispUtil.formatPackage(nick.value));
						}
					}
					LispNode uses = node.getf(":use");
					if(uses != null){
						for(LispNode usepkg: uses.params){
							if(!pkgs.contains(LispUtil.formatPackage(usepkg.value))){
								if (usepkg.offset == 0) {
									LispMarkers.addPackageMarker(file, node.offset, 
											node.offset + nodetype.length(),
											node.line,
											LispUtil.formatPackage(usepkg.value));
								} else {
									LispMarkers.addPackageMarker(file, usepkg.offset, 
											usepkg.endOffset, usepkg.line,
											LispUtil.formatPackage(usepkg.value));
								}
								cancompile = false;									
							}
						}
					}
				} else if (nodetype.equals("in-package")){
					LispNode pkgnode = node.cadr();
					if(!pkgs.contains(LispUtil.formatPackage(pkgnode.value))){
						if (pkgnode.offset == 0) {
							LispMarkers.addPackageMarker(file, node.offset, 
									node.offset + nodetype.length(), node.line,
									LispUtil.formatPackage(pkgnode.value));
						} else {
							LispMarkers.addPackageMarker(file,pkgnode.offset,
									pkgnode.endOffset, pkgnode.line,
									LispUtil.formatPackage(pkgnode.value));
						}
						cancompile = false;							
					}
				}
			}
			
			return cancompile;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private static void checkMultipleDefuncs(LispNode code, IFile file){
		if( file == null ){
			return;
		}
		ArrayList<TopLevelItem> items = LispUtil.getTopLevelItems(code, "");
		// find multiple forms with same name and package,
		HashMap<String,ArrayList<TopLevelItem>> multItems = new HashMap<String,ArrayList<TopLevelItem>>();
		// add all forms to hashtable
		for( TopLevelItem itm: items){
			String itmTmp = itm.type+","+itm.name+","+itm.pkg;
			if( itm.type.equalsIgnoreCase("in-package")){
				
			} else 	if( multItems.containsKey(itmTmp) ){//duplicate items of modified forms
				multItems.get(itmTmp).add(itm);
			} else {
				ArrayList<TopLevelItem> lst = new ArrayList<TopLevelItem>();
				lst.add(itm);
				multItems.put(itmTmp, lst);
			}
		}
		//process keys that have more than one entry
		for( ArrayList<TopLevelItem> lst: multItems.values() ){
			if( lst.size() > 1 && lst.get(0).type.equalsIgnoreCase("defun")){
				for( int i = 0; i < lst.size() - 1; ++i ){
					int offset = lst.get(i).offset+"defun".length()+2;
					int offsetEnd = offset + lst.get(i).name.length();
					LispMarkers.addMultMarker(file, offset, offsetEnd, false);
				}
				int i = lst.size()-1;
				int offset = lst.get(i).offset+"defun".length()+2;
				int offsetEnd = offset + lst.get(i).name.length();
				LispMarkers.addMultMarker(file,offset,offsetEnd,true);
			}
		}
		
	}
	
	private static boolean checkCommas(LispNode code, IFile file){
		boolean res = true;
		if( code.value.equals(",") && !code.isString){
			LispMarkers.addCommaMarker(file,code.offset,code.line);
			res = false;
		}
		boolean inBackQuote = false;
		for( LispNode node: code.params){
			if(node.value.equals("`")){
				inBackQuote = true;
			} else {
				if(!inBackQuote){
					res = res && checkCommas(node, file);
				}
				inBackQuote = false;
			}
		}
		return res;
	}
	
	//weirdly enough, we use an IFile even when simply saving. Shouldn't we use a Document in which we can get Partitions?
	private static boolean checkParenBalancing(IFile file){
		if( !(file.getFileExtension().equalsIgnoreCase("lisp") 
				|| file.getFileExtension().equalsIgnoreCase("el")
				|| file.getFileExtension().equalsIgnoreCase("cl"))) {
			return false;
		} else {
			try {
				boolean res = true;
				int open = 0;
				int close = 0;
				int lineNum = 1;
				int charOffset = 0;
								
				boolean inQuotes = false;
				boolean inComment = false;
				//each parenData is an array of 3 numbers:
				// paren type: -1 close, 1 open
				// offset
				// lineNum
				ArrayList<int[]> parenData = new ArrayList<int[]>();
				
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(file.getContents()));
				String line = reader.readLine();
				while (line != null) {
					for (int i=0; i<line.length(); ++i) {
						if (inComment) {
							int endComment = line.indexOf("|#", i);
							if (endComment >= 0) {
								charOffset += endComment - i;
								i = endComment;
								inComment = false;
							} else {
								charOffset += line.length() - i;
								i = line.length();
								break;
							}
						}
						char c = line.charAt(i);
					//	if (c=='('||c==')') 
					//	{
					//		int ij=3;
					//	}
						if (c == '(' && !LispUtil.isSpecialCharPosition(line,i)&&!inQuotes && !(i > 1 && line.charAt(i-1) == '\\' && line.charAt(i-2) == '#')) {
							++open;
							parenData.add(new int[]{1,charOffset, lineNum});
						} else if (c == ')' && !LispUtil.isSpecialCharPosition(line,i)&&!inQuotes && !(i > 1 && line.charAt(i-1) == '\\' && line.charAt(i-2) == '#')) {
							++close;
							parenData.add(new int[]{-1,charOffset,lineNum});
							if (close > open) {
								// reset everything so we don't throw off the rest of the matching
								close = open;
								res = false;
								LispMarkers.addParenMarker(file, charOffset, lineNum, false);
							} // if
						} else if (c == ';' && !inQuotes && !(i > 1 && line.charAt(i-1) == '\\' && line.charAt(i-2) == '#')) {
							charOffset += line.length() - i;
							i = line.length();
							break;
						} else if (c == '"' && !((i > 1 && inQuotes && LispUtil.oddSlash(line,i-1)))) {
							//check if item is #\" or \"
							if ((i > 2 && (!inQuotes && (line.charAt(i-1) != '\\' && line.charAt(i-2) != '#'))) 
								|| (i>1&&line.charAt(i-1)!='\\') || i==0
								 ) //This is pretty stupid to do. It won't work if the characacter is on the previous line. thats why we don't use this function!
								inQuotes = !inQuotes;
						} else if (c == '#' && !inQuotes&&!(i > 1 && (line.charAt(i-1) == '\\' || line.charAt(i-2) == '#'))) {
							if (i+1 < line.length()) {
								if (line.charAt(i+1) == '|') {
									inComment = true;
								}
							}
						}
						++charOffset;
					} // for i
					
					++lineNum;
					//one for extra char at end, \r, one for newline?
					charOffset+=2;
					line = reader.readLine();
					
				}
				if (open > close) { //go backwards
					open = 0;
					close = 0;
					for(int k = parenData.size() - 1; k >= 0; --k){
						if( parenData.get(k)[0] == -1 ) {//close
							++close;
						} else {
							++open;
							if(open>close){
								// reset everything so we don't throw off the rest of the matching
								open = close;
								LispMarkers.addParenMarker(file,parenData.get(k)[1],parenData.get(k)[2],true);
							}
						}
					} //for k
					res = false;
				}
				return res;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}			
		}
	}


	//TODO: Deprecate!
	public static boolean checkLisp(IFile resource, int offset, int length) {
		if( !(resource.getName().endsWith(".lisp") || resource.getName().endsWith(".el")
						|| resource.getName().endsWith(".cl"))) {
			return false;
		} else {
			
			try {
				IFile file = (IFile) resource;
				LispMarkers.deleteCompileMarkers(file, offset, length);								
				boolean paren = checkParenBalancing(file);
				LispNode code = LispParser.parse(file);
				boolean pack = checkPackageDependence(code,file);
				boolean commas = checkCommas(code,file);
				checkMultipleDefuncs(code,file);
				return (paren && pack && commas);
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
	}

	public static boolean checkLispWithDoc(IFile resource,IDocument doc) {
		return checkLispWithDoc(resource,doc,0,doc.getLength());		
	}
	
	public static boolean checkLispWithDoc(IFile resource,IDocument doc, int offset, int length) {
		if( !(resource.getName().endsWith(".lisp") || resource.getName().endsWith(".el")
						|| resource.getName().endsWith(".cl"))) {
			return false;
		} else {
			
			try {
				IFile file = (IFile) resource;
				LispMarkers.deleteCompileMarkers(file,offset,length);
				System.out.println("*builder*");
				boolean paren = LispUtil.saveParensBalance(doc, file, 0, doc.getLength());
				boolean checkExtra= LispPlugin.getStore().getBoolean(PreferenceConstants.ON_SAVE_CHECK_EXTRA);	
				boolean pack = true, commas = true;
				if (checkExtra) {
					LispNode code = LispParser.parse(file);
					pack = checkPackageDependence(code,file);
					checkMultipleDefuncs(code,file);
					commas = checkCommas(code,file);	
				}
				
				return (paren&&pack&&commas);
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
	}
	
	public static boolean checkLisp(IFile resource) {
		if( !(resource.getName().endsWith(".lisp") || resource.getName().endsWith(".el")
						|| resource.getName().endsWith(".cl"))) {
			return false;
		} else {
			
			try {
				IFile file = (IFile) resource;
				LispMarkers.deleteCompileMarkers(file);
				System.out.println("*builder*");
				//LispUtil.saveParensBalance(doc, file, 0, doc.getLength()-1);
				boolean paren = checkParenBalancing(file);
				LispNode code = LispParser.parse(file);
				boolean pack = checkPackageDependence(code,file);
				boolean commas = checkCommas(code,file);
				checkMultipleDefuncs(code,file);
				return (paren && pack && commas);
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
	}
}
