package  com.cyc.baseclient.xml;

import  java.io.PrintStream;
import  java.io.PrintWriter;


/**
 * Implements an XMLPrintWriter with facilities for surrounding data
 * elements with tags appropriately named and indented.<p>
 *
 * @version $Id: XMLPrintWriter.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Stefano Bertolo
 */
public class XMLPrintWriter extends XMLWriter {
    /**
     * The <code>PrintWriter</code> to which the actual printing is delegated.
     */
    PrintWriter writer;

    /**
     * Constructs an XMLPrintWriter object given a PrintStream.
     *
     * @param printStream the PrintStream on which XML is output
     */
    public XMLPrintWriter (java.io.PrintStream printStream) {
        writer = new PrintWriter(printStream, true);
    }

    /**
     * Prints a string to the <code>PrintWriter</code> stored in the field @see #writer indenting it
     * by the number of spaces indicated by @see #indent either relative to the
     * current indentation level (if @see #relative is <code>true</code>) or with
     * respect to the beginning of the line (if @see #relative is <code>false</code>).
     *
     * @param string the string to be printed.
     * @param indent the number of spaces by which the string needs to be indented.
     * @param relative id <code>true</code> the string is further indented with respect
     * to the current indentation level, if <code>false</code> is indented with respect to
     * the beginning of the line.
     */
    public void indentPrint (String string, int indent, boolean relative) {
        this.setIndent(indent, relative);
        writer.print(indentString + string);
    }


    /**
     * Prints a string to the <code>PrintWriter</code> stored in the field @see #writer.
     *
     * @param string the string to be printed.
     */
    public void print (String string) {
        writer.print(string);
    }

    /**
     * Flushes the <code>PrintWriter</code> in the field @see #writer.
     */
    public void flush () {
        writer.flush();
    }

  /**
   * Closes the <code>PrintWriter</code> in the field @see #writer.
   */
  public void close () {
    writer.close();
  }
}







