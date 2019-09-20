package org.opencyc.cycobject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.opencyc.xml.XMLWriter;
import org.opencyc.xml.XMLStringWriter;
import org.opencyc.api.SubLAPIHelper;
import java.io.IOException;
import java.net.UnknownHostException;
import org.opencyc.api.CycApiException;
import org.opencyc.api.CycAccess;
import java.util.Iterator;
import java.util.Collections;
import org.opencyc.api.CycObjectFactory;

public class CycAssertion extends DefaultCycObject {
	public static final String cycAssertionXMLTag = "assertion";
	public static int indentLength;
	private static final CycSymbol ASSERTION_EL_FORMULA;
	private final CycList<CycFormulaSentence> negLits;
	private final CycList<CycFormulaSentence> posLits;
	private final CycList<CycList<CycFormulaSentence>> hlFormula;
	private CycObject mt;
	private boolean isInvalid;

	private CycAssertion() {
		this.negLits = (CycList<CycFormulaSentence>) new CycList();
		this.posLits = (CycList<CycFormulaSentence>) new CycList();
		this.hlFormula = (CycList<CycList<CycFormulaSentence>>) new CycList((Object) this.negLits, (Object) this.posLits);
		this.isInvalid = false;
	}

	public CycAssertion(final CycList hlFormula, final CycObject mt) {
		this.negLits = (CycList<CycFormulaSentence>) new CycList();
		this.posLits = (CycList<CycFormulaSentence>) new CycList();
		this.hlFormula = (CycList<CycList<CycFormulaSentence>>) new CycList((Object) this.negLits, (Object) this.posLits);
		this.isInvalid = false;
		assert hlFormula != null : "hlFormula cannot be null";
		assert hlFormula.size() == 2 : "hlFormula must be a doubleton";
		assert mt != null : "mt cannot be null";
		Object newNegLits = hlFormula.get(0);
		if (CycObjectFactory.nil.equals(newNegLits)) {
			newNegLits = Collections.emptyList();
		}
		assert newNegLits instanceof Iterable : "hlFormula must contain lists of literals";
		for (final Object lit : (Iterable) newNegLits) {
			if (lit instanceof CycFormulaSentence) {
				this.negLits.add((CycFormulaSentence) lit);
			} else {
				this.negLits.add((CycFormulaSentence) new CycFormulaSentence((Iterable) lit));
			}
		}
		Object newPosLits = hlFormula.get(1);
		if (CycObjectFactory.nil.equals(newPosLits)) {
			newPosLits = Collections.emptyList();
		}
		assert newPosLits instanceof Iterable : "hlFormula must contain lists of literals";
		for (final Object lit : (Iterable) newPosLits) {
			if (lit instanceof CycFormulaSentence) {
				this.posLits.add((CycFormulaSentence) lit);
			} else {
				this.posLits.add((CycFormulaSentence) new CycFormulaSentence((Iterable) lit));
			}
		}
		this.mt = mt;
	}

	public CycAssertion(final CycFormulaSentence posLit, final CycObject mt) {
		this.negLits = (CycList<CycFormulaSentence>) new CycList();
		this.posLits = (CycList<CycFormulaSentence>) new CycList();
		this.hlFormula = (CycList<CycList<CycFormulaSentence>>) new CycList((Object) this.negLits, (Object) this.posLits);
		this.isInvalid = false;
		assert mt != null : "mt cannot be null";
		this.posLits.add((CycFormulaSentence) posLit);
		this.mt = mt;
	}

	public static CycAssertion makeInvalidAssertion() {
		final CycAssertion cycAssertion = new CycAssertion();
		cycAssertion.isInvalid = true;
		return cycAssertion;
	}

	public boolean equals(final Object object) {
		if (!(object instanceof CycAssertion)) {
			return false;
		}
		final CycAssertion that = (CycAssertion) object;
		return (this.isInvalid && that.isInvalid) || (this.mt.equals(that.mt) && this.hlFormula.equals((Object) that.hlFormula));
	}

	public int hashCode() {
		int hash = 7;
		hash = 41 * hash + ((this.hlFormula != null) ? this.hlFormula.hashCode() : 0);
		hash = 41 * hash + ((this.mt != null) ? this.mt.hashCode() : 0);
		hash = 41 * hash + (this.isInvalid ? 1 : 0);
		return hash;
	}

	public String toString() {
		if (this.isInvalid) {
			return "INVALID-ASSERTION";
		}
		return this.hlFormula.cyclify();
	}

	public String cyclifyWithEscapeChars() {
		if (this.isInvalid) {
			return "INVALID-ASSERTION";
		}
		return this.hlFormula.cyclifyWithEscapeChars();
	}

	public String stringApiValue() {
		if (this.isInvalid) {
			return "INVALID-ASSERTION";
		}
		return "(find-assertion " + this.hlFormula.stringApiValue() + " " + this.mt.stringApiValue() + ")";
	}

	public Object cycListApiValue() {
		return this;
	}

	public CycObject getArg0(final CycAccess cycAccess) throws CycApiException, UnknownHostException, IOException {
		if (this.isGaf()) {
			return (CycObject) this.getGaf().getArg0();
		}
		return (CycObject) this.getELFormula(cycAccess).getArg0();
	}

	public Object getArg(final int argNum, final CycAccess cycAccess) throws CycApiException, UnknownHostException, IOException {
		if (this.isGaf()) {
			return this.getGaf().getArg(argNum);
		}
		return this.getELFormula(cycAccess).getArg(argNum);
	}

	public CycFormulaSentence getELFormula(final CycAccess access) throws CycApiException, IOException, UnknownHostException {
		if (this.isGaf()) {
			return this.getGaf();
		}
		return this.getFormulaFromCyc(access);
	}

	public CycList getFormula() {
		return this.hlFormula;
	}

	private CycFormulaSentence getFormulaFromCyc(final CycAccess access) throws CycApiException, IOException, UnknownHostException {
		final String command = SubLAPIHelper.makeSubLStmt(CycAssertion.ASSERTION_EL_FORMULA, new Object[] { this });
		return access.converseSentence((Object) command);
	}

	public CycFormulaSentence getGaf() {
		if (!this.isGaf()) {
			return null;
		}
		assert !this.hlFormula.isEmpty() : "hlFormula cannot be empty";
		assert this.negLits.isEmpty() : this.hlFormula.cyclify() + " negativeLiterals must be nil";
		if (this.posLits.size() == 1) {
			return (CycFormulaSentence) this.posLits.first();
		}
		return null;
	}

	public CycFormulaSentence getGaf(final CycAccess cycAccess) {
		return this.getGaf();
	}

	public boolean isGaf() {
		return this.negLits.isEmpty() && this.posLits.size() == 1 && this.noVars(this.posLits.first());
	}

	private boolean noVars(final Object term) {
		if (term instanceof CycVariable) {
			return false;
		}
		if (term instanceof CycList) {
			for (final Object arg : (CycList) term) {
				if (!this.noVars(arg)) {
					return false;
				}
			}
			return true;
		}
		return true;
	}

	public CycObject getMt() {
		return this.mt;
	}

	public String toXMLString() throws IOException {
		final XMLStringWriter xmlStringWriter = new XMLStringWriter();
		this.toXML((XMLWriter) xmlStringWriter, 0, false);
		return xmlStringWriter.toString();
	}

	public void toXML(final XMLWriter xmlWriter, final int indent, final boolean relative) throws IOException {
		xmlWriter.printXMLStartTag("assertion", indent, relative, true);
		this.hlFormula.toXML(xmlWriter, indent, relative);
		this.mt.toXML(xmlWriter, indent, relative);
		xmlWriter.printXMLEndTag("assertion", indent, relative);
	}

	public List getReferencedConstants() {
		List result = null;
		if (this.getFormula() != null) {
			result = DefaultCycObject.getReferencedConstants((Object) this.getFormula());
			if (this.getMt() != null) {
				result.addAll(this.getMt().getReferencedConstants());
			}
			return result;
		}
		if (this.getMt() != null) {
			result = DefaultCycObject.getReferencedConstants((Object) this.getMt());
		}
		return (result == null) ? new ArrayList() : result;
	}

	public int compareTo(final Object o) {
		if (!(o instanceof CycAssertion)) {
			return this.toString().compareTo(o.toString());
		}
		final CycAssertion cao = (CycAssertion) o;
		final int ret = this.getMt().compareTo((Object) cao.getMt());
		if (ret != 0) {
			return ret;
		}
		return this.getFormula().compareTo((Object) cao.getFormula());
	}

	static {
		CycAssertion.indentLength = 2;
		ASSERTION_EL_FORMULA = CycObjectFactory.makeCycSymbol("assertion-el-formula");
	}
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 122 ms
	
	Decompiled with Procyon 0.5.32.
*/