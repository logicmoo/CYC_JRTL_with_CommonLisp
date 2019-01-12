/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opencyc.comm;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author vijay
 */
public class DefaultCommInputStream extends CommInputStream {

  private InputStream is;

  public DefaultCommInputStream(InputStream is) {
    this.is = is;
  }
    
  @Override
  public int read() throws IOException {
    return is.read();
  }

  @Override
  public int read(byte[] b) throws IOException {
    return is.read(b);
  }

  @Override
  public int read(byte[] b, int off, int len) throws IOException {
    return is.read(b, off, len);
  }

  @Override
  public long skip(long n) throws IOException {
    return is.skip(n);
  }

  @Override
  public int available() throws IOException {
    return is.available();
  }

  @Override
  public void close() throws IOException {
    is.close();
  }

  @Override
  public void mark(int readlimit) {
    is.mark(readlimit);
  }

  @Override
  public void reset() throws IOException {
    is.reset();
  }

  @Override
  public boolean markSupported() {
    return is.markSupported();
  }

  
}
