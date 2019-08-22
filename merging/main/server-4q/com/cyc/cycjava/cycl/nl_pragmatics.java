/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NL-PRAGMATICS
 * source file: /cyc/top/cycl/nl-pragmatics.lisp
 * created:     2019/07/03 17:38:14
 */
public final class nl_pragmatics extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new nl_pragmatics();

    public static final String myName = "com.cyc.cycjava.cycl.nl_pragmatics";

    // Definitions
    /**
     *
     *
     * @return BOOLEANP; Is PRAGMATIC-ATTRIBUTE acceptable in the current dialog context?
     */
    @LispMethod(comment = "@return BOOLEANP; Is PRAGMATIC-ATTRIBUTE acceptable in the current dialog context?")
    public static final SubLObject pragmatically_acceptableP_alt(SubLObject pragmatic_attribute) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL != lexicon_vars.pragmatic_filter_activeP(lexicon_vars.$exclude_vulgaritiesP$.getDynamicValue(thread))) && (NIL != lexicon_accessors.potentially_offensive_politeness_levelP(pragmatic_attribute))) {
		return NIL;
	    } else {
		if ((NIL != lexicon_vars.pragmatic_filter_activeP(lexicon_vars.$exclude_slangP$.getDynamicValue(thread))) && ($$SlangSpeech == pragmatic_attribute)) {
		    return NIL;
		} else {
		    if ((NIL != lexicon_vars.pragmatic_filter_activeP(lexicon_vars.$exclude_archaic_speechP$.getDynamicValue(thread))) && ($$ArchaicSpeech == pragmatic_attribute)) {
			return NIL;
		    } else {
			return T;
		    }
		}
	    }
	}
    }

    /**
     *
     *
     * @return BOOLEANP; Is PRAGMATIC-ATTRIBUTE acceptable in the current dialog context?
     */
    @LispMethod(comment = "@return BOOLEANP; Is PRAGMATIC-ATTRIBUTE acceptable in the current dialog context?")
    public static SubLObject pragmatically_acceptableP(final SubLObject pragmatic_attribute) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL != lexicon_vars.lexicon_filter_activeP(lexicon_vars.$exclude_vulgaritiesP$.getDynamicValue(thread))) && (NIL != lexicon_accessors.potentially_offensive_politeness_levelP(pragmatic_attribute))) {
	    return NIL;
	}
	if ((NIL != lexicon_vars.lexicon_filter_activeP(lexicon_vars.$exclude_slangP$.getDynamicValue(thread))) && $$SlangSpeech.eql(pragmatic_attribute)) {
	    return NIL;
	}
	if ((NIL != lexicon_vars.lexicon_filter_activeP(lexicon_vars.$exclude_archaic_speechP$.getDynamicValue(thread))) && $$ArchaicSpeech.eql(pragmatic_attribute)) {
	    return NIL;
	}
	return T;
    }

    public static SubLObject declare_nl_pragmatics_file() {
	declareFunction("pragmatically_acceptableP", "PRAGMATICALLY-ACCEPTABLE?", 1, 0, false);
	return NIL;
    }

    public static SubLObject init_nl_pragmatics_file() {
	return NIL;
    }

    public static SubLObject setup_nl_pragmatics_file() {
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_nl_pragmatics_file();
    }

    @Override
    public void initializeVariables() {
	init_nl_pragmatics_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_nl_pragmatics_file();
    }
}

/**
 * Total time: 61 ms
 */
