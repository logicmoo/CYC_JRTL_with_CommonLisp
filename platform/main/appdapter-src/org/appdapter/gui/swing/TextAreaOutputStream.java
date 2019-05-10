

package org.appdapter.gui.swing;

import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JTextArea;

public class TextAreaOutputStream extends OutputStream {
  private JTextArea area;

  public TextAreaOutputStream(JTextArea textArea) {
    setTextArea(textArea);
  }

  public TextAreaOutputStream() {
    this(null);
  }

  public void setTextArea(JTextArea area) {
    this.area = area;
  }

  public JTextArea getTextArea() {
    return area;
  }


  @Override
public void write(int b) throws IOException {
    if (area != null)
      area.append(new String(new byte[] {(byte) b}));
  }

  @Override
public void write(byte b[]) throws IOException {
    if (area != null)
      area.append(new String(b));
  }

  @Override
public void write(byte b[], int off, int len) throws IOException {
    if (area != null) {
      byte b2[] = new byte[len];
      System.arraycopy(b, off, b2, 0, len);
      write(b2);
    }
  }

  @Override
public void flush() throws IOException {
  }

  @Override
public void close() throws IOException {
    setTextArea(null);
  }
}
