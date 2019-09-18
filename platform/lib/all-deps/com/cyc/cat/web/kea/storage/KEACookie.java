/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.cat.web.kea.storage;

/**
 *
 * @author nwinant
 */
abstract public class KEACookie {
  
  protected KEACookie(String name, String value) {
    this.name = name;
    setValue(value);
  }
  
  
  // Public
  
  public String getName() {
    return name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
    parseStringValue(value);
  }
  
  @Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + (null == name ? 0 : name.hashCode());
		hash = 31 * hash + (null == value ? 0 : value.hashCode());
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (obj.getClass() != this.getClass())) {
			return false;
		}
		return hashCode() == ((KEACookie) obj).hashCode();
	}
  
  
  // Protected
  
  protected void parseStringValue(String value) {}
  
  /*
  protected void copyCookieAttributes(Cookie cookie) {
    this.setComment(cookie.getComment());
    this.setDomain(cookie.getDomain());
    this.setHttpOnly(cookie.isHttpOnly());
    this.setMaxAge(cookie.getMaxAge());
    this.setPath(cookie.getPath());
    this.setSecure(cookie.getSecure());
    //this.setValue(cookie.getValue());
    //this.setVersion(cookie.getVersion());
  }
  */
  
  
  // Internal
  
  private final String name;
  private String value;
}
