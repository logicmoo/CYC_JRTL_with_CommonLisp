package org.appdapter.bind.rdf.jena.assembly;

import org.appdapter.core.log.Debuggable;
import org.appdapter.bind.rdf.jena.model.JenaLiteralUtils;
import org.appdapter.core.name.Ident;
import org.appdapter.core.component.MutableKnownComponent;
import org.appdapter.core.log.BasicDebugger;

public class KnownComponentImpl extends BasicDebugger implements MutableKnownComponent
{
    private Ident myIdent;
    private String myShortLabel;
    private String myDescription;
    
    @Override
	public final void setIdent(final Ident id) {
        JenaLiteralUtils.onSetIdent(this.myIdent = id, (Object)this);
    }
    
    @Override
	public Ident getIdent() {
        return this.myIdent;
    }
    
    @Override
	public String getDescription() {
        return this.myDescription;
    }
    
    @Override
	public void setDescription(final String description) {
        this.myDescription = description;
    }
    
    @Override
	public String getShortLabel() {
        if (this.myShortLabel != null && this.myShortLabel.equals("default-label-")) {
            return null;
        }
        return this.myShortLabel;
    }
    
    @Override
	public void setShortLabel(final String shortLabel) {
        if (shortLabel.equals("default-label-")) {
            this.myShortLabel = shortLabel;
            return;
        }
        this.myShortLabel = shortLabel;
    }
    
    public String getFieldSummary() {
        if (Debuggable.useDebuggableToString) {
            return Debuggable.toInfoStringF((Object)this);
        }
        return "desc=" + this.myDescription;
    }
    
    @Override
	public String toString() {
        if (Debuggable.useDebuggableToString) {
            return Debuggable.toInfoStringF((Object)this, true);
        }
        return Debuggable.getCanonicalSimpleName((Class)this.getClass()) + "-" + this.hashCode() + "-" + this.getShortLabel() + "[" + this.getFieldSummary() + "]";
    }
}

/*

	Total time: 25 ms
	
*/