package org.appdapter.api.facade;

public class FacadeSpec<Type, Kind>
{
    private final Class<Type> myObjClazz;
    private Kind myKind;
    private boolean myExtFlag;
    
    public FacadeSpec(final Kind kind, final Class<Type> sClz, final boolean extFlag) {
        this.myKind = kind;
        this.myObjClazz = sClz;
        this.myExtFlag = extFlag;
    }
    
    public Class<Type> getFacadeClass() {
        return this.myObjClazz;
    }
    
    public Kind getKind() {
        return this.myKind;
    }
    
    public String getNameString() {
        return this.getKind().toString();
    }
    
    public boolean isExternal() {
        return this.myExtFlag;
    }
    
    public Class determineCredentialClass(final Class optOverrideClz, final Class userClz) {
        Class credClz = userClz;
        if (optOverrideClz != null) {
            credClz = optOverrideClz;
        }
        else if (!this.isExternal() && this.myObjClazz != null) {
            credClz = this.myObjClazz;
        }
        return credClz;
    }
}

/*

	Total time: 18 ms
	
*/