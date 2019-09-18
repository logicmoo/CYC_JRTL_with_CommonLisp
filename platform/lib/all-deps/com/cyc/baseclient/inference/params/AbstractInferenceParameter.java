package com.cyc.baseclient.inference.params;

//// External Imports
import com.cyc.base.cycobject.Fort;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.base.inference.InferenceParameterValueDescription;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Map;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.cycobject.CycSymbol;


/**
 * <P>AbstractInferenceParameter is designed to...
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author zelal
 * @date August 9, 2005, 8:49 PM
 * @version $Id: AbstractInferenceParameter.java 150771 2014-04-25 22:35:15Z nwinant $
 */
public abstract class AbstractInferenceParameter implements InferenceParameter {

  //// Constructors
  /** Creates a new instance of AbstractInferenceParameter.
   * @param propertyMap a map of inference parameters to their values.
   */
  public AbstractInferenceParameter(Map<CycSymbolI, Object> propertyMap) {
    if (propertyMap == null) {
      throw new RuntimeException("Got null parameter map");
    }
    if (propertyMap.size() < REQUIRED_SYMBOLS.length) {
      throw new RuntimeException("Got too few symbols in map");
    }
    for (final CycSymbolI property : REQUIRED_SYMBOLS) {
      if (!propertyMap.containsKey(property)) {
        throw new RuntimeException("Expected key not found in map "
                + property + " for inference Parameter " + propertyMap.get(ID_SYMBOL));
      }
    }
    Object nameObj = verifyObjectType(propertyMap, NAME_SYMBOL, CycSymbolI.class);
    Object idObj = verifyObjectType(propertyMap, ID_SYMBOL, Fort.class);
    Object shortDescObj = verifyObjectType(propertyMap, SHORT_DESC_SYMBOL, String.class);
    Object longDescObj = verifyObjectType(propertyMap, LONG_DESC_SYMBOL, String.class);
    Object queryStaticParamObj = verifyObjectType(propertyMap, QUERY_STATIC_PARAMETER_SYMBOL, CycSymbolI.class);
    Object basicParamObj = verifyObjectType(propertyMap, BASIC_PARAMETER_SYMBOL, CycSymbolI.class);
    Object alternateValueObj = propertyMap.get(ALTERNATE_VALUE_SYMBOL);
    if (!(alternateValueObj instanceof CycList)) {
      if (alternateValueObj.equals(CycObjectFactory.nil)) {
        alternateValueObj = null;
      } else {
        throw new RuntimeException("Expected a CycList or nil; got " + alternateValueObj);
      }
    }
    init(propertyMap.get(DEFAULT_VALUE_SYMBOL),
            (CycSymbolI) nameObj,
            (Fort) idObj,
            (String) shortDescObj,
            (String) longDescObj,
            (CycSymbolI) basicParamObj,
            (CycSymbolI) queryStaticParamObj,
            (CycList) alternateValueObj);
  }

  protected AbstractInferenceParameter(Object defaultValue, CycSymbolI keyword,
          Fort id, String shortDescription, String longDescription,
          CycSymbolI isBasicParameter, CycSymbolI isQueryStaticParameter, CycList alternateValue) {
    init(defaultValue, keyword, id, shortDescription, longDescription, isBasicParameter,
            isQueryStaticParameter, alternateValue);
  }

  //// Public Area
  @Override
  public Object getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(final Object value) {
    defaultValue = value;
  }

  @Override
  public Object canonicalizeValue(Object value) {
    return value;
  }

  @Override
  public CycSymbolI getKeyword() {
    return keyword;
  }

  @Override
  public Fort getId() {
    return id;
  }

  @Override
  public String getLongDescription() {
    return longDescription;
  }

  @Override
  public String getShortDescription() {
    return shortDescription;
  }

  @Override
  public String getPrettyRepresentation(Object value) {
    if (getAlternateValue() != null && isAlternateValue(value)) {
      return getAlternateValue().getShortDescription();
    } else if (value instanceof Integer) {
      return NumberFormat.getInstance().format(value);
    } else if (value instanceof Number) {
      final NumberFormat nf = NumberFormat.getInstance();
      if (nf instanceof DecimalFormat) {
        ((DecimalFormat) nf).setMinimumFractionDigits(1);
      }
      return nf.format(value);
    } else if (value == null) {
      return "None";
    } else if (value instanceof CycSymbolI && ((CycSymbolI) value).toCanonicalString().equals(":ALL")) {
      return "All";
    } else if (value instanceof CycSymbolI && ((CycSymbolI) value).toCanonicalString().equals(":NONE")) {
      return "None";
    } else {
      return value.toString();
    }
  }

  @Override
  public boolean isBasicParameter() {
    return isBasicParameter;
  }

  @Override
  public boolean isQueryStaticParameter() {
    return isQueryStaticParameter;
  }

  @Override
  public InferenceParameterValueDescription getAlternateValue() {
    return alternateValue;
  }

  @Override
  public abstract boolean isValidValue(Object potentialValue);

  @Override
  public boolean isAlternateValue(Object value) {
    if (alternateValue == null) {
      return false;
    } else if (alternateValue.getValue() == null) {
      return value == null;
    } else {
      return alternateValue.getValue().equals(value);
    }
  }

  @Override
  public String toString() {
    String str = getKeyword().toString()
            + " shortDescription=\"" + getShortDescription() + "\""
            + " type=" + getClass().getName().replaceAll("^org\\.opencyc\\.inference\\.", "")
            + " isBasicParameter=" + isBasicParameter()
            + " isQueryStaticParameter=" + isQueryStaticParameter()
            + " defaultValue=" + getDefaultValue();
    if (getAlternateValue() != null) {
      str += " alternateValue=" + getAlternateValue();
    }
    return str;
  }

  //// Protected Area
  //// Private Area
  private void init(Object defaultValue, CycSymbolI keyword,
          Fort id, String shortDescription, String longDescription,
          CycSymbolI isBasicParameter, CycSymbolI isQueryStaticParameter, CycList alternateValue) {
    this.defaultValue = canonicalizeValue(defaultValue);
    this.keyword = keyword;
    this.id = id;
    this.longDescription = longDescription;
    this.shortDescription = shortDescription;
    if (alternateValue != null) {
      this.alternateValue =
              new DefaultInferenceParameterValueDescription(DefaultInferenceParameterDescriptions.parsePropertyList(alternateValue));
      this.alternateValue.setValue(canonicalizeValue(this.alternateValue.getValue()));
    }

    if (CycObjectFactory.t.equals(isBasicParameter)) {
      this.isBasicParameter = true;
    } else if (CycObjectFactory.nil.equals(isBasicParameter)) {
      this.isBasicParameter = false;
    } else {
      throw new RuntimeException("Got unexpected boolean value " + isBasicParameter);
    }

    if (CycObjectFactory.t.equals(isQueryStaticParameter)) {
      this.isQueryStaticParameter = true;
    } else if (CycObjectFactory.nil.equals(isQueryStaticParameter)) {
      this.isQueryStaticParameter = false;
    } else {
      throw new RuntimeException("Got unexpected boolean value " + isQueryStaticParameter);
    }
  }

  private Object verifyObjectType(Map<CycSymbolI, Object> propertyMap, CycSymbolI symbol, Class aClass) {
    return DefaultInferenceParameterValueDescription.verifyObjectType(propertyMap, symbol, aClass);
  }
  //// Internal Rep
  private Object defaultValue;
  private CycSymbolI keyword;
  private Fort id;
  private String shortDescription;
  private String longDescription;
  private boolean isBasicParameter;
  private boolean isQueryStaticParameter;
  private InferenceParameterValueDescription alternateValue = null;
  private final static CycSymbolI DEFAULT_VALUE_SYMBOL = new CycSymbol(":DEFAULT-VALUE");
  final static CycSymbolI NAME_SYMBOL = new CycSymbol(":NAME");
  final static CycSymbolI ID_SYMBOL = new CycSymbol(":ID");
  final static CycSymbolI SHORT_DESC_SYMBOL = new CycSymbol(":SHORT-DESC");
  final static CycSymbolI LONG_DESC_SYMBOL = new CycSymbol(":LONG-DESC");
  private final static CycSymbolI BASIC_PARAMETER_SYMBOL = new CycSymbol(":BASIC?");
  private final static CycSymbolI QUERY_STATIC_PARAMETER_SYMBOL = new CycSymbol(":QUERY-STATIC?");
  private final static CycSymbolI ALTERNATE_VALUE_SYMBOL = new CycSymbol(":ALTERNATE-VALUE");
  private final static CycSymbolI[] REQUIRED_SYMBOLS = {DEFAULT_VALUE_SYMBOL,
    NAME_SYMBOL, ID_SYMBOL, SHORT_DESC_SYMBOL, LONG_DESC_SYMBOL,
    BASIC_PARAMETER_SYMBOL, QUERY_STATIC_PARAMETER_SYMBOL, ALTERNATE_VALUE_SYMBOL};

  //// Main
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  }
}
