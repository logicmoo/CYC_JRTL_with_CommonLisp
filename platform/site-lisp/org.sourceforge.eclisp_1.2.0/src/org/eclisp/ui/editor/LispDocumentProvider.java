/*
 * Created on 19.04.2004
 * 
 *  
 */
package org.eclisp.ui.editor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.DefaultPartitioner;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.FileDocumentProvider;
import org.eclipse.ui.texteditor.ResourceMarkerAnnotationModel;

/**
 * @author soul
 *  
 */
public class LispDocumentProvider extends FileDocumentProvider {

    private final static String[] TYPES = new String[] { LispPartitionScanner.LISP_MULTILINE_COMMENT};

    private static LispPartitionScanner fgScanner = null;

    public LispDocumentProvider() {
        super();
    }

    /*
     * (non-Javadoc) Method declared on AbstractDocumentProvider
     */
    protected IDocument createDocument(Object element) throws CoreException {
        IDocument document = super.createDocument(element);
        if (document != null) {
            IDocumentPartitioner partitioner = createLispPartitioner();
            document.setDocumentPartitioner(partitioner);
            partitioner.connect(document);
        }
        return document;
    }

    /**
     * Return a partitioner for .java files.
     */
    private IDocumentPartitioner createLispPartitioner() {
        return new DefaultPartitioner(getLispPartitionScanner(), TYPES);
    }

    /**
     * Return a scanner for creating lisp partitions.
     */
    private LispPartitionScanner getLispPartitionScanner() {
        if (fgScanner == null) {
            fgScanner = new LispPartitionScanner();
        }
        return fgScanner;
    }

    /**
     * create AnnotationModel
     */
    protected IAnnotationModel createAnnotationModel(Object element) throws CoreException {
        if (element instanceof IFileEditorInput) {
            IFileEditorInput input = (IFileEditorInput) element;
            return new ResourceMarkerAnnotationModel(input.getFile());
        }
        return super.createAnnotationModel(element);
    }
    
}