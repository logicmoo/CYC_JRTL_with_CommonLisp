package com.cyc.baseclient.cycobject;

//import java.awt.Image;
import com.cyc.base.cycobject.InformationSource;
import com.cyc.base.CycAccess;
import com.cyc.base.CycConnectionException;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.api.SubLAPIHelper;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.base.cycobject.CycObject;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.baseclient.cycobject.CycGuid;

/**
 * A class for representing sources of information denoted by Cyc FORTs.
 *
 * @author baxter
 */
public class CycInformationSource implements InformationSource {

  public CycInformationSource(final DenotationalTerm term, final URL iconURL,
          final String citationString) {
    this.term = term;
    this.iconURL = iconURL;
    this.citationString = citationString;
  }

  public CycInformationSource(DenotationalTerm sourceTerm,
          CycAccess cycAccess) throws CycConnectionException {
    this.term = sourceTerm;
    this.iconURL = getIconURLForSource(sourceTerm, cycAccess);
    this.citationString = CycCitationGenerator.DEFAULT.getCitationStringForSource(
            sourceTerm, cycAccess);
  }

  public CycInformationSource(DenotationalTerm sourceTerm,
          CitationGenerator citationGenerator,
          CycAccess cycAccess) throws CycConnectionException {
    this.term = sourceTerm;
    this.iconURL = getIconURLForSource(sourceTerm, cycAccess);
    this.citationString = citationGenerator.getCitationStringForSource(
            sourceTerm, cycAccess);
  }

  /**
   * Returns a graphical representation of this source.
   *
   * @return a graphical representation of this source.
   */
  /*
  public Image getIcon() {
    return icon;
  }
  */
  
  @Override
  public URL getIconURL() {
    return iconURL;
  }

  /**
   *
   * @return the CycL term representing this source.
   */
  @Override
  public DenotationalTerm getCycL() {
    return term;
  }

  /**
   * Returns a string suitable for citing this source.
   *
   * @return a string suitable for citing this source.
   */
  @Override
  public String getCitationString() {
    return citationString;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final CycInformationSource other = (CycInformationSource) obj;
    if (this.term != other.term && (this.term == null || !this.term.equals(
            other.term))) {
      return false;
    }
    /*
    if (this.icon != other.icon && (this.icon == null || !this.icon.equals(
            other.icon))) {
      return false;
    }
    */
    if (this.iconURL != other.iconURL && (this.iconURL == null || !this.iconURL.equals(
            other.iconURL))) {
      return false;
    }
    if ((this.citationString == null) ? (other.citationString != null) : !this.citationString.equals(
            other.citationString)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 29 * hash + (this.term != null ? this.term.hashCode() : 0);
    //hash = 29 * hash + (this.icon != null ? this.icon.hashCode() : 0);
    hash = 29 * hash + (this.iconURL != null ? this.iconURL.hashCode() : 0);
    hash = 29 * hash + (this.citationString != null ? this.citationString.hashCode() : 0);
    return hash;
  }

  private URL getIconURLForSource(DenotationalTerm source,
          CycAccess cycAccess) {
    try {
      final String pathCommand = SubLAPIHelper.makeSubLStmt(
              "icon-path-for-source", source);
      final Object iconURLObj = cycAccess.converse().converseObject(pathCommand);
      if (iconURLObj instanceof String) {
        return new URL((String) iconURLObj);
      }
    } catch (Exception e) {
      System.err.println(
              "Couldn't load source icon for " + source + " from " + iconURL);
      e.printStackTrace(System.err);
    }
    return null;
  }
  
  /**
   * Ask Cyc for an image for the icon to use for the specified source.
   *
   * @param source
   * @param cycAccess
   * @return
   */
  /*
  private static Image getIconForSource(DenotationalTerm source,
          CycAccess cycAccess) {
    Image icon = null;
    String iconURL = null;
    try {
      final String pathCommand = SubLAPIHelper.makeSubLStmt(
              "icon-path-for-source", source);
      final Object iconURLObj = cycAccess.converseObject(pathCommand);
      if (iconURLObj instanceof String) {
        iconURL = (String) iconURLObj;
      }
      icon = ImageIO.read(new URL(iconURL));
    } catch (Exception e) {
      System.err.println(
              "Couldn't load source icon for " + source + " from " + iconURL);
      e.printStackTrace(System.err);
    }
    return icon;
  }
  */

  /**
   * A helper class to generate citation strings for sources.
   */
  public static class CycCitationGenerator implements CitationGenerator {

    CycObject style = ANY;
    CycObject markupLanguage = new CycConstant("HypertextMarkupLanguage",
            new CycGuid("bd656e90-9c29-11b1-9dad-c379636f7270"));
    /**
     * A singleton citation generator with default settings.
     */
    public static final CitationGenerator DEFAULT = new CycCitationGenerator();

    /**
     * Make a new citation generator with the specified style and markup language.
     *
     * @param style an instance of #$PublicationStyleSpecification.
     * @param markupLanguage an instance of #$MarkupLanguage.
     */
    public CycCitationGenerator(DenotationalTerm style,
            DenotationalTerm markupLanguage) {
      this.style = style;
      this.markupLanguage = markupLanguage;
    }

    /**
     * Make a new citation generator with the specified style and default markup
     * language (HTML).
     *
     * @param style an instance of #$PublicationStyleSpecification.
     */
    public CycCitationGenerator(DenotationalTerm style) {
      this.style = style;
    }

    /**
     * Make a new citation generator with any style and default markup language
     * (HTML).
     *
     */
    public CycCitationGenerator() {
    }

    /**
     * Ask Cyc for an image for the citation string to use for the specified source.
     *
     * @param source
     * @param cycAccess
     * @return
     */
    @Override
    public String getCitationStringForSource(DenotationalTerm source,
            CycAccess cycAccess) throws CycConnectionException {
      final String command = SubLAPIHelper.makeSubLStmt(
              "source-citation-string", source, style, markupLanguage);
      return cycAccess.converse().converseString(command);
    }
  }
  private final DenotationalTerm term;
//  private Image icon = null;
  private URL iconURL = null;
  private String citationString = null;
  private static final CycSymbol ANY = CycObjectFactory.makeCycSymbol(":ANY");
}
