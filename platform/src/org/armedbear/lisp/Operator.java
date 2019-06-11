/*
 * Operator.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id$
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package org.armedbear.lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.AbstractSubLFunction;
//import com.cyc.tool.subl.jrtl.nativeCode.type.operator.AbstractSubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLSpecialOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class Operator extends AbstractSubLFunction implements SubLOperator {
    protected Operator(SubLSymbol functionSymbol) {
        super(functionSymbol);
        this.lambdaName = (LispObject) functionSymbol;
        if (functionSymbol != null)
            functionSymbol.setFunction((SubLOperator) this);
    }

    @Override
    public boolean isSubLispBased() {
        return false;
    }

    @Override
    final public Operator toLispObject() {
        return this;
    }

    //abstract public SubLOperator toSubLObject();
    //public abstract SubLSymbol getFunctionSymbol();
    @Override
    public LispObject execute(LispObject[] args) {
        if (args.length < 9)
            return dispatch(args);
        return funcallCL(args);
    }

    //    abstract public LispObject execute(LispObject[] args);
    @Override
    abstract public LispObject arrayify(LispObject... args);

    //protected LispObject lambdaName;

    private LispObject lambdaList;

    public final LispObject getLambdaName() {
        return lambdaName;
    }

    public final void setLambdaName(LispObject obj) {
        lambdaName = obj;
    }

    public final LispObject getLambdaList() {
        if (lambdaList == null) {
            DocString ds = getClass().getAnnotation(DocString.class);
            if (ds != null) {
                lambdaList = new SimpleString(ds.args());
            }
        }
        return lambdaList;
    }

    public final void setLambdaList(LispObject obj) {
        lambdaList = obj;
    }

    @Override
    public LispObject getParts() {
        LispObject result = NIL;
        result = result.push(new Cons("lambda-name", lambdaName));
        result = result.push(new Cons("lambda-list", lambdaList));
        return result.nreverse();
    }

    @Override
    public SubLList getArglist() {
        if (argList == null) {
            LispObject ll = getLambdaList();

            if (ll instanceof SubLString) {
                argList = Lisp.readObjectFromString("(" + ll.getStringValue() + ")").toList();
            }
        }
        return argList;
    }

    protected SubLList argList;

    @Override
    public boolean isAtom() {
        return true;
    }

    @Override
    final public String toString() {
        return super.toString();
    }

    @Override
    public String printObjectImpl() {
        final LispThread thread = LispThread.currentThread();
        final SpecialBindingsMark mark = thread.markSpecialBindings();
        thread.bindSpecial(Symbol.PRINT_LENGTH, Fixnum.THIRTY_TWO);
        StringBuilder sb = new StringBuilder(Lisp.getDotName(getClass()) + " ");
        try {
            LispObject name = getLambdaName();
            boolean closeBrace = false;
            if (name != null && name != NIL) {
                sb.append(name.princToString());
                sb.append(' ');
            }
            LispObject lambdaList = getLambdaList();
            if (lambdaList != null) {

                if (name == null || name == NIL) {
                    // No name.
                    sb.append("(LAMBDA ");
                    closeBrace = true;
                }

                if (lambdaList == NIL) {
                    sb.append("()");
                } else {

                    sb.append(lambdaList.printObject());
                }
            }

            if (closeBrace)
                sb.append(")");

            extraInfo(sb);

        } finally {
            thread.resetSpecialBindings(mark);
        }
        return unreadableString(sb.toString());
    }

    @Override
    protected void extraInfo(StringBuilder sb) {
    }

    @Override
    public boolean isMacroOperator() {
        return false;
    }
    //	protected AbstractSubLOperator() {
    //		this(null);
    //	}

    //abstract public SubLOperator toSubLObject();
    abstract public LispObject funcallCL(LispObject... args);

    @Override
    public SubLSymbol getType() {
        return Types.$dtp_function$;
    }

    @Override
    public SubLFixnum getTypeCode() {
        return CommonSymbols.FIVE_INTEGER;
    }

    //protected SubLSymbol lambdaName;
    //public static String SPECIAL_OPERATOR_NAME = "SPECIAL-OPERATOR";

    @Override
    public boolean canFastHash() {
        return true;
    }

    @Override
    public SubLSymbol getFunctionSymbol() {
        if (this.lambdaName != null)
            return (SubLSymbol) this.lambdaName;
        LispObject lambdaName = getLambdaName();
        if (lambdaName == null)
            return null;
        return lambdaName.toSymbol();
    }

    @Override
    public boolean isSpecial() {
        return (this instanceof SubLSpecialOperator);
    }

    @Override
    public SubLSpecialOperator toSpecialOperator() {
        if (this instanceof SubLSpecialOperator)
            return (SubLSpecialOperator) this;
        org.armedbear.lisp.Lisp.lisp_type_error(this, "SPECIAL-OPERATOR");
        return null;
    }

    @Override
    public String toTypeName() {
        return SPECIAL_OPERATOR_NAME;
    }

	/**
	 * TODO Describe the purpose of this method.
	 * @return
	 */
	public boolean isSpecialRestOnly() {
		return false;
	}

}
