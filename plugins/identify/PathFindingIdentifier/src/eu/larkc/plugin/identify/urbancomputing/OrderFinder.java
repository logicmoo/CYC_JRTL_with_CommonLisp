package eu.larkc.plugin.identify.urbancomputing;

import org.openrdf.query.algebra.OrderElem;
import org.openrdf.query.algebra.Var;
import org.openrdf.query.algebra.helpers.QueryModelVisitorBase;

public class OrderFinder extends QueryModelVisitorBase<RuntimeException> {
	private boolean asc = false;
	private String var = null;
	private boolean found = false;

	@Override
	public void meet(OrderElem node) throws RuntimeException {
		super.meet(node);
		found=true;
		asc=((OrderElem)node).isAscending();
		node.visit(new QueryModelVisitorBase<RuntimeException>(){
			@Override
			public void meet(Var node) throws RuntimeException {
				OrderFinder.this.var=((Var)node).getName();
			}
		});
	}

	public boolean isFound(){
		return found;
	}

	public boolean isAsc() {
		return asc;
	}

	public String getVar() {
		return var;
	}
}
