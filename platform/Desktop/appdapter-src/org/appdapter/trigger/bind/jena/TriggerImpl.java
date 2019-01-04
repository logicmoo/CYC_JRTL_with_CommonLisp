package org.appdapter.trigger.bind.jena;

import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.api.trigger.MenuName;
import org.appdapter.api.trigger.MutableTrigger;
import org.appdapter.bind.rdf.jena.assembly.KnownComponentImpl;
import org.appdapter.api.trigger.Box;

public abstract class TriggerImpl<BoxType extends Box<? extends TriggerImpl<BoxType>>> extends KnownComponentImpl implements MutableTrigger<BoxType>, MenuName
{
    public String getFieldSummary() {
        return super.getFieldSummary() + ", trigger-field-summary-goes-here";
    }
    
    public String getMenuPath() {
        final String lbl = this.getShortLabel();
        if (lbl != null && lbl.length() > 1) {
            return lbl;
        }
        return ReflectUtils.getCanonicalSimpleName((Class)this.getClass());
    }
}

/*

	Total time: 40 ms
	
*/