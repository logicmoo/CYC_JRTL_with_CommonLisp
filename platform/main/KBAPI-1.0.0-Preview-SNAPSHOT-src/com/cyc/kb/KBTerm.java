package com.cyc.kb;


public interface KBTerm extends KBObject {

  /**
   * Determine whether <code>this</code> is provably not an instance of
   * <code>col</code>. This means that there is no way to convert
   * <code>this</code> into an instance of
   * <code>col</code> without editing or removing current KB assertions.
   *
   * @param col the collection which <code>this</code> is to be tested
   * against
   * @param ctx the context in which the semantic test should be performed
   * 
   * @return whether <code>this</code> is provably not an instance of <code>col</code>
   */
  public boolean provablyNotInstanceOf(KBCollection col, Context ctx);

  /**
   * Determine whether
   * <code>this</code> is provably not an instance of
   * <code>col</code>. This means that there is no way to convert
   * <code>this</code> into an instance of the collection without editing or
   * removing current KB assertions.
   *
   * @param colStr the string representing the collection    
   * which <code>this</code> is to be tested against
   * @param ctxStr the context in which the semantic test should be performed
   * 
   * @return whether <code>this</code> is provably not an instance <code>col</code>
   */
  public boolean provablyNotInstanceOf(String colStr, String ctxStr);

}