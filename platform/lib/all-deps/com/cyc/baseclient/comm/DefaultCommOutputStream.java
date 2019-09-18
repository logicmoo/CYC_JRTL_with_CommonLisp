/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.baseclient.comm;

import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author vijay
 */
public class DefaultCommOutputStream  implements CommOutputStream {

  private OutputStream os;
  
  public DefaultCommOutputStream(OutputStream os) {
    this.os = os;
  }
  
  @Override
  public void write(int b) throws IOException {
    os.write(b);
  }

  @Override
  public void write(byte[] b) throws IOException {
    os.write(b);
  }

  @Override
  public void write(byte[] b, int off, int len) throws IOException {
    os.write(b, off, len);
  }

  @Override
  public void flush() throws IOException {
    os.flush();
  }

  @Override
  public void close() throws IOException {
    os.close();
  }
  
}
