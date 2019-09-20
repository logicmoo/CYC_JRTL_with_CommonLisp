package org.opencyc.util;

import java.util.Stack;

public class StackWithPointer extends Stack
{
    public int sp;
    
    public StackWithPointer() {
        this.sp = 0;
    }
    
    @Override
    public Object push(final Object item) {
        ++this.sp;
        return super.push(item);
    }
    
    @Override
    public Object pop() {
        --this.sp;
        return super.pop();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 39 ms
	
	Decompiled with Procyon 0.5.32.
*/