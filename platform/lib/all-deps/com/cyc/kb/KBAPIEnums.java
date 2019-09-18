package com.cyc.kb;

public class KBAPIEnums {
  /**
   * The type of lookup to be performed in the KB.
   * 
   * {@link LookupType#FIND} requests the API to only attempt to find the underlying KB object
   * {@link LookupType#FIND_OR_CREATE} requests the API to either find the underlying KB object
   * or create one based on the input 
   */
  public enum LookupType {
    FIND, FIND_OR_CREATE
  };

  
  /**
   * Direction determines the time when inference is performed for the given assertion.
   * :FORWARD triggers inference at the assert time. :BACKWARD defers the inference
   * until ask time.
   *   
   * If set to Direction.AUTO, Facts will be asserted :FORWARD, Rules will be asserted
   * :BACKWARD and Assertions will be asserted :FORWARD.
   */
  public enum Direction {
    FORWARD,
    BACKWARD,
    AUTO, // choose a valid direction based on the type of assertion 
    // :code is a valid direction in SubL but we will not expose it in the API
    // CODE, 
  }
  
  /** 
   * Strength is a component of the truth value. It can be :DEFAULT or :MONOTONIC.
   * A :MONOTONIC assertion is true under all conditions and a :DEFAULT assertion is
   * true but subject to exceptions. 
   * Most rules will be "DEFAULT" true.
   * 
   * If set to Strength.AUTO, all types of assertions will be asserted with :DEFAULT
   * strength. 
   */
  public enum Strength {
    MONOTONIC, // True always and under all conditions
    DEFAULT,   // Assumed true, but subject to exceptions
    AUTO,
  }
}
