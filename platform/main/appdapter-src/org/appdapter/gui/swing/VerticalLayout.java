

package org.appdapter.gui.swing;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;

public class VerticalLayout implements LayoutManager {
  public final static int LEFT = 0;
  public final static int CENTER = 1;
  public final static int RIGHT = 2;


/*public static void main(String[] args) {
  Frame f = new Frame();
  f.setLayout(new VerticalLayout());
  f.add(new Button("b1"));
  f.add(new Button("Button 2"));
  f.add(new Button("3"));
  f.add(new Button("The last button of them all"));
  f.pack();
  f.show();
} */

    boolean stretch = false;
    int align = 0;
    int hgap = 0;
    int vgap = 0;

    public VerticalLayout() {
    }

    public VerticalLayout(int align, boolean stretch) {
      this.align = align;
      this.stretch = stretch;
    }

    public VerticalLayout(int align, boolean stretch, int gap) {
      this.align = align;
      this.stretch = stretch;
      this.hgap = gap;
    }
    /**
     * Adds the specified component with the specified name to
     * the layout.
     * @param name the component name
     * @param comp the component to be added
     */
    @Override
	public void addLayoutComponent(String name, Component comp) {
    }

    /**
     * Removes the specified component from the layout.
     * @param comp the component ot be removed
     */
    @Override
	public void removeLayoutComponent(Component comp) {
    }

    public void setAlignment(int align) {
      this.align = align;
    }

    public void setStretch(boolean b) {
      this.stretch = b;
    }

    /**
     * Calculates the preferred size dimensions for the specified
     * panel given the components in the specified parent container.
     * @param parent the component to be laid out
     *
     * @see #minimumLayoutSize
     */
    @Override
	public Dimension preferredLayoutSize(Container target) {
      Dimension dim = new Dimension(0, 0);
 	    int nmembers = target.getComponentCount();

	    for (int i = 0 ; i < nmembers ; i++) {
	      Component m = target.getComponent(i);
	      if (m.isVisible()) {
		      Dimension d = m.getPreferredSize();
		      dim.width = Math.max(dim.width, d.width);
		      if (i > 0) {
		        dim.width += vgap;
		      }
  		    dim.height += d.height;
	      }
    	}
	    Insets insets = target.getInsets();
	    dim.width += insets.left + insets.right + hgap*2;
	    dim.height += insets.top + insets.bottom + vgap*2;
	    return dim;
    }

    /**
     * Calculates the minimum size dimensions for the specified
     * panel given the components in the specified parent container.
     * @param parent the component to be laid out
     * @see #preferredLayoutSize
     */
    @Override
	public Dimension minimumLayoutSize(Container target) {
      Dimension dim = new Dimension(0, 0);
 	    int nmembers = target.getComponentCount();

	    for (int i = 0 ; i < nmembers ; i++) {
	      Component m = target.getComponent(i);
	      if (m.isVisible()) {
		      Dimension d = m.getMinimumSize();
		      dim.width = Math.max(dim.width, d.width);
		      if (i > 0) {
		        dim.width += vgap;
		      }
  		    dim.height += d.height;
	      }
    	}
	    Insets insets = target.getInsets();
	    dim.width += insets.left + insets.right + hgap*2;
	    dim.height += insets.top + insets.bottom + vgap*2;
	    return dim;
    }

    /**
     * Lays out the container in the specified panel.
     * @param parent the component which needs to be laid out
     */
    @Override
	public void layoutContainer(Container target) {
    	Insets insets = target.getInsets();
    	int maxheight = target.getSize().height - (insets.top + insets.bottom + vgap*2);
    	int nmembers = target.getComponentCount();
    	int x = insets.left + hgap, y = 0;
    	int colw = 0, start = 0;

    	for (int i = 0 ; i < nmembers ; i++) {
	      Component m = target.getComponent(i);
	      if (m.isVisible()) {
    		  Dimension d = m.getPreferredSize();
    		  m.setSize(d.width, d.height);

		      if ((y == 0) || ((y + d.height) <= maxheight)) {
    		    if (y > 0) {
        			y += vgap;
    		    }
    		    y += d.height;
    		    colw = Math.max(colw, d.width);
      		} else {
		        moveComponents(target, x, insets.top + vgap, colw, maxheight - y, start, i);
    		    y = d.height;
    		    x += hgap + colw;
    		    colw = d.width;
    		    start = i;
      		}
  	    }
    	}
      if (stretch)
        colw = target.getSize().width;
    	moveComponents(target, x, insets.top + vgap, colw, maxheight - y, start, nmembers);
    }

    /** 
     * Centers the elements in the specified col, if there is any slack.
     * @param target the component which needs to be moved
     * @param x the x coordinate
     * @param y the y coordinate
     * @param width the width dimensions
     * @param height the height dimensions
     * @param colStart the beginning of the col
     * @param colEnd the the ending of the col
     */
    private void moveComponents(Container target, int x, int y, int width, int height, int colStart, int colEnd) {
	    switch (align) {
	      case LEFT:
  	      break;
  	    case CENTER:
  	      x += width / 2;
  	      break;
  	    case RIGHT:
  	      x += width;
  	      break;
	    }
    	for (int i = colStart ; i < colEnd ; i++) {
	      Component m = target.getComponent(i);
  	    if (m.isVisible()) {
      		//m.setLocation(x + (width - m.getSize().width) / 2, y);
          m.setLocation(x, y);
          if (stretch)
            m.setSize(width, m.getSize().height);
      		y += vgap + m.getSize().height;
  	    }
    	}
    }
}
