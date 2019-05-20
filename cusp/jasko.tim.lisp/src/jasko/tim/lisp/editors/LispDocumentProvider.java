package jasko.tim.lisp.editors;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.preferences.PreferenceInitializer;
import jasko.tim.lisp.wizards.NewLispFileWizard;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.FileDocumentProvider;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

public class LispDocumentProvider extends FileDocumentProvider {
	public String getEncoding(Object element) {
		return super.getEncoding(element);
	}
	protected IDocument createDocument(Object element) throws CoreException {
		IDocument document = super.createDocument(element);
		//if null, it is an outside file. Open external file prompt.
		if (document==null) {
			//FileEditorInput
			if (element instanceof FileStoreEditorInput) {
				final ExternalLispFileDialog dialog = new ExternalLispFileDialog(LispPlugin.getActiveShell(),(FileStoreEditorInput)element);
				if (PreferenceInitializer.getStore().getBoolean(PreferenceConstants.EXTERNAL_SHOW)) {
					dialog.open();
				} else {
					dialog.finish();
				}
			//	this.disconnect(element);
				return dialog.getDocument();
			}
		}
		else {
			connectPartitioner(document);	
		}	
		return document;
	}
	
	public static void connectPartitioner(IDocument doc) {
		IDocumentPartitioner partitioner = new FastPartitioner(
				new LispPartitionScanner(), LispPartitionScanner.PARTITIONS);
		partitioner.connect(doc);
		doc.setDocumentPartitioner(partitioner);
	}
}