package jasko.tim.lisp.editors;

import java.util.*;

import org.eclipse.core.resources.IMarker;
import org.eclipse.jface.text.*;
import org.eclipse.jface.text.source.*;
import org.eclipse.ui.texteditor.*;


/**
 * Pretty much all this does is display tooltips for the error and warning markers.
 * Stolen largely from http://www.koders.com/java/fid7C32010102DBF8E16CFE658C6512C529B2576727.aspx
 * @author Tim Jasko
 *
 */
public class MarkerAnnotationHover implements IAnnotationHover {

	public String getHoverInfo(ISourceViewer viewer, int line) {
		String info = null;
		List<IMarker> markers = getMarkersForLine(viewer, line);
		if (markers != null) {
			info = "";
			for (int i =  0; i < markers.size(); i++) {
				IMarker marker = (IMarker) markers.get(i);
				String message = marker.getAttribute(IMarker.MESSAGE, (String) null);
				if (message != null && message.trim().length() > 0) {
					info += message;

					if(i != markers.size() - 1) {
						info += "\n";
					}
				}
			}
		}
		return info;
	}

	/**
	 * Returns all markers which includes the ruler's line of activity.
	 */
	protected List<IMarker> getMarkersForLine(ISourceViewer aViewer, int aLine) {
		List<IMarker> markers = new ArrayList<IMarker>();
		IAnnotationModel model = aViewer.getAnnotationModel();
		if (model != null) {
			Iterator<?> e = model.getAnnotationIterator();
			while (e.hasNext()) {
				Object o = e.next();
				if (o instanceof MarkerAnnotation) {
					MarkerAnnotation a = (MarkerAnnotation) o;
					if (compareRulerLine(model.getPosition(a), aViewer.getDocument(), aLine) != 0) {
						markers.add(a.getMarker());
					}
				}
			}
		}
		return markers;
	}
	
	/**
	 * Returns distance of given line to specified position (1 = same line,
	 * 2 = included in given position, 0 = not related).
	 */
	protected int compareRulerLine(Position aPosition, IDocument aDocument, int aLine) {
		int distance = 0;
		if (aPosition.getOffset() > -1 && aPosition.getLength() > -1) {
			try {
				int markerLine =
					aDocument.getLineOfOffset(aPosition.getOffset());
				if (aLine == markerLine) {
					distance = 1;
				} else if (markerLine <= aLine 
						&& aLine <= aDocument.getLineOfOffset(aPosition.getOffset() + aPosition.getLength())) {
					distance = 2;
				}
			} catch (BadLocationException e) {
			}
		}
		return distance;
	}

}
