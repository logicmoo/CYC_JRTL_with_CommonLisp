package jasko.tim.lisp.builder;

import jasko.tim.lisp.editors.actions.*;
import jasko.tim.lisp.util.*;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.texteditor.MarkerUtilities;

public class LispMarkers {

	private static final String LISP_MARKER = "jasko.tim.lisp.lispMarker";
	private static final String LISP_BREAKPOINT_MARKER = "jasko.tim.lisp.lispMarkerBreakpoint";
	private static final String LISP_WATCH_MARKER = "jasko.tim.lisp.lispMarkerWatch";
	private static final String LISP_COMPILE_MARKER = "jasko.tim.lisp.lispMarkerCompile";
	private static final String LISP_ERROR_MARKER = "jasko.tim.lisp.lispMarkerCompileError";
	private static final String LISP_WARNING_MARKER = "jasko.tim.lisp.lispMarkerCompileWarning";
	private static final String LISP_PACKAGE_NOT_LOADED_MARKER = "jasko.tim.lisp.lispMarkerCompilePackage";

	public static void deleteMarkers(IFile file){
		if(file != null){
			try{
				file.deleteMarkers(LISP_MARKER, true, IResource.DEPTH_ZERO);
			} catch (CoreException e1) {
 				e1.printStackTrace();
 			}				
		}
	}

	public static void deleteMarkers(IFile file, int offset, int length){
		if( file == null || offset < 0 || length <= 0 ){
			return;
		}
		try{
			IMarker[] markers = 
				file.findMarkers(LISP_MARKER, true, IResource.DEPTH_ZERO);
			for( IMarker m: markers ){
				int moffset = (Integer)m.getAttribute(IMarker.CHAR_START); 
				if( moffset >= offset && moffset <= offset + length ){
					m.delete();
				}
			}
			markers = file.findMarkers(LISP_MARKER, true, IResource.DEPTH_ZERO);
		} catch (CoreException e1) {
			e1.printStackTrace();
		}
	}

	public static void deleteCompileMarkers(IFile file){
		if(file != null){
			try{
				file.deleteMarkers(LISP_COMPILE_MARKER, true, IResource.DEPTH_ZERO);
				} catch (CoreException e1) {
 					e1.printStackTrace();
 				}				
		}
	}

	public static void deleteCompileMarkers(IFile file, int offset, int length){
		if( file == null || offset < 0 || length <= 0 ){
			return;
		}
		try{
			IMarker[] markers = 
				file.findMarkers(LISP_COMPILE_MARKER, true, IResource.DEPTH_ZERO);
			for( IMarker m: markers ){
				int moffset = (Integer)m.getAttribute(IMarker.CHAR_START); 
				if( moffset >= offset && moffset <= offset + length ){
					m.delete();
				}
			}
		} catch (CoreException e1) {
			e1.printStackTrace();
		}
	}

	public static void deletePackageErrorMarkers(IProject project){
		if( project == null ){
			return;
		}
		try{
			for(IMarker m: project.findMarkers(LISP_PACKAGE_NOT_LOADED_MARKER, 
					false, IResource.DEPTH_INFINITE)){
				m.delete();
			}
			return;
		} catch (CoreException e) {
			return;
		}
	}
	
	
	private static void addMarker(IFile file, int offset, int length, String msg,
			int severity, String markerType){

		Map<String, Object> attr = new HashMap<String, Object>();
		attr.put(IMarker.CHAR_START, new Integer(offset));
		attr.put(IMarker.CHAR_END, new Integer(offset+length));
		
		attr.put(IMarker.MESSAGE, msg);
		attr.put(IMarker.SEVERITY, severity);
		
		try {
			MarkerUtilities.createMarker(file, attr, markerType);
		} catch (CoreException e) {
				System.out.println(e);
		}							
	}
	
	private static void addMarker(IFile file, int offset, int length, int lineNum,
			String msg, int severity, String markerType){

		Map<String, Object> attr = new HashMap<String, Object>();
		attr.put(IMarker.CHAR_START, new Integer(offset));
		attr.put(IMarker.CHAR_END, new Integer(offset+length));
		
		attr.put(IMarker.MESSAGE, msg);
		attr.put(IMarker.SEVERITY, severity);
		attr.put(IMarker.LINE_NUMBER, lineNum);
		
		try {
			MarkerUtilities.createMarker(file, attr, markerType);
		} catch (CoreException e) {
				System.out.println(e);
		}							
	}
	
	public static void addCompileErrorMarker(IFile file, int offset, int length, String msg){
		addMarker(file,offset,length,msg,IMarker.SEVERITY_ERROR,LISP_ERROR_MARKER);
	}
	
	public static void addCompileWarningMarker(IFile file, int offset, int length, String msg){
		addMarker(file,offset,length,msg,IMarker.SEVERITY_WARNING,LISP_WARNING_MARKER);
	}
	
	public static void addCompileMarker(IFile file, int offset, int length, String msg, boolean isError){
		if( isError ){
			addCompileErrorMarker(file,offset,length,msg);
		} else {
			addCompileWarningMarker(file,offset,length,msg);
		}
	}
	
	
	public static void addPackageMarker(IFile file, int offset, int endOffset, 
			int lineNum, String pkg){
		String errorMessage = "Package "+pkg+
		" not loaded. \nRight click on corresponding .asd file and select\nLoad Package";
		//Below prevents adding of same error message to marker, which gets annoying after
		//10 error messages rage down your screen when you hover the mouse over error marker!
		boolean addMarker = true;
		try {
			for(IMarker m: file.findMarkers(LISP_PACKAGE_NOT_LOADED_MARKER, 
					false, IResource.DEPTH_INFINITE)) {
				if (m.getAttribute(IMarker.MESSAGE).equals(errorMessage)) {
					addMarker = false; break;
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			 addMarker = false; e.printStackTrace();
		}
		//
		if (addMarker) {
			addMarker(file,offset,endOffset - offset + 1, lineNum, errorMessage,
					IMarker.SEVERITY_ERROR,LISP_PACKAGE_NOT_LOADED_MARKER);
		}
	}

	// multiple function definition marker
	public static void addMultMarker(IFile file, int offsetStart, int offsetEnd, boolean last){
		String msg = "";
		if( last ){
			msg = "The definition redefines the function defined earlier in the file";
		} else {
			msg = "The function is redefined by other definition(s) later in the file";
		}
		addMarker(file,offsetStart,offsetEnd-offsetStart+1,msg,
				IMarker.SEVERITY_WARNING,LISP_WARNING_MARKER);
	}

	public static void addCommaMarker(IFile file, int offset, int lineNum){
		addMarker(file,offset,1,lineNum,"Comma is not inside a backquote",
				IMarker.SEVERITY_ERROR,LISP_ERROR_MARKER);
	}
	
	public static void addParenMarker(IFile file, int offset, 
			int lineNum, boolean unmatchedOpen){
		String msg = "";
		if(unmatchedOpen){
			msg = "Unmatched open parenthesis.";
		} else {
			msg = "Unmatched closing parenthesis.";
		}
		addMarker(file,offset,1,lineNum,msg,
				IMarker.SEVERITY_ERROR,LISP_ERROR_MARKER);
	}

	private static void addBreakpointMarker(IFile file, int offset, int length, int lineNum){
		Map<String, Object> attr = new HashMap<String, Object>();
		attr.put(IMarker.CHAR_START, new Integer(offset));
		attr.put(IMarker.CHAR_END, new Integer(offset+length));
		
		attr.put(IMarker.MESSAGE, "break");
		attr.put(IMarker.LINE_NUMBER, lineNum);
		
		addMarker(file,offset,length,lineNum,"break",
				IMarker.SEVERITY_INFO,LISP_BREAKPOINT_MARKER);
	}

	private static void deleteBreakpointMarkers(IFile file){
		if(file != null){
			try{
				file.deleteMarkers(LISP_BREAKPOINT_MARKER, true, IResource.DEPTH_ZERO);
			} catch (CoreException e1) {
 				e1.printStackTrace();
 			}				
		}
	}

	public static void updateBreakpointMarkers(IFile file, IDocument doc){
		if( file == null || doc == null ){
			return;
		}
		deleteBreakpointMarkers(file);
		if (!doc.get().equals("")) {
			String[] markersData = doc.get().split(BreakpointAction.splitregx);
		
		int offset = 0;
		int len = BreakpointAction.start.length();
		for( String line : markersData ){
			if( 0 != offset ){
				int[] range = null;
				try{
					range = LispUtil.getCurrentExpressionRange(doc,offset - len + 2);
		        } catch (BadLocationException e) {
		            e.printStackTrace();
		        }
		        if( range == null ){
		            range = new int[2];
		            range[0] = offset - len;
		            range[1] = len;
		        }
		        int lineNum = -1;
		        try{
			        lineNum = doc.getLineOfOffset(range[0] + 1);		        	
		        } catch (BadLocationException e) {
		            e.printStackTrace();
		        }
				addBreakpointMarker(file, range[0], range[1], lineNum);
			}
			offset += line.length() + len;
		}
		}
	}
	
	private static void addWatchMarker(IFile file, int offset, int length, int lineNum){
		Map<String, Object> attr = new HashMap<String, Object>();
		attr.put(IMarker.CHAR_START, new Integer(offset));
		attr.put(IMarker.CHAR_END, new Integer(offset+length));
		
		attr.put(IMarker.LINE_NUMBER, lineNum);
		attr.put(IMarker.MESSAGE, "watch");
		
		addMarker(file,offset,length,lineNum,"watch",
				IMarker.SEVERITY_INFO,LISP_WATCH_MARKER);
	}

	private static void deleteWatchMarkers(IFile file){
		if(file != null){
			try{
				file.deleteMarkers(LISP_WATCH_MARKER, true, IResource.DEPTH_ZERO);
			} catch (CoreException e1) {
 				e1.printStackTrace();
 			}				
		}
	}

	public static void updateWatchMarkers(IFile file, IDocument doc){
		if( file == null || doc == null ){
			return;
		}
		deleteWatchMarkers(file);
		if (!doc.get().equals("")) {
		String[] markersData = doc.get().split(WatchAction.splitregx);
		int offset = 0;
		int len = WatchAction.start.length();
		for( String line : markersData ){
			if( 0 != offset ){
				int[] range = null;
				try{
					range = LispUtil.getCurrentExpressionRange(doc,offset - len + 2);
		        } catch (BadLocationException e) {
		            e.printStackTrace();
		        }
		        if( range == null ){
		            range = new int[2];
		            range[0] = offset - len;
		            range[1] = len;
		        }
		        int lineNum = -1;
		        try{
			        lineNum = doc.getLineOfOffset(range[0] + 1);		        	
		        } catch (BadLocationException e) {
		            e.printStackTrace();
		        }
				addWatchMarker(file, range[0], range[1], lineNum);
			}
			offset += line.length() + len;
		}
		}
	}
	
	private static void deleteTasks(IFile file) {
		if( file == null ){
			return;
		}		
		try {
			file.deleteMarkers(IMarker.TASK, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {
		}
	}

	private static void addTask(IFile file, String message, int lineNumber) {
		if( file == null ){
			return;
		}
		try {
			IMarker marker = file.createMarker(IMarker.TASK);
			marker.setAttribute(IMarker.MESSAGE, message);
			if (lineNumber == -1) {
				lineNumber = 1;
			}
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public static void updateTasks(IFile file, IDocument doc) {
		if( file == null || doc == null){
			return;
		}
		deleteTasks(file);
		if (!doc.get().equals("")) {
			String[] lines = doc.get().split("\n");

			int numLines = 0;
			for( String line : lines ){
				if ( line.matches(".*;.*TODO:.*\\s*") ){
					String[] strs = line.trim().split("TODO:");
					for ( int i = 1; i < strs.length; ++i ) {
						addTask(file,"TODO:" + strs[i],numLines+1);
					}
				}
				++numLines;	
			}
		}
	}

}
