package com.cyc.webservice.client.api.url;

public enum TermCompleteReturnAttribute {
  NL("nl"),
  CYCL("cycl"),
  HL_ID("hl_id"),
  DISAMBIG_STRING("disambig_string");
  
  private final String value;
  
  TermCompleteReturnAttribute(String value) {
    this.value = value;
  }
  @Override
  public String toString() {
    return ":" + value.replace("_", "-");
  }
  public static TermCompleteReturnAttribute fromString(String string) {
    if ((string != null) && string.startsWith(":")) {
      return TermCompleteReturnAttribute.valueOf(string.substring(1).replace("-", "_").toUpperCase());
    }
    return null;
  }
}