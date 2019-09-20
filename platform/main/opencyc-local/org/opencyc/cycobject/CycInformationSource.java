package org.opencyc.cycobject;

import org.opencyc.api.CycObjectFactory;
import javax.imageio.ImageIO;
import java.net.URL;
import org.opencyc.api.SubLAPIHelper;
import java.io.IOException;
import org.opencyc.api.CycAccess;
import java.awt.Image;

public class CycInformationSource
{
    private final CycDenotationalTerm term;
    private Image icon;
    private String citationString;
    private static final CycSymbol ANY;
    
    public CycInformationSource(final CycDenotationalTerm term, final Image icon, final String citationString) {
        this.icon = null;
        this.citationString = null;
        this.term = term;
        this.icon = icon;
        this.citationString = citationString;
    }
    
    public CycInformationSource(final CycDenotationalTerm sourceTerm, final CycAccess cycAccess) throws IOException {
        this.icon = null;
        this.citationString = null;
        this.term = sourceTerm;
        this.icon = getIconForSource(sourceTerm, cycAccess);
        this.citationString = CitationGenerator.DEFAULT.getCitationStringForSource(sourceTerm, cycAccess);
    }
    
    public CycInformationSource(final CycDenotationalTerm sourceTerm, final CitationGenerator citationGenerator, final CycAccess cycAccess) throws IOException {
        this.icon = null;
        this.citationString = null;
        this.term = sourceTerm;
        this.icon = getIconForSource(sourceTerm, cycAccess);
        this.citationString = citationGenerator.getCitationStringForSource(sourceTerm, cycAccess);
    }
    
    public Image getIcon() {
        return this.icon;
    }
    
    public CycDenotationalTerm getCycL() {
        return this.term;
    }
    
    public String getCitationString() {
        return this.citationString;
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final CycInformationSource other = (CycInformationSource)obj;
        if (this.term != other.term && (this.term == null || !this.term.equals(other.term))) {
            return false;
        }
        if (this.icon != other.icon && (this.icon == null || !this.icon.equals(other.icon))) {
            return false;
        }
        if (this.citationString == null) {
            if (other.citationString == null) {
                return true;
            }
        }
        else if (this.citationString.equals(other.citationString)) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + ((this.term != null) ? this.term.hashCode() : 0);
        hash = 29 * hash + ((this.icon != null) ? this.icon.hashCode() : 0);
        hash = 29 * hash + ((this.citationString != null) ? this.citationString.hashCode() : 0);
        return hash;
    }
    
    private static Image getIconForSource(final CycDenotationalTerm source, final CycAccess cycAccess) {
        Image icon = null;
        String iconURL = null;
        try {
            final String pathCommand = SubLAPIHelper.makeSubLStmt("icon-path-for-source", new Object[] { source });
            final Object iconURLObj = cycAccess.converseObject((Object)pathCommand);
            if (iconURLObj instanceof String) {
                iconURL = (String)iconURLObj;
            }
            icon = ImageIO.read(new URL(iconURL));
        }
        catch (Exception e) {
            System.err.println("Couldn't load source icon for " + source + " from " + iconURL);
            e.printStackTrace(System.err);
        }
        return icon;
    }
    
    static {
        ANY = CycObjectFactory.makeCycSymbol(":ANY");
    }
    
    public static class CitationGenerator
    {
        CycObject style;
        CycObject markupLanguage;
        public static final CitationGenerator DEFAULT;
        
        public CitationGenerator(final CycDenotationalTerm style, final CycDenotationalTerm markupLanguage) {
            this.style = (CycObject)CycInformationSource.ANY;
            this.markupLanguage = (CycObject)new CycConstant("HypertextMarkupLanguage", new Guid("bd656e90-9c29-11b1-9dad-c379636f7270"));
            this.style = (CycObject)style;
            this.markupLanguage = (CycObject)markupLanguage;
        }
        
        public CitationGenerator(final CycDenotationalTerm style) {
            this.style = (CycObject)CycInformationSource.ANY;
            this.markupLanguage = (CycObject)new CycConstant("HypertextMarkupLanguage", new Guid("bd656e90-9c29-11b1-9dad-c379636f7270"));
            this.style = (CycObject)style;
        }
        
        public CitationGenerator() {
            this.style = (CycObject)CycInformationSource.ANY;
            this.markupLanguage = (CycObject)new CycConstant("HypertextMarkupLanguage", new Guid("bd656e90-9c29-11b1-9dad-c379636f7270"));
        }
        
        public String getCitationStringForSource(final CycDenotationalTerm source, final CycAccess cycAccess) throws IOException {
            final String command = SubLAPIHelper.makeSubLStmt("source-citation-string", new Object[] { source, this.style, this.markupLanguage });
            return cycAccess.converseString((Object)command);
        }
        
        static {
            DEFAULT = new CitationGenerator();
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 67 ms
	
	Decompiled with Procyon 0.5.32.
*/