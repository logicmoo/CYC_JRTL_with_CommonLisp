package org.opencyc.util;

import java.io.Serializable;

public class Amp implements Serializable
{
    protected String ampString;
    protected String performative;
    protected String sender;
    protected String receiver;
    protected String replyWith;
    protected String inReplyTo;
    protected String content;
    protected String language;
    protected String ontology;
    protected String force;
    
    public Amp(final String ampString) {
        this.ampString = ampString;
        this.parsePerformativeParameters();
    }
    
    public Amp() {
        this.ampString = "";
        this.performative = "";
        this.sender = "";
        this.receiver = "";
        this.replyWith = "";
        this.inReplyTo = "";
        this.content = "";
        this.language = "";
        this.ontology = "";
        this.force = "";
    }
    
    @Override
    public String toString() {
        if (this.ampString == "") {
            this.generateAmpString();
        }
        return this.ampString;
    }
    
    public void generateAmpString() {
        this.ampString = "(" + this.performative;
        if (!this.sender.equals("")) {
            this.ampString = this.ampString + "\n  :SENDER " + this.sender;
        }
        if (!this.receiver.equals("")) {
            this.ampString = this.ampString + "\n  :RECEIVER " + this.receiver;
        }
        if (!this.replyWith.equals("")) {
            this.ampString = this.ampString + "\n  :REPLY-WITH " + this.replyWith;
        }
        if (!this.inReplyTo.equals("")) {
            this.ampString = this.ampString + "\n  :IN-REPLY-TO " + this.inReplyTo;
        }
        if (!this.content.equals("")) {
            this.ampString = this.ampString + "\n  :CONTENT " + this.content;
        }
        if (!this.language.equals("")) {
            this.ampString = this.ampString + "\n  :LANGUAGE " + this.language;
        }
        if (!this.ontology.equals("")) {
            this.ampString = this.ampString + "\n  :ONTOLOGY " + this.ontology;
        }
        if (!this.force.equals("")) {
            this.ampString = this.ampString + "\n  :FORCE " + this.force;
        }
        this.ampString += ")";
    }
    
    public String ampString() {
        return this.ampString;
    }
    
    public String performative() {
        return this.performative;
    }
    
    public void setPerformative(final String performative) {
        this.performative = performative.toUpperCase();
    }
    
    public String sender() {
        return this.sender;
    }
    
    public void setSender(final String sender) {
        this.sender = sender;
    }
    
    public String receiver() {
        return this.receiver;
    }
    
    public void setReceiver(final String receiver) {
        this.receiver = receiver;
    }
    
    public String replyWith() {
        return this.replyWith;
    }
    
    public void setReplyWith(final String replyWith) {
        this.replyWith = replyWith;
    }
    
    public String inReplyTo() {
        return this.inReplyTo;
    }
    
    public void setInReplyToString(final String inReplyTo) {
        this.inReplyTo = "\"" + inReplyTo + "\"";
    }
    
    public void setInReplyTo(final String inReplyTo) {
        this.inReplyTo = inReplyTo;
    }
    
    public String content() {
        return this.content;
    }
    
    public void setContent(final String content) {
        this.content = content;
    }
    
    public void setContentString(final String content) {
        this.content = "\"" + content + "\"";
    }
    
    public String language() {
        return this.language;
    }
    
    public void setLanguage(final String language) {
        this.language = language;
    }
    
    public String ontology() {
        return this.ontology;
    }
    
    public void setOntology(final String ontology) {
        this.ontology = ontology;
    }
    
    public String force() {
        return this.force;
    }
    
    public void setForce(final String force) {
        this.force = force;
    }
    
    public Amp createReply() {
        final Amp replyMessage = new Amp();
        replyMessage.setSender(this.receiver);
        replyMessage.setReceiver(this.sender);
        replyMessage.setInReplyTo(this.content);
        replyMessage.setLanguage(this.language);
        replyMessage.setOntology(this.ontology);
        return replyMessage;
    }
    
    public void parsePerformativeParameters() {
        this.performative = this.parsePerformative();
        this.sender = this.parseAmpPerformativeParameter(":SENDER");
        this.receiver = this.parseAmpPerformativeParameter(":RECEIVER");
        this.replyWith = this.parseAmpPerformativeParameter(":REPLY-WITH");
        this.inReplyTo = this.parseAmpPerformativeParameter(":IN-REPLY-TO");
        this.content = this.parseAmpPerformativeParameter(":CONTENT");
        this.language = this.parseAmpPerformativeParameter(":LANGUAGE");
        this.ontology = this.parseAmpPerformativeParameter(":ONTOLOGY");
        this.force = this.parseAmpPerformativeParameter(":FORCE");
    }
    
    public String parsePerformative() {
        final int length = this.ampString.length();
        boolean isLeadingWhitespace = true;
        char ch = ' ';
        int index = 0;
        while (isLeadingWhitespace) {
            if (index >= length) {
                Log.current.println("parsePerformative, invalid leading whitespace: " + this.ampString);
                return "";
            }
            ch = this.ampString.charAt(index);
            if (ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r' || ch == '\f') {
                ++index;
            }
            else {
                isLeadingWhitespace = false;
            }
        }
        if (ch != '(') {
            Log.current.println("parsePerformative, missing '(': " + this.ampString);
            return "";
        }
        isLeadingWhitespace = true;
        ++index;
        while (isLeadingWhitespace) {
            if (index >= length) {
                Log.current.println("parsePerformative, no performative: " + this.ampString);
                return "";
            }
            ch = this.ampString.charAt(index);
            if (ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r' || ch == '\f') {
                ++index;
            }
            else {
                isLeadingWhitespace = false;
            }
        }
        final String workString = this.ampString.substring(index);
        final int end = parseWordSExpression(workString, 0);
        return workString.substring(0, end + 1);
    }
    
    public String parseAmpPerformativeParameter(final String keyword) {
        boolean isLeadingWhitespace = true;
        char ch = ' ';
        int index = 0;
        String workString = this.ampString;
        int length = workString.length();
        while (isLeadingWhitespace) {
            if (index >= length) {
                Log.current.println("parsePerformativeParameter, invalid leading whitespace: " + workString);
                return "";
            }
            ch = workString.charAt(index);
            if (ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r' || ch == '\f') {
                ++index;
            }
            else {
                isLeadingWhitespace = false;
            }
        }
        if (ch != '(') {
            Log.current.println("parsePerformativeParameter, missing '(': " + workString);
            return "";
        }
        ++index;
        workString = workString.substring(index);
        length = workString.length();
        index = parseWordSExpression(workString, 0);
        String word = workString.substring(0, index + 1);
        while (true) {
            isLeadingWhitespace = true;
            ++index;
            while (isLeadingWhitespace) {
                if (index >= length) {
                    return "";
                }
                ch = workString.charAt(index);
                if (ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r' || ch == '\f') {
                    ++index;
                }
                else {
                    isLeadingWhitespace = false;
                }
            }
            if (ch == ')') {
                return "";
            }
            workString = workString.substring(index);
            index = parseWordSExpression(workString, 0);
            word = workString.substring(0, index + 1);
            ++index;
            workString = workString.substring(index);
            length = workString.length();
            index = 0;
            isLeadingWhitespace = true;
            while (isLeadingWhitespace) {
                if (index >= length) {
                    return "";
                }
                ch = workString.charAt(index);
                if (ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r' || ch == '\f') {
                    ++index;
                }
                else {
                    isLeadingWhitespace = false;
                }
            }
            workString = workString.substring(index);
            length = workString.length();
            index = parseSExpression(workString);
            String value = workString.substring(0, index + 1);
            if (word.equals(keyword)) {
                if (value.charAt(0) == '\"') {
                    value = value.substring(1, value.length() - 1);
                }
                return value;
            }
        }
    }
    
    public static int parseSExpression(final String aString) {
        final int length = aString.length();
        final int parenLevel = 0;
        final boolean isQuotedString = false;
        boolean isLeadingWhitespace = true;
        final int charsParsed = 0;
        char ch = ' ';
        int index = 0;
        while (isLeadingWhitespace) {
            if (index >= length) {
                Log.current.println("parseSExpression, invalid string: " + aString);
                return 0;
            }
            ch = aString.charAt(index);
            if (ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r' || ch == '\f') {
                ++index;
            }
            else {
                isLeadingWhitespace = false;
            }
        }
        if (ch == '(') {
            return parseParenSExpression(aString, index);
        }
        return parseWordSExpression(aString, index);
    }
    
    private static int parseParenSExpression(final String aString, int startingIndex) {
        final int length = aString.length();
        int parenLevel = 1;
        boolean isQuotedString = false;
        final int charsParsed = 0;
        char ch = ' ';
        while (parenLevel != 0) {
            if (++startingIndex >= length) {
                Log.current.println("parseParenSExpression, invalid string: " + aString);
                return 0;
            }
            ch = aString.charAt(startingIndex);
            if (ch == '\"') {
                isQuotedString = !isQuotedString;
            }
            if (isQuotedString) {
                continue;
            }
            if (ch == '(') {
                ++parenLevel;
            }
            if (ch != ')') {
                continue;
            }
            --parenLevel;
        }
        return startingIndex;
    }
    
    private static int parseWordSExpression(final String aString, int startingIndex) {
        final int length = aString.length();
        boolean isQuotedString = false;
        final int charsParsed = 0;
        char ch = ' ';
        ch = aString.charAt(startingIndex);
        if (ch == '\"') {
            isQuotedString = true;
        }
        while (++startingIndex < length) {
            ch = aString.charAt(startingIndex);
            if (!isQuotedString && (ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r' || ch == ')' || ch == '\f')) {
                return startingIndex - 1;
            }
            if (ch != '\"') {
                continue;
            }
            if (isQuotedString) {
                return startingIndex;
            }
            isQuotedString = true;
        }
        if (isQuotedString) {
            Log.current.println("parseWordSExpression, invalid string: " + aString);
            return 0;
        }
        return startingIndex - 1;
    }
    
    public static void test() {
        Log.current.println("parseSExpression(\"aWord\")");
        Log.current.println(parseSExpression("aWord"));
        Log.current.println("parseSExpression(\"  aWord  \")");
        Log.current.println(parseSExpression("  aWord  "));
        Log.current.println("parseSExpression(\"(aList)\")");
        Log.current.println(parseSExpression("(aList)"));
        Log.current.println("parseSExpression(\"(a (nested list))\")");
        Log.current.println(parseSExpression("(a (nested list))"));
        Log.current.println("parseSExpression(\"\"aString\"\")");
        Log.current.println(parseSExpression("\"aString\""));
        final Amp amp1 = new Amp("(ACHIEVE)");
        Log.current.println("parsePerformative " + amp1.ampString());
        Log.current.println(amp1.parsePerformative());
        final Amp amp2 = new Amp("  (ADVERTISE)");
        Log.current.println("parsePerformative " + amp2.ampString());
        Log.current.println(amp2.parsePerformative());
        final Amp amp3 = new Amp("( ACHIEVE )");
        Log.current.println("parsePerformative " + amp3.ampString());
        Log.current.println(amp3.parsePerformative());
        final Amp amp4 = new Amp("(ASK-ALL :SENDER sender-value :RECEIVER receiver-value :REPLY-WITH reply-with-value :IN-REPLY-TO in-reply-to-value :CONTENT \"content-value\" :LANGUAGE language-value :ONTOLOGY ontology-value :FORCE force-value)");
        Log.current.println("amp4: " + amp4.ampString());
        Log.current.println("performative " + amp4.parsePerformative());
        Log.current.println("sender " + amp4.parseAmpPerformativeParameter(":SENDER"));
        Log.current.println("receiver " + amp4.parseAmpPerformativeParameter(":RECEIVER"));
        Log.current.println("reply-with " + amp4.parseAmpPerformativeParameter(":REPLY-WITH"));
        Log.current.println("in-reply-to " + amp4.parseAmpPerformativeParameter(":IN-REPLY-TO"));
        Log.current.println("content " + amp4.parseAmpPerformativeParameter(":CONTENT"));
        Log.current.println("language " + amp4.parseAmpPerformativeParameter(":LANGUAGE"));
        Log.current.println("ontology " + amp4.parseAmpPerformativeParameter(":ONTOLOGY"));
        Log.current.println("force " + amp4.parseAmpPerformativeParameter(":FORCE"));
        final Amp amp5 = new Amp("(ASK-ALL :SENDER (sender-value) :RECEIVER (receiver-value) :REPLY-WITH (reply-with-value) :IN-REPLY-TO (in-reply-to-value) :CONTENT (content-value) :LANGUAGE (language-value) :ONTOLOGY ((ontology-value)) :FORCE (force-value))");
        Log.current.println("amp5: " + amp5.ampString());
        Log.current.println("performative " + amp5.parsePerformative());
        Log.current.println("sender " + amp5.parseAmpPerformativeParameter(":SENDER"));
        Log.current.println("receiver " + amp5.parseAmpPerformativeParameter(":RECEIVER"));
        Log.current.println("reply-with " + amp5.parseAmpPerformativeParameter(":REPLY-WITH"));
        Log.current.println("in-reply-to " + amp5.parseAmpPerformativeParameter(":IN-REPLY-TO"));
        Log.current.println("content " + amp5.parseAmpPerformativeParameter(":CONTENT"));
        Log.current.println("language " + amp5.parseAmpPerformativeParameter(":LANGUAGE"));
        Log.current.println("ontology " + amp5.parseAmpPerformativeParameter(":ONTOLOGY"));
        Log.current.println("force " + amp5.parseAmpPerformativeParameter(":FORCE"));
        amp5.generateAmpString();
        Log.current.println("Generated amp5: \n" + amp5.ampString());
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 158 ms
	
	Decompiled with Procyon 0.5.32.
*/