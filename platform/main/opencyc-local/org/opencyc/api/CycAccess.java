package org.opencyc.api;

import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.UUID;
import org.opencyc.cycobject.CycSentence;
import org.opencyc.inference.params.InferenceParameterDescriptions;
import org.opencyc.inference.params.DefaultInferenceParameterDescriptions;
import java.io.InputStream;
import java.util.Date;
import java.text.CharacterIterator;
import java.text.SimpleDateFormat;
import org.opencyc.util.DateConverter;
import java.util.TimeZone;
import java.text.StringCharacterIterator;
import org.opencyc.cycobject.CycFormula;
import java.util.Collection;
import java.util.HashMap;
import org.opencyc.inference.InferenceWorkerSynch;
import java.util.Collections;
import org.opencyc.inference.InferenceSuspendReason;
import org.opencyc.inference.DefaultInferenceWorkerSynch;
import org.opencyc.inference.InferenceResultSet;
import org.opencyc.cycobject.ELMtCycNaut;
import org.opencyc.cycobject.ELMtNart;
import org.opencyc.cycobject.ELMtConstant;
import org.opencyc.cycobject.DefaultCycObject;
import java.util.ListIterator;
import org.opencyc.util.TimeOutException;
import org.opencyc.cycobject.CycVariable;
import org.opencyc.nl.NLFormat;
import org.opencyc.cycobject.CycNart;
import org.opencyc.cycobject.CycAssertion;
import org.opencyc.cycobject.Guid;
import java.util.ArrayList;
import org.opencyc.util.StringUtils;
import java.util.List;
import org.opencyc.cycobject.CycNaut;
import org.opencyc.cycobject.CycListParser;
import org.opencyc.util.PasswordManager;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import org.opencyc.cycobject.CycDenotationalTerm;
import org.opencyc.cycobject.CycFormulaSentence;
import java.util.Iterator;
import org.opencyc.util.Log;
import java.awt.Component;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.opencyc.soap.SOAPBinaryCycConnection;
import java.net.URL;
import java.util.HashSet;
import org.opencyc.inference.params.DefaultInferenceParameters;
import org.opencyc.util.LRUCache;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Set;
import org.opencyc.inference.params.InferenceParameters;
import org.opencyc.util.Pair;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycFort;
import org.opencyc.comm.Comm;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.ELMt;
import java.io.FileWriter;
import java.util.Map;
import java.util.Map.Entry;

import org.opencyc.cycobject.CycSymbol;

public class CycAccess {
	private static final CycSymbol CYC_QUERY;
	private static final CycSymbol EL_WFF;
	private static final CycSymbol EQUALS_EL;
	private static final CycSymbol FPRED_VALUE_IN_MT;
	private static final CycSymbol SOME_PRED_VALUE_IN_ANY_MT;
	private static final CycSymbol SOME_PRED_VALUE_IN_RELEVANT_MTS;
	private static final CycSymbol WITH_ALL_MTS;
	private Boolean isOpenCyc;
	public static final Map<Thread, CycAccess> cycAccessInstances;
	public static CycAccess sharedCycAccessInstance;
	public static final int PERSISTENT_CONNECTION = 2;
	public static final int XML_SOAP_CONNECTION = 3;
	public int persistentConnection;
	public static final boolean DEFAULT_IS_LEGACY_MODE = false;
	public boolean areAPIRequestsLoggedToFile;
	public FileWriter apiRequestLog;
	public static final ELMt baseKB;
	public static final CycConstant isa;
	public static final CycConstant genls;
	public static final CycConstant genlMt;
	public static final CycConstant comment;
	public static final CycConstant collection;
	public static final CycConstant binaryPredicate;
	public static final CycConstant elementOf;
	public static final CycConstant numericallyEqual;
	public static final CycConstant trueConst;
	public static final CycConstant falseConst;
	public static final CycConstant not;
	public static final CycConstant and;
	public static final CycConstant or;
	public static final CycConstant xorConst;
	public static final CycConstant equivConst;
	public static final CycConstant impliesConst;
	public static final CycConstant forAllConst;
	public static final CycConstant thereExistsConst;
	public static final CycConstant thereExistExactlyConst;
	public static final CycConstant thereExistAtMostConst;
	public static final CycConstant thereExistAtLeastConst;
	public static final CycConstant expandSubLFnConst;
	public static final CycConstant sublQuoteFnConst;
	public static final CycConstant plusFn;
	public static final CycConstant different;
	public static final CycConstant thing;
	public static final CycConstant mtSpace;
	public static final ELMt currentWorldDataMt;
	public static final ELMt inferencePSC;
	public static final ELMt anytimePSC;
	public static final ELMt everythingPSC;
	public static final ELMt universalVocabularyMt;
	public static final ELMt bookkeepingMt;
	private volatile boolean isClosed;
	private static final String CYC_IMAGE_ID_EXPRESSION;
	protected String hostName;
	protected int port;
	protected Comm c;
	protected static final int OK_RESPONSE_CODE = 200;
	protected int trace;
	private static final String UTF8 = "UTF-8";
	private CycFort cyclist;
	private CycFort project;
	private final Map<CycList, Boolean> askCache;
	private final Map<CycFort, Integer> countAllInstancesCache;
	private final Map<CycObject, Boolean> isCollectionCache;
	private final Map<Pair, Boolean> isGenlOfCache;
	protected CycConnectionInterface cycConnection;
	private final InferenceParameters defaultQueryProperties;
	private boolean queryPropertiesInitialized;
	private long previousAccessedMilliseconds;
	protected static final long MAX_UNACCESSED_MILLIS = 36000000L;
	private String cycImageID;
	private boolean isSOAPConnection;
	private final Set<CycObject> termsKnownToHavePrecachedFactSheets;
	private boolean reestablishClosedConnections;
	private static ThreadLocal<CycAccess> currentCyc;
	private static ThreadLocal<CycFort> currentCyclist;
	private static ThreadLocal<KBTransaction> currentTransaction;
	private static Map<String, CycAccess> currentCycAccesses;

	public CycAccess() throws UnknownHostException, IOException, CycApiException {
		this(CycConnection.DEFAULT_HOSTNAME, 3600);
		System.out.println("Using Cyc " + this);
	}

	public CycAccess(final CycConnectionInterface conn) throws IOException, CycApiException {
		this.isOpenCyc = null;
		this.persistentConnection = 2;
		this.areAPIRequestsLoggedToFile = false;
		this.apiRequestLog = null;
		this.isClosed = false;
		this.trace = 0;
		this.cyclist = null;
		this.project = null;
		this.askCache = (Map<CycList, Boolean>) new LRUCache(500, 5000, true);
		this.countAllInstancesCache = (Map<CycFort, Integer>) new LRUCache(500, 5000, true);
		this.isCollectionCache = (Map<CycObject, Boolean>) new LRUCache(500, 5000, true);
		this.isGenlOfCache = (Map<Pair, Boolean>) new LRUCache(500, 5000, true);
		this.defaultQueryProperties = (InferenceParameters) new DefaultInferenceParameters(this);
		this.queryPropertiesInitialized = false;
		this.previousAccessedMilliseconds = System.currentTimeMillis();
		this.isSOAPConnection = false;
		this.termsKnownToHavePrecachedFactSheets = new HashSet<CycObject>();
		this.reestablishClosedConnections = true;
		this.hostName = conn.getHostName();
		this.port = conn.getBasePort();
		this.persistentConnection = 2;
		this.cycConnection = conn;
		this.commonInitialization();
	}

	public CycAccess(final URL endpointURL, final String hostName, final int basePort) throws IOException, CycApiException {
		this.isOpenCyc = null;
		this.persistentConnection = 2;
		this.areAPIRequestsLoggedToFile = false;
		this.apiRequestLog = null;
		this.isClosed = false;
		this.trace = 0;
		this.cyclist = null;
		this.project = null;
		this.askCache = (Map<CycList, Boolean>) new LRUCache(500, 5000, true);
		this.countAllInstancesCache = (Map<CycFort, Integer>) new LRUCache(500, 5000, true);
		this.isCollectionCache = (Map<CycObject, Boolean>) new LRUCache(500, 5000, true);
		this.isGenlOfCache = (Map<Pair, Boolean>) new LRUCache(500, 5000, true);
		this.defaultQueryProperties = (InferenceParameters) new DefaultInferenceParameters(this);
		this.queryPropertiesInitialized = false;
		this.previousAccessedMilliseconds = System.currentTimeMillis();
		this.isSOAPConnection = false;
		this.termsKnownToHavePrecachedFactSheets = new HashSet<CycObject>();
		this.reestablishClosedConnections = true;
		this.hostName = hostName;
		this.port = basePort;
		this.isSOAPConnection = true;
		this.persistentConnection = 2;
		this.cycConnection = (CycConnectionInterface) new SOAPBinaryCycConnection(endpointURL, hostName, basePort, this);
		this.commonInitialization();
	}

	public CycAccess(final String hostName, final int basePort) throws UnknownHostException, IOException, CycApiException {
		this.isOpenCyc = null;
		this.persistentConnection = 2;
		this.areAPIRequestsLoggedToFile = false;
		this.apiRequestLog = null;
		this.isClosed = false;
		this.trace = 0;
		this.cyclist = null;
		this.project = null;
		this.askCache = (Map<CycList, Boolean>) new LRUCache(500, 5000, true);
		this.countAllInstancesCache = (Map<CycFort, Integer>) new LRUCache(500, 5000, true);
		this.isCollectionCache = (Map<CycObject, Boolean>) new LRUCache(500, 5000, true);
		this.isGenlOfCache = (Map<Pair, Boolean>) new LRUCache(500, 5000, true);
		this.defaultQueryProperties = (InferenceParameters) new DefaultInferenceParameters(this);
		this.queryPropertiesInitialized = false;
		this.previousAccessedMilliseconds = System.currentTimeMillis();
		this.isSOAPConnection = false;
		this.termsKnownToHavePrecachedFactSheets = new HashSet<CycObject>();
		this.reestablishClosedConnections = true;
		this.hostName = hostName;
		this.port = basePort;
		this.persistentConnection = 2;
		this.cycConnection = (CycConnectionInterface) new CycConnection(hostName, this.port, this);
		this.commonInitialization();
	}

	public CycAccess(final Comm c) throws UnknownHostException, IOException, CycApiException {
		this.isOpenCyc = null;
		this.persistentConnection = 2;
		this.areAPIRequestsLoggedToFile = false;
		this.apiRequestLog = null;
		this.isClosed = false;
		this.trace = 0;
		this.cyclist = null;
		this.project = null;
		this.askCache = (Map<CycList, Boolean>) new LRUCache(500, 5000, true);
		this.countAllInstancesCache = (Map<CycFort, Integer>) new LRUCache(500, 5000, true);
		this.isCollectionCache = (Map<CycObject, Boolean>) new LRUCache(500, 5000, true);
		this.isGenlOfCache = (Map<Pair, Boolean>) new LRUCache(500, 5000, true);
		this.defaultQueryProperties = (InferenceParameters) new DefaultInferenceParameters(this);
		this.queryPropertiesInitialized = false;
		this.previousAccessedMilliseconds = System.currentTimeMillis();
		this.isSOAPConnection = false;
		this.termsKnownToHavePrecachedFactSheets = new HashSet<CycObject>();
		this.reestablishClosedConnections = true;
		System.out.println("Cyc Access with Comm object: " + c.toString());
		System.out.flush();
		this.setupComm(c);
		this.commonInitialization();
	}

	public static CycAccess getNewCycAccessInteractively(final String defaultHost, final int defaultPort) {
		CycAccess cycAccess = null;
		try {
			cycAccess = new CycAccess(defaultHost, defaultPort);
			return cycAccess;
		} catch (IOException ex) {
			Logger.getLogger(CycAccess.class.getName()).log(Level.INFO, "Cyc server not reachable at " + defaultHost + ":" + defaultPort + ". Asking the user to specify host and port.");
			return getNewCycAccessInteractively();
		}
	}

	public static CycAccess getNewCycAccessInteractively() {
		CycAccess cycAccess = null;
		final Integer[] ports = { 3600, 3620, 3640, 3660, 3680 };
		CycServer server = new CycServer("localhost", (int) ports[0]);
		while (cycAccess == null) {
			server = CycConnectionPanel.promptUser(server);
			try {
				if (server == null) {
					return null;
				}
				cycAccess = new CycAccess(server.getHostName(), server.getBasePort());
			} catch (Exception ex) {
				final int result = JOptionPane.showConfirmDialog(null, "Got Exception trying to connect to " + server.toString() + ":\n" + ex.getLocalizedMessage() + "\nTry again?", "Exception", 2, 2);
				if (result != 0) {
					return null;
				}
				continue;
			}
		}
		return cycAccess;
	}

	@Override
	public String toString() {
		if (this.cycConnection == null) {
			return "CycAccess: no valid connection";
		}
		return this.cycConnection.connectionInfo();
	}

	public static CycAccess getCurrent() {
		final CycAccess cyc = CycAccess.currentCyc.get();
		if (!(cyc instanceof CycAccess)) {
			throw new RuntimeException("The current CycAccess hasn't been set yet.  CycAccess.setCurrent() must be called before CycAccess.getCurrent() is called.");
		}
		return cyc;
	}

	public static CycAccess setCurrent(final CycAccess access) {
		CycAccess.currentCyc.set(access);
		return access;
	}

	public static CycAccess setCurrent(final String hostName, final int port) throws UnknownHostException, IOException {
		final String key = hostName + ":" + port;
		if (CycAccess.currentCycAccesses.containsKey(key)) {
			setCurrent(CycAccess.currentCycAccesses.get(key));
		} else {
			final CycAccess cyc = new CycAccess(hostName, port);
			setCurrent(cyc);
			CycAccess.currentCycAccesses.put(key, cyc);
		}
		return getCurrent();
	}

	@Deprecated
	public static CycAccess current() {
		final CycAccess cycAccess = CycAccess.cycAccessInstances.get(Thread.currentThread());
		if (cycAccess != null) {
			return cycAccess;
		}
		if (CycAccess.sharedCycAccessInstance != null) {
			return CycAccess.sharedCycAccessInstance;
		}
		throw new RuntimeException("No CycAccess object for this thread");
	}

	public static boolean hasCurrent() {
		return CycAccess.currentCyc.get() instanceof CycAccess;
	}

	@Deprecated
	public static void setSharedCycAccessInstance(final CycAccess sharedCycAccessInstance) {
		CycAccess.sharedCycAccessInstance = sharedCycAccessInstance;
	}

	@Deprecated
	public CycLeaseManager getCycLeaseManager() {
		if (this.c == null) {
			return this.getCycConnection().getCycLeaseManagerMap().get(this.hostName + Integer.toString(this.port + 14));
		}
		throw new CycApiException("Please access CycLeaseManager via CycConnection when Comm object is specified");
	}

	public void traceOn() {
		this.cycConnection.traceOn();
		this.trace = 1;
	}

	public void traceOnDetailed() {
		if (this.cycConnection != null) {
			this.cycConnection.traceOnDetailed();
		}
		this.trace = 2;
	}

	public void traceOff() {
		this.cycConnection.traceOff();
		this.trace = 0;
	}

	public String getHostName() {
		return this.cycConnection.getHostName();
	}

	public int getBasePort() {
		return this.cycConnection.getBasePort();
	}

	public int getHttpPort() {
		return this.cycConnection.getHttpPort();
	}

	public String getBrowserUrl() {
		return "http://" + this.getHostName() + ":" + this.getHttpPort() + "/cgi-bin/cg?cb-start";
	}

	public synchronized CycConnectionInterface getCycConnection() {
		try {
			this.maybeReEstablishCycConnection();
		} catch (IOException ex) {
			Log.current.println("Couldn't re-establish Cyc connection.\n" + ex.getLocalizedMessage());
		}
		return this.cycConnection;
	}

	public boolean isClosed() {
		return this.isClosed;
	}

	public synchronized void close() {
		if (this.isClosed) {
			return;
		}
		this.isClosed = true;
		if (this.cycConnection != null) {
			this.cycConnection.close();
		}
		if (this.areAPIRequestsLoggedToFile) {
			try {
				this.apiRequestLog.close();
			} catch (IOException e) {
				System.err.println("error when closing apiRequestLog: " + e.getMessage());
			}
		}
		CycAccess.cycAccessInstances.remove(Thread.currentThread());
		for (final Map.Entry<String, CycAccess> entry : CycAccess.currentCycAccesses.entrySet()) {
			if (entry.getValue().equals(this)) {
				CycAccess.currentCycAccesses.remove(entry.getKey());
			}
		}
	}

	public Object converseObject(final Object command) throws UnknownHostException, IOException, CycApiException {
		Object[] response = { null, null };
		response = this.converse(command);
		if (response[0].equals(Boolean.TRUE)) {
			return response[1];
		}
		throw new ConverseException(command, this, response);
	}

	public CycList converseList(final Object command) throws UnknownHostException, IOException, CycApiException {
		Object[] response = { null, null };
		response = this.converse(command);
		if (response[0].equals(Boolean.TRUE)) {
			if (response[1].equals(CycObjectFactory.nil)) {
				return new CycList();
			}
			if (response[1] instanceof CycList) {
				return (CycList) response[1];
			}
		}
		throw new ConverseException(command, this, response);
	}

	public CycFormulaSentence converseSentence(final Object command) throws UnknownHostException, IOException, CycApiException {
		return new CycFormulaSentence((Iterable) this.converseList(command));
	}

	public CycObject converseCycObject(final Object command) throws UnknownHostException, IOException, CycApiException {
		Object[] response = { null, null };
		response = this.converse(command);
		if (!response[0].equals(Boolean.TRUE)) {
			throw new ConverseException(command, this, response);
		}
		if (response[1].equals(CycObjectFactory.nil)) {
			return (CycObject) new CycList();
		}
		return (CycObject) response[1];
	}

	public String converseString(final Object command) throws UnknownHostException, IOException, CycApiException {
		Object[] response = { null, null };
		response = this.converse(command);
		if (!response[0].equals(Boolean.TRUE)) {
			throw new ConverseException(command, this, response);
		}
		if (!(response[1] instanceof String)) {
			throw new RuntimeException("Expected String but received (" + response[1].getClass() + ") " + response[1] + "\n in response to command " + command);
		}
		return (String) response[1];
	}

	public void requireNonOpenCyc() throws IOException {
		if (this.isOpenCyc()) {
			throw new UnsupportedOperationException("This operation is not supported by OpenCyc.");
		}
	}

	private void setupComm(final Comm c) throws CycApiException, IOException {
		this.persistentConnection = 2;
		(this.c = c).setCycConnection(this.cycConnection = (CycConnectionInterface) new CycConnection(c, this));
	}

	public boolean hasStaticCycServer() {
		return this.cycConnection.connectedToStaticCyc();
	}

	public boolean converseBoolean(final Object command) throws UnknownHostException, IOException, CycApiException {
		Object[] response = { null, null };
		response = this.converse(command);
		if (response[0].equals(Boolean.TRUE)) {
			return response[1].toString().equals("T");
		}
		throw new ConverseException(command, this, response);
	}

	public int converseInt(final Object command) throws UnknownHostException, IOException, CycApiException {
		Object[] response = { null, null };
		response = this.converse(command);
		if (response[0].equals(Boolean.TRUE)) {
			return Integer.valueOf(response[1].toString());
		}
		throw new ConverseException(command, this, response);
	}

	public void converseVoid(final Object command) throws UnknownHostException, IOException, CycApiException {
		Object[] response = { null, null };
		response = this.converse(command);
		if (response[0].equals(Boolean.FALSE)) {
			throw new ConverseException(command, this, response);
		}
	}

	public String maybeAddLoginRedirect(final String urlString, final CycFort cyclist, final CycDenotationalTerm applicationTerm) {
		final int questionMarkPos = urlString.indexOf(63);
		if (cyclist instanceof CycConstant && questionMarkPos >= 0) {
			final String cgiProgram = urlString.substring(0, questionMarkPos);
			final String originalQueryString = urlString.substring(questionMarkPos + 1);
			final StringBuilder stringBuilder = new StringBuilder(cgiProgram);
			stringBuilder.append("?cb-login-handler");
			stringBuilder.append("&new_login_name=").append(((CycConstant) cyclist).getName());
			this.maybeAddPassword(cyclist, applicationTerm, stringBuilder);
			stringBuilder.append("&redirect-handler=").append(originalQueryString);
			return stringBuilder.toString();
		}
		return urlString;
	}

	private String doubleURLEncode(final String password) throws UnsupportedEncodingException {
		return this.urlEncode(this.urlEncode(password));
	}

	private String urlEncode(final String password) throws UnsupportedEncodingException {
		return URLEncoder.encode(password, "UTF-8");
	}

	private void maybeAddPassword(final CycFort cyclist, final CycDenotationalTerm applicationTerm, final StringBuilder stringBuilder) {
		if (cyclist instanceof CycConstant) {
			final PasswordManager passwordManager = new PasswordManager(this);
			try {
				if (passwordManager.isPasswordRequired()) {
					final String password = passwordManager.lookupPassword((CycConstant) cyclist, applicationTerm);
					if (password != null) {
						final String urlEncodedPassword = this.doubleURLEncode(password);
						stringBuilder.append("&new_login_hashed_password=").append(urlEncodedPassword);
					}
				}
			} catch (IOException ex) {
			}
		}
	}

	public void setReadableNarts() throws UnknownHostException, IOException, CycApiException {
		this.converseVoid("(csetq *print-readable-narts t)");
	}

	public CycConstant getKnownConstantByName(final String constantName) throws UnknownHostException, IOException, CycApiException {
		final CycConstant cycConstant = this.getConstantByName(constantName);
		if (cycConstant == null) {
			throw new CycApiException("Expected constant not found " + constantName);
		}
		return cycConstant;
	}

	public CycFort getKnownFortByName(final String fortName) throws UnknownHostException, IOException, CycApiException {
		CycFort fort = null;
		if (fortName.contains(")")) {
			final CycList terms = new CycListParser(this).read(fortName);
			fort = (CycFort) this.getCycNartFromCons(terms);
		} else {
			fort = (CycFort) this.getKnownConstantByName(fortName);
		}
		if (fort == null) {
			throw new CycApiException("'" + fortName + "' is not a valid FORT name.");
		}
		return fort;
	}

	public CycDenotationalTerm getTermByName(final String termName) throws UnknownHostException, IOException, CycApiException {
		CycDenotationalTerm term = null;
		if (termName.contains(")")) {
			final CycList terms = new CycListParser(this).read(termName);
			term = (CycDenotationalTerm) this.getCycNartFromCons(terms);
			if (term == null && this.isFunction((CycObject) terms.first())) {
				term = (CycDenotationalTerm) new CycNaut((Iterable) terms);
			}
		} else {
			term = (CycDenotationalTerm) this.getKnownConstantByName(termName);
		}
		if (term == null) {
			throw new CycApiException("'" + termName + "' is not a valid FORT name.");
		}
		return term;
	}

	public List findConstantsForNames(final List constantNames) throws UnknownHostException, IOException, CycApiException {
		if (constantNames == null || constantNames.size() <= 0) {
			return null;
		}
		final StringBuffer command = new StringBuffer("(MAPCAR (QUOTE FIND-CONSTANT) (LIST");
		final Iterator iter = constantNames.iterator();
		while (iter.hasNext()) {
			command.append(" \"");
			final String curConstName = StringUtils.escapeDoubleQuotes("" + iter.next());
			command.append(curConstName);
			command.append("\"");
		}
		command.append("))");
		final Object result = this.converseCycObject("" + (Object) command);
		if (!(result instanceof CycList)) {
			return null;
		}
		return (List) result;
	}

	public List findConstantsForGuids(final List<CycObject> constantGuids) throws UnknownHostException, IOException, CycApiException {
		if (constantGuids == null || constantGuids.size() <= 0) {
			return null;
		}
		final List result = new ArrayList();
		for (final CycObject item : constantGuids) {
			try {
				result.add(this.getConstantByGuid(((CycConstant) item).getGuid()));
			} catch (Exception e) {
				result.add(CycObjectFactory.nil);
			}
		}
		return result;
	}

	public CycConstant getConstantByName(final String constantName) throws UnknownHostException, IOException, CycApiException {
		String name = constantName;
		if (constantName.startsWith("#$")) {
			name = name.substring(2);
		}
		CycConstant answer = CycObjectFactory.getCycConstantCacheByName(name);
		if (answer != null) {
			return answer;
		}
		final String command = SubLAPIHelper.makeSubLStmt("find-constant", new Object[] { name });
		final Object answerObject = this.converseObject(command);
		if (answerObject instanceof CycConstant) {
			answer = (CycConstant) answerObject;
			CycObjectFactory.addCycConstantCache(answer);
			return answer;
		}
		return null;
	}

	public Guid getConstantGuid(final String constantName) throws UnknownHostException, IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt("guid-to-string", new Object[] { SubLAPIHelper.makeNestedSubLStmt("constant-external-id", new Object[] { SubLAPIHelper.makeNestedSubLStmt("find-constant", new Object[] { constantName }) }) });
		return CycObjectFactory.makeGuid(this.converseString(command));
	}

	public CycAssertion getAssertionById(final Integer id) throws UnknownHostException, IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt("find-assertion-by-id", new Object[] { id });
		final Object obj = this.converseObject(command);
		if (obj.equals(new CycSymbol("NIL"))) {
			return null;
		}
		if (!(obj instanceof CycAssertion)) {
			throw new RuntimeException(obj + " is not a CycAssertion");
		}
		return (CycAssertion) obj;
	}

	public String getConstantName(final Guid guid) throws UnknownHostException, IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt("constant-name", new Object[] { SubLAPIHelper.makeNestedSubLStmt("find-constant-by-external-id", new Object[] { SubLAPIHelper.makeNestedSubLStmt("string-to-guid", new Object[0]), guid.toString() }) });
		return this.converseString(command);
	}

	public CycConstant getKnownConstantByGuid(final String guidString) throws UnknownHostException, IOException, CycApiException {
		final Guid guid = CycObjectFactory.makeGuid(guidString);
		return this.getKnownConstantByGuid(guid);
	}

	public CycConstant getKnownConstantByGuid(final Guid guid) throws UnknownHostException, IOException, CycApiException {
		final CycConstant cycConstant = this.getConstantByGuid(guid);
		if (cycConstant == null) {
			throw new CycApiException("Expected constant not found " + guid);
		}
		return cycConstant;
	}

	public CycConstant getConstantByGuid(final Guid guid) throws UnknownHostException, IOException, CycApiException {
		CycConstant answer = CycObjectFactory.getCycConstantCacheByGuid(guid);
		if (answer != null) {
			return answer;
		}
		final String command = SubLAPIHelper.makeSubLStmt("find-constant-by-external-id", new Object[] { SubLAPIHelper.makeNestedSubLStmt("string-to-guid", new Object[] { guid.getGuidString() }) });
		final Object answerObject = this.converseObject(command);
		if (answerObject instanceof CycConstant) {
			answer = (CycConstant) answerObject;
			CycObjectFactory.addCycConstantCache(answer);
			return answer;
		}
		return null;
	}

	public String cyclifyString(final String str) throws UnknownHostException, IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt("cyclify-string", new Object[] { str });
		final String answer = this.converseString(command);
		return answer;
	}

	public CycConstant makeConstantWithGuidName(final String guidString, final String constantName) {
		return this.makeConstantWithGuidName(CycObjectFactory.makeGuid(guidString), constantName);
	}

	public CycConstant makeConstantWithGuidName(final Guid guid, final String constantName) {
		CycConstant answer = CycObjectFactory.getCycConstantCacheByGuid(guid);
		if (answer != null) {
			return answer;
		}
		answer = new CycConstant(constantName, guid);
		CycObjectFactory.addCycConstantCache(answer);
		return answer;
	}

	public CycNart getCycNartFromCons(final CycList elCons) throws UnknownHostException, IOException {
		if (this.isReifiableFunction((CycObject) elCons.get(0))) {
			return new CycNart(elCons);
		}
		return null;
	}

	public boolean predicateRelates(final CycConstant binaryPredicate, final CycFort arg1, final CycFort arg2) throws UnknownHostException, IOException, CycApiException {
		Object[] response = { null, null };
		final String command = SubLAPIHelper.makeSubLStmt("pred-u-v-holds-in-any-mt", new Object[] { binaryPredicate, arg1, arg2 });
		response = this.converse(command);
		if (response[0].equals(Boolean.TRUE)) {
			return response[1] != null && response[1].toString().equals("T");
		}
		throw new CycApiException(response[1].toString());
	}

	public boolean predicateRelates(final CycConstant binaryPredicate, final CycFort arg1, final CycFort arg2, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		Object[] response = { null, null };
		final String command = SubLAPIHelper.makeSubLStmt("pred-u-v-holds", new Object[] { binaryPredicate, arg1, arg2, this.makeELMt(mt) });
		response = this.converse(command);
		if (response[0].equals(Boolean.TRUE)) {
			return response[1] != null && response[1].toString().equals("T");
		}
		throw new CycApiException(response[1].toString());
	}

	private String getGeneratedPhrase(final CycObject cycObject, final boolean precise, final CycObject languageMt) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		final NLFormat nlf = NLFormat.getInstance(this);
		nlf.setPrecise(precise);
		if (languageMt != null) {
			nlf.setFormatLanguageMt(languageMt);
		}
		return nlf.format((Object) cycObject);
	}

	public String getGeneratedPhrase(final CycObject cycObject) throws UnknownHostException, IOException, CycApiException {
		return this.getGeneratedPhrase(cycObject, true, null);
	}

	public String getParaphrase(final CycList assertion) throws UnknownHostException, IOException, CycApiException {
		return this.getGeneratedPhrase((CycObject) assertion);
	}

	public String getParaphrase(final CycFormulaSentence sentence) throws UnknownHostException, IOException, CycApiException {
		return this.getGeneratedPhrase((CycObject) sentence);
	}

	public String getImpreciseParaphrase(final String assertionString) throws UnknownHostException, IOException, CycApiException {
		final CycFormulaSentence assertion = this.makeCycSentence(assertionString);
		return this.getGeneratedPhrase((CycObject) assertion, false, null);
	}

	public String getImpreciseParaphrase(final CycList assertion) throws UnknownHostException, IOException, CycApiException {
		return this.getGeneratedPhrase((CycObject) assertion, false, null);
	}

	public String getImpreciseParaphrase(final CycFormulaSentence sentence) throws UnknownHostException, IOException, CycApiException {
		return this.getGeneratedPhrase((CycObject) sentence, false, null);
	}

	public String getComment(final CycObject cycObject) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		if (cycObject instanceof CycList) {
			return null;
		}
		final String script = "(clet ((comment-string \n         (with-all-mts (comment " + cycObject.stringApiValue() + ")))) \n" + "  (fif comment-string \n" + "       (string-substitute \" \" \"\\\"\" comment-string) \n" + "       \"\"))";
		return this.converseString(script);
	}

	public String getComment(final CycObject cycObject, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		if (mt == null) {
			throw new NullPointerException("mt must not be null");
		}
		final String script = "(clet ((comment-string \n         (comment " + cycObject.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + "))) \n" + "  (fif comment-string \n" + "       (string-substitute \" \" \"\\\"\" comment-string) \n" + "       \"\"))";
		return this.converseString(script);
	}

	public CycList getIsas(final CycObject cycObject) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		return this.converseList("(remove-duplicates (with-all-mts (isa " + cycObject.stringApiValue() + ")))");
	}

	public CycList getIsas(final CycObject cycObject, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		if (mt == null) {
			throw new NullPointerException("mt must not be null");
		}
		return this.converseList("(isa " + cycObject.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getGenls(final CycObject cycObject) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		return this.converseList("(remove-duplicates (with-all-mts (genls " + cycObject.stringApiValue() + ")))");
	}

	public CycList getGenls(final CycObject cycObject, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		if (mt == null) {
			throw new NullPointerException("mt must not be null");
		}
		return this.converseList("(genls " + cycObject.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getMinGenls(final CycFort cycFort) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(remove-duplicates (with-all-mts (min-genls " + cycFort.stringApiValue() + ")))");
	}

	public CycList getMinGenls(final CycFort cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(min-genls " + cycFort.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getSpecs(final CycFort cycFort) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(remove-duplicates (with-all-mts (specs " + cycFort.stringApiValue() + ")))");
	}

	public CycList getSpecs(final CycFort cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(specs " + cycFort.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getMaxSpecs(final CycFort cycFort) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(remove-duplicates (with-all-mts (max-specs " + cycFort.stringApiValue() + ")))");
	}

	public CycList getMaxSpecs(final CycFort cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(max-specs " + cycFort.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getGenlSiblings(final CycFort cycFort) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(remove-duplicates (with-all-mts (genl-siblings " + cycFort.stringApiValue() + ")))");
	}

	public CycList getGenlSiblings(final CycFort cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(genl-siblings " + cycFort.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getSiblings(final CycFort cycFort) throws UnknownHostException, IOException, CycApiException {
		return this.getSpecSiblings(cycFort);
	}

	public CycList getSiblings(final CycFort cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.getSpecSiblings(cycFort, mt);
	}

	public CycList getSpecSiblings(final CycFort cycFort) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(remove-duplicates (with-all-mts (spec-siblings " + cycFort.stringApiValue() + ")))");
	}

	public CycList getSpecSiblings(final CycFort cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(spec-siblings " + cycFort.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getAllGenls(final CycFort cycFort) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(all-genls-in-any-mt " + cycFort.stringApiValue() + ")");
	}

	public CycList getAllGenls(final CycObject cycObject, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		if (mt == null) {
			throw new NullPointerException("mt must not be null");
		}
		return this.converseList("(all-genls " + cycObject.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getAllSpecs(final CycFort cycFort) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(remove-duplicates (with-all-mts (all-specs " + cycFort.stringApiValue() + ")))");
	}

	public CycList getAllSpecs(final CycFort cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(all-specs " + cycFort.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getAllGenlsWrt(final CycFort spec, final CycFort genl) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(remove-duplicates (with-all-mts (all-genls-wrt " + spec.stringApiValue() + " " + genl.stringApiValue() + ")))");
	}

	public CycList getAllGenlsWrt(final CycFort spec, final CycFort genl, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(all-genls-wrt " + spec.stringApiValue() + " " + genl.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getAllDependentSpecs(final CycFort cycFort) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(remove-duplicates (with-all-mts (all-dependent-specs " + cycFort.stringApiValue() + ")))");
	}

	public CycList getAllDependentSpecs(final CycFort cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(all-dependent-specs " + cycFort.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public List<CycAssertion> getAllTermAssertions(final CycFort cycFort) throws UnknownHostException, CycApiException, IOException {
		final String command = SubLAPIHelper.makeSubLStmt("all-term-assertions", new Object[] { cycFort });
		return (List<CycAssertion>) this.converseList(command);
	}

	public CycList getSampleLeafSpecs(final CycFort cycFort, final int numberOfSamples) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(with-all-mts (sample-leaf-specs " + cycFort.stringApiValue() + " " + numberOfSamples + "))");
	}

	public CycList getSampleLeafSpecs(final CycFort cycFort, final int numberOfSamples, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(sample-leaf-specs " + cycFort.stringApiValue() + " " + numberOfSamples + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycFort getMinCol(final CycList collections) throws UnknownHostException, IOException, CycApiException {
		return (CycFort) this.converseObject("(with-all-mts (min-col " + collections.stringApiValue() + "))");
	}

	public CycFort getMinCol(final CycList collections, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (collections == null) {
			throw new NullPointerException("collections must not be null");
		}
		if (mt == null) {
			throw new NullPointerException("mt must not be null");
		}
		return (CycFort) this.converseObject("(with-inference-mt-relevance " + this.makeELMt(mt).stringApiValue() + " (min-col " + collections.stringApiValue() + "))");
	}

	public CycList getMaxCols(final CycList collections) throws UnknownHostException, IOException, CycApiException {
		assert collections != null : "collections cannot be null";
		return this.converseList("(with-all-mts (max-cols " + collections.stringApiValue() + "))");
	}

	public CycList getMaxCols(final CycList collections, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (collections == null) {
			throw new NullPointerException("collections must not be null");
		}
		if (mt == null) {
			throw new NullPointerException("mt must not be null");
		}
		return this.converseList("(with-inference-mt-relevance " + this.makeELMt(mt).stringApiValue() + " (max-cols " + collections.stringApiValue() + "))");
	}

	public CycList getMinCols(final CycList collections) throws UnknownHostException, IOException, CycApiException {
		assert collections != null : "collections cannot be null";
		return this.converseList("(with-all-mts (min-cols " + collections.stringApiValue() + "))");
	}

	public CycList getMinCols(final CycList collections, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (collections == null) {
			throw new NullPointerException("collections must not be null");
		}
		if (mt == null) {
			throw new NullPointerException("mt must not be null");
		}
		return this.converseList("(with-inference-mt-relevance " + this.makeELMt(mt).stringApiValue() + " (min-cols " + collections.stringApiValue() + "))");
	}

	public boolean isSpecOf(final CycObject spec, final CycObject genl) throws UnknownHostException, IOException, CycApiException {
		return this.isGenlOf(genl, spec);
	}

	public boolean isSpecOf(final CycObject spec, final CycObject genl, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.isGenlOf(genl, spec, mt);
	}

	public boolean isGenlOf(final CycObject genl, final CycObject spec) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(genl-in-any-mt? " + spec.stringApiValue() + " " + genl.stringApiValue() + ")");
	}

	public boolean isGenlOf_Cached(final CycObject genl, final CycObject spec) throws UnknownHostException, IOException, CycApiException {
		final Pair args = new Pair((Object) genl, (Object) spec);
		final Boolean isGenlOf = this.isGenlOfCache.get(args);
		if (isGenlOf != null) {
			return isGenlOf;
		}
		final boolean answer = this.isGenlOf(genl, spec);
		this.isGenlOfCache.put(args, answer);
		return answer;
	}

	public boolean isGenlOf(final CycObject genl, final CycObject spec, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(genl? " + spec.stringApiValue() + " " + genl.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public boolean isGenlPredOf(final CycFort genlPred, final CycFort specPred, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(genl-predicate? " + specPred.stringApiValue() + " " + genlPred.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public boolean isGenlPredOf(final CycFort genlPred, final CycFort specPred) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(with-all-mts (genl-predicate? " + specPred.stringApiValue() + " " + genlPred.stringApiValue() + "))");
	}

	public boolean isGenlInverseOf(final CycFort genlPred, final CycFort specPred, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(genl-inverse? " + specPred.stringApiValue() + " " + genlPred.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public boolean isGenlInverseOf(final CycFort genlPred, final CycFort specPred) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(with-all-mts (genl-inverse? " + specPred.stringApiValue() + " " + genlPred.stringApiValue() + "))");
	}

	public boolean isGenlMtOf(final CycObject genlMt, final CycObject specMt) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(genl-mt? " + this.makeELMt(specMt).stringApiValue() + " " + this.makeELMt(genlMt).stringApiValue() + ")");
	}

	public boolean areTacitCoextensional(final CycFort collection1, final CycFort collection2) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(with-all-mts (tacit-coextensional? " + collection1.stringApiValue() + " " + collection2.stringApiValue() + "))");
	}

	public boolean areTacitCoextensional(final CycFort collection1, final CycFort collection2, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(tacit-coextensional? " + collection1.stringApiValue() + " " + collection2.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public boolean areAssertedCoextensional(final CycFort collection1, final CycFort collection2) throws UnknownHostException, IOException, CycApiException {
		final CycConstant coExtensional = this.getKnownConstantByGuid("bd59083a-9c29-11b1-9dad-c379636f7270");
		return this.predicateRelates(coExtensional, collection1, collection2) || this.predicateRelates(coExtensional, collection2, collection1);
	}

	public boolean areAssertedCoextensional(final CycFort collection1, final CycFort collection2, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final CycConstant coExtensional = this.getKnownConstantByGuid("bd59083a-9c29-11b1-9dad-c379636f7270");
		return this.predicateRelates(coExtensional, collection1, collection2, mt) || this.predicateRelates(coExtensional, collection2, collection1, mt);
	}

	public boolean areIntersecting(final CycFort collection1, final CycFort collection2) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(with-all-mts (collections-intersect? " + collection1.stringApiValue() + " " + collection2.stringApiValue() + "))");
	}

	public boolean areIntersecting(final CycFort collection1, final CycFort collection2, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(collections-intersect? " + collection1.stringApiValue() + " " + collection2.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public boolean areHierarchical(final CycFort collection1, final CycFort collection2) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(with-all-mts (hierarchical-collections? " + collection1.stringApiValue() + " " + collection2.stringApiValue() + "))");
	}

	public boolean areHierarchical(final CycFort collection1, final CycFort collection2, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(hierarchical-collections? " + collection1.stringApiValue() + collection2.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getWhyGenl(final CycFort spec, final CycFort genl) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(with-all-mts (why-genl? " + spec.stringApiValue() + " " + genl.stringApiValue() + "))");
	}

	public CycList getWhyGenl(final CycFort spec, final CycFort genl, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(why-genl? " + spec.stringApiValue() + " " + genl.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public List getWhyGenlParaphrase(final CycFort spec, final CycFort genl) throws UnknownHostException, IOException, CycApiException {
		final CycList listAnswer = this.converseList("(with-all-mts (why-genl? " + spec.stringApiValue() + " " + genl.stringApiValue() + "))");
		final List answerPhrases = new ArrayList();
		if (listAnswer.size() == 0) {
			return answerPhrases;
		}
		final CycList iter = listAnswer;
		for (int i = 0; i < listAnswer.size(); ++i) {
			final CycList assertion = (CycList) ((CycList) listAnswer.get(i)).first();
			answerPhrases.add(this.getParaphrase(assertion));
		}
		return answerPhrases;
	}

	public List getWhyGenlParaphrase(final CycFort spec, final CycFort genl, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final CycList listAnswer = this.converseList("(why-genl? " + spec.stringApiValue() + " " + genl.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
		final List answerPhrases = new ArrayList();
		if (listAnswer.size() == 0) {
			return answerPhrases;
		}
		final CycList iter = listAnswer;
		for (int i = 0; i < listAnswer.size(); ++i) {
			final CycList assertion = (CycList) ((CycList) listAnswer.get(i)).first();
			answerPhrases.add(this.getParaphrase(assertion));
		}
		return answerPhrases;
	}

	public CycList getWhyCollectionsIntersect(final CycFort collection1, final CycFort collection2) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(with-all-mts (why-collections-intersect? " + collection1.stringApiValue() + " " + collection2.stringApiValue() + "))");
	}

	public CycList getWhyCollectionsIntersect(final CycFort collection1, final CycFort collection2, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(why-collections-intersect? " + collection1.stringApiValue() + " " + collection2.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public List getWhyCollectionsIntersectParaphrase(final CycFort collection1, final CycFort collection2) throws UnknownHostException, IOException, CycApiException {
		final CycList listAnswer = this.converseList("(with-all-mts (why-collections-intersect? " + collection1.stringApiValue() + " " + collection2.stringApiValue() + "))");
		final List answerPhrases = new ArrayList();
		if (listAnswer.size() == 0) {
			return answerPhrases;
		}
		final CycList iter = listAnswer;
		for (int i = 0; i < listAnswer.size(); ++i) {
			final CycList assertion = (CycList) ((CycList) listAnswer.get(i)).first();
			answerPhrases.add(this.getParaphrase(assertion));
		}
		return answerPhrases;
	}

	public List getWhyCollectionsIntersectParaphrase(final CycFort collection1, final CycFort collection2, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final CycList listAnswer = this.converseList("(with-all-mts (why-collections-intersect? " + collection1.stringApiValue() + " " + collection2.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
		final List answerPhrases = new ArrayList();
		if (listAnswer.size() == 0) {
			return answerPhrases;
		}
		final CycList iter = listAnswer;
		for (int i = 0; i < listAnswer.size(); ++i) {
			final CycList assertion = (CycList) ((CycList) listAnswer.get(i)).first();
			answerPhrases.add(this.getParaphrase(assertion));
		}
		return answerPhrases;
	}

	public CycList getCollectionLeaves(final CycFort cycFort) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(with-all-mts (collection-leaves " + cycFort.stringApiValue() + "))");
	}

	public CycList getCollectionLeaves(final CycFort cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(collection-leaves " + cycFort.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getLocalDisjointWith(final CycObject cycFort) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(with-all-mts (local-disjoint-with " + cycFort.stringApiValue() + "))");
	}

	public CycList getLocalDisjointWith(final CycObject cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(local-disjoint-with " + cycFort.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public boolean areDisjoint(final CycObject collection1, final CycObject collection2) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(with-all-mts (disjoint-with? " + collection1.stringApiValue() + " " + collection2.stringApiValue() + "))");
	}

	public boolean areDisjoint(final CycObject collection1, final CycObject collection2, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(with-all-mts (disjoint-with? " + collection1.stringApiValue() + " " + collection2.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getMinIsas(final CycObject cycFort) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(with-all-mts (min-isa " + cycFort.stringApiValue() + "))");
	}

	public CycList getMinIsas(final CycObject cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(min-isa " + cycFort.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getInstances(final CycObject cycFort) throws UnknownHostException, IOException, CycApiException {
		final CycList result = this.converseList("(with-all-mts (instances " + cycFort.stringApiValue() + "))");
		return result;
	}

	public CycList getInstances(final CycObject cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(instances " + cycFort.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getInstanceSiblings(final CycObject cycFort) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(with-all-mts (instance-siblings " + cycFort.stringApiValue() + "))");
	}

	public CycList getInstanceSiblings(final CycObject cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(instance-siblings " + cycFort.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getAllIsa(final CycObject cycFort) throws UnknownHostException, IOException, CycApiException {
		final String command = "(all-isa-in-any-mt " + cycFort.stringApiValue() + ")";
		final CycList result = this.converseList(command);
		return result;
	}

	public CycList getAllIsa(final CycObject cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(all-isa " + cycFort.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getAllInstances(final CycObject cycFort) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(all-instances-in-all-mts " + cycFort.stringApiValue() + ")");
	}

	public CycList getAllInstances(final CycObject cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(all-instances " + cycFort.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getAllQuotedInstances(final CycObject cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.getAllQuotedInstances(cycFort, mt, 0L);
	}

	public CycList getAllQuotedInstances(final CycObject cycFort, final CycObject mt, final long timeoutMsecs) throws UnknownHostException, IOException, CycApiException, TimeOutException {
		final CycVariable queryVariable = CycObjectFactory.makeCycVariable("?QUOTED-INSTANCE");
		final CycFormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(new Object[] { this.getKnownConstantByName("quotedIsa"), queryVariable, cycFort });
		return this.queryVariable(queryVariable, query, (CycObject) this.makeELMt(mt), null, timeoutMsecs);
	}

	public boolean isa(final CycObject term, final String collectionName) throws UnknownHostException, IOException, CycApiException {
		return this.isa(term, (CycFort) this.getKnownConstantByName(collectionName));
	}

	public boolean isa(final CycObject term, final CycFort collection) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(isa-in-any-mt? " + term.stringApiValue() + " " + collection.stringApiValue() + ")");
	}

	public boolean isa(final CycObject term, final CycObject collection, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final String command = "(isa? " + term.stringApiValue() + " " + collection.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")";
		return this.converseBoolean(command);
	}

	public boolean provablyNotIsa(final CycObject term, final CycObject collection, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final String command = "(not-isa? " + term.stringApiValue() + " " + collection.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")";
		return this.converseBoolean(command);
	}

	public boolean isQuotedIsa(final CycObject term, final CycObject collection) throws UnknownHostException, IOException, CycApiException, TimeOutException {
		return this.isQuotedIsa(term, collection, 0L);
	}

	public boolean isQuotedIsa(final CycObject term, final CycObject collection, final long timeoutMsecs) throws UnknownHostException, IOException, CycApiException, TimeOutException {
		if (term == null) {
			throw new NullPointerException("term must not be null");
		}
		if (collection == null) {
			throw new NullPointerException("collection must not be null");
		}
		final CycFormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(new Object[] { this.getKnownConstantByName("quotedIsa"), term, collection });
		return this.isQueryTrue(query, (CycObject) CycAccess.inferencePSC, null, timeoutMsecs);
	}

	public boolean isQuotedIsa(final CycObject term, final CycObject collection, final CycObject mt) throws UnknownHostException, IOException, CycApiException, TimeOutException {
		return this.isQuotedIsa(term, collection, mt, 0L);
	}

	public boolean isQuotedIsa(final CycObject term, final CycObject collection, final CycObject mt, final long timeoutMsecs) throws UnknownHostException, IOException, CycApiException, TimeOutException {
		if (term == null) {
			throw new NullPointerException("Term must not be null.");
		}
		if (collection == null) {
			throw new NullPointerException("Collection must not be null.");
		}
		if (mt == null) {
			throw new NullPointerException("Microtheory must not be null.");
		}
		final CycFormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(new Object[] { this.getKnownConstantByName("quotedIsa"), term, collection });
		return this.isQueryTrue(query, (CycObject) this.makeELMt(mt), null, timeoutMsecs);
	}

	public CycList getWhyIsa(final CycObject spec, final CycObject genl) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(with-all-mts (why-isa? " + spec.stringApiValue() + " " + genl.stringApiValue() + "))");
	}

	public CycList getWhyIsa(final CycObject spec, final CycObject genl, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(why-isa? " + spec.stringApiValue() + " " + genl.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public List getWhyIsaParaphrase(final CycObject spec, final CycObject genl) throws IOException, CycApiException {
		final String command = "(with-all-mts (why-isa? " + spec.stringApiValue() + " " + genl.stringApiValue() + "))";
		final CycList listAnswer = this.converseList(command);
		final List answerPhrases = new ArrayList();
		if (listAnswer.size() == 0) {
			return answerPhrases;
		}
		for (int i = 0; i < listAnswer.size(); ++i) {
			final CycList assertion = (CycList) ((CycList) listAnswer.get(i)).first();
			answerPhrases.add(this.getParaphrase(assertion));
		}
		return answerPhrases;
	}

	public List getWhyIsaParaphrase(final CycFort spec, final CycFort genl, final CycObject mt) throws IOException, CycApiException {
		final String command = "(why-isa? " + spec.stringApiValue() + " " + genl.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")";
		final CycList listAnswer = this.converseList(command);
		final List answerPhrases = new ArrayList();
		if (listAnswer.size() == 0) {
			return answerPhrases;
		}
		for (int i = 0; i < listAnswer.size(); ++i) {
			final CycList assertion = (CycList) ((CycList) listAnswer.get(i)).first();
			answerPhrases.add(this.getParaphrase(assertion));
		}
		return answerPhrases;
	}

	public CycList getGenlPreds(final CycObject predicate) throws UnknownHostException, IOException, CycApiException {
		if (predicate instanceof CycList) {
			final String script = "(clet ((canonicalized-predicate (canonicalize-term " + predicate.stringApiValue() + ")))" + "  (pif (fort-p canonicalized-predicate)" + "    (remove-duplicates (with-all-mts (genl-predicates canonicalized-predicate)))" + "    nil))";
			return this.converseList(script);
		}
		return this.converseList("(remove-duplicates (with-all-mts (genl-predicates " + predicate.stringApiValue() + ")))");
	}

	public CycList getGenlPreds(final CycObject predicate, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (predicate instanceof CycList) {
			final String script = "(clet ((canonicalized-predicate (canonicalize-term " + predicate.stringApiValue() + ")))" + "  (pif (fort-p canonicalized-predicate)" + "    (remove-duplicates (with-all-mts (genl-predicates canonicalized-predicate " + this.makeELMt(mt).stringApiValue() + ")))" + "    nil))";
			return this.converseList(script);
		}
		return this.converseList("(genl-predicates " + predicate.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getAllGenlPreds(final CycConstant predicate) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(remove-duplicates (with-all-mts (all-genl-predicates " + predicate.stringApiValue() + ")))");
	}

	public CycList getAllGenlPreds(final CycConstant predicate, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(all-genl-predicates " + predicate.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getAllSpecPreds(final CycFort cycFort) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(remove-duplicates (with-all-mts (all-spec-predicates " + cycFort.stringApiValue() + ")))");
	}

	public CycList getAllSpecPreds(final CycFort cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(all-spec-predicates " + cycFort.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getAllSpecInverses(final CycFort cycFort) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(remove-duplicates (with-all-mts (all-spec-inverses " + cycFort.stringApiValue() + ")))");
	}

	public CycList getAllSpecInverses(final CycFort cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(all-spec-inverses " + cycFort.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getAllSpecMts(final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(all-spec-mts " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getArg1Isas(final CycObject cycObject) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		return this.converseList("(remove-duplicates (with-all-mts (arg1-isa " + cycObject.stringApiValue() + ")))");
	}

	public CycList getArg1Isas(final CycObject predicate, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (predicate == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		if (mt == null) {
			throw new NullPointerException("mt must not be null");
		}
		return this.converseList("(arg1-isa " + predicate.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getArg2Isas(final CycObject cycObject) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		return this.converseList("(remove-duplicates (with-all-mts (arg2-isa " + cycObject.stringApiValue() + ")))");
	}

	public CycList getArg2Isas(final CycObject cycObject, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		if (mt == null) {
			throw new NullPointerException("mt must not be null");
		}
		return this.converseList("(arg2-isa " + cycObject.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getArg3Isas(final CycFort predicate) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(remove-duplicates (with-all-mts (arg3-isa " + predicate.stringApiValue() + ")))");
	}

	public CycList getArg3Isas(final CycFort predicate, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(arg3-isa " + predicate.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getArg4Isas(final CycFort predicate) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(remove-duplicates (with-all-mts (arg4-isa " + predicate.stringApiValue() + ")))");
	}

	public CycList getArg4Isas(final CycFort predicate, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(arg4-isa " + predicate.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getArgNIsas(final CycFort predicate, final int argPosition) throws UnknownHostException, IOException, CycApiException {
		final String command = "(remove-duplicates \n  (with-all-mts \n    (argn-isa " + predicate.stringApiValue() + " " + Integer.toString(argPosition) + ")))";
		return this.converseList(command);
	}

	public CycList getArgNIsas(final CycFort predicate, final int argPosition, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final String command = "(remove-duplicates \n  (with-all-mts \n    (argn-isa \n      " + predicate.stringApiValue() + "      " + Integer.toString(argPosition) + "      " + this.makeELMt(mt).stringApiValue() + ")))";
		return this.converseList(command);
	}

	public CycList getInterArgIsa1_2s(final CycFort predicate) throws UnknownHostException, IOException, CycApiException {
		final String command = "(remove-duplicates \n  (with-all-mts \n    (inter-arg-isa1-2 " + predicate.stringApiValue() + ")))";
		return this.converseList(command);
	}

	public CycList getInterArgIsa1_2s(final CycFort predicate, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final String command = "(remove-duplicates \n  (with-all-mts \n    (inter-arg-isa1-2       " + predicate.stringApiValue() + "      " + this.makeELMt(mt).stringApiValue() + ")))";
		return this.converseList(command);
	}

	public CycList getInterArgIsa1_2_forArg2(final CycFort predicate, final CycFort arg1) throws UnknownHostException, IOException, CycApiException {
		final CycList result = new CycList();
		final ListIterator constraintPairs = this.getInterArgIsa1_2s(predicate).listIterator();
		while (constraintPairs.hasNext()) {
			final CycList pair = (CycList) constraintPairs.next();
			if (pair.first().equals(arg1)) {
				result.add(pair.second());
			}
		}
		return result;
	}

	public CycList getInterArgIsa1_2_forArg2(final CycFort predicate, final CycFort arg1, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final CycList result = new CycList();
		final ListIterator constraintPairs = this.getInterArgIsa1_2s(predicate, mt).listIterator();
		while (constraintPairs.hasNext()) {
			final CycList pair = (CycList) constraintPairs.next();
			if (pair.first().equals(arg1)) {
				result.add(pair.second());
			}
		}
		return result;
	}

	public CycList getResultIsas(final CycFort function) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(remove-duplicates (with-all-mts (result-isa " + function.stringApiValue() + ")))");
	}

	public CycList getResultIsas(final CycFort function, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(result-isa " + function.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getArgNGenls(final CycFort predicate, final int argPosition) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(remove-duplicates (with-all-mts (argn-genl " + predicate.stringApiValue() + " " + argPosition + ")))");
	}

	public CycList getArgNGenls(final CycFort predicate, final int argPosition, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(argn-genl " + predicate.stringApiValue() + " " + argPosition + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getArg1Formats(final CycObject cycObject) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		return this.converseList("(with-all-mts (arg1-format " + cycObject.stringApiValue() + "))");
	}

	public CycList getArg1Formats(final CycObject cycObject, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		return this.converseList("(arg1-format " + cycObject.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getArg2Formats(final CycObject cycObject) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		return this.converseList("(with-all-mts (arg2-format " + cycObject.stringApiValue() + "))");
	}

	public CycList getArg2Formats(final CycObject cycObject, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		return this.converseList("(arg2-format " + cycObject.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getDisjointWiths(final CycObject cycObject) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		return this.converseList("(remove-duplicates (with-all-mts (local-disjoint-with " + cycObject.stringApiValue() + ")))");
	}

	public CycList getDisjointWiths(final CycFort cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList("(local-disjoint-with " + cycFort.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public CycList getCoExtensionals(final CycObject cycObject) throws UnknownHostException, IOException, CycApiException {
		return this.getCoExtensionals(cycObject, 0L);
	}

	public CycList getCoExtensionals(final CycObject cycObject, final long timeoutMsecs) throws UnknownHostException, IOException, CycApiException, TimeOutException {
		return this.getCoExtensionals(cycObject, (CycObject) CycAccess.inferencePSC, timeoutMsecs);
	}

	public CycList getCoExtensionals(final CycObject cycObject, final CycObject mt) throws UnknownHostException, IOException, CycApiException, TimeOutException {
		return this.getCoExtensionals(cycObject, mt, 0L);
	}

	public CycList getCoExtensionals(final CycObject cycObject, final CycObject mt, final long timeoutMsecs) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		CycList answer = null;
		try {
			final String queryString = "(#$and  (#$different  " + cycObject.cyclify() + " ?X) " + "  (#$or (#$coExtensional " + cycObject.cyclify() + " ?X) " + "    (#$coextensionalSetOrCollections " + cycObject.cyclify() + " ?X)))";
			final CycFormulaSentence query = this.makeCycSentence(queryString);
			final CycVariable queryVariable = CycObjectFactory.makeCycVariable("?X");
			answer = this.queryVariable(queryVariable, query, (CycObject) this.makeELMt(mt), null, timeoutMsecs);
		} catch (IOException e) {
			Log.current.println("getCoExtensionals - ignoring:\n" + e.getMessage());
			return new CycList();
		}
		return this.canonicalizeList(answer);
	}

	public boolean isMicrotheory(final CycObject term) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(isa-in-any-mt? " + term.stringApiValue() + " #$Microtheory)");
	}

	public boolean isCollection(final CycObject cycObject) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		return this.converseBoolean("(isa-in-any-mt? " + cycObject.stringApiValue() + " #$Collection)");
	}

	public boolean isCollection(final CycObject cycObject, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		if (mt == null) {
			throw new NullPointerException("mt must not be null");
		}
		return this.converseBoolean("(isa? " + cycObject.stringApiValue() + " #$Collection " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public boolean isCollection(final Object obj) throws UnknownHostException, IOException, CycApiException {
		if (obj == null) {
			throw new NullPointerException("term must not be null");
		}
		return obj instanceof CycObject && this.isCollection((CycObject) obj);
	}

	public boolean isCollection_Cached(final CycObject cycObject) throws IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		final Boolean isCollection = this.isCollectionCache.get(cycObject);
		if (isCollection != null) {
			return isCollection;
		}
		final boolean answer = this.isCollection(cycObject);
		this.isCollectionCache.put(cycObject, answer);
		return answer;
	}

	public boolean isCollection_Cached(final Object term) throws IOException, CycApiException {
		return term instanceof CycObject && this.isCollection_Cached((CycObject) term);
	}

	public boolean isIndividual(final CycObject cycObject) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		return this.converseBoolean("(isa-in-any-mt? " + cycObject.stringApiValue() + " #$Individual)");
	}

	public boolean isIndividual(final CycObject cycObject, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		if (mt == null) {
			throw new NullPointerException("mt must not be null");
		}
		return this.converseBoolean("(isa? " + cycObject.stringApiValue() + " #$Individual " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public boolean isFunction(final CycObject cycObj) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(isa-in-any-mt? " + cycObj.stringApiValue() + " #$Function-Denotational)");
	}

	public boolean isReifiableFunction(final CycObject cycObj) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(isa-in-any-mt? " + cycObj.stringApiValue() + " #$ReifiableFunction)");
	}

	public boolean isEvaluatablePredicate(final CycFort predicate) throws UnknownHostException, IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt("with-all-mts", new Object[] { SubLAPIHelper.makeNestedSubLStmt("evaluatable-predicate?", new Object[] { predicate }) });
		return this.converseBoolean(command);
	}

	public boolean isPredicate(final CycObject cycObject) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		return this.converseBoolean("(isa-in-any-mt? " + cycObject.stringApiValue() + " #$Predicate)");
	}

	public boolean isPredicate(final CycObject cycObject, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		if (mt == null) {
			throw new NullPointerException("mt must not be null");
		}
		return this.converseBoolean("(isa? " + cycObject.stringApiValue() + " #$Predicate " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public boolean isPredicate(final Object object, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (object == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		return object instanceof CycObject && this.isPredicate((CycObject) object, mt);
	}

	public boolean isPredicate(final Object object) throws UnknownHostException, IOException, CycApiException {
		if (object == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		return object instanceof CycObject && this.isPredicate((CycObject) object);
	}

	public boolean isUnaryPredicate(final CycObject cycObject) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		return this.converseBoolean("(isa-in-any-mt? " + cycObject.stringApiValue() + " #$UnaryPredicate)");
	}

	public boolean isUnaryPredicate(final CycObject cycObject, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		if (mt == null) {
			throw new NullPointerException("mt must not be null");
		}
		return this.converseBoolean("(isa? " + cycObject.stringApiValue() + " #$UnaryPredicate " + this.makeELMt(mt).stringApiValue() + ")");
	}

	protected void verifyPossibleDenotationalTerm(final CycObject cycObject) throws IllegalArgumentException {
		if (!(cycObject instanceof CycDenotationalTerm) && !(cycObject instanceof CycList)) {
			throw new IllegalArgumentException("cycObject must be a Cyc denotational term " + cycObject.cyclify());
		}
	}

	public boolean isBinaryPredicate(final CycObject cycObject) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		return this.converseBoolean("(binary-predicate? " + cycObject.stringApiValue() + ")");
	}

	public boolean isBinaryPredicate(final CycObject cycObject, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.isBinaryPredicate(cycObject);
	}

	public boolean isValidConstantName(final String candidateName) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(new-constant-name-spec-p " + DefaultCycObject.stringApiValue((Object) candidateName) + ")");
	}

	public boolean isConstantNameAvailable(final String candidateName) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(constant-name-available \"" + candidateName + "\")");
	}

	public boolean isQuotedCollection(final CycFort cycFort) throws UnknownHostException, IOException, CycApiException {
		throw new CycApiException("quotedCollection is no longer supported, see Quote");
	}

	public boolean isQuotedCollection(final CycFort cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		throw new CycApiException("quotedCollection is no longer supported, see Quote");
	}

	public boolean isGround(final CycObject expression) throws IOException {
		return this.converseBoolean("(ground? " + DefaultCycObject.stringApiValue((Object) expression) + ")");
	}

	public boolean isPublicConstant(final CycConstant cycConstant) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(isa-in-any-mt? " + cycConstant.stringApiValue() + " #$PublicConstant)");
	}

	public CycList getPublicConstants() throws UnknownHostException, IOException, CycApiException {
		return this.getKbSubset((CycFort) this.getKnownConstantByGuid("bd7abd90-9c29-11b1-9dad-c379636f7270"));
	}

	public CycList getKbSubset(final CycFort cycKbSubsetCollection) throws UnknownHostException, IOException, CycApiException {
		final CycList answer = this.converseList("(ask-template '?X '(#$isa ?X " + cycKbSubsetCollection.stringApiValue() + ") #$EverythingPSC)");
		return this.canonicalizeList(answer);
	}

	public synchronized void rename(final CycConstant cycConstant, final String newName) throws UnknownHostException, IOException, CycApiException {
		this.rename(cycConstant, newName, true, true);
	}

	public synchronized void rename(final CycConstant cycConstant, final String newName, final boolean bookkeeping, final boolean transcript) throws UnknownHostException, IOException, CycApiException {
		final String fn = transcript ? "ke-rename-now" : "rename-constant";
		String command = "(" + fn + " " + cycConstant.stringApiValue() + "\"" + newName + "\")";
		if (bookkeeping) {
			command = this.wrapBookkeeping(command);
		}
		final Object result = this.converseObject(command);
		if (result.equals(CycObjectFactory.nil)) {
			throw new CycApiException(newName + " is an invalid new name for " + cycConstant.cyclify());
		}
		CycObjectFactory.removeCaches(cycConstant);
		cycConstant.setName(newName);
		CycObjectFactory.addCycConstantCache(cycConstant);
	}

	public synchronized boolean merge(final CycFort killFort, final CycFort keepFort) throws UnknownHostException, IOException, CycApiException {
		final String command = "(ke-merge-now " + killFort.stringApiValue() + " " + keepFort.stringApiValue() + ")";
		Object[] response = { null, null };
		response = this.converse(command);
		if (response[0].equals(Boolean.TRUE)) {
			return !response[1].equals(CycObjectFactory.nil);
		}
		throw new ConverseException((Object) command, this, response);
	}

	public synchronized void killWithoutTranscript(final CycConstant cycConstant) throws UnknownHostException, IOException, CycApiException {
		this.kill((CycFort) cycConstant, false, false);
	}

	public synchronized void kill(final CycConstant[] cycConstants) throws UnknownHostException, IOException, CycApiException {
		for (int i = 0; i < cycConstants.length; ++i) {
			this.kill((CycFort) cycConstants[i]);
		}
	}

	public synchronized void kill(final List cycConstants) throws UnknownHostException, IOException, CycApiException {
		for (int i = 0; i < cycConstants.size(); ++i) {
			this.kill((CycFort) cycConstants.get(i));
		}
	}

	public synchronized void kill(final CycFort cycFort) throws UnknownHostException, IOException, CycApiException {
		this.kill(cycFort, true, true);
	}

	public synchronized void kill(final CycFort cycFort, final boolean bookkeeping, final boolean transcript) throws UnknownHostException, IOException, CycApiException {
		final String fn = transcript ? "ke-kill-now" : "cyc-kill";
		String command = "(" + fn + " " + cycFort.stringApiValue() + ")";
		if (bookkeeping) {
			command = this.wrapBookkeeping(command);
		}
		this.converseBoolean(command);
		if (cycFort instanceof CycConstant) {
			CycObjectFactory.removeCaches((CycConstant) cycFort);
		}
	}

	public static void clearCurrentCyclist() {
		CycAccess.currentCyclist.set(null);
	}

	public static CycFort setCurrentCyclist(final CycFort cyclist) {
		CycAccess.currentCyclist.set(cyclist);
		return cyclist;
	}

	public static CycFort setCurrentCyclist(final String cyclist) throws CycApiException, IOException {
		final Object term = getCurrent().getHLCycTerm(cyclist);
		CycFort newCyclist = null;
		if (term instanceof CycFort) {
			newCyclist = (CycFort) term;
		} else {
			newCyclist = (CycFort) getCurrent().find(cyclist);
		}
		if (newCyclist == null) {
			throw new CycApiException("Cannot interpret " + cyclist + " as a cyclist.");
		}
		return setCurrentCyclist(newCyclist);
	}

	public CycFort getCyclist() {
		return (CycAccess.currentCyclist.get() != null) ? CycAccess.currentCyclist.get() : this.cyclist;
	}

	public void setCyclist(final String cyclistName) throws UnknownHostException, IOException, CycApiException {
		if (cyclistName == null || "".equals(cyclistName)) {
			throw new CycApiException("Invalid cyclist name specified.");
		}
		final Object term = this.getHLCycTerm(cyclistName);
		CycFort newCyclist = null;
		if (term instanceof CycFort) {
			newCyclist = (CycFort) term;
		} else {
			newCyclist = (CycFort) this.find(cyclistName);
		}
		if (newCyclist == null) {
			throw new CycApiException("Cannot interpret " + cyclistName + " as a cyclist.");
		}
		this.setCyclist(newCyclist);
	}

	public void setCyclist(final CycFort cyclist) {
		this.cyclist = cyclist;
	}

	public CycFort getKePurpose() {
		return this.project;
	}

	public void setKePurpose(final String projectName) throws UnknownHostException, IOException, CycApiException {
		this.setKePurpose((CycFort) this.getHLCycTerm(projectName));
	}

	public void setKePurpose(final CycFort project) {
		this.project = project;
	}

	public void assertWithTranscript(final CycList sentence, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		this.assertWithTranscript(sentence.stringApiValue(), mt);
	}

	public void assertWithTranscript(final String sentence, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		this.assertSentence(sentence, this.makeELMt(mt), false, true);
	}

	public void assertWithTranscriptAndBookkeeping(final String sentence, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		this.assertWithTranscriptAndBookkeeping(this.makeCycSentence(sentence), mt);
	}

	public void assertWithTranscriptAndBookkeeping(final CycFormulaSentence sentence, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		this.assertWithTranscriptAndBookkeepingInternal((CycObject) sentence, mt);
	}

	public void assertWithTranscriptAndBookkeeping(final CycList sentence, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		this.assertWithTranscriptAndBookkeepingInternal((CycObject) sentence, mt);
	}

	private void assertWithTranscriptAndBookkeepingInternal(final CycObject sentence, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		this.assertSentence(sentence.stringApiValue(), this.makeELMt(mt), true, true);
	}

	public void assertWithBookkeepingAndWithoutTranscript(final CycList sentence, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		this.assertWithBookkeepingAndWithoutTranscript(sentence.stringApiValue(), mt);
	}

	public void assertWithBookkeepingAndWithoutTranscript(final String sentence, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		this.assertSentence(sentence, this.makeELMt(mt), true, false);
	}

	public void assertSentence(final String sentence, final ELMt mt, final boolean bookkeeping, final boolean transcript) throws UnknownHostException, IOException, CycApiException {
		this.assertSentence(sentence, mt, bookkeeping, transcript, (CycFort) null);
	}

	public void assertSentence(final String sentence, final ELMt mt, final boolean bookkeeping, final boolean transcript, final CycFort template) throws UnknownHostException, IOException, CycApiException {
		final List<CycFort> templates = new ArrayList<CycFort>();
		if (template != null) {
			templates.add(template);
		}
		this.assertSentence(sentence, mt, bookkeeping, transcript, false, templates);
	}

	public void assertSentence(final String sentence, final ELMt mt, final boolean bookkeeping, final boolean transcript, final List<CycFort> templates) throws UnknownHostException, IOException, CycApiException {
		this.assertSentence(sentence, mt, bookkeeping, transcript, false, templates);
	}

	public void assertSentence(final String sentence, final ELMt mt, final boolean bookkeeping, final boolean transcript, final boolean disableWFFChecking, final List<CycFort> templates) throws UnknownHostException, IOException, CycApiException {
		if (getCurrentTransaction() != null) {
			getCurrentTransaction().noteForAssertion(sentence, mt, bookkeeping, transcript, disableWFFChecking, (List) templates);
			return;
		}
		String command = "(multiple-value-list (" + (transcript ? "ke-assert-now" : "cyc-assert") + "\n" + sentence + "\n" + mt.stringApiValue() + "))";
		if (bookkeeping) {
			command = this.wrapBookkeeping(command);
		} else {
			command = this.wrapCyclistAndPurpose(command);
		}
		command = this.wrapForwardInferenceRulesTemplates(command, templates);
		if (disableWFFChecking) {
			command = this.wrapDisableWffChecking(command);
		}
		final CycList<Object> results = (CycList<Object>) this.converseList(command);
		final boolean statusOk = !results.get(0).equals(CycObjectFactory.nil);
		if (!statusOk) {
			String message = "Assertion failed in mt: " + mt.cyclify();
			if (results.size() > 1) {
				message = message + "\n" + sentence + "\nbecause: \n" + results.get(1);
			}
			throw new CycApiException(message);
		}
	}

	public void unassertWithBookkeepingAndWithoutTranscript(final CycList sentence, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (getCurrentTransaction() != null) {
			getCurrentTransaction().noteForUnassertion(this.hostName, CycAccess.baseKB, true, false);
		} else {
			final String command = this.wrapBookkeeping("(cyc-unassert " + sentence.stringApiValue() + this.makeELMt(mt).stringApiValue() + ")");
			final boolean unassertOk = this.converseBoolean(command);
			if (!unassertOk) {
				throw new CycApiException("Could not unassert from mt: " + this.makeELMt(mt) + "\n  " + sentence.cyclify());
			}
		}
	}

	public void edit(final String unassertSentence, final String assertSentence, final ELMt mt, final boolean bookkeeping, final boolean transcript, final boolean disableWFFChecking, final List<CycFort> templates) throws CycApiException, UnknownHostException, IOException {
		String command = "(multiple-value-list (" + (transcript ? "ke-edit-now" : "cyc-edit") + "\n" + unassertSentence + "\n" + assertSentence + "\n" + mt.stringApiValue() + "))";
		if (bookkeeping) {
			command = this.wrapBookkeeping(command);
		} else {
			command = this.wrapCyclistAndPurpose(command);
		}
		command = this.wrapForwardInferenceRulesTemplates(command, templates);
		if (disableWFFChecking) {
			command = this.wrapDisableWffChecking(command);
		}
		final CycList<Object> results = (CycList<Object>) this.converseList(command);
		final boolean statusOk = !results.get(0).equals(CycObjectFactory.nil);
		if (!statusOk) {
			throw new CycApiException("Edit failure of " + unassertSentence + " to " + assertSentence + " in mt: " + mt.cyclify() + "\nbecause: \n" + results.get(1));
		}
	}

	public CycConstant find(final String constantName) throws UnknownHostException, IOException, CycApiException {
		if (constantName == null) {
			return null;
		}
		return this.getConstantByName(constantName);
	}

	public CycConstant findOrCreate(final String constantName) throws UnknownHostException, IOException, CycApiException {
		return this.makeCycConstant(constantName);
	}

	public CycConstant createNewPermanent(final String constantName) throws UnknownHostException, IOException, CycApiException {
		return this.makeCycConstant(constantName);
	}

	public void assertGaf(final CycObject mt, final CycDenotationalTerm predicate, final CycDenotationalTerm arg1, final CycDenotationalTerm arg2) throws UnknownHostException, IOException, CycApiException {
		final CycList sentence = new CycList();
		sentence.add((Object) predicate);
		sentence.add((Object) arg1);
		sentence.add((Object) arg2);
		this.assertWithTranscriptAndBookkeeping(sentence, mt);
	}

	public void assertGaf(final CycObject mt, final CycFort predicate, final CycFort arg1, final String arg2) throws UnknownHostException, IOException, CycApiException {
		final CycList sentence = new CycList();
		sentence.add((Object) predicate);
		sentence.add((Object) arg1);
		sentence.add((Object) arg2);
		this.assertWithTranscriptAndBookkeeping(sentence, mt);
	}

	public void assertGaf(final CycObject mt, final CycConstant predicate, final CycFort arg1, final CycList arg2) throws UnknownHostException, IOException, CycApiException {
		final CycList sentence = new CycList();
		sentence.add((Object) predicate);
		sentence.add((Object) arg1);
		sentence.add((Object) arg2);
		this.assertWithTranscriptAndBookkeeping(sentence, mt);
	}

	public void assertGaf(final CycObject mt, final CycConstant predicate, final CycFort arg1, final int arg2) throws UnknownHostException, IOException, CycApiException {
		this.assertGaf(mt, predicate, arg1, arg2);
	}

	public void assertGaf(final CycObject mt, final CycFort predicate, final CycFort arg1, final Integer arg2) throws UnknownHostException, IOException, CycApiException {
		final CycList sentence = new CycList();
		sentence.add((Object) predicate);
		sentence.add((Object) arg1);
		sentence.add((Object) arg2);
		this.assertWithTranscriptAndBookkeeping(sentence, mt);
	}

	public void assertGaf(final CycObject mt, final CycFort predicate, final CycFort arg1, final Double arg2) throws UnknownHostException, IOException, CycApiException {
		final CycList sentence = new CycList();
		sentence.add((Object) predicate);
		sentence.add((Object) arg1);
		sentence.add((Object) arg2);
		this.assertWithTranscriptAndBookkeeping(sentence, mt);
	}

	public void assertGaf(final CycObject mt, final CycConstant predicate, final CycFort arg1, final CycFort arg2, final CycFort arg3) throws UnknownHostException, IOException, CycApiException {
		final CycList sentence = new CycList();
		sentence.add((Object) predicate);
		sentence.add((Object) arg1);
		sentence.add((Object) arg2);
		sentence.add((Object) arg3);
		this.assertWithTranscriptAndBookkeeping(sentence, mt);
	}

	public void assertGaf(final CycList gaf, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		this.assertWithTranscriptAndBookkeeping(gaf, mt);
	}

	public void assertGaf(final CycFormulaSentence gaf, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		this.assertWithTranscriptAndBookkeepingInternal((CycObject) gaf, mt);
	}

	public void assertHLGaf(final CycList gaf, final CycObject mt, final CycSymbol strength) throws UnknownHostException, IOException, CycApiException {
		if (getCurrentTransaction() != null) {
			throw new UnsupportedOperationException("Attempt to call assertHLGaf aborted.  This method is not supported within the scope of a KBTransaction.");
		}
		final CycList command = new CycList();
		command.add((Object) CycObjectFactory.makeCycSymbol("hl-add-argument"));
		final CycList command2 = new CycList();
		command2.add((Object) CycObjectFactory.makeCycSymbol(":asserted-argument"));
		command2.add((Object) strength);
		command.addQuoted((Object) command2);
		final CycList command3 = new CycList();
		command3.add((Object) CycObjectFactory.nil);
		final CycList command4 = new CycList();
		final CycList canonicalGaf = new CycList();
		for (int gaf_size = gaf.size(), i = 0; i < gaf_size; ++i) {
			final Object obj = gaf.get(i);
			if (obj instanceof CycNart) {
				canonicalGaf.add((Object) ((CycNart) obj).getFormula());
			} else {
				canonicalGaf.add(obj);
			}
		}
		command4.add((Object) canonicalGaf);
		command3.add((Object) command4);
		command.addQuoted((Object) command3);
		command.add((Object) mt);
		command.add((Object) CycObjectFactory.makeCycSymbol(":forward"));
		command.add((Object) CycObjectFactory.nil);
		this.converseCycObject(command);
	}

	public void unassertGaf(final CycList gaf, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		this.unassertGaf(CycFormulaSentence.makeCycFormulaSentence((Iterable) gaf), mt, true, true);
	}

	public void unassertGaf(final CycFormulaSentence gaf, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		this.unassertGaf(gaf, mt, true, true);
	}

	public void unassertGaf(final CycFormulaSentence gaf, final CycObject mt, final boolean bookkeeping, final boolean transcript) throws UnknownHostException, IOException, CycApiException {
		if (getCurrentTransaction() != null) {
			getCurrentTransaction().noteForUnassertion(gaf.stringApiValue(), this.makeELMt(mt), bookkeeping, transcript);
		} else {
			final String fn = transcript ? "ke-unassert-now" : "cyc-unassert";
			String command = "(" + fn + " " + gaf.stringApiValue() + this.makeELMt(mt).stringApiValue() + ")";
			if (bookkeeping) {
				command = this.wrapBookkeeping(command);
			}
			this.converseVoid(command);
		}
	}

	public void unassertAssertion(final CycAssertion assertion, final boolean bookkeeping, final boolean transcript) throws UnknownHostException, IOException, CycApiException {
		if (getCurrentTransaction() != null) {
			getCurrentTransaction().noteForUnassertion(assertion.stringApiValue(), this.makeELMt(assertion.getMt()), bookkeeping, transcript);
		} else {
			final String fn = transcript ? "ke-unassert" : "cyc-unassert";
			String command = "(" + fn + " " + assertion.getELFormula(getCurrent()).stringApiValue() + " " + assertion.getMt().stringApiValue() + ")";
			if (bookkeeping) {
				command = this.wrapBookkeeping(command);
			}
			this.converseVoid(command);
		}
	}

	public void assertNameString(final String cycConstantName, final String nameString, final String mtName) throws UnknownHostException, IOException, CycApiException {
		this.assertGaf((CycObject) this.makeELMt((CycFort) this.getKnownConstantByName(mtName)), (CycFort) this.getKnownConstantByGuid("c0fdf7e8-9c29-11b1-9dad-c379636f7270"), (CycFort) this.getKnownConstantByName(cycConstantName), nameString);
	}

	public void assertComment(final String cycConstantName, final String comment, final String mtName) throws UnknownHostException, IOException, CycApiException {
		this.assertGaf((CycObject) this.makeELMt((CycFort) this.getKnownConstantByName(mtName)), (CycFort) CycAccess.comment, (CycFort) this.getKnownConstantByName(cycConstantName), comment);
	}

	public void assertComment(final CycFort cycFort, final String comment, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final ELMt elmt = this.makeELMt(mt);
		this.assertGaf((CycObject) elmt, (CycFort) CycAccess.comment, cycFort, comment);
	}

	public void assertNameString(final CycFort cycFort, final String nameString, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final ELMt elmt = this.makeELMt(mt);
		this.assertGaf((CycObject) elmt, (CycFort) this.getKnownConstantByGuid("c0fdf7e8-9c29-11b1-9dad-c379636f7270"), cycFort, nameString);
	}

	@Deprecated
	public void assertGenFormat(final CycFort relation, final String genFormatString, final CycList genFormatList) throws UnknownHostException, IOException, CycApiException {
		final CycList sentence = new CycList();
		sentence.add((Object) this.getKnownConstantByGuid("beed06de-9c29-11b1-9dad-c379636f7270"));
		sentence.add((Object) relation);
		sentence.add((Object) genFormatString);
		if (genFormatList.size() == 0) {
			sentence.add((Object) CycObjectFactory.nil);
		} else {
			sentence.add((Object) genFormatList);
		}
		this.assertGaf(sentence, (CycObject) this.makeELMt((CycFort) this.getKnownConstantByGuid("bda16220-9c29-11b1-9dad-c379636f7270")));
	}

	public CycConstant createMicrotheory(final String mtName, final String comment, final CycFort isaMt, final List genlMts) throws UnknownHostException, IOException, CycApiException {
		CycConstant mt = this.getConstantByName(mtName);
		if (mt != null) {
			this.kill((CycFort) mt);
		}
		mt = this.createNewPermanent(mtName);
		this.assertComment((CycFort) mt, comment, (CycObject) CycAccess.baseKB);
		this.assertGaf((CycObject) CycAccess.universalVocabularyMt, (CycDenotationalTerm) CycAccess.isa, (CycDenotationalTerm) mt, (CycDenotationalTerm) isaMt);
		for (final Object aGenlMt : genlMts) {
			this.assertGaf((CycObject) CycAccess.universalVocabularyMt, (CycDenotationalTerm) CycAccess.genlMt, (CycDenotationalTerm) mt, (CycDenotationalTerm) aGenlMt);
		}
		return mt;
	}

	public void createMicrotheory(final CycFort mt, final String comment, final CycFort isaMt, final List genlMts) throws UnknownHostException, IOException, CycApiException {
		this.assertComment(mt, comment, (CycObject) CycAccess.baseKB);
		this.assertGaf((CycObject) CycAccess.universalVocabularyMt, (CycDenotationalTerm) CycAccess.isa, (CycDenotationalTerm) mt, (CycDenotationalTerm) isaMt);
		final Iterator iterator = genlMts.iterator();
		while (iterator.hasNext()) {
			final CycList gaf = new CycList(3);
			gaf.add((Object) CycAccess.genlMt);
			gaf.add((Object) mt);
			gaf.add(iterator.next());
			this.assertGaf(gaf, (CycObject) CycAccess.universalVocabularyMt);
		}
	}

	public CycConstant createMicrotheory(final String mtName, final String comment, final String isaMtName, final List genlMts) throws UnknownHostException, IOException, CycApiException {
		CycConstant mt = this.getConstantByName(mtName);
		if (mt != null) {
			this.kill((CycFort) mt);
		}
		mt = this.createNewPermanent(mtName);
		this.assertComment((CycFort) mt, comment, (CycObject) CycAccess.baseKB);
		this.assertIsa(mtName, isaMtName);
		for (final Object genlMtName : genlMts) {
			this.assertGenlMt(mtName, (String) genlMtName);
		}
		return mt;
	}

	public CycConstant[] createMicrotheorySystem(final String mtRootName, final String comment, final List genlMts) throws UnknownHostException, IOException, CycApiException {
		final CycConstant[] mts = { null, null, null };
		final String theoryMtName = mtRootName + "Mt";
		final String vocabMtName = mtRootName + "VocabMt";
		final String vocabMtComment = "The #$VocabularyMicrotheory for #$" + theoryMtName;
		final String dataMtName = mtRootName + "DataMt";
		final String dataMtComment = "The #$DataMicrotheory for #$" + theoryMtName;
		final CycConstant worldLikeOursMt = this.getKnownConstantByGuid("bf4c781d-9c29-11b1-9dad-c379636f7270");
		final CycConstant genlMt_Vocabulary = this.getKnownConstantByGuid("c054a49e-9c29-11b1-9dad-c379636f7270");
		final CycConstant theoryMicrotheory = this.getKnownConstantByGuid("be5275a8-9c29-11b1-9dad-c379636f7270");
		final CycConstant theoryMt = this.createMicrotheory(theoryMtName, comment, (CycFort) theoryMicrotheory, genlMts);
		final CycConstant vocabularyMicrotheory = this.getKnownConstantByGuid("bda19dfd-9c29-11b1-9dad-c379636f7270");
		final CycConstant vocabMt = this.createMicrotheory(vocabMtName, vocabMtComment, (CycFort) vocabularyMicrotheory, new ArrayList());
		final CycConstant dataMicrotheory = this.getKnownConstantByGuid("be5275a8-9c29-11b1-9dad-c379636f7270");
		final CycConstant dataMt = this.createMicrotheory(dataMtName, dataMtComment, (CycFort) dataMicrotheory, new ArrayList());
		this.assertGaf((CycObject) CycAccess.baseKB, (CycDenotationalTerm) genlMt_Vocabulary, (CycDenotationalTerm) theoryMt, (CycDenotationalTerm) vocabMt);
		this.assertGaf((CycObject) CycAccess.baseKB, (CycDenotationalTerm) CycAccess.genlMt, (CycDenotationalTerm) dataMt, (CycDenotationalTerm) theoryMt);
		this.assertGaf((CycObject) CycAccess.baseKB, (CycDenotationalTerm) CycAccess.genlMt, (CycDenotationalTerm) worldLikeOursMt, (CycDenotationalTerm) theoryMt);
		this.assertGaf((CycObject) CycAccess.baseKB, (CycDenotationalTerm) CycAccess.genlMt, (CycDenotationalTerm) CycAccess.currentWorldDataMt, (CycDenotationalTerm) dataMt);
		mts[0] = theoryMt;
		mts[1] = vocabMt;
		mts[2] = dataMt;
		return mts;
	}

	public void assertIsaCollection(final CycFort cycFort) throws UnknownHostException, IOException, CycApiException {
		this.assertGaf((CycObject) CycAccess.universalVocabularyMt, (CycDenotationalTerm) CycAccess.isa, (CycDenotationalTerm) cycFort, (CycDenotationalTerm) CycAccess.collection);
	}

	public void assertIsaCollection(final CycFort cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final ELMt elmt = this.makeELMt(mt);
		this.assertGaf((CycObject) elmt, (CycDenotationalTerm) CycAccess.isa, (CycDenotationalTerm) cycFort, (CycDenotationalTerm) CycAccess.collection);
	}

	public void assertGenls(final String specCollectionName, final String genlsCollectionName, final String mtName) throws UnknownHostException, IOException, CycApiException {
		this.assertGaf((CycObject) this.makeELMt((CycFort) this.getKnownConstantByName(mtName)), (CycDenotationalTerm) CycAccess.genls, (CycDenotationalTerm) this.getKnownConstantByName(specCollectionName), (CycDenotationalTerm) this.getKnownConstantByName(genlsCollectionName));
	}

	public void assertGenls(final String specCollectionName, final String genlsCollectionName) throws UnknownHostException, IOException, CycApiException {
		this.assertGaf((CycObject) CycAccess.universalVocabularyMt, (CycDenotationalTerm) CycAccess.genls, (CycDenotationalTerm) this.getKnownConstantByName(specCollectionName), (CycDenotationalTerm) this.getKnownConstantByName(genlsCollectionName));
	}

	public void assertGenls(final CycFort specCollection, final CycFort genlsCollection) throws UnknownHostException, IOException, CycApiException {
		this.assertGaf((CycObject) CycAccess.universalVocabularyMt, (CycDenotationalTerm) CycAccess.genls, (CycDenotationalTerm) specCollection, (CycDenotationalTerm) genlsCollection);
	}

	public void assertGenls(final CycFort specCollection, final CycFort genlsCollection, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final ELMt elmt = this.makeELMt(mt);
		this.assertGaf((CycObject) elmt, (CycDenotationalTerm) CycAccess.genls, (CycDenotationalTerm) specCollection, (CycDenotationalTerm) genlsCollection);
	}

	public void assertGenlPreds(final String specPredName, final String genlPredName) throws UnknownHostException, IOException, CycApiException {
		final CycConstant genlPreds = this.getKnownConstantByGuid("bd5b4951-9c29-11b1-9dad-c379636f7270");
		this.assertGaf((CycObject) CycAccess.universalVocabularyMt, (CycDenotationalTerm) genlPreds, (CycDenotationalTerm) this.getKnownConstantByName(specPredName), (CycDenotationalTerm) this.getKnownConstantByName(genlPredName));
	}

	public void assertGenlPreds(final CycFort specPred, final CycFort genlPred) throws UnknownHostException, IOException, CycApiException {
		final CycConstant genlPreds = this.getKnownConstantByGuid("bd5b4951-9c29-11b1-9dad-c379636f7270");
		this.assertGaf((CycObject) CycAccess.universalVocabularyMt, (CycDenotationalTerm) genlPreds, (CycDenotationalTerm) specPred, (CycDenotationalTerm) genlPred);
	}

	public void assertConceptuallyRelated(final CycFort term1, final CycFort term2, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final CycConstant conceptuallyRelated = this.getKnownConstantByGuid("bd58803e-9c29-11b1-9dad-c379636f7270");
		this.assertGaf((CycObject) this.makeELMt(mt), (CycDenotationalTerm) conceptuallyRelated, (CycDenotationalTerm) term1, (CycDenotationalTerm) term2);
	}

	public void assertGenlMt(final String specMtName, final String genlsMtName) throws UnknownHostException, IOException, CycApiException {
		this.assertGaf((CycObject) CycAccess.universalVocabularyMt, (CycDenotationalTerm) CycAccess.genlMt, (CycDenotationalTerm) this.getKnownConstantByName(specMtName), (CycDenotationalTerm) this.getKnownConstantByName(genlsMtName));
	}

	public void assertGenlMt(final CycFort specMt, final CycFort genlsMt) throws UnknownHostException, IOException, CycApiException {
		this.assertGaf((CycObject) CycAccess.universalVocabularyMt, (CycDenotationalTerm) CycAccess.genlMt, (CycDenotationalTerm) specMt, (CycDenotationalTerm) genlsMt);
	}

	public void assertIsa(final String cycFortName, final String collectionName) throws UnknownHostException, IOException, CycApiException {
		this.assertGaf((CycObject) CycAccess.universalVocabularyMt, (CycDenotationalTerm) CycAccess.isa, (CycDenotationalTerm) this.getKnownConstantByName(cycFortName), (CycDenotationalTerm) this.getKnownConstantByName(collectionName));
	}

	public void assertIsa(final String cycFortName, final String collectionName, final String mtName) throws UnknownHostException, IOException, CycApiException {
		this.assertGaf((CycObject) this.makeELMt((CycFort) this.getKnownConstantByName(mtName)), (CycDenotationalTerm) CycAccess.isa, (CycDenotationalTerm) this.getKnownConstantByName(cycFortName), (CycDenotationalTerm) this.getKnownConstantByName(collectionName));
	}

	public void assertIsa(final CycFort cycFort, final CycFort aCollection, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		this.assertGaf((CycObject) this.makeELMt(mt), (CycDenotationalTerm) CycAccess.isa, (CycDenotationalTerm) cycFort, (CycDenotationalTerm) aCollection);
	}

	public void assertQuotedIsa(final CycFort cycFort, final CycFort aCollection, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		this.assertGaf((CycObject) this.makeELMt(mt), (CycDenotationalTerm) this.getKnownConstantByGuid("055544a2-4371-11d6-8000-00a0c9da2002"), (CycDenotationalTerm) cycFort, (CycDenotationalTerm) aCollection);
	}

	public void assertIsa(final CycDenotationalTerm instance, final CycDenotationalTerm aCollection) throws UnknownHostException, IOException, CycApiException {
		this.assertGaf((CycObject) CycAccess.universalVocabularyMt, (CycDenotationalTerm) CycAccess.isa, instance, aCollection);
	}

	public void assertIsaBinaryPredicate(final CycFort cycFort) throws UnknownHostException, IOException, CycApiException {
		this.assertIsa(cycFort, (CycFort) CycAccess.binaryPredicate, (CycObject) CycAccess.universalVocabularyMt);
	}

	public void assertIsaBinaryPredicate(final CycFort cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		this.assertIsa(cycFort, (CycFort) CycAccess.binaryPredicate, (CycObject) this.makeELMt(mt));
	}

	public CycNaut makeCycNaut(final String string) throws CycApiException {
		return new CycNaut((Iterable) this.makeCycList(string));
	}

	public CycFormulaSentence makeCycSentence(final String string) throws CycApiException {
		return new CycFormulaSentence((Iterable) this.makeCycList(string));
	}

	public CycFormulaSentence makeCyclifiedSentence(final String string) throws CycApiException, UnknownHostException, IOException {
		final String cyclified = this.cyclifyString(string);
		return this.makeCycSentence(cyclified);
	}

	public CycList<Object> makeCycList(final String string) throws CycApiException {
		return (CycList<Object>) new CycListParser(this).read(string);
	}

	public ELMt makeELMt(final Object object) throws IOException, CycApiException {
		if (object instanceof ELMt) {
			return (ELMt) object;
		}
		if (object instanceof CycList) {
			return this.canonicalizeHLMT((CycList) object);
		}
		if (object instanceof CycNaut) {
			return this.canonicalizeHLMT((CycNaut) object);
		}
		if (object instanceof CycConstant) {
			return (ELMt) ELMtConstant.makeELMtConstant((CycConstant) object);
		}
		if (object instanceof CycNart) {
			return (ELMt) ELMtNart.makeELMtNart((CycNart) object);
		}
		if (!(object instanceof String)) {
			throw new IllegalArgumentException("Can't make an ELMt from " + object + " class: " + object.getClass().getSimpleName());
		}
		final String elmtString = object.toString().trim();
		if (elmtString.startsWith("(")) {
			final CycList<Object> elmtCycList = this.makeCycList(elmtString);
			return this.makeELMt((CycObject) elmtCycList);
		}
		return this.makeELMt((CycFort) this.getKnownConstantByName(elmtString));
	}

	public ELMt makeELMt(final CycObject cycObject) throws IOException, CycApiException {
		if (cycObject instanceof ELMt) {
			return (ELMt) cycObject;
		}
		if (cycObject instanceof CycList) {
			return this.canonicalizeHLMT((CycList) cycObject);
		}
		if (cycObject instanceof CycNaut) {
			return this.canonicalizeHLMT((CycNaut) cycObject);
		}
		if (cycObject instanceof CycFort) {
			return this.makeELMt((CycFort) cycObject);
		}
		throw new IllegalArgumentException("Can't make an ELMt from " + cycObject + " class: " + cycObject.getClass().getSimpleName());
	}

	public ELMt makeELMt(final CycFort cycObject) {
		ELMt result = null;
		if (cycObject instanceof CycConstant) {
			result = (ELMt) ELMtConstant.makeELMtConstant((CycConstant) cycObject);
		} else {
			if (!(cycObject instanceof CycNart)) {
				throw new IllegalArgumentException("CycObject: " + cycObject.cyclify() + "is not a valid ELMt.");
			}
			result = (ELMt) ELMtNart.makeELMtNart((CycNart) cycObject);
		}
		return result;
	}

	public ELMt makeELMt(String elmtString) throws IOException, CycApiException {
		elmtString = elmtString.trim();
		if (elmtString.startsWith("(")) {
			final CycList elmtCycList = this.makeCycList(elmtString);
			return this.makeELMt((CycObject) elmtCycList);
		}
		return this.makeELMt((CycFort) this.getKnownConstantByName(elmtString));
	}

	public ELMt canonicalizeHLMT(final CycList cycList) throws IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt("canonicalize-hlmt", new Object[] { cycList });
		final CycObject result = this.converseCycObject(command);
		ELMt mt;
		if (result instanceof CycDenotationalTerm) {
			mt = this.makeELMt(result);
		} else {
			if (!(result instanceof List)) {
				throw new CycApiException("Can't canonicalize " + cycList);
			}
			mt = (ELMt) ELMtCycNaut.makeELMtCycNaut((List) result);
		}
		return mt;
	}

	public ELMt canonicalizeHLMT(final CycNaut naut) throws IOException, CycApiException {
		return this.canonicalizeHLMT(naut.toCycList());
	}

	public String wrapBookkeeping(final String command) {
		final String projectName = (this.project == null) ? "nil" : this.project.stringApiValue();
		final String cyclistName = (this.getCyclist() == null) ? "nil" : this.getCyclist().stringApiValue();
		final String wrappedCommand = "(with-bookkeeping-info (new-bookkeeping-info " + cyclistName + " (the-date) " + projectName + " (the-second))\n" + this.wrapCyclistAndPurpose(command, cyclistName, projectName) + "\n)";
		return wrappedCommand;
	}

	public String wrapCyclistAndPurpose(final String command) {
		final String projectName = (this.project == null) ? "nil" : this.project.stringApiValue();
		final String cyclistName = (this.getCyclist() == null) ? "nil" : this.getCyclist().stringApiValue();
		return this.wrapCyclistAndPurpose(command, cyclistName, projectName);
	}

	public String wrapCyclistAndPurpose(final String command, final String cyclistName, final String projectName) {
		return "(clet ((*require-case-insensitive-name-uniqueness* nil)\n       (*the-cyclist* " + cyclistName + ")\n" + "       (*ke-purpose* " + projectName + "))\n" + "    " + command + "\n)";
	}

	public String wrapForwardInferenceRulesTemplates(String command, final List<CycFort> templates) {
		if (templates == null || templates.isEmpty()) {
			return command;
		}
		final StringBuilder loadRules = new StringBuilder("(union");
		for (final CycFort template : templates) {
			loadRules.append(" (creation-template-allowable-rules ").append(template.stringApiValue()).append(")");
		}
		loadRules.append(")");
		command = this.wrapDynamicBinding(command, "*forward-inference-allowed-rules*", loadRules.toString());
		return command;
	}

	public String wrapDisableWffChecking(String command) {
		command = this.wrapDynamicBinding(command, "*assume-forward-deduction-is-wf?*", "t");
		command = this.wrapDynamicBinding(command, "*assume-assert-sentence-is-wf?*", "t");
		command = "(with-strict-wff " + command + ")";
		return command;
	}

	public String wrapDynamicBinding(final String command, final String symbolName, final String apiValue) {
		return "(clet ((" + symbolName + " " + apiValue + "))\n" + "  " + command + "\n)";
	}

	public CycConstant makeCycConstant(final String name) throws UnknownHostException, IOException, CycApiException {
		return this.makeCycConstant(name, true, true);
	}

	public CycConstant makeCycConstant(final String name, final boolean bookkeeping, final boolean transcript) throws UnknownHostException, IOException, CycApiException {
		String constantName = name;
		if (constantName.startsWith("#$")) {
			constantName = constantName.substring(2);
		}
		CycConstant cycConstant = this.getConstantByName(name);
		if (cycConstant != null) {
			return cycConstant;
		}
		final String fn = transcript ? "ke-create-now" : "fi-create-int";
		String command = "(" + fn + " \"" + constantName + "\")";
		if (bookkeeping) {
			command = this.wrapBookkeeping(command);
		}
		final Object object = this.converseObject(command);
		if (object instanceof CycConstant) {
			cycConstant = (CycConstant) object;
			CycObjectFactory.addCycConstantCache(cycConstant);
			if (getCurrentTransaction() != null) {
				getCurrentTransaction().noteCreation((CycFort) cycConstant);
			}
			return cycConstant;
		}
		throw new CycApiException("Cannot create new constant for " + name);
	}

	public CycConstant makeUniqueCycConstant(final String startName) throws UnknownHostException, IOException, CycApiException {
		if (startName.startsWith("#$")) {
			final String constantName = startName.substring(2);
		}
		String suffix = "";
		int suffixNum = 0;
		while (true) {
			final String command = "(constant-name-available \"" + startName + suffix + "\")";
			if (this.converseBoolean(command)) {
				break;
			}
			if (suffix.length() == 0) {
				suffixNum = (int) (9.0 * Math.random()) + 1;
			} else {
				suffixNum = suffixNum * 10 + (int) (10.0 * Math.random());
			}
			suffix = String.valueOf(suffixNum);
		}
		return this.makeCycConstant(startName + suffix);
	}

	public CycConstant makeUniqueCycConstant(final String startName, final String prefix) throws UnknownHostException, IOException, CycApiException {
		String constantName = startName;
		if (constantName.startsWith("#$")) {
			constantName = constantName.substring(2);
		}
		final String command = this.wrapBookkeeping("(gentemp-constant \"" + constantName + "\" \"" + prefix + "\")");
		final CycConstant cycConstant = (CycConstant) this.converseObject(command);
		CycObjectFactory.addCycConstantCache(cycConstant);
		if (getCurrentTransaction() != null) {
			getCurrentTransaction().noteCreation((CycFort) cycConstant);
		}
		return cycConstant;
	}

	public CycList askNewCycQuery(final CycList query, final CycObject mt, final InferenceParameters queryProperties) throws UnknownHostException, IOException, CycApiException {
		final String script = "(new-cyc-query " + query.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + " " + this.queryPropertiesToString(queryProperties) + ")";
		return this.converseList(script);
	}

	public InferenceResultSet executeQuery(final CycList query, final ELMt mt, final InferenceParameters queryProperties, final long timeoutMsecs) throws IOException, CycApiException, TimeOutException {
		return this.executeQuery(new CycFormulaSentence((Iterable) query), (CycObject) mt, queryProperties, timeoutMsecs);
	}

	public InferenceResultSet executeQuery(final CycFormulaSentence query, final ELMt mt, final InferenceParameters queryProperties) throws IOException, CycApiException, TimeOutException {
		return this.executeQuery(query, (CycObject) mt, queryProperties, 0L);
	}

	public InferenceResultSet executeQuery(final CycFormulaSentence query, final CycObject mt, final InferenceParameters queryProperties, final long timeoutMsecs) throws IOException, CycApiException, TimeOutException {
		if (!this.isOkForNewCycQuery(queryProperties, timeoutMsecs)) {
			final InferenceWorkerSynch worker = (InferenceWorkerSynch) new DefaultInferenceWorkerSynch(query, (ELMt) mt, queryProperties, this, timeoutMsecs);
			return worker.executeQuery();
		}
		final String command = SubLAPIHelper.makeSubLStmt("multiple-value-list", new Object[] { SubLAPIHelper.makeNestedSubLStmt("new-cyc-query", new Object[] { query, mt, (queryProperties != null) ? queryProperties : new DefaultInferenceParameters(this) }) });
		final CycList results = this.converseList(command);
		final CycObject bindings = (CycObject) results.get(0);
		final InferenceSuspendReason haltReason = InferenceSuspendReason.fromCycSuspendReason(results.get(1));
		if (haltReason.isError()) {
			throw new CycApiServerSideException("Inference halted due to error:\n" + haltReason);
		}
		return new InferenceResultSet((List) (CycObjectFactory.nil.equals((Object) bindings) ? Collections.emptyList() : ((CycList) bindings)));
	}

	private boolean isOkForNewCycQuery(final InferenceParameters queryProperties, final long timeoutMsecs) {
		return timeoutMsecs == 0L && (queryProperties == null || !queryProperties.containsKey(CycObjectFactory.makeCycSymbol(":RETURN")));
	}

	public InferenceResultSet executeQuery(final String query, final Object mt, final InferenceParameters queryProperties, final long timeoutMsecs) throws IOException, CycApiException, TimeOutException {
		final InferenceWorkerSynch worker = (InferenceWorkerSynch) new DefaultInferenceWorkerSynch(query, this.makeELMt(mt), queryProperties, this, timeoutMsecs);
		final InferenceResultSet rs = worker.executeQuery();
		return rs;
	}

	public String queryResultsToXMLString(final CycList query, final CycObject mt, final InferenceParameters queryProperties, final CycList xmlSpec) throws UnknownHostException, IOException, CycApiException {
		return this.queryResultsToXMLStringInternal((CycObject) query, mt, queryProperties, xmlSpec);
	}

	public String queryResultsToXMLString(final CycFormulaSentence query, final CycObject mt, final InferenceParameters queryProperties, final CycList xmlSpec) throws UnknownHostException, IOException, CycApiException {
		return this.queryResultsToXMLStringInternal((CycObject) query, mt, queryProperties, xmlSpec);
	}

	private String queryResultsToXMLStringInternal(final CycObject query, final CycObject mt, final InferenceParameters queryProperties, final CycList xmlSpec) throws UnknownHostException, IOException, CycApiException {
		final String xmlSpecString = (xmlSpec == null) ? ":default" : xmlSpec.stringApiValue();
		final String script = "(query-results-to-xml-string " + query.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + " " + this.queryPropertiesToString(queryProperties) + " " + xmlSpecString + ")";
		return this.converseString(script);
	}

	public boolean isQueryTrue(final CycList query, final CycObject mt, final InferenceParameters queryProperties) throws UnknownHostException, IOException, CycApiException {
		return this.isQueryTrue(query, mt, queryProperties, 0L);
	}

	public boolean isQueryTrue(final CycFormulaSentence query, final CycObject mt, final InferenceParameters queryProperties) throws UnknownHostException, IOException, CycApiException {
		return this.isQueryTrue(query, mt, queryProperties, 0L);
	}

	public boolean isQueryTrue(final CycList query, final CycObject mt, final InferenceParameters queryProperties, final long timeoutMsecs) throws UnknownHostException, IOException, CycApiException {
		final InferenceResultSet rs = this.executeQuery(query, this.makeELMt(mt), queryProperties, timeoutMsecs);
		try {
			return rs.getTruthValue();
		} finally {
			rs.close();
		}
	}

	public boolean isQueryTrue(final CycFormulaSentence query, final CycObject mt, final InferenceParameters queryProperties, final long timeoutMsecs) throws UnknownHostException, IOException, CycApiException {
		final InferenceResultSet rs = this.executeQuery(query, (CycObject) this.makeELMt(mt), queryProperties, timeoutMsecs);
		try {
			return rs.getTruthValue();
		} finally {
			rs.close();
		}
	}

	public CycList<Object> queryVariable(final CycVariable variable, final CycList query, final CycObject mt, final InferenceParameters queryProperties) throws UnknownHostException, IOException, CycApiException {
		return this.queryVariable(variable, query, mt, queryProperties, 0L);
	}

	public CycList<Object> queryVariable(final CycVariable queryVariable, final CycFormulaSentence query, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.queryVariable(queryVariable, query, mt, (InferenceParameters) new DefaultInferenceParameters(this));
	}

	public CycList<Object> queryVariable(final CycVariable queryVariable, final CycFormulaSentence query, final CycObject mt, final InferenceParameters queryProperties) throws UnknownHostException, IOException, CycApiException {
		final InferenceResultSet rs = this.executeQuery(query, this.makeELMt(mt), queryProperties);
		return this.queryVariableLow(queryVariable, rs);
	}

	public CycList<Object> queryVariable(final CycVariable queryVariable, final String query, final Object mt, final InferenceParameters queryProperties, final long timeoutMsecs) throws UnknownHostException, IOException, CycApiException {
		final InferenceResultSet rs = this.executeQuery(query, mt, queryProperties, timeoutMsecs);
		return this.queryVariableLow(queryVariable, rs);
	}

	public CycList<Object> queryVariable(final CycVariable variable, final CycList query, final CycObject mt, final InferenceParameters queryProperties, final long timeoutMsecs) throws UnknownHostException, IOException, CycApiException, TimeOutException {
		InferenceResultSet rs = null;
		try {
			rs = this.executeQuery(query, this.makeELMt(mt), queryProperties, timeoutMsecs);
			return this.queryVariableLow(variable, rs);
		} finally {
			return (CycList<Object>) new CycList();
		}
	}

	public CycList<Object> queryVariableLow(final CycVariable queryVariable, final InferenceResultSet rs) throws UnknownHostException, IOException, CycApiException, TimeOutException {
		final CycList result = new CycList();
		try {
			if (rs.getCurrentRowCount() == 0) {
				return (CycList<Object>) result;
			}
			final int colIndex = rs.findColumn(queryVariable);
			if (colIndex < 0) {
				throw new CycApiException("Unable to find variable: " + queryVariable);
			}
			while (rs.next()) {
				result.add(rs.getObject(colIndex));
			}
			return (CycList<Object>) result;
		} finally {
			if (rs != null) {
				rs.close();
			}
		}
	}

	public CycList<Object> queryVariable(final CycVariable variable, final CycFormulaSentence query, final CycObject mt, final InferenceParameters queryProperties, final long timeoutMsecs) throws UnknownHostException, IOException, CycApiException, TimeOutException {
		final InferenceResultSet rs = this.executeQuery(query, (CycObject) this.makeELMt(mt), queryProperties, timeoutMsecs);
		return this.queryVariableLow(variable, rs);
	}

	public CycList queryVariable(final CycVariable variable, final CycList query, final CycObject mt, final InferenceParameters queryProperties, final String inferenceProblemStoreName) throws UnknownHostException, IOException, CycApiException {
		if (variable == null) {
			throw new NullPointerException("queryVariables must not be null");
		}
		if (query == null) {
			throw new NullPointerException("query must not be null");
		}
		if (query.isEmpty()) {
			throw new IllegalArgumentException("query must not be empty");
		}
		if (mt == null) {
			throw new NullPointerException("mt must not be null");
		}
		if (inferenceProblemStoreName == null) {
			throw new NullPointerException("inferenceProblemStoreName must not be null");
		}
		if (inferenceProblemStoreName.length() == 0) {
			throw new IllegalArgumentException("inferenceProblemStoreName must not be an empty list");
		}
		final InferenceParameters tempQueryProperties = (queryProperties == null) ? this.getHLQueryProperties() : queryProperties;
		tempQueryProperties.put(CycObjectFactory.makeCycSymbol(":problem-store"), (Object) CycObjectFactory.makeCycSymbol("problem-store", false));
		final String script = "(clet ((problem-store (find-problem-store-by-name \"" + inferenceProblemStoreName + "\")))" + "  (query-variable " + variable.stringApiValue() + " " + query.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + " " + this.queryPropertiesToString(tempQueryProperties) + "))";
		return this.converseList(script);
	}

	public CycList<Object> queryVariables(final CycList<CycVariable> variables, final CycList<Object> query, final CycObject mt, final InferenceParameters queryProperties) throws UnknownHostException, IOException, CycApiException {
		return this.queryVariablesLow(variables, (CycObject) query, mt, queryProperties, 0L);
	}

	public CycList<Object> queryVariables(final CycList<CycVariable> variables, final CycFormulaSentence query, final CycObject mt, final InferenceParameters queryProperties) throws UnknownHostException, IOException, CycApiException {
		return this.queryVariablesLow(variables, (CycObject) query, mt, queryProperties, 0L);
	}

	public CycList<Object> queryVariables(final CycList<CycVariable> variables, final String query, final Object mt, final InferenceParameters queryProperties, final long timeoutMsecs) throws UnknownHostException, IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt("query-template", new Object[] { variables, query, this.makeELMt(mt), queryProperties });
		final SubLWorkerSynch worker = (SubLWorkerSynch) new DefaultSubLWorkerSynch(command, this, timeoutMsecs);
		if (CycObjectFactory.nil.equals(worker.getWork())) {
			return (CycList<Object>) new CycList();
		}
		return (CycList<Object>) worker.getWork();
	}

	private CycList<Object> queryVariablesLow(final CycList<CycVariable> queryVariables, final CycObject query, final CycObject mt, final InferenceParameters queryProperties, final long timeoutMsecs) throws UnknownHostException, IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt("query-template", new Object[] { queryVariables, query, this.makeELMt(mt), queryProperties });
		final SubLWorkerSynch worker = (SubLWorkerSynch) new DefaultSubLWorkerSynch(command, this, timeoutMsecs);
		if (CycObjectFactory.nil.equals(worker.getWork())) {
			return (CycList<Object>) new CycList();
		}
		return (CycList<Object>) worker.getWork();
	}

	public CycList queryVariables(final CycList queryVariables, final CycList query, final CycObject mt, final InferenceParameters queryProperties, final String inferenceProblemStoreName) throws UnknownHostException, IOException, CycApiException {
		if (query.isEmpty()) {
			throw new IllegalArgumentException("query must not be empty");
		}
		return this.queryVariablesInternal(queryVariables, (CycObject) query, mt, queryProperties, inferenceProblemStoreName, 0L);
	}

	public CycList queryVariables(final CycList<CycVariable> queryVariables, final CycFormulaSentence query, final CycObject mt, final InferenceParameters queryProperties, final String inferenceProblemStoreName) throws UnknownHostException, IOException, CycApiException {
		return this.queryVariablesInternal(queryVariables, (CycObject) query, mt, queryProperties, inferenceProblemStoreName, 0L);
	}

	private CycList queryVariablesInternal(final CycList queryVariables, final CycObject query, final CycObject mt, final InferenceParameters queryProperties, final String inferenceProblemStoreName, final long timeoutMsecs) throws UnknownHostException, IOException, CycApiException {
		if (queryVariables == null) {
			throw new NullPointerException("queryVariables must not be null");
		}
		if (queryVariables.isEmpty()) {
			throw new IllegalArgumentException("queryVariables must not be empty");
		}
		if (query == null) {
			throw new NullPointerException("query must not be null");
		}
		if (mt == null) {
			throw new NullPointerException("mt must not be null");
		}
		if (inferenceProblemStoreName == null) {
			throw new NullPointerException("inferenceProblemStoreName must not be null");
		}
		if (inferenceProblemStoreName.length() == 0) {
			throw new IllegalArgumentException("inferenceProblemStoreName must not be an empty list");
		}
		final InferenceParameters tempQueryProperties = (queryProperties == null) ? this.getHLQueryProperties() : queryProperties;
		tempQueryProperties.put(CycObjectFactory.makeCycSymbol(":problem-store"), (Object) CycObjectFactory.makeCycSymbol("problem-store", false));
		final String script = "(clet ((problem-store (find-problem-store-by-name \"" + inferenceProblemStoreName + "\")))" + "  (query-template " + queryVariables.stringApiValue() + " " + query.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + " " + this.queryPropertiesToString(tempQueryProperties) + "))";
		final SubLWorkerSynch worker = (SubLWorkerSynch) new DefaultSubLWorkerSynch(script, this, timeoutMsecs);
		if (CycObjectFactory.nil.equals(worker.getWork())) {
			return new CycList();
		}
		return (CycList) worker.getWork();
	}

	public CycList askCycQuery(final CycList query, final CycObject mt, final Object maxTransformationDepth, final Object maxNumber, final Object maxTimeSeconds, final Object maxProofDepth) throws UnknownHostException, IOException, CycApiException {
		final HashMap queryProperties = new HashMap();
		queryProperties.put(CycObjectFactory.makeCycSymbol(":max-transformation-depth"), maxTransformationDepth);
		queryProperties.put(CycObjectFactory.makeCycSymbol(":max-number"), maxNumber);
		queryProperties.put(CycObjectFactory.makeCycSymbol(":max-time"), maxTimeSeconds);
		queryProperties.put(CycObjectFactory.makeCycSymbol(":max-proof-depth"), maxProofDepth);
		queryProperties.put(CycObjectFactory.makeCycSymbol(":forget-extra-results?"), CycObjectFactory.t);
		return this.askCycQuery(query, mt, queryProperties);
	}

	public CycList askCycQuery(final CycList query, final CycObject mt, final HashMap queryProperties) throws UnknownHostException, IOException, CycApiException {
		final CycList parameterList = new CycList();
		final Iterator iter = queryProperties.entrySet().iterator();
		if (iter.hasNext()) {
			while (iter.hasNext()) {
				final Map.Entry mapEntry = (Entry) iter.next();
				final CycSymbol queryParameterKeyword = (CycSymbol) mapEntry.getKey();
				parameterList.add((Object) queryParameterKeyword);
				final Object queryParameterValue = mapEntry.getValue();
				parameterList.add(queryParameterValue);
			}
		}
		final String command = SubLAPIHelper.makeSubLStmt(CycAccess.CYC_QUERY, new Object[] { query, this.makeELMt(mt), parameterList });
		return this.converseList(command);
	}

	public CycList queryVariable(final CycList query, final CycVariable variable, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final StringBuilder queryBuffer = new StringBuilder();
		queryBuffer.append("(clet ((*cache-inference-results* nil) ");
		queryBuffer.append("       (*compute-inference-results* nil) ");
		queryBuffer.append("       (*unique-inference-result-bindings* t) ");
		queryBuffer.append("       (*generate-readable-fi-results* nil)) ");
		queryBuffer.append("  (without-wff-semantics ");
		queryBuffer.append("    (ask-template ").append(variable.stringApiValue()).append(" ");
		queryBuffer.append("                  ").append(query.stringApiValue()).append(" ");
		queryBuffer.append("                  ").append(this.makeELMt(mt).stringApiValue()).append(" ");
		queryBuffer.append("                  0 nil nil nil)))");
		final CycList answer = this.converseList(queryBuffer.toString());
		return this.canonicalizeList(answer);
	}

	public CycList askWithVariable(final CycList query, final CycVariable variable, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final StringBuilder queryBuffer = new StringBuilder();
		queryBuffer.append("(clet ((*cache-inference-results* nil) ");
		queryBuffer.append("       (*compute-inference-results* nil) ");
		queryBuffer.append("       (*unique-inference-result-bindings* t) ");
		queryBuffer.append("       (*generate-readable-fi-results* nil)) ");
		queryBuffer.append("  (without-wff-semantics ");
		queryBuffer.append("    (ask-template ").append(variable.stringApiValue()).append(" ");
		queryBuffer.append("                  ").append(query.stringApiValue()).append(" ");
		queryBuffer.append("                  ").append(this.makeELMt(mt).stringApiValue()).append(" ");
		queryBuffer.append("                  0 nil nil nil)))");
		final CycList answer = this.converseList(queryBuffer.toString());
		return this.canonicalizeList(answer);
	}

	public CycList askWithVariables(final CycList query, final List variables, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final StringBuilder queryBuffer = new StringBuilder();
		queryBuffer.append("(clet ((*cache-inference-results* nil) ");
		queryBuffer.append("       (*compute-inference-results* nil) ");
		queryBuffer.append("       (*unique-inference-result-bindings* t) ");
		queryBuffer.append("       (*generate-readable-fi-results* nil)) ");
		queryBuffer.append("  (without-wff-semantics ");
		queryBuffer.append("    (ask-template ").append(new CycList((Collection) variables).stringApiValue()).append(" ");
		queryBuffer.append("                  ").append(query.stringApiValue()).append(" ");
		queryBuffer.append("                  ").append(mt.stringApiValue()).append(" ");
		queryBuffer.append("                  0 nil nil nil)))");
		final CycList bindings = this.converseList(queryBuffer.toString());
		final CycList canonicalBindings = new CycList();
		final Iterator iter = bindings.iterator();
		while (iter.hasNext()) {
			canonicalBindings.add((Object) this.canonicalizeList((CycList) iter.next()));
		}
		return canonicalBindings;
	}

	public boolean isQueryTrue(final CycList query, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt(CycAccess.CYC_QUERY, new Object[] { this.canonicalizeList(query), this.makeELMt(mt) });
		final CycList response = this.converseList(command);
		return response.size() > 0;
	}

	public boolean isQueryTrue_Cached(final CycList query, final CycObject mt) throws IOException, CycApiException {
		final Boolean isQueryTrue = this.askCache.get(query);
		if (isQueryTrue != null) {
			return isQueryTrue;
		}
		final boolean answer = this.isQueryTrue(query, (CycObject) this.makeELMt(mt));
		this.askCache.put(query, answer);
		return answer;
	}

	public int countAllInstances(final CycFort collection, final CycObject mt) throws IOException, CycApiException {
		return this.converseInt("(count-all-instances " + collection.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public int countAllInstances_Cached(final CycFort collection, final CycObject mt) throws IOException, CycApiException {
		final Integer countAllInstances = this.countAllInstancesCache.get(collection);
		if (countAllInstances != null) {
			return countAllInstances;
		}
		final int answer = this.countAllInstances(collection, (CycObject) this.makeELMt(mt));
		this.countAllInstancesCache.put(collection, answer);
		return answer;
	}

	public CycList getBackchainImplicationRules(final CycConstant predicate, final CycList formula, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final StringBuilder command = new StringBuilder();
		if (this.makeELMt(mt).equals(CycAccess.inferencePSC) || this.makeELMt(mt).equals(CycAccess.everythingPSC)) {
			command.append("(clet (backchain-rules formula) ");
			command.append("  (with-all-mts ");
			command.append("    (do-predicate-rule-index (rule ").append(predicate.stringApiValue()).append(" :pos nil :backward) ");
			command.append("       (csetq formula (assertion-el-formula rule)) ");
			command.append("       (pwhen (cand (eq (first formula) #$implies) ");
			command.append("                    (unify-el-possible ").append(formula.stringApiValue()).append(" ");
			command.append("                                          (third formula))) ");
			command.append("         (cpush formula backchain-rules)))) ");
			command.append("   backchain-rules)");
		} else {
			command.append("(clet (backchain-rules formula) ");
			command.append("  (with-inference-mt-relevance ").append(this.makeELMt(mt).stringApiValue()).append(" ");
			command.append("    (do-predicate-rule-index (rule ").append(predicate.stringApiValue()).append(" :pos nil :backward) ");
			command.append("       (csetq formula (assertion-el-formula rule)) ");
			command.append("       (pwhen (cand (eq (first formula) #$implies) ");
			command.append("                    (unify-el-possible ").append(formula.stringApiValue()).append(" ");
			command.append("                                          (third formula))) ");
			command.append("         (cpush formula backchain-rules)))) ");
			command.append("   backchain-rules)");
		}
		return this.converseList(command.toString());
	}

	public CycList getForwardChainRules(final CycConstant predicate, final CycList formula, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final StringBuilder command = new StringBuilder();
		if (this.makeELMt(mt).equals(CycAccess.inferencePSC) || this.makeELMt(mt).equals(CycAccess.everythingPSC)) {
			command.append("(clet (backchain-rules formula) ");
			command.append("  (with-all-mts ");
			command.append("    (do-predicate-rule-index (rule ").append(predicate.stringApiValue()).append(" :pos nil :forward) ");
			command.append("       (csetq formula (assertion-el-formula rule)) ");
			command.append("       (pwhen (cand (eq (first formula) #$implies) ");
			command.append("                    (unify-el-possible ").append(formula.stringApiValue()).append(" ");
			command.append("                                          (third formula))) ");
			command.append("         (cpush formula backchain-rules)))) ");
			command.append("   backchain-rules)");
		} else {
			command.append("(clet (backchain-rules formula) ");
			command.append("  (with-inference-mt-relevance ").append(this.makeELMt(mt).stringApiValue()).append(" ");
			command.append("    (do-predicate-rule-index (rule ").append(predicate.stringApiValue()).append(" :pos nil :forward) ");
			command.append("       (csetq formula (assertion-el-formula rule)) ");
			command.append("       (pwhen (cand (eq (first formula) #$implies) ");
			command.append("                    (unify-el-possible ").append(formula.stringApiValue()).append(" ");
			command.append("                                          (third formula))) ");
			command.append("         (cpush formula backchain-rules)))) ");
			command.append("   backchain-rules)");
		}
		return this.converseList(command.toString());
	}

	public CycList getBackchainRules(final CycConstant predicate, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final StringBuilder command = new StringBuilder();
		if (this.makeELMt(mt).equals(CycAccess.inferencePSC) || this.makeELMt(mt).equals(CycAccess.everythingPSC)) {
			command.append("(clet (backchain-rules) ");
			command.append("  (with-all-mts ");
			command.append("    (do-predicate-rule-index (rule ").append(predicate.stringApiValue()).append(" ");
			command.append("                                :sense :pos ");
			command.append("                                :done nil ");
			command.append("                                :direction :backward) ");
			command.append("       (pwhen (eq (first (assertion-el-formula rule)) #$implies) ");
			command.append("         (cpush (assertion-el-formula rule) backchain-rules)))) ");
			command.append("   backchain-rules)");
		} else {
			command.append("(clet (backchain-rules) ");
			command.append("  (with-inference-mt-relevance ").append(this.makeELMt(mt).stringApiValue()).append(" ");
			command.append("    (do-predicate-rule-index (rule ").append(predicate.stringApiValue()).append(" ");
			command.append("                                :sense :pos ");
			command.append("                                :done nil ");
			command.append("                                :direction :backward) ");
			command.append("       (pwhen (eq (first (assertion-el-formula rule)) #$implies) ");
			command.append("         (cpush (assertion-el-formula rule) backchain-rules)))) ");
			command.append("   backchain-rules)");
		}
		return this.converseList(command.toString());
	}

	public CycList getForwardChainRules(final CycConstant predicate, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final StringBuilder command = new StringBuilder();
		if (this.makeELMt(mt).equals(CycAccess.inferencePSC) || this.makeELMt(mt).equals(CycAccess.everythingPSC)) {
			command.append("(clet (backchain-rules) ");
			command.append("  (with-all-mts ");
			command.append("    (do-predicate-rule-index (rule ").append(predicate.stringApiValue()).append(" ");
			command.append("                                :sense :pos ");
			command.append("                                :done nil ");
			command.append("                                :direction :forward) ");
			command.append("       (pwhen (eq (first (assertion-el-formula rule)) #$implies) ");
			command.append("         (cpush (assertion-el-formula rule) backchain-rules)))) ");
			command.append("   backchain-rules)");
		} else {
			command.append("(clet (backchain-rules) ");
			command.append("  (with-inference-mt-relevance ").append(this.makeELMt(mt).stringApiValue()).append(" ");
			command.append("    (do-predicate-rule-index (rule ").append(predicate.stringApiValue()).append(" ");
			command.append("                                :sense :pos ");
			command.append("                                :done nil ");
			command.append("                                :direction :forward) ");
			command.append("       (pwhen (eq (first (assertion-el-formula rule)) #$implies) ");
			command.append("         (cpush (assertion-el-formula rule) backchain-rules)))) ");
			command.append("   backchain-rules)");
		}
		return this.converseList(command.toString());
	}

	public Object getSymbolValue(final CycSymbol cycSymbol) throws UnknownHostException, IOException, CycApiException {
		return this.converseObject("(symbol-value " + cycSymbol.stringApiValue() + ")");
	}

	public void setSymbolValue(final CycSymbol cycSymbol, final Object value) throws UnknownHostException, IOException, CycApiException {
		this.converseVoid(SubLAPIHelper.makeSubLStmt("csetq", new Object[] { new SubLAPIHelper.AsIsTerm((Object) cycSymbol), value }));
	}

	public boolean isWellFormedFormula(final CycList cycList) throws UnknownHostException, IOException, CycApiException {
		return this.isWellFormedFormulaInternal((CycObject) cycList);
	}

	public boolean isWellFormedFormula(final CycFormula formula) throws UnknownHostException, IOException, CycApiException {
		return this.isWellFormedFormulaInternal((CycObject) formula);
	}

	private boolean isWellFormedFormulaInternal(final CycObject cycList) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean(SubLAPIHelper.makeSubLStmt(CycAccess.WITH_ALL_MTS, new Object[] { SubLAPIHelper.makeNestedSubLStmt(CycAccess.EL_WFF, new Object[] { cycList }) }));
	}

	public boolean isBackchainRequired(final CycConstant predicate, final CycObject mt) throws IOException, CycApiException {
		final CycConstant backchainRequired = this.getKnownConstantByGuid("beaa3d29-9c29-11b1-9dad-c379636f7270");
		return this.hasSomePredicateUsingTerm(backchainRequired, (CycFort) predicate, 1, (CycObject) this.makeELMt(mt));
	}

	public boolean isBackchainEncouraged(final CycConstant predicate, final CycObject mt) throws IOException, CycApiException {
		final CycConstant backchainEncouraged = this.getKnownConstantByGuid("c09d1cea-9c29-11b1-9dad-c379636f7270");
		return this.hasSomePredicateUsingTerm(backchainEncouraged, (CycFort) predicate, 1, (CycObject) this.makeELMt(mt));
	}

	public boolean isBackchainDiscouraged(final CycConstant predicate, final CycObject mt) throws IOException, CycApiException {
		final CycConstant backchainDiscouraged = this.getKnownConstantByGuid("bfcbce14-9c29-11b1-9dad-c379636f7270");
		return this.hasSomePredicateUsingTerm(backchainDiscouraged, (CycFort) predicate, 1, (CycObject) this.makeELMt(mt));
	}

	public boolean isBackchainForbidden(final CycConstant predicate, final CycObject mt) throws IOException, CycApiException {
		final CycConstant backchainForbidden = this.getKnownConstantByGuid("bfa4e9d2-9c29-11b1-9dad-c379636f7270");
		return this.hasSomePredicateUsingTerm(backchainForbidden, (CycFort) predicate, 1, (CycObject) this.makeELMt(mt));
	}

	public boolean isIrreflexivePredicate(final CycConstant predicate, final CycObject mt) throws IOException, CycApiException {
		final CycConstant irreflexiveBinaryPredicate = this.getKnownConstantByGuid("bd654be7-9c29-11b1-9dad-c379636f7270");
		return this.isa((CycObject) predicate, (CycObject) irreflexiveBinaryPredicate, (CycObject) this.makeELMt(mt));
	}

	public boolean hasSomePredicateUsingTerm(final CycConstant predicate, final CycFort term, final Integer argumentPosition, final CycObject mt) throws IOException, CycApiException {
		String command;
		if (this.makeELMt(mt).equals(CycAccess.inferencePSC) || this.makeELMt(mt).equals(CycAccess.everythingPSC)) {
			command = SubLAPIHelper.makeSubLStmt(CycAccess.SOME_PRED_VALUE_IN_ANY_MT, new Object[] { term, predicate, argumentPosition });
		} else {
			command = SubLAPIHelper.makeSubLStmt(CycAccess.SOME_PRED_VALUE_IN_RELEVANT_MTS, new Object[] { term, predicate, this.makeELMt(mt), argumentPosition });
		}
		return this.converseBoolean(command);
	}

	public int countUsingBestIndex(final CycList formula, final CycObject mt) throws IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt("with-inference-mt-relevance", new Object[] { this.makeELMt(mt), SubLAPIHelper.makeNestedSubLStmt("best-index-count", new Object[] { formula, CycObjectFactory.t, CycObjectFactory.t }) });
		return this.converseInt(command);
	}

	public int importMucExpression(final CycList mucExpression, final String mtName) throws IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt("convert-netowl-sexpr-to-cycl-assertions", new Object[] { mucExpression, mtName });
		return this.converseInt(command);
	}

	public CycList rkfPhraseReader(final String text, final String parsingMt, final String domainMt) throws IOException, CycApiException {
		return this.rkfPhraseReader(text, (CycFort) this.getKnownConstantByName(parsingMt), (CycFort) this.getKnownConstantByName(domainMt));
	}

	public CycList rkfPhraseReader(final String text, final CycFort parsingMt, final CycFort domainMt) throws IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt("rkf-phrase-reader", new Object[] { text, parsingMt, domainMt });
		return this.converseList(command);
	}

	public CycList generateDisambiguationPhraseAndTypes(final CycList objects) throws IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt(CycObjectFactory.makeCycSymbol("generate-disambiguation-phrases-and-types"), new Object[] { objects });
		return this.converseList(command);
	}

	public CycList phraseStructureParse(final String str) throws IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt(CycObjectFactory.makeCycSymbol("ps-get-cycls-for-phrase"), new Object[] { str });
		return this.converseList(command);
	}

	public int getArity(final CycFort predicate) throws IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt(CycAccess.WITH_ALL_MTS, new Object[] { SubLAPIHelper.makeNestedSubLStmt("arity", new Object[] { predicate }) });
		final Object object = this.converseObject(command);
		if (object instanceof Integer) {
			return (int) object;
		}
		return 0;
	}

	public CycList getArg2s(final CycFort predicate, final Object arg1) throws IOException, CycApiException {
		final CycVariable variable = CycObjectFactory.makeCycVariable("?arg2");
		final CycFormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(new Object[] { predicate, arg1, variable });
		return this.queryVariable(variable, query, (CycObject) CycAccess.inferencePSC);
	}

	public Object getArg2(final CycFort predicate, final Object arg1) throws IOException, CycApiException {
		final CycList arg2s = this.getArg2s(predicate, arg1);
		if (arg2s.isEmpty()) {
			return null;
		}
		return arg2s.first();
	}

	public boolean isFormulaWellFormed(final CycList formula, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.isFormulaWellFormedInternal((CycObject) formula, mt);
	}

	public boolean isFormulaWellFormed(final CycFormula formula, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.isFormulaWellFormedInternal((CycObject) formula, mt);
	}

	private boolean isFormulaWellFormedInternal(final CycObject formula, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(el-formula-ok? " + formula.stringApiValue() + " " + this.makeELMt(mt).stringApiValue() + ")");
	}

	public boolean isCycLNonAtomicReifableTerm(final CycList formula) throws UnknownHostException, IOException, CycApiException {
		return this.isCycLNonAtomicReifableTerm(formula);
	}

	public boolean isCycLNonAtomicReifableTerm(final CycObject formula) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(cycl-nart-p " + formula.stringApiValue() + ")");
	}

	public boolean isCycLNonAtomicUnreifableTerm(final CycObject formula) throws UnknownHostException, IOException, CycApiException {
		return this.converseBoolean("(cycl-naut-p " + formula.stringApiValue() + ")");
	}

	public CycConstant createCollectorMt(final String mtName, final String comment, final List genlMts) throws IOException, CycApiException {
		final CycConstant collectorMt = this.getKnownConstantByName("CollectorMicrotheory");
		return this.createMicrotheory(mtName, comment, (CycFort) collectorMt, genlMts);
	}

	public void assertIsas(final List fortNames, final String collectionName) throws IOException, CycApiException {
		final List forts = new ArrayList();
		for (int i = 0; i < forts.size(); ++i) {
			final Object fort = forts.get(i);
			if (fort instanceof String) {
				forts.add(this.getKnownConstantByName((String) fort));
			} else {
				if (!(fort instanceof CycFort)) {
					throw new CycApiException(fort + " is neither String nor CycFort");
				}
				forts.add(fort);
			}
			this.assertIsas(forts, (CycFort) this.getKnownConstantByName(collectionName));
		}
	}

	public void assertIsas(final List forts, final CycFort collection) throws IOException, CycApiException {
		for (int i = 0; i < forts.size(); ++i) {
			this.assertIsa((CycDenotationalTerm) forts.get(i), (CycDenotationalTerm) collection);
		}
	}

	public CycConstant createSpindleMt(final String spindleMtName, final String comment, final String spindleHeadMtName, final String spindleCollectorMtName) throws IOException, CycApiException {
		return this.createSpindleMt(spindleMtName, comment, (CycFort) this.getKnownConstantByName(spindleHeadMtName), (CycFort) this.getKnownConstantByName(spindleCollectorMtName));
	}

	public CycConstant createSpindleMt(final String spindleMtName, final String comment, final CycFort spindleHeadMt, final CycFort spindleCollectorMt) throws IOException, CycApiException {
		final CycConstant spindleMt = this.getKnownConstantByName("SpindleMicrotheory");
		final List genlMts = new ArrayList();
		genlMts.add(spindleHeadMt);
		final CycConstant mt = this.createMicrotheory(spindleMtName, comment, (CycFort) spindleMt, genlMts);
		this.assertGaf((CycObject) CycAccess.universalVocabularyMt, (CycDenotationalTerm) CycAccess.genlMt, (CycDenotationalTerm) spindleCollectorMt, (CycDenotationalTerm) mt);
		return mt;
	}

	public CycConstant createBinaryPredicate(final String predicateName, final String predicateTypeName, final String comment, final String arg1IsaName, final String arg2IsaName, final String arg1FormatName, final String arg2FormatName, final String genlPredsName, final String genFormatString, final String genFormatList) throws IOException, CycApiException {
		return this.createBinaryPredicate(predicateName, (CycFort) this.find(predicateTypeName), comment, (CycFort) this.find(arg1IsaName), (CycFort) this.find(arg2IsaName), (CycFort) this.find(arg1FormatName), (CycFort) this.find(arg2FormatName), (CycFort) this.find(genlPredsName), genFormatString, this.makeCycList(genFormatList));
	}

	public CycConstant createBinaryPredicate(final String predicateName, final CycFort predicateType, final String comment, final CycFort arg1Isa, final CycFort arg2Isa, final CycFort arg1Format, final CycFort arg2Format, final CycFort genlPreds, final String genFormatString, final CycList genFormatList) throws IOException, CycApiException {
		final CycConstant predicate = this.findOrCreate(predicateName);
		if (predicateType == null) {
			this.assertIsa((CycDenotationalTerm) predicate, (CycDenotationalTerm) CycAccess.binaryPredicate);
		} else {
			this.assertIsa((CycDenotationalTerm) predicate, (CycDenotationalTerm) predicateType);
		}
		if (comment != null) {
			this.assertComment((CycFort) predicate, comment, (CycObject) CycAccess.baseKB);
		}
		if (arg1Isa != null) {
			this.assertArgIsa((CycFort) predicate, 1, arg1Isa);
		}
		if (arg2Isa != null) {
			this.assertArgIsa((CycFort) predicate, 2, arg2Isa);
		}
		if (arg1Format != null) {
			this.assertArgFormat((CycFort) predicate, 1, arg1Format);
		}
		if (arg2Format != null) {
			this.assertArgFormat((CycFort) predicate, 2, arg2Format);
		}
		if (genlPreds == null) {
			this.assertGenlPreds((CycFort) predicate, (CycFort) this.getKnownConstantByGuid("bd58803e-9c29-11b1-9dad-c379636f7270"));
		} else {
			this.assertGenlPreds((CycFort) predicate, genlPreds);
		}
		if (genFormatString != null && genFormatList != null) {
			this.assertGenFormat((CycFort) predicate, genFormatString, genFormatList);
		}
		return predicate;
	}

	public CycConstant createKbSubsetCollection(final String constantName, final String comment) throws IOException, CycApiException {
		final CycConstant kbSubsetCollection = this.getKnownConstantByName("KBSubsetCollection");
		CycConstant cycConstant = this.getConstantByName(constantName);
		if (cycConstant == null) {
			cycConstant = this.createNewPermanent(constantName);
		}
		this.assertIsa((CycDenotationalTerm) cycConstant, (CycDenotationalTerm) kbSubsetCollection);
		this.assertComment((CycFort) cycConstant, comment, (CycObject) CycAccess.baseKB);
		this.assertGenls((CycFort) cycConstant, (CycFort) CycAccess.thing);
		final CycFort variableOrderCollection = (CycFort) this.getKnownConstantByGuid("36cf85d0-20a1-11d6-8000-0050dab92c2f");
		this.assertIsa((CycFort) cycConstant, variableOrderCollection, (CycObject) CycAccess.baseKB);
		return cycConstant;
	}

	public CycConstant createCollection(final String collectionName, final String comment, final String commentMtName, final String isaName, final String genlsName) throws IOException, CycApiException {
		final CycConstant cycCollection = this.findOrCreate(collectionName);
		this.assertComment((CycFort) cycCollection, comment, (CycObject) this.getKnownConstantByName(commentMtName));
		this.assertIsa((CycDenotationalTerm) cycCollection, (CycDenotationalTerm) this.getKnownConstantByName(isaName));
		this.assertGenls((CycFort) cycCollection, (CycFort) this.getKnownConstantByName(genlsName));
		return cycCollection;
	}

	public CycFort createCollection(final String collectionName, final String comment, final CycFort commentMt, final CycFort isa, final CycFort genls) throws IOException, CycApiException {
		return this.createCollection((CycFort) this.findOrCreate(collectionName), comment, commentMt, isa, genls);
	}

	public CycFort createCollection(final CycFort collection, final String comment, final CycFort commentMt, final CycFort isa, final CycFort genls) throws IOException, CycApiException {
		this.assertComment(collection, comment, (CycObject) commentMt);
		this.assertIsa((CycDenotationalTerm) collection, (CycDenotationalTerm) isa);
		this.assertGenls(collection, genls);
		return collection;
	}

	public CycFort createIndividual(final String IndividualName, final String comment, final String commentMt, final String isa) throws IOException, CycApiException {
		return this.createIndividual(IndividualName, comment, (CycDenotationalTerm) this.getKnownConstantByName(commentMt), (CycDenotationalTerm) this.getKnownConstantByName(isa));
	}

	public CycFort createIndividual(final String IndividualName, final String comment, final CycDenotationalTerm commentMt, final CycDenotationalTerm isa) throws IOException, CycApiException {
		final CycFort individual = (CycFort) this.findOrCreate(IndividualName);
		this.assertComment(individual, comment, (CycObject) commentMt);
		this.assertIsa((CycDenotationalTerm) individual, isa);
		return individual;
	}

	public CycFort createIndivDenotingUnaryFunction(final String unaryFunction, final String comment, final String commentMt, final String arg1Isa, final String resultIsa) throws IOException, CycApiException {
		return this.createIndivDenotingUnaryFunction((CycFort) this.findOrCreate(unaryFunction), comment, (CycFort) this.getKnownConstantByName(commentMt), (CycFort) this.getKnownConstantByName(arg1Isa), (CycFort) this.getKnownConstantByName(resultIsa));
	}

	public CycFort createIndivDenotingUnaryFunction(final CycFort unaryFunction, final String comment, final CycFort commentMt, final CycFort arg1Isa, final CycFort resultIsa) throws IOException, CycApiException {
		this.assertComment(unaryFunction, comment, (CycObject) commentMt);
		this.assertIsa((CycDenotationalTerm) unaryFunction, (CycDenotationalTerm) this.getKnownConstantByGuid("bd58af89-9c29-11b1-9dad-c379636f7270"));
		this.assertIsa((CycDenotationalTerm) unaryFunction, (CycDenotationalTerm) this.getKnownConstantByGuid("bd588002-9c29-11b1-9dad-c379636f7270"));
		this.assertIsa((CycDenotationalTerm) unaryFunction, (CycDenotationalTerm) this.getKnownConstantByGuid("bd58fad9-9c29-11b1-9dad-c379636f7270"));
		this.assertIsa((CycDenotationalTerm) unaryFunction, (CycDenotationalTerm) this.getKnownConstantByGuid("bd5c40b0-9c29-11b1-9dad-c379636f7270"));
		this.assertArgIsa(unaryFunction, 1, arg1Isa);
		this.assertResultIsa(unaryFunction, resultIsa);
		return unaryFunction;
	}

	public CycFort createCollectionDenotingUnaryFunction(final String unaryFunction, final String comment, final String commentMt, final String arg1Isa, final String arg1GenlName, final String resultIsa, final String resultGenlName) throws IOException, CycApiException {
		CycFort arg1Genl;
		if (arg1GenlName != null) {
			arg1Genl = (CycFort) this.getKnownConstantByName(arg1GenlName);
		} else {
			arg1Genl = null;
		}
		CycFort resultGenl;
		if (resultGenlName != null) {
			resultGenl = (CycFort) this.getKnownConstantByName(resultGenlName);
		} else {
			resultGenl = null;
		}
		return this.createCollectionDenotingUnaryFunction((CycFort) this.findOrCreate(unaryFunction), comment, (CycFort) this.getKnownConstantByName(commentMt), (CycFort) this.getKnownConstantByName(arg1Isa), arg1Genl, (CycFort) this.getKnownConstantByName(resultIsa), resultGenl);
	}

	public CycFort createCollectionDenotingUnaryFunction(final CycFort unaryFunction, final String comment, final CycFort commentMt, final CycFort arg1Isa, final CycFort arg1Genl, final CycFort resultIsa, final CycFort resultGenl) throws IOException, CycApiException {
		this.assertComment(unaryFunction, comment, (CycObject) commentMt);
		this.assertIsa((CycDenotationalTerm) unaryFunction, (CycDenotationalTerm) this.getKnownConstantByGuid("bd58af89-9c29-11b1-9dad-c379636f7270"));
		this.assertIsa((CycDenotationalTerm) unaryFunction, (CycDenotationalTerm) this.getKnownConstantByGuid("bd588002-9c29-11b1-9dad-c379636f7270"));
		this.assertIsa((CycDenotationalTerm) unaryFunction, (CycDenotationalTerm) this.getKnownConstantByGuid("bd58806a-9c29-11b1-9dad-c379636f7270"));
		this.assertIsa((CycDenotationalTerm) unaryFunction, (CycDenotationalTerm) this.getKnownConstantByGuid("bd5c40b0-9c29-11b1-9dad-c379636f7270"));
		this.assertArgIsa(unaryFunction, 1, arg1Isa);
		if (arg1Genl != null) {
			this.assertArg1Genl(unaryFunction, arg1Genl);
		}
		this.assertResultIsa(unaryFunction, resultIsa);
		if (resultGenl != null) {
			this.assertResultGenl(unaryFunction, resultGenl);
		}
		return unaryFunction;
	}

	public CycFort createCollectionDenotingBinaryFunction(final String binaryFunction, final String comment, final String commentMt, final String arg1IsaName, final String arg2IsaName, final String arg1GenlsName, final String arg2GenlsName, final String resultIsa) throws IOException, CycApiException {
		CycFort arg1Isa = null;
		final CycFort arg2Isa = null;
		CycFort arg1Genls = null;
		CycFort arg2Genls = null;
		if (arg1IsaName != null) {
			arg1Isa = (CycFort) this.getKnownConstantByName(arg1IsaName);
		}
		if (arg2IsaName != null) {
			arg1Isa = (CycFort) this.getKnownConstantByName(arg2IsaName);
		}
		if (arg1GenlsName != null) {
			arg1Genls = (CycFort) this.getKnownConstantByName(arg1GenlsName);
		}
		if (arg2GenlsName != null) {
			arg2Genls = (CycFort) this.getKnownConstantByName(arg2GenlsName);
		}
		return this.createCollectionDenotingBinaryFunction((CycFort) this.findOrCreate(binaryFunction), comment, (CycFort) this.getKnownConstantByName(commentMt), arg1Isa, arg2Isa, arg1Genls, arg2Genls, (CycFort) this.getKnownConstantByName(resultIsa));
	}

	public CycFort createCollectionDenotingBinaryFunction(final CycFort binaryFunction, final String comment, final CycFort commentMt, final CycFort arg1Isa, final CycFort arg2Isa, final CycFort arg1Genls, final CycFort arg2Genls, final CycFort resultIsa) throws IOException, CycApiException {
		this.assertComment(binaryFunction, comment, (CycObject) commentMt);
		this.assertIsa((CycDenotationalTerm) binaryFunction, (CycDenotationalTerm) this.getKnownConstantByGuid("c0e7247c-9c29-11b1-9dad-c379636f7270"));
		this.assertIsa((CycDenotationalTerm) binaryFunction, (CycDenotationalTerm) this.getKnownConstantByGuid("bd588002-9c29-11b1-9dad-c379636f7270"));
		this.assertIsa((CycDenotationalTerm) binaryFunction, (CycDenotationalTerm) this.getKnownConstantByGuid("bd58806a-9c29-11b1-9dad-c379636f7270"));
		this.assertIsa((CycDenotationalTerm) binaryFunction, (CycDenotationalTerm) this.getKnownConstantByGuid("bd5c40b0-9c29-11b1-9dad-c379636f7270"));
		if (arg1Isa != null) {
			this.assertArgIsa(binaryFunction, 1, arg1Isa);
		}
		if (arg2Isa != null) {
			this.assertArgIsa(binaryFunction, 2, arg2Isa);
		}
		if (arg1Genls != null) {
			this.assertArg1Genl(binaryFunction, arg1Genls);
		}
		if (arg2Genls != null) {
			this.assertArg2Genl(binaryFunction, arg2Genls);
		}
		this.assertResultIsa(binaryFunction, resultIsa);
		return binaryFunction;
	}

	public void assertArgIsa(final CycFort relation, final int argPosition, final CycFort argNIsa) throws UnknownHostException, IOException, CycApiException {
		final CycList sentence = new CycList();
		sentence.add((Object) this.getKnownConstantByGuid("bee22d3d-9c29-11b1-9dad-c379636f7270"));
		sentence.add((Object) relation);
		sentence.add(argPosition);
		sentence.add((Object) argNIsa);
		this.assertGaf(sentence, (CycObject) CycAccess.universalVocabularyMt);
	}

	public void assertArg1Genl(final CycFort relation, final CycFort argGenl) throws UnknownHostException, IOException, CycApiException {
		final CycList sentence = new CycList();
		sentence.add((Object) this.getKnownConstantByGuid("bd588b1d-9c29-11b1-9dad-c379636f7270"));
		sentence.add((Object) relation);
		sentence.add((Object) argGenl);
		this.assertGaf(sentence, (CycObject) CycAccess.universalVocabularyMt);
	}

	public void assertArg2Genl(final CycFort relation, final CycFort argGenl) throws UnknownHostException, IOException, CycApiException {
		final CycList sentence = new CycList();
		sentence.add((Object) this.getKnownConstantByGuid("bd58dcda-9c29-11b1-9dad-c379636f7270"));
		sentence.add((Object) relation);
		sentence.add((Object) argGenl);
		this.assertGaf(sentence, (CycObject) CycAccess.universalVocabularyMt);
	}

	public void assertArg3Genl(final CycFort relation, final CycFort argGenl) throws UnknownHostException, IOException, CycApiException {
		final CycList sentence = new CycList();
		sentence.add((Object) this.getKnownConstantByGuid("bd58b8c3-9c29-11b1-9dad-c379636f7270"));
		sentence.add((Object) relation);
		sentence.add((Object) argGenl);
		this.assertGaf(sentence, (CycObject) CycAccess.universalVocabularyMt);
	}

	public void assertResultIsa(final CycFort denotationalFunction, final CycFort resultIsa) throws UnknownHostException, IOException, CycApiException {
		this.assertGaf((CycObject) CycAccess.universalVocabularyMt, (CycDenotationalTerm) this.getKnownConstantByGuid("bd5880f1-9c29-11b1-9dad-c379636f7270"), (CycDenotationalTerm) denotationalFunction, (CycDenotationalTerm) resultIsa);
	}

	public void assertResultGenl(final CycFort denotationalFunction, final CycFort resultGenl) throws UnknownHostException, IOException, CycApiException {
		this.assertGaf((CycObject) CycAccess.universalVocabularyMt, (CycDenotationalTerm) this.getKnownConstantByGuid("bd58d6ab-9c29-11b1-9dad-c379636f7270"), (CycDenotationalTerm) denotationalFunction, (CycDenotationalTerm) resultGenl);
	}

	public synchronized boolean isOpenCyc() throws UnknownHostException, IOException {
		if (this.isOpenCyc == null) {
			try {
				this.isOpenCyc = this.converseBoolean("(cyc-opencyc-feature)");
			} catch (CycApiException e) {
				this.isOpenCyc = false;
			}
		}
		return this.isOpenCyc;
	}

	public CycFort importOwlOntology(final String uri, final String prefix) throws IOException, CycApiException {
		return this.importOwlOntology(uri, prefix, uri);
	}

	public CycFort importOwlOntology(final String uri, final String prefix, final String sourceFile) throws IOException, CycApiException {
		final CycFort ontology = null;
		return this.importOwlOntology(uri, prefix, sourceFile, ontology);
	}

	public CycFort importOwlOntology(final String uri, final String prefix, final String sourceFile, final CycFort ontology) throws IOException, CycApiException {
		final CycFort quotedIsa = null;
		return this.importOwlOntology(uri, prefix, sourceFile, ontology, quotedIsa);
	}

	public CycFort importOwlOntology(final String uri, final String prefix, final String sourceFile, final CycFort ontology, final CycFort quotedIsa) throws IOException, CycApiException {
		final CycFort currentCyclist = this.getCyclist();
		return this.importOwlOntology(uri, prefix, sourceFile, ontology, quotedIsa, currentCyclist);
	}

	public CycFort importOwlOntology(final String uri, final String prefix, final String sourceFile, final CycFort ontology, final CycFort quotedIsa, final CycFort cyclist) throws IOException, CycApiException {
		final String sourceFileString = (sourceFile != null && sourceFile.length() > 0) ? ("\"" + sourceFile + "\"") : "nil";
		final String ontologyString = (ontology == null) ? "nil" : CycFort.stringApiValue((Object) ontology);
		final String quotedIsaString = (quotedIsa == null) ? "nil" : CycFort.stringApiValue((Object) quotedIsa);
		final String cyclistString = (cyclist == null) ? "nil" : CycFort.stringApiValue((Object) cyclist);
		final Object object = this.converseObject("(import-owl-ontology \"" + uri + "\" " + "\"" + prefix + "\" " + sourceFileString + " " + ontologyString + " " + quotedIsaString + " " + cyclistString + ")");
		if (object instanceof CycFort) {
			return (CycFort) object;
		}
		return null;
	}

	public CycConstant constantNameCaseCollision(final String name) throws UnknownHostException, IOException, CycApiException {
		final Object object = this.converseObject("(constant-name-case-collision \"" + name + "\")");
		if (object instanceof CycConstant) {
			return (CycConstant) object;
		}
		return null;
	}

	public CycList getApplicableBinaryPredicates(final CycList kbSubsetCollections) throws UnknownHostException, IOException, CycApiException {
		final CycList result = new CycList();
		for (int i = 0; i < kbSubsetCollections.size(); ++i) {
			final CycFort kbSubsetCollection = (CycFort) kbSubsetCollections.get(i);
			final String query = "(#$and \n  (#$isa ?binary-predicate " + kbSubsetCollection.stringApiValue() + ") \n" + "  (#$isa ?binary-predicate #$BinaryPredicate))";
			result.addAllNew((Collection) this.queryVariable(CycObjectFactory.makeCycVariable("?binary-predicate"), this.makeCycSentence(query), (CycObject) CycAccess.inferencePSC, (InferenceParameters) new DefaultInferenceParameters(this)));
		}
		return result;
	}

	public CycList getGafsForPredicates(final CycObject cycObject, final List predicates, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		if (predicates == null) {
			throw new NullPointerException("predicates must not be null");
		}
		if (predicates == null) {
			throw new NullPointerException("predicates must not be null");
		}
		final CycList result = new CycList();
		for (int i = 0; i < predicates.size(); ++i) {
			result.addAllNew((Collection) this.getGafs(cycObject, (CycObject) predicates.get(i), (CycObject) this.makeELMt(mt)));
		}
		return result;
	}

	public CycList getGafs(final CycObject cycFort, final CycObject predicate, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		if (cycFort == null) {
			throw new NullPointerException("cycFort must not be null");
		}
		if (predicate == null) {
			throw new NullPointerException("predicate must not be null");
		}
		if (mt == null) {
			throw new NullPointerException("mt must not be null");
		}
		final CycList gafs = new CycList();
		final String command = "(with-inference-mt-relevance " + this.makeELMt(mt).stringApiValue() + "\n" + "  (pred-values-in-relevant-mts " + cycFort.stringApiValue() + " " + predicate.stringApiValue() + "))";
		final CycList values = this.converseList(command);
		for (int i = 0; i < values.size(); ++i) {
			final CycList gaf = new CycList();
			gaf.add((Object) predicate);
			gaf.add((Object) cycFort);
			gaf.add(values.get(i));
			gafs.add((Object) gaf);
		}
		return gafs;
	}

	public CycList getGafsForPredicates(final CycObject cycObject, final List predicates) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		if (predicates == null) {
			throw new NullPointerException("predicates must not be null");
		}
		final CycList result = new CycList();
		for (int i = 0; i < predicates.size(); ++i) {
			result.addAllNew((Collection) this.getGafs(cycObject, (CycObject) predicates.get(i)));
		}
		return result;
	}

	public CycList getGafs(final CycObject cycObject, final CycObject predicate) throws UnknownHostException, IOException, CycApiException {
		if (cycObject == null) {
			throw new NullPointerException("cycObject must not be null");
		}
		this.verifyPossibleDenotationalTerm(cycObject);
		if (cycObject instanceof CycList) {
			return this.getGafsForNaut((CycList) cycObject, predicate);
		}
		final CycList gafs = new CycList();
		final String command = "(with-all-mts \n  (pred-values-in-relevant-mts (canonicalize-term " + cycObject.stringApiValue() + ") " + "(canonicalize-term " + predicate.stringApiValue() + ")))";
		final CycList values = this.converseList(command);
		for (int i = 0; i < values.size(); ++i) {
			final CycList gaf = new CycList();
			gaf.add((Object) predicate);
			gaf.add((Object) cycObject);
			gaf.add(values.get(i));
			gafs.add((Object) gaf);
		}
		return gafs;
	}

	public CycList getGafsForNaut(final CycList naut, final CycObject predicate) throws UnknownHostException, IOException, CycApiException {
		final String command = "(clet (assertions)   (do-gaf-arg-index-naut (assertion " + naut.stringApiValue() + ")" + "    (pwhen (equal (formula-arg1 assertion) " + predicate.stringApiValue() + ")" + "      (cpush assertion assertions))) " + "  assertions)";
		final CycList gafs = this.converseList(command);
		assert gafs != null : "gafs cannot be null";
		return gafs;
	}

	public CycList getPredicateValueTuplesInMt(final CycFort term, final CycFort predicate, final int indexArg, final CycList gatherArgs, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final CycList tuples = new CycList();
		final String command = SubLAPIHelper.makeSubLStmt("pred-value-tuples-in-mt", new Object[] { term, predicate, indexArg, gatherArgs, this.makeELMt(mt) });
		return this.converseList(command);
	}

	public void assertArg1FormatSingleEntry(final CycFort relation) throws UnknownHostException, IOException, CycApiException {
		this.assertArgFormat(relation, 1, (CycFort) this.getKnownConstantByGuid("bd5880eb-9c29-11b1-9dad-c379636f7270"));
	}

	public void assertArgFormat(final CycFort relation, final int argPosition, final CycFort argNFormat) throws UnknownHostException, IOException, CycApiException {
		final CycFormulaSentence sentence = CycFormulaSentence.makeCycFormulaSentence(new Object[] { this.getKnownConstantByGuid("bd8a36e1-9c29-11b1-9dad-c379636f7270"), relation, argPosition, argNFormat });
		this.assertGaf(sentence, (CycObject) CycAccess.baseKB);
	}

	public void assertSynonymousExternalConcept(final String cycTerm, final String informationSource, final String externalConcept, final String mt) throws UnknownHostException, IOException, CycApiException {
		this.assertSynonymousExternalConcept((CycFort) this.getKnownConstantByName(cycTerm), (CycFort) this.getKnownConstantByName(informationSource), externalConcept, (CycObject) this.getKnownConstantByName(mt));
	}

	public void assertSynonymousExternalConcept(final CycFort cycTerm, final CycFort informationSource, final String externalConcept, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final CycFormulaSentence gaf = CycFormulaSentence.makeCycFormulaSentence(new Object[] { this.getKnownConstantByGuid("c0e2af4e-9c29-11b1-9dad-c379636f7270"), cycTerm, informationSource, externalConcept });
		this.assertGaf(gaf, (CycObject) this.makeELMt(mt));
	}

	public CycList getSynonymousExternalConcepts(final String informationSource, final String mt) throws UnknownHostException, IOException, CycApiException {
		return this.getSynonymousExternalConcepts((CycFort) this.getKnownConstantByName(informationSource), (CycObject) this.getKnownConstantByName(mt));
	}

	public CycList getSynonymousExternalConcepts(final CycFort informationSource, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final CycList variables = new CycList();
		final CycVariable cycTermVar = CycObjectFactory.makeCycVariable("?cyc-term");
		variables.add((Object) cycTermVar);
		final CycVariable externalConceptVar = CycObjectFactory.makeCycVariable("?externalConcept");
		variables.add((Object) externalConceptVar);
		final CycFormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(new Object[] { this.getKnownConstantByGuid("c0e2af4e-9c29-11b1-9dad-c379636f7270"), cycTermVar, informationSource, externalConceptVar });
		return this.queryVariables((CycList<CycVariable>) variables, query, (CycObject) this.makeELMt(mt), (InferenceParameters) new DefaultInferenceParameters(this));
	}

	public void assertGenPhraseCountNounSingular(final CycFort cycTerm, final String phrase) throws UnknownHostException, IOException, CycApiException {
		final CycFormulaSentence gaf = CycFormulaSentence.makeCycFormulaSentence(new Object[] { this.getKnownConstantByGuid("bd5fb28e-9c29-11b1-9dad-c379636f7270"), cycTerm, this.getKnownConstantByGuid("bd588078-9c29-11b1-9dad-c379636f7270"), this.getKnownConstantByGuid("bd6757b8-9c29-11b1-9dad-c379636f7270"), phrase });
		final ELMt elmt = this.makeELMt((CycFort) this.getKnownConstantByGuid("bda16220-9c29-11b1-9dad-c379636f7270"));
		this.assertGaf(gaf, (CycObject) elmt);
	}

	public void assertGenPhraseCountNounPlural(final CycFort cycTerm, final String phrase) throws UnknownHostException, IOException, CycApiException {
		final CycList gaf = new CycList();
		gaf.add((Object) this.getKnownConstantByGuid("bd5fb28e-9c29-11b1-9dad-c379636f7270"));
		gaf.add((Object) cycTerm);
		gaf.add((Object) this.getKnownConstantByGuid("bd588078-9c29-11b1-9dad-c379636f7270"));
		gaf.add((Object) this.getKnownConstantByGuid("bd5a6853-9c29-11b1-9dad-c379636f7270"));
		gaf.add((Object) phrase);
		final ELMt elmt = this.makeELMt((CycFort) this.getKnownConstantByGuid("bda16220-9c29-11b1-9dad-c379636f7270"));
		this.assertGaf(gaf, (CycObject) elmt);
	}

	public CycList getNameStrings(final CycFort cycFort, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final CycVariable variable = CycObjectFactory.makeCycVariable("?name-string");
		final CycFormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(new Object[] { this.getKnownConstantByGuid("c0fdf7e8-9c29-11b1-9dad-c379636f7270"), cycFort, variable });
		return this.queryVariable(variable, query, (CycObject) this.makeELMt(mt));
	}

	public void ensureWffConstraints(final String cycFort, final String isaConstraintName, final String genlsConstraintName) throws UnknownHostException, IOException, CycApiException {
		final CycConstant cycConstant = this.find(cycFort);
		CycConstant isaConstraint = null;
		CycConstant genlsConstraint = null;
		if (isaConstraintName != null) {
			isaConstraint = this.find(isaConstraintName);
		}
		if (genlsConstraintName != null) {
			genlsConstraint = this.find(genlsConstraintName);
		}
		this.ensureWffConstraints((CycFort) cycConstant, (CycFort) isaConstraint, (CycFort) genlsConstraint);
	}

	public void ensureWffConstraints(final CycFort cycFort, final CycFort isaConstraint, final CycFort genlsConstraint) throws UnknownHostException, IOException, CycApiException {
		if (isaConstraint != null && !this.isa((CycObject) cycFort, (CycObject) isaConstraint, (CycObject) CycAccess.universalVocabularyMt)) {
			this.assertIsa((CycDenotationalTerm) cycFort, (CycDenotationalTerm) isaConstraint);
		}
		if (genlsConstraint != null && !this.isSpecOf((CycObject) cycFort, (CycObject) genlsConstraint, (CycObject) CycAccess.universalVocabularyMt)) {
			this.assertGenls(cycFort, genlsConstraint);
		}
	}

	public CycList getArg2s(final String predicate, final String arg1, final String mt) throws UnknownHostException, IOException, CycApiException {
		return this.getArg2s((CycFort) this.getKnownConstantByName(predicate), (CycFort) this.getKnownConstantByName(arg1), (CycObject) this.getKnownConstantByName(mt));
	}

	public CycList getArg2s(final String predicate, final CycFort arg1, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.getArg2s((CycFort) this.getKnownConstantByName(predicate), arg1, (CycObject) this.makeELMt(mt));
	}

	public CycList getArg2s(final CycFort predicate, final CycFort arg1, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final CycVariable variable = CycObjectFactory.makeCycVariable("?arg2");
		final CycFormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(new Object[] { predicate, arg1, variable });
		return this.queryVariable(variable, query, (CycObject) this.makeELMt(mt));
	}

	public Object getArg2(final String predicate, final String arg1, final String mt) throws UnknownHostException, IOException, CycApiException {
		return this.getArg2((CycFort) this.getKnownConstantByName(predicate), (CycFort) this.getKnownConstantByName(arg1), (CycObject) this.getKnownConstantByName(mt));
	}

	public Object getArg2(final String predicate, final CycFort arg1, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.getArg2((CycFort) this.getKnownConstantByName(predicate), arg1, (CycObject) this.makeELMt(mt));
	}

	public Object getArg2(final CycFort predicate, final CycFort arg1, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final CycVariable variable = CycObjectFactory.makeCycVariable("?arg2");
		final CycFormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(new Object[] { predicate, arg1, variable });
		final DefaultInferenceParameters params = new DefaultInferenceParameters(this);
		params.setMaxNumber(1);
		final CycList answer = this.queryVariable(variable, query, (CycObject) this.makeELMt(mt), (InferenceParameters) params);
		if (answer.size() > 0) {
			return answer.get(0);
		}
		return null;
	}

	public Object getAssertionArg2(final String predicate, final String arg1, final String mt) throws UnknownHostException, IOException, CycApiException {
		return this.getAssertionArg2((CycFort) this.getKnownConstantByName(predicate), (CycFort) this.getKnownConstantByName(arg1), (CycObject) this.getKnownConstantByName(mt));
	}

	public Object getAssertionArg2(final CycFort predicate, final CycFort arg1, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseObject(SubLAPIHelper.makeSubLStmt(CycAccess.FPRED_VALUE_IN_MT, new Object[] { arg1, predicate, this.makeELMt(mt) }));
	}

	public Object getArg1(final String predicate, final String arg2, final String mt) throws UnknownHostException, IOException, CycApiException {
		return this.getArg1((CycFort) this.getKnownConstantByName(predicate), (CycDenotationalTerm) this.getKnownConstantByName(arg2), (CycObject) this.getKnownConstantByName(mt));
	}

	public Object getArg1(final CycFort predicate, final CycDenotationalTerm arg2, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final CycList answer = this.getArg1s(predicate, arg2, (CycObject) this.makeELMt(mt));
		if (answer.size() > 0) {
			return answer.get(0);
		}
		return null;
	}

	public CycList getArg1s(final String predicate, final String arg2, final String mt) throws UnknownHostException, IOException, CycApiException {
		return this.getArg1s((CycFort) this.getKnownConstantByName(predicate), (CycDenotationalTerm) this.getKnownConstantByName(arg2), (CycObject) this.getKnownConstantByName(mt));
	}

	public CycList getArg1s(final CycFort predicate, final CycDenotationalTerm arg2, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final CycVariable variable = CycObjectFactory.makeCycVariable("?arg1");
		final CycFormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(new Object[] { predicate, variable, arg2 });
		return this.queryVariable(variable, query, (CycObject) this.makeELMt(mt));
	}

	public String getCycImageID() throws UnknownHostException, IOException, CycApiException {
		return this.converseString(CycAccess.CYC_IMAGE_ID_EXPRESSION);
	}

	public String getCycRevisionString() throws UnknownHostException, IOException, CycApiException {
		return this.converseString(SubLAPIHelper.makeSubLStmt("cyc-revision-string", new Object[0]));
	}

	public String getCycKBVersionString() throws UnknownHostException, IOException, CycApiException {
		return this.converseString(SubLAPIHelper.makeSubLStmt("kb-version-string", new Object[0]));
	}

	public CycList getAllAssertionsInMt(final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		return this.converseList(SubLAPIHelper.makeSubLStmt("gather-mt-index", new Object[] { mt }));
	}

	public void unassertMtContentsWithTranscript(final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final CycList<?> assertions = this.getAllAssertionsInMt(mt);
		for (final Object assertion : assertions) {
			final String command = this.wrapBookkeeping(SubLAPIHelper.makeSubLStmt("ke-unassert-now", new Object[] { assertion, this.makeELMt(mt) }));
			this.converseVoid(command);
		}
	}

	public void unassertMtContentsWithoutTranscript(final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final CycList assertions = this.getAllAssertionsInMt(mt);
		for (final Object assertion : assertions) {
			final String command = SubLAPIHelper.makeSubLStmt("cyc-unassert", new Object[] { assertion, this.makeELMt(mt) });
			this.converseVoid(command);
		}
	}

	public void unassertMatchingAssertionsWithoutTranscript(final CycFort predicate, final Object arg1, final CycObject mt) throws UnknownHostException, IOException, CycApiException {
		final CycList assertions = this.getAllAssertionsInMt(mt);
		for (final Object assertion : assertions) {
			final CycList sentence = ((CycAssertion) assertion).getFormula();
			if (sentence.size() < 2) {
				continue;
			}
			if (!arg1.equals(sentence.second())) {
				continue;
			}
			if (predicate != null && !predicate.equals(sentence.first())) {
				continue;
			}
			final String command = "(cyc-unassert " + ((CycObject) assertion).stringApiValue() + this.makeELMt(mt).stringApiValue() + "))";
			this.converseVoid(command);
		}
	}

	public CycList getDenotsOfString(final String denotationString) throws UnknownHostException, IOException, CycApiException {
		return new CycList((Collection) NLFormat.getInstance(this).parseObjectsIntoCycObjects(denotationString));
	}

	public CycList getDenotsOfString(final String denotationString, final CycList collections) throws UnknownHostException, IOException, CycApiException {
		final CycList terms = this.getDenotsOfString(denotationString);
		final CycList result = new CycList();
		for (final Object oneCollection : collections) {
			for (final Object term : terms) {
				if (isa((CycObject) term, (CycFort) oneCollection)) {
					result.add((Object) term);
				}
			}
		}
		return result;
	}

	@Deprecated
	public CycList getMWSDenotsOfString(final CycList multiWordDenotationString) throws UnknownHostException, IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt("mws-denots-of-string", new Object[] { multiWordDenotationString });
		return this.converseList(command);
	}

	@Deprecated
	public CycList getMWSDenotsOfString(final CycList multiWordDenotationString, final CycList collections) throws UnknownHostException, IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt("mws-denots-of-string", new Object[] { multiWordDenotationString });
		final CycList terms = this.converseList(command);
		final CycList result = new CycList();
		for (final Object oneCollection : collections) {
			for (final Object term : terms) {
				if (this.isa((CycFort) term, (CycFort)oneCollection)) {
					result.add((Object) term);
				}
			}
		}
		return result;
	}

	public boolean isFunctionBound(final String symbolName) throws UnknownHostException, IOException, CycApiException {
		final CycSymbol cycSymbol = CycObjectFactory.makeCycSymbol(symbolName);
		return this.isFunctionBound(cycSymbol);
	}

	public boolean isFunctionBound(final CycSymbol cycSymbol) throws UnknownHostException, IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt("boolean", new Object[] { SubLAPIHelper.makeNestedSubLStmt("fboundp", new Object[0]), cycSymbol });
		return this.converseBoolean(command);
	}

	public Object getHLCycTerm(final String string) throws UnknownHostException, IOException, CycApiException {
		return this.converseObject("(canonicalize-term  '" + string + ")");
	}

	public Object getELCycTerm(final String string) throws UnknownHostException, IOException, CycApiException {
		return this.converseObject("(identity '" + string + ")");
	}

	@Deprecated
	public String getExternalIDString(final CycObject cycObject) throws UnknownHostException, IOException, CycApiException {
		return DefaultCycObject.toCompactExternalId((Object) cycObject, this);
	}

	public static boolean isPossibleExternalIDString(final Object obj) {
		return is64BitString(obj);
	}

	private static boolean is64BitString(final Object obj) {
		return obj instanceof String && is64Bit((String) obj);
	}

	private static boolean is64Bit(final String string) {
		final StringCharacterIterator i = new StringCharacterIterator(string);
		for (char c = i.first(); c != CharacterIterator.DONE; c = i.next()) {
			if (!is64Bit(c)) {
				return false;
			}
		}
		return true;
	}

	private static boolean is64Bit(final char c) {
		return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '+' || c == '/' || c == '-' || c == '_';
	}

	public CycConstant getRandomConstant() throws UnknownHostException, IOException, CycApiException {
		return (CycConstant) this.converseObject("(random-constant)");
	}

	public CycNart getRandomNart() throws UnknownHostException, IOException, CycApiException {
		return (CycNart) this.converseObject("(random-nart)");
	}

	public CycAssertion getRandomAssertion() throws UnknownHostException, IOException, CycApiException {
		return (CycAssertion) this.converseObject("(random-assertion)");
	}

	public CycList canonicalizeList(final CycList cycList) throws UnknownHostException, IOException, CycApiException {
		final CycList canonicalList = new CycList();
		for (final Object obj : cycList) {
			if (obj instanceof CycList) {
				canonicalList.add(this.getHLCycTerm(((CycList) obj).cyclify()));
			} else if (obj instanceof CycNart) {
				canonicalList.add(this.getHLCycTerm(((CycNart) obj).cyclify()));
			} else {
				canonicalList.add(obj);
			}
		}
		return canonicalList;
	}

	public Long getAssertionDate(final CycAssertion cycAssertion) throws UnknownHostException, IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt("asserted-when", new Object[] { cycAssertion });
		final Object date = this.converseObject(command);
		if (date instanceof Integer) {
			return (long) date;
		}
		if (date instanceof Long) {
			return (Long) date;
		}
		if (date.equals(CycObjectFactory.nil)) {
			return 0L;
		}
		throw new CycApiException("unexpected type of date returned " + date.toString());
	}

	public boolean isGafValidAssertion(final CycList gaf, final ELMt mt) throws UnknownHostException, IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt("find-gaf", new Object[] { gaf, mt });
		final Object response = this.converseObject(command);
		return !response.equals(CycObjectFactory.nil);
	}

	public boolean isGafValidAssertion(final CycFormulaSentence gaf, final ELMt mt) throws UnknownHostException, IOException, CycApiException {
		return this.isGafValidAssertion(gaf.getArgs(), mt);
	}

	public boolean isAssertionValid(final CycList hlFormula, final CycFort mt) throws UnknownHostException, IOException, CycApiException {
		final String command = SubLAPIHelper.makeSubLStmt("find-assertion", new Object[] { hlFormula, mt });
		final Object response = this.converseObject(command);
		return !response.equals(CycObjectFactory.nil);
	}

	public void assertTermDependsOn(final CycFort dependentTerm, final CycFort independentTerm, final CycFort mt) throws IOException, CycApiException {
		this.assertGaf((CycObject) mt, (CycDenotationalTerm) this.getKnownConstantByGuid("bdf02d74-9c29-11b1-9dad-c379636f7270"), (CycDenotationalTerm) dependentTerm, (CycDenotationalTerm) independentTerm);
	}

	public void assertDefiningMt(final CycFort dependentTerm, final CycFort mt) throws IOException, CycApiException {
		this.assertGaf((CycObject) CycAccess.baseKB, (CycDenotationalTerm) this.getKnownConstantByGuid("bde5ec9c-9c29-11b1-9dad-c379636f7270"), (CycDenotationalTerm) dependentTerm, (CycDenotationalTerm) mt);
	}

	public static String xmlDatetimeString(final CycList date) throws IOException, CycApiException {
		try {
			final CycNaut dateNaut = (CycNaut) CycNaut.convertIfPromising((Object) date);
			final Date javadate = DateConverter.parseCycDate(dateNaut, TimeZone.getDefault(), false);
			final int cycDatePrecision = DateConverter.getCycDatePrecision(dateNaut);
			if (cycDatePrecision > DateConverter.DAY_GRANULARITY) {
				return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(javadate);
			}
			return new SimpleDateFormat("yyyy-MM-dd").format(javadate);
		} catch (Exception e) {
			return null;
		}
	}

	public boolean hasValidLease() {
		boolean valid = false;
		for (final Map.Entry<String, CycLeaseManager> kv : this.cycConnection.getCycLeaseManagerMap().entrySet()) {
			if (kv.getValue().hasValidLease()) {
				valid = true;
			}
		}
		if (this.c != null) {
			for (final Map.Entry<InputStream, CycLeaseManager> kv2 : this.cycConnection.getCycLeaseManagerCommMap().entrySet()) {
				if (kv2.getValue().hasValidLease()) {
					valid = true;
				}
			}
		}
		return valid;
	}

	private void initializeQueryProperties() {
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":allowed-rules"), (Object) CycObjectFactory.makeCycSymbol(":all"));
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":result-uniqueness"), (Object) CycObjectFactory.makeCycSymbol(":bindings"));
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":allow-hl-predicate-transformation?"), (Object) false);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":allow-unbound-predicate-transformation?"), (Object) false);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":allow-evaluatable-predicate-transformation?"), (Object) false);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":intermediate-step-validation-level"), (Object) CycObjectFactory.makeCycSymbol(":all"));
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":negation-by-failure?"), (Object) false);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":allow-indeterminate-results?"), (Object) true);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":allow-abnormality-checking?"), (Object) true);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":disjunction-free-el-vars-policy"), (Object) CycObjectFactory.makeCycSymbol(":compute-intersection"));
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":allowed-modules"), (Object) CycObjectFactory.makeCycSymbol(":all"));
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":completeness-minimization-allowed?"), (Object) true);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":direction"), (Object) CycObjectFactory.makeCycSymbol(":backward"));
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":equality-reasoning-method"), (Object) CycObjectFactory.makeCycSymbol(":czer-equal"));
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":equality-reasoning-domain"), (Object) CycObjectFactory.makeCycSymbol(":all"));
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":max-problem-count"), (Object) 100000L);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":transformation-allowed?"), (Object) false);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":add-restriction-layer-of-indirection?"), (Object) true);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":evaluate-subl-allowed?"), (Object) true);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":rewrite-allowed?"), (Object) false);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":abduction-allowed?"), (Object) false);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":removal-backtracking-productivity-limit"), (Object) 2000000L);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":max-number"), (Object) null);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":max-time"), (Object) 120);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":max-transformation-depth"), (Object) 0);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":block?"), (Object) false);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":max-proof-depth"), (Object) null);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":cache-inference-results?"), (Object) false);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":answer-language"), (Object) CycObjectFactory.makeCycSymbol(":el"));
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":continuable?"), (Object) false);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":browsable?"), (Object) false);
		this.defaultQueryProperties.put(CycObjectFactory.makeCycSymbol(":productivity-limit"), (Object) 2000000L);
		final CycList<CycSymbol> queryPropertiesList = (CycList<CycSymbol>) new CycList((Collection) this.defaultQueryProperties.keySet());
		final String command = SubLAPIHelper.makeSubLStmt("mapcar", new Object[] { CycObjectFactory.makeCycSymbol("query-property-p"), queryPropertiesList });
		try {
			final CycList results = this.converseList(command);
			for (int i = 0, size = results.size(); i < size; ++i) {
				if (results.get(i).equals(CycObjectFactory.nil)) {
					final CycSymbol badProperty = (CycSymbol) queryPropertiesList.get(i);
					System.err.println(badProperty + " is not a query-property-p");
					this.defaultQueryProperties.remove(badProperty);
				}
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		this.queryPropertiesInitialized = true;
	}

	private void initializeQueryPropertiesNew() {
		synchronized (this.defaultQueryProperties) {
			this.defaultQueryProperties.clear();
			try {
				final InferenceParameterDescriptions desc = DefaultInferenceParameterDescriptions.loadInferenceParameterDescriptions(this, 10000L);
				final InferenceParameters defaults = desc.getDefaultInferenceParameters();
				final CycList allQueryProperties = this.converseList(SubLAPIHelper.makeSubLStmt("ALL-QUERY-PROPERTIES", new Object[0]));
				for (final Object property : allQueryProperties) {
					if (property instanceof CycSymbol && defaults.containsKey((CycSymbol) property)) {
						final Object value = defaults.get((CycSymbol) property);
						this.defaultQueryProperties.put((CycSymbol) property, value);
					}
				}
			} catch (UnknownHostException ex) {
				Logger.getLogger(CycAccess.class.getName()).log(Level.SEVERE, null, ex);
			} catch (IOException ex2) {
				Logger.getLogger(CycAccess.class.getName()).log(Level.SEVERE, null, ex2);
			} catch (CycApiException ex3) {
				Logger.getLogger(CycAccess.class.getName()).log(Level.SEVERE, null, (Throwable) ex3);
			}
		}
		this.queryPropertiesInitialized = true;
	}

	public InferenceParameters getHLQueryProperties() {
		synchronized (this.defaultQueryProperties) {
			if (!this.queryPropertiesInitialized) {
				this.initializeQueryProperties();
			}
			return (InferenceParameters) this.defaultQueryProperties.clone();
		}
	}

	public String queryPropertiesToString(final InferenceParameters queryProperties) {
		final InferenceParameters tempQueryProperties = (queryProperties == null) ? this.getHLQueryProperties() : queryProperties;
		final CycList parameterList = new CycList();
		for (final Map.Entry<CycSymbol, Object> mapEntry : tempQueryProperties.entrySet()) {
			final CycSymbol queryParameterKeyword = mapEntry.getKey();
			parameterList.add((Object) queryParameterKeyword);
			final Object rawValue = mapEntry.getValue();
			parameterList.add(tempQueryProperties.parameterValueCycListApiValue(queryParameterKeyword, rawValue));
		}
		return parameterList.stringApiValue();
	}

	public void initializeNamedInferenceProblemStore(final String name, final InferenceParameters queryProperties) throws IOException, CycApiException {
		if (name == null) {
			throw new NullPointerException("name must not be null");
		}
		if (name.length() == 0) {
			throw new IllegalArgumentException("name must not be an empty string");
		}
		final InferenceParameters tempQueryProperties = (queryProperties == null) ? this.getHLQueryProperties() : queryProperties;
		final String command = "(progn   (find-or-create-problem-store-by-name \"" + name + "\" (filter-plist " + this.queryPropertiesToString(tempQueryProperties) + "'problem-store-property-p)) " + "  nil)";
		this.converseVoid(command);
	}

	public void destroyInferenceProblemStoreByName(final String name) throws IOException, CycApiException {
		if (name == null) {
			throw new NullPointerException("name must not be null");
		}
		if (name.length() == 0) {
			throw new IllegalArgumentException("name must not be an empty string");
		}
		final String command = "(destroy-problem-store-by-name \"" + name + "\")";
		this.converseVoid(command);
	}

	public CycSentence getSimplifiedSentence(final CycFormulaSentence sentence) throws UnknownHostException, IOException {
		return sentence.getSimplifiedSentence(this);
	}

	public CycSentence getSimplifiedSentence(final CycFormulaSentence sentence, final ELMt mt) throws UnknownHostException, IOException {
		return sentence.getSimplifiedSentence(this, mt);
	}

	public boolean equalsEL(final Object obj1, final Object obj2) throws IOException {
		if (obj1 != null && obj1.equals(obj2)) {
			return true;
		}
		if (obj2 != null && obj2.equals(obj1)) {
			return true;
		}
		final String command = SubLAPIHelper.makeSubLStmt(CycAccess.EQUALS_EL, new Object[] { obj1, obj2 });
		final Object response = this.converseObject(command);
		return !response.equals(CycObjectFactory.nil);
	}

	public boolean queriesEqualAtEL(final Object obj1, final Object obj2) throws IOException {
		final String command = SubLAPIHelper.makeSubLStmt("queries-equal-at-el?", new Object[] { obj1, obj2 });
		final Object response = this.converseObject(command);
		return !response.equals(CycObjectFactory.nil);
	}

	static KBTransaction getCurrentTransaction() {
		return CycAccess.currentTransaction.get();
	}

	static void setCurrentTransaction(final KBTransaction transaction) {
		CycAccess.currentTransaction.set(transaction);
	}

	private final void commonInitialization() throws IOException, CycApiException {
		if (Log.current == null) {
			Log.makeLog("cyc-api.log");
		}
		if (this.areAPIRequestsLoggedToFile) {
			this.apiRequestLog = new FileWriter("api-requests.lisp");
		}
		CycAccess.cycAccessInstances.put(Thread.currentThread(), this);
		this.cycImageID = this.getCycImageID();
		try {
			DefaultInferenceParameterDescriptions.loadInferenceParameterDescriptions(this, 0L);
		} catch (Exception e) {
			final Logger logger = Logger.getLogger("org.opencyc.api.CycAccess");
			logger.log(Level.WARNING, "Could not load inference parameter descriptions.", e);
			for (Throwable curr = e; curr != null; curr = curr.getCause()) {
				logger.warning(curr.getLocalizedMessage());
			}
		}
	}

	public Object[] converseRaw(final Object command) throws UnknownHostException, IOException, CycApiException {
		return this.converse(command);
	}

	protected Object[] converse(final Object command) throws UnknownHostException, IOException, CycApiException {
		Object[] response = { null, null };
		this.maybeLogCommand(command);
		response = this.converseWithRetrying(command);
		this.previousAccessedMilliseconds = System.currentTimeMillis();
		this.maybeLogResponse(response);
		return response;
	}

	protected synchronized void reEstablishCycConnection() throws UnknownHostException, IOException, CycApiException {
		Log.current.println("Trying to re-establish a closed Cyc connection to " + this);
		this.previousAccessedMilliseconds = System.currentTimeMillis();
		this.cycConnection.close();
		if (this.c == null) {
			Log.current.println("Connect using host: " + this.hostName + " and port: " + this.port);
			this.cycConnection = (CycConnectionInterface) new CycConnection(this.hostName, this.port, this);
		} else {
			Log.current.println("Connect using comm object: " + this.c.toString());
			this.cycConnection = (CycConnectionInterface) new CycConnection(this.c, this);
			this.c.setCycConnection(this.cycConnection);
		}
		if (!this.cycImageID.equals(this.getCycImageID())) {
			Log.current.println("New Cyc image detected, resetting caches.");
			CycObjectFactory.resetCaches();
		}
	}

	public boolean getReestablishClosedConnections() {
		return this.reestablishClosedConnections;
	}

	public void setReestablishClosedConnections(final boolean value) {
		this.reestablishClosedConnections = value;
	}

	protected String withBookkeepingInfo() {
		String projectName = "nil";
		if (this.project != null) {
			projectName = this.project.stringApiValue();
		}
		String cyclistName = "nil";
		if (this.getCyclist() != null) {
			cyclistName = this.getCyclist().stringApiValue();
		}
		return "(with-bookkeeping-info (new-bookkeeping-info " + cyclistName + " (the-date) " + projectName + "(the-second)) ";
	}

	Object[] converseWithRetrying(final Object command) throws CycApiException, IOException {
		Object[] response = { null, null };
		try {
			response = this.doConverse(this.getCycConnection(), command);
		} catch (CycApiClosedConnectionException ex) {
			if (!this.getReestablishClosedConnections()) {
				throw ex;
			}
			this.reEstablishCycConnection();
			response = this.doConverse(this.cycConnection, command);
		}
		return response;
	}

	private void maybeReEstablishCycConnection() throws IOException, CycApiException {
		if (!this.isSOAPConnection && !((CycConnection) this.cycConnection).isValidBinaryConnection()) {
			Log.current.println("Re-establishing an invalid Cyc connection  to " + this);
			this.reEstablishCycConnection();
		}
	}

	private void maybeLogCommand(final Object command) throws CycApiException, IOException {
		if (this.trace > 0 || this.areAPIRequestsLoggedToFile) {
			final CycList commandCycList = (command instanceof CycList) ? ((CycList) command) : this.makeCycList((String) command);
			final String prettyCommandCycList = commandCycList.toPrettyCyclifiedString("");
			final String escapedCommandCycList = commandCycList.toPrettyEscapedCyclifiedString("");
			if (this.areAPIRequestsLoggedToFile) {
				this.apiRequestLog.write(escapedCommandCycList);
				this.apiRequestLog.write(10);
			}
			if (this.trace > 0) {
				Log.current.println(prettyCommandCycList + "\n--> cyc");
			}
		}
	}

	private void maybeLogResponse(final Object[] response) {
		if (this.trace > 0) {
			String responseString;
			if (response[1] instanceof CycList) {
				responseString = ((CycList) response[1]).toPrettyString("");
			} else if (response[1] instanceof CycFort) {
				responseString = ((CycFort) response[1]).cyclify();
			} else {
				responseString = response[1].toString();
			}
			Log.current.println("cyc --> " + responseString);
		}
	}

	private Object[] doConverse(final CycConnectionInterface cycConnection, final Object command) throws IOException {
		if (command instanceof SubLWorker) {
			cycConnection.converseBinary((SubLWorker) command);
			return null;
		}
		return cycConnection.converse(command);
	}

	private CycConstant makePrefetchedConstant(final String guidStr, final HashMap constantInfoDictionary) {
		final Guid guid = CycObjectFactory.makeGuid(guidStr);
		final CycConstant prefetchedConstant = makeConstantWithGuidName(guid, (String) constantInfoDictionary.get(guid));
		CycObjectFactory.addCycConstantCache(prefetchedConstant);
		return prefetchedConstant;
	}

	public static byte[] getCycInitializationRequest(final UUID uuid) {
		final CycList request = new CycList();
		request.add((Object) new CycSymbol("INITIALIZE-JAVA-API-PASSIVE-SOCKET"));
		request.add((Object) uuid.toString());
		final ByteArrayOutputStream baos = new ByteArrayOutputStream(2048);
		final CfaslOutputStream cfo = new CfaslOutputStream((OutputStream) baos);
		try {
			cfo.writeObject((Object) request);
			cfo.flush();
		} catch (IOException ex) {
		}
		return baos.toByteArray();
	}

	public static void handleCycInitializationRequestResponse(final InputStream is) throws IOException {
		final CfaslInputStream inboundStream = new CfaslInputStream(is);
		inboundStream.resetIsInvalidObject();
		final Object status = inboundStream.readObject();
		inboundStream.resetIsInvalidObject();
		final Object response = inboundStream.readObject();
	}

	public boolean termKnownToHavePrecachedFactSheet(final CycObject focalTerm) {
		return this.termsKnownToHavePrecachedFactSheets.contains(focalTerm);
	}

	public void noteTermHasPrecachedFactSheet(final CycObject focalTerm) {
		this.termsKnownToHavePrecachedFactSheets.add(focalTerm);
	}

	static {
		CYC_QUERY = CycObjectFactory.makeCycSymbol("cyc-query");
		EL_WFF = CycObjectFactory.makeCycSymbol("el-wff?");
		EQUALS_EL = CycObjectFactory.makeCycSymbol("equals-el?");
		FPRED_VALUE_IN_MT = CycObjectFactory.makeCycSymbol("fpred-value-in-mt");
		SOME_PRED_VALUE_IN_ANY_MT = CycObjectFactory.makeCycSymbol("some-pred-value-in-any-mt");
		SOME_PRED_VALUE_IN_RELEVANT_MTS = CycObjectFactory.makeCycSymbol("some-pred-value-in-relevant-mts");
		WITH_ALL_MTS = CycObjectFactory.makeCycSymbol("with-all-mts");
		cycAccessInstances = new HashMap<Thread, CycAccess>();
		CycAccess.sharedCycAccessInstance = null;
		baseKB = (ELMt) ELMtConstant.makeELMtConstant(new CycConstant("BaseKB", new Guid("bd588111-9c29-11b1-9dad-c379636f7270")));
		isa = new CycConstant("isa", new Guid("bd588104-9c29-11b1-9dad-c379636f7270"));
		genls = new CycConstant("genls", new Guid("bd58810e-9c29-11b1-9dad-c379636f7270"));
		genlMt = new CycConstant("genlMt", new Guid("bd5880e5-9c29-11b1-9dad-c379636f7270"));
		comment = new CycConstant("comment", new Guid("bd588109-9c29-11b1-9dad-c379636f7270"));
		collection = new CycConstant("Collection", new Guid("bd5880cc-9c29-11b1-9dad-c379636f7270"));
		binaryPredicate = new CycConstant("BinaryPredicate", new Guid("bd588102-9c29-11b1-9dad-c379636f7270"));
		elementOf = new CycConstant("elementOf", new Guid("c0659a2b-9c29-11b1-9dad-c379636f7270"));
		numericallyEqual = new CycConstant("numericallyEquals", new Guid("bd589d90-9c29-11b1-9dad-c379636f7270"));
		trueConst = new CycConstant("True", new Guid("bd5880d9-9c29-11b1-9dad-c379636f7270"));
		falseConst = new CycConstant("False", new Guid("bd5880d8-9c29-11b1-9dad-c379636f7270"));
		not = new CycConstant("not", new Guid("bd5880fb-9c29-11b1-9dad-c379636f7270"));
		and = new CycConstant("and", new Guid("bd5880f9-9c29-11b1-9dad-c379636f7270"));
		or = new CycConstant("or", new Guid("bd5880fa-9c29-11b1-9dad-c379636f7270"));
		xorConst = new CycConstant("xor", new Guid("bde7f9f2-9c29-11b1-9dad-c379636f7270"));
		equivConst = new CycConstant("equiv", new Guid("bda887b6-9c29-11b1-9dad-c379636f7270"));
		impliesConst = new CycConstant("implies", new Guid("bd5880f8-9c29-11b1-9dad-c379636f7270"));
		forAllConst = new CycConstant("forAll", new Guid("bd5880f7-9c29-11b1-9dad-c379636f7270"));
		thereExistsConst = new CycConstant("thereExists", new Guid("bd5880f6-9c29-11b1-9dad-c379636f7270"));
		thereExistExactlyConst = new CycConstant("thereExistExactly", new Guid("c10ae7b8-9c29-11b1-9dad-c379636f7270"));
		thereExistAtMostConst = new CycConstant("thereExistAtMost", new Guid("c10af932-9c29-11b1-9dad-c379636f7270"));
		thereExistAtLeastConst = new CycConstant("thereExistAtLeast", new Guid("c10af5e7-9c29-11b1-9dad-c379636f7270"));
		expandSubLFnConst = new CycConstant("ExpandSubLFn", new Guid("c0b2bc13-9c29-11b1-9dad-c379636f7270"));
		sublQuoteFnConst = new CycConstant("SubLQuoteFn", new Guid("94f07021-8b0d-11d7-8701-0002b3a8515d"));
		plusFn = new CycConstant("PlusFn", new Guid("bd5880ae-9c29-11b1-9dad-c379636f7270"));
		different = new CycConstant("different", new Guid("bd63f343-9c29-11b1-9dad-c379636f7270"));
		thing = new CycConstant("Thing", new Guid("bd5880f4-9c29-11b1-9dad-c379636f7270"));
		mtSpace = new CycConstant("MtSpace", new Guid("abb96eb5-e798-11d6-8ac9-0002b3a333c3"));
		currentWorldDataMt = (ELMt) ELMtConstant.makeELMtConstant(new CycConstant("CurrentWorldDataCollectorMt-NonHomocentric", new Guid("bf192b1e-9c29-11b1-9dad-c379636f7270")));
		inferencePSC = (ELMt) ELMtConstant.makeELMtConstant(new CycConstant("InferencePSC", new Guid("bd58915a-9c29-11b1-9dad-c379636f7270")));
		anytimePSC = (ELMt) ELMtConstant.makeELMtConstant(new CycConstant("AnytimePSC", new Guid("28392742-b00f-41d8-98de-8399027785de")));
		everythingPSC = (ELMt) ELMtConstant.makeELMtConstant(new CycConstant("EverythingPSC", new Guid("be7f041b-9c29-11b1-9dad-c379636f7270")));
		universalVocabularyMt = (ELMt) ELMtConstant.makeELMtConstant(new CycConstant("UniversalVocabularyMt", new Guid("dff4a041-4da2-11d6-82c0-0002b34c7c9f")));
		bookkeepingMt = (ELMt) ELMtConstant.makeELMtConstant(new CycConstant("BookkeepingMt", new Guid("beaed5bd-9c29-11b1-9dad-c379636f7270")));
		CYC_IMAGE_ID_EXPRESSION = SubLAPIHelper.makeSubLStmt("cyc-image-id", new Object[0]);
		CycAccess.currentCyc = new ThreadLocal<CycAccess>() {
			@Override
			protected CycAccess initialValue() {
				return null;
			}
		};
		CycAccess.currentCyclist = new ThreadLocal<CycFort>() {
			@Override
			protected CycFort initialValue() {
				return null;
			}
		};
		CycAccess.currentTransaction = new ThreadLocal<KBTransaction>() {
			@Override
			protected KBTransaction initialValue() {
				return null;
			}
		};
		CycAccess.currentCycAccesses = Collections.synchronizedMap(new HashMap<String, CycAccess>());
	}

	public static class ConverseException extends CycApiException {
		private ConverseException(final Object command, final CycAccess cyc, final Object[] response) {
			super(response[1].toString() + "\nrequest " + (cyc.hasStaticCycServer() ? ("to " + cyc.getHostName() + ":" + cyc.getBasePort()) : "") + " : " + makeRequestString(command));
			if (response[1] instanceof CycApiException) {
				this.initCause((Throwable) response[1]);
			}
		}

		private static String makeRequestString(final Object command) {
			if (command instanceof CycList) {
				return ((CycList) command).cyclify();
			}
			return command.toString();
		}
	}
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 2260 ms
	
	Decompiled with Procyon 0.5.32.
*/