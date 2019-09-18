package com.cyc.webservice.client.api.url;

import com.cyc.cat.common.url.URLString;

public  class TermCompleteParam extends URLString.Parameter {
  
  public TermCompleteParam(TermCompleteParam.Name name, String value) {
    super(name.toString(), value);
  }
  
  
  // Inner classes
  
  public static enum Name {
    FILTER("filter"),
    MT("mt"),
    CONSTRAININGSENTENCE("constrainingSentence");
    
    private final String value;
    
    Name(String value) {
      this.value = value;
    }
    @Override
    public String toString() {
      return value;
    }
  }
  
}