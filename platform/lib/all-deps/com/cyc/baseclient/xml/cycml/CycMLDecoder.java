/*
 * Support for decoding CycML-encoded objects
 */
package com.cyc.baseclient.xml.cycml;

import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycFormulaSentence;
import com.cyc.baseclient.cycobject.CycNart;
import com.cyc.baseclient.cycobject.CycNaut;
import static com.cyc.baseclient.xml.cycml.Constants.CYCML_NAMESPACE;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.validation.SchemaFactory;
import com.cyc.baseclient.xml.cycml.And;
import com.cyc.baseclient.xml.cycml.Constant;
import com.cyc.baseclient.xml.cycml.Equiv;
import com.cyc.baseclient.xml.cycml.ForAll;
import com.cyc.baseclient.xml.cycml.Function;
import com.cyc.baseclient.xml.cycml.Implies;
import com.cyc.baseclient.xml.cycml.Not;
import com.cyc.baseclient.xml.cycml.Or;
import com.cyc.baseclient.xml.cycml.Predicate;
import com.cyc.baseclient.xml.cycml.Sentence;
import com.cyc.baseclient.xml.cycml.Symbol;
import com.cyc.baseclient.xml.cycml.ThereExistAtLeast;
import com.cyc.baseclient.xml.cycml.ThereExistAtMost;
import com.cyc.baseclient.xml.cycml.ThereExistExactly;
import com.cyc.baseclient.xml.cycml.ThereExists;
import com.cyc.baseclient.xml.cycml.Variable;
import com.cyc.baseclient.xml.cycml.Xor;

/**
 *
 * @author baxter
 */
public class CycMLDecoder {

  private final javax.xml.bind.Unmarshaller unmarshaller;
  public static final String XSD_URI = com.cyc.baseclient.xml.Constants.XSD_HOME + "/cycml.xsd";
  final private boolean shouldValidate = true;

  public CycMLDecoder() throws JAXBException {
    this.unmarshaller = JAXBContext.newInstance(
            this.getClass().getPackage().getName()).createUnmarshaller();
    if (shouldValidate) {
      try {
        unmarshaller.setSchema(SchemaFactory.newInstance(
                XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema(
                new URL(XSD_URI)));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * Read and decode a CycML-encoded object from a string
   *
   * @param xml
   * @return
   * @throws JAXBException
   */
  public Object decode(final java.lang.String xml) throws JAXBException {
    return decode(new ByteArrayInputStream(xml.getBytes()));
  }

  /**
   * Read and decode a CycML-encoded object from a stream
   *
   * @param stream
   * @return
   * @throws JAXBException
   */
  public Object decode(final InputStream stream) throws JAXBException {
    return translateObject(unmarshaller.unmarshal(stream));
  }

  /**
   * Translate a JAXB content tree into a standard OpenCyc-friendly object
   *
   * @param contentTree
   * @return
   */
  public static Object translateObject(final Object contentTree) {
    if (contentTree instanceof Constant) {
      return translateConstant((Constant) contentTree);
    } else if (contentTree instanceof Sentence) {
      return translateSentence((Sentence) contentTree);
    } else if (contentTree instanceof Function) {
      return translateFunction((Function) contentTree);
    } else if (contentTree instanceof Predicate) {
      return translatePredicate((Predicate) contentTree);
    } else if (contentTree instanceof Symbol) {
      return translateSymbol((Symbol) contentTree);
    } else if (contentTree instanceof Variable) {
      return translateVariable((Variable) contentTree);
    } else if (contentTree instanceof And) {
      return translateAnd((And) contentTree);
    } else if (contentTree instanceof Equiv) {
      return translateEquiv((Equiv) contentTree);
    } else if (contentTree instanceof ForAll) {
      return translateForAll((ForAll) contentTree);
    } else if (contentTree instanceof ThereExists) {
      return translateThereExists((ThereExists) contentTree);
    } else if (contentTree instanceof ThereExistExactly) {
      return translateThereExistExactly((ThereExistExactly) contentTree);
    } else if (contentTree instanceof ThereExistAtLeast) {
      return translateThereExistAtLeast((ThereExistAtLeast) contentTree);
    } else if (contentTree instanceof ThereExistAtMost) {
      return translateThereExistAtMost((ThereExistAtMost) contentTree);
    } else if (contentTree instanceof Implies) {
      return translateImplies((Implies) contentTree);
    } else if (contentTree instanceof Not) {
      return translateNot((Not) contentTree);
    } else if (contentTree instanceof Or) {
      return translateOr((Or) contentTree);
    } else if (contentTree instanceof Xor) {
      return translateXor((Xor) contentTree);
    } else if (contentTree instanceof JAXBElement) {
      final JAXBElement elt = (JAXBElement) contentTree;
      final QName eltQname = elt.getName();
      if (!CYCML_NAMESPACE.equals(eltQname.getNamespaceURI())) {
        throw new IllegalArgumentException("Can't translate content with namespace " + eltQname.getNamespaceURI()
                + " wanted " + CYCML_NAMESPACE);
      }
      final String localPart = eltQname.getLocalPart();
      if (localPart.equals("string")) {
        return elt.getValue();
      } else if (localPart.equals("number")) {
        try {
          return NumberFormat.getInstance().parse((String) elt.getValue());
        } catch (ParseException ex) {
          throw new IllegalArgumentException(
                  "Can't parse " + elt.getValue() + " as a number", ex);
        }
      } else {
        throw new IllegalArgumentException(
                "Can't translate " + localPart + " primitive.");
      }
    } else {
      throw new IllegalArgumentException(
              "Can't translate content tree of class " + contentTree.getClass().getSimpleName());
    }
  }

  private static com.cyc.base.cycobject.CycConstantI translateConstant(Constant constant) {
    return new CycConstant(constant.getName(),
            new com.cyc.base.cycobject.Guid(constant.getGuid()));
  }

  private static List<Object> translateTerms(final List<? extends Object> fields) throws IllegalArgumentException {
    final List<Object> terms = new ArrayList<Object>(fields.size());
    for (final Object field : fields) {
      terms.add(translateObject(field));
    }
    return terms;
  }

  private static com.cyc.base.cycobject.FormulaSentence translateSentence(Sentence sentence) {
    final List<Object> terms = sentence.getSentenceOrAndOrOr();
    if (terms.get(0) instanceof Predicate) {
      return new CycFormulaSentence(translateTerms(terms));
    } else {
      assert (terms.size() == 1);
      return (CycFormulaSentence) translateObject(terms.get(0));
    }
  }

  private static com.cyc.base.cycobject.CycObject translatePredicate(Predicate predicate) {
    if (predicate.getConstant() != null) {
      return translateConstant(predicate.getConstant());
    } else if (predicate.getFunction() != null) {
      return translateFunction(predicate.getFunction());
    } else if (predicate.getSymbol() != null) {
      return translateSymbol(predicate.getSymbol());
    } else if (predicate.getVariable() != null) {
      return translateVariable(predicate.getVariable());
    } else {
      throw new IllegalArgumentException();
    }
  }

  private static com.cyc.base.cycobject.CycVariableI translateVariable(Variable variable) {
    return CycObjectFactory.makeCycVariable(variable.getContent());
  }

  private static com.cyc.base.cycobject.CycSymbolI translateSymbol(Symbol symbol) {
    return CycObjectFactory.makeCycSymbol(symbol.getPackage(), symbol.getName());
  }

  private static com.cyc.base.cycobject.NonAtomicTerm translateFunction(Function function) {
    final List<Object> fields = function.getNumberOrFunctionOrConstant();
    final CycNaut naut = new CycNaut(translateTerms(fields));
    if (function.isReified()) {
      return new CycNart(naut);
    } else {
      return naut;
    }
  }

  private static com.cyc.base.cycobject.FormulaSentence translateAnd(And and) {
    final List<Object> terms = translateTerms(and.getSentence());
    terms.add(0, translateConstant(and.getConstant()));
    return new CycFormulaSentence(terms);
  }

  private static com.cyc.base.cycobject.FormulaSentence translateForAll(ForAll forAll) {
    final List<? extends Object> terms = Arrays.asList(
            translateConstant(forAll.getConstant()),
            translateVariable(forAll.getVariable()),
            translateSentence(forAll.getSentence()));
    return new CycFormulaSentence(terms);
  }

  private static com.cyc.base.cycobject.FormulaSentence translateThereExists(ThereExists thereExists) {
    final List<? extends Object> terms = Arrays.asList(
            translateConstant(thereExists.getConstant()),
            translateVariable(thereExists.getVariable()),
            translateSentence(thereExists.getSentence()));
    return new CycFormulaSentence(terms);
  }

  private static com.cyc.base.cycobject.FormulaSentence translateEquiv(Equiv equiv) {
    final List<Object> terms = translateTerms(equiv.getContent());
    return new CycFormulaSentence(terms);
  }

  private static com.cyc.base.cycobject.FormulaSentence translateThereExistExactly(
          ThereExistExactly thereExistExactly) {
    return new CycFormulaSentence(translateTerms(thereExistExactly.getContent()));
  }

  private static com.cyc.base.cycobject.FormulaSentence translateThereExistAtLeast(
          ThereExistAtLeast thereExistAtLeast) {
    return new CycFormulaSentence(translateTerms(thereExistAtLeast.getContent()));
  }

  private static com.cyc.base.cycobject.FormulaSentence translateThereExistAtMost(
          ThereExistAtMost thereExistAtMost) {
    return new CycFormulaSentence(translateTerms(thereExistAtMost.getContent()));
  }

  private static Object translateImplies(Implies implies) {
    final List<Object> terms = translateTerms(implies.getContent());
    return new CycFormulaSentence(terms);
  }

  private static Object translateNot(Not not) {
    final List<? extends Object> terms = Arrays.asList(
            translateConstant(not.getConstant()),
            translateSentence(not.getSentence()));
    return new CycFormulaSentence(terms);
  }

  private static Object translateOr(Or or) {
    final List<Object> terms = translateTerms(or.getSentence());
    terms.add(0, translateConstant(or.getConstant()));
    return new CycFormulaSentence(terms);

  }

  private static Object translateXor(Xor xor) {
    final List<Object> terms = translateTerms(xor.getContent());
    return new CycFormulaSentence(terms);
  }
}