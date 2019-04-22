//
////
//
package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.MacroObject;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class SubLMacro extends MacroObject {

    /* (non-Javadoc)
     * @see org.armedbear.lisp.Operator#isSubLispFunction()
     */
    @Override
    public boolean isSubLispBased() {
        return true;
    }

    SubLMacro(SubLFunction macroExpander) {
        //super(macroExpander.getFunctionSymbol());
        this.macroExpander = (LispObject) macroExpander;
        if (macroExpander == null) {
            Errors.error("Got null macro expander function.");
        }
        LispObject name = (LispObject) macroExpander.getFunctionSymbol();
        this.lambdaName = name;
        //	    this.macroExpander = (SubLFunction) expander;
        //if (name instanceof Symbol && name != NIL && macroExpander instanceof Function)
        //((Function)macroExpander).setLambdaName(list(Symbol.MACRO_FUNCTION,
        //	  name));
    }
    //  public SubLMacro(LispObject name, LispObject expander)
    //  {
    //    this.lambdaName = name;
    //    this.macroExpander = expander;
    //    if (name instanceof Symbol && name != NIL && expander instanceof Function)
    //    {
    //    	Function f = (Function) expander;
    //    	LispObject naime = f.getLambdaName();
    //    	if(naime!=NIL) {
    //    		if(false)return;
    //    	}
    //        f.setLambdaName(list(Symbol.MACRO_FUNCTION, name));
    //
    //    }
    //  }

    @Override
    public SubLObject apply(SubLCons p0, SubLEnvironment p1) {
        return getMacroExpander().apply(p0, p1);
    }

    //private final SubLFunction macroExpander;

    @Override
    public SubLList getArglist() {
        return getMacroExpander().getArglist();
    }

    public SubLFunction getMacroExpander() {
        return (SubLFunction) macroExpander;
    }

    @Override
    public int hashCode(int currentDepth) {
        if (currentDepth < MAX_HASH_DEPTH) {
            return macroExpander.hashCode(currentDepth + 1);
        }
        return 0;
    }

    @Override
    public boolean isFunction() {
        return false;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    public boolean isFunctionSpec() {
        return false;
    }

    @Override
    public boolean isInterpreted() {
        return ((SubLFunction) macroExpander).isInterpreted();
    }

    @Override
    public boolean isMacroOperator() {
        return true;
    }

    @Override
    public SubLMacro toMacro() {
        return this;
    }

    //	@Override
    //	public String toString() {
    //		final SubLSymbol macroSymbol = macroExpander.getFunctionSymbol();
    //		if (macroSymbol != null) {
    //			return "#<Macro " + macroSymbol + ">";
    //		}
    //		return super.toString();
    //	}
}
