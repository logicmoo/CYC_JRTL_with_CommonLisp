package org.opencyc.cycobject;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import org.opencyc.api.CycAccess;
import org.opencyc.api.CycObjectFactory;
import org.opencyc.api.SubLAPIHelper;

/**
 * A class for representing sources of information denoted by Cyc FORTs.
 *
 * @author baxter
 */
public class CycInformationSource {

  public CycInformationSource(final CycDenotationalTerm term, final Image icon,
          final String citationString) {
    this.term = term;
    this.icon = icon;
    this.citationString = citationString;
  }

  public CycInformationSource(CycDenotationalTerm sourceTerm,
          CycAccess cycAccess) throws IOException {
    this.term = sourceTerm;
    this.icon = getIconForSource(sourceTerm, cycAccess);
    this.citationString = CitationGenerator.DEFAULT.getCitationStringForSource(
            sourceTerm, cycAccess);
  }

  public CycInformationSource(CycDenotationalTerm sourceTerm,
          CitationGenerator citationGenerator,
          CycAccess cycAccess) throws IOException {
    this.term = sourceTerm;
    this.icon = getIconForSource(sourceTerm, cycAccess);
    this.citationString = citationGenerator.getCitationStringForSource(
            sourceTerm, cycAccess);
  }

  /**
   * Returns a graphical representation of this source.
   *
   * @return a graphical representation of this source.
   */
  public Image getIcon() {
    return icon;
  }

  /**
   *
   * @return the CycL term representing this source.
   */
  public CycDenotationalTerm getCycL() {
    return term;
  }

  /**
   * Returns a string suitable for citing this source.
   *
   * @return a string suitable for citing this source.
   */
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
    if (this.icon != other.icon && (this.icon == null || !this.icon.equals(
            other.icon))) {
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
    hash = 29 * hash + (this.icon != null ? this.icon.hashCode() : 0);
    hash = 29 * hash + (this.citationString != null ? this.citationString.hashCode() : 0);
    return hash;
  }

  /**
   * Ask Cyc for an image for the icon to use for the specified source.
   *
   * @param source
   * @param cycAccess
   * @return
   */
  private static Image getIconForSource(CycDenotationalTerm source,
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

  /**
   * A helper class to generate citation strings for sources.
   */
  public static class CitationGenerator {

    CycObject style = ANY;
    CycObject markupLanguage = new CycConstant("HypertextMarkupLanguage",
            new Guid("bd656e90-9c29-11b1-9dad-c379636f7270"));
    /**
     * A singleton citation generator with default settings.
     */
    public static final CitationGenerator DEFAULT = new CitationGenerator();

    /**
     * Make a new citation generator with the specified style and markup language.
     *
     * @param style an instance of #$PublicationStyleSpecification.
     * @param markupLanguage an instance of #$MarkupLanguage.
     */
    public CitationGenerator(CycDenotationalTerm style,
            CycDenotationalTerm markupLanguage) {
      this.style = style;
      this.markupLanguage = markupLanguage;
    }

    /**
     * Make a new citation generator with the specified style and default markup
     * language (HTML).
     *
     * @param style an instance of #$PublicationStyleSpecification.
     */
    public CitationGenerator(CycDenotationalTerm style) {
      this.style = style;
    }

    /**
     * Make a new citation generator with any style and default markup language
     * (HTML).
     *
     */
    public CitationGenerator() {
    }

    /**
     * Ask Cyc for an image for the citation string to use for the specified source.
     *
     * @param source
     * @param cycAccess
     * @return
     */
    public String getCitationStringForSource(CycDenotationalTerm source,
            CycAccess cycAccess) throws IOException {
      final String command = SubLAPIHelper.makeSubLStmt(
              "source-citation-string", source, style, markupLanguage);
      return cycAccess.converseString(command);
    }
  }
  private final CycDenotationalTerm term;
  private Image icon = null;
  private String citationString = null;
  private static final CycSymbol ANY = CycObjectFactory.makeCycSymbol(":ANY");
}
