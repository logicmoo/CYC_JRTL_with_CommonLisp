package com.cyc.kb;

import java.util.Collection;

import com.cyc.kb.config.KBAPIDefaultContext;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.KBTypeException;
import com.cyc.kb.exception.VariableArityException;

public interface Relation extends KBIndividual {

  /**
   * gets the
   * <code>KBCollection</code>s that all arguments in position
   * <code>argPos</code> of the relation most be instances of, as viewed
   * from the default context {@link KBAPIDefaultContext#forQuery()}.
   * 
   * The returned collection could be empty.
   * <p>
   *
   * @param argPos  the relevant argument position of the relation
   *
   * @return the constraining getArgIsa <code>KBCollection</code>s
   */
  public Collection<KBCollection> getArgIsa(int argPos);

  /**
   * gets the
   * <code>KBCollection</code>s that all arguments in position
   * <code>argPos</code> of the relation most be instances of, as viewed
   * from the context <code>ctx</code>.
   * <p>
   *
   * @param argPos  the relevant argument position of the relation
   * @param ctxStr  the string representing the context of the query
   *
   * @return the constraining getArgIsa <code>KBCollection</code>s
   */
  public Collection<KBCollection> getArgIsa(int argPos, String ctxStr);

  /**
   * gets the
   * <code>KBCollection</code>s that all arguments in position
   * <code>argPos</code> of the relation most be instances of, as viewed
   * from the context <code>ctx</code>.
   * <p>
   *
   * @param argPos  the relevant argument position of the relation
   * @param ctx the context of the query
   *
   * @return the constraining getArgIsa <code>KBCollection</code>s
   */
  public Collection<KBCollection> getArgIsa(int argPos, Context ctx);

  /**
   * creates a new Fact stating that any object in the
   * <code>argPos</code> position of <code>this<code> relation should be an instance of 
   * the Collection <code>col</code>, in the context <code>ctx</code>.
   * <p>
   * A formula satisfying these rules will be semantically well formed.
   *
   * @param argPos  the argument position for the argIsa constraint
   * @param colStr the string representing the collection for the new argIsa
   * constraint
   * @param ctxStr  the string representing the context where the constraint is to
   * be stated
   * 
   * @return this
   *
   * @throws CreateException 
   * @throws KBTypeException 
   */
  public Relation addArgIsa(int argPos, String colStr, String ctxStr)
      throws KBTypeException, CreateException;

  /**
   * creates a new Fact stating that any object in the
   * <code>argPos</code> position of <code>this<code> relation should be an instance of 
   * the Collection <code>col</code>, in the context <code>ctx</code>.
   * <p>
   * A formula satisfying these rules will be semantically well formed.
   *
   * @param argPos  the argument position for the new argIsa constraint
   * @param col  the collection for the new argIsa constraint
   * @param ctx the context where the constraint is to be stated
   *
   * @return this
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   */
  public Relation addArgIsa(int argPos, KBCollection col, Context ctx)
      throws KBTypeException, CreateException;

  /**
   * gets the
   * <code>KBCollection</code>s that all arguments in position
   * <code>argPos</code> of the relation must be specializations of, as viewed
   * from the default context specified by {@link KBAPIDefaultContext#forQuery()}.
   * <p>
   *
   * @param argPos  the argument position of the relation
   *
   * @return the relevant argGenl constraints on <code>this</code> at
   * position <code>argPos</code>
   */
  public Collection<KBCollection> getArgGenl(int argPos);

  /**
   * gets the
   * <code>KBCollection</code>s that all arguments in position
   * <code>argPos</code> of the relation must be specializations of, as viewed
   * from the context <code>ctx</code>.
   * <p>
   * 
   * @param argPos  the argument position of the relation
   * @param ctxStr  the string representing the context of query
   *
   * @return the relevant argGenl constraints on <code>this</code> at
   * position <code>argPos</code>
   */
  public Collection<KBCollection> getArgGenl(int argPos, String ctxStr);

  /**
   * gets the
   * <code>KBCollection</code>s that all arguments in position
   * <code>argPos</code> of the relation must be specializations of, as viewed
   * from the context 
   * <code>ctx</code>
   * <p>
   *
   * @param argPos  the argument position of the relation
   * @param ctx the context of query
   *
   * @return the relevant argGenl constraints on <code>this</code> at
   * position <code>argPos</code>
   */
  public Collection<KBCollection> getArgGenl(int argPos, Context ctx);

  /**
   * creates a new Fact stating that
   * <code>col</code> must be a generalization of any object in the
   * <code>argPos</code> position of <code>this<code> relation, in the context <code>ctx</code>.
   * <p>
   * A formula satisfying these rules will be semantically well formed.
   * 
   * @param argPos  the position where instance of c fits
   * @param colStr the string representing the collection which is a generalization of objects that fit in
   * argPos
   * @param ctxStr  the string representing the context where the fact is asserted
   * 
   * @return this
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   */
  public Relation addArgGenl(int argPos, String colStr, String ctxStr)
      throws KBTypeException, CreateException;

  /**
   * creates a new Fact stating that
   * <code>col</code> must be a generalization of any object in the
   * <code>argPos</code> position of <code>this<code> relation, in the context.
   * <p>
   * A formula satisfying these rules will be semantically well formed.
   *
   * @param argPos  the relevant argument position
   * @param col  the collection which is a generalization of objects that fit in
   * argPos
   * @param ctx     the context where the fact is asserted
   * 
   * @return this
   *
   * @throws CreateException 
   * @throws KBTypeException 
   */
  public Relation addArgGenl(int argPos, KBCollection col, Context ctx)
      throws KBTypeException, CreateException;

  /**
   * Return the number of arguments required for <code>this</code> relation. See
   * {@link #getArityMin()} and {@link #getArityMax()} for arity information of
   * variable arity relations.
   *
   * @return the number of arguments required for <code>this</code> relation
   * 
   * @throws VariableArityException for relations that have more than one
   * possible arity value (i.e. for instances of #$VariableArityRelation).
   */
  public Integer getArity() throws VariableArityException;

  /**
   * find the minimum number of arguments required for the relation
   * <code>this</code>. Note that except for the case of variable-arity
   * relations, this method will return the same number as both
   * {@link #getArity()} and {@link #getArityMax()}.
   *
   * @return the minimum number of arguments allowed for <code>this</code> relation
   */
  public Integer getArityMin();

  /**
   * find the maximum number of arguments required for the relation
   * <code>this</code>. Note that except for the case of variable-arity
   * relations, this method will return the same number as both
   * {@link #getArity()} and {@link #getArityMin()}.
   *
   * @return the maximum number of arguments allowed for <code>this</code> relation
   */
  public Integer getArityMax();

  /**
   * Set the arity for a Cyc relation. If the relation has an arity value
   * already that is different from
   * <code>arityValue</code>, an exception will be thrown.
   *
   * @param arityValue the number of arguments <code>this<code> relation takes
   * 
   * @return this 
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   */
  public Relation setArity(int arityValue) throws KBTypeException,
      CreateException;

}