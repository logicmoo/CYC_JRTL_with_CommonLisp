package jasko.tim.lisp.editors;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Stack;

import org.eclipse.jface.text.Position;


public class LispSelectionMixin implements ILispSelection {
	public static class SelectionPosition {
		private Integer[] previousRange = new Integer[2];
		private Integer[] currentRange = new Integer[2];

		public SelectionPosition (int[] range, int start, int offset) {
			if (range!=null) {
				currentRange[0] = range[0];
				currentRange[1] = range[1];
			}
			previousRange[0] = start;
			previousRange[1] = offset;
		}
		
		boolean isEmpty () {
			return currentRange==null;
		}
		
		Integer[] getCurrentRange () {
			return currentRange;
		}
		Integer[] getPreviousRange () {
			return previousRange;
		}
	}
	
	ILispEditor ed;
	HashMap<ILispEditor,Stack<Integer[]>> history = new HashMap<ILispEditor,Stack<Integer[]>>();
	
	public LispSelectionMixin (ILispEditor editor) {
		ed = editor;
	}

	private boolean selectionAction = false;
	public void flagSelectionAction () {
		selectionAction = true;
	}

	public boolean selectionActionOccured () {
		boolean action = selectionAction;
		selectionAction = false;
		return action;
	}

	public void clearHistory () {
		history.clear();
	}

	public void addHistory (SelectionPosition pos) {
		if (pos.isEmpty()==true) return;
		Integer[] range = pos.getCurrentRange();
		if (history.get(ed)!=null) {
			//it exists
			Stack<Integer[]> stack = history.get(ed);
			stack.push(range);
			
		} else {
			Stack<Integer[]> stack = new Stack<Integer[]> ();
			history.put(ed, stack);
			stack.push(pos.getPreviousRange());
			stack.push(range);
		}

	}
	public void popHistory () {
		Stack<Integer[]> stack = history.get(ed);
		try {
			if (stack!=null&&stack.size()>1) {
				stack.pop();
			}
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
	}

	public  Integer[] peekHistory () {
		Stack<Integer[]> stack = history.get(ed);

		if (stack!=null) {
			try {

				return stack.peek();
			} catch (EmptyStackException e) {
				e.printStackTrace();
			}
		}

		return null;
	}
}
