package org.opencyc.parser;

import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.io.InputStream;
import org.opencyc.cycobject.Guid;
import org.opencyc.api.CycObjectFactory;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycVariable;
import java.util.Collection;
import org.opencyc.cycobject.CycObject;
import java.io.IOException;
import org.opencyc.cycobject.CycList;
import java.io.Reader;
import java.util.List;
import org.opencyc.api.CycAccess;

class CycLParser implements CycLParserConstants
{
    private CycAccess access;
    public CycLParserTokenManager token_source;
    SimpleCharStream jj_input_stream;
    public Token token;
    public Token jj_nt;
    private int jj_ntk;
    private Token jj_scanpos;
    private Token jj_lastpos;
    private int jj_la;
    private int jj_gen;
    private final int[] jj_la1;
    private static int[] jj_la1_0;
    private static int[] jj_la1_1;
    private static int[] jj_la1_2;
    private final JJCalls[] jj_2_rtns;
    private boolean jj_rescan;
    private int jj_gc;
    private final LookaheadSuccess jj_ls;
    private List<int[]> jj_expentries;
    private int[] jj_expentry;
    private int jj_kind;
    private int[] jj_lasttokens;
    private int jj_endpos;
    
    public CycLParser(final Reader stream, final CycAccess access) {
        this(stream);
        this.access = access;
    }
    
    public CycAccess getCycAccess() {
        return this.access;
    }
    
    public static void main(final String[] args) {
        final CycLParser parser = new CycLParser(System.in);
        try {
            parser.term(true);
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public final CycList termList(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        final CycList val = new CycList();
        Object curTerm = null;
        while (true) {
            switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
                case 1:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 60:
                case 61:
                case 65:
                case 69:
                case 70:
                case 72:
                case 73:
                case 75:
                case 77: {
                    curTerm = this.term(false);
                    val.add(curTerm);
                    continue;
                }
                default: {
                    this.jj_la1[0] = this.jj_gen;
                    this.eof(requireEOF);
                    return val;
                }
            }
        }
    }
    
    public final Object term(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        Object result = null;
        if (this.jj_2_1(Integer.MAX_VALUE)) {
            result = this.sentence(false);
        }
        else {
            switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 60:
                case 61:
                case 65:
                case 69:
                case 70:
                case 72:
                case 73:
                case 75:
                case 77: {
                    result = this.atomicDenotationalTerm(false);
                    break;
                }
                default: {
                    this.jj_la1[1] = this.jj_gen;
                    this.jj_consume_token(-1);
                    throw new ParseException();
                }
            }
        }
        this.eof(requireEOF);
        return result;
    }
    
    public final void eof(final boolean requireEOF) throws ParseException {
        if (!requireEOF) {
            return;
        }
        this.jj_consume_token(0);
    }
    
    public final CycObject sentence(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycObject val = null;
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 65:
            case 69:
            case 70:
            case 72:
            case 73:
            case 75: {
                val = this.sentenceDenotingRepresentedTerm(false);
                break;
            }
            case 1: {
                this.jj_consume_token(1);
                switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
                    case 20:
                    case 35: {
                        val = (CycObject)this.notForm(false);
                        break;
                    }
                    case 17:
                    case 32: {
                        val = (CycObject)this.andForm(false);
                        break;
                    }
                    case 18:
                    case 33: {
                        val = (CycObject)this.orForm(false);
                        break;
                    }
                    case 19:
                    case 34: {
                        val = (CycObject)this.xorForm(false);
                        break;
                    }
                    case 22:
                    case 37: {
                        val = (CycObject)this.impForm(false);
                        break;
                    }
                    case 21:
                    case 36: {
                        val = (CycObject)this.equivForm(false);
                        break;
                    }
                    case 23:
                    case 38: {
                        val = (CycObject)this.univForm(false);
                        break;
                    }
                    case 24:
                    case 39: {
                        val = (CycObject)this.existForm(false);
                        break;
                    }
                    case 25:
                    case 40: {
                        val = this.existExactForm(false);
                        break;
                    }
                    case 26:
                    case 41: {
                        val = (CycObject)this.existUBoundForm(false);
                        break;
                    }
                    case 27:
                    case 42: {
                        val = (CycObject)this.existLBoundForm(false);
                        break;
                    }
                    case 1:
                    case 15:
                    case 16:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 43:
                    case 44:
                    case 65:
                    case 69:
                    case 70:
                    case 72:
                    case 73:
                    case 75: {
                        val = (CycObject)this.genericSentence(false);
                        break;
                    }
                    default: {
                        this.jj_la1[2] = this.jj_gen;
                        this.jj_consume_token(-1);
                        throw new ParseException();
                    }
                }
                this.jj_consume_token(2);
                break;
            }
            default: {
                this.jj_la1[3] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        this.eof(requireEOF);
        return val;
    }
    
    public final CycList notForm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycObject sent = null;
        final CycList val = new CycList();
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 20: {
                this.jj_consume_token(20);
                break;
            }
            case 35: {
                this.jj_consume_token(35);
                break;
            }
            default: {
                this.jj_la1[4] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        final CycList list = val;
        this.getCycAccess();
        list.add((Object)CycAccess.not);
        sent = this.sentence(false);
        val.add((Object)sent);
        this.eof(requireEOF);
        return val;
    }
    
    public final CycList andForm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycList sentences = null;
        final CycList val = new CycList();
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 17: {
                this.jj_consume_token(17);
                break;
            }
            case 32: {
                this.jj_consume_token(32);
                break;
            }
            default: {
                this.jj_la1[5] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        final CycList list = val;
        this.getCycAccess();
        list.add((Object)CycAccess.and);
        sentences = this.sentenceList(false);
        if (sentences != null) {
            val.addAll((Collection)sentences);
        }
        this.eof(requireEOF);
        return val;
    }
    
    public final CycList orForm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycList sentences = null;
        final CycList val = new CycList();
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 18: {
                this.jj_consume_token(18);
                break;
            }
            case 33: {
                this.jj_consume_token(33);
                break;
            }
            default: {
                this.jj_la1[6] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        final CycList list = val;
        this.getCycAccess();
        list.add((Object)CycAccess.or);
        sentences = this.sentenceList(false);
        if (sentences != null) {
            val.addAll((Collection)sentences);
        }
        this.eof(requireEOF);
        return val;
    }
    
    public final CycList xorForm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycObject sent = null;
        CycObject sent2 = null;
        final CycList val = new CycList();
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 19: {
                this.jj_consume_token(19);
                break;
            }
            case 34: {
                this.jj_consume_token(34);
                break;
            }
            default: {
                this.jj_la1[7] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        final CycList list = val;
        this.getCycAccess();
        list.add((Object)CycAccess.xorConst);
        sent = this.sentence(false);
        val.add((Object)sent);
        sent2 = this.sentence(false);
        val.add((Object)sent2);
        this.eof(requireEOF);
        return val;
    }
    
    public final CycList impForm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycObject sent = null;
        CycObject sent2 = null;
        final CycList val = new CycList();
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 22: {
                this.jj_consume_token(22);
                break;
            }
            case 37: {
                this.jj_consume_token(37);
                break;
            }
            default: {
                this.jj_la1[8] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        final CycList list = val;
        this.getCycAccess();
        list.add((Object)CycAccess.impliesConst);
        sent = this.sentence(false);
        val.add((Object)sent);
        sent2 = this.sentence(false);
        val.add((Object)sent2);
        this.eof(requireEOF);
        return val;
    }
    
    public final CycList equivForm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycObject sent = null;
        CycObject sent2 = null;
        final CycList val = new CycList();
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 21: {
                this.jj_consume_token(21);
                break;
            }
            case 36: {
                this.jj_consume_token(36);
                break;
            }
            default: {
                this.jj_la1[9] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        final CycList list = val;
        this.getCycAccess();
        list.add((Object)CycAccess.equivConst);
        sent = this.sentence(false);
        val.add((Object)sent);
        sent2 = this.sentence(false);
        val.add((Object)sent2);
        this.eof(requireEOF);
        return val;
    }
    
    public final CycList univForm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycObject var = null;
        CycObject sent = null;
        final CycList val = new CycList();
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 23: {
                this.jj_consume_token(23);
                break;
            }
            case 38: {
                this.jj_consume_token(38);
                break;
            }
            default: {
                this.jj_la1[10] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        final CycList list = val;
        this.getCycAccess();
        list.add((Object)CycAccess.forAllConst);
        var = (CycObject)this.variable(false);
        val.add((Object)var);
        sent = this.sentence(false);
        val.add((Object)sent);
        this.eof(requireEOF);
        return val;
    }
    
    public final CycList existForm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycVariable var = null;
        CycObject sent = null;
        final CycList val = new CycList();
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 24: {
                this.jj_consume_token(24);
                break;
            }
            case 39: {
                this.jj_consume_token(39);
                break;
            }
            default: {
                this.jj_la1[11] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        final CycList list = val;
        this.getCycAccess();
        list.add((Object)CycAccess.thereExistsConst);
        var = this.variable(false);
        val.add((Object)var);
        sent = this.sentence(false);
        val.add((Object)sent);
        this.eof(requireEOF);
        return val;
    }
    
    public final CycObject existExactForm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycVariable var = null;
        CycObject sent = null;
        final CycList val = new CycList();
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 25: {
                this.jj_consume_token(25);
                break;
            }
            case 40: {
                this.jj_consume_token(40);
                break;
            }
            default: {
                this.jj_la1[12] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        final CycList list = val;
        this.getCycAccess();
        list.add((Object)CycAccess.thereExistExactlyConst);
        var = this.variable(false);
        val.add((Object)var);
        sent = this.sentence(false);
        val.add((Object)sent);
        this.eof(requireEOF);
        return (CycObject)val;
    }
    
    public final CycList existUBoundForm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycVariable var = null;
        CycObject sent = null;
        final CycList val = new CycList();
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 26: {
                this.jj_consume_token(26);
                break;
            }
            case 41: {
                this.jj_consume_token(41);
                break;
            }
            default: {
                this.jj_la1[13] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        final CycList list = val;
        this.getCycAccess();
        list.add((Object)CycAccess.thereExistAtMostConst);
        var = this.variable(false);
        val.add((Object)var);
        sent = this.sentence(false);
        val.add((Object)sent);
        this.eof(requireEOF);
        return val;
    }
    
    public final CycList existLBoundForm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycVariable var = null;
        CycObject sent = null;
        final CycList val = new CycList();
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 27: {
                this.jj_consume_token(27);
                break;
            }
            case 42: {
                this.jj_consume_token(42);
                break;
            }
            default: {
                this.jj_la1[14] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        final CycList list = val;
        this.getCycAccess();
        list.add((Object)CycAccess.thereExistAtLeastConst);
        var = this.variable(false);
        val.add((Object)var);
        sent = this.sentence(false);
        val.add((Object)sent);
        this.eof(requireEOF);
        return val;
    }
    
    public final CycList genericSentence(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycObject pred = null;
        CycList args = null;
        pred = this.predicate(false);
        args = this.argumentList(false);
        args.add(0, (Object)pred);
        this.eof(requireEOF);
        return args;
    }
    
    public final CycList sentenceList(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycObject sent = null;
        CycVariable var = null;
        CycList result = new CycList();
        while (true) {
            switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
                case 1:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 65:
                case 69:
                case 70:
                case 72:
                case 73:
                case 75: {
                    sent = this.sentence(false);
                    result.add((Object)sent);
                    continue;
                }
                default: {
                    this.jj_la1[15] = this.jj_gen;
                    switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
                        case 78: {
                            this.jj_consume_token(78);
                            var = this.variable(false);
                            break;
                        }
                        default: {
                            this.jj_la1[16] = this.jj_gen;
                            break;
                        }
                    }
                    this.eof(requireEOF);
                    if (var != null) {
                        result.setDottedElement((Object)var);
                    }
                    if (result.size() == 0) {
                        result = null;
                    }
                    return result;
                }
            }
        }
    }
    
    public final CycList argumentList(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        Object curTerm = null;
        CycVariable var = null;
        final CycList result = new CycList();
        while (true) {
            switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
                case 1:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 60:
                case 61:
                case 65:
                case 69:
                case 70:
                case 72:
                case 73:
                case 75:
                case 77: {
                    curTerm = this.term(false);
                    result.add(curTerm);
                    continue;
                }
                default: {
                    this.jj_la1[17] = this.jj_gen;
                    switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
                        case 78: {
                            this.jj_consume_token(78);
                            var = this.variable(false);
                            break;
                        }
                        default: {
                            this.jj_la1[18] = this.jj_gen;
                            break;
                        }
                    }
                    this.eof(requireEOF);
                    if (var != null) {
                        result.setDottedElement((Object)var);
                    }
                    return result;
                }
            }
        }
    }
    
    public final CycObject predicate(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycObject t = null;
        t = this.representedTerm(false);
        this.eof(requireEOF);
        return t;
    }
    
    public final CycObject sentenceDenotingRepresentedTerm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycObject val = null;
        val = this.atomicSentenceDenotingRepresentedTerm(false);
        this.eof(requireEOF);
        return val;
    }
    
    public final CycList nonAtomicSentenceDenotingDenotationalTerm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        final CycList val = this.nonAtomicDenotationalTerm(false);
        this.eof(requireEOF);
        return val;
    }
    
    public final CycObject representedTerm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycObject val = null;
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 65:
            case 69:
            case 70:
            case 72:
            case 73:
            case 75: {
                val = this.atomicRepresentedTerm(false);
                break;
            }
            case 1: {
                val = (CycObject)this.nonAtomicDenotationalTerm(false);
                break;
            }
            default: {
                this.jj_la1[19] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        this.eof(requireEOF);
        return val;
    }
    
    public final CycList nonAtomicDenotationalTerm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        this.jj_consume_token(1);
        final CycObject func = this.function(false);
        final CycList args = this.argumentList(false);
        this.jj_consume_token(2);
        this.eof(requireEOF);
        args.add(0, (Object)func);
        return args;
    }
    
    public final CycObject function(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycObject val = null;
        val = this.representedTerm(false);
        this.eof(requireEOF);
        return val;
    }
    
    public final Object denotationalTerm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        Object val = null;
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 60:
            case 61:
            case 65:
            case 69:
            case 70:
            case 72:
            case 73:
            case 75:
            case 77: {
                val = this.atomicDenotationalTerm(false);
                break;
            }
            case 1: {
                val = this.nonAtomicDenotationalTerm(false);
                break;
            }
            default: {
                this.jj_la1[20] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        this.eof(requireEOF);
        return val;
    }
    
    public final Object atomicDenotationalTerm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        Object result = null;
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 65:
            case 69:
            case 70:
            case 72:
            case 73:
            case 75: {
                result = this.atomicRepresentedTerm(false);
                break;
            }
            case 60:
            case 61:
            case 77: {
                result = this.literal(false);
                break;
            }
            default: {
                this.jj_la1[21] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        this.eof(requireEOF);
        return result;
    }
    
    public final CycObject atomicSentenceDenotingRepresentedTerm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycObject val = null;
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 65:
            case 69:
            case 70:
            case 72: {
                val = (CycObject)this.sentenceDenotingConstant(false);
                break;
            }
            case 73:
            case 75: {
                val = (CycObject)this.sentenceDenotingVariable(false);
                break;
            }
            default: {
                this.jj_la1[22] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        this.eof(requireEOF);
        return val;
    }
    
    public final CycObject atomicRepresentedTerm(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycObject val = null;
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 65:
            case 69:
            case 70:
            case 72: {
                val = (CycObject)this.constant(false);
                break;
            }
            case 73:
            case 75: {
                val = (CycObject)this.variable(false);
                break;
            }
            default: {
                this.jj_la1[23] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        this.eof(requireEOF);
        return val;
    }
    
    public final Object literal(final boolean requireEOF) throws ParseException, IOException {
        Object val = null;
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 77: {
                val = this.string(false);
                break;
            }
            case 60:
            case 61: {
                val = this.number(false);
                break;
            }
            default: {
                this.jj_la1[24] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        this.eof(requireEOF);
        return val;
    }
    
    public final CycConstant sentenceDenotingConstant(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycConstant val = null;
        val = this.constant(false);
        this.eof(requireEOF);
        return val;
    }
    
    public final CycConstant constant(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycConstant val = null;
        Token t = null;
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44: {
                val = this.coreConstant(false);
                break;
            }
            case 65: {
                t = this.jj_consume_token(65);
                val = this.makeConstantFromName(t.image);
                break;
            }
            case 69: {
                t = this.jj_consume_token(69);
                val = this.makeConstantFromName(t.image);
                break;
            }
            case 70: {
                t = this.jj_consume_token(70);
                val = this.makeConstantFromGUID(t.image.substring(2));
                break;
            }
            case 72: {
                t = this.jj_consume_token(72);
                val = this.makeConstantFromGUID(t.image.substring(3, t.image.length() - 1));
                break;
            }
            default: {
                this.jj_la1[25] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        this.eof(requireEOF);
        return val;
    }
    
    public final CycConstant makeConstantFromName(String name) throws ParseException {
        CycConstant val = null;
        if (name.startsWith("#$")) {
            name = name.substring(2);
        }
        val = CycObjectFactory.getCycConstantCacheByName(name);
        if (val == null) {
            try {
                val = new CycConstant(name, (Guid)null);
            }
            catch (Exception e) {
                throw new ParseException(e.getMessage());
            }
        }
        return val;
    }
    
    public final CycConstant makeConstantFromGUID(final String guidStr) throws ParseException {
        CycConstant val = null;
        Guid guid = null;
        guid = CycObjectFactory.makeGuid(guidStr);
        val = CycObjectFactory.getCycConstantCacheByGuid(guid);
        if (val == null) {
            try {
                val = new CycConstant((String)null, guid);
            }
            catch (Exception e) {
                throw new ParseException(e.getMessage());
            }
        }
        return val;
    }
    
    public final CycConstant coreConstant(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycConstant val = null;
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44: {
                val = this.coreGUIDConstant(false);
                break;
            }
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29: {
                val = this.coreNameConstant(false);
                break;
            }
            default: {
                this.jj_la1[26] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        this.eof(requireEOF);
        return val;
    }
    
    public final CycConstant coreNameConstant(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycConstant val = null;
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 15: {
                this.jj_consume_token(15);
                val = CycAccess.trueConst;
                break;
            }
            case 16: {
                this.jj_consume_token(16);
                val = CycAccess.falseConst;
                break;
            }
            case 17: {
                this.jj_consume_token(17);
                val = CycAccess.and;
                break;
            }
            case 18: {
                this.jj_consume_token(18);
                val = CycAccess.or;
                break;
            }
            case 19: {
                this.jj_consume_token(19);
                val = CycAccess.xorConst;
                break;
            }
            case 20: {
                this.jj_consume_token(20);
                val = CycAccess.not;
                break;
            }
            case 21: {
                this.jj_consume_token(21);
                val = CycAccess.equivConst;
                break;
            }
            case 22: {
                this.jj_consume_token(22);
                val = CycAccess.impliesConst;
                break;
            }
            case 23: {
                this.jj_consume_token(23);
                val = CycAccess.forAllConst;
                break;
            }
            case 24: {
                this.jj_consume_token(24);
                val = CycAccess.thereExistsConst;
                break;
            }
            case 25: {
                this.jj_consume_token(25);
                val = CycAccess.thereExistExactlyConst;
                break;
            }
            case 26: {
                this.jj_consume_token(26);
                val = CycAccess.thereExistAtMostConst;
                break;
            }
            case 27: {
                this.jj_consume_token(27);
                val = CycAccess.thereExistAtLeastConst;
                break;
            }
            case 28: {
                this.jj_consume_token(28);
                throw new UnsupportedVocabularyException(CycAccess.expandSubLFnConst);
            }
            case 29: {
                this.jj_consume_token(29);
                throw new UnsupportedVocabularyException(CycAccess.sublQuoteFnConst);
            }
            default: {
                this.jj_la1[27] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        this.eof(requireEOF);
        return val;
    }
    
    public final CycConstant coreGUIDConstant(final boolean requireEOF) throws ParseException, IOException, UnsupportedVocabularyException {
        CycConstant val = null;
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 30: {
                this.jj_consume_token(30);
                val = CycAccess.trueConst;
                break;
            }
            case 31: {
                this.jj_consume_token(31);
                val = CycAccess.falseConst;
                break;
            }
            case 32: {
                this.jj_consume_token(32);
                val = CycAccess.and;
                break;
            }
            case 33: {
                this.jj_consume_token(33);
                val = CycAccess.or;
                break;
            }
            case 34: {
                this.jj_consume_token(34);
                val = CycAccess.xorConst;
                break;
            }
            case 35: {
                this.jj_consume_token(35);
                val = CycAccess.not;
                break;
            }
            case 36: {
                this.jj_consume_token(36);
                val = CycAccess.equivConst;
                break;
            }
            case 37: {
                this.jj_consume_token(37);
                val = CycAccess.impliesConst;
                break;
            }
            case 38: {
                this.jj_consume_token(38);
                val = CycAccess.forAllConst;
                break;
            }
            case 39: {
                this.jj_consume_token(39);
                val = CycAccess.thereExistsConst;
                break;
            }
            case 40: {
                this.jj_consume_token(40);
                val = CycAccess.thereExistExactlyConst;
                break;
            }
            case 41: {
                this.jj_consume_token(41);
                val = CycAccess.thereExistAtMostConst;
                break;
            }
            case 42: {
                this.jj_consume_token(42);
                val = CycAccess.thereExistAtLeastConst;
                break;
            }
            case 43: {
                this.jj_consume_token(43);
                throw new UnsupportedVocabularyException(CycAccess.expandSubLFnConst);
            }
            case 44: {
                this.jj_consume_token(44);
                throw new UnsupportedVocabularyException(CycAccess.expandSubLFnConst);
            }
            default: {
                this.jj_la1[28] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        this.eof(requireEOF);
        return val;
    }
    
    public final CycVariable sentenceDenotingVariable(final boolean requireEOF) throws ParseException {
        CycVariable val = null;
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 73: {
                val = this.sentenceDenotingSimpleVariable(false);
                break;
            }
            case 75: {
                val = this.sentenceDenotingMetaVariable(false);
                break;
            }
            default: {
                this.jj_la1[29] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        this.eof(requireEOF);
        return val;
    }
    
    public final CycVariable variable(final boolean requireEOF) throws ParseException {
        CycVariable val = null;
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 73: {
                val = this.simpleVariable(false);
                break;
            }
            case 75: {
                val = this.metaVariable(false);
                break;
            }
            default: {
                this.jj_la1[30] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        this.eof(requireEOF);
        return val;
    }
    
    public final CycVariable sentenceDenotingMetaVariable(final boolean requireEOF) throws ParseException {
        CycVariable val = null;
        val = this.metaVariable(false);
        this.eof(requireEOF);
        return val;
    }
    
    public final CycVariable sentenceDenotingSimpleVariable(final boolean requireEOF) throws ParseException {
        CycVariable val = null;
        val = this.simpleVariable(false);
        this.eof(requireEOF);
        return val;
    }
    
    public final CycVariable metaVariable(final boolean requireEOF) throws ParseException {
        CycVariable val = null;
        Token t = null;
        t = this.jj_consume_token(75);
        val = new CycVariable(t.image);
        this.eof(requireEOF);
        return val;
    }
    
    public final CycVariable simpleVariable(final boolean requireEOF) throws ParseException {
        CycVariable val = null;
        Token t = null;
        t = this.jj_consume_token(73);
        val = new CycVariable(t.image);
        this.eof(requireEOF);
        return val;
    }
    
    public final String string(final boolean requireEOF) throws ParseException {
        Token t = null;
        t = this.jj_consume_token(77);
        this.eof(requireEOF);
        return t.image.substring(1, t.image.length() - 1);
    }
    
    public final Number number(final boolean requireEOF) throws ParseException {
        Number val = null;
        Token t = null;
        switch ((this.jj_ntk == -1) ? this.jj_ntk() : this.jj_ntk) {
            case 60: {
                t = this.jj_consume_token(60);
                val = new Long(t.image.startsWith("+") ? t.image.substring(1) : t.image);
                break;
            }
            case 61: {
                t = this.jj_consume_token(61);
                val = new Double(t.image.toLowerCase().replaceAll("d", "e"));
                break;
            }
            default: {
                this.jj_la1[31] = this.jj_gen;
                this.jj_consume_token(-1);
                throw new ParseException();
            }
        }
        this.eof(requireEOF);
        return val;
    }
    
    private boolean jj_2_1(final int xla) {
        this.jj_la = xla;
        final Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return !this.jj_3_1();
        }
        catch (LookaheadSuccess ls) {
            return true;
        }
        finally {
            this.jj_save(0, xla);
        }
    }
    
    private boolean jj_3_1() {
        final Token xsp = this.jj_scanpos;
        if (this.jj_scan_token(15)) {
            this.jj_scanpos = xsp;
            if (this.jj_scan_token(30)) {
                this.jj_scanpos = xsp;
                if (this.jj_scan_token(16)) {
                    this.jj_scanpos = xsp;
                    if (this.jj_scan_token(31)) {
                        this.jj_scanpos = xsp;
                        if (this.jj_scan_token(73)) {
                            this.jj_scanpos = xsp;
                            if (this.jj_scan_token(75)) {
                                this.jj_scanpos = xsp;
                                if (this.jj_scan_token(1)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    private static void jj_la1_init_0() {
        CycLParser.jj_la1_0 = new int[] { -32766, -32768, -32766, -32766, 1048576, 131072, 262144, 524288, 4194304, 2097152, 8388608, 16777216, 33554432, 67108864, 134217728, -32766, 0, -32766, 0, -32766, -32766, -32768, -32768, -32768, 0, -32768, -32768, 1073709056, -1073741824, 0, 0, 0 };
    }
    
    private static void jj_la1_init_1() {
        CycLParser.jj_la1_1 = new int[] { 805314559, 805314559, 8191, 8191, 8, 1, 2, 4, 32, 16, 64, 128, 256, 512, 1024, 8191, 0, 805314559, 0, 8191, 805314559, 805314559, 8191, 8191, 805306368, 8191, 8191, 0, 8191, 0, 0, 805306368 };
    }
    
    private static void jj_la1_init_2() {
        CycLParser.jj_la1_2 = new int[] { 11106, 11106, 2914, 2914, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2914, 16384, 11106, 16384, 2914, 11106, 11106, 2914, 2914, 8192, 354, 0, 0, 0, 2560, 2560, 0 };
    }
    
    public CycLParser(final InputStream stream) {
        this(stream, null);
    }
    
    public CycLParser(final InputStream stream, final String encoding) {
        this.jj_la1 = new int[32];
        this.jj_2_rtns = new JJCalls[1];
        this.jj_rescan = false;
        this.jj_gc = 0;
        this.jj_ls = new LookaheadSuccess();
        this.jj_expentries = new ArrayList<int[]>();
        this.jj_kind = -1;
        this.jj_lasttokens = new int[100];
        try {
            this.jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1);
        }
        catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        this.token_source = new CycLParserTokenManager(this.jj_input_stream);
        this.token = new Token();
        this.jj_ntk = -1;
        this.jj_gen = 0;
        for (int i = 0; i < 32; ++i) {
            this.jj_la1[i] = -1;
        }
        for (int i = 0; i < this.jj_2_rtns.length; ++i) {
            this.jj_2_rtns[i] = new JJCalls();
        }
    }
    
    public void ReInit(final InputStream stream) {
        this.ReInit(stream, null);
    }
    
    public void ReInit(final InputStream stream, final String encoding) {
        try {
            this.jj_input_stream.ReInit(stream, encoding, 1, 1);
        }
        catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        this.token_source.ReInit(this.jj_input_stream);
        this.token = new Token();
        this.jj_ntk = -1;
        this.jj_gen = 0;
        for (int i = 0; i < 32; ++i) {
            this.jj_la1[i] = -1;
        }
        for (int i = 0; i < this.jj_2_rtns.length; ++i) {
            this.jj_2_rtns[i] = new JJCalls();
        }
    }
    
    public CycLParser(final Reader stream) {
        this.jj_la1 = new int[32];
        this.jj_2_rtns = new JJCalls[1];
        this.jj_rescan = false;
        this.jj_gc = 0;
        this.jj_ls = new LookaheadSuccess();
        this.jj_expentries = new ArrayList<int[]>();
        this.jj_kind = -1;
        this.jj_lasttokens = new int[100];
        this.jj_input_stream = new SimpleCharStream(stream, 1, 1);
        this.token_source = new CycLParserTokenManager(this.jj_input_stream);
        this.token = new Token();
        this.jj_ntk = -1;
        this.jj_gen = 0;
        for (int i = 0; i < 32; ++i) {
            this.jj_la1[i] = -1;
        }
        for (int i = 0; i < this.jj_2_rtns.length; ++i) {
            this.jj_2_rtns[i] = new JJCalls();
        }
    }
    
    public void ReInit(final Reader stream) {
        this.jj_input_stream.ReInit(stream, 1, 1);
        this.token_source.ReInit(this.jj_input_stream);
        this.token = new Token();
        this.jj_ntk = -1;
        this.jj_gen = 0;
        for (int i = 0; i < 32; ++i) {
            this.jj_la1[i] = -1;
        }
        for (int i = 0; i < this.jj_2_rtns.length; ++i) {
            this.jj_2_rtns[i] = new JJCalls();
        }
    }
    
    public CycLParser(final CycLParserTokenManager tm) {
        this.jj_la1 = new int[32];
        this.jj_2_rtns = new JJCalls[1];
        this.jj_rescan = false;
        this.jj_gc = 0;
        this.jj_ls = new LookaheadSuccess();
        this.jj_expentries = new ArrayList<int[]>();
        this.jj_kind = -1;
        this.jj_lasttokens = new int[100];
        this.token_source = tm;
        this.token = new Token();
        this.jj_ntk = -1;
        this.jj_gen = 0;
        for (int i = 0; i < 32; ++i) {
            this.jj_la1[i] = -1;
        }
        for (int i = 0; i < this.jj_2_rtns.length; ++i) {
            this.jj_2_rtns[i] = new JJCalls();
        }
    }
    
    public void ReInit(final CycLParserTokenManager tm) {
        this.token_source = tm;
        this.token = new Token();
        this.jj_ntk = -1;
        this.jj_gen = 0;
        for (int i = 0; i < 32; ++i) {
            this.jj_la1[i] = -1;
        }
        for (int i = 0; i < this.jj_2_rtns.length; ++i) {
            this.jj_2_rtns[i] = new JJCalls();
        }
    }
    
    private Token jj_consume_token(final int kind) throws ParseException {
        final Token oldToken;
        if ((oldToken = this.token).next != null) {
            this.token = this.token.next;
        }
        else {
            final Token token = this.token;
            final Token nextToken = this.token_source.getNextToken();
            token.next = nextToken;
            this.token = nextToken;
        }
        this.jj_ntk = -1;
        if (this.token.kind == kind) {
            ++this.jj_gen;
            if (++this.jj_gc > 100) {
                this.jj_gc = 0;
                for (int i = 0; i < this.jj_2_rtns.length; ++i) {
                    for (JJCalls c = this.jj_2_rtns[i]; c != null; c = c.next) {
                        if (c.gen < this.jj_gen) {
                            c.first = null;
                        }
                    }
                }
            }
            return this.token;
        }
        this.token = oldToken;
        this.jj_kind = kind;
        throw this.generateParseException();
    }
    
    private boolean jj_scan_token(final int kind) {
        if (this.jj_scanpos == this.jj_lastpos) {
            --this.jj_la;
            if (this.jj_scanpos.next == null) {
                final Token jj_scanpos = this.jj_scanpos;
                final Token nextToken = this.token_source.getNextToken();
                jj_scanpos.next = nextToken;
                this.jj_scanpos = nextToken;
                this.jj_lastpos = nextToken;
            }
            else {
                final Token next = this.jj_scanpos.next;
                this.jj_scanpos = next;
                this.jj_lastpos = next;
            }
        }
        else {
            this.jj_scanpos = this.jj_scanpos.next;
        }
        if (this.jj_rescan) {
            int i = 0;
            Token tok;
            for (tok = this.token; tok != null && tok != this.jj_scanpos; tok = tok.next) {
                ++i;
            }
            if (tok != null) {
                this.jj_add_error_token(kind, i);
            }
        }
        if (this.jj_scanpos.kind != kind) {
            return true;
        }
        if (this.jj_la == 0 && this.jj_scanpos == this.jj_lastpos) {
            throw this.jj_ls;
        }
        return false;
    }
    
    public final Token getNextToken() {
        if (this.token.next != null) {
            this.token = this.token.next;
        }
        else {
            final Token token = this.token;
            final Token nextToken = this.token_source.getNextToken();
            token.next = nextToken;
            this.token = nextToken;
        }
        this.jj_ntk = -1;
        ++this.jj_gen;
        return this.token;
    }
    
    public final Token getToken(final int index) {
        Token t = this.token;
        for (int i = 0; i < index; ++i) {
            if (t.next != null) {
                t = t.next;
            }
            else {
                final Token token = t;
                final Token nextToken = this.token_source.getNextToken();
                token.next = nextToken;
                t = nextToken;
            }
        }
        return t;
    }
    
    private int jj_ntk() {
        final Token next = this.token.next;
        this.jj_nt = next;
        if (next == null) {
            final Token token = this.token;
            final Token nextToken = this.token_source.getNextToken();
            token.next = nextToken;
            return this.jj_ntk = nextToken.kind;
        }
        return this.jj_ntk = this.jj_nt.kind;
    }
    
    private void jj_add_error_token(final int kind, final int pos) {
        if (pos >= 100) {
            return;
        }
        if (pos == this.jj_endpos + 1) {
            this.jj_lasttokens[this.jj_endpos++] = kind;
        }
        else if (this.jj_endpos != 0) {
            this.jj_expentry = new int[this.jj_endpos];
            for (int i = 0; i < this.jj_endpos; ++i) {
                this.jj_expentry[i] = this.jj_lasttokens[i];
            }
        Label_0092:
            for (final int[] oldentry : this.jj_expentries) {
                if (oldentry.length == this.jj_expentry.length) {
                    for (int j = 0; j < this.jj_expentry.length; ++j) {
                        if (oldentry[j] != this.jj_expentry[j]) {
                            continue Label_0092;
                        }
                    }
                    this.jj_expentries.add(this.jj_expentry);
                    break;
                }
            }
            if (pos != 0) {
                this.jj_lasttokens[(this.jj_endpos = pos) - 1] = kind;
            }
        }
    }
    
    public ParseException generateParseException() {
        this.jj_expentries.clear();
        final boolean[] la1tokens = new boolean[79];
        if (this.jj_kind >= 0) {
            la1tokens[this.jj_kind] = true;
            this.jj_kind = -1;
        }
        for (int i = 0; i < 32; ++i) {
            if (this.jj_la1[i] == this.jj_gen) {
                for (int j = 0; j < 32; ++j) {
                    if ((CycLParser.jj_la1_0[i] & 1 << j) != 0x0) {
                        la1tokens[j] = true;
                    }
                    if ((CycLParser.jj_la1_1[i] & 1 << j) != 0x0) {
                        la1tokens[32 + j] = true;
                    }
                    if ((CycLParser.jj_la1_2[i] & 1 << j) != 0x0) {
                        la1tokens[64 + j] = true;
                    }
                }
            }
        }
        for (int i = 0; i < 79; ++i) {
            if (la1tokens[i]) {
                (this.jj_expentry = new int[1])[0] = i;
                this.jj_expentries.add(this.jj_expentry);
            }
        }
        this.jj_endpos = 0;
        this.jj_rescan_token();
        this.jj_add_error_token(0, 0);
        final int[][] exptokseq = new int[this.jj_expentries.size()][];
        for (int k = 0; k < this.jj_expentries.size(); ++k) {
            exptokseq[k] = this.jj_expentries.get(k);
        }
        return new ParseException(this.token, exptokseq, CycLParser.tokenImage);
    }
    
    public final void enable_tracing() {
    }
    
    public final void disable_tracing() {
    }
    
    private void jj_rescan_token() {
        this.jj_rescan = true;
        for (int i = 0; i < 1; ++i) {
            try {
                JJCalls p = this.jj_2_rtns[i];
                do {
                    if (p.gen > this.jj_gen) {
                        this.jj_la = p.arg;
                        final Token first = p.first;
                        this.jj_scanpos = first;
                        this.jj_lastpos = first;
                        switch (i) {
                            case 0: {
                                this.jj_3_1();
                                break;
                            }
                        }
                    }
                    p = p.next;
                } while (p != null);
            }
            catch (LookaheadSuccess lookaheadSuccess) {}
        }
        this.jj_rescan = false;
    }
    
    private void jj_save(final int index, final int xla) {
        JJCalls p;
        for (p = this.jj_2_rtns[index]; p.gen > this.jj_gen; p = p.next) {
            if (p.next == null) {
                final JJCalls jjCalls = p;
                final JJCalls next = new JJCalls();
                jjCalls.next = next;
                p = next;
                break;
            }
        }
        p.gen = this.jj_gen + xla - this.jj_la;
        p.first = this.token;
        p.arg = xla;
    }
    
    static {
        jj_la1_init_0();
        jj_la1_init_1();
        jj_la1_init_2();
    }
    
    private static final class LookaheadSuccess extends Error
    {
    }
    
    static final class JJCalls
    {
        int gen;
        Token first;
        int arg;
        JJCalls next;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 255 ms
	
	Decompiled with Procyon 0.5.32.
*/