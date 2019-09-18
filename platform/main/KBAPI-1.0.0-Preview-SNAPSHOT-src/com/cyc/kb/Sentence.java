package com.cyc.kb;

import java.util.List;

import com.cyc.kb.exception.KBApiException;

public interface Sentence extends KBObject {

  /**
   * NOT PART OF KB API 1.0
   */
  public Assertion assertIn(Context ctx) throws KBApiException;

  /**
   * NOT PART OF KB API 1.0
   */
  public List<Object> getArguments();

  /**
   * NOT PART OF KB API 1.0
   */
  public void setArguments(List<Object> arguments);

  /**
   * NOT PART OF KB API 1.0
   */
  public void addArguments(Object arguments);

}