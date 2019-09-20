package org.opencyc.nl;

import org.opencyc.api.CycObjectFactory;
import org.opencyc.api.CycApiException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.ParsePosition;
import org.opencyc.cycobject.DefaultCycObject;
import java.util.Iterator;
import java.util.Map;
import org.opencyc.cycobject.CycList;
import java.util.ArrayList;
import java.util.List;
import org.opencyc.api.SubLAPIHelper;
import org.opencyc.util.StringUtils;
import java.text.FieldPosition;
import java.util.HashSet;
import org.opencyc.cycobject.CycFormulaSentence;
import java.util.Collection;
import org.opencyc.api.CycAccess;
import org.opencyc.cycobject.CycObject;
import java.util.Locale;
import org.opencyc.cycobject.CycSymbol;
import java.text.Format;

public class NLFormat extends Format
{
    public static final CycSymbol DEFAULT;
    protected static final CycSymbol TEXT;
    protected static final CycSymbol HTML;
    protected Locale locale;
    protected static final String GENERATE_TEXT_W_SENTENTIAL_FORCE = "GENERATE-TEXT-W/SENTENTIAL-FORCE";
    protected static final String GENERATE_DISAMBIGUATION_PHRASES = "GENERATE-DISAMBIGUATION-PHRASES";
    private static final CycSymbol LEXICON_LOOKUP_MT;
    private static final CycSymbol PPH_DOMAIN_MT;
    private static final CycSymbol DENOTS_OF_STRING;
    private static final String WITH_PRECISE_PARAPHRASE_ON = "WITH-PRECISE-PARAPHRASE-ON";
    private static final String OMITTING_HYPERLINKS_IN_PPH_HTML_MODE = "OMITTING-HYPERLINKS-IN-PPH-HTML-MODE";
    private static CycObject defaultDomainMt;
    private CycAccess cyc;
    protected CycObject parseLanguageMt;
    private CycObject formatLanguageMt;
    protected CycObject domainMt;
    private boolean shouldDisambiguate;
    private boolean precise;
    private boolean useBulletsInHTMLMode;
    private GenerationMode mode;
    protected static final CycSymbol QUESTION;
    protected static final CycSymbol INTERROGATIVE;
    protected static final CycSymbol NONE;
    protected static final CycSymbol DECLARATIVE;
    protected static final CycSymbol IMPERATIVE;
    private Collection<CycObject> requiredIsas;
    private Collection<CycObject> requiredGenls;
    private CycFormulaSentence constrainingSentence;
    
    protected NLFormat(final CycAccess cyc) {
        this.locale = Locale.getDefault();
        this.parseLanguageMt = (CycObject)NLFormat.DEFAULT;
        this.formatLanguageMt = (CycObject)NLFormat.DEFAULT;
        this.domainMt = (CycObject)NLFormat.DEFAULT;
        this.shouldDisambiguate = true;
        this.precise = false;
        this.useBulletsInHTMLMode = false;
        this.mode = GenerationMode.Text;
        this.requiredIsas = new HashSet<CycObject>();
        this.requiredGenls = new HashSet<CycObject>();
        this.constrainingSentence = null;
        this.cyc = cyc;
    }
    
    protected NLFormat() {
        this.locale = Locale.getDefault();
        this.parseLanguageMt = (CycObject)NLFormat.DEFAULT;
        this.formatLanguageMt = (CycObject)NLFormat.DEFAULT;
        this.domainMt = (CycObject)NLFormat.DEFAULT;
        this.shouldDisambiguate = true;
        this.precise = false;
        this.useBulletsInHTMLMode = false;
        this.mode = GenerationMode.Text;
        this.requiredIsas = new HashSet<CycObject>();
        this.requiredGenls = new HashSet<CycObject>();
        this.constrainingSentence = null;
    }
    
    public static NLFormat getInstance(final CycAccess cyc) {
        return getInstance(Locale.getDefault(), cyc);
    }
    
    public static NLFormat getInstance(final Locale locale, final CycAccess cyc) {
        final NLFormat nlf = new NLFormat(cyc);
        nlf.setLocale(locale);
        return nlf;
    }
    
    @Override
    public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {
        final String command = this.buildFormatCommand(obj);
        try {
            final Object cyclString = this.getCycAccess().converseObject((Object)command);
            toAppendTo.append(StringUtils.cyclStringToJavaString(cyclString));
        }
        catch (Exception ex) {
            throw new RuntimeException("Exception formatting " + obj, ex);
        }
        return toAppendTo;
    }
    
    private String buildFormatCommand(final Object obj) {
        String command = this.getBasicFormatCommand(obj);
        if (this.precise) {
            command = SubLAPIHelper.makeSubLStmt("WITH-PRECISE-PARAPHRASE-ON", new Object[] { new SubLAPIHelper.AsIsTerm((Object)command) });
        }
        if (this.getMode().equals(GenerationMode.HTML)) {
            command = SubLAPIHelper.makeSubLStmt("OMITTING-HYPERLINKS-IN-PPH-HTML-MODE", new Object[] { new SubLAPIHelper.AsIsTerm((Object)command) });
        }
        return command;
    }
    
    private String getBasicFormatCommand(final Object obj) {
        return SubLAPIHelper.makeSubLStmt("GENERATE-TEXT-W/SENTENTIAL-FORCE", new Object[] { obj, NLFormat.DEFAULT, NLFormat.DEFAULT, this.getFormatLanguageMt(), this.getDomainMt(), this.getMode().toCycSymbol() });
    }
    
    @Deprecated
    public List<String> formatMultipleCycObjects(final List<?> objList) {
        final String command = this.buildFormatMultipleCommand(objList);
        final List<String> resultList = new ArrayList<String>();
        CycList rawResult;
        try {
            rawResult = this.getCycAccess().converseList((Object)command);
        }
        catch (Exception ex) {
            throw new RuntimeException("Exception formatting " + objList, ex);
        }
        final Map<Object, String> resultMap = (Map<Object, String>)rawResult.toMap();
        for (final Object oneInput : objList) {
            resultList.add(resultMap.get(oneInput));
        }
        return resultList;
    }
    
    protected String buildFormatMultipleCommand(final List<?> objList) {
        String command;
        if (this.shouldDisambiguate) {
            command = SubLAPIHelper.makeSubLStmt("GENERATE-DISAMBIGUATION-PHRASES", new Object[] { new CycList((Collection)objList), NLFormat.DEFAULT, NLFormat.DEFAULT, this.getFormatLanguageMt(), this.getDomainMt(), this.getMode().toCycSymbol() });
        }
        else {
            command = "(list ";
            for (final Object obj : objList) {
                command = command + "(cons " + DefaultCycObject.stringApiValue(obj) + " ";
                command += this.getBasicFormatCommand(obj);
                command += ")";
            }
            command += ")";
        }
        if (this.precise) {
            command = SubLAPIHelper.makeSubLStmt("WITH-PRECISE-PARAPHRASE-ON", new Object[] { new SubLAPIHelper.AsIsTerm((Object)command) });
        }
        if (this.getMode().equals(GenerationMode.HTML)) {
            command = SubLAPIHelper.makeSubLStmt("OMITTING-HYPERLINKS-IN-PPH-HTML-MODE", new Object[] { new SubLAPIHelper.AsIsTerm((Object)command) });
        }
        return command;
    }
    
    @Override
    public Object parseObject(final String source, final ParsePosition pos) {
        throw new UnsupportedOperationException("KB Object output will not be supported from NLFormat in Core API.");
    }
    
    @Deprecated
    public Object parseObjectIntoCycObject(final String source, final ParsePosition pos) {
        final Collection<?> results = this.parseObjectsIntoCycObjects(source, pos);
        return (results == null || results.isEmpty()) ? null : results.iterator().next();
    }
    
    public CycObject getFormatLanguageMt() {
        if (NLFormat.DEFAULT.equals((Object)this.formatLanguageMt)) {
            try {
                final CycObject languageMt = this.getLanguageMtFromLocale();
                this.setFormatLanguageMt(languageMt);
            }
            catch (UnknownHostException ex) {
                Logger.getLogger(NLFormat.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException("Unable to retrieve language Mt for " + this.locale.getLanguage(), ex);
            }
            catch (IOException ex2) {
                Logger.getLogger(NLFormat.class.getName()).log(Level.SEVERE, null, ex2);
                throw new RuntimeException("Unable to retrieve language Mt for " + this.locale.getLanguage(), ex2);
            }
            catch (CycApiException ex3) {
                Logger.getLogger(NLFormat.class.getName()).log(Level.SEVERE, null, (Throwable)ex3);
                throw new RuntimeException("Unable to retrieve language Mt for " + this.locale.getLanguage(), (Throwable)ex3);
            }
        }
        return this.formatLanguageMt;
    }
    
    protected CycObject getLanguageMtFromLocale() throws CycApiException, IOException {
        final String command = "(denots-mt-for-language (get-language-for-code " + DefaultCycObject.stringApiValue((Object)this.locale.getLanguage()) + "))";
        final CycObject languageMt = this.getCycAccess().converseCycObject((Object)command);
        return languageMt;
    }
    
    @Deprecated
    public CycObject getParseLanguageMt() {
        if (NLFormat.DEFAULT.equals((Object)this.parseLanguageMt)) {
            try {
                this.parseLanguageMt = this.getLanguageMtFromLocale();
            }
            catch (Exception ex) {
                Logger.getLogger(NLFormat.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException("Unable to retrieve language Mt for " + this.locale.getLanguage(), ex);
            }
        }
        return this.parseLanguageMt;
    }
    
    @Deprecated
    public CycObject getDomainMt() {
        if (this.domainMt == NLFormat.DEFAULT) {
            if (NLFormat.defaultDomainMt == null) {
                try {
                    NLFormat.defaultDomainMt = this.getCycAccess().converseCycObject((Object)("(eval " + NLFormat.PPH_DOMAIN_MT.stringApiValue() + ")"));
                }
                catch (Exception e) {
                    throw new RuntimeException("Unable to find PPH domain Mt", e);
                }
            }
            return NLFormat.defaultDomainMt;
        }
        return this.domainMt;
    }
    
    public GenerationMode getMode() {
        return this.mode;
    }
    
    public Locale getLocale() {
        return this.locale;
    }
    
    public Collection<CycObject> getRequiredIsas() {
        return this.requiredIsas;
    }
    
    public Collection<CycObject> getRequiredGenls() {
        return this.requiredGenls;
    }
    
    public CycFormulaSentence getConstrainingCycFormulaSentence() {
        return this.constrainingSentence;
    }
    
    private String buildParseCommand(final String denotationString) {
        String command = SubLAPIHelper.makeSubLStmt(NLFormat.DENOTS_OF_STRING, new Object[] { denotationString });
        final Object languageMt = this.getParseLanguageMt();
        command = SubLAPIHelper.wrapVariableBinding(command, NLFormat.LEXICON_LOOKUP_MT, languageMt);
        return command;
    }
    
    protected CycAccess getCycAccess() {
        if (this.cyc instanceof CycAccess) {
            return this.cyc;
        }
        return CycAccess.getCurrent();
    }
    
    public NLFormat setLocale(final Locale locale) {
        this.locale = locale;
        return this;
    }
    
    public NLFormat setPrecise(final boolean b) {
        this.precise = b;
        return this;
    }
    
    public boolean isPrecise() {
        return this.precise;
    }
    
    public boolean shouldDisambiguate() {
        return this.shouldDisambiguate;
    }
    
    public NLFormat setFormatLanguageMt(final CycObject languageMt) {
        this.formatLanguageMt = languageMt;
        return this;
    }
    
    public NLFormat setParseLanguageMt(final CycObject languageMt) {
        this.parseLanguageMt = languageMt;
        return this;
    }
    
    public NLFormat setDomainMt(final CycObject domainMt) {
        this.domainMt = domainMt;
        return this;
    }
    
    public NLFormat setMode(final GenerationMode mode) {
        this.mode = mode;
        return this;
    }
    
    public NLFormat setDisambiguate(final boolean shouldDisambiguate) {
        this.shouldDisambiguate = shouldDisambiguate;
        return this;
    }
    
    public NLFormat addRequiredIsa(final CycObject isa) {
        this.requiredIsas.add(isa);
        return this;
    }
    
    public NLFormat addRequiredGenl(final CycObject genl) {
        this.requiredGenls.add(genl);
        return this;
    }
    
    public NLFormat setConstrainingCycFormulaSentence(final CycFormulaSentence sentence) {
        this.constrainingSentence = sentence;
        return this;
    }
    
    @Deprecated
    public List<?> parseObjectsIntoCycObjects(final String denotationString) {
        final String command = this.buildParseCommand(denotationString);
        try {
            return (List<?>)this.getCycAccess().converseList((Object)command);
        }
        catch (Exception ex) {
            throw new RuntimeException("Exception parsing " + denotationString, ex);
        }
    }
    
    @Deprecated
    public Collection<?> parseObjectsIntoCycObjects(final String denotationString, final ParsePosition pos) {
        if (pos == null) {
            throw new NullPointerException();
        }
        final List<?> result = this.parseObjectsIntoCycObjects(denotationString.substring(pos.getIndex()));
        if (result == null || result.isEmpty()) {
            pos.setErrorIndex(pos.getIndex());
        }
        else {
            pos.setIndex(denotationString.length());
        }
        return result;
    }
    
    public CycList<CycObject> getConstrainedCyclForString(final String str, final CycObject constrainingCol, final CycObject domainMt) throws UnknownHostException, IOException {
        final StringBuilder commandBuilder = new StringBuilder("(get-constrained-cycl-for-string ");
        commandBuilder.append("\"" + str + "\"");
        commandBuilder.append(" " + constrainingCol.cyclify());
        commandBuilder.append(" " + domainMt.cyclify());
        commandBuilder.append(" *pph-language-mt*");
        commandBuilder.append(" #$EnglishMt");
        commandBuilder.append(" nil");
        commandBuilder.append(")");
        final String command = commandBuilder.toString();
        final Object result = this.getCycAccess().converseObject((Object)command);
        if (result instanceof CycSymbol) {
            return null;
        }
        final CycList returnValue = (CycList)result;
        final Iterator i = returnValue.iterator();
        final CycList res = new CycList();
        while (i.hasNext()) {
            res.add(((CycList) i.next()).second());
        }
        return (CycList<CycObject>)res;
    }
    
    static {
        DEFAULT = CycObjectFactory.makeCycSymbol(":DEFAULT");
        TEXT = CycObjectFactory.makeCycSymbol(":TEXT");
        HTML = CycObjectFactory.makeCycSymbol(":HTML");
        LEXICON_LOOKUP_MT = CycObjectFactory.makeCycSymbol("*LEXICON-LOOKUP-MT*");
        PPH_DOMAIN_MT = CycObjectFactory.makeCycSymbol("*PPH-DOMAIN-MT*");
        DENOTS_OF_STRING = CycObjectFactory.makeCycSymbol("denots-of-string");
        NLFormat.defaultDomainMt = null;
        QUESTION = CycObjectFactory.makeCycSymbol(":QUESTION");
        INTERROGATIVE = NLFormat.QUESTION;
        NONE = CycObjectFactory.makeCycSymbol(":NONE");
        DECLARATIVE = CycObjectFactory.makeCycSymbol(":DECLARATIVE");
        IMPERATIVE = CycObjectFactory.makeCycSymbol(":IMPERATIVE");
    }
    
    public enum GenerationMode
    {
        Text(NLFormat.TEXT), 
        HTML(NLFormat.HTML);
        
        private final CycSymbol cycSymbol;
        
        private GenerationMode(final CycSymbol cycSymbol) {
            this.cycSymbol = cycSymbol;
        }
        
        public CycSymbol toCycSymbol() {
            return this.cycSymbol;
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 188 ms
	
	Decompiled with Procyon 0.5.32.
*/