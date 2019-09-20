package org.opencyc.cycobject;

import java.util.Stack;
import java.io.IOException;
import org.opencyc.xml.XMLWriter;
import org.opencyc.util.StringUtils;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CycFormula implements CycObject
{
    protected final CycList<Object> args;
    
    public CycFormula(final Iterable<?> terms) {
        this.args = (CycList<Object>)new CycList();
        for (final Object arg : terms) {
            this.addArg(arg);
        }
    }
    
    public CycFormula(final CycDenotationalTerm functor, final Object... args) {
        this();
        this.addArg(functor);
        for (final Object arg : args) {
            this.addArg(arg);
        }
    }
    
    public static CycFormula makeCycFormula(final Object... terms) {
        final CycFormula newFormula = new CycFormula();
        for (final Object arg : terms) {
            newFormula.addArg(arg);
        }
        return newFormula;
    }
    
    protected CycFormula() {
        this.args = (CycList<Object>)new CycList();
    }
    
    protected final void addArg(final Object arg) {
        if (arg instanceof Iterable) {
            Object betterArg = CycNaut.convertIfPromising(arg);
            if (!(betterArg instanceof CycNaut)) {
                betterArg = new CycFormulaSentence((Iterable)arg);
            }
            this.addArgLow(betterArg);
        }
        else if (arg instanceof CycSymbol) {
            final Object betterArg = CycVariable.convertIfPromising(arg);
            this.addArgLow(betterArg);
        }
        else {
            this.addArgLow(arg);
        }
    }
    
    private void addArgLow(final Object arg) {
        this.args.add(arg);
    }
    
    @Override
    public String toString() {
        return this.args.toString();
    }
    
    public Object cycListApiValue() {
        return this.args.cycListApiValue(true);
    }
    
    public String cyclify() {
        return this.args.cyclify();
    }
    
    public String cyclifyWithEscapeChars() {
        return this.args.cyclifyWithEscapeChars();
    }
    
    public Object getArg(final int argNum) {
        return this.args.get(argNum);
    }
    
    public CycFormula deepCopy() {
        final List<Object> newArgs = new ArrayList<Object>(this.args.size());
        for (final Object arg : this.args) {
            if (arg instanceof CycFormula) {
                newArgs.add(((CycFormula)arg).deepCopy());
            }
            else {
                newArgs.add(arg);
            }
        }
        return new CycFormula(newArgs);
    }
    
    public CycList<Object> getArgs() {
        return this.args;
    }
    
    public CycList<Object> toCycList() {
        return this.getArgs();
    }
    
    public void setArgs(final List<Object> newArgs) {
        this.args.clear();
        this.args.addAll((Collection)newArgs);
    }
    
    public List<Object> getArgsUnmodifiable() {
        return Collections.unmodifiableList((List<?>)this.args);
    }
    
    public int getArity() {
        return this.args.size() - 1;
    }
    
    public Object getOperator() {
        return this.args.get(0);
    }
    
    public Object getArg0() {
        return this.args.get(0);
    }
    
    public Object getArg1() {
        return this.args.get(1);
    }
    
    public Object getArg2() {
        return this.args.get(2);
    }
    
    public Object getArg3() {
        return this.args.get(3);
    }
    
    public List getReferencedConstants() {
        return this.args.getReferencedConstants();
    }
    
    public Collection<CycVariable> getReferencedVariables() {
        return this.treeGather(CycVariable.class);
    }
    
    public boolean contains(final Object obj) {
        return this.args.contains(obj);
    }
    
    public boolean treeContains(final Object term) {
        final TreeWalker tw = new TreeWalker();
        while (tw.hasNext()) {
            if (tw.next().equals(term)) {
                return true;
            }
        }
        return false;
    }
    
    public <T> Set<T> treeGather(final Class<T> cls) {
        final Set<T> found = new HashSet<T>();
        final TreeWalker tw = new TreeWalker();
        while (tw.hasNext()) {
            final Object arg = tw.next();
            if (cls.isInstance(arg)) {
                found.add((T)arg);
            }
        }
        return found;
    }
    
    public Set<ArgPosition> getArgPositionsForTerm(final Object term) {
        final Set<ArgPosition> argPositions = new HashSet<ArgPosition>();
        final ArgPositionTrackingTreeWalker tw = new ArgPositionTrackingTreeWalker();
        while (tw.hasNext()) {
            final Object arg = tw.next();
            if (term.equals(arg)) {
                argPositions.add(tw.getCurrentArgPosition());
            }
        }
        return argPositions;
    }
    
    public ArgPosition getFirstArgPositionForTerm(final Object term) {
        final ArgPositionTrackingTreeWalker tw = new ArgPositionTrackingTreeWalker();
        while (tw.hasNext()) {
            final Object arg = tw.next();
            if (term.equals(arg)) {
                return tw.getCurrentArgPosition();
            }
        }
        return null;
    }
    
    public Set<CycConstant> treeConstants() {
        final Set<CycConstant> constants = new HashSet<CycConstant>();
        constants.addAll(this.treeGather(CycConstant.class));
        return constants;
    }
    
    public <K, V> CycFormula applySubstitutionsNonDestructive(final Map<K, V> substitutions) {
        final CycFormula newFormula = this.deepCopy();
        newFormula.applySubstitutionsDestructive(substitutions);
        return newFormula;
    }
    
    public <K, V> void applySubstitutionsDestructive(final Map<K, V> substitutions) {
        for (final Map.Entry<K, V> entry : substitutions.entrySet()) {
            for (final ArgPosition argPos : this.getArgPositionsForTerm(entry.getKey())) {
                final V replacement = entry.getValue();
                if (!DefaultCycObject.isCycLObject((Object)replacement)) {
                    throw new IllegalArgumentException(replacement + " is not a CycL object.");
                }
                this.setSpecifiedObject(argPos, replacement);
            }
        }
    }
    
    public List<CycVariable> findFreeVariables() {
        return this.findFreeVariables(new ArrayList<CycVariable>(), new HashSet<CycVariable>(), false);
    }
    
    public List<CycVariable> findQueryableVariables() {
        return this.findFreeVariables(new ArrayList<CycVariable>(), new HashSet<CycVariable>(), true);
    }
    
    private List<CycVariable> findFreeVariables(final List<CycVariable> freeVarsSoFar, final Set<CycVariable> boundVars, final boolean includeQueryable) {
        if (this instanceof CycFormulaSentence && (((CycFormulaSentence)this).isExistential() || ((CycFormulaSentence)this).isUniversal())) {
            final CycVariable boundVar = (CycVariable)this.getArg1();
            boundVars.add(boundVar);
            ((CycFormula)this.getArg2()).findFreeVariables(freeVarsSoFar, boundVars, includeQueryable);
            boundVars.remove(boundVar);
        }
        else if (includeQueryable && this instanceof CycFormulaSentence && ((CycFormulaSentence)this).isConditionalSentence()) {
            final List<CycVariable> antecedentVars = ((CycFormula)this.getArg1()).findFreeVariables(new ArrayList<CycVariable>(), boundVars, includeQueryable);
            for (final CycVariable antecedentVar : antecedentVars) {
                boundVars.add(antecedentVar);
                freeVarsSoFar.remove(antecedentVar);
            }
            ((CycFormula)this.getArg2()).findFreeVariables(freeVarsSoFar, boundVars, includeQueryable);
            for (final CycVariable antecedentVar : antecedentVars) {
                boundVars.remove(antecedentVar);
            }
        }
        else {
            for (final Object arg : this.getArgsUnmodifiable()) {
                if (arg instanceof CycVariable) {
                    final CycVariable var = (CycVariable)arg;
                    if (boundVars.contains(var) || freeVarsSoFar.contains(var)) {
                        continue;
                    }
                    freeVarsSoFar.add(var);
                }
                else {
                    if (!(arg instanceof CycFormula)) {
                        continue;
                    }
                    ((CycFormula)arg).findFreeVariables(freeVarsSoFar, boundVars, includeQueryable);
                }
            }
        }
        return freeVarsSoFar;
    }
    
    public Object getSpecifiedObject(final ArgPosition argPosition) {
        if (argPosition.depth() == 0) {
            return this;
        }
        Object answer = this;
        final List<Integer> tempPath = new ArrayList<Integer>(argPosition.getPath());
        int index = 0;
        try {
            while (!tempPath.isEmpty()) {
                index = tempPath.get(0);
                if (answer instanceof CycNonAtomicTerm) {
                    if (index == 0) {
                        answer = ((CycNonAtomicTerm)answer).getFunctor();
                    }
                    else {
                        answer = ((CycNonAtomicTerm)answer).getArgument(index);
                    }
                }
                else if (answer instanceof CycFormula) {
                    answer = ((CycFormula)answer).getArg(index);
                }
                else {
                    answer = ((CycList)answer).get(index);
                }
                tempPath.remove(0);
            }
            return answer;
        }
        catch (Exception e) {
            throw new RuntimeException("Can't get object specified by '" + argPosition + "' in forumla: '" + this + "'.  answer: " + answer + " index: " + index + "\n" + StringUtils.getStringForException((Throwable)e));
        }
    }
    
    public void setSpecifiedObject(final ArgPosition argPosition, final Object newArg) {
        if (ArgPosition.TOP.equals((Object)argPosition)) {
            this.setArgs((List<Object>)((CycFormula)newArg).getArgs());
            return;
        }
        Object context = this;
        final Iterator<Integer> it = argPosition.getPath().iterator();
        while (it.hasNext()) {
            final int index = it.next();
            if (!it.hasNext()) {
                this.setSpecifiedObject(context, index, newArg);
            }
            else if (context instanceof CycFormula) {
                context = ((CycFormula)context).getArg(index);
            }
            else {
                if (!(context instanceof List)) {
                    throw new RuntimeException("Can't find position " + argPosition + " in " + this);
                }
                context = ((List)context).get(index);
            }
        }
    }
    
    private void setSpecifiedObject(final Object context, final int index, final Object newArg) {
        if (context instanceof CycFormula) {
            ((CycFormula)context).args.set(index, newArg);
        }
        else if (context instanceof CycNart) {
            ((CycNart)context).setArgument(index, newArg);
        }
        else {
            if (!(context instanceof List)) {
                throw new RuntimeException("Can't set " + index + " of " + context);
            }
            ((List)context).set(index, newArg);
        }
    }
    
    public String stringApiValue() {
        return this.args.stringApiValue();
    }
    
    public String toPrettyCyclifiedString(final String indent) {
        return this.args.toPrettyCyclifiedString(indent);
    }
    
    public String toPrettyString(final String indent) {
        return this.args.toPrettyString(indent);
    }
    
    public String toHTMLPrettyString(final String indent) {
        return this.args.toHTMLPrettyString(indent);
    }
    
    public void toXML(final XMLWriter xmlWriter, final int indent, final boolean relative) throws IOException {
        this.args.toXML(xmlWriter, indent, relative);
    }
    
    public int compareTo(final Object o) {
        if (o instanceof CycFormula) {
            return this.args.compareTo((Object)((CycFormula)o).args);
        }
        return 0;
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final CycFormula other = (CycFormula)obj;
        return this.args == other.args || (this.args != null && this.args.equals((Object)other.args));
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + ((this.args != null) ? this.args.hashCode() : 0);
        return hash;
    }
    
    public boolean equalsAtEL(final Object other) {
        return other instanceof CycFormula && this.args.equalsAtEL((Object)((CycFormula)other).args);
    }
    
    public class TreeWalker implements Iterator<Object>
    {
        private final Stack<Object> stack;
        
        public TreeWalker() {
            this.stack = new Stack<Object>();
            this.initStack();
        }
        
        protected void initStack() {
            this.stack.push(CycFormula.this);
        }
        
        @Override
        public boolean hasNext() {
            return !this.stack.isEmpty();
        }
        
        @Override
        public Object next() {
            final Object item = this.popStack();
            if (item instanceof CycFormula) {
                for (final Object arg : ((CycFormula)item).args) {
                    this.pushStack(arg);
                }
            }
            return item;
        }
        
        protected Object popStack() {
            return this.stack.pop();
        }
        
        protected Object pushStack(final Object arg) {
            return this.stack.push(arg);
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported.");
        }
    }
    
    public class ArgPositionTrackingTreeWalker extends TreeWalker
    {
        private ArgPosition currentArgPosition;
        
        public ArgPositionTrackingTreeWalker() {
            this.currentArgPosition = null;
        }
        
        public ArgPosition getCurrentArgPosition() {
            return this.currentArgPosition;
        }
        
        @Override
        protected void initStack() {
            this.pushStack(new ObjectWithArgPosition((Object)CycFormula.this, ArgPosition.TOP));
        }
        
        @Override
        protected ObjectWithArgPosition popStack() {
            return (ObjectWithArgPosition)super.popStack();
        }
        
        @Override
        protected Object pushStack(final Object arg) {
            return super.pushStack(arg);
        }
        
        @Override
        public Object next() {
            final ObjectWithArgPosition itemPlus = this.popStack();
            final Object item = itemPlus.object;
            this.currentArgPosition = itemPlus.argPosition;
            if (item instanceof CycFormula) {
                final CycFormula formula = (CycFormula)item;
                for (int argNum = 0; argNum <= formula.getArity(); ++argNum) {
                    final Object arg = formula.getArg(argNum);
                    final ArgPosition newArgPos = this.currentArgPosition.deepCopy();
                    newArgPos.extend(argNum);
                    this.pushStack(new ObjectWithArgPosition(arg, newArgPos));
                }
            }
            return item;
        }
        
        private class ObjectWithArgPosition
        {
            private final Object object;
            private final ArgPosition argPosition;
            
            private ObjectWithArgPosition(final Object object, final ArgPosition argPosition) {
                this.object = object;
                this.argPosition = argPosition;
            }
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 178 ms
	
	Decompiled with Procyon 0.5.32.
*/