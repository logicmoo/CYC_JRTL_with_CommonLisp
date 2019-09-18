package com.cyc.cat.common.url;

import java.util.ArrayList;
import java.util.List;

/**
 * This represents the path component of a URI
 * per http://tools.ietf.org/html/rfc3986#section-3.3
 * @author nwinant
 */
public class URLPath {
  
  public URLPath(URLPath parent, String segment) {
    this.parent = parent;
    if (segment.startsWith(SEPARATOR)) {
      this.segment = segment.substring(SEPARATOR.length());
    } else {
      this.segment = segment;
    }
  }
  
  public URLPath(String local) {
    this(null, local);
  }
  
  
  // Static
  
  public static URLPath fromString(String string) {
    final String[] tokens;
    if (string.startsWith(SEPARATOR)) {
      tokens = string.substring(SEPARATOR.length()).split(SEPARATOR);
    } else {
      tokens = string.split(SEPARATOR);
    }
    URLPath curr = null;
    for (int i=0; i < tokens.length; i++) {
      curr = new URLPath(curr, tokens[i]);
    }
    return curr;
  }
  
  
  // Public
  
  public List<URLPath> getHierarchy() {
    List<URLPath> path = new ArrayList<URLPath>();
    if (getParent() != null) {
      path.addAll(getParent().getHierarchy());
    }
    path.add(this);
    return path;
  }
  
  public List<String> getSegments() {
    List<String> segments = new ArrayList<String>();
    final List<URLPath> hierarchy = this.getHierarchy();
    for (URLPath path : hierarchy) {
      segments.add(path.getLastSegment());
    }
    return segments;
  }
  
  public URLPath getParent() { 
    return this.parent; 
  }
  
  public String getLastSegment() {
    return this.segment;
  }
  
  public String getFullPath() {
    String path = "";
    if (getParent() != null) {
      path = getParent().getFullPath();
    }
    return path + SEPARATOR + getLastSegment();
  }
  
  @Override
  public String toString() {
    return getFullPath(); 
  }
  
  @Override
  public boolean equals(Object o) {
    if ((o != null) && (o instanceof URLPath)) {
      return this.hashCode() == o.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 89 * hash + (this.parent != null ? this.parent.hashCode() : 0);
    hash = 89 * hash + (this.segment != null ? this.segment.hashCode() : 0);
    return hash;
  }
  
  
  // Internal
  
  static final String SEPARATOR = "/";
  final URLPath parent;
  final String segment;
}