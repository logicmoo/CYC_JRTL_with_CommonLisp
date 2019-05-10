package org.appdapter.api.trigger;

import javax.swing.tree.TreeNode;
import java.util.List;

public interface BoxContext
{
    Box getRootBox();
    
    Box getParentBox(final Box p0);
    
    List<Box> getOpenChildBoxes(final Box p0);
    
     <BTo extends Box<TT>, TT extends Trigger<BTo>> List<BTo> getOpenChildBoxesNarrowed(final Box p0, final Class<BTo> p1, final Class<TT> p2);
    
    void contextualizeAndAttachChildBox(final Box<?> p0, final MutableBox<?> p1);
    
    void contextualizeAndDetachChildBox(final Box<?> p0, final MutableBox<?> p1);
    
    TreeNode findNodeForBox(final Box<?> p0, final Box<?> p1);
}

/*

	Total time: 17 ms
	
*/