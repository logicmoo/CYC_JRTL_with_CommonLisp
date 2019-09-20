package org.opencyc.parser;

import java.io.Serializable;

public class Token implements Serializable
{
    private static final long serialVersionUID = 1L;
    public int kind;
    public int beginLine;
    public int beginColumn;
    public int endLine;
    public int endColumn;
    public String image;
    public Token next;
    public Token specialToken;
    
    public Object getValue() {
        return null;
    }
    
    public Token() {
    }
    
    public Token(final int kind) {
        this(kind, null);
    }
    
    public Token(final int kind, final String image) {
        this.kind = kind;
        this.image = image;
    }
    
    @Override
    public String toString() {
        return this.image;
    }
    
    public static Token newToken(final int ofKind, final String image) {
        return new Token(ofKind, image);
    }
    
    public static Token newToken(final int ofKind) {
        return newToken(ofKind, null);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 12 ms
	
	Decompiled with Procyon 0.5.32.
*/