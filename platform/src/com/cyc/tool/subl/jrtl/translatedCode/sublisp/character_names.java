/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;



import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.code_char;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public class character_names extends SubLTranslatedFile {
    public static SubLObject character_names(SubLObject v_char) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return append(gethash(v_char, $character_names_table$.getDynamicValue(thread), UNPROVIDED), list(Strings.make_string(ONE_INTEGER, v_char)));
    }

    public static SubLObject declare_character_names_file() {
        declareFunction("character_names", "CHARACTER-NAMES", 1, 0, false);
        return SubLNil.NIL;
    }

    public static SubLObject init_character_names_file() {
        defvar("*CHARACTER-NAMES-TABLE*", make_hash_table($int$256, symbol_function(EQL), UNPROVIDED));
        defvar("*NAME-CHARACTER-TABLE*", make_hash_table($int$256, symbol_function(EQUALP), UNPROVIDED));
        return SubLNil.NIL;
    }

    public static SubLObject setup_character_names_file() {
        final SubLObject cnt = $character_names_table$.getDynamicValue();
        sethash(code_char(ZERO_INTEGER), cnt, list($$$Null, $$$NUL));
        sethash(code_char(ONE_INTEGER), cnt, list($str3$Control_a, $str4$c_a));
        sethash(code_char(TWO_INTEGER), cnt, list($str5$Control_b, $str6$c_b));
        sethash(code_char(THREE_INTEGER), cnt, list($str7$Control_c, $str8$c_c));
        sethash(code_char(FOUR_INTEGER), cnt, list($str9$Control_d, $str10$c_d));
        sethash(code_char(FIVE_INTEGER), cnt, list($str11$Control_e, $str12$c_e));
        sethash(code_char(SIX_INTEGER), cnt, list($str13$Control_f, $str14$c_f));
        sethash(code_char(SEVEN_INTEGER), cnt, list($$$Bell, $$$BEL));
        sethash(code_char(EIGHT_INTEGER), cnt, list($$$Backspace, $$$BS));
        sethash(code_char(NINE_INTEGER), cnt, list($$$Tab, $$$HT));
        sethash(code_char(TEN_INTEGER), cnt, list($$$Newline, $$$Linefeed));
        sethash(code_char(ELEVEN_INTEGER), cnt, list($str23$Vertical_Tab, $$$VT));
        sethash(code_char(TWELVE_INTEGER), cnt, list($$$Page, $$$FF));
        sethash(code_char(THIRTEEN_INTEGER), cnt, list($$$Return, $$$CR));
        sethash(code_char(FOURTEEN_INTEGER), cnt, list($str29$Control_n, $str30$c_n));
        sethash(code_char(FIFTEEN_INTEGER), cnt, list($str31$Control_o, $str32$c_o));
        sethash(code_char(SIXTEEN_INTEGER), cnt, list($str33$Control_p, $str34$c_p));
        sethash(code_char(SEVENTEEN_INTEGER), cnt, list($str35$Control_q, $str36$c_q));
        sethash(code_char(EIGHTEEN_INTEGER), cnt, list($str37$Control_r, $str38$c_r));
        sethash(code_char(NINETEEN_INTEGER), cnt, list($str39$Control_s, $str40$c_s));
        sethash(code_char(TWENTY_INTEGER), cnt, list($str41$Control_t, $str42$c_t));
        sethash(code_char($int$21), cnt, list($str44$Control_u, $str45$c_u));
        sethash(code_char($int$22), cnt, list($str47$Control_v, $str48$c_v));
        sethash(code_char($int$23), cnt, list($str50$Control_w, $str51$c_w));
        sethash(code_char($int$24), cnt, list($str53$Control_x, $str54$c_x));
        sethash(code_char($int$25), cnt, list($str56$Control_y, $str57$c_y));
        sethash(code_char($int$26), cnt, list($str59$Control_z, $str60$c_z));
        sethash(code_char($int$27), cnt, list($$$Escape, $$$ESC));
        sethash(code_char($int$28), cnt, list($str65$Control__, $str66$c__));
        sethash(code_char($int$29), cnt, list($str68$Control__, $str69$c__));
        sethash(code_char($int$30), cnt, list($str71$Control__, $str72$c__));
        sethash(code_char($int$31), cnt, list($str74$Control__, $str75$c__));
        sethash(code_char($int$32), cnt, list($$$Space, $$$SP));
        sethash(code_char($int$127), cnt, list($$$Rubout, $$$DEL));
        sethash(code_char($int$128), cnt, list($str83$Meta_Null, $str84$m_Null));
        sethash(code_char($int$129), cnt, list($str86$Control_Meta_a, $str87$c_m_a));
        sethash(code_char($int$130), cnt, list($str89$Control_Meta_b, $str90$c_m_b));
        sethash(code_char($int$131), cnt, list($str92$Control_Meta_c, $str93$c_m_c));
        sethash(code_char($int$132), cnt, list($str95$Control_Meta_d, $str96$c_m_d));
        sethash(code_char($int$133), cnt, list($str98$Control_Meta_e, $str99$c_m_e));
        sethash(code_char($int$134), cnt, list($str101$Control_Meta_f, $str102$c_m_f));
        sethash(code_char($int$135), cnt, list($str104$Meta_Bell, $str105$m_Bell));
        sethash(code_char($int$136), cnt, list($str107$Meta_Backspace, $str108$m_Backspace));
        sethash(code_char($int$137), cnt, list($str110$Meta_Tab, $str111$m_Tab));
        sethash(code_char($int$138), cnt, list($str113$Meta_Newline, $str114$m_Newline));
        sethash(code_char($int$139), cnt, list($str116$Meta_Vertical_Tab, $str117$m_Vertical_Tab));
        sethash(code_char($int$140), cnt, list($str119$Meta_Page, $str120$m_Page));
        sethash(code_char($int$141), cnt, list($str122$Meta_Return, $str123$m_Return));
        sethash(code_char($int$142), cnt, list($str125$Control_Meta_n, $str126$c_m_n));
        sethash(code_char($int$143), cnt, list($str128$Control_Meta_o, $str129$c_m_o));
        sethash(code_char($int$144), cnt, list($str131$Control_Meta_p, $str132$c_m_p));
        sethash(code_char($int$145), cnt, list($str134$Control_Meta_q, $str135$c_m_q));
        sethash(code_char($int$146), cnt, list($str137$Control_Meta_r, $str138$c_m_r));
        sethash(code_char($int$147), cnt, list($str140$Control_Meta_s, $str141$c_m_s));
        sethash(code_char($int$148), cnt, list($str143$Control_Meta_t, $str144$c_m_t));
        sethash(code_char($int$149), cnt, list($str146$Control_Meta_u, $str147$c_m_u));
        sethash(code_char($int$150), cnt, list($str149$Control_Meta_v, $str150$c_m_v));
        sethash(code_char($int$151), cnt, list($str152$Control_Meta_w, $str153$c_m_w));
        sethash(code_char($int$152), cnt, list($str155$Control_Meta_x, $str156$c_m_x));
        sethash(code_char($int$153), cnt, list($str158$Control_Meta_y, $str159$c_m_y));
        sethash(code_char($int$154), cnt, list($str161$Control_Meta_z, $str162$c_m_z));
        sethash(code_char($int$155), cnt, list($str164$Meta_Escape, $str165$m_Escape));
        sethash(code_char($int$156), cnt, list($str167$Control_Meta__, $str168$c_m__));
        sethash(code_char($int$157), cnt, list($str170$Control_Meta__, $str171$c_m__));
        sethash(code_char($int$158), cnt, list($str173$Control_Meta__, $str174$c_m__));
        sethash(code_char($int$159), cnt, list($str176$Control_Meta__, $str177$c_m__));
        sethash(code_char($int$160), cnt, list($str179$Meta_Space, $str180$m_Space));
        sethash(code_char($int$161), cnt, list($str182$Meta__, $str183$m__));
        sethash(code_char($int$162), cnt, list($str185$Meta__, $str186$m__));
        sethash(code_char($int$163), cnt, list($str188$Meta__, $str189$m__));
        sethash(code_char($int$164), cnt, list($str191$Meta__, $str192$m__));
        sethash(code_char($int$165), cnt, list($str194$Meta__, $str195$m__));
        sethash(code_char($int$166), cnt, list($str197$Meta__, $str198$m__));
        sethash(code_char($int$167), cnt, list($str200$Meta__, $str201$m__));
        sethash(code_char($int$168), cnt, list($str203$Meta__, $str204$m__));
        sethash(code_char($int$169), cnt, list($str206$Meta__, $str207$m__));
        sethash(code_char($int$170), cnt, list($str209$Meta__, $str210$m__));
        sethash(code_char($int$171), cnt, list($str212$Meta__, $str213$m__));
        sethash(code_char($int$172), cnt, list($str215$Meta__, $str216$m__));
        sethash(code_char($int$173), cnt, list($str218$Meta__, $str219$m__));
        sethash(code_char($int$174), cnt, list($str221$Meta__, $str222$m__));
        sethash(code_char($int$175), cnt, list($str224$Meta__, $str225$m__));
        sethash(code_char($int$176), cnt, list($str227$Meta_0, $str228$m_0));
        sethash(code_char($int$177), cnt, list($str230$Meta_1, $str231$m_1));
        sethash(code_char($int$178), cnt, list($str233$Meta_2, $str234$m_2));
        sethash(code_char($int$179), cnt, list($str236$Meta_3, $str237$m_3));
        sethash(code_char($int$180), cnt, list($str239$Meta_4, $str240$m_4));
        sethash(code_char($int$181), cnt, list($str242$Meta_5, $str243$m_5));
        sethash(code_char($int$182), cnt, list($str245$Meta_6, $str246$m_6));
        sethash(code_char($int$183), cnt, list($str248$Meta_7, $str249$m_7));
        sethash(code_char($int$184), cnt, list($str251$Meta_8, $str252$m_8));
        sethash(code_char($int$185), cnt, list($str254$Meta_9, $str255$m_9));
        sethash(code_char($int$186), cnt, list($str257$Meta__, $str258$m__));
        sethash(code_char($int$187), cnt, list($str260$Meta__, $str261$m__));
        sethash(code_char($int$188), cnt, list($str263$Meta__, $str264$m__));
        sethash(code_char($int$189), cnt, list($str266$Meta__, $str267$m__));
        sethash(code_char($int$190), cnt, list($str269$Meta__, $str270$m__));
        sethash(code_char($int$191), cnt, list($str272$Meta__, $str273$m__));
        sethash(code_char($int$192), cnt, list($str275$Meta__, $str276$m__));
        sethash(code_char($int$193), cnt, list($str278$Meta_A, $str279$m_A));
        sethash(code_char($int$194), cnt, list($str281$Meta_B, $str282$m_B));
        sethash(code_char($int$195), cnt, list($str284$Meta_C, $str285$m_C));
        sethash(code_char($int$196), cnt, list($str287$Meta_D, $str288$m_D));
        sethash(code_char($int$197), cnt, list($str290$Meta_E, $str291$m_E));
        sethash(code_char($int$198), cnt, list($str293$Meta_F, $str294$m_F));
        sethash(code_char($int$199), cnt, list($str296$Meta_G, $str297$m_G));
        sethash(code_char($int$200), cnt, list($str299$Meta_H, $str300$m_H));
        sethash(code_char($int$201), cnt, list($str302$Meta_I, $str303$m_I));
        sethash(code_char($int$202), cnt, list($str305$Meta_J, $str306$m_J));
        sethash(code_char($int$203), cnt, list($str308$Meta_K, $str309$m_K));
        sethash(code_char($int$204), cnt, list($str311$Meta_L, $str312$m_L));
        sethash(code_char($int$205), cnt, list($str314$Meta_M, $str315$m_M));
        sethash(code_char($int$206), cnt, list($str317$Meta_N, $str318$m_N));
        sethash(code_char($int$207), cnt, list($str320$Meta_O, $str321$m_O));
        sethash(code_char($int$208), cnt, list($str323$Meta_P, $str324$m_P));
        sethash(code_char($int$209), cnt, list($str326$Meta_Q, $str327$m_Q));
        sethash(code_char($int$210), cnt, list($str329$Meta_R, $str330$m_R));
        sethash(code_char($int$211), cnt, list($str332$Meta_S, $str333$m_S));
        sethash(code_char($int$212), cnt, list($str335$Meta_T, $str336$m_T));
        sethash(code_char($int$213), cnt, list($str338$Meta_U, $str339$m_U));
        sethash(code_char($int$214), cnt, list($str341$Meta_V, $str342$m_V));
        sethash(code_char($int$215), cnt, list($str344$Meta_W, $str345$m_W));
        sethash(code_char($int$216), cnt, list($str347$Meta_X, $str348$m_X));
        sethash(code_char($int$217), cnt, list($str350$Meta_Y, $str351$m_Y));
        sethash(code_char($int$218), cnt, list($str353$Meta_Z, $str354$m_Z));
        sethash(code_char($int$219), cnt, list($str356$Meta__, $str357$m__));
        sethash(code_char($int$220), cnt, list($str359$Meta__, $str360$m__));
        sethash(code_char($int$221), cnt, list($str362$Meta__, $str363$m__));
        sethash(code_char($int$222), cnt, list($str365$Meta__, $str366$m__));
        sethash(code_char($int$223), cnt, list($str368$Meta__, $str369$m__));
        sethash(code_char($int$224), cnt, list($str371$Meta__, $str372$m__));
        sethash(code_char($int$225), cnt, list($str374$Meta_a, $str375$m_a));
        sethash(code_char($int$226), cnt, list($str377$Meta_b, $str378$m_b));
        sethash(code_char($int$227), cnt, list($str380$Meta_c, $str381$m_c));
        sethash(code_char($int$228), cnt, list($str383$Meta_d, $str384$m_d));
        sethash(code_char($int$229), cnt, list($str386$Meta_e, $str387$m_e));
        sethash(code_char($int$230), cnt, list($str389$Meta_f, $str390$m_f));
        sethash(code_char($int$231), cnt, list($str392$Meta_g, $str393$m_g));
        sethash(code_char($int$232), cnt, list($str395$Meta_h, $str396$m_h));
        sethash(code_char($int$233), cnt, list($str398$Meta_i, $str399$m_i));
        sethash(code_char($int$234), cnt, list($str401$Meta_j, $str402$m_j));
        sethash(code_char($int$235), cnt, list($str404$Meta_k, $str405$m_k));
        sethash(code_char($int$236), cnt, list($str407$Meta_l, $str408$m_l));
        sethash(code_char($int$237), cnt, list($str410$Meta_m, $str411$m_m));
        sethash(code_char($int$238), cnt, list($str413$Meta_n, $str414$m_n));
        sethash(code_char($int$239), cnt, list($str416$Meta_o, $str417$m_o));
        sethash(code_char($int$240), cnt, list($str419$Meta_p, $str420$m_p));
        sethash(code_char($int$241), cnt, list($str422$Meta_q, $str423$m_q));
        sethash(code_char($int$242), cnt, list($str425$Meta_r, $str426$m_r));
        sethash(code_char($int$243), cnt, list($str428$Meta_s, $str429$m_s));
        sethash(code_char($int$244), cnt, list($str431$Meta_t, $str432$m_t));
        sethash(code_char($int$245), cnt, list($str434$Meta_u, $str435$m_u));
        sethash(code_char($int$246), cnt, list($str437$Meta_v, $str438$m_v));
        sethash(code_char($int$247), cnt, list($str440$Meta_w, $str441$m_w));
        sethash(code_char($int$248), cnt, list($str443$Meta_x, $str444$m_x));
        sethash(code_char($int$249), cnt, list($str446$Meta_y, $str447$m_y));
        sethash(code_char($int$250), cnt, list($str449$Meta_z, $str450$m_z));
        sethash(code_char($int$251), cnt, list($str452$Meta__, $str453$m__));
        sethash(code_char($int$252), cnt, list($str455$Meta__, $str456$m__));
        sethash(code_char($int$253), cnt, list($str458$Meta__, $str459$m__));
        sethash(code_char($int$254), cnt, list($str461$Meta__, $str462$m__));
        sethash(code_char($int$255), cnt, list($str464$Meta_Rubout, $str465$m_Rubout));
        SubLObject cdohash_table = cnt;
        SubLObject character = SubLNil.NIL;
        SubLObject names = SubLNil.NIL;
        Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                character = getEntryKey(cdohash_entry);
                SubLObject cdolist_list_var;
                names = cdolist_list_var = getEntryValue(cdohash_entry);
                SubLObject name = SubLNil.NIL;
                name = cdolist_list_var.first();
                while (SubLNil.NIL != cdolist_list_var) {
                    sethash(name, $name_character_table$.getDynamicValue(), character);
                    cdolist_list_var = cdolist_list_var.rest();
                    name = cdolist_list_var.first();
                } 
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return SubLNil.NIL;
    }

    public static final SubLFile me = new character_names();

    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.character_names";

    // defvar
    // Definitions
    private static final SubLSymbol $character_names_table$ = makeSymbol("*CHARACTER-NAMES-TABLE*");

    // defvar
    private static final SubLSymbol $name_character_table$ = makeSymbol("*NAME-CHARACTER-TABLE*");



    public static final SubLString $$$Null = makeString("Null");

    public static final SubLString $$$NUL = makeString("NUL");

    public static final SubLString $str3$Control_a = makeString("Control-a");

    public static final SubLString $str4$c_a = makeString("c-a");

    public static final SubLString $str5$Control_b = makeString("Control-b");

    public static final SubLString $str6$c_b = makeString("c-b");

    public static final SubLString $str7$Control_c = makeString("Control-c");

    public static final SubLString $str8$c_c = makeString("c-c");

    public static final SubLString $str9$Control_d = makeString("Control-d");

    public static final SubLString $str10$c_d = makeString("c-d");

    public static final SubLString $str11$Control_e = makeString("Control-e");

    public static final SubLString $str12$c_e = makeString("c-e");

    public static final SubLString $str13$Control_f = makeString("Control-f");

    public static final SubLString $str14$c_f = makeString("c-f");

    public static final SubLString $$$Bell = makeString("Bell");

    public static final SubLString $$$BEL = makeString("BEL");

    public static final SubLString $$$Backspace = makeString("Backspace");

    public static final SubLString $$$BS = makeString("BS");

    public static final SubLString $$$Tab = makeString("Tab");

    public static final SubLString $$$HT = makeString("HT");

    public static final SubLString $$$Newline = makeString("Newline");

    public static final SubLString $$$Linefeed = makeString("Linefeed");

    public static final SubLString $str23$Vertical_Tab = makeString("Vertical-Tab");

    public static final SubLString $$$VT = makeString("VT");

    public static final SubLString $$$Page = makeString("Page");

    public static final SubLString $$$FF = makeString("FF");

    public static final SubLString $$$Return = makeString("Return");

    public static final SubLString $$$CR = makeString("CR");

    public static final SubLString $str29$Control_n = makeString("Control-n");

    public static final SubLString $str30$c_n = makeString("c-n");

    public static final SubLString $str31$Control_o = makeString("Control-o");

    public static final SubLString $str32$c_o = makeString("c-o");

    public static final SubLString $str33$Control_p = makeString("Control-p");

    public static final SubLString $str34$c_p = makeString("c-p");

    public static final SubLString $str35$Control_q = makeString("Control-q");

    public static final SubLString $str36$c_q = makeString("c-q");

    public static final SubLString $str37$Control_r = makeString("Control-r");

    public static final SubLString $str38$c_r = makeString("c-r");

    public static final SubLString $str39$Control_s = makeString("Control-s");

    public static final SubLString $str40$c_s = makeString("c-s");

    public static final SubLString $str41$Control_t = makeString("Control-t");

    public static final SubLString $str42$c_t = makeString("c-t");

    private static final SubLInteger $int$21 = makeInteger(21);

    public static final SubLString $str44$Control_u = makeString("Control-u");

    public static final SubLString $str45$c_u = makeString("c-u");

    private static final SubLInteger $int$22 = makeInteger(22);

    public static final SubLString $str47$Control_v = makeString("Control-v");

    public static final SubLString $str48$c_v = makeString("c-v");

    private static final SubLInteger $int$23 = makeInteger(23);

    public static final SubLString $str50$Control_w = makeString("Control-w");

    public static final SubLString $str51$c_w = makeString("c-w");

    private static final SubLInteger $int$24 = makeInteger(24);

    public static final SubLString $str53$Control_x = makeString("Control-x");

    public static final SubLString $str54$c_x = makeString("c-x");

    private static final SubLInteger $int$25 = makeInteger(25);

    public static final SubLString $str56$Control_y = makeString("Control-y");

    public static final SubLString $str57$c_y = makeString("c-y");

    private static final SubLInteger $int$26 = makeInteger(26);

    public static final SubLString $str59$Control_z = makeString("Control-z");

    public static final SubLString $str60$c_z = makeString("c-z");

    private static final SubLInteger $int$27 = makeInteger(27);

    public static final SubLString $$$Escape = makeString("Escape");

    public static final SubLString $$$ESC = makeString("ESC");

    private static final SubLInteger $int$28 = makeInteger(28);

    public static final SubLString $str65$Control__ = makeString("Control-\\");

    public static final SubLString $str66$c__ = makeString("c-\\");

    private static final SubLInteger $int$29 = makeInteger(29);

    public static final SubLString $str68$Control__ = makeString("Control-]");

    public static final SubLString $str69$c__ = makeString("c-]");

    private static final SubLInteger $int$30 = makeInteger(30);

    public static final SubLString $str71$Control__ = makeString("Control-^");

    public static final SubLString $str72$c__ = makeString("c-^");

    private static final SubLInteger $int$31 = makeInteger(31);

    public static final SubLString $str74$Control__ = makeString("Control-_");

    public static final SubLString $str75$c__ = makeString("c-_");



    public static final SubLString $$$Space = makeString("Space");

    public static final SubLString $$$SP = makeString("SP");

    private static final SubLInteger $int$127 = makeInteger(127);

    public static final SubLString $$$Rubout = makeString("Rubout");

    public static final SubLString $$$DEL = makeString("DEL");

    private static final SubLInteger $int$128 = makeInteger(128);

    public static final SubLString $str83$Meta_Null = makeString("Meta-Null");

    public static final SubLString $str84$m_Null = makeString("m-Null");

    private static final SubLInteger $int$129 = makeInteger(129);

    public static final SubLString $str86$Control_Meta_a = makeString("Control-Meta-a");

    public static final SubLString $str87$c_m_a = makeString("c-m-a");

    private static final SubLInteger $int$130 = makeInteger(130);

    public static final SubLString $str89$Control_Meta_b = makeString("Control-Meta-b");

    public static final SubLString $str90$c_m_b = makeString("c-m-b");

    private static final SubLInteger $int$131 = makeInteger(131);

    public static final SubLString $str92$Control_Meta_c = makeString("Control-Meta-c");

    public static final SubLString $str93$c_m_c = makeString("c-m-c");

    private static final SubLInteger $int$132 = makeInteger(132);

    public static final SubLString $str95$Control_Meta_d = makeString("Control-Meta-d");

    public static final SubLString $str96$c_m_d = makeString("c-m-d");

    private static final SubLInteger $int$133 = makeInteger(133);

    public static final SubLString $str98$Control_Meta_e = makeString("Control-Meta-e");

    public static final SubLString $str99$c_m_e = makeString("c-m-e");

    private static final SubLInteger $int$134 = makeInteger(134);

    public static final SubLString $str101$Control_Meta_f = makeString("Control-Meta-f");

    public static final SubLString $str102$c_m_f = makeString("c-m-f");

    private static final SubLInteger $int$135 = makeInteger(135);

    public static final SubLString $str104$Meta_Bell = makeString("Meta-Bell");

    public static final SubLString $str105$m_Bell = makeString("m-Bell");

    private static final SubLInteger $int$136 = makeInteger(136);

    public static final SubLString $str107$Meta_Backspace = makeString("Meta-Backspace");

    public static final SubLString $str108$m_Backspace = makeString("m-Backspace");

    private static final SubLInteger $int$137 = makeInteger(137);

    public static final SubLString $str110$Meta_Tab = makeString("Meta-Tab");

    public static final SubLString $str111$m_Tab = makeString("m-Tab");

    private static final SubLInteger $int$138 = makeInteger(138);

    public static final SubLString $str113$Meta_Newline = makeString("Meta-Newline");

    public static final SubLString $str114$m_Newline = makeString("m-Newline");

    private static final SubLInteger $int$139 = makeInteger(139);

    public static final SubLString $str116$Meta_Vertical_Tab = makeString("Meta-Vertical-Tab");

    public static final SubLString $str117$m_Vertical_Tab = makeString("m-Vertical-Tab");

    private static final SubLInteger $int$140 = makeInteger(140);

    public static final SubLString $str119$Meta_Page = makeString("Meta-Page");

    public static final SubLString $str120$m_Page = makeString("m-Page");

    private static final SubLInteger $int$141 = makeInteger(141);

    public static final SubLString $str122$Meta_Return = makeString("Meta-Return");

    public static final SubLString $str123$m_Return = makeString("m-Return");

    private static final SubLInteger $int$142 = makeInteger(142);

    public static final SubLString $str125$Control_Meta_n = makeString("Control-Meta-n");

    public static final SubLString $str126$c_m_n = makeString("c-m-n");

    private static final SubLInteger $int$143 = makeInteger(143);

    public static final SubLString $str128$Control_Meta_o = makeString("Control-Meta-o");

    public static final SubLString $str129$c_m_o = makeString("c-m-o");

    private static final SubLInteger $int$144 = makeInteger(144);

    public static final SubLString $str131$Control_Meta_p = makeString("Control-Meta-p");

    public static final SubLString $str132$c_m_p = makeString("c-m-p");

    private static final SubLInteger $int$145 = makeInteger(145);

    public static final SubLString $str134$Control_Meta_q = makeString("Control-Meta-q");

    public static final SubLString $str135$c_m_q = makeString("c-m-q");

    private static final SubLInteger $int$146 = makeInteger(146);

    public static final SubLString $str137$Control_Meta_r = makeString("Control-Meta-r");

    public static final SubLString $str138$c_m_r = makeString("c-m-r");

    private static final SubLInteger $int$147 = makeInteger(147);

    public static final SubLString $str140$Control_Meta_s = makeString("Control-Meta-s");

    public static final SubLString $str141$c_m_s = makeString("c-m-s");

    private static final SubLInteger $int$148 = makeInteger(148);

    public static final SubLString $str143$Control_Meta_t = makeString("Control-Meta-t");

    public static final SubLString $str144$c_m_t = makeString("c-m-t");

    private static final SubLInteger $int$149 = makeInteger(149);

    public static final SubLString $str146$Control_Meta_u = makeString("Control-Meta-u");

    public static final SubLString $str147$c_m_u = makeString("c-m-u");

    private static final SubLInteger $int$150 = makeInteger(150);

    public static final SubLString $str149$Control_Meta_v = makeString("Control-Meta-v");

    public static final SubLString $str150$c_m_v = makeString("c-m-v");

    private static final SubLInteger $int$151 = makeInteger(151);

    public static final SubLString $str152$Control_Meta_w = makeString("Control-Meta-w");

    public static final SubLString $str153$c_m_w = makeString("c-m-w");

    private static final SubLInteger $int$152 = makeInteger(152);

    public static final SubLString $str155$Control_Meta_x = makeString("Control-Meta-x");

    public static final SubLString $str156$c_m_x = makeString("c-m-x");

    private static final SubLInteger $int$153 = makeInteger(153);

    public static final SubLString $str158$Control_Meta_y = makeString("Control-Meta-y");

    public static final SubLString $str159$c_m_y = makeString("c-m-y");

    private static final SubLInteger $int$154 = makeInteger(154);

    public static final SubLString $str161$Control_Meta_z = makeString("Control-Meta-z");

    public static final SubLString $str162$c_m_z = makeString("c-m-z");

    private static final SubLInteger $int$155 = makeInteger(155);

    public static final SubLString $str164$Meta_Escape = makeString("Meta-Escape");

    public static final SubLString $str165$m_Escape = makeString("m-Escape");

    private static final SubLInteger $int$156 = makeInteger(156);

    public static final SubLString $str167$Control_Meta__ = makeString("Control-Meta-\\");

    public static final SubLString $str168$c_m__ = makeString("c-m-\\");

    private static final SubLInteger $int$157 = makeInteger(157);

    public static final SubLString $str170$Control_Meta__ = makeString("Control-Meta-]");

    public static final SubLString $str171$c_m__ = makeString("c-m-]");

    private static final SubLInteger $int$158 = makeInteger(158);

    public static final SubLString $str173$Control_Meta__ = makeString("Control-Meta-^");

    public static final SubLString $str174$c_m__ = makeString("c-m-^");

    private static final SubLInteger $int$159 = makeInteger(159);

    public static final SubLString $str176$Control_Meta__ = makeString("Control-Meta-_");

    public static final SubLString $str177$c_m__ = makeString("c-m-_");

    private static final SubLInteger $int$160 = makeInteger(160);

    public static final SubLString $str179$Meta_Space = makeString("Meta-Space");

    public static final SubLString $str180$m_Space = makeString("m-Space");

    private static final SubLInteger $int$161 = makeInteger(161);

    public static final SubLString $str182$Meta__ = makeString("Meta-!");

    public static final SubLString $str183$m__ = makeString("m-!");

    private static final SubLInteger $int$162 = makeInteger(162);

    public static final SubLString $str185$Meta__ = makeString("Meta-\"");

    public static final SubLString $str186$m__ = makeString("m-\"");

    private static final SubLInteger $int$163 = makeInteger(163);

    public static final SubLString $str188$Meta__ = makeString("Meta-#");

    public static final SubLString $str189$m__ = makeString("m-#");

    private static final SubLInteger $int$164 = makeInteger(164);

    public static final SubLString $str191$Meta__ = makeString("Meta-$");

    public static final SubLString $str192$m__ = makeString("m-$");

    private static final SubLInteger $int$165 = makeInteger(165);

    public static final SubLString $str194$Meta__ = makeString("Meta-%");

    public static final SubLString $str195$m__ = makeString("m-%");

    private static final SubLInteger $int$166 = makeInteger(166);

    public static final SubLString $str197$Meta__ = makeString("Meta-&");

    public static final SubLString $str198$m__ = makeString("m-&");

    private static final SubLInteger $int$167 = makeInteger(167);

    public static final SubLString $str200$Meta__ = makeString("Meta-'");

    public static final SubLString $str201$m__ = makeString("m-'");

    private static final SubLInteger $int$168 = makeInteger(168);

    public static final SubLString $str203$Meta__ = makeString("Meta-(");

    public static final SubLString $str204$m__ = makeString("m-(");

    private static final SubLInteger $int$169 = makeInteger(169);

    public static final SubLString $str206$Meta__ = makeString("Meta-)");

    public static final SubLString $str207$m__ = makeString("m-)");

    private static final SubLInteger $int$170 = makeInteger(170);

    public static final SubLString $str209$Meta__ = makeString("Meta-*");

    public static final SubLString $str210$m__ = makeString("m-*");

    private static final SubLInteger $int$171 = makeInteger(171);

    public static final SubLString $str212$Meta__ = makeString("Meta-+");

    public static final SubLString $str213$m__ = makeString("m-+");

    private static final SubLInteger $int$172 = makeInteger(172);

    public static final SubLString $str215$Meta__ = makeString("Meta-,");

    public static final SubLString $str216$m__ = makeString("m-,");

    private static final SubLInteger $int$173 = makeInteger(173);

    public static final SubLString $str218$Meta__ = makeString("Meta--");

    public static final SubLString $str219$m__ = makeString("m--");

    private static final SubLInteger $int$174 = makeInteger(174);

    public static final SubLString $str221$Meta__ = makeString("Meta-.");

    public static final SubLString $str222$m__ = makeString("m-.");

    private static final SubLInteger $int$175 = makeInteger(175);

    public static final SubLString $str224$Meta__ = makeString("Meta-/");

    public static final SubLString $str225$m__ = makeString("m-/");

    private static final SubLInteger $int$176 = makeInteger(176);

    public static final SubLString $str227$Meta_0 = makeString("Meta-0");

    public static final SubLString $str228$m_0 = makeString("m-0");

    private static final SubLInteger $int$177 = makeInteger(177);

    public static final SubLString $str230$Meta_1 = makeString("Meta-1");

    public static final SubLString $str231$m_1 = makeString("m-1");

    private static final SubLInteger $int$178 = makeInteger(178);

    public static final SubLString $str233$Meta_2 = makeString("Meta-2");

    public static final SubLString $str234$m_2 = makeString("m-2");

    private static final SubLInteger $int$179 = makeInteger(179);

    public static final SubLString $str236$Meta_3 = makeString("Meta-3");

    public static final SubLString $str237$m_3 = makeString("m-3");

    private static final SubLInteger $int$180 = makeInteger(180);

    public static final SubLString $str239$Meta_4 = makeString("Meta-4");

    public static final SubLString $str240$m_4 = makeString("m-4");

    private static final SubLInteger $int$181 = makeInteger(181);

    public static final SubLString $str242$Meta_5 = makeString("Meta-5");

    public static final SubLString $str243$m_5 = makeString("m-5");

    private static final SubLInteger $int$182 = makeInteger(182);

    public static final SubLString $str245$Meta_6 = makeString("Meta-6");

    public static final SubLString $str246$m_6 = makeString("m-6");

    private static final SubLInteger $int$183 = makeInteger(183);

    public static final SubLString $str248$Meta_7 = makeString("Meta-7");

    public static final SubLString $str249$m_7 = makeString("m-7");

    private static final SubLInteger $int$184 = makeInteger(184);

    public static final SubLString $str251$Meta_8 = makeString("Meta-8");

    public static final SubLString $str252$m_8 = makeString("m-8");

    private static final SubLInteger $int$185 = makeInteger(185);

    public static final SubLString $str254$Meta_9 = makeString("Meta-9");

    public static final SubLString $str255$m_9 = makeString("m-9");

    private static final SubLInteger $int$186 = makeInteger(186);

    public static final SubLString $str257$Meta__ = makeString("Meta-:");

    public static final SubLString $str258$m__ = makeString("m-:");

    private static final SubLInteger $int$187 = makeInteger(187);

    public static final SubLString $str260$Meta__ = makeString("Meta-;");

    public static final SubLString $str261$m__ = makeString("m-;");

    private static final SubLInteger $int$188 = makeInteger(188);

    public static final SubLString $str263$Meta__ = makeString("Meta-<");

    public static final SubLString $str264$m__ = makeString("m-<");

    private static final SubLInteger $int$189 = makeInteger(189);

    public static final SubLString $str266$Meta__ = makeString("Meta-=");

    public static final SubLString $str267$m__ = makeString("m-=");

    private static final SubLInteger $int$190 = makeInteger(190);

    public static final SubLString $str269$Meta__ = makeString("Meta->");

    public static final SubLString $str270$m__ = makeString("m->");

    private static final SubLInteger $int$191 = makeInteger(191);

    public static final SubLString $str272$Meta__ = makeString("Meta-?");

    public static final SubLString $str273$m__ = makeString("m-?");

    private static final SubLInteger $int$192 = makeInteger(192);

    public static final SubLString $str275$Meta__ = makeString("Meta-@");

    public static final SubLString $str276$m__ = makeString("m-@");

    private static final SubLInteger $int$193 = makeInteger(193);

    public static final SubLString $str278$Meta_A = makeString("Meta-A");

    public static final SubLString $str279$m_A = makeString("m-A");

    private static final SubLInteger $int$194 = makeInteger(194);

    public static final SubLString $str281$Meta_B = makeString("Meta-B");

    public static final SubLString $str282$m_B = makeString("m-B");

    private static final SubLInteger $int$195 = makeInteger(195);

    public static final SubLString $str284$Meta_C = makeString("Meta-C");

    public static final SubLString $str285$m_C = makeString("m-C");

    private static final SubLInteger $int$196 = makeInteger(196);

    public static final SubLString $str287$Meta_D = makeString("Meta-D");

    public static final SubLString $str288$m_D = makeString("m-D");

    private static final SubLInteger $int$197 = makeInteger(197);

    public static final SubLString $str290$Meta_E = makeString("Meta-E");

    public static final SubLString $str291$m_E = makeString("m-E");

    private static final SubLInteger $int$198 = makeInteger(198);

    public static final SubLString $str293$Meta_F = makeString("Meta-F");

    public static final SubLString $str294$m_F = makeString("m-F");

    private static final SubLInteger $int$199 = makeInteger(199);

    public static final SubLString $str296$Meta_G = makeString("Meta-G");

    public static final SubLString $str297$m_G = makeString("m-G");

    private static final SubLInteger $int$200 = makeInteger(200);

    public static final SubLString $str299$Meta_H = makeString("Meta-H");

    public static final SubLString $str300$m_H = makeString("m-H");

    private static final SubLInteger $int$201 = makeInteger(201);

    public static final SubLString $str302$Meta_I = makeString("Meta-I");

    public static final SubLString $str303$m_I = makeString("m-I");

    private static final SubLInteger $int$202 = makeInteger(202);

    public static final SubLString $str305$Meta_J = makeString("Meta-J");

    public static final SubLString $str306$m_J = makeString("m-J");

    private static final SubLInteger $int$203 = makeInteger(203);

    public static final SubLString $str308$Meta_K = makeString("Meta-K");

    public static final SubLString $str309$m_K = makeString("m-K");

    private static final SubLInteger $int$204 = makeInteger(204);

    public static final SubLString $str311$Meta_L = makeString("Meta-L");

    public static final SubLString $str312$m_L = makeString("m-L");

    private static final SubLInteger $int$205 = makeInteger(205);

    public static final SubLString $str314$Meta_M = makeString("Meta-M");

    public static final SubLString $str315$m_M = makeString("m-M");

    private static final SubLInteger $int$206 = makeInteger(206);

    public static final SubLString $str317$Meta_N = makeString("Meta-N");

    public static final SubLString $str318$m_N = makeString("m-N");

    private static final SubLInteger $int$207 = makeInteger(207);

    public static final SubLString $str320$Meta_O = makeString("Meta-O");

    public static final SubLString $str321$m_O = makeString("m-O");

    private static final SubLInteger $int$208 = makeInteger(208);

    public static final SubLString $str323$Meta_P = makeString("Meta-P");

    public static final SubLString $str324$m_P = makeString("m-P");

    private static final SubLInteger $int$209 = makeInteger(209);

    public static final SubLString $str326$Meta_Q = makeString("Meta-Q");

    public static final SubLString $str327$m_Q = makeString("m-Q");

    private static final SubLInteger $int$210 = makeInteger(210);

    public static final SubLString $str329$Meta_R = makeString("Meta-R");

    public static final SubLString $str330$m_R = makeString("m-R");

    private static final SubLInteger $int$211 = makeInteger(211);

    public static final SubLString $str332$Meta_S = makeString("Meta-S");

    public static final SubLString $str333$m_S = makeString("m-S");

    private static final SubLInteger $int$212 = makeInteger(212);

    public static final SubLString $str335$Meta_T = makeString("Meta-T");

    public static final SubLString $str336$m_T = makeString("m-T");

    private static final SubLInteger $int$213 = makeInteger(213);

    public static final SubLString $str338$Meta_U = makeString("Meta-U");

    public static final SubLString $str339$m_U = makeString("m-U");

    private static final SubLInteger $int$214 = makeInteger(214);

    public static final SubLString $str341$Meta_V = makeString("Meta-V");

    public static final SubLString $str342$m_V = makeString("m-V");

    private static final SubLInteger $int$215 = makeInteger(215);

    public static final SubLString $str344$Meta_W = makeString("Meta-W");

    public static final SubLString $str345$m_W = makeString("m-W");

    private static final SubLInteger $int$216 = makeInteger(216);

    public static final SubLString $str347$Meta_X = makeString("Meta-X");

    public static final SubLString $str348$m_X = makeString("m-X");

    private static final SubLInteger $int$217 = makeInteger(217);

    public static final SubLString $str350$Meta_Y = makeString("Meta-Y");

    public static final SubLString $str351$m_Y = makeString("m-Y");

    private static final SubLInteger $int$218 = makeInteger(218);

    public static final SubLString $str353$Meta_Z = makeString("Meta-Z");

    public static final SubLString $str354$m_Z = makeString("m-Z");

    private static final SubLInteger $int$219 = makeInteger(219);

    public static final SubLString $str356$Meta__ = makeString("Meta-[");

    public static final SubLString $str357$m__ = makeString("m-[");

    private static final SubLInteger $int$220 = makeInteger(220);

    public static final SubLString $str359$Meta__ = makeString("Meta-\\");

    public static final SubLString $str360$m__ = makeString("m-\\");

    private static final SubLInteger $int$221 = makeInteger(221);

    public static final SubLString $str362$Meta__ = makeString("Meta-]");

    public static final SubLString $str363$m__ = makeString("m-]");

    private static final SubLInteger $int$222 = makeInteger(222);

    public static final SubLString $str365$Meta__ = makeString("Meta-^");

    public static final SubLString $str366$m__ = makeString("m-^");

    private static final SubLInteger $int$223 = makeInteger(223);

    public static final SubLString $str368$Meta__ = makeString("Meta-_");

    public static final SubLString $str369$m__ = makeString("m-_");

    private static final SubLInteger $int$224 = makeInteger(224);

    public static final SubLString $str371$Meta__ = makeString("Meta-`");

    public static final SubLString $str372$m__ = makeString("m-`");

    private static final SubLInteger $int$225 = makeInteger(225);

    public static final SubLString $str374$Meta_a = makeString("Meta-a");

    public static final SubLString $str375$m_a = makeString("m-a");

    private static final SubLInteger $int$226 = makeInteger(226);

    public static final SubLString $str377$Meta_b = makeString("Meta-b");

    public static final SubLString $str378$m_b = makeString("m-b");

    private static final SubLInteger $int$227 = makeInteger(227);

    public static final SubLString $str380$Meta_c = makeString("Meta-c");

    public static final SubLString $str381$m_c = makeString("m-c");

    private static final SubLInteger $int$228 = makeInteger(228);

    public static final SubLString $str383$Meta_d = makeString("Meta-d");

    public static final SubLString $str384$m_d = makeString("m-d");

    private static final SubLInteger $int$229 = makeInteger(229);

    public static final SubLString $str386$Meta_e = makeString("Meta-e");

    public static final SubLString $str387$m_e = makeString("m-e");

    private static final SubLInteger $int$230 = makeInteger(230);

    public static final SubLString $str389$Meta_f = makeString("Meta-f");

    public static final SubLString $str390$m_f = makeString("m-f");

    private static final SubLInteger $int$231 = makeInteger(231);

    public static final SubLString $str392$Meta_g = makeString("Meta-g");

    public static final SubLString $str393$m_g = makeString("m-g");

    private static final SubLInteger $int$232 = makeInteger(232);

    public static final SubLString $str395$Meta_h = makeString("Meta-h");

    public static final SubLString $str396$m_h = makeString("m-h");

    private static final SubLInteger $int$233 = makeInteger(233);

    public static final SubLString $str398$Meta_i = makeString("Meta-i");

    public static final SubLString $str399$m_i = makeString("m-i");

    private static final SubLInteger $int$234 = makeInteger(234);

    public static final SubLString $str401$Meta_j = makeString("Meta-j");

    public static final SubLString $str402$m_j = makeString("m-j");

    private static final SubLInteger $int$235 = makeInteger(235);

    public static final SubLString $str404$Meta_k = makeString("Meta-k");

    public static final SubLString $str405$m_k = makeString("m-k");

    private static final SubLInteger $int$236 = makeInteger(236);

    public static final SubLString $str407$Meta_l = makeString("Meta-l");

    public static final SubLString $str408$m_l = makeString("m-l");

    private static final SubLInteger $int$237 = makeInteger(237);

    public static final SubLString $str410$Meta_m = makeString("Meta-m");

    public static final SubLString $str411$m_m = makeString("m-m");

    private static final SubLInteger $int$238 = makeInteger(238);

    public static final SubLString $str413$Meta_n = makeString("Meta-n");

    public static final SubLString $str414$m_n = makeString("m-n");

    private static final SubLInteger $int$239 = makeInteger(239);

    public static final SubLString $str416$Meta_o = makeString("Meta-o");

    public static final SubLString $str417$m_o = makeString("m-o");

    private static final SubLInteger $int$240 = makeInteger(240);

    public static final SubLString $str419$Meta_p = makeString("Meta-p");

    public static final SubLString $str420$m_p = makeString("m-p");

    private static final SubLInteger $int$241 = makeInteger(241);

    public static final SubLString $str422$Meta_q = makeString("Meta-q");

    public static final SubLString $str423$m_q = makeString("m-q");

    private static final SubLInteger $int$242 = makeInteger(242);

    public static final SubLString $str425$Meta_r = makeString("Meta-r");

    public static final SubLString $str426$m_r = makeString("m-r");

    private static final SubLInteger $int$243 = makeInteger(243);

    public static final SubLString $str428$Meta_s = makeString("Meta-s");

    public static final SubLString $str429$m_s = makeString("m-s");

    private static final SubLInteger $int$244 = makeInteger(244);

    public static final SubLString $str431$Meta_t = makeString("Meta-t");

    public static final SubLString $str432$m_t = makeString("m-t");

    private static final SubLInteger $int$245 = makeInteger(245);

    public static final SubLString $str434$Meta_u = makeString("Meta-u");

    public static final SubLString $str435$m_u = makeString("m-u");

    private static final SubLInteger $int$246 = makeInteger(246);

    public static final SubLString $str437$Meta_v = makeString("Meta-v");

    public static final SubLString $str438$m_v = makeString("m-v");

    private static final SubLInteger $int$247 = makeInteger(247);

    public static final SubLString $str440$Meta_w = makeString("Meta-w");

    public static final SubLString $str441$m_w = makeString("m-w");

    private static final SubLInteger $int$248 = makeInteger(248);

    public static final SubLString $str443$Meta_x = makeString("Meta-x");

    public static final SubLString $str444$m_x = makeString("m-x");

    private static final SubLInteger $int$249 = makeInteger(249);

    public static final SubLString $str446$Meta_y = makeString("Meta-y");

    public static final SubLString $str447$m_y = makeString("m-y");

    private static final SubLInteger $int$250 = makeInteger(250);

    public static final SubLString $str449$Meta_z = makeString("Meta-z");

    public static final SubLString $str450$m_z = makeString("m-z");

    private static final SubLInteger $int$251 = makeInteger(251);

    public static final SubLString $str452$Meta__ = makeString("Meta-{");

    public static final SubLString $str453$m__ = makeString("m-{");

    private static final SubLInteger $int$252 = makeInteger(252);

    public static final SubLString $str455$Meta__ = makeString("Meta-|");

    public static final SubLString $str456$m__ = makeString("m-|");

    private static final SubLInteger $int$253 = makeInteger(253);

    public static final SubLString $str458$Meta__ = makeString("Meta-}");

    public static final SubLString $str459$m__ = makeString("m-}");

    private static final SubLInteger $int$254 = makeInteger(254);

    public static final SubLString $str461$Meta__ = makeString("Meta-~");

    public static final SubLString $str462$m__ = makeString("m-~");



    public static final SubLString $str464$Meta_Rubout = makeString("Meta-Rubout");

    public static final SubLString $str465$m_Rubout = makeString("m-Rubout");

    static {





















































































































































































































































































































































































































































































    }

    @Override
    public void declareFunctions() {
        declare_character_names_file();
    }

    @Override
    public void initializeVariables() {
        init_character_names_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_character_names_file();
    }
}

