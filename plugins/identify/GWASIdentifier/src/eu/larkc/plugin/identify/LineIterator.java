package eu.larkc.plugin.identify;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LineIterator implements Iterator<String> {

  private BufferedReader in = null;

  private String cachedLine = null;

  private boolean finished = false;

  public LineIterator(URL url) throws IOException {
    in = new BufferedReader(new InputStreamReader(url.openStream()));
  }

  public boolean hasNext() {
    if(cachedLine != null) {
      return true;
    } else if(finished) {
      return false;
    } else {
      try {
        while(true) {
          String line = in.readLine();
          if(line == null) {
            finished = true;
            return false;
          } else {
            cachedLine = line;
            return true;
          }
        }
      } catch(IOException ioe) {
        finished = true;
        try {
          in.close();
        } catch(IOException ioe2) {
          // ignore this for now
        }
        cachedLine = null;
        throw new IllegalStateException(ioe);
      }
    }
  }

  public String next() {
    if(!hasNext()) { throw new NoSuchElementException("No more lines"); }
    String currentLine = cachedLine;
    cachedLine = null;
    return currentLine;
  }

  public void remove() {
    throw new UnsupportedOperationException("remove not supported");
  }

  @Override
  public void finalize() throws Throwable {
    if(in != null) in.close();
  }

  public static void main(String args[]) throws Exception {
    LineIterator it = new LineIterator((new File(args[0])).toURI().toURL());
    
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}
