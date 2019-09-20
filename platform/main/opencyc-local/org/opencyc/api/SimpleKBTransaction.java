package org.opencyc.api;

import java.util.Collection;
import java.util.Iterator;
import org.opencyc.cycobject.ELMt;
import java.util.ArrayList;
import org.opencyc.cycobject.CycFort;
import java.util.List;

public class SimpleKBTransaction implements KBTransaction
{
    private Boolean bookkeeping;
    private Boolean transcripting;
    private List<CycFort> templates;
    private Boolean wffCheckingDisabled;
    private boolean isTemplateInitialized;
    private List<AssertionData> assertInfo;
    private List<AssertionData> unassertInfo;
    private List<CycFort> createdForts;
    
    public SimpleKBTransaction() {
        this.isTemplateInitialized = false;
        this.assertInfo = new ArrayList<AssertionData>();
        this.unassertInfo = new ArrayList<AssertionData>();
        this.createdForts = new ArrayList<CycFort>();
    }
    
    public void begin() {
        if (CycAccess.getCurrentTransaction() != null) {
            throw new IllegalStateException("Attempt to begin a KBTransaction while another KBTransaction is active.");
        }
        CycAccess.setCurrentTransaction((KBTransaction)this);
    }
    
    public void commit() {
        try {
            ELMt mt = null;
            try {
                mt = CycAccess.getCurrent().makeELMt("#$BaseKB");
                if (this.assertInfo.isEmpty() && this.unassertInfo.isEmpty()) {
                    return;
                }
                final StringBuilder assertConjunction = new StringBuilder().append("(list #$and ");
                for (final AssertionData assertData : this.assertInfo) {
                    assertConjunction.append(assertData.toIstString());
                }
                assertConjunction.append(")");
                final StringBuilder unassertConjunction = new StringBuilder().append("(list #$and ");
                for (final AssertionData unassertData : this.unassertInfo) {
                    unassertConjunction.append(unassertData.toIstString());
                }
                unassertConjunction.append(")");
                CycAccess.getCurrent().edit(unassertConjunction.toString(), assertConjunction.toString(), mt, (boolean)this.bookkeeping, (boolean)this.transcripting, (boolean)this.wffCheckingDisabled, (List)this.templates);
            }
            catch (Exception ex) {
                throw new RuntimeException(ex.getClass().getName() + " while trying to commit transaction: " + ex.getMessage(), ex);
            }
        }
        finally {
            CycAccess.setCurrentTransaction((KBTransaction)null);
        }
    }
    
    public void rollback() {
        for (final CycFort createdFort : this.createdForts) {
            try {
                CycAccess.getCurrent().kill(createdFort, this.isBookkeeping(), this.isTranscripting());
            }
            catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    
    public boolean isBookkeeping() {
        return this.bookkeeping;
    }
    
    public void setBookkeeping(final boolean bookkeeping) {
        if (this.bookkeeping != null) {
            throw new UnsupportedOperationException("Illegal attempt to change bookkeeping on a transaction from " + this.bookkeeping + " to " + bookkeeping);
        }
        this.bookkeeping = bookkeeping;
    }
    
    public boolean isTranscripting() {
        return this.transcripting;
    }
    
    public void setTranscripting(final boolean transcripting) {
        if (this.transcripting != null) {
            throw new UnsupportedOperationException("Illegal attempt to change transcripting on a transaction from " + this.transcripting + " to " + transcripting);
        }
        this.transcripting = transcripting;
    }
    
    public List<CycFort> getTemplates() {
        return new ArrayList<CycFort>(this.templates);
    }
    
    protected List<CycFort> getCreatedTerms() {
        return new ArrayList<CycFort>(this.createdForts);
    }
    
    protected List<AssertionData> getAssertInfo() {
        return new ArrayList<AssertionData>(this.assertInfo);
    }
    
    protected List<AssertionData> getUnassertInfo() {
        return new ArrayList<AssertionData>(this.assertInfo);
    }
    
    public void setTemplates(final List<CycFort> templates) {
        if (this.isTemplateInitialized && !this.templates.equals(templates)) {
            throw new UnsupportedOperationException("Illegal attempt to change the assert template on a transaction from " + this.templates + " to " + templates);
        }
        this.templates = new ArrayList<CycFort>(templates);
        this.isTemplateInitialized = true;
    }
    
    public void noteForAssertion(final String sentence, final ELMt mt, final boolean bookkeeping, final boolean transcripting, final boolean wffCheckingDisabled, final List<CycFort> templates) {
        this.noteBookkeeping(bookkeeping);
        this.noteTranscripting(transcripting);
        this.noteWffCheckingDisabled(wffCheckingDisabled);
        this.noteTemplates(templates);
        final AssertionData assertData = new AssertionData(sentence, mt);
        if (this.unassertInfo.contains(assertData)) {
            throw new UnsupportedOperationException("Illegal attempt to assert " + assertData + " in a transaction where it's also been unasserted.");
        }
        this.assertInfo.add(assertData);
    }
    
    public void noteForUnassertion(final String sentence, final ELMt mt, final boolean bookkeeping, final boolean transcripting) {
        this.noteBookkeeping(bookkeeping);
        this.noteTranscripting(transcripting);
        this.unassertInfo.add(new AssertionData(sentence, mt));
    }
    
    public void noteCreation(final CycFort fort) {
        this.createdForts.add(fort);
    }
    
    private void noteBookkeeping(final boolean bookkeeping) {
        if (this.bookkeeping == null) {
            this.bookkeeping = bookkeeping;
        }
        else if (!this.bookkeeping.equals(bookkeeping)) {
            throw new IllegalArgumentException("Illegal attempt to change the value for bookkeeping in this transaction from " + this.bookkeeping + " to " + bookkeeping + ".");
        }
    }
    
    private void noteTranscripting(final boolean transcripting) {
        if (this.transcripting == null) {
            this.transcripting = transcripting;
        }
        else if (!this.transcripting.equals(transcripting)) {
            throw new IllegalArgumentException("Illegal attempt to change the value for transcripting in this transaction from " + this.transcripting + " to " + transcripting + ".");
        }
    }
    
    private void noteWffCheckingDisabled(final boolean wffCheckingDisabled) {
        if (this.wffCheckingDisabled == null) {
            this.wffCheckingDisabled = wffCheckingDisabled;
        }
        else if (!this.wffCheckingDisabled.equals(wffCheckingDisabled)) {
            throw new IllegalArgumentException("Illegal attempt to change the value for wffCheckingDisabled in this transaction from " + this.wffCheckingDisabled + " to " + wffCheckingDisabled + ".");
        }
    }
    
    private void noteTemplates(final List<CycFort> templates) {
        if (!this.isTemplateInitialized) {
            this.templates = new ArrayList<CycFort>(templates);
            this.isTemplateInitialized = true;
        }
        else if (!this.templates.equals(templates)) {
            throw new IllegalArgumentException("Illegal attempt to change the value for templates in this transaction from " + this.templates + " to " + templates + ".");
        }
    }
    
    public class AssertionData
    {
        private String sentence;
        private ELMt mt;
        
        @Override
        public int hashCode() {
            int hash = 7;
            hash = 29 * hash + ((this.sentence != null) ? this.sentence.hashCode() : 0);
            hash = 29 * hash + ((this.mt != null) ? this.mt.hashCode() : 0);
            return hash;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == null) {
                return false;
            }
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            final AssertionData other = (AssertionData)obj;
            if (this.sentence == null) {
                if (other.sentence == null) {
                    return this.mt == other.mt || (this.mt != null && this.mt.equals(other.mt));
                }
            }
            else if (this.sentence.equals(other.sentence)) {
                return this.mt == other.mt || (this.mt != null && this.mt.equals(other.mt));
            }
            return false;
        }
        
        AssertionData(final String sentence, final ELMt mt) {
            assert sentence != null && !sentence.isEmpty();
            this.sentence = sentence;
            this.mt = mt;
        }
        
        public String toIstString() {
            return "(list #$ist " + this.mt.stringApiValue() + " " + this.sentence + ")";
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 106 ms
	
	Decompiled with Procyon 0.5.32.
*/