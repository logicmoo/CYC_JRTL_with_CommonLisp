/**
 *
 */
package eu.larkc.core.data;


/**
 * A plain text document, with text embedded (no caching or remote storage).
 */
public class PlainTextDocument implements NaturalLanguageDocument {

	/**
	 * Constructor.
	 * @param text The plain text associated with this object.
	 */
	public PlainTextDocument( String text ) {
		mText = text;
	}

	public String getText() {
		return mText;
	}

	private final String mText;
}
