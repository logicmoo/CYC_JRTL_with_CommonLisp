package com.cyc.baseclient.api;

import com.cyc.base.CycApiException;

public class CycApiClosedConnectionException extends CycApiException {

  public CycApiClosedConnectionException(String s) {
    super(s);
  }
}
