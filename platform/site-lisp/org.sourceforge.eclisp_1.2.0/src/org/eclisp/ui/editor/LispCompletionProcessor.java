/* 
 * Created on 29.04.2004
 * 
 *  
 */
package org.eclisp.ui.editor;

import java.util.ArrayList;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclisp.util.LispKeywordProvider;

/**
 * The auto activation char <code>'('</code> triggers the proposals.
 * Proposals are narrowed down according to the beginning of the entered text.
 * 
 * When starting within a function name (<code>strg+space</code>) the offset is checked to the left.
 * If it finds any one of <code>(, '</code> or a blank the proposals are narrowed down to the available options.
 */
public class LispCompletionProcessor implements IContentAssistProcessor {

    private static final char[] DELIMITER = new char[]{'(', '\'', ' '};
    
    private IDocument fDocument;
    
    /**
     * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeCompletionProposals(org.eclipse.jface.text.ITextViewer, int)
     */
    public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int documentOffset) {
        
        fDocument = viewer.getDocument();

        int del = getDelimiterLeft(documentOffset);
                
        if (del > -1) {
	        try {
	            String toComplet = fDocument.get(del, documentOffset-del);
	            
	            // if offset starts with a delimiter offer all proposals
	            for (int i = 0; i < DELIMITER.length; i++) {
                    if ((toComplet.charAt(0) == DELIMITER[i]) && (toComplet.length() == 1)) {                        
                        return getAllProposals(documentOffset);                        
                    }
                }
	            
	            // otherwise calculate the proposals beginning with the given text	            	            
	            return getProposals(toComplet.substring(1), documentOffset);
	            
	            
	        } catch (BadLocationException e) {
	            e.printStackTrace();
	        }
        }
        return null;        
    }

    /**
     *  
     * @param prefix The prefix of the fiting proposals 
     * @param documentOffset The Position in the Document
     * @return Returns the appropriate proposals starting with prefix 
     */
    private ICompletionProposal[] getProposals(String prefix, int documentOffset) {
        
        ArrayList proposalList = LispKeywordProvider.getKeywordList();                
        ArrayList validProposals = new ArrayList();
        
        for (int i = 0; i < proposalList.size() - 1; i++) {
            String proposal = (String) proposalList.get(i);
            if (proposal.startsWith(prefix)) {
	            validProposals.add(new LispCompletionProposal(
	                    proposal.substring(prefix.length()),
	                    documentOffset,
	                    0,
	                    proposal.length(),
	                    null, 
	                    proposal,
	                    "info for " + proposal));
            }
        }
        
        int myspecialvar = 0;
        
        if (validProposals.size() > 0) {
            ICompletionProposal[] result = new LispCompletionProposal[validProposals.size()];
            validProposals.toArray(result);
            return result; 
        }

        return null;
    }

    /**
     * Constructs an <code>ICompletionProposal</code> array 
     * with all available proposals in <code>LispKeywordProvider</code>.
     * 
     * @param documentOffset The Position in the Document
     * @return Returns all available proposals.
     */
    private ICompletionProposal[] getAllProposals(int documentOffset) {
        ArrayList proposalList = LispKeywordProvider.getKeywordList();
        ICompletionProposal[] result = new ICompletionProposal[proposalList.size() - 1];
        
        for (int i = 0; i < proposalList.size() - 1; i++) {
            String proposal = (String) proposalList.get(i);
            result[i] = (ICompletionProposal)(new LispCompletionProposal(proposal,
                    documentOffset,
                    0,
                    proposal.length()+2,
                    null, 
                    proposal,
                    "info for " + proposal));
        }
        return result;
    }

    /**
     * Find the nearest delimiter to the left based on the offset given.
     * 
     * @see LispCompletionProcessor.DELIMITER
     * 
     * @param offset The current cursor position
     * @return The offset from the delimiter
     */
    private int getDelimiterLeft(int offset) {     
        try {
            offset--;
	        while (offset > 0) {
	            
	            for (int i = 0; i < DELIMITER.length; i++) {
                    if (fDocument.getChar(offset) == DELIMITER[i]) {
                        return offset;
                    }	        
	            }
	            offset--;
	        }
        } catch (BadLocationException e) {
            // ...
        }
        return -1;        
    }

    /**
     * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeContextInformation(org.eclipse.jface.text.ITextViewer, int)
     */
    public IContextInformation[] computeContextInformation(ITextViewer viewer,
            int documentOffset) {
        
//        ArrayList proposalList = LispKeywordProvider.getKeywordList();
//        IContextInformation[] result = new IContextInformation[proposalList.size() - 1];
//
//        for (int i = 0; i < proposalList.size() - 1; i++) {
//            String proposal = (String) proposalList.get(i);
//            result[i] = new ContextInformation(proposal, proposal);
//        }
//        return result;
        return null;
    }

    /**
     * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getCompletionProposalAutoActivationCharacters()
     */
    public char[] getCompletionProposalAutoActivationCharacters() {
        return new char[] {'('};
    }

    /**
     * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getContextInformationAutoActivationCharacters()
     */
    public char[] getContextInformationAutoActivationCharacters() {
//        return new char[] {'('};
        return null;
    }

    /**
     * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getErrorMessage()
     */
    public String getErrorMessage() {
        return null;
    }

    /**
     * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getContextInformationValidator()
     */
    public IContextInformationValidator getContextInformationValidator() {
        // TODO Auto-generated method stub
        return null;
    }
    
}