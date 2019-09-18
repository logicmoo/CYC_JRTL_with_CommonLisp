package  com.cyc.baseclient.xml;

import  java.io.FileWriter;


/**
 * Implements an XMLFileWriter with facilities for surrounding data
 * elements with tags appropriately named and indented.<p>
 *
 * @version $Id: XMLFileWriter.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Stefano Bertolo
 */
public class XMLFileWriter extends XMLWriter {
    /**
     * The <code>FileWriter</code> to which the actual printing is delegated.
     */
    FileWriter writer;

    /**
     * Constructs a XMLFileWriter object given an output file name
     *
     * @param outputFile the output file name
     */
    public XMLFileWriter (String outputFile) throws java.io.IOException
    {
        writer = new FileWriter(outputFile);
    }

    /**
     * Prints a string to the <code>FileWriter</code> stored in the field @see #writer indenting it
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
    public void indentPrint (String string, int indent, boolean relative) throws java.io.IOException {
        this.setIndent(indent, relative);
        String newString = this.indentString + string;
        int newStringLength = newString.length();
        writer.write(newString, 0, newStringLength);
    }

    /**
     * Prints a string to the <code>FileWriter</code> stored in the field @see #writer.
     *
     * @param string the string to be printed.
     */
    public void print (String string) throws java.io.IOException {
        writer.write(string, 0, string.length());
    }

    /**
     * Flushes the <code>FileWriter</code> in the field @see #writer.
     */
    public void flush () throws java.io.IOException {
        writer.flush();
    }

  /**
   * Closes the <code>FileWriter</code> in the field @see #writer.
   */
  public void close() throws java.io.IOException {
    writer.close();
  }

}



