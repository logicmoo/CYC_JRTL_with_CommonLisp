package com.cyc.kb;

import java.util.List;

import com.cyc.kb.exception.KBApiException;

public interface TypeFact extends Fact {

  public <O> O getTypeArgument(int getPos, Class<O> retType)
      throws KBApiException;

  public List<Object> getModifiedTypeLevelArguments();

  public void setModifiedTypeLevelArguments(
      List<Object> modifiedTypeLevelArguments);

  public void addModifiedTypeLevelArguments(Object modifiedTypeLevelArgument);

}