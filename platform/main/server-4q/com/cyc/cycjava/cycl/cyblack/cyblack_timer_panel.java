/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.enumerations;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.subloop_collections;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-TIMER-PANEL
 *  source file: /cyc/top/cycl/cyblack/cyblack-timer-panel.lisp
 *  created:     2019/07/03 17:38:48
 */
public final class cyblack_timer_panel extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_timer_panel() {
    }

    public static final SubLFile me = new cyblack_timer_panel();


    // // Definitions
    /**
     * Enumerated values of type CYBLACK-TIME-INTERVAL.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_time_intervals$ = makeSymbol("*VALID-CYBLACK-TIME-INTERVALS*");

    /**
     * Returns a list of all valid members of the CYBLACK-TIME-INTERVAL enumeration.
     */
    public static final SubLObject valid_cyblack_time_intervals() {
        return $valid_cyblack_time_intervals$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-TIME-INTERVAL enumeration.
     */
    public static final SubLObject cyblack_time_interval_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_time_intervals$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-TIME-INTERVAL enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_time_interval(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_time_intervals$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_TIME_INTERVAL, value, CYBLACK_TIME_INTERVAL);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-TIME-INTERVAL enumeration.
     */
    public static final SubLObject decode_cyblack_time_interval(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_time_intervals$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_TIME_INTERVAL, value, CYBLACK_TIME_INTERVAL);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-TIME-INTERVAL enumeration.
     */
    public static final SubLObject cyblack_time_interval_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_time_interval_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_TIME_INTERVAL_P, value1, CYBLACK_TIME_INTERVAL);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_time_interval_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_TIME_INTERVAL_P, value2, CYBLACK_TIME_INTERVAL);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_time_intervals$.getGlobalValue();
                SubLObject value = NIL;
                for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                    if (value == value1) {
                        return makeBoolean(value != value2);
                    } else
                        if (value == value2) {
                            return NIL;
                        }

                }
            }
            return NIL;
        }
    }

    /**
     * Provides a GREATERP predicate for members of the CYBLACK-TIME-INTERVAL enumeration.
     */
    public static final SubLObject cyblack_time_interval_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_time_interval_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_TIME_INTERVAL_P, value1, CYBLACK_TIME_INTERVAL);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_time_interval_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_TIME_INTERVAL_P, value2, CYBLACK_TIME_INTERVAL);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_time_intervals$.getGlobalValue();
                SubLObject value = NIL;
                for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                    if (value == value2) {
                        return makeBoolean(value != value1);
                    } else
                        if (value == value1) {
                            return NIL;
                        }

                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_timer_interval_list_p(SubLObject v_object) {
        if (!v_object.isList()) {
            return NIL;
        }
        {
            SubLObject cdolist_list_var = v_object;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                if (NIL == cyblack_time_interval_p(element)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static final SubLObject cyblack_time_interval_to_seconds(SubLObject time_interval) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_time_interval_p(time_interval)) {
                    Errors.error($str_alt8$CYBLACK_TIME_INTERVAL_TO_SECONDS_, time_interval);
                }
            }
            {
                SubLObject pcase_var = time_interval;
                if (pcase_var.eql($SECOND)) {
                    return ONE_INTEGER;
                } else
                    if (pcase_var.eql($QUARTER_MINUTE)) {
                        return FIFTEEN_INTEGER;
                    } else
                        if (pcase_var.eql($HALF_MINUTE)) {
                            return $int$30;
                        } else
                            if (pcase_var.eql($MINUTE)) {
                                return $int$60;
                            } else
                                if (pcase_var.eql($QUARTER_HOUR)) {
                                    return $int$900;
                                } else
                                    if (pcase_var.eql($HALF_HOUR)) {
                                        return $int$1800;
                                    } else
                                        if (pcase_var.eql($HOUR)) {
                                            return $int$3600;
                                        } else
                                            if (pcase_var.eql($TWO_HOURS)) {
                                                return $int$7200;
                                            } else
                                                if (pcase_var.eql($THREE_HOURS)) {
                                                    return $int$10800;
                                                } else
                                                    if (pcase_var.eql($FOUR_HOURS)) {
                                                        return $int$14400;
                                                    } else
                                                        if (pcase_var.eql($FIVE_HOURS)) {
                                                            return $int$18000;
                                                        } else
                                                            if (pcase_var.eql($SIX_HOURS)) {
                                                                return $int$21600;
                                                            } else
                                                                if (pcase_var.eql($SEVEN_HOURS)) {
                                                                    return $int$25200;
                                                                } else
                                                                    if (pcase_var.eql($EIGHT_HOURS)) {
                                                                        return $int$28800;
                                                                    } else
                                                                        if (pcase_var.eql($NINE_HOURS)) {
                                                                            return $int$32400;
                                                                        } else
                                                                            if (pcase_var.eql($TEN_HOURS)) {
                                                                                return $int$36000;
                                                                            } else
                                                                                if (pcase_var.eql($ELEVEN_HOURS)) {
                                                                                    return $int$39600;
                                                                                } else
                                                                                    if (pcase_var.eql($HALF_DAY)) {
                                                                                        return $int$43200;
                                                                                    } else
                                                                                        if (pcase_var.eql($DAY)) {
                                                                                            return $int$86400;
                                                                                        } else
                                                                                            if (pcase_var.eql($WEEK)) {
                                                                                                return $int$604800;
                                                                                            } else
                                                                                                if (pcase_var.eql($MONTH)) {
                                                                                                    return $int$2592000;
                                                                                                } else
                                                                                                    if (pcase_var.eql($YEAR)) {
                                                                                                        return $int$31536000;
                                                                                                    } else {
                                                                                                        return NIL;
                                                                                                    }





















            }
        }
    }

    public static final SubLObject cyblack_time_interval_to_type_name(SubLObject time_interval) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_time_interval_p(time_interval)) {
                    Errors.error($str_alt51$CYBLACK_TIME_INTERVAL_TO_TYPE_NAM, time_interval);
                }
            }
            {
                SubLObject pcase_var = time_interval;
                if (pcase_var.eql($SECOND)) {
                    return $str_alt52$SECOND_TIMER;
                } else
                    if (pcase_var.eql($QUARTER_MINUTE)) {
                        return $str_alt53$QUARTER_MINUTE_TIMER;
                    } else
                        if (pcase_var.eql($HALF_MINUTE)) {
                            return $str_alt54$HALF_MINUTE_TIMER;
                        } else
                            if (pcase_var.eql($MINUTE)) {
                                return $str_alt55$MINUTE_TIMER;
                            } else
                                if (pcase_var.eql($QUARTER_HOUR)) {
                                    return $str_alt56$QUARTER_HOUR_TIMER;
                                } else
                                    if (pcase_var.eql($HALF_HOUR)) {
                                        return $str_alt57$HALF_HOUR_TIMER;
                                    } else
                                        if (pcase_var.eql($HOUR)) {
                                            return $str_alt58$HOUR_TIMER;
                                        } else
                                            if (pcase_var.eql($TWO_HOURS)) {
                                                return $str_alt59$TWO_HOURS_TIMER;
                                            } else
                                                if (pcase_var.eql($THREE_HOURS)) {
                                                    return $str_alt60$THREE_HOURS_TIMER;
                                                } else
                                                    if (pcase_var.eql($FOUR_HOURS)) {
                                                        return $str_alt61$FOUR_HOURS_TIMER;
                                                    } else
                                                        if (pcase_var.eql($FIVE_HOURS)) {
                                                            return $str_alt62$FIVE_HOURS_TIMER;
                                                        } else
                                                            if (pcase_var.eql($SIX_HOURS)) {
                                                                return $str_alt63$SIX_HOURS_TIMER;
                                                            } else
                                                                if (pcase_var.eql($SEVEN_HOURS)) {
                                                                    return $str_alt64$SEVEN_HOURS_TIMER;
                                                                } else
                                                                    if (pcase_var.eql($EIGHT_HOURS)) {
                                                                        return $str_alt65$EIGHT_HOURS_TIMER;
                                                                    } else
                                                                        if (pcase_var.eql($NINE_HOURS)) {
                                                                            return $str_alt66$NINE_HOURS_TIMER;
                                                                        } else
                                                                            if (pcase_var.eql($TEN_HOURS)) {
                                                                                return $str_alt67$TEN_HOURS_TIMER;
                                                                            } else
                                                                                if (pcase_var.eql($ELEVEN_HOURS)) {
                                                                                    return $str_alt68$ELEVEN_HOURS_TIMER;
                                                                                } else
                                                                                    if (pcase_var.eql($HALF_DAY)) {
                                                                                        return $str_alt69$HALF_DAY_TIMER;
                                                                                    } else
                                                                                        if (pcase_var.eql($DAY)) {
                                                                                            return $str_alt70$DAY_TIMER;
                                                                                        } else
                                                                                            if (pcase_var.eql($WEEK)) {
                                                                                                return $str_alt71$WEEK_TIMER;
                                                                                            } else
                                                                                                if (pcase_var.eql($MONTH)) {
                                                                                                    return $str_alt72$MONTH_TIMER;
                                                                                                } else
                                                                                                    if (pcase_var.eql($YEAR)) {
                                                                                                        return $str_alt73$YEAR_TIMER;
                                                                                                    } else {
                                                                                                        return NIL;
                                                                                                    }





















            }
        }
    }

    public static final SubLObject cyblack_time_interval_to_panel(SubLObject time_interval) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_time_interval_p(time_interval)) {
                    Errors.error($str_alt8$CYBLACK_TIME_INTERVAL_TO_SECONDS_, time_interval);
                }
            }
            {
                SubLObject pcase_var = time_interval;
                if (pcase_var.eql($SECOND)) {
                    return CYBLACK_SECOND_PANEL;
                } else
                    if (pcase_var.eql($QUARTER_MINUTE)) {
                        return CYBLACK_QUARTER_MINUTE_PANEL;
                    } else
                        if (pcase_var.eql($HALF_MINUTE)) {
                            return CYBLACK_HALF_MINUTE_PANEL;
                        } else
                            if (pcase_var.eql($MINUTE)) {
                                return CYBLACK_MINUTE_PANEL;
                            } else
                                if (pcase_var.eql($QUARTER_HOUR)) {
                                    return CYBLACK_QUARTER_HOUR_PANEL;
                                } else
                                    if (pcase_var.eql($HALF_HOUR)) {
                                        return CYBLACK_HALF_HOUR_PANEL;
                                    } else
                                        if (pcase_var.eql($HOUR)) {
                                            return CYBLACK_HOUR_PANEL;
                                        } else
                                            if (pcase_var.eql($TWO_HOURS)) {
                                                return CYBLACK_TWO_HOURS_PANEL;
                                            } else
                                                if (pcase_var.eql($THREE_HOURS)) {
                                                    return CYBLACK_THREE_HOURS_PANEL;
                                                } else
                                                    if (pcase_var.eql($FOUR_HOURS)) {
                                                        return CYBLACK_FOUR_HOURS_PANEL;
                                                    } else
                                                        if (pcase_var.eql($FIVE_HOURS)) {
                                                            return CYBLACK_FIVE_HOURS_PANEL;
                                                        } else
                                                            if (pcase_var.eql($SIX_HOURS)) {
                                                                return CYBLACK_SIX_HOURS_PANEL;
                                                            } else
                                                                if (pcase_var.eql($SEVEN_HOURS)) {
                                                                    return CYBLACK_SEVEN_HOURS_PANEL;
                                                                } else
                                                                    if (pcase_var.eql($EIGHT_HOURS)) {
                                                                        return CYBLACK_EIGHT_HOURS_PANEL;
                                                                    } else
                                                                        if (pcase_var.eql($NINE_HOURS)) {
                                                                            return CYBLACK_NINE_HOURS_PANEL;
                                                                        } else
                                                                            if (pcase_var.eql($TEN_HOURS)) {
                                                                                return CYBLACK_TEN_HOURS_PANEL;
                                                                            } else
                                                                                if (pcase_var.eql($ELEVEN_HOURS)) {
                                                                                    return CYBLACK_ELEVEN_HOURS_PANEL;
                                                                                } else
                                                                                    if (pcase_var.eql($HALF_DAY)) {
                                                                                        return CYBLACK_HALF_DAY_PANEL;
                                                                                    } else
                                                                                        if (pcase_var.eql($DAY)) {
                                                                                            return CYBLACK_DAY_PANEL;
                                                                                        } else
                                                                                            if (pcase_var.eql($WEEK)) {
                                                                                                return CYBLACK_WEEK_PANEL;
                                                                                            } else
                                                                                                if (pcase_var.eql($MONTH)) {
                                                                                                    return CYBLACK_MONTH_PANEL;
                                                                                                } else
                                                                                                    if (pcase_var.eql($YEAR)) {
                                                                                                        return CYBLACK_YEAR_PANEL;
                                                                                                    } else {
                                                                                                        return NIL;
                                                                                                    }





















            }
        }
    }

    public static final SubLObject cyblack_time_interval_to_posting(SubLObject time_interval) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_time_interval_p(time_interval)) {
                    Errors.error($str_alt8$CYBLACK_TIME_INTERVAL_TO_SECONDS_, time_interval);
                }
            }
            {
                SubLObject pcase_var = time_interval;
                if (pcase_var.eql($SECOND)) {
                    return CYBLACK_SECOND_POSTING;
                } else
                    if (pcase_var.eql($QUARTER_MINUTE)) {
                        return CYBLACK_QUARTER_MINUTE_POSTING;
                    } else
                        if (pcase_var.eql($HALF_MINUTE)) {
                            return CYBLACK_HALF_MINUTE_POSTING;
                        } else
                            if (pcase_var.eql($MINUTE)) {
                                return CYBLACK_MINUTE_POSTING;
                            } else
                                if (pcase_var.eql($QUARTER_HOUR)) {
                                    return CYBLACK_QUARTER_HOUR_POSTING;
                                } else
                                    if (pcase_var.eql($HALF_HOUR)) {
                                        return CYBLACK_HALF_HOUR_POSTING;
                                    } else
                                        if (pcase_var.eql($HOUR)) {
                                            return CYBLACK_HOUR_POSTING;
                                        } else
                                            if (pcase_var.eql($TWO_HOURS)) {
                                                return CYBLACK_TWO_HOURS_POSTING;
                                            } else
                                                if (pcase_var.eql($THREE_HOURS)) {
                                                    return CYBLACK_THREE_HOURS_POSTING;
                                                } else
                                                    if (pcase_var.eql($FOUR_HOURS)) {
                                                        return CYBLACK_FOUR_HOURS_POSTING;
                                                    } else
                                                        if (pcase_var.eql($FIVE_HOURS)) {
                                                            return CYBLACK_FIVE_HOURS_POSTING;
                                                        } else
                                                            if (pcase_var.eql($SIX_HOURS)) {
                                                                return CYBLACK_SIX_HOURS_POSTING;
                                                            } else
                                                                if (pcase_var.eql($SEVEN_HOURS)) {
                                                                    return CYBLACK_SEVEN_HOURS_POSTING;
                                                                } else
                                                                    if (pcase_var.eql($EIGHT_HOURS)) {
                                                                        return CYBLACK_EIGHT_HOURS_POSTING;
                                                                    } else
                                                                        if (pcase_var.eql($NINE_HOURS)) {
                                                                            return CYBLACK_NINE_HOURS_POSTING;
                                                                        } else
                                                                            if (pcase_var.eql($TEN_HOURS)) {
                                                                                return CYBLACK_TEN_HOURS_POSTING;
                                                                            } else
                                                                                if (pcase_var.eql($ELEVEN_HOURS)) {
                                                                                    return CYBLACK_ELEVEN_HOURS_POSTING;
                                                                                } else
                                                                                    if (pcase_var.eql($HALF_DAY)) {
                                                                                        return CYBLACK_HALF_DAY_POSTING;
                                                                                    } else
                                                                                        if (pcase_var.eql($DAY)) {
                                                                                            return CYBLACK_DAY_POSTING;
                                                                                        } else
                                                                                            if (pcase_var.eql($WEEK)) {
                                                                                                return CYBLACK_WEEK_POSTING;
                                                                                            } else
                                                                                                if (pcase_var.eql($MONTH)) {
                                                                                                    return CYBLACK_MONTH_POSTING;
                                                                                                } else
                                                                                                    if (pcase_var.eql($YEAR)) {
                                                                                                        return CYBLACK_YEAR_POSTING;
                                                                                                    } else {
                                                                                                        return NIL;
                                                                                                    }





















            }
        }
    }

    // defparameter
    private static final SubLSymbol $cyblack_timer_panel_interval_stack$ = makeSymbol("*CYBLACK-TIMER-PANEL-INTERVAL-STACK*");

    // defparameter
    private static final SubLSymbol $cyblack_timer_panel_interval_stack_lock$ = makeSymbol("*CYBLACK-TIMER-PANEL-INTERVAL-STACK-LOCK*");

    public static final SubLObject cyblack_timer_panel_interval_stack_push(SubLObject timer_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_timer_panel_p(timer_panel)) {
                    Errors.error($str_alt119$CYBLACK_TIMER_PANEL_INTERVAL_STAC, timer_panel);
                }
            }
            {
                SubLObject lock = $cyblack_timer_panel_interval_stack_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    $cyblack_timer_panel_interval_stack$.setDynamicValue(cons(timer_panel, $cyblack_timer_panel_interval_stack$.getDynamicValue(thread)), thread);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return timer_panel;
        }
    }

    public static final SubLObject cyblack_timer_panel_interval_stack_pop() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject lock = $cyblack_timer_panel_interval_stack_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (NIL != $cyblack_timer_panel_interval_stack$.getDynamicValue(thread)) {
                        result = $cyblack_timer_panel_interval_stack$.getDynamicValue(thread).first();
                        $cyblack_timer_panel_interval_stack$.setDynamicValue($cyblack_timer_panel_interval_stack$.getDynamicValue(thread).rest(), thread);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject cyblack_timer_panel_run_backboard_process() {
        {
            SubLObject timer_panel = cyblack_timer_panel_interval_stack_pop();
            if (NIL != timer_panel) {
                cyblack_timer_panel_background_process_method(timer_panel);
                return T;
            }
            return NIL;
        }
    }

    public static final SubLObject get_cyblack_timer_panel_interval(SubLObject v_cyblack_timer_panel) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_timer_panel, TEN_INTEGER, INTERVAL);
    }

    public static final SubLObject set_cyblack_timer_panel_interval(SubLObject v_cyblack_timer_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_timer_panel, value, TEN_INTEGER, INTERVAL);
    }

    public static final SubLObject get_cyblack_timer_panel_posting_daemons(SubLObject v_cyblack_timer_panel) {
        return classes.subloop_get_instance_slot(v_cyblack_timer_panel, NINE_INTEGER);
    }

    public static final SubLObject set_cyblack_timer_panel_posting_daemons(SubLObject v_cyblack_timer_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(v_cyblack_timer_panel, value, NINE_INTEGER);
    }

    public static final SubLObject get_cyblack_timer_panel_datatype(SubLObject v_cyblack_timer_panel) {
        return classes.subloop_get_instance_slot(v_cyblack_timer_panel, EIGHT_INTEGER);
    }

    public static final SubLObject set_cyblack_timer_panel_datatype(SubLObject v_cyblack_timer_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(v_cyblack_timer_panel, value, EIGHT_INTEGER);
    }

    public static final SubLObject get_cyblack_timer_panel_direct_knowledge_sources(SubLObject v_cyblack_timer_panel) {
        return classes.subloop_get_instance_slot(v_cyblack_timer_panel, SEVEN_INTEGER);
    }

    public static final SubLObject set_cyblack_timer_panel_direct_knowledge_sources(SubLObject v_cyblack_timer_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(v_cyblack_timer_panel, value, SEVEN_INTEGER);
    }

    public static final SubLObject get_cyblack_timer_panel_sub_panels(SubLObject v_cyblack_timer_panel) {
        return classes.subloop_get_instance_slot(v_cyblack_timer_panel, SIX_INTEGER);
    }

    public static final SubLObject set_cyblack_timer_panel_sub_panels(SubLObject v_cyblack_timer_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(v_cyblack_timer_panel, value, SIX_INTEGER);
    }

    public static final SubLObject get_cyblack_timer_panel_super_panels(SubLObject v_cyblack_timer_panel) {
        return classes.subloop_get_instance_slot(v_cyblack_timer_panel, FIVE_INTEGER);
    }

    public static final SubLObject set_cyblack_timer_panel_super_panels(SubLObject v_cyblack_timer_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(v_cyblack_timer_panel, value, FIVE_INTEGER);
    }

    public static final SubLObject get_cyblack_timer_panel_current_posting(SubLObject v_cyblack_timer_panel) {
        return classes.subloop_get_instance_slot(v_cyblack_timer_panel, FOUR_INTEGER);
    }

    public static final SubLObject set_cyblack_timer_panel_current_posting(SubLObject v_cyblack_timer_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(v_cyblack_timer_panel, value, FOUR_INTEGER);
    }

    public static final SubLObject get_cyblack_timer_panel_marks(SubLObject v_cyblack_timer_panel) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_timer_panel, THREE_INTEGER, MARKS);
    }

    public static final SubLObject set_cyblack_timer_panel_marks(SubLObject v_cyblack_timer_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_timer_panel, value, THREE_INTEGER, MARKS);
    }

    public static final SubLObject get_cyblack_timer_panel_started_up(SubLObject v_cyblack_timer_panel) {
        {
            SubLObject v_class = subloop_structures.instance_class(v_cyblack_timer_panel);
            SubLObject slot = slots.slot_assoc(STARTED_UP, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, v_cyblack_timer_panel, slot);
        }
        return classes.ldb_test($int$4098, subloop_structures.instance_boolean_slots(v_cyblack_timer_panel));
    }

    public static final SubLObject set_cyblack_timer_panel_started_up(SubLObject v_cyblack_timer_panel, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(v_cyblack_timer_panel);
            SubLObject slot = slots.slot_assoc(STARTED_UP, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, v_cyblack_timer_panel, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(v_cyblack_timer_panel, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4098, subloop_structures.instance_boolean_slots(v_cyblack_timer_panel)));
        return value;
    }

    public static final SubLObject get_cyblack_timer_panel_ticking(SubLObject v_cyblack_timer_panel) {
        {
            SubLObject v_class = subloop_structures.instance_class(v_cyblack_timer_panel);
            SubLObject slot = slots.slot_assoc(TICKING, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, v_cyblack_timer_panel, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(v_cyblack_timer_panel));
    }

    public static final SubLObject set_cyblack_timer_panel_ticking(SubLObject v_cyblack_timer_panel, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(v_cyblack_timer_panel);
            SubLObject slot = slots.slot_assoc(TICKING, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, v_cyblack_timer_panel, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(v_cyblack_timer_panel, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(v_cyblack_timer_panel)));
        return value;
    }

    public static final SubLObject cyblack_timer_panel_iterate_over_all_knowledge_sources_method(SubLObject self, SubLObject ks_visitor) {
        {
            SubLObject template_panel_queue = list(self);
            SubLObject template_visited_panels = NIL;
            SubLObject template_visitor_is_cyblack_state_change_ks_visitor = cyblack_ks.cyblack_state_change_ks_visitor_p(ks_visitor);
            SubLObject template_current_panel = NIL;
            while (NIL != template_panel_queue) {
                template_current_panel = template_panel_queue.first();
                template_panel_queue = template_panel_queue.rest();
                if (NIL == subl_promotions.memberP(template_current_panel, template_visited_panels, UNPROVIDED, UNPROVIDED)) {
                    template_visited_panels = cons(template_current_panel, template_visited_panels);
                    template_panel_queue = nconc(template_panel_queue, methods.funcall_instance_method_with_0_args(template_current_panel, GET_SUB_PANELS));
                    if (NIL != template_visitor_is_cyblack_state_change_ks_visitor) {
                        cyblack_ks.cyblack_state_change_ks_visitor_set_panel_method(ks_visitor, template_current_panel);
                    }
                    cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_direct_knowledge_sources(template_current_panel, ks_visitor);
                }
            } 
            return ks_visitor;
        }
    }

    public static final SubLObject cyblack_timer_panel_iterate_over_all_direct_knowledge_sources_method(SubLObject self, SubLObject ks_visitor) {
        {
            SubLObject template_direct_knowledge_sources = cyblack_timer_panel_get_direct_knowledge_sources_method(self);
            if (NIL != template_direct_knowledge_sources) {
                {
                    SubLObject cdolist_list_var = template_direct_knowledge_sources;
                    SubLObject template_ks = NIL;
                    for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                        methods.funcall_instance_method_with_1_args(ks_visitor, VISIT, template_ks);
                        if (NIL == methods.funcall_instance_method_with_1_args(ks_visitor, CONTINUE_P, template_ks)) {
                            return ks_visitor;
                        }
                    }
                }
            }
            return ks_visitor;
        }
    }

    public static final SubLObject cyblack_timer_panel_iterate_over_all_postings_method(SubLObject self, SubLObject posting_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template_panel_queue = list(self);
                SubLObject template_visited_panels = NIL;
                SubLObject template_current_panel = NIL;
                if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                    format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt144$___ITERATE_OVER_ALL_POSTINGS__S__, new SubLObject[]{ self, self, posting_visitor });
                }
                while (NIL != template_panel_queue) {
                    template_current_panel = template_panel_queue.first();
                    template_panel_queue = template_panel_queue.rest();
                    if (NIL == subl_promotions.memberP(template_current_panel, template_visited_panels, UNPROVIDED, UNPROVIDED)) {
                        template_visited_panels = cons(template_current_panel, template_visited_panels);
                        template_panel_queue = nconc(template_panel_queue, methods.funcall_instance_method_with_0_args(template_current_panel, GET_SUB_PANELS));
                        cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_direct_postings(template_current_panel, posting_visitor);
                    }
                } 
                return posting_visitor;
            }
        }
    }

    public static final SubLObject cyblack_timer_panel_iterate_over_all_direct_postings_method(SubLObject self, SubLObject posting_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt148$___ITERATE_OVER_ALL_DIRECT_POSTIN, self, posting_visitor);
            }
            {
                SubLObject template_direct_postings = cyblack_timer_panel_get_direct_postings_method(self);
                SubLObject cdolist_list_var = template_direct_postings;
                SubLObject template_posting = NIL;
                for (template_posting = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_posting = cdolist_list_var.first()) {
                    if (NIL != cyblack_posting_dispatch_functions.cyblack_posting_active_p(template_posting)) {
                        methods.funcall_instance_method_with_1_args(posting_visitor, VISIT, template_posting);
                        if (NIL == methods.funcall_instance_method_with_1_args(posting_visitor, CONTINUE_P, template_posting)) {
                            return posting_visitor;
                        }
                    }
                }
            }
            return posting_visitor;
        }
    }

    public static final SubLObject cyblack_timer_panel_get_all_active_postings_method(SubLObject self) {
        {
            SubLObject template_all_active_postings = NIL;
            SubLObject template_panel_queue = list(self);
            SubLObject template_visited_panels = NIL;
            SubLObject template_current_panel = NIL;
            try {
                while (NIL != template_panel_queue) {
                    template_current_panel = template_panel_queue.first();
                    template_panel_queue = template_panel_queue.rest();
                    if (NIL == cyblack_panel_dispatch_functions.cyblack_panel_has_mark_p(template_current_panel, $GET_ALL_POSTINGS)) {
                        cyblack_panel_dispatch_functions.cyblack_panel_add_mark(template_current_panel, $GET_ALL_POSTINGS);
                        template_visited_panels = cons(template_current_panel, template_visited_panels);
                        template_all_active_postings = nconc(template_all_active_postings, copy_list(cyblack_panel_dispatch_functions.cyblack_panel_get_direct_active_postings(template_current_panel)));
                    }
                } 
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        {
                            SubLObject cdolist_list_var = template_visited_panels;
                            SubLObject template_visited_panel = NIL;
                            for (template_visited_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_visited_panel = cdolist_list_var.first()) {
                                cyblack_panel_dispatch_functions.cyblack_panel_remove_mark(template_visited_panel, $GET_ALL_POSTINGS);
                            }
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return template_all_active_postings;
        }
    }

    public static final SubLObject cyblack_timer_panel_get_all_postings_method(SubLObject self) {
        {
            SubLObject template_all_postings = NIL;
            SubLObject template_panel_queue = list(self);
            SubLObject template_visited_panels = NIL;
            SubLObject template_current_panel = NIL;
            try {
                while (NIL != template_panel_queue) {
                    template_current_panel = template_panel_queue.first();
                    template_panel_queue = template_panel_queue.rest();
                    if (NIL == cyblack_panel_dispatch_functions.cyblack_panel_has_mark_p(template_current_panel, $GET_ALL_POSTINGS)) {
                        cyblack_panel_dispatch_functions.cyblack_panel_add_mark(template_current_panel, $GET_ALL_POSTINGS);
                        template_visited_panels = cons(template_current_panel, template_visited_panels);
                        template_all_postings = nconc(template_all_postings, copy_list(cyblack_panel_dispatch_functions.cyblack_panel_get_direct_postings(template_current_panel)));
                    }
                } 
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        {
                            SubLObject cdolist_list_var = template_visited_panels;
                            SubLObject template_visited_panel = NIL;
                            for (template_visited_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_visited_panel = cdolist_list_var.first()) {
                                cyblack_panel_dispatch_functions.cyblack_panel_remove_mark(template_visited_panel, $GET_ALL_POSTINGS);
                            }
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return template_all_postings;
        }
    }

    public static final SubLObject cyblack_timer_panel_get_all_knowledge_sources_method(SubLObject self) {
        {
            SubLObject template_super_panels = list(self);
            SubLObject template_knowledge_sources = NIL;
            SubLObject template_visited_panels = NIL;
            SubLObject template_direct_knowledge_sources = NIL;
            SubLObject template_new_knowledge_sources = NIL;
            SubLObject template_current_panel = NIL;
            try {
                while (NIL != template_super_panels) {
                    template_current_panel = template_super_panels.first();
                    template_super_panels = template_super_panels.rest();
                    if (NIL == cyblack_panel_dispatch_functions.cyblack_panel_has_mark_p(template_current_panel, $GET_ALL_KNOWLEDGE_SOURCES)) {
                        template_visited_panels = cons(template_current_panel, template_visited_panels);
                        cyblack_panel_dispatch_functions.cyblack_panel_add_mark(template_current_panel, $GET_ALL_KNOWLEDGE_SOURCES);
                        template_direct_knowledge_sources = cyblack_panel_dispatch_functions.cyblack_panel_get_direct_knowledge_sources(template_current_panel);
                        template_new_knowledge_sources = NIL;
                        {
                            SubLObject list_expression = template_direct_knowledge_sources;
                            if (NIL == list_expression) {
                                template_new_knowledge_sources = NIL;
                            } else
                                if (list_expression.isAtom()) {
                                    template_new_knowledge_sources = list(list_expression);
                                } else
                                    if (NIL == list_expression.rest()) {
                                        {
                                            SubLObject template_ks = list_expression.first();
                                            template_new_knowledge_sources = (NIL != member(template_ks, template_knowledge_sources, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (NIL)) : list(template_ks);
                                        }
                                    } else {
                                        {
                                            SubLObject tail_cons = NIL;
                                            SubLObject result = NIL;
                                            template_new_knowledge_sources = NIL;
                                            {
                                                SubLObject cdolist_list_var = list_expression;
                                                SubLObject template_ks = NIL;
                                                for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                                                    result = (NIL != member(template_ks, template_knowledge_sources, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (NIL)) : list(template_ks);
                                                    if (NIL != result) {
                                                        if (NIL != tail_cons) {
                                                            rplacd(tail_cons, result);
                                                            tail_cons = last(result, UNPROVIDED);
                                                        } else {
                                                            template_new_knowledge_sources = (NIL != member(template_ks, template_knowledge_sources, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (NIL)) : list(template_ks);
                                                            tail_cons = last(template_new_knowledge_sources, UNPROVIDED);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }


                        }
                        if (NIL != template_new_knowledge_sources) {
                            template_knowledge_sources = nconc(template_knowledge_sources, template_new_knowledge_sources);
                        }
                        template_super_panels = nconc(template_super_panels, copy_list(cyblack_panel_dispatch_functions.cyblack_panel_get_super_panels(template_current_panel)));
                    }
                } 
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        {
                            SubLObject cdolist_list_var = template_visited_panels;
                            SubLObject template_visited_panel = NIL;
                            for (template_visited_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_visited_panel = cdolist_list_var.first()) {
                                cyblack_panel_dispatch_functions.cyblack_panel_remove_mark(template_visited_panel, $GET_ALL_KNOWLEDGE_SOURCES);
                            }
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return template_knowledge_sources;
        }
    }

    public static final SubLObject cyblack_timer_panel_set_direct_knowledge_sources_method(SubLObject self, SubLObject knowledge_sources) {
        cyblack_timer_panel_remove_all_knowledge_sources_method(self);
        {
            SubLObject cdolist_list_var = knowledge_sources;
            SubLObject knowledge_source = NIL;
            for (knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , knowledge_source = cdolist_list_var.first()) {
                cyblack_timer_panel_add_direct_knowledge_source_method(self, knowledge_source);
            }
        }
        return knowledge_sources;
    }

    public static final SubLObject cyblack_timer_panel_remove_direct_knowledge_sources_method(SubLObject self) {
        {
            SubLObject knowledge_sources = cyblack_timer_panel_get_direct_knowledge_sources_method(self);
            SubLObject cdolist_list_var = knowledge_sources;
            SubLObject knowledge_source = NIL;
            for (knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , knowledge_source = cdolist_list_var.first()) {
                cyblack_timer_panel_remove_direct_knowledge_source_method(self, knowledge_source);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_timer_panel_stimulate_all_posting_daemons_method(SubLObject self, SubLObject environment, SubLObject posting) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        if (posting == UNPROVIDED) {
            posting = NIL;
        }
        if (NIL != environment) {
            {
                SubLObject goal_satisfaction_daemon_visitor = object.new_object_instance(CYBLACK_GOAL_SATISFACTION_VISITOR);
                cyblack_blackboard_daemon.cyblack_goal_satisfaction_visitor_set_initial_state_method(goal_satisfaction_daemon_visitor, cyblack_object.cyblack_object_get_application_method(self), environment, posting);
                cyblack_timer_panel_iterate_over_all_posting_daemons_method(self, goal_satisfaction_daemon_visitor);
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_timer_panel_stimulate_all_monitors_method(SubLObject self, SubLObject environments) {
        if (environments == UNPROVIDED) {
            environments = NIL;
        }
        {
            SubLObject template_all_knowledge_sources = list_utilities.unique_elements(cyblack_timer_panel_get_all_knowledge_sources_method(self), UNPROVIDED);
            SubLObject cdolist_list_var = template_all_knowledge_sources;
            SubLObject template_ks = NIL;
            for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                if (NIL != cyblack_ks.cyblack_monitoring_ks_p(template_ks)) {
                    methods.funcall_instance_method_with_1_args(template_ks, PERFORM_ACTION, environments);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_timer_panel_stimulate_all_knowledge_sources_method(SubLObject self, SubLObject environment) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        {
            SubLObject template_all_knowledge_sources = list_utilities.unique_elements(cyblack_timer_panel_get_all_knowledge_sources_method(self), UNPROVIDED);
            SubLObject cdolist_list_var = template_all_knowledge_sources;
            SubLObject template_ks = NIL;
            for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                cyblack_ks_dispatch_functions.cyblack_ks_stimulate(template_ks, environment);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_timer_panel_stimulate_direct_knowledge_sources_method(SubLObject self, SubLObject environment) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        {
            SubLObject template_direct_knowledge_sources = cyblack_timer_panel_get_direct_knowledge_sources_method(self);
            SubLObject cdolist_list_var = template_direct_knowledge_sources;
            SubLObject template_ks = NIL;
            for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                cyblack_ks_dispatch_functions.cyblack_ks_stimulate(template_ks, environment);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_timer_panel_get_all_sub_panels_method(SubLObject self, SubLObject excluded_panels) {
        if (excluded_panels == UNPROVIDED) {
            excluded_panels = NIL;
        }
        {
            SubLObject collected_panels = NIL;
            SubLObject current_sub_panels = cyblack_timer_panel_get_sub_panels_method(self);
            SubLObject current_panel = NIL;
            while (NIL != current_sub_panels) {
                current_panel = current_sub_panels.first();
                current_sub_panels = current_sub_panels.rest();
                if (!((NIL != subl_promotions.memberP(current_panel, excluded_panels, UNPROVIDED, UNPROVIDED)) || (NIL != member(current_panel, collected_panels, UNPROVIDED, UNPROVIDED)))) {
                    collected_panels = cons(current_panel, collected_panels);
                    {
                        SubLObject local_sub_panels = methods.funcall_instance_method_with_0_args(current_panel, GET_SUB_PANELS);
                        if (NIL != local_sub_panels) {
                            current_sub_panels = nconc(local_sub_panels, current_sub_panels);
                        }
                    }
                }
            } 
            return collected_panels;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_timer_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_timer_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_timer_panel_p(SubLObject v_cyblack_timer_panel) {
        return classes.subloop_instanceof_class(v_cyblack_timer_panel, CYBLACK_TIMER_PANEL);
    }

    public static final SubLObject cyblack_timer_panel_initialize_qua_markable_method(SubLObject self) {
        cyblack_panel.set_cyblack_basic_panel_marks(self, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_timer_panel_get_marks_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject marks = get_cyblack_timer_panel_marks(self);
            try {
                try {
                    sublisp_throw($sym210$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, marks);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_marks(self, marks);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym210$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_set_marks_internal_method(SubLObject self, SubLObject new_marks) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject marks = get_cyblack_timer_panel_marks(self);
            try {
                try {
                    marks = new_marks;
                    sublisp_throw($sym215$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, new_marks);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_marks(self, marks);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym215$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_get_stimulation_type_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_timer_panel_set_stimulation_type_method(SubLObject self, SubLObject new_stimulation_type) {
        return NIL;
    }

    public static final SubLObject cyblack_timer_panel_get_super_panels_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject super_panels = get_cyblack_timer_panel_super_panels(self);
            try {
                try {
                    sublisp_throw($sym226$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, super_panels);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_super_panels(self, super_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym226$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_get_sub_panels_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject sub_panels = get_cyblack_timer_panel_sub_panels(self);
            try {
                try {
                    sublisp_throw($sym229$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, sub_panels);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_sub_panels(self, sub_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym229$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_add_super_panel_method(SubLObject self, SubLObject new_super_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
                SubLObject super_panels = get_cyblack_timer_panel_super_panels(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_panel.cyblack_panel_p(new_super_panel)) {
                                Errors.error($str_alt235$_ADD_SUPER_PANEL__S____S_is_not_a, self, new_super_panel);
                            }
                        }
                        if (NIL == subl_promotions.memberP(new_super_panel, super_panels, UNPROVIDED, UNPROVIDED)) {
                            super_panels = nconc(super_panels, list(new_super_panel));
                        }
                        sublisp_throw($sym234$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, new_super_panel);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_timer_panel_super_panels(self, super_panels);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym234$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
                }
                return catch_var_for_cyblack_timer_panel_method;
            }
        }
    }

    public static final SubLObject cyblack_timer_panel_add_sub_panel_method(SubLObject self, SubLObject new_sub_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
                SubLObject sub_panels = get_cyblack_timer_panel_sub_panels(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_panel.cyblack_panel_p(new_sub_panel)) {
                                Errors.error($str_alt241$_ADD_SUB_PANEL__S____S_is_not_an_, self, new_sub_panel);
                            }
                        }
                        if (NIL == subl_promotions.memberP(new_sub_panel, sub_panels, UNPROVIDED, UNPROVIDED)) {
                            sub_panels = nconc(sub_panels, list(new_sub_panel));
                        }
                        sublisp_throw($sym240$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, new_sub_panel);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_timer_panel_sub_panels(self, sub_panels);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym240$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
                }
                return catch_var_for_cyblack_timer_panel_method;
            }
        }
    }

    public static final SubLObject cyblack_timer_panel_remove_super_panel_method(SubLObject self, SubLObject old_super_panel) {
        return NIL;
    }

    public static final SubLObject cyblack_timer_panel_remove_sub_panel_method(SubLObject self, SubLObject old_sub_panel) {
        return NIL;
    }

    public static final SubLObject cyblack_timer_panel_add_posting_method(SubLObject self, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(posting)) {
                    Errors.error($str_alt254$_ADD_POSTING__S____S_is_not_an_in, self, posting);
                }
            }
            if (NIL != posting) {
                set_cyblack_timer_panel_current_posting(self, posting);
                methods.funcall_instance_method_with_0_args(posting, ON_POST);
                {
                    SubLObject environment = cyblack_precondition_pattern.create_top_level_environment($ADD_POSTING, $sym257$_THE_POSTING, cyblack_application.cyblack_application_get_root_datatype(cyblack_object.cyblack_object_get_application_method(self)), posting);
                    cyblack_timer_panel_stimulate_all_knowledge_sources_method(self, environment);
                }
                methods.funcall_instance_method_with_0_args(posting, AFTER_STIMULATION);
                return posting;
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_timer_panel_remove_posting_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject current_posting = get_cyblack_timer_panel_current_posting(self);
            try {
                try {
                    if (current_posting == posting) {
                        current_posting = NIL;
                    }
                    sublisp_throw($sym262$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, posting);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_current_posting(self, current_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym262$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_get_datatype_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject datatype = get_cyblack_timer_panel_datatype(self);
            try {
                try {
                    sublisp_throw($sym266$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, datatype);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_datatype(self, datatype);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym266$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_set_datatype_method(SubLObject self, SubLObject new_datatype) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
                SubLObject datatype = get_cyblack_timer_panel_datatype(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_datatype.cyblack_datatype_p(new_datatype)) {
                                Errors.error($str_alt272$_SET_DATATYPE__S____S_is_not_an_i, self, new_datatype);
                            }
                        }
                        datatype = new_datatype;
                        sublisp_throw($sym271$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, new_datatype);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_timer_panel_datatype(self, datatype);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym271$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
                }
                return catch_var_for_cyblack_timer_panel_method;
            }
        }
    }

    public static final SubLObject cyblack_timer_panel_on_add_first_knowledge_source_method(SubLObject self) {
        {
            SubLObject application_id = cyblack_application.cyblack_application_get_application_id(cyblack_object.cyblack_object_get_application_method(self));
            set_cyblack_timer_panel_ticking(self, T);
            cyblack_timer_panel_interval_stack_push(self);
            cyblack_processes.cyblack_make_process(application_id, $str_alt277$CYBLACK_TIMER_PANEL_RUN, CYBLACK_TIMER_PANEL_RUN_BACKBOARD_PROCESS);
            return NIL;
        }
    }

    public static final SubLObject cyblack_timer_panel_on_remove_last_knowledge_source_method(SubLObject self) {
        set_cyblack_timer_panel_ticking(self, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_timer_panel_add_direct_knowledge_source_method(SubLObject self, SubLObject knowledge_source) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject direct_knowledge_sources = get_cyblack_timer_panel_direct_knowledge_sources(self);
            try {
                try {
                    if (NIL != knowledge_source) {
                        if (NIL == direct_knowledge_sources) {
                            direct_knowledge_sources = object.object_new_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST);
                        }
                        if (NIL != subloop_collections.basic_doubly_linked_list_empty_p_method(direct_knowledge_sources)) {
                            methods.funcall_instance_method_with_0_args(self, ON_ADD_FIRST_KNOWLEDGE_SOURCE);
                        }
                        if (NIL == cyblack_ks.cyblack_basic_knowledge_source_list_member_p_method(direct_knowledge_sources, knowledge_source)) {
                            cyblack_ks.cyblack_basic_knowledge_source_list_add_method(direct_knowledge_sources, knowledge_source);
                        }
                    }
                    sublisp_throw($sym286$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, knowledge_source);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_direct_knowledge_sources(self, direct_knowledge_sources);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym286$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_remove_direct_knowledge_source_method(SubLObject self, SubLObject knowledge_source) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject direct_knowledge_sources = get_cyblack_timer_panel_direct_knowledge_sources(self);
            try {
                try {
                    if ((NIL != knowledge_source) && (NIL != direct_knowledge_sources)) {
                        cyblack_ks.cyblack_basic_knowledge_source_list_remove_method(direct_knowledge_sources, knowledge_source);
                        if (NIL != subloop_collections.basic_doubly_linked_list_empty_p_method(direct_knowledge_sources)) {
                            methods.funcall_instance_method_with_0_args(self, ON_REMOVE_LAST_KNOWLEDGE_SOURCE);
                        }
                    }
                    sublisp_throw($sym291$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, knowledge_source);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_direct_knowledge_sources(self, direct_knowledge_sources);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym291$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_remove_all_knowledge_sources_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject direct_knowledge_sources = get_cyblack_timer_panel_direct_knowledge_sources(self);
            try {
                try {
                    if (NIL != direct_knowledge_sources) {
                        subloop_collections.basic_doubly_linked_list_clear_method(direct_knowledge_sources);
                        direct_knowledge_sources = NIL;
                    }
                    sublisp_throw($sym295$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_direct_knowledge_sources(self, direct_knowledge_sources);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym295$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_get_direct_knowledge_sources_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject direct_knowledge_sources = get_cyblack_timer_panel_direct_knowledge_sources(self);
            try {
                try {
                    if (NIL != direct_knowledge_sources) {
                        sublisp_throw($sym299$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, subloop_collections.basic_doubly_linked_list_get_contents_method(direct_knowledge_sources));
                    } else {
                        sublisp_throw($sym299$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_direct_knowledge_sources(self, direct_knowledge_sources);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym299$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_add_direct_posting_method(SubLObject self, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(posting)) {
                    Errors.error($str_alt303$_ADD_DIRECT_POSTING__S____S_is_no, self, posting);
                }
            }
            if (NIL != posting) {
                set_cyblack_timer_panel_current_posting(self, posting);
                methods.funcall_instance_method_with_0_args(posting, ON_POST);
                methods.funcall_instance_method_with_0_args(posting, AFTER_STIMULATION);
                return posting;
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_timer_panel_get_direct_active_postings_method(SubLObject self) {
        return get_cyblack_timer_panel_current_posting(self);
    }

    public static final SubLObject cyblack_timer_panel_remove_direct_posting_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject current_posting = get_cyblack_timer_panel_current_posting(self);
            try {
                try {
                    if (current_posting == posting) {
                        current_posting = NIL;
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_current_posting(self, current_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym310$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_add_direct_postings_method(SubLObject self, SubLObject postings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!postings.isList()) {
                    Errors.error($str_alt315$_ADD_DIRECT_POSTINGS__S____S_is_n, self, postings);
                }
            }
            {
                SubLObject cdolist_list_var = postings;
                SubLObject posting = NIL;
                for (posting = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , posting = cdolist_list_var.first()) {
                    cyblack_timer_panel_add_direct_posting_method(self, posting);
                }
            }
            return postings;
        }
    }

    public static final SubLObject cyblack_timer_panel_get_direct_postings_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject current_posting = get_cyblack_timer_panel_current_posting(self);
            try {
                try {
                    sublisp_throw($sym319$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, NIL != current_posting ? ((SubLObject) (list(current_posting))) : NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_current_posting(self, current_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym319$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_remove_direct_postings_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject current_posting = get_cyblack_timer_panel_current_posting(self);
            try {
                try {
                    current_posting = NIL;
                    sublisp_throw($sym323$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_current_posting(self, current_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym323$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_add_posting_daemon_method(SubLObject self, SubLObject new_posting_daemon) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
                SubLObject posting_daemons = get_cyblack_timer_panel_posting_daemons(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_blackboard_daemon.cyblack_posting_daemon_p(new_posting_daemon)) {
                                Errors.error($str_alt329$_ADD_POSTING_DAEMON__S____S_is_no, self, new_posting_daemon);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == posting_daemons) {
                                Errors.error($str_alt330$_ADD_POSTING_DAEMON__S___The_post, self);
                            }
                        }
                        subloop_collections.basic_doubly_linked_list_add_method(posting_daemons, new_posting_daemon);
                        sublisp_throw($sym328$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, new_posting_daemon);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_timer_panel_posting_daemons(self, posting_daemons);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym328$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
                }
                return catch_var_for_cyblack_timer_panel_method;
            }
        }
    }

    public static final SubLObject cyblack_timer_panel_remove_posting_daemon_method(SubLObject self, SubLObject old_posting_daemon) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
                SubLObject posting_daemons = get_cyblack_timer_panel_posting_daemons(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_blackboard_daemon.cyblack_posting_daemon_p(old_posting_daemon)) {
                                Errors.error($str_alt336$_REMOVE_POSTING_DAEMON__S____S_is, self, old_posting_daemon);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == posting_daemons) {
                                Errors.error($str_alt337$_REMOVE_POSTING_DAEMON__S___The_p, self);
                            }
                        }
                        subloop_collections.basic_doubly_linked_list_remove_method(posting_daemons, old_posting_daemon);
                        sublisp_throw($sym335$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, old_posting_daemon);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_timer_panel_posting_daemons(self, posting_daemons);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym335$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
                }
                return catch_var_for_cyblack_timer_panel_method;
            }
        }
    }

    public static final SubLObject cyblack_timer_panel_get_posting_daemons_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject posting_daemons = get_cyblack_timer_panel_posting_daemons(self);
            try {
                try {
                    sublisp_throw($sym341$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, posting_daemons);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_posting_daemons(self, posting_daemons);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym341$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_remove_all_direct_posting_daemons_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
                SubLObject posting_daemons = get_cyblack_timer_panel_posting_daemons(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == posting_daemons) {
                                Errors.error($str_alt346$_REMOVE_ALL_DIRECT_POSTING_DAEMON, self);
                            }
                        }
                        subloop_collections.basic_doubly_linked_list_clear_method(posting_daemons);
                        sublisp_throw($sym345$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_timer_panel_posting_daemons(self, posting_daemons);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym345$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
                }
                return catch_var_for_cyblack_timer_panel_method;
            }
        }
    }

    public static final SubLObject cyblack_timer_panel_iterate_over_all_direct_posting_daemons_method(SubLObject self, SubLObject daemon_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_blackboard_daemon.cyblack_posting_daemon_visitor_p(daemon_visitor)) {
                    Errors.error($str_alt351$_ITERATE_OVER_ALL_DIRECT_POSTING_, self, daemon_visitor);
                }
            }
            {
                SubLObject template_posting_daemons = cyblack_timer_panel_get_posting_daemons_method(self);
                if (template_posting_daemons.isList()) {
                    {
                        SubLObject template_current_cons = template_posting_daemons;
                        SubLObject template_not_finished = T;
                        SubLObject template_daemon = NIL;
                        while ((NIL != template_not_finished) && (NIL != template_current_cons)) {
                            template_daemon = template_current_cons.first();
                            if (NIL != methods.funcall_instance_method_with_1_args(daemon_visitor, CONTINUE_P, template_daemon)) {
                                methods.funcall_instance_method_with_1_args(daemon_visitor, VISIT, template_daemon);
                                template_current_cons = template_current_cons.rest();
                            } else {
                                template_not_finished = NIL;
                            }
                        } 
                    }
                } else
                    if (NIL != subloop_collections.collection_template_p(template_posting_daemons)) {
                        {
                            SubLObject template_enumerator = methods.funcall_instance_method_with_0_args(template_posting_daemons, ALLOCATE_ENUMERATOR);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == template_enumerator) {
                                    Errors.error($str_alt353$_ITERATE_OVER_ALL_DIRECT_POSTING_, self);
                                }
                            }
                            if (NIL == subloop_collections.enumerator_template_empty_p(template_enumerator)) {
                                {
                                    SubLObject template_daemon = subloop_collections.enumerator_template_first(template_enumerator);
                                    SubLObject template_not_finished = T;
                                    if (NIL != methods.funcall_instance_method_with_1_args(daemon_visitor, CONTINUE_P, template_daemon)) {
                                        methods.funcall_instance_method_with_1_args(daemon_visitor, VISIT, template_daemon);
                                        while ((NIL != template_not_finished) && (NIL == subloop_collections.enumerator_template_last_p(template_enumerator))) {
                                            template_daemon = subloop_collections.enumerator_template_next(template_enumerator);
                                            if (NIL != methods.funcall_instance_method_with_1_args(daemon_visitor, CONTINUE_P, template_daemon)) {
                                                methods.funcall_instance_method_with_1_args(daemon_visitor, VISIT, template_daemon);
                                            } else {
                                                template_not_finished = NIL;
                                            }
                                        } 
                                    }
                                }
                            }
                            methods.funcall_instance_method_with_1_args(template_posting_daemons, DEALLOCATE_ENUMERATOR, template_enumerator);
                        }
                    }

            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_timer_panel_iterate_over_all_posting_daemons_method(SubLObject self, SubLObject daemon_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_blackboard_daemon.cyblack_posting_daemon_visitor_p(daemon_visitor)) {
                    Errors.error($str_alt358$_ITERATE_OVER_ALL_POSTING_DAEMONS, self, daemon_visitor);
                }
            }
            {
                SubLObject template_panel_queue = list(self);
                SubLObject template_visited_panels = NIL;
                SubLObject template_current_panel = NIL;
                if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                    format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt359$___ITERATE_OVER_ALL_POSTING_DAEMO, new SubLObject[]{ self, self, daemon_visitor });
                }
                while (NIL != template_panel_queue) {
                    template_current_panel = template_panel_queue.first();
                    template_panel_queue = template_panel_queue.rest();
                    if (NIL == subl_promotions.memberP(template_current_panel, template_visited_panels, UNPROVIDED, UNPROVIDED)) {
                        template_visited_panels = cons(template_current_panel, template_visited_panels);
                        template_panel_queue = nconc(template_panel_queue, methods.funcall_instance_method_with_0_args(template_current_panel, GET_SUB_PANELS));
                        cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_direct_posting_daemons(template_current_panel, daemon_visitor);
                    }
                } 
                return daemon_visitor;
            }
        }
    }

    public static final SubLObject cyblack_timer_panel_deactivate_posting_method(SubLObject self, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(posting)) {
                    Errors.error($str_alt363$_DEACTIVATE_POSTING__S____S_is_no, self, posting);
                }
            }
            return posting;
        }
    }

    public static final SubLObject cyblack_timer_panel_activate_posting_method(SubLObject self, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(posting)) {
                    Errors.error($str_alt367$_ACTIVATE_POSTING__S____S_is_not_, self, posting);
                }
            }
            return posting;
        }
    }

    public static final SubLObject cyblack_timer_panel_get_method(SubLObject self, SubLObject key) {
        return NIL;
    }

    public static final SubLObject cyblack_timer_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            SubLObject posting_daemons = get_cyblack_timer_panel_posting_daemons(self);
            SubLObject current_posting = get_cyblack_timer_panel_current_posting(self);
            SubLObject ticking = get_cyblack_timer_panel_ticking(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    cyblack_timer_panel_initialize_qua_markable_method(self);
                    current_posting = NIL;
                    interval = $SECOND;
                    ticking = NIL;
                    posting_daemons = object.object_new_method(BASIC_DOUBLY_LINKED_LIST);
                    sublisp_throw($sym375$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                            set_cyblack_timer_panel_posting_daemons(self, posting_daemons);
                            set_cyblack_timer_panel_current_posting(self, current_posting);
                            set_cyblack_timer_panel_ticking(self, ticking);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym375$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_set_application_method(SubLObject self, SubLObject new_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == new_application) || (NIL != cyblack_application.cyblack_application_p(new_application)))) {
                    Errors.error($str_alt381$_SET_APPLICATION__S____S_is_not_a, self, new_application);
                }
            }
            cyblack_object.set_cyblack_object_application(self, new_application);
            return new_application;
        }
    }

    public static final SubLObject cyblack_timer_panel_on_startup_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject sub_panels = get_cyblack_timer_panel_sub_panels(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            SubLObject started_up = get_cyblack_timer_panel_started_up(self);
            try {
                try {
                    cyblack_object.cyblack_object_on_startup_method(self);
                    cyblack_timer_panel_remove_direct_knowledge_sources_method(self);
                    cyblack_timer_panel_remove_direct_postings_method(self);
                    {
                        SubLObject cdolist_list_var = sub_panels;
                        SubLObject panel = NIL;
                        for (panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , panel = cdolist_list_var.first()) {
                            methods.funcall_instance_method_with_1_args(panel, SET_APPLICATION, application);
                            methods.funcall_instance_method_with_0_args(panel, ON_STARTUP);
                        }
                    }
                    started_up = T;
                    sublisp_throw($sym385$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_sub_panels(self, sub_panels);
                            cyblack_object.set_cyblack_object_application(self, application);
                            set_cyblack_timer_panel_started_up(self, started_up);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym385$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_on_shutdown_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject sub_panels = get_cyblack_timer_panel_sub_panels(self);
            SubLObject current_posting = get_cyblack_timer_panel_current_posting(self);
            SubLObject started_up = get_cyblack_timer_panel_started_up(self);
            try {
                try {
                    started_up = NIL;
                    cyblack_timer_panel_on_remove_last_knowledge_source_method(self);
                    if (NIL != current_posting) {
                        methods.funcall_instance_method_with_0_args(current_posting, ON_SHUTDOWN);
                    }
                    {
                        SubLObject cdolist_list_var = sub_panels;
                        SubLObject panel = NIL;
                        for (panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , panel = cdolist_list_var.first()) {
                            methods.funcall_instance_method_with_0_args(panel, ON_SHUTDOWN);
                        }
                    }
                    cyblack_object.cyblack_object_on_shutdown_method(self);
                    sublisp_throw($sym389$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_sub_panels(self, sub_panels);
                            set_cyblack_timer_panel_current_posting(self, current_posting);
                            set_cyblack_timer_panel_started_up(self, started_up);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym389$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_do_tick_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_timer_panel_method = NIL;
            SubLObject datatype = get_cyblack_timer_panel_datatype(self);
            SubLObject started_up = get_cyblack_timer_panel_started_up(self);
            try {
                try {
                    if ((NIL != started_up) && (NIL != datatype)) {
                        cyblack_timer_panel_add_posting_method(self, methods.funcall_instance_method_with_0_args(datatype, CREATE_POSTING));
                    }
                    sublisp_throw($sym393$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_datatype(self, datatype);
                            set_cyblack_timer_panel_started_up(self, started_up);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_panel_method = Errors.handleThrowable(ccatch_env_var, $sym393$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD);
            }
            return catch_var_for_cyblack_timer_panel_method;
        }
    }

    public static final SubLObject cyblack_timer_panel_background_process_method(SubLObject self) {
        {
            SubLObject interval_seconds = cyblack_time_interval_to_seconds(get_cyblack_timer_panel_interval(self));
            if (NIL != interval_seconds) {
                while (NIL != get_cyblack_timer_panel_ticking(self)) {
                    sleep(interval_seconds);
                    cyblack_timer_panel_do_tick_method(self);
                } 
            }
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_second_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_second_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_second_panel_p(SubLObject cyblack_second_panel) {
        return classes.subloop_instanceof_class(cyblack_second_panel, CYBLACK_SECOND_PANEL);
    }

    public static final SubLObject cyblack_second_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_second_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $SECOND;
                    sublisp_throw($sym403$OUTER_CATCH_FOR_CYBLACK_SECOND_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_second_panel_method = Errors.handleThrowable(ccatch_env_var, $sym403$OUTER_CATCH_FOR_CYBLACK_SECOND_PANEL_METHOD);
            }
            return catch_var_for_cyblack_second_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_quarter_minute_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_quarter_minute_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_quarter_minute_panel_p(SubLObject cyblack_quarter_minute_panel) {
        return classes.subloop_instanceof_class(cyblack_quarter_minute_panel, CYBLACK_QUARTER_MINUTE_PANEL);
    }

    public static final SubLObject cyblack_quarter_minute_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_quarter_minute_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $QUARTER_MINUTE;
                    sublisp_throw($sym408$OUTER_CATCH_FOR_CYBLACK_QUARTER_MINUTE_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_quarter_minute_panel_method = Errors.handleThrowable(ccatch_env_var, $sym408$OUTER_CATCH_FOR_CYBLACK_QUARTER_MINUTE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_quarter_minute_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_half_minute_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_half_minute_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_half_minute_panel_p(SubLObject cyblack_half_minute_panel) {
        return classes.subloop_instanceof_class(cyblack_half_minute_panel, CYBLACK_HALF_MINUTE_PANEL);
    }

    public static final SubLObject cyblack_half_minute_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_half_minute_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $HALF_MINUTE;
                    sublisp_throw($sym413$OUTER_CATCH_FOR_CYBLACK_HALF_MINUTE_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_half_minute_panel_method = Errors.handleThrowable(ccatch_env_var, $sym413$OUTER_CATCH_FOR_CYBLACK_HALF_MINUTE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_half_minute_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_minute_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_minute_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_minute_panel_p(SubLObject cyblack_minute_panel) {
        return classes.subloop_instanceof_class(cyblack_minute_panel, CYBLACK_MINUTE_PANEL);
    }

    public static final SubLObject cyblack_minute_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_minute_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $MINUTE;
                    sublisp_throw($sym418$OUTER_CATCH_FOR_CYBLACK_MINUTE_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_minute_panel_method = Errors.handleThrowable(ccatch_env_var, $sym418$OUTER_CATCH_FOR_CYBLACK_MINUTE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_minute_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_quarter_hour_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_quarter_hour_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_quarter_hour_panel_p(SubLObject cyblack_quarter_hour_panel) {
        return classes.subloop_instanceof_class(cyblack_quarter_hour_panel, CYBLACK_QUARTER_HOUR_PANEL);
    }

    public static final SubLObject cyblack_quarter_hour_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_quarter_hour_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $QUARTER_HOUR;
                    sublisp_throw($sym423$OUTER_CATCH_FOR_CYBLACK_QUARTER_HOUR_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_quarter_hour_panel_method = Errors.handleThrowable(ccatch_env_var, $sym423$OUTER_CATCH_FOR_CYBLACK_QUARTER_HOUR_PANEL_METHOD);
            }
            return catch_var_for_cyblack_quarter_hour_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_half_hour_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_half_hour_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_half_hour_panel_p(SubLObject cyblack_half_hour_panel) {
        return classes.subloop_instanceof_class(cyblack_half_hour_panel, CYBLACK_HALF_HOUR_PANEL);
    }

    public static final SubLObject cyblack_half_hour_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_half_hour_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $HALF_HOUR;
                    sublisp_throw($sym428$OUTER_CATCH_FOR_CYBLACK_HALF_HOUR_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_half_hour_panel_method = Errors.handleThrowable(ccatch_env_var, $sym428$OUTER_CATCH_FOR_CYBLACK_HALF_HOUR_PANEL_METHOD);
            }
            return catch_var_for_cyblack_half_hour_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_hour_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_hour_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_hour_panel_p(SubLObject cyblack_hour_panel) {
        return classes.subloop_instanceof_class(cyblack_hour_panel, CYBLACK_HOUR_PANEL);
    }

    public static final SubLObject cyblack_hour_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_hour_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $HOUR;
                    sublisp_throw($sym433$OUTER_CATCH_FOR_CYBLACK_HOUR_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_hour_panel_method = Errors.handleThrowable(ccatch_env_var, $sym433$OUTER_CATCH_FOR_CYBLACK_HOUR_PANEL_METHOD);
            }
            return catch_var_for_cyblack_hour_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_two_hours_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_two_hours_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_two_hours_panel_p(SubLObject cyblack_two_hours_panel) {
        return classes.subloop_instanceof_class(cyblack_two_hours_panel, CYBLACK_TWO_HOURS_PANEL);
    }

    public static final SubLObject cyblack_two_hours_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_two_hours_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $TWO_HOURS;
                    sublisp_throw($sym438$OUTER_CATCH_FOR_CYBLACK_TWO_HOURS_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_two_hours_panel_method = Errors.handleThrowable(ccatch_env_var, $sym438$OUTER_CATCH_FOR_CYBLACK_TWO_HOURS_PANEL_METHOD);
            }
            return catch_var_for_cyblack_two_hours_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_three_hours_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_three_hours_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_three_hours_panel_p(SubLObject cyblack_three_hours_panel) {
        return classes.subloop_instanceof_class(cyblack_three_hours_panel, CYBLACK_THREE_HOURS_PANEL);
    }

    public static final SubLObject cyblack_three_hours_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_three_hours_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $THREE_HOURS;
                    sublisp_throw($sym443$OUTER_CATCH_FOR_CYBLACK_THREE_HOURS_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_three_hours_panel_method = Errors.handleThrowable(ccatch_env_var, $sym443$OUTER_CATCH_FOR_CYBLACK_THREE_HOURS_PANEL_METHOD);
            }
            return catch_var_for_cyblack_three_hours_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_four_hours_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_four_hours_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_four_hours_panel_p(SubLObject cyblack_four_hours_panel) {
        return classes.subloop_instanceof_class(cyblack_four_hours_panel, CYBLACK_FOUR_HOURS_PANEL);
    }

    public static final SubLObject cyblack_four_hours_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_four_hours_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $FOUR_HOURS;
                    sublisp_throw($sym448$OUTER_CATCH_FOR_CYBLACK_FOUR_HOURS_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_four_hours_panel_method = Errors.handleThrowable(ccatch_env_var, $sym448$OUTER_CATCH_FOR_CYBLACK_FOUR_HOURS_PANEL_METHOD);
            }
            return catch_var_for_cyblack_four_hours_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_five_hours_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_five_hours_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_five_hours_panel_p(SubLObject cyblack_five_hours_panel) {
        return classes.subloop_instanceof_class(cyblack_five_hours_panel, CYBLACK_FIVE_HOURS_PANEL);
    }

    public static final SubLObject cyblack_five_hours_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_five_hours_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $FIVE_HOURS;
                    sublisp_throw($sym453$OUTER_CATCH_FOR_CYBLACK_FIVE_HOURS_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_five_hours_panel_method = Errors.handleThrowable(ccatch_env_var, $sym453$OUTER_CATCH_FOR_CYBLACK_FIVE_HOURS_PANEL_METHOD);
            }
            return catch_var_for_cyblack_five_hours_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_six_hours_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_six_hours_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_six_hours_panel_p(SubLObject cyblack_six_hours_panel) {
        return classes.subloop_instanceof_class(cyblack_six_hours_panel, CYBLACK_SIX_HOURS_PANEL);
    }

    public static final SubLObject cyblack_six_hours_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_six_hours_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $SIX_HOURS;
                    sublisp_throw($sym458$OUTER_CATCH_FOR_CYBLACK_SIX_HOURS_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_six_hours_panel_method = Errors.handleThrowable(ccatch_env_var, $sym458$OUTER_CATCH_FOR_CYBLACK_SIX_HOURS_PANEL_METHOD);
            }
            return catch_var_for_cyblack_six_hours_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_seven_hours_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_seven_hours_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_seven_hours_panel_p(SubLObject cyblack_seven_hours_panel) {
        return classes.subloop_instanceof_class(cyblack_seven_hours_panel, CYBLACK_SEVEN_HOURS_PANEL);
    }

    public static final SubLObject cyblack_seven_hours_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_seven_hours_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $SEVEN_HOURS;
                    sublisp_throw($sym463$OUTER_CATCH_FOR_CYBLACK_SEVEN_HOURS_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_seven_hours_panel_method = Errors.handleThrowable(ccatch_env_var, $sym463$OUTER_CATCH_FOR_CYBLACK_SEVEN_HOURS_PANEL_METHOD);
            }
            return catch_var_for_cyblack_seven_hours_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_eight_hours_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_eight_hours_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_eight_hours_panel_p(SubLObject cyblack_eight_hours_panel) {
        return classes.subloop_instanceof_class(cyblack_eight_hours_panel, CYBLACK_EIGHT_HOURS_PANEL);
    }

    public static final SubLObject cyblack_eight_hours_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_eight_hours_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $EIGHT_HOURS;
                    sublisp_throw($sym468$OUTER_CATCH_FOR_CYBLACK_EIGHT_HOURS_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_eight_hours_panel_method = Errors.handleThrowable(ccatch_env_var, $sym468$OUTER_CATCH_FOR_CYBLACK_EIGHT_HOURS_PANEL_METHOD);
            }
            return catch_var_for_cyblack_eight_hours_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_nine_hours_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_nine_hours_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_nine_hours_panel_p(SubLObject cyblack_nine_hours_panel) {
        return classes.subloop_instanceof_class(cyblack_nine_hours_panel, CYBLACK_NINE_HOURS_PANEL);
    }

    public static final SubLObject cyblack_nine_hours_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_nine_hours_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $NINE_HOURS;
                    sublisp_throw($sym473$OUTER_CATCH_FOR_CYBLACK_NINE_HOURS_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_nine_hours_panel_method = Errors.handleThrowable(ccatch_env_var, $sym473$OUTER_CATCH_FOR_CYBLACK_NINE_HOURS_PANEL_METHOD);
            }
            return catch_var_for_cyblack_nine_hours_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_ten_hours_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_ten_hours_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_ten_hours_panel_p(SubLObject cyblack_ten_hours_panel) {
        return classes.subloop_instanceof_class(cyblack_ten_hours_panel, CYBLACK_TEN_HOURS_PANEL);
    }

    public static final SubLObject cyblack_ten_hours_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_ten_hours_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $TEN_HOURS;
                    sublisp_throw($sym478$OUTER_CATCH_FOR_CYBLACK_TEN_HOURS_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ten_hours_panel_method = Errors.handleThrowable(ccatch_env_var, $sym478$OUTER_CATCH_FOR_CYBLACK_TEN_HOURS_PANEL_METHOD);
            }
            return catch_var_for_cyblack_ten_hours_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_eleven_hours_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_eleven_hours_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_eleven_hours_panel_p(SubLObject cyblack_eleven_hours_panel) {
        return classes.subloop_instanceof_class(cyblack_eleven_hours_panel, CYBLACK_ELEVEN_HOURS_PANEL);
    }

    public static final SubLObject cyblack_eleven_hours_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_eleven_hours_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $ELEVEN_HOURS;
                    sublisp_throw($sym483$OUTER_CATCH_FOR_CYBLACK_ELEVEN_HOURS_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_eleven_hours_panel_method = Errors.handleThrowable(ccatch_env_var, $sym483$OUTER_CATCH_FOR_CYBLACK_ELEVEN_HOURS_PANEL_METHOD);
            }
            return catch_var_for_cyblack_eleven_hours_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_half_day_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_half_day_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_half_day_panel_p(SubLObject cyblack_half_day_panel) {
        return classes.subloop_instanceof_class(cyblack_half_day_panel, CYBLACK_HALF_DAY_PANEL);
    }

    public static final SubLObject cyblack_half_day_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_half_day_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $HALF_DAY;
                    sublisp_throw($sym488$OUTER_CATCH_FOR_CYBLACK_HALF_DAY_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_half_day_panel_method = Errors.handleThrowable(ccatch_env_var, $sym488$OUTER_CATCH_FOR_CYBLACK_HALF_DAY_PANEL_METHOD);
            }
            return catch_var_for_cyblack_half_day_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_day_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_day_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_day_panel_p(SubLObject cyblack_day_panel) {
        return classes.subloop_instanceof_class(cyblack_day_panel, CYBLACK_DAY_PANEL);
    }

    public static final SubLObject cyblack_day_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_day_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $DAY;
                    sublisp_throw($sym493$OUTER_CATCH_FOR_CYBLACK_DAY_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_day_panel_method = Errors.handleThrowable(ccatch_env_var, $sym493$OUTER_CATCH_FOR_CYBLACK_DAY_PANEL_METHOD);
            }
            return catch_var_for_cyblack_day_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_week_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_week_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_week_panel_p(SubLObject cyblack_week_panel) {
        return classes.subloop_instanceof_class(cyblack_week_panel, CYBLACK_WEEK_PANEL);
    }

    public static final SubLObject cyblack_week_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_week_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $WEEK;
                    sublisp_throw($sym498$OUTER_CATCH_FOR_CYBLACK_WEEK_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_week_panel_method = Errors.handleThrowable(ccatch_env_var, $sym498$OUTER_CATCH_FOR_CYBLACK_WEEK_PANEL_METHOD);
            }
            return catch_var_for_cyblack_week_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_month_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_month_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_month_panel_p(SubLObject cyblack_month_panel) {
        return classes.subloop_instanceof_class(cyblack_month_panel, CYBLACK_MONTH_PANEL);
    }

    public static final SubLObject cyblack_month_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_month_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $MONTH;
                    sublisp_throw($sym503$OUTER_CATCH_FOR_CYBLACK_MONTH_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_month_panel_method = Errors.handleThrowable(ccatch_env_var, $sym503$OUTER_CATCH_FOR_CYBLACK_MONTH_PANEL_METHOD);
            }
            return catch_var_for_cyblack_month_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_year_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_year_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, TICKING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, STARTED_UP, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, CURRENT_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_PANEL, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_year_panel_p(SubLObject cyblack_year_panel) {
        return classes.subloop_instanceof_class(cyblack_year_panel, CYBLACK_YEAR_PANEL);
    }

    public static final SubLObject cyblack_year_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_year_panel_method = NIL;
            SubLObject interval = get_cyblack_timer_panel_interval(self);
            try {
                try {
                    cyblack_timer_panel_initialize_method(self);
                    interval = $YEAR;
                    sublisp_throw($sym508$OUTER_CATCH_FOR_CYBLACK_YEAR_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_panel_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_year_panel_method = Errors.handleThrowable(ccatch_env_var, $sym508$OUTER_CATCH_FOR_CYBLACK_YEAR_PANEL_METHOD);
            }
            return catch_var_for_cyblack_year_panel_method;
        }
    }

    public static final SubLObject declare_cyblack_timer_panel_file() {
        declareFunction("valid_cyblack_time_intervals", "VALID-CYBLACK-TIME-INTERVALS", 0, 0, false);
        declareFunction("cyblack_time_interval_p", "CYBLACK-TIME-INTERVAL-P", 1, 0, false);
        declareFunction("encode_cyblack_time_interval", "ENCODE-CYBLACK-TIME-INTERVAL", 1, 0, false);
        declareFunction("decode_cyblack_time_interval", "DECODE-CYBLACK-TIME-INTERVAL", 1, 0, false);
        declareFunction("cyblack_time_interval_less_p", "CYBLACK-TIME-INTERVAL-LESS-P", 2, 0, false);
        declareFunction("cyblack_time_interval_greater_p", "CYBLACK-TIME-INTERVAL-GREATER-P", 2, 0, false);
        declareFunction("cyblack_timer_interval_list_p", "CYBLACK-TIMER-INTERVAL-LIST-P", 1, 0, false);
        declareFunction("cyblack_time_interval_to_seconds", "CYBLACK-TIME-INTERVAL-TO-SECONDS", 1, 0, false);
        declareFunction("cyblack_time_interval_to_type_name", "CYBLACK-TIME-INTERVAL-TO-TYPE-NAME", 1, 0, false);
        declareFunction("cyblack_time_interval_to_panel", "CYBLACK-TIME-INTERVAL-TO-PANEL", 1, 0, false);
        declareFunction("cyblack_time_interval_to_posting", "CYBLACK-TIME-INTERVAL-TO-POSTING", 1, 0, false);
        declareFunction("cyblack_timer_panel_interval_stack_push", "CYBLACK-TIMER-PANEL-INTERVAL-STACK-PUSH", 1, 0, false);
        declareFunction("cyblack_timer_panel_interval_stack_pop", "CYBLACK-TIMER-PANEL-INTERVAL-STACK-POP", 0, 0, false);
        declareFunction("cyblack_timer_panel_run_backboard_process", "CYBLACK-TIMER-PANEL-RUN-BACKBOARD-PROCESS", 0, 0, false);
        declareFunction("get_cyblack_timer_panel_interval", "GET-CYBLACK-TIMER-PANEL-INTERVAL", 1, 0, false);
        declareFunction("set_cyblack_timer_panel_interval", "SET-CYBLACK-TIMER-PANEL-INTERVAL", 2, 0, false);
        declareFunction("get_cyblack_timer_panel_posting_daemons", "GET-CYBLACK-TIMER-PANEL-POSTING-DAEMONS", 1, 0, false);
        declareFunction("set_cyblack_timer_panel_posting_daemons", "SET-CYBLACK-TIMER-PANEL-POSTING-DAEMONS", 2, 0, false);
        declareFunction("get_cyblack_timer_panel_datatype", "GET-CYBLACK-TIMER-PANEL-DATATYPE", 1, 0, false);
        declareFunction("set_cyblack_timer_panel_datatype", "SET-CYBLACK-TIMER-PANEL-DATATYPE", 2, 0, false);
        declareFunction("get_cyblack_timer_panel_direct_knowledge_sources", "GET-CYBLACK-TIMER-PANEL-DIRECT-KNOWLEDGE-SOURCES", 1, 0, false);
        declareFunction("set_cyblack_timer_panel_direct_knowledge_sources", "SET-CYBLACK-TIMER-PANEL-DIRECT-KNOWLEDGE-SOURCES", 2, 0, false);
        declareFunction("get_cyblack_timer_panel_sub_panels", "GET-CYBLACK-TIMER-PANEL-SUB-PANELS", 1, 0, false);
        declareFunction("set_cyblack_timer_panel_sub_panels", "SET-CYBLACK-TIMER-PANEL-SUB-PANELS", 2, 0, false);
        declareFunction("get_cyblack_timer_panel_super_panels", "GET-CYBLACK-TIMER-PANEL-SUPER-PANELS", 1, 0, false);
        declareFunction("set_cyblack_timer_panel_super_panels", "SET-CYBLACK-TIMER-PANEL-SUPER-PANELS", 2, 0, false);
        declareFunction("get_cyblack_timer_panel_current_posting", "GET-CYBLACK-TIMER-PANEL-CURRENT-POSTING", 1, 0, false);
        declareFunction("set_cyblack_timer_panel_current_posting", "SET-CYBLACK-TIMER-PANEL-CURRENT-POSTING", 2, 0, false);
        declareFunction("get_cyblack_timer_panel_marks", "GET-CYBLACK-TIMER-PANEL-MARKS", 1, 0, false);
        declareFunction("set_cyblack_timer_panel_marks", "SET-CYBLACK-TIMER-PANEL-MARKS", 2, 0, false);
        declareFunction("get_cyblack_timer_panel_started_up", "GET-CYBLACK-TIMER-PANEL-STARTED-UP", 1, 0, false);
        declareFunction("set_cyblack_timer_panel_started_up", "SET-CYBLACK-TIMER-PANEL-STARTED-UP", 2, 0, false);
        declareFunction("get_cyblack_timer_panel_ticking", "GET-CYBLACK-TIMER-PANEL-TICKING", 1, 0, false);
        declareFunction("set_cyblack_timer_panel_ticking", "SET-CYBLACK-TIMER-PANEL-TICKING", 2, 0, false);
        declareFunction("cyblack_timer_panel_iterate_over_all_knowledge_sources_method", "CYBLACK-TIMER-PANEL-ITERATE-OVER-ALL-KNOWLEDGE-SOURCES-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_iterate_over_all_direct_knowledge_sources_method", "CYBLACK-TIMER-PANEL-ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_iterate_over_all_postings_method", "CYBLACK-TIMER-PANEL-ITERATE-OVER-ALL-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_iterate_over_all_direct_postings_method", "CYBLACK-TIMER-PANEL-ITERATE-OVER-ALL-DIRECT-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_get_all_active_postings_method", "CYBLACK-TIMER-PANEL-GET-ALL-ACTIVE-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_get_all_postings_method", "CYBLACK-TIMER-PANEL-GET-ALL-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_get_all_knowledge_sources_method", "CYBLACK-TIMER-PANEL-GET-ALL-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_set_direct_knowledge_sources_method", "CYBLACK-TIMER-PANEL-SET-DIRECT-KNOWLEDGE-SOURCES-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_remove_direct_knowledge_sources_method", "CYBLACK-TIMER-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_stimulate_all_posting_daemons_method", "CYBLACK-TIMER-PANEL-STIMULATE-ALL-POSTING-DAEMONS-METHOD", 1, 2, false);
        declareFunction("cyblack_timer_panel_stimulate_all_monitors_method", "CYBLACK-TIMER-PANEL-STIMULATE-ALL-MONITORS-METHOD", 1, 1, false);
        declareFunction("cyblack_timer_panel_stimulate_all_knowledge_sources_method", "CYBLACK-TIMER-PANEL-STIMULATE-ALL-KNOWLEDGE-SOURCES-METHOD", 1, 1, false);
        declareFunction("cyblack_timer_panel_stimulate_direct_knowledge_sources_method", "CYBLACK-TIMER-PANEL-STIMULATE-DIRECT-KNOWLEDGE-SOURCES-METHOD", 1, 1, false);
        declareFunction("cyblack_timer_panel_get_all_sub_panels_method", "CYBLACK-TIMER-PANEL-GET-ALL-SUB-PANELS-METHOD", 1, 1, false);
        declareFunction("subloop_reserved_initialize_cyblack_timer_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TIMER-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_timer_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TIMER-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_timer_panel_p", "CYBLACK-TIMER-PANEL-P", 1, 0, false);
        declareFunction("cyblack_timer_panel_initialize_qua_markable_method", "CYBLACK-TIMER-PANEL-INITIALIZE-QUA-MARKABLE-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_get_marks_internal_method", "CYBLACK-TIMER-PANEL-GET-MARKS-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_set_marks_internal_method", "CYBLACK-TIMER-PANEL-SET-MARKS-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_get_stimulation_type_method", "CYBLACK-TIMER-PANEL-GET-STIMULATION-TYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_set_stimulation_type_method", "CYBLACK-TIMER-PANEL-SET-STIMULATION-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_get_super_panels_method", "CYBLACK-TIMER-PANEL-GET-SUPER-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_get_sub_panels_method", "CYBLACK-TIMER-PANEL-GET-SUB-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_add_super_panel_method", "CYBLACK-TIMER-PANEL-ADD-SUPER-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_add_sub_panel_method", "CYBLACK-TIMER-PANEL-ADD-SUB-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_remove_super_panel_method", "CYBLACK-TIMER-PANEL-REMOVE-SUPER-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_remove_sub_panel_method", "CYBLACK-TIMER-PANEL-REMOVE-SUB-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_add_posting_method", "CYBLACK-TIMER-PANEL-ADD-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_remove_posting_method", "CYBLACK-TIMER-PANEL-REMOVE-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_get_datatype_method", "CYBLACK-TIMER-PANEL-GET-DATATYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_set_datatype_method", "CYBLACK-TIMER-PANEL-SET-DATATYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_on_add_first_knowledge_source_method", "CYBLACK-TIMER-PANEL-ON-ADD-FIRST-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_on_remove_last_knowledge_source_method", "CYBLACK-TIMER-PANEL-ON-REMOVE-LAST-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_add_direct_knowledge_source_method", "CYBLACK-TIMER-PANEL-ADD-DIRECT-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_remove_direct_knowledge_source_method", "CYBLACK-TIMER-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_remove_all_knowledge_sources_method", "CYBLACK-TIMER-PANEL-REMOVE-ALL-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_get_direct_knowledge_sources_method", "CYBLACK-TIMER-PANEL-GET-DIRECT-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_add_direct_posting_method", "CYBLACK-TIMER-PANEL-ADD-DIRECT-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_get_direct_active_postings_method", "CYBLACK-TIMER-PANEL-GET-DIRECT-ACTIVE-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_remove_direct_posting_method", "CYBLACK-TIMER-PANEL-REMOVE-DIRECT-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_add_direct_postings_method", "CYBLACK-TIMER-PANEL-ADD-DIRECT-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_get_direct_postings_method", "CYBLACK-TIMER-PANEL-GET-DIRECT-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_remove_direct_postings_method", "CYBLACK-TIMER-PANEL-REMOVE-DIRECT-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_add_posting_daemon_method", "CYBLACK-TIMER-PANEL-ADD-POSTING-DAEMON-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_remove_posting_daemon_method", "CYBLACK-TIMER-PANEL-REMOVE-POSTING-DAEMON-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_get_posting_daemons_method", "CYBLACK-TIMER-PANEL-GET-POSTING-DAEMONS-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_remove_all_direct_posting_daemons_method", "CYBLACK-TIMER-PANEL-REMOVE-ALL-DIRECT-POSTING-DAEMONS-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_iterate_over_all_direct_posting_daemons_method", "CYBLACK-TIMER-PANEL-ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_iterate_over_all_posting_daemons_method", "CYBLACK-TIMER-PANEL-ITERATE-OVER-ALL-POSTING-DAEMONS-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_deactivate_posting_method", "CYBLACK-TIMER-PANEL-DEACTIVATE-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_activate_posting_method", "CYBLACK-TIMER-PANEL-ACTIVATE-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_get_method", "CYBLACK-TIMER-PANEL-GET-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_initialize_method", "CYBLACK-TIMER-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_set_application_method", "CYBLACK-TIMER-PANEL-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_timer_panel_on_startup_method", "CYBLACK-TIMER-PANEL-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_on_shutdown_method", "CYBLACK-TIMER-PANEL-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_do_tick_method", "CYBLACK-TIMER-PANEL-DO-TICK-METHOD", 1, 0, false);
        declareFunction("cyblack_timer_panel_background_process_method", "CYBLACK-TIMER-PANEL-BACKGROUND-PROCESS-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_second_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SECOND-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_second_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SECOND-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_second_panel_p", "CYBLACK-SECOND-PANEL-P", 1, 0, false);
        declareFunction("cyblack_second_panel_initialize_method", "CYBLACK-SECOND-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_quarter_minute_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUARTER-MINUTE-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_quarter_minute_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUARTER-MINUTE-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_quarter_minute_panel_p", "CYBLACK-QUARTER-MINUTE-PANEL-P", 1, 0, false);
        declareFunction("cyblack_quarter_minute_panel_initialize_method", "CYBLACK-QUARTER-MINUTE-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_half_minute_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-MINUTE-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_half_minute_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-MINUTE-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_half_minute_panel_p", "CYBLACK-HALF-MINUTE-PANEL-P", 1, 0, false);
        declareFunction("cyblack_half_minute_panel_initialize_method", "CYBLACK-HALF-MINUTE-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_minute_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MINUTE-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_minute_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MINUTE-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_minute_panel_p", "CYBLACK-MINUTE-PANEL-P", 1, 0, false);
        declareFunction("cyblack_minute_panel_initialize_method", "CYBLACK-MINUTE-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_quarter_hour_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUARTER-HOUR-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_quarter_hour_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUARTER-HOUR-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_quarter_hour_panel_p", "CYBLACK-QUARTER-HOUR-PANEL-P", 1, 0, false);
        declareFunction("cyblack_quarter_hour_panel_initialize_method", "CYBLACK-QUARTER-HOUR-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_half_hour_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-HOUR-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_half_hour_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-HOUR-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_half_hour_panel_p", "CYBLACK-HALF-HOUR-PANEL-P", 1, 0, false);
        declareFunction("cyblack_half_hour_panel_initialize_method", "CYBLACK-HALF-HOUR-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_hour_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HOUR-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_hour_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HOUR-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_hour_panel_p", "CYBLACK-HOUR-PANEL-P", 1, 0, false);
        declareFunction("cyblack_hour_panel_initialize_method", "CYBLACK-HOUR-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_two_hours_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TWO-HOURS-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_two_hours_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TWO-HOURS-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_two_hours_panel_p", "CYBLACK-TWO-HOURS-PANEL-P", 1, 0, false);
        declareFunction("cyblack_two_hours_panel_initialize_method", "CYBLACK-TWO-HOURS-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_three_hours_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-THREE-HOURS-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_three_hours_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-THREE-HOURS-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_three_hours_panel_p", "CYBLACK-THREE-HOURS-PANEL-P", 1, 0, false);
        declareFunction("cyblack_three_hours_panel_initialize_method", "CYBLACK-THREE-HOURS-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_four_hours_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FOUR-HOURS-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_four_hours_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FOUR-HOURS-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_four_hours_panel_p", "CYBLACK-FOUR-HOURS-PANEL-P", 1, 0, false);
        declareFunction("cyblack_four_hours_panel_initialize_method", "CYBLACK-FOUR-HOURS-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_five_hours_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FIVE-HOURS-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_five_hours_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FIVE-HOURS-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_five_hours_panel_p", "CYBLACK-FIVE-HOURS-PANEL-P", 1, 0, false);
        declareFunction("cyblack_five_hours_panel_initialize_method", "CYBLACK-FIVE-HOURS-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_six_hours_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SIX-HOURS-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_six_hours_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SIX-HOURS-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_six_hours_panel_p", "CYBLACK-SIX-HOURS-PANEL-P", 1, 0, false);
        declareFunction("cyblack_six_hours_panel_initialize_method", "CYBLACK-SIX-HOURS-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_seven_hours_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SEVEN-HOURS-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_seven_hours_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SEVEN-HOURS-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_seven_hours_panel_p", "CYBLACK-SEVEN-HOURS-PANEL-P", 1, 0, false);
        declareFunction("cyblack_seven_hours_panel_initialize_method", "CYBLACK-SEVEN-HOURS-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_eight_hours_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EIGHT-HOURS-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_eight_hours_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EIGHT-HOURS-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_eight_hours_panel_p", "CYBLACK-EIGHT-HOURS-PANEL-P", 1, 0, false);
        declareFunction("cyblack_eight_hours_panel_initialize_method", "CYBLACK-EIGHT-HOURS-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_nine_hours_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-NINE-HOURS-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_nine_hours_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-NINE-HOURS-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_nine_hours_panel_p", "CYBLACK-NINE-HOURS-PANEL-P", 1, 0, false);
        declareFunction("cyblack_nine_hours_panel_initialize_method", "CYBLACK-NINE-HOURS-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_ten_hours_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TEN-HOURS-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_ten_hours_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TEN-HOURS-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_ten_hours_panel_p", "CYBLACK-TEN-HOURS-PANEL-P", 1, 0, false);
        declareFunction("cyblack_ten_hours_panel_initialize_method", "CYBLACK-TEN-HOURS-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_eleven_hours_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ELEVEN-HOURS-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_eleven_hours_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ELEVEN-HOURS-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_eleven_hours_panel_p", "CYBLACK-ELEVEN-HOURS-PANEL-P", 1, 0, false);
        declareFunction("cyblack_eleven_hours_panel_initialize_method", "CYBLACK-ELEVEN-HOURS-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_half_day_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-DAY-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_half_day_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-DAY-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_half_day_panel_p", "CYBLACK-HALF-DAY-PANEL-P", 1, 0, false);
        declareFunction("cyblack_half_day_panel_initialize_method", "CYBLACK-HALF-DAY-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_day_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DAY-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_day_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DAY-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_day_panel_p", "CYBLACK-DAY-PANEL-P", 1, 0, false);
        declareFunction("cyblack_day_panel_initialize_method", "CYBLACK-DAY-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_week_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-WEEK-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_week_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-WEEK-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_week_panel_p", "CYBLACK-WEEK-PANEL-P", 1, 0, false);
        declareFunction("cyblack_week_panel_initialize_method", "CYBLACK-WEEK-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_month_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MONTH-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_month_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MONTH-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_month_panel_p", "CYBLACK-MONTH-PANEL-P", 1, 0, false);
        declareFunction("cyblack_month_panel_initialize_method", "CYBLACK-MONTH-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_year_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-YEAR-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_year_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-YEAR-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_year_panel_p", "CYBLACK-YEAR-PANEL-P", 1, 0, false);
        declareFunction("cyblack_year_panel_initialize_method", "CYBLACK-YEAR-PANEL-INITIALIZE-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_timer_panel_file() {
        defconstant("*VALID-CYBLACK-TIME-INTERVALS*", $list_alt0);
        defparameter("*CYBLACK-TIMER-PANEL-INTERVAL-STACK*", NIL);
        defparameter("*CYBLACK-TIMER-PANEL-INTERVAL-STACK-LOCK*", make_lock($str_alt118$Timer_Panel_Interval_Stack__Lock));
        return NIL;
    }

    public static final SubLObject setup_cyblack_timer_panel_file() {
                enumerations.enumerations_incorporate_definition(CYBLACK_TIME_INTERVAL, $list_alt0);
        classes.subloop_new_class(CYBLACK_TIMER_PANEL, CYBLACK_OBJECT, $list_alt122, NIL, $list_alt123);
        classes.class_set_implements_slot_listeners(CYBLACK_TIMER_PANEL, NIL);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_KNOWLEDGE_SOURCES, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt132, $list_alt133);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ITERATE_OVER_ALL_KNOWLEDGE_SOURCES, CYBLACK_TIMER_PANEL_ITERATE_OVER_ALL_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt132, $list_alt137);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES, $sym140$CYBLACK_TIMER_PANEL_ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES_MET);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_POSTINGS, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt142, $list_alt143);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ITERATE_OVER_ALL_POSTINGS, CYBLACK_TIMER_PANEL_ITERATE_OVER_ALL_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_DIRECT_POSTINGS, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt142, $list_alt147);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ITERATE_OVER_ALL_DIRECT_POSTINGS, CYBLACK_TIMER_PANEL_ITERATE_OVER_ALL_DIRECT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_ACTIVE_POSTINGS, CYBLACK_TIMER_PANEL, $list_alt131, NIL, $list_alt151);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, GET_ALL_ACTIVE_POSTINGS, CYBLACK_TIMER_PANEL_GET_ALL_ACTIVE_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_POSTINGS, CYBLACK_TIMER_PANEL, $list_alt131, NIL, $list_alt155);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, GET_ALL_POSTINGS, CYBLACK_TIMER_PANEL_GET_ALL_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_KNOWLEDGE_SOURCES, CYBLACK_TIMER_PANEL, $list_alt131, NIL, $list_alt158);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, GET_ALL_KNOWLEDGE_SOURCES, CYBLACK_TIMER_PANEL_GET_ALL_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(SET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt162, $list_alt163);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, SET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_TIMER_PANEL_SET_DIRECT_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_TIMER_PANEL, $list_alt131, NIL, $list_alt166);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, REMOVE_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_TIMER_PANEL_REMOVE_DIRECT_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE_ALL_POSTING_DAEMONS, CYBLACK_TIMER_PANEL, $list_alt169, $list_alt170, $list_alt171);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, STIMULATE_ALL_POSTING_DAEMONS, CYBLACK_TIMER_PANEL_STIMULATE_ALL_POSTING_DAEMONS_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE_ALL_MONITORS, CYBLACK_TIMER_PANEL, $list_alt169, $list_alt175, $list_alt176);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, STIMULATE_ALL_MONITORS, CYBLACK_TIMER_PANEL_STIMULATE_ALL_MONITORS_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE_ALL_KNOWLEDGE_SOURCES, CYBLACK_TIMER_PANEL, $list_alt169, $list_alt180, $list_alt181);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, STIMULATE_ALL_KNOWLEDGE_SOURCES, CYBLACK_TIMER_PANEL_STIMULATE_ALL_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_TIMER_PANEL, $list_alt169, $list_alt180, $list_alt184);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, STIMULATE_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_TIMER_PANEL_STIMULATE_DIRECT_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_SUB_PANELS, CYBLACK_TIMER_PANEL, $list_alt169, $list_alt187, $list_alt188);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, GET_ALL_SUB_PANELS, CYBLACK_TIMER_PANEL_GET_ALL_SUB_PANELS_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_TIMER_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TIMER_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_TIMER_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TIMER_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_timer_panel_class(CYBLACK_TIMER_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_MARKABLE, CYBLACK_TIMER_PANEL, $list_alt205, NIL, $list_alt206);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, INITIALIZE_QUA_MARKABLE, CYBLACK_TIMER_PANEL_INITIALIZE_QUA_MARKABLE_METHOD);
        methods.methods_incorporate_instance_method(GET_MARKS_INTERNAL, CYBLACK_TIMER_PANEL, $list_alt169, NIL, $list_alt209);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, GET_MARKS_INTERNAL, CYBLACK_TIMER_PANEL_GET_MARKS_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_MARKS_INTERNAL, CYBLACK_TIMER_PANEL, $list_alt169, $list_alt213, $list_alt214);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, SET_MARKS_INTERNAL, CYBLACK_TIMER_PANEL_SET_MARKS_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_STIMULATION_TYPE, CYBLACK_TIMER_PANEL, $list_alt131, NIL, $list_alt218);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, GET_STIMULATION_TYPE, CYBLACK_TIMER_PANEL_GET_STIMULATION_TYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_STIMULATION_TYPE, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt221, $list_alt222);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, SET_STIMULATION_TYPE, CYBLACK_TIMER_PANEL_SET_STIMULATION_TYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_SUPER_PANELS, CYBLACK_TIMER_PANEL, $list_alt169, NIL, $list_alt225);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, GET_SUPER_PANELS, CYBLACK_TIMER_PANEL_GET_SUPER_PANELS_METHOD);
        methods.methods_incorporate_instance_method(GET_SUB_PANELS, CYBLACK_TIMER_PANEL, $list_alt169, NIL, $list_alt228);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, GET_SUB_PANELS, CYBLACK_TIMER_PANEL_GET_SUB_PANELS_METHOD);
        methods.methods_incorporate_instance_method(ADD_SUPER_PANEL, CYBLACK_TIMER_PANEL, $list_alt169, $list_alt232, $list_alt233);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ADD_SUPER_PANEL, CYBLACK_TIMER_PANEL_ADD_SUPER_PANEL_METHOD);
        methods.methods_incorporate_instance_method(ADD_SUB_PANEL, CYBLACK_TIMER_PANEL, $list_alt169, $list_alt238, $list_alt239);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ADD_SUB_PANEL, CYBLACK_TIMER_PANEL_ADD_SUB_PANEL_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_SUPER_PANEL, CYBLACK_TIMER_PANEL, $list_alt169, $list_alt244, $list_alt245);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, REMOVE_SUPER_PANEL, CYBLACK_TIMER_PANEL_REMOVE_SUPER_PANEL_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_SUB_PANEL, CYBLACK_TIMER_PANEL, $list_alt169, $list_alt248, $list_alt249);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, REMOVE_SUB_PANEL, CYBLACK_TIMER_PANEL_REMOVE_SUB_PANEL_METHOD);
        methods.methods_incorporate_instance_method(ADD_POSTING, CYBLACK_TIMER_PANEL, $list_alt205, $list_alt252, $list_alt253);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ADD_POSTING, CYBLACK_TIMER_PANEL_ADD_POSTING_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_POSTING, CYBLACK_TIMER_PANEL, $list_alt169, $list_alt252, $list_alt261);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, REMOVE_POSTING, CYBLACK_TIMER_PANEL_REMOVE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(GET_DATATYPE, CYBLACK_TIMER_PANEL, $list_alt131, NIL, $list_alt265);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, GET_DATATYPE, CYBLACK_TIMER_PANEL_GET_DATATYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_DATATYPE, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt269, $list_alt270);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, SET_DATATYPE, CYBLACK_TIMER_PANEL_SET_DATATYPE_METHOD);
        methods.methods_incorporate_instance_method(ON_ADD_FIRST_KNOWLEDGE_SOURCE, CYBLACK_TIMER_PANEL, $list_alt275, NIL, $list_alt276);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ON_ADD_FIRST_KNOWLEDGE_SOURCE, CYBLACK_TIMER_PANEL_ON_ADD_FIRST_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(ON_REMOVE_LAST_KNOWLEDGE_SOURCE, CYBLACK_TIMER_PANEL, $list_alt275, NIL, $list_alt281);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ON_REMOVE_LAST_KNOWLEDGE_SOURCE, CYBLACK_TIMER_PANEL_ON_REMOVE_LAST_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(ADD_DIRECT_KNOWLEDGE_SOURCE, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt284, $list_alt285);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ADD_DIRECT_KNOWLEDGE_SOURCE, CYBLACK_TIMER_PANEL_ADD_DIRECT_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DIRECT_KNOWLEDGE_SOURCE, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt284, $list_alt290);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, REMOVE_DIRECT_KNOWLEDGE_SOURCE, CYBLACK_TIMER_PANEL_REMOVE_DIRECT_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ALL_KNOWLEDGE_SOURCES, CYBLACK_TIMER_PANEL, $list_alt131, NIL, $list_alt294);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, REMOVE_ALL_KNOWLEDGE_SOURCES, CYBLACK_TIMER_PANEL_REMOVE_ALL_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_TIMER_PANEL, $list_alt131, NIL, $list_alt298);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, GET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_TIMER_PANEL_GET_DIRECT_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(ADD_DIRECT_POSTING, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt252, $list_alt302);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ADD_DIRECT_POSTING, CYBLACK_TIMER_PANEL_ADD_DIRECT_POSTING_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECT_ACTIVE_POSTINGS, CYBLACK_TIMER_PANEL, $list_alt131, NIL, $list_alt306);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, GET_DIRECT_ACTIVE_POSTINGS, CYBLACK_TIMER_PANEL_GET_DIRECT_ACTIVE_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DIRECT_POSTING, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt252, $list_alt309);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, REMOVE_DIRECT_POSTING, CYBLACK_TIMER_PANEL_REMOVE_DIRECT_POSTING_METHOD);
        methods.methods_incorporate_instance_method(ADD_DIRECT_POSTINGS, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt313, $list_alt314);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ADD_DIRECT_POSTINGS, CYBLACK_TIMER_PANEL_ADD_DIRECT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECT_POSTINGS, CYBLACK_TIMER_PANEL, $list_alt131, NIL, $list_alt318);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, GET_DIRECT_POSTINGS, CYBLACK_TIMER_PANEL_GET_DIRECT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DIRECT_POSTINGS, CYBLACK_TIMER_PANEL, $list_alt131, NIL, $list_alt322);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, REMOVE_DIRECT_POSTINGS, CYBLACK_TIMER_PANEL_REMOVE_DIRECT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(ADD_POSTING_DAEMON, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt326, $list_alt327);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ADD_POSTING_DAEMON, CYBLACK_TIMER_PANEL_ADD_POSTING_DAEMON_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_POSTING_DAEMON, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt333, $list_alt334);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, REMOVE_POSTING_DAEMON, CYBLACK_TIMER_PANEL_REMOVE_POSTING_DAEMON_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTING_DAEMONS, CYBLACK_TIMER_PANEL, $list_alt131, NIL, $list_alt340);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, GET_POSTING_DAEMONS, CYBLACK_TIMER_PANEL_GET_POSTING_DAEMONS_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ALL_DIRECT_POSTING_DAEMONS, CYBLACK_TIMER_PANEL, $list_alt131, NIL, $list_alt344);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, REMOVE_ALL_DIRECT_POSTING_DAEMONS, CYBLACK_TIMER_PANEL_REMOVE_ALL_DIRECT_POSTING_DAEMONS_METHOD);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt349, $list_alt350);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS, $sym355$CYBLACK_TIMER_PANEL_ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS_METHO);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_POSTING_DAEMONS, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt349, $list_alt357);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ITERATE_OVER_ALL_POSTING_DAEMONS, CYBLACK_TIMER_PANEL_ITERATE_OVER_ALL_POSTING_DAEMONS_METHOD);
        methods.methods_incorporate_instance_method(DEACTIVATE_POSTING, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt252, $list_alt362);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, DEACTIVATE_POSTING, CYBLACK_TIMER_PANEL_DEACTIVATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(ACTIVATE_POSTING, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt252, $list_alt366);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ACTIVATE_POSTING, CYBLACK_TIMER_PANEL_ACTIVATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(GET, CYBLACK_TIMER_PANEL, $list_alt131, $list_alt370, $list_alt371);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, GET, CYBLACK_TIMER_PANEL_GET_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_TIMER_PANEL, $list_alt169, NIL, $list_alt374);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, INITIALIZE, CYBLACK_TIMER_PANEL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_TIMER_PANEL, $list_alt275, $list_alt379, $list_alt380);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, SET_APPLICATION, CYBLACK_TIMER_PANEL_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_TIMER_PANEL, $list_alt131, NIL, $list_alt384);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ON_STARTUP, CYBLACK_TIMER_PANEL_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(ON_SHUTDOWN, CYBLACK_TIMER_PANEL, $list_alt131, NIL, $list_alt388);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, ON_SHUTDOWN, CYBLACK_TIMER_PANEL_ON_SHUTDOWN_METHOD);
        methods.methods_incorporate_instance_method(DO_TICK, CYBLACK_TIMER_PANEL, $list_alt131, NIL, $list_alt392);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, DO_TICK, CYBLACK_TIMER_PANEL_DO_TICK_METHOD);
        methods.methods_incorporate_instance_method(BACKGROUND_PROCESS, CYBLACK_TIMER_PANEL, $list_alt205, NIL, $list_alt397);
        methods.subloop_register_instance_method(CYBLACK_TIMER_PANEL, BACKGROUND_PROCESS, CYBLACK_TIMER_PANEL_BACKGROUND_PROCESS_METHOD);
        classes.subloop_new_class(CYBLACK_SECOND_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_SECOND_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_SECOND_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SECOND_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_SECOND_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SECOND_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_second_panel_class(CYBLACK_SECOND_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_SECOND_PANEL, $list_alt169, NIL, $list_alt402);
        methods.subloop_register_instance_method(CYBLACK_SECOND_PANEL, INITIALIZE, CYBLACK_SECOND_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_QUARTER_MINUTE_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_QUARTER_MINUTE_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_QUARTER_MINUTE_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUARTER_MINUTE_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_QUARTER_MINUTE_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUARTER_MINUTE_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_quarter_minute_panel_class(CYBLACK_QUARTER_MINUTE_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_QUARTER_MINUTE_PANEL, $list_alt169, NIL, $list_alt407);
        methods.subloop_register_instance_method(CYBLACK_QUARTER_MINUTE_PANEL, INITIALIZE, CYBLACK_QUARTER_MINUTE_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_HALF_MINUTE_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_HALF_MINUTE_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_HALF_MINUTE_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_MINUTE_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_HALF_MINUTE_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_MINUTE_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_half_minute_panel_class(CYBLACK_HALF_MINUTE_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_HALF_MINUTE_PANEL, $list_alt169, NIL, $list_alt412);
        methods.subloop_register_instance_method(CYBLACK_HALF_MINUTE_PANEL, INITIALIZE, CYBLACK_HALF_MINUTE_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_MINUTE_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_MINUTE_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_MINUTE_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MINUTE_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_MINUTE_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MINUTE_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_minute_panel_class(CYBLACK_MINUTE_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_MINUTE_PANEL, $list_alt169, NIL, $list_alt417);
        methods.subloop_register_instance_method(CYBLACK_MINUTE_PANEL, INITIALIZE, CYBLACK_MINUTE_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_QUARTER_HOUR_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_QUARTER_HOUR_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_QUARTER_HOUR_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUARTER_HOUR_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_QUARTER_HOUR_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUARTER_HOUR_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_quarter_hour_panel_class(CYBLACK_QUARTER_HOUR_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_QUARTER_HOUR_PANEL, $list_alt169, NIL, $list_alt422);
        methods.subloop_register_instance_method(CYBLACK_QUARTER_HOUR_PANEL, INITIALIZE, CYBLACK_QUARTER_HOUR_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_HALF_HOUR_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_HALF_HOUR_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_HALF_HOUR_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_HOUR_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_HALF_HOUR_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_HOUR_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_half_hour_panel_class(CYBLACK_HALF_HOUR_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_HALF_HOUR_PANEL, $list_alt169, NIL, $list_alt427);
        methods.subloop_register_instance_method(CYBLACK_HALF_HOUR_PANEL, INITIALIZE, CYBLACK_HALF_HOUR_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_HOUR_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_HOUR_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_HOUR_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HOUR_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_HOUR_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HOUR_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_hour_panel_class(CYBLACK_HOUR_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_HOUR_PANEL, $list_alt169, NIL, $list_alt432);
        methods.subloop_register_instance_method(CYBLACK_HOUR_PANEL, INITIALIZE, CYBLACK_HOUR_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_TWO_HOURS_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_TWO_HOURS_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_TWO_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TWO_HOURS_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_TWO_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TWO_HOURS_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_two_hours_panel_class(CYBLACK_TWO_HOURS_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_TWO_HOURS_PANEL, $list_alt169, NIL, $list_alt437);
        methods.subloop_register_instance_method(CYBLACK_TWO_HOURS_PANEL, INITIALIZE, CYBLACK_TWO_HOURS_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_THREE_HOURS_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_THREE_HOURS_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_THREE_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_THREE_HOURS_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_THREE_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_THREE_HOURS_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_three_hours_panel_class(CYBLACK_THREE_HOURS_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_THREE_HOURS_PANEL, $list_alt169, NIL, $list_alt442);
        methods.subloop_register_instance_method(CYBLACK_THREE_HOURS_PANEL, INITIALIZE, CYBLACK_THREE_HOURS_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_FOUR_HOURS_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_FOUR_HOURS_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_FOUR_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FOUR_HOURS_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_FOUR_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FOUR_HOURS_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_four_hours_panel_class(CYBLACK_FOUR_HOURS_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_FOUR_HOURS_PANEL, $list_alt169, NIL, $list_alt447);
        methods.subloop_register_instance_method(CYBLACK_FOUR_HOURS_PANEL, INITIALIZE, CYBLACK_FOUR_HOURS_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_FIVE_HOURS_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_FIVE_HOURS_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_FIVE_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FIVE_HOURS_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_FIVE_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FIVE_HOURS_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_five_hours_panel_class(CYBLACK_FIVE_HOURS_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_FIVE_HOURS_PANEL, $list_alt169, NIL, $list_alt452);
        methods.subloop_register_instance_method(CYBLACK_FIVE_HOURS_PANEL, INITIALIZE, CYBLACK_FIVE_HOURS_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_SIX_HOURS_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_SIX_HOURS_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_SIX_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SIX_HOURS_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_SIX_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SIX_HOURS_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_six_hours_panel_class(CYBLACK_SIX_HOURS_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_SIX_HOURS_PANEL, $list_alt169, NIL, $list_alt457);
        methods.subloop_register_instance_method(CYBLACK_SIX_HOURS_PANEL, INITIALIZE, CYBLACK_SIX_HOURS_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_SEVEN_HOURS_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_SEVEN_HOURS_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_SEVEN_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SEVEN_HOURS_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_SEVEN_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SEVEN_HOURS_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_seven_hours_panel_class(CYBLACK_SEVEN_HOURS_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_SEVEN_HOURS_PANEL, $list_alt169, NIL, $list_alt462);
        methods.subloop_register_instance_method(CYBLACK_SEVEN_HOURS_PANEL, INITIALIZE, CYBLACK_SEVEN_HOURS_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_EIGHT_HOURS_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_EIGHT_HOURS_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_EIGHT_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EIGHT_HOURS_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_EIGHT_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EIGHT_HOURS_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_eight_hours_panel_class(CYBLACK_EIGHT_HOURS_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_EIGHT_HOURS_PANEL, $list_alt169, NIL, $list_alt467);
        methods.subloop_register_instance_method(CYBLACK_EIGHT_HOURS_PANEL, INITIALIZE, CYBLACK_EIGHT_HOURS_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_NINE_HOURS_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_NINE_HOURS_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_NINE_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_NINE_HOURS_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_NINE_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_NINE_HOURS_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_nine_hours_panel_class(CYBLACK_NINE_HOURS_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_NINE_HOURS_PANEL, $list_alt169, NIL, $list_alt472);
        methods.subloop_register_instance_method(CYBLACK_NINE_HOURS_PANEL, INITIALIZE, CYBLACK_NINE_HOURS_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_TEN_HOURS_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_TEN_HOURS_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_TEN_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TEN_HOURS_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_TEN_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TEN_HOURS_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_ten_hours_panel_class(CYBLACK_TEN_HOURS_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_TEN_HOURS_PANEL, $list_alt169, NIL, $list_alt477);
        methods.subloop_register_instance_method(CYBLACK_TEN_HOURS_PANEL, INITIALIZE, CYBLACK_TEN_HOURS_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_ELEVEN_HOURS_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_ELEVEN_HOURS_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_ELEVEN_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ELEVEN_HOURS_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_ELEVEN_HOURS_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ELEVEN_HOURS_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_eleven_hours_panel_class(CYBLACK_ELEVEN_HOURS_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_ELEVEN_HOURS_PANEL, $list_alt169, NIL, $list_alt482);
        methods.subloop_register_instance_method(CYBLACK_ELEVEN_HOURS_PANEL, INITIALIZE, CYBLACK_ELEVEN_HOURS_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_HALF_DAY_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_HALF_DAY_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_HALF_DAY_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_DAY_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_HALF_DAY_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_DAY_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_half_day_panel_class(CYBLACK_HALF_DAY_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_HALF_DAY_PANEL, $list_alt169, NIL, $list_alt487);
        methods.subloop_register_instance_method(CYBLACK_HALF_DAY_PANEL, INITIALIZE, CYBLACK_HALF_DAY_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_DAY_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_DAY_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DAY_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DAY_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DAY_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DAY_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_day_panel_class(CYBLACK_DAY_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DAY_PANEL, $list_alt169, NIL, $list_alt492);
        methods.subloop_register_instance_method(CYBLACK_DAY_PANEL, INITIALIZE, CYBLACK_DAY_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_WEEK_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_WEEK_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_WEEK_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_WEEK_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_WEEK_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_WEEK_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_week_panel_class(CYBLACK_WEEK_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_WEEK_PANEL, $list_alt169, NIL, $list_alt497);
        methods.subloop_register_instance_method(CYBLACK_WEEK_PANEL, INITIALIZE, CYBLACK_WEEK_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_MONTH_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_MONTH_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_MONTH_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MONTH_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_MONTH_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MONTH_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_month_panel_class(CYBLACK_MONTH_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_MONTH_PANEL, $list_alt169, NIL, $list_alt502);
        methods.subloop_register_instance_method(CYBLACK_MONTH_PANEL, INITIALIZE, CYBLACK_MONTH_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_YEAR_PANEL, CYBLACK_TIMER_PANEL, NIL, NIL, $list_alt399);
        classes.class_set_implements_slot_listeners(CYBLACK_YEAR_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_YEAR_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_YEAR_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_YEAR_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_YEAR_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_year_panel_class(CYBLACK_YEAR_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_YEAR_PANEL, $list_alt169, NIL, $list_alt507);
        methods.subloop_register_instance_method(CYBLACK_YEAR_PANEL, INITIALIZE, CYBLACK_YEAR_PANEL_INITIALIZE_METHOD);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(new SubLObject[]{ makeKeyword("SECOND"), makeKeyword("QUARTER-MINUTE"), makeKeyword("HALF-MINUTE"), makeKeyword("MINUTE"), makeKeyword("QUARTER-HOUR"), makeKeyword("HALF-HOUR"), $HOUR, makeKeyword("TWO-HOURS"), makeKeyword("THREE-HOURS"), makeKeyword("FOUR-HOURS"), makeKeyword("FIVE-HOURS"), makeKeyword("SIX-HOURS"), makeKeyword("SEVEN-HOURS"), makeKeyword("EIGHT-HOURS"), makeKeyword("NINE-HOURS"), makeKeyword("TEN-HOURS"), makeKeyword("ELEVEN-HOURS"), makeKeyword("HALF-DAY"), makeKeyword("DAY"), $WEEK, makeKeyword("MONTH"), $YEAR });

    private static final SubLSymbol CYBLACK_TIME_INTERVAL = makeSymbol("CYBLACK-TIME-INTERVAL");

    static private final SubLString $str_alt2$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_CYBLACK_TIME_INTERVAL = makeSymbol("ENCODE-CYBLACK-TIME-INTERVAL");

    static private final SubLString $str_alt4$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_CYBLACK_TIME_INTERVAL = makeSymbol("DECODE-CYBLACK-TIME-INTERVAL");

    static private final SubLString $str_alt6$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol CYBLACK_TIME_INTERVAL_P = makeSymbol("CYBLACK-TIME-INTERVAL-P");

    static private final SubLString $str_alt8$CYBLACK_TIME_INTERVAL_TO_SECONDS_ = makeString("CYBLACK-TIME-INTERVAL-TO-SECONDS: ~S is not a valid time interval.");



    private static final SubLSymbol $QUARTER_MINUTE = makeKeyword("QUARTER-MINUTE");

    private static final SubLSymbol $HALF_MINUTE = makeKeyword("HALF-MINUTE");

    public static final SubLInteger $int$30 = makeInteger(30);



    public static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLSymbol $QUARTER_HOUR = makeKeyword("QUARTER-HOUR");

    public static final SubLInteger $int$900 = makeInteger(900);

    private static final SubLSymbol $HALF_HOUR = makeKeyword("HALF-HOUR");

    public static final SubLInteger $int$1800 = makeInteger(1800);



    public static final SubLInteger $int$3600 = makeInteger(3600);

    private static final SubLSymbol $TWO_HOURS = makeKeyword("TWO-HOURS");

    public static final SubLInteger $int$7200 = makeInteger(7200);

    private static final SubLSymbol $THREE_HOURS = makeKeyword("THREE-HOURS");

    public static final SubLInteger $int$10800 = makeInteger(10800);

    private static final SubLSymbol $FOUR_HOURS = makeKeyword("FOUR-HOURS");

    public static final SubLInteger $int$14400 = makeInteger(14400);

    private static final SubLSymbol $FIVE_HOURS = makeKeyword("FIVE-HOURS");

    public static final SubLInteger $int$18000 = makeInteger(18000);

    private static final SubLSymbol $SIX_HOURS = makeKeyword("SIX-HOURS");

    public static final SubLInteger $int$21600 = makeInteger(21600);

    private static final SubLSymbol $SEVEN_HOURS = makeKeyword("SEVEN-HOURS");

    public static final SubLInteger $int$25200 = makeInteger(25200);

    private static final SubLSymbol $EIGHT_HOURS = makeKeyword("EIGHT-HOURS");

    public static final SubLInteger $int$28800 = makeInteger(28800);

    private static final SubLSymbol $NINE_HOURS = makeKeyword("NINE-HOURS");

    public static final SubLInteger $int$32400 = makeInteger(32400);

    private static final SubLSymbol $TEN_HOURS = makeKeyword("TEN-HOURS");

    public static final SubLInteger $int$36000 = makeInteger(36000);

    private static final SubLSymbol $ELEVEN_HOURS = makeKeyword("ELEVEN-HOURS");

    public static final SubLInteger $int$39600 = makeInteger(39600);

    private static final SubLSymbol $HALF_DAY = makeKeyword("HALF-DAY");

    public static final SubLInteger $int$43200 = makeInteger(43200);



    public static final SubLInteger $int$86400 = makeInteger(86400);

    public static final SubLInteger $int$604800 = makeInteger(604800);



    public static final SubLInteger $int$2592000 = makeInteger(2592000);



    public static final SubLInteger $int$31536000 = makeInteger(31536000);

    static private final SubLString $str_alt51$CYBLACK_TIME_INTERVAL_TO_TYPE_NAM = makeString("CYBLACK-TIME-INTERVAL-TO-TYPE-NAME: ~S is not a valid time interval.");

    static private final SubLString $str_alt52$SECOND_TIMER = makeString("SECOND-TIMER");

    static private final SubLString $str_alt53$QUARTER_MINUTE_TIMER = makeString("QUARTER-MINUTE-TIMER");

    static private final SubLString $str_alt54$HALF_MINUTE_TIMER = makeString("HALF-MINUTE-TIMER");

    static private final SubLString $str_alt55$MINUTE_TIMER = makeString("MINUTE-TIMER");

    static private final SubLString $str_alt56$QUARTER_HOUR_TIMER = makeString("QUARTER-HOUR-TIMER");

    static private final SubLString $str_alt57$HALF_HOUR_TIMER = makeString("HALF-HOUR-TIMER");

    static private final SubLString $str_alt58$HOUR_TIMER = makeString("HOUR-TIMER");

    static private final SubLString $str_alt59$TWO_HOURS_TIMER = makeString("TWO-HOURS-TIMER");

    static private final SubLString $str_alt60$THREE_HOURS_TIMER = makeString("THREE-HOURS-TIMER");

    static private final SubLString $str_alt61$FOUR_HOURS_TIMER = makeString("FOUR-HOURS-TIMER");

    static private final SubLString $str_alt62$FIVE_HOURS_TIMER = makeString("FIVE-HOURS-TIMER");

    static private final SubLString $str_alt63$SIX_HOURS_TIMER = makeString("SIX-HOURS-TIMER");

    static private final SubLString $str_alt64$SEVEN_HOURS_TIMER = makeString("SEVEN-HOURS-TIMER");

    static private final SubLString $str_alt65$EIGHT_HOURS_TIMER = makeString("EIGHT-HOURS-TIMER");

    static private final SubLString $str_alt66$NINE_HOURS_TIMER = makeString("NINE-HOURS-TIMER");

    static private final SubLString $str_alt67$TEN_HOURS_TIMER = makeString("TEN-HOURS-TIMER");

    static private final SubLString $str_alt68$ELEVEN_HOURS_TIMER = makeString("ELEVEN-HOURS-TIMER");

    static private final SubLString $str_alt69$HALF_DAY_TIMER = makeString("HALF-DAY-TIMER");

    static private final SubLString $str_alt70$DAY_TIMER = makeString("DAY-TIMER");

    static private final SubLString $str_alt71$WEEK_TIMER = makeString("WEEK-TIMER");

    static private final SubLString $str_alt72$MONTH_TIMER = makeString("MONTH-TIMER");

    static private final SubLString $str_alt73$YEAR_TIMER = makeString("YEAR-TIMER");

    private static final SubLSymbol CYBLACK_SECOND_PANEL = makeSymbol("CYBLACK-SECOND-PANEL");

    private static final SubLSymbol CYBLACK_QUARTER_MINUTE_PANEL = makeSymbol("CYBLACK-QUARTER-MINUTE-PANEL");

    private static final SubLSymbol CYBLACK_HALF_MINUTE_PANEL = makeSymbol("CYBLACK-HALF-MINUTE-PANEL");

    private static final SubLSymbol CYBLACK_MINUTE_PANEL = makeSymbol("CYBLACK-MINUTE-PANEL");

    private static final SubLSymbol CYBLACK_QUARTER_HOUR_PANEL = makeSymbol("CYBLACK-QUARTER-HOUR-PANEL");

    private static final SubLSymbol CYBLACK_HALF_HOUR_PANEL = makeSymbol("CYBLACK-HALF-HOUR-PANEL");

    private static final SubLSymbol CYBLACK_HOUR_PANEL = makeSymbol("CYBLACK-HOUR-PANEL");

    private static final SubLSymbol CYBLACK_TWO_HOURS_PANEL = makeSymbol("CYBLACK-TWO-HOURS-PANEL");

    private static final SubLSymbol CYBLACK_THREE_HOURS_PANEL = makeSymbol("CYBLACK-THREE-HOURS-PANEL");

    private static final SubLSymbol CYBLACK_FOUR_HOURS_PANEL = makeSymbol("CYBLACK-FOUR-HOURS-PANEL");

    private static final SubLSymbol CYBLACK_FIVE_HOURS_PANEL = makeSymbol("CYBLACK-FIVE-HOURS-PANEL");

    private static final SubLSymbol CYBLACK_SIX_HOURS_PANEL = makeSymbol("CYBLACK-SIX-HOURS-PANEL");

    private static final SubLSymbol CYBLACK_SEVEN_HOURS_PANEL = makeSymbol("CYBLACK-SEVEN-HOURS-PANEL");

    private static final SubLSymbol CYBLACK_EIGHT_HOURS_PANEL = makeSymbol("CYBLACK-EIGHT-HOURS-PANEL");

    private static final SubLSymbol CYBLACK_NINE_HOURS_PANEL = makeSymbol("CYBLACK-NINE-HOURS-PANEL");

    private static final SubLSymbol CYBLACK_TEN_HOURS_PANEL = makeSymbol("CYBLACK-TEN-HOURS-PANEL");

    private static final SubLSymbol CYBLACK_ELEVEN_HOURS_PANEL = makeSymbol("CYBLACK-ELEVEN-HOURS-PANEL");

    private static final SubLSymbol CYBLACK_HALF_DAY_PANEL = makeSymbol("CYBLACK-HALF-DAY-PANEL");

    private static final SubLSymbol CYBLACK_DAY_PANEL = makeSymbol("CYBLACK-DAY-PANEL");

    private static final SubLSymbol CYBLACK_WEEK_PANEL = makeSymbol("CYBLACK-WEEK-PANEL");

    private static final SubLSymbol CYBLACK_MONTH_PANEL = makeSymbol("CYBLACK-MONTH-PANEL");

    private static final SubLSymbol CYBLACK_YEAR_PANEL = makeSymbol("CYBLACK-YEAR-PANEL");

    private static final SubLSymbol CYBLACK_SECOND_POSTING = makeSymbol("CYBLACK-SECOND-POSTING");

    private static final SubLSymbol CYBLACK_QUARTER_MINUTE_POSTING = makeSymbol("CYBLACK-QUARTER-MINUTE-POSTING");

    private static final SubLSymbol CYBLACK_HALF_MINUTE_POSTING = makeSymbol("CYBLACK-HALF-MINUTE-POSTING");

    private static final SubLSymbol CYBLACK_MINUTE_POSTING = makeSymbol("CYBLACK-MINUTE-POSTING");

    private static final SubLSymbol CYBLACK_QUARTER_HOUR_POSTING = makeSymbol("CYBLACK-QUARTER-HOUR-POSTING");

    private static final SubLSymbol CYBLACK_HALF_HOUR_POSTING = makeSymbol("CYBLACK-HALF-HOUR-POSTING");

    private static final SubLSymbol CYBLACK_HOUR_POSTING = makeSymbol("CYBLACK-HOUR-POSTING");

    private static final SubLSymbol CYBLACK_TWO_HOURS_POSTING = makeSymbol("CYBLACK-TWO-HOURS-POSTING");

    private static final SubLSymbol CYBLACK_THREE_HOURS_POSTING = makeSymbol("CYBLACK-THREE-HOURS-POSTING");

    private static final SubLSymbol CYBLACK_FOUR_HOURS_POSTING = makeSymbol("CYBLACK-FOUR-HOURS-POSTING");

    private static final SubLSymbol CYBLACK_FIVE_HOURS_POSTING = makeSymbol("CYBLACK-FIVE-HOURS-POSTING");

    private static final SubLSymbol CYBLACK_SIX_HOURS_POSTING = makeSymbol("CYBLACK-SIX-HOURS-POSTING");

    private static final SubLSymbol CYBLACK_SEVEN_HOURS_POSTING = makeSymbol("CYBLACK-SEVEN-HOURS-POSTING");

    private static final SubLSymbol CYBLACK_EIGHT_HOURS_POSTING = makeSymbol("CYBLACK-EIGHT-HOURS-POSTING");

    private static final SubLSymbol CYBLACK_NINE_HOURS_POSTING = makeSymbol("CYBLACK-NINE-HOURS-POSTING");

    private static final SubLSymbol CYBLACK_TEN_HOURS_POSTING = makeSymbol("CYBLACK-TEN-HOURS-POSTING");

    private static final SubLSymbol CYBLACK_ELEVEN_HOURS_POSTING = makeSymbol("CYBLACK-ELEVEN-HOURS-POSTING");

    private static final SubLSymbol CYBLACK_HALF_DAY_POSTING = makeSymbol("CYBLACK-HALF-DAY-POSTING");

    private static final SubLSymbol CYBLACK_DAY_POSTING = makeSymbol("CYBLACK-DAY-POSTING");

    private static final SubLSymbol CYBLACK_WEEK_POSTING = makeSymbol("CYBLACK-WEEK-POSTING");

    private static final SubLSymbol CYBLACK_MONTH_POSTING = makeSymbol("CYBLACK-MONTH-POSTING");

    private static final SubLSymbol CYBLACK_YEAR_POSTING = makeSymbol("CYBLACK-YEAR-POSTING");

    static private final SubLString $str_alt118$Timer_Panel_Interval_Stack__Lock = makeString("Timer Panel Interval Stack  Lock");

    static private final SubLString $str_alt119$CYBLACK_TIMER_PANEL_INTERVAL_STAC = makeString("CYBLACK-TIMER-PANEL-INTERVAL-STACK-PUSH: ~S is not an instance of CYBLACK-TIMER-PANEL.");

    private static final SubLSymbol CYBLACK_TIMER_PANEL = makeSymbol("CYBLACK-TIMER-PANEL");



    static private final SubLList $list_alt122 = list(makeSymbol("CYBLACK-PANEL"));

    public static final SubLObject $list_alt123 = _constant_123_initializer();





    private static final SubLSymbol STARTED_UP = makeSymbol("STARTED-UP");

    public static final SubLInteger $int$4098 = makeInteger(4098);

    private static final SubLSymbol TICKING = makeSymbol("TICKING");

    public static final SubLInteger $int$4097 = makeInteger(4097);

    private static final SubLSymbol ITERATE_OVER_ALL_KNOWLEDGE_SOURCES = makeSymbol("ITERATE-OVER-ALL-KNOWLEDGE-SOURCES");

    static private final SubLList $list_alt131 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt132 = list(makeSymbol("KS-VISITOR"));

    static private final SubLList $list_alt133 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KS-VISITOR-P"), makeSymbol("KS-VISITOR")), makeString("(ITERATE-OVER-ALL-KNOWLEDGE-SOURCES ~S): ~S is not an instance of CYBLACK-KS-VISITOR"), makeSymbol("SELF"), makeSymbol("KS-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("LIST"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-VISITED-PANELS"), NIL), list(makeSymbol("TEMPLATE-VISITOR-IS-CYBLACK-STATE-CHANGE-KS-VISITOR"), list(makeSymbol("CYBLACK-STATE-CHANGE-KS-VISITOR-P"), makeSymbol("KS-VISITOR"))), makeSymbol("TEMPLATE-CURRENT-PANEL")), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-PANEL-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PANEL-QUEUE"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PANEL-QUEUE"))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("NCONC"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(QUOTE, makeSymbol("GET-SUB-PANELS"))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-VISITOR-IS-CYBLACK-STATE-CHANGE-KS-VISITOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PANEL"), makeSymbol("CYBLACK-STATE-CHANGE-KS-VISITOR")), makeSymbol("KS-VISITOR"), makeSymbol("TEMPLATE-CURRENT-PANEL"))), list(makeSymbol("CYBLACK-PANEL-ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("KS-VISITOR"))))), list(RET, makeSymbol("KS-VISITOR"))));



    private static final SubLSymbol CYBLACK_TIMER_PANEL_ITERATE_OVER_ALL_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-ITERATE-OVER-ALL-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES = makeSymbol("ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES");

    static private final SubLList $list_alt137 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KS-VISITOR-P"), makeSymbol("KS-VISITOR")), makeString("(ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES ~S): ~S is not an instance of CYBLACK-KS-VISITOR."), makeSymbol("SELF"), makeSymbol("KS-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KS-VISITOR"), list(QUOTE, makeSymbol("VISIT")), makeSymbol("TEMPLATE-KS")), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KS-VISITOR"), list(QUOTE, makeSymbol("CONTINUE-P")), makeSymbol("TEMPLATE-KS")), list(RET, makeSymbol("KS-VISITOR")))))), list(RET, makeSymbol("KS-VISITOR")));





    static private final SubLSymbol $sym140$CYBLACK_TIMER_PANEL_ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES_MET = makeSymbol("CYBLACK-TIMER-PANEL-ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES-METHOD");



    static private final SubLList $list_alt142 = list(makeSymbol("POSTING-VISITOR"));

    static private final SubLList $list_alt143 = list(list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("CYBLACK-FORMAT"), T, makeString("~%(ITERATE-OVER-ALL-POSTINGS ~S): Iterating over panel ~S."), makeSymbol("SELF"), list(makeSymbol("CYBLACK-GET-TYPENAME-IF-NOT-NULL"), list(makeSymbol("GET-DATATYPE"), makeSymbol("SELF"))))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-VISITOR-P"), makeSymbol("POSTING-VISITOR")), makeString("(ITERATE-OVER-ALL-POSTINGS ~S): ~S is not an instance of CYBLACK-POSTING-VISITOR."), makeSymbol("SELF"), makeSymbol("POSTING-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("LIST"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-VISITED-PANELS"), NIL), makeSymbol("TEMPLATE-CURRENT-PANEL")), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(ITERATE-OVER-ALL-POSTINGS ~S): Iterating over panel ~S with visitor ~S."), makeSymbol("SELF"), makeSymbol("SELF"), makeSymbol("POSTING-VISITOR")), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-PANEL-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PANEL-QUEUE"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PANEL-QUEUE"))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("NCONC"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(QUOTE, makeSymbol("GET-SUB-PANELS"))))), list(makeSymbol("CYBLACK-PANEL-ITERATE-OVER-ALL-DIRECT-POSTINGS"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("POSTING-VISITOR"))))), list(RET, makeSymbol("POSTING-VISITOR"))));

    static private final SubLString $str_alt144$___ITERATE_OVER_ALL_POSTINGS__S__ = makeString("~%(ITERATE-OVER-ALL-POSTINGS ~S): Iterating over panel ~S with visitor ~S.");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_ITERATE_OVER_ALL_POSTINGS_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-ITERATE-OVER-ALL-POSTINGS-METHOD");

    private static final SubLSymbol ITERATE_OVER_ALL_DIRECT_POSTINGS = makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTINGS");

    static private final SubLList $list_alt147 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-VISITOR-P"), makeSymbol("POSTING-VISITOR")), makeString("(ITERATE-OVER-ALL-DIRECT-POSTINGS ~S): ~S is not an instance of CYBLACK-POSTING-VISITOR."), makeSymbol("SELF"), makeSymbol("POSTING-VISITOR")), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(ITERATE-OVER-ALL-DIRECT-POSTINGS ~S): posting-visitor -> ~S."), makeSymbol("SELF"), makeSymbol("POSTING-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DIRECT-POSTINGS"), list(makeSymbol("GET-DIRECT-POSTINGS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-POSTING"), makeSymbol("TEMPLATE-DIRECT-POSTINGS")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-POSTING-ACTIVE-P"), makeSymbol("TEMPLATE-POSTING")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING-VISITOR"), list(QUOTE, makeSymbol("VISIT")), makeSymbol("TEMPLATE-POSTING")), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING-VISITOR"), list(QUOTE, makeSymbol("CONTINUE-P")), makeSymbol("TEMPLATE-POSTING")), list(RET, makeSymbol("POSTING-VISITOR")))))), list(RET, makeSymbol("POSTING-VISITOR")));

    static private final SubLString $str_alt148$___ITERATE_OVER_ALL_DIRECT_POSTIN = makeString("~%(ITERATE-OVER-ALL-DIRECT-POSTINGS ~S): posting-visitor -> ~S.");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_ITERATE_OVER_ALL_DIRECT_POSTINGS_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-ITERATE-OVER-ALL-DIRECT-POSTINGS-METHOD");



    static private final SubLList $list_alt151 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ALL-ACTIVE-POSTINGS"), NIL), list(makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("LIST"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-VISITED-PANELS"), NIL), makeSymbol("TEMPLATE-CURRENT-PANEL")), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PANEL-QUEUE")), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PANEL-QUEUE"))), list(makeSymbol("PUNLESS"), list(makeSymbol("CYBLACK-PANEL-HAS-MARK-P"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeKeyword("GET-ALL-POSTINGS")), list(makeSymbol("CYBLACK-PANEL-ADD-MARK"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeKeyword("GET-ALL-POSTINGS")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-ALL-ACTIVE-POSTINGS"), list(makeSymbol("NCONC"), makeSymbol("TEMPLATE-ALL-ACTIVE-POSTINGS"), list(makeSymbol("COPY-LIST"), list(makeSymbol("CYBLACK-PANEL-GET-DIRECT-ACTIVE-POSTINGS"), makeSymbol("TEMPLATE-CURRENT-PANEL"))))))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-VISITED-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CYBLACK-PANEL-REMOVE-MARK"), makeSymbol("TEMPLATE-VISITED-PANEL"), makeKeyword("GET-ALL-POSTINGS")))), list(RET, makeSymbol("TEMPLATE-ALL-ACTIVE-POSTINGS"))));

    private static final SubLSymbol $GET_ALL_POSTINGS = makeKeyword("GET-ALL-POSTINGS");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_GET_ALL_ACTIVE_POSTINGS_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-GET-ALL-ACTIVE-POSTINGS-METHOD");



    static private final SubLList $list_alt155 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ALL-POSTINGS"), NIL), list(makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("LIST"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-VISITED-PANELS"), NIL), makeSymbol("TEMPLATE-CURRENT-PANEL")), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PANEL-QUEUE")), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PANEL-QUEUE"))), list(makeSymbol("PUNLESS"), list(makeSymbol("CYBLACK-PANEL-HAS-MARK-P"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeKeyword("GET-ALL-POSTINGS")), list(makeSymbol("CYBLACK-PANEL-ADD-MARK"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeKeyword("GET-ALL-POSTINGS")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-ALL-POSTINGS"), list(makeSymbol("NCONC"), makeSymbol("TEMPLATE-ALL-POSTINGS"), list(makeSymbol("COPY-LIST"), list(makeSymbol("CYBLACK-PANEL-GET-DIRECT-POSTINGS"), makeSymbol("TEMPLATE-CURRENT-PANEL"))))))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-VISITED-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CYBLACK-PANEL-REMOVE-MARK"), makeSymbol("TEMPLATE-VISITED-PANEL"), makeKeyword("GET-ALL-POSTINGS")))), list(RET, makeSymbol("TEMPLATE-ALL-POSTINGS"))));

    private static final SubLSymbol CYBLACK_TIMER_PANEL_GET_ALL_POSTINGS_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-GET-ALL-POSTINGS-METHOD");



    static private final SubLList $list_alt158 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SUPER-PANELS"), list(makeSymbol("LIST"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), NIL), list(makeSymbol("TEMPLATE-VISITED-PANELS"), NIL), makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-NEW-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-CURRENT-PANEL")), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-SUPER-PANELS"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-SUPER-PANELS")), makeSymbol("TEMPLATE-SUPER-PANELS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUPER-PANELS"))), list(new SubLObject[]{ makeSymbol("PUNLESS"), list(makeSymbol("CYBLACK-PANEL-HAS-MARK-P"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeKeyword("GET-ALL-KNOWLEDGE-SOURCES")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CYBLACK-PANEL-ADD-MARK"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeKeyword("GET-ALL-KNOWLEDGE-SOURCES")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("CYBLACK-PANEL-GET-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-CURRENT-PANEL"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-NEW-KNOWLEDGE-SOURCES"), NIL), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-NEW-KNOWLEDGE-SOURCES")), list(makeSymbol("FIF"), list(makeSymbol("MEMBER"), makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES")), NIL, list(makeSymbol("LIST"), makeSymbol("TEMPLATE-KS")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-NEW-KNOWLEDGE-SOURCES"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), list(makeSymbol("NCONC"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-NEW-KNOWLEDGE-SOURCES")))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUPER-PANELS"), list(makeSymbol("NCONC"), makeSymbol("TEMPLATE-SUPER-PANELS"), list(makeSymbol("COPY-LIST"), list(makeSymbol("CYBLACK-PANEL-GET-SUPER-PANELS"), makeSymbol("TEMPLATE-CURRENT-PANEL"))))) })), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-VISITED-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CYBLACK-PANEL-REMOVE-MARK"), makeSymbol("TEMPLATE-VISITED-PANEL"), makeKeyword("GET-ALL-KNOWLEDGE-SOURCES")))), list(RET, makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"))));

    private static final SubLSymbol $GET_ALL_KNOWLEDGE_SOURCES = makeKeyword("GET-ALL-KNOWLEDGE-SOURCES");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_GET_ALL_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-GET-ALL-KNOWLEDGE-SOURCES-METHOD");



    static private final SubLList $list_alt162 = list(makeSymbol("KNOWLEDGE-SOURCES"));

    static private final SubLList $list_alt163 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("LISTP"), makeSymbol("KNOWLEDGE-SOURCES")), makeString("(SET-DIRECT-KNOWLEDGE-SOURCES ~S): ~S is not a valid list of knowledge sources."), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCES")), list(makeSymbol("REMOVE-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF")), list(makeSymbol("CDOLIST"), list(makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("KNOWLEDGE-SOURCES")), list(makeSymbol("ADD-DIRECT-KNOWLEDGE-SOURCE"), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE"))), list(RET, makeSymbol("KNOWLEDGE-SOURCES")));

    private static final SubLSymbol CYBLACK_TIMER_PANEL_SET_DIRECT_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-SET-DIRECT-KNOWLEDGE-SOURCES-METHOD");



    static private final SubLList $list_alt166 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KNOWLEDGE-SOURCES"), list(makeSymbol("GET-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("KNOWLEDGE-SOURCES")), list(makeSymbol("REMOVE-DIRECT-KNOWLEDGE-SOURCE"), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE"))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_TIMER_PANEL_REMOVE_DIRECT_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCES-METHOD");



    static private final SubLList $list_alt169 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt170 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL), list(makeSymbol("POSTING"), NIL));

    static private final SubLList $list_alt171 = list(list(makeSymbol("PWHEN"), makeSymbol("ENVIRONMENT"), list(makeSymbol("CLET"), list(list(makeSymbol("GOAL-SATISFACTION-DAEMON-VISITOR"), list(makeSymbol("NEW-OBJECT-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-GOAL-SATISFACTION-VISITOR"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-INITIAL-STATE"), makeSymbol("CYBLACK-GOAL-SATISFACTION-VISITOR")), makeSymbol("GOAL-SATISFACTION-DAEMON-VISITOR"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")), makeSymbol("ENVIRONMENT"), makeSymbol("POSTING")), list(makeSymbol("ITERATE-OVER-ALL-POSTING-DAEMONS"), makeSymbol("SELF"), makeSymbol("GOAL-SATISFACTION-DAEMON-VISITOR")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_VISITOR = makeSymbol("CYBLACK-GOAL-SATISFACTION-VISITOR");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_STIMULATE_ALL_POSTING_DAEMONS_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-STIMULATE-ALL-POSTING-DAEMONS-METHOD");



    static private final SubLList $list_alt175 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENTS"), NIL));

    static private final SubLList $list_alt176 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("UNIQUE-ELEMENTS"), list(makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-MONITORING-KS-P"), makeSymbol("TEMPLATE-KS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-KS"), list(QUOTE, makeSymbol("PERFORM-ACTION")), makeSymbol("ENVIRONMENTS"))))), list(RET, NIL));



    private static final SubLSymbol CYBLACK_TIMER_PANEL_STIMULATE_ALL_MONITORS_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-STIMULATE-ALL-MONITORS-METHOD");



    static private final SubLList $list_alt180 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL));

    static private final SubLList $list_alt181 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("ENVIRONMENT")), list(makeSymbol("CYBLACK-ENVIRONMENT-P"), makeSymbol("ENVIRONMENT"))), makeString("(STIMULATE-ALL-KNOWLEDGE-SOURCES ~S): ~S is not an instance of CYBLACK-ENVIRONMENT"), makeSymbol("SELF"), makeSymbol("ENVIRONMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("UNIQUE-ELEMENTS"), list(makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"))))), list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("CYBLACK-FORMAT"), T, makeString("~%(STIMULATE-ALL-KNOWLEDGE-SOURCES ~S): About to stimulate ~S."), makeSymbol("SELF"), makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES"))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES")), list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("CYBLACK-FORMAT"), T, makeString("~%Stimulating ~S."), makeSymbol("TEMPLATE-KS"))), list(makeSymbol("CYBLACK-KS-STIMULATE"), makeSymbol("TEMPLATE-KS"), makeSymbol("ENVIRONMENT")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_TIMER_PANEL_STIMULATE_ALL_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-STIMULATE-ALL-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol STIMULATE_DIRECT_KNOWLEDGE_SOURCES = makeSymbol("STIMULATE-DIRECT-KNOWLEDGE-SOURCES");

    static private final SubLList $list_alt184 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("ENVIRONMENT")), list(makeSymbol("CYBLACK-ENVIRONMENT-P"), makeSymbol("ENVIRONMENT"))), makeString("(STIMULATE-DIRECT-KNOWLEDGE-SOURCES ~S): ~S is not an instance of CYBLACK-ENVIRONMENT"), makeSymbol("SELF"), makeSymbol("ENVIRONMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES")), list(makeSymbol("CYBLACK-KS-STIMULATE"), makeSymbol("TEMPLATE-KS"), makeSymbol("ENVIRONMENT")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_TIMER_PANEL_STIMULATE_DIRECT_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-STIMULATE-DIRECT-KNOWLEDGE-SOURCES-METHOD");



    static private final SubLList $list_alt187 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("EXCLUDED-PANELS"), NIL));

    static private final SubLList $list_alt188 = list(list(makeSymbol("CLET"), list(list(makeSymbol("COLLECTED-PANELS"), NIL), list(makeSymbol("CURRENT-SUB-PANELS"), list(makeSymbol("GET-SUB-PANELS"), makeSymbol("SELF"))), list(makeSymbol("CURRENT-PANEL"), NIL)), list(makeSymbol("WHILE"), makeSymbol("CURRENT-SUB-PANELS"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-PANEL"), list(makeSymbol("CAR"), makeSymbol("CURRENT-SUB-PANELS"))), list(makeSymbol("CPOP"), makeSymbol("CURRENT-SUB-PANELS")), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("MEMBER?"), makeSymbol("CURRENT-PANEL"), makeSymbol("EXCLUDED-PANELS")), list(makeSymbol("MEMBER"), makeSymbol("CURRENT-PANEL"), makeSymbol("COLLECTED-PANELS"))), list(makeSymbol("CPUSH"), makeSymbol("CURRENT-PANEL"), makeSymbol("COLLECTED-PANELS")), list(makeSymbol("CLET"), list(list(makeSymbol("LOCAL-SUB-PANELS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CURRENT-PANEL"), list(QUOTE, makeSymbol("GET-SUB-PANELS"))))), list(makeSymbol("PWHEN"), makeSymbol("LOCAL-SUB-PANELS"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SUB-PANELS"), list(makeSymbol("NCONC"), makeSymbol("LOCAL-SUB-PANELS"), makeSymbol("CURRENT-SUB-PANELS"))))))), list(RET, makeSymbol("COLLECTED-PANELS"))));

    private static final SubLSymbol CYBLACK_TIMER_PANEL_GET_ALL_SUB_PANELS_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-GET-ALL-SUB-PANELS-METHOD");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TIMER_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TIMER-PANEL-CLASS");





















    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TIMER_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TIMER-PANEL-INSTANCE");

    private static final SubLSymbol INITIALIZE_QUA_MARKABLE = makeSymbol("INITIALIZE-QUA-MARKABLE");

    static private final SubLList $list_alt205 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt206 = list(list(makeSymbol("SET-CYBLACK-BASIC-PANEL-MARKS"), makeSymbol("SELF"), NIL), list(RET, NIL));

    private static final SubLSymbol CYBLACK_TIMER_PANEL_INITIALIZE_QUA_MARKABLE_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-INITIALIZE-QUA-MARKABLE-METHOD");



    static private final SubLList $list_alt209 = list(list(RET, makeSymbol("MARKS")));

    static private final SubLSymbol $sym210$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_GET_MARKS_INTERNAL_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-GET-MARKS-INTERNAL-METHOD");



    static private final SubLList $list_alt213 = list(makeSymbol("NEW-MARKS"));

    static private final SubLList $list_alt214 = list(list(makeSymbol("CSETQ"), makeSymbol("MARKS"), makeSymbol("NEW-MARKS")), list(RET, makeSymbol("NEW-MARKS")));

    static private final SubLSymbol $sym215$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_SET_MARKS_INTERNAL_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-SET-MARKS-INTERNAL-METHOD");

    private static final SubLSymbol GET_STIMULATION_TYPE = makeSymbol("GET-STIMULATION-TYPE");

    static private final SubLList $list_alt218 = list(list(RET, NIL));

    private static final SubLSymbol CYBLACK_TIMER_PANEL_GET_STIMULATION_TYPE_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-GET-STIMULATION-TYPE-METHOD");

    private static final SubLSymbol SET_STIMULATION_TYPE = makeSymbol("SET-STIMULATION-TYPE");

    static private final SubLList $list_alt221 = list(makeSymbol("NEW-STIMULATION-TYPE"));

    static private final SubLList $list_alt222 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-STIMULATION-TYPE")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_TIMER_PANEL_SET_STIMULATION_TYPE_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-SET-STIMULATION-TYPE-METHOD");



    static private final SubLList $list_alt225 = list(list(RET, makeSymbol("SUPER-PANELS")));

    static private final SubLSymbol $sym226$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_GET_SUPER_PANELS_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-GET-SUPER-PANELS-METHOD");

    static private final SubLList $list_alt228 = list(list(RET, makeSymbol("SUB-PANELS")));

    static private final SubLSymbol $sym229$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_GET_SUB_PANELS_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-GET-SUB-PANELS-METHOD");



    static private final SubLList $list_alt232 = list(makeSymbol("NEW-SUPER-PANEL"));

    static private final SubLList $list_alt233 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PANEL-P"), makeSymbol("NEW-SUPER-PANEL")), makeString("(ADD-SUPER-PANEL ~S): ~S is not an instance of CYBLACK-PANEL."), makeSymbol("SELF"), makeSymbol("NEW-SUPER-PANEL")), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("NEW-SUPER-PANEL"), makeSymbol("SUPER-PANELS")), list(makeSymbol("CSETQ"), makeSymbol("SUPER-PANELS"), list(makeSymbol("NCONC"), makeSymbol("SUPER-PANELS"), list(makeSymbol("LIST"), makeSymbol("NEW-SUPER-PANEL"))))), list(RET, makeSymbol("NEW-SUPER-PANEL")));

    static private final SubLSymbol $sym234$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    static private final SubLString $str_alt235$_ADD_SUPER_PANEL__S____S_is_not_a = makeString("(ADD-SUPER-PANEL ~S): ~S is not an instance of CYBLACK-PANEL.");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_ADD_SUPER_PANEL_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-ADD-SUPER-PANEL-METHOD");



    static private final SubLList $list_alt238 = list(makeSymbol("NEW-SUB-PANEL"));

    static private final SubLList $list_alt239 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PANEL-P"), makeSymbol("NEW-SUB-PANEL")), makeString("(ADD-SUB-PANEL ~S): ~S is not an instance of CYBLACK-PANEL."), makeSymbol("SELF"), makeSymbol("NEW-SUB-PANEL")), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("NEW-SUB-PANEL"), makeSymbol("SUB-PANELS")), list(makeSymbol("CSETQ"), makeSymbol("SUB-PANELS"), list(makeSymbol("NCONC"), makeSymbol("SUB-PANELS"), list(makeSymbol("LIST"), makeSymbol("NEW-SUB-PANEL"))))), list(RET, makeSymbol("NEW-SUB-PANEL")));

    static private final SubLSymbol $sym240$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    static private final SubLString $str_alt241$_ADD_SUB_PANEL__S____S_is_not_an_ = makeString("(ADD-SUB-PANEL ~S): ~S is not an instance of CYBLACK-PANEL.");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_ADD_SUB_PANEL_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-ADD-SUB-PANEL-METHOD");



    static private final SubLList $list_alt244 = list(makeSymbol("OLD-SUPER-PANEL"));

    static private final SubLList $list_alt245 = list(list(makeSymbol("IGNORE"), makeSymbol("OLD-SUPER-PANEL")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_TIMER_PANEL_REMOVE_SUPER_PANEL_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-REMOVE-SUPER-PANEL-METHOD");



    static private final SubLList $list_alt248 = list(makeSymbol("OLD-SUB-PANEL"));

    static private final SubLList $list_alt249 = list(list(makeSymbol("IGNORE"), makeSymbol("OLD-SUB-PANEL")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_TIMER_PANEL_REMOVE_SUB_PANEL_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-REMOVE-SUB-PANEL-METHOD");



    static private final SubLList $list_alt252 = list(makeSymbol("POSTING"));

    static private final SubLList $list_alt253 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(ADD-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("PWHEN"), makeSymbol("POSTING"), list(makeSymbol("SET-CYBLACK-TIMER-PANEL-CURRENT-POSTING"), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("ON-POST"))), list(makeSymbol("CLET"), list(list(makeSymbol("ENVIRONMENT"), list(makeSymbol("CREATE-TOP-LEVEL-ENVIRONMENT"), makeKeyword("ADD-POSTING"), list(QUOTE, makeSymbol("?THE-POSTING")), list(makeSymbol("CYBLACK-APPLICATION-GET-ROOT-DATATYPE"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), makeSymbol("POSTING")))), list(makeSymbol("STIMULATE-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"), makeSymbol("ENVIRONMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("AFTER-STIMULATION"))), list(RET, makeSymbol("POSTING"))), list(RET, NIL));

    static private final SubLString $str_alt254$_ADD_POSTING__S____S_is_not_an_in = makeString("(ADD-POSTING ~S): ~S is not an instance of CYBLACK-POSTING.");



    private static final SubLSymbol $ADD_POSTING = makeKeyword("ADD-POSTING");

    static private final SubLSymbol $sym257$_THE_POSTING = makeSymbol("?THE-POSTING");



    private static final SubLSymbol CYBLACK_TIMER_PANEL_ADD_POSTING_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-ADD-POSTING-METHOD");



    static private final SubLList $list_alt261 = list(list(makeSymbol("PWHEN"), list(EQ, makeSymbol("CURRENT-POSTING"), makeSymbol("POSTING")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-POSTING"), NIL)), list(RET, makeSymbol("POSTING")));

    static private final SubLSymbol $sym262$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_REMOVE_POSTING_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-REMOVE-POSTING-METHOD");



    static private final SubLList $list_alt265 = list(list(RET, makeSymbol("DATATYPE")));

    static private final SubLSymbol $sym266$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_GET_DATATYPE_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-GET-DATATYPE-METHOD");



    static private final SubLList $list_alt269 = list(makeSymbol("NEW-DATATYPE"));

    static private final SubLList $list_alt270 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-DATATYPE-P"), makeSymbol("NEW-DATATYPE")), makeString("(SET-DATATYPE ~S): ~S is not an instance of CYBLACK-DATATYPE."), makeSymbol("SELF"), makeSymbol("NEW-DATATYPE")), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE"), makeSymbol("NEW-DATATYPE")), list(RET, makeSymbol("NEW-DATATYPE")));

    static private final SubLSymbol $sym271$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    static private final SubLString $str_alt272$_SET_DATATYPE__S____S_is_not_an_i = makeString("(SET-DATATYPE ~S): ~S is not an instance of CYBLACK-DATATYPE.");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_SET_DATATYPE_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-SET-DATATYPE-METHOD");



    static private final SubLList $list_alt275 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt276 = list(list(makeSymbol("CLET"), list(list(makeSymbol("APPLICATION-ID"), list(makeSymbol("CYBLACK-APPLICATION-GET-APPLICATION-ID"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))))), list(makeSymbol("SET-CYBLACK-TIMER-PANEL-TICKING"), makeSymbol("SELF"), T), list(makeSymbol("CYBLACK-TIMER-PANEL-INTERVAL-STACK-PUSH"), makeSymbol("SELF")), list(makeSymbol("CYBLACK-MAKE-PROCESS"), makeSymbol("APPLICATION-ID"), list(QUOTE, makeString("CYBLACK-TIMER-PANEL-RUN")), list(QUOTE, makeSymbol("CYBLACK-TIMER-PANEL-RUN-BACKBOARD-PROCESS")))), list(RET, NIL));

    static private final SubLString $str_alt277$CYBLACK_TIMER_PANEL_RUN = makeString("CYBLACK-TIMER-PANEL-RUN");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_RUN_BACKBOARD_PROCESS = makeSymbol("CYBLACK-TIMER-PANEL-RUN-BACKBOARD-PROCESS");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_ON_ADD_FIRST_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-ON-ADD-FIRST-KNOWLEDGE-SOURCE-METHOD");



    static private final SubLList $list_alt281 = list(list(makeSymbol("SET-CYBLACK-TIMER-PANEL-TICKING"), makeSymbol("SELF"), NIL), list(RET, NIL));

    private static final SubLSymbol CYBLACK_TIMER_PANEL_ON_REMOVE_LAST_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-ON-REMOVE-LAST-KNOWLEDGE-SOURCE-METHOD");



    static private final SubLList $list_alt284 = list(makeSymbol("KNOWLEDGE-SOURCE"));

    static private final SubLList $list_alt285 = list(list(makeSymbol("PWHEN"), makeSymbol("KNOWLEDGE-SOURCE"), list(makeSymbol("PUNLESS"), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("CSETQ"), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST")), list(QUOTE, makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST"))))), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST")), makeSymbol("DIRECT-KNOWLEDGE-SOURCES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ADD-FIRST-KNOWLEDGE-SOURCE")))), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("MEMBER-P"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST")), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST")), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("KNOWLEDGE-SOURCE")))), list(RET, makeSymbol("KNOWLEDGE-SOURCE")));

    static private final SubLSymbol $sym286$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");



    private static final SubLSymbol CYBLACK_TIMER_PANEL_ADD_DIRECT_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-ADD-DIRECT-KNOWLEDGE-SOURCE-METHOD");



    static private final SubLList $list_alt290 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("DIRECT-KNOWLEDGE-SOURCES")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST")), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST")), makeSymbol("DIRECT-KNOWLEDGE-SOURCES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-REMOVE-LAST-KNOWLEDGE-SOURCE"))))), list(RET, makeSymbol("KNOWLEDGE-SOURCE")));

    static private final SubLSymbol $sym291$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_REMOVE_DIRECT_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCE-METHOD");



    static private final SubLList $list_alt294 = list(list(makeSymbol("PWHEN"), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLEAR"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST")), makeSymbol("DIRECT-KNOWLEDGE-SOURCES")), list(makeSymbol("CSETQ"), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), NIL)), list(RET, NIL));

    static private final SubLSymbol $sym295$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_REMOVE_ALL_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-REMOVE-ALL-KNOWLEDGE-SOURCES-METHOD");



    static private final SubLList $list_alt298 = list(list(makeSymbol("PIF"), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-CONTENTS"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST")), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"))), list(RET, NIL)));

    static private final SubLSymbol $sym299$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_GET_DIRECT_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-GET-DIRECT-KNOWLEDGE-SOURCES-METHOD");



    static private final SubLList $list_alt302 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(ADD-DIRECT-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("PWHEN"), makeSymbol("POSTING"), list(makeSymbol("SET-CYBLACK-TIMER-PANEL-CURRENT-POSTING"), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("ON-POST"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("AFTER-STIMULATION"))), list(RET, makeSymbol("POSTING"))), list(RET, NIL));

    static private final SubLString $str_alt303$_ADD_DIRECT_POSTING__S____S_is_no = makeString("(ADD-DIRECT-POSTING ~S): ~S is not an instance of CYBLACK-POSTING.");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_ADD_DIRECT_POSTING_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-ADD-DIRECT-POSTING-METHOD");



    static private final SubLList $list_alt306 = list(list(RET, list(makeSymbol("GET-CYBLACK-TIMER-PANEL-CURRENT-POSTING"), makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_TIMER_PANEL_GET_DIRECT_ACTIVE_POSTINGS_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-GET-DIRECT-ACTIVE-POSTINGS-METHOD");



    static private final SubLList $list_alt309 = list(list(makeSymbol("PWHEN"), list(EQ, makeSymbol("CURRENT-POSTING"), makeSymbol("POSTING")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-POSTING"), NIL)));

    static private final SubLSymbol $sym310$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_REMOVE_DIRECT_POSTING_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-REMOVE-DIRECT-POSTING-METHOD");



    static private final SubLList $list_alt313 = list(makeSymbol("POSTINGS"));

    static private final SubLList $list_alt314 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("POSTINGS")), makeString("(ADD-DIRECT-POSTINGS ~S): ~S is not a valid list of postings."), makeSymbol("SELF"), makeSymbol("POSTINGS")), list(makeSymbol("CDOLIST"), list(makeSymbol("POSTING"), makeSymbol("POSTINGS")), list(makeSymbol("ADD-DIRECT-POSTING"), makeSymbol("SELF"), makeSymbol("POSTING"))), list(RET, makeSymbol("POSTINGS")));

    static private final SubLString $str_alt315$_ADD_DIRECT_POSTINGS__S____S_is_n = makeString("(ADD-DIRECT-POSTINGS ~S): ~S is not a valid list of postings.");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_ADD_DIRECT_POSTINGS_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-ADD-DIRECT-POSTINGS-METHOD");



    static private final SubLList $list_alt318 = list(list(RET, list(makeSymbol("FIF"), makeSymbol("CURRENT-POSTING"), list(makeSymbol("LIST"), makeSymbol("CURRENT-POSTING")), NIL)));

    static private final SubLSymbol $sym319$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_GET_DIRECT_POSTINGS_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-GET-DIRECT-POSTINGS-METHOD");



    static private final SubLList $list_alt322 = list(list(makeSymbol("CSETQ"), makeSymbol("CURRENT-POSTING"), NIL), list(RET, NIL));

    static private final SubLSymbol $sym323$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_REMOVE_DIRECT_POSTINGS_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-REMOVE-DIRECT-POSTINGS-METHOD");



    static private final SubLList $list_alt326 = list(makeSymbol("NEW-POSTING-DAEMON"));

    static private final SubLList $list_alt327 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-POSTING-DAEMON-P"), makeSymbol("NEW-POSTING-DAEMON")), makeString("(ADD-POSTING-DAEMON ~S): ~S is not an instance of CYBLACK-POSTING-DAEMON."), makeSymbol("SELF"), makeSymbol("NEW-POSTING-DAEMON")), list(makeSymbol("MUST"), makeSymbol("POSTING-DAEMONS"), makeString("(ADD-POSTING-DAEMON ~S): The posting daemon list that should be associated with this panel is NIL."), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("POSTING-DAEMONS"), makeSymbol("NEW-POSTING-DAEMON")), list(RET, makeSymbol("NEW-POSTING-DAEMON")));

    static private final SubLSymbol $sym328$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    static private final SubLString $str_alt329$_ADD_POSTING_DAEMON__S____S_is_no = makeString("(ADD-POSTING-DAEMON ~S): ~S is not an instance of CYBLACK-POSTING-DAEMON.");

    static private final SubLString $str_alt330$_ADD_POSTING_DAEMON__S___The_post = makeString("(ADD-POSTING-DAEMON ~S): The posting daemon list that should be associated with this panel is NIL.");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_ADD_POSTING_DAEMON_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-ADD-POSTING-DAEMON-METHOD");



    static private final SubLList $list_alt333 = list(makeSymbol("OLD-POSTING-DAEMON"));

    static private final SubLList $list_alt334 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-POSTING-DAEMON-P"), makeSymbol("OLD-POSTING-DAEMON")), makeString("(REMOVE-POSTING-DAEMON ~S): ~S is not an instance of CYBLACK-POSTING-DAEMON."), makeSymbol("SELF"), makeSymbol("OLD-POSTING-DAEMON")), list(makeSymbol("MUST"), makeSymbol("POSTING-DAEMONS"), makeString("(REMOVE-POSTING-DAEMON ~S): The posting daemon list that should be associated with this panel is NIL."), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("POSTING-DAEMONS"), makeSymbol("OLD-POSTING-DAEMON")), list(RET, makeSymbol("OLD-POSTING-DAEMON")));

    static private final SubLSymbol $sym335$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    static private final SubLString $str_alt336$_REMOVE_POSTING_DAEMON__S____S_is = makeString("(REMOVE-POSTING-DAEMON ~S): ~S is not an instance of CYBLACK-POSTING-DAEMON.");

    static private final SubLString $str_alt337$_REMOVE_POSTING_DAEMON__S___The_p = makeString("(REMOVE-POSTING-DAEMON ~S): The posting daemon list that should be associated with this panel is NIL.");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_REMOVE_POSTING_DAEMON_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-REMOVE-POSTING-DAEMON-METHOD");



    static private final SubLList $list_alt340 = list(list(RET, makeSymbol("POSTING-DAEMONS")));

    static private final SubLSymbol $sym341$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_GET_POSTING_DAEMONS_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-GET-POSTING-DAEMONS-METHOD");

    private static final SubLSymbol REMOVE_ALL_DIRECT_POSTING_DAEMONS = makeSymbol("REMOVE-ALL-DIRECT-POSTING-DAEMONS");

    static private final SubLList $list_alt344 = list(list(makeSymbol("MUST"), makeSymbol("POSTING-DAEMONS"), makeString("(REMOVE-ALL-DIRECT-POSTING-DAEMONS ~S): The posting daemon list that should be associated with this panel is NIL."), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLEAR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("POSTING-DAEMONS")), list(RET, NIL));

    static private final SubLSymbol $sym345$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    static private final SubLString $str_alt346$_REMOVE_ALL_DIRECT_POSTING_DAEMON = makeString("(REMOVE-ALL-DIRECT-POSTING-DAEMONS ~S): The posting daemon list that should be associated with this panel is NIL.");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_REMOVE_ALL_DIRECT_POSTING_DAEMONS_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-REMOVE-ALL-DIRECT-POSTING-DAEMONS-METHOD");

    private static final SubLSymbol ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS = makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS");

    static private final SubLList $list_alt349 = list(makeSymbol("DAEMON-VISITOR"));

    static private final SubLList $list_alt350 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-POSTING-DAEMON-VISITOR-P"), makeSymbol("DAEMON-VISITOR")), makeString("(ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS ~S): ~S is not an instance of CYBLACK-POSTING-DAEMON-VISITOR."), makeSymbol("SELF"), makeSymbol("DAEMON-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-POSTING-DAEMONS"), list(makeSymbol("GET-POSTING-DAEMONS"), makeSymbol("SELF")))), list(makeSymbol("PCOND"), list(list(makeSymbol("LISTP"), makeSymbol("TEMPLATE-POSTING-DAEMONS")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-CONS"), makeSymbol("TEMPLATE-POSTING-DAEMONS")), list(makeSymbol("TEMPLATE-NOT-FINISHED"), T), makeSymbol("TEMPLATE-DAEMON")), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-NOT-FINISHED"), list(makeSymbol("CNOT"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-CURRENT-CONS")))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-DAEMON"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("PIF"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DAEMON-VISITOR"), list(QUOTE, makeSymbol("CONTINUE-P")), makeSymbol("TEMPLATE-DAEMON")), list(makeSymbol("PROGN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DAEMON-VISITOR"), list(QUOTE, makeSymbol("VISIT")), makeSymbol("TEMPLATE-DAEMON")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS")))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-NOT-FINISHED"), NIL))))), list(list(makeSymbol("COLLECTION-TEMPLATE-P"), makeSymbol("TEMPLATE-POSTING-DAEMONS")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-POSTING-DAEMONS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("MUST"), makeSymbol("TEMPLATE-ENUMERATOR"), makeString("(ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS ~S): Failed to allocate enumerator."), makeSymbol("SELF")), list(makeSymbol("PUNLESS"), list(makeSymbol("ENUMERATOR-TEMPLATE-EMPTY-P"), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DAEMON"), list(makeSymbol("ENUMERATOR-TEMPLATE-FIRST"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("TEMPLATE-NOT-FINISHED"), T)), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DAEMON-VISITOR"), list(QUOTE, makeSymbol("CONTINUE-P")), makeSymbol("TEMPLATE-DAEMON")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DAEMON-VISITOR"), list(QUOTE, makeSymbol("VISIT")), makeSymbol("TEMPLATE-DAEMON")), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-NOT-FINISHED"), list(makeSymbol("CNOT"), list(makeSymbol("ENUMERATOR-TEMPLATE-LAST-P"), makeSymbol("TEMPLATE-ENUMERATOR")))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-DAEMON"), list(makeSymbol("ENUMERATOR-TEMPLATE-NEXT"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("PIF"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DAEMON-VISITOR"), list(QUOTE, makeSymbol("CONTINUE-P")), makeSymbol("TEMPLATE-DAEMON")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DAEMON-VISITOR"), list(QUOTE, makeSymbol("VISIT")), makeSymbol("TEMPLATE-DAEMON")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-NOT-FINISHED"), NIL)))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-POSTING-DAEMONS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")))))), list(RET, NIL));

    static private final SubLString $str_alt351$_ITERATE_OVER_ALL_DIRECT_POSTING_ = makeString("(ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS ~S): ~S is not an instance of CYBLACK-POSTING-DAEMON-VISITOR.");



    static private final SubLString $str_alt353$_ITERATE_OVER_ALL_DIRECT_POSTING_ = makeString("(ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS ~S): Failed to allocate enumerator.");



    static private final SubLSymbol $sym355$CYBLACK_TIMER_PANEL_ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS_METHO = makeSymbol("CYBLACK-TIMER-PANEL-ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS-METHOD");



    static private final SubLList $list_alt357 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-POSTING-DAEMON-VISITOR-P"), makeSymbol("DAEMON-VISITOR")), makeString("(ITERATE-OVER-ALL-POSTING-DAEMONS ~S): ~S is not an instance of CYBLACK-POSTING-VISITOR."), makeSymbol("SELF"), makeSymbol("DAEMON-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("LIST"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-VISITED-PANELS"), NIL), makeSymbol("TEMPLATE-CURRENT-PANEL")), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(ITERATE-OVER-ALL-POSTING-DAEMONS ~S): Iterating over panel ~S with visitor ~S."), makeSymbol("SELF"), makeSymbol("SELF"), makeSymbol("DAEMON-VISITOR")), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-PANEL-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PANEL-QUEUE"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PANEL-QUEUE"))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("NCONC"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(QUOTE, makeSymbol("GET-SUB-PANELS"))))), list(makeSymbol("CYBLACK-PANEL-ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("DAEMON-VISITOR"))))), list(RET, makeSymbol("DAEMON-VISITOR"))));

    static private final SubLString $str_alt358$_ITERATE_OVER_ALL_POSTING_DAEMONS = makeString("(ITERATE-OVER-ALL-POSTING-DAEMONS ~S): ~S is not an instance of CYBLACK-POSTING-VISITOR.");

    static private final SubLString $str_alt359$___ITERATE_OVER_ALL_POSTING_DAEMO = makeString("~%(ITERATE-OVER-ALL-POSTING-DAEMONS ~S): Iterating over panel ~S with visitor ~S.");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_ITERATE_OVER_ALL_POSTING_DAEMONS_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-ITERATE-OVER-ALL-POSTING-DAEMONS-METHOD");



    static private final SubLList $list_alt362 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(DEACTIVATE-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(RET, makeSymbol("POSTING")));

    static private final SubLString $str_alt363$_DEACTIVATE_POSTING__S____S_is_no = makeString("(DEACTIVATE-POSTING ~S): ~S is not an instance of CYBLACK-POSTING.");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_DEACTIVATE_POSTING_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-DEACTIVATE-POSTING-METHOD");



    static private final SubLList $list_alt366 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(ACTIVATE-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(RET, makeSymbol("POSTING")));

    static private final SubLString $str_alt367$_ACTIVATE_POSTING__S____S_is_not_ = makeString("(ACTIVATE-POSTING ~S): ~S is not an instance of CYBLACK-POSTING.");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_ACTIVATE_POSTING_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-ACTIVATE-POSTING-METHOD");



    static private final SubLList $list_alt370 = list(makeSymbol("KEY"));

    static private final SubLList $list_alt371 = list(list(makeSymbol("IGNORE"), makeSymbol("KEY")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_TIMER_PANEL_GET_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-GET-METHOD");



    static private final SubLList $list_alt374 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("INITIALIZE-QUA-MARKABLE"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-POSTING"), NIL), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("SECOND")), list(makeSymbol("CSETQ"), makeSymbol("TICKING"), NIL), list(makeSymbol("CSETQ"), makeSymbol("POSTING-DAEMONS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-LIST")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym375$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");



    private static final SubLSymbol CYBLACK_TIMER_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-INITIALIZE-METHOD");



    static private final SubLList $list_alt379 = list(makeSymbol("NEW-APPLICATION"));

    static private final SubLList $list_alt380 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-APPLICATION-P"), makeSymbol("NEW-APPLICATION"))), makeString("(SET-APPLICATION ~S): ~S is not an instance of CYBLACK-APPLICATION."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("APPLICATION"), makeSymbol("CYBLACK-BASIC-PANEL")), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(RET, makeSymbol("NEW-APPLICATION")));

    static private final SubLString $str_alt381$_SET_APPLICATION__S____S_is_not_a = makeString("(SET-APPLICATION ~S): ~S is not an instance of CYBLACK-APPLICATION.");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-SET-APPLICATION-METHOD");



    static private final SubLList $list_alt384 = list(list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(makeSymbol("REMOVE-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("SELF")), list(makeSymbol("REMOVE-DIRECT-POSTINGS"), makeSymbol("SELF")), list(makeSymbol("CDOLIST"), list(makeSymbol("PANEL"), makeSymbol("SUB-PANELS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("APPLICATION")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("ON-STARTUP")))), list(makeSymbol("CSETQ"), makeSymbol("STARTED-UP"), T), list(RET, NIL));

    static private final SubLSymbol $sym385$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_ON_STARTUP_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-ON-STARTUP-METHOD");



    static private final SubLList $list_alt388 = list(list(makeSymbol("CSETQ"), makeSymbol("STARTED-UP"), NIL), list(makeSymbol("ON-REMOVE-LAST-KNOWLEDGE-SOURCE"), makeSymbol("SELF")), list(makeSymbol("PWHEN"), makeSymbol("CURRENT-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CURRENT-POSTING"), list(QUOTE, makeSymbol("ON-SHUTDOWN")))), list(makeSymbol("CDOLIST"), list(makeSymbol("PANEL"), makeSymbol("SUB-PANELS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("ON-SHUTDOWN")))), list(makeSymbol("ON-SHUTDOWN"), makeSymbol("SUPER")), list(RET, NIL));

    static private final SubLSymbol $sym389$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_TIMER_PANEL_ON_SHUTDOWN_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-ON-SHUTDOWN-METHOD");

    private static final SubLSymbol DO_TICK = makeSymbol("DO-TICK");

    static private final SubLList $list_alt392 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("STARTED-UP"), makeSymbol("DATATYPE")), list(makeSymbol("ADD-POSTING"), makeSymbol("SELF"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DATATYPE"), list(QUOTE, makeSymbol("CREATE-POSTING"))))), list(RET, NIL));

    static private final SubLSymbol $sym393$OUTER_CATCH_FOR_CYBLACK_TIMER_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-PANEL-METHOD");



    private static final SubLSymbol CYBLACK_TIMER_PANEL_DO_TICK_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-DO-TICK-METHOD");

    private static final SubLSymbol BACKGROUND_PROCESS = makeSymbol("BACKGROUND-PROCESS");

    static private final SubLList $list_alt397 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INTERVAL-SECONDS"), list(makeSymbol("CYBLACK-TIME-INTERVAL-TO-SECONDS"), list(makeSymbol("GET-CYBLACK-TIMER-PANEL-INTERVAL"), makeSymbol("SELF"))))), list(makeSymbol("PWHEN"), makeSymbol("INTERVAL-SECONDS"), list(makeSymbol("WHILE"), list(makeSymbol("GET-CYBLACK-TIMER-PANEL-TICKING"), makeSymbol("SELF")), list(makeSymbol("SLEEP"), makeSymbol("INTERVAL-SECONDS")), list(makeSymbol("DO-TICK"), makeSymbol("SELF"))))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_TIMER_PANEL_BACKGROUND_PROCESS_METHOD = makeSymbol("CYBLACK-TIMER-PANEL-BACKGROUND-PROCESS-METHOD");

    static private final SubLList $list_alt399 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SECOND_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SECOND-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SECOND_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SECOND-PANEL-INSTANCE");

    static private final SubLList $list_alt402 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("SECOND")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym403$OUTER_CATCH_FOR_CYBLACK_SECOND_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SECOND-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_SECOND_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-SECOND-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUARTER_MINUTE_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUARTER-MINUTE-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUARTER_MINUTE_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUARTER-MINUTE-PANEL-INSTANCE");

    static private final SubLList $list_alt407 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("QUARTER-MINUTE")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym408$OUTER_CATCH_FOR_CYBLACK_QUARTER_MINUTE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-QUARTER-MINUTE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_QUARTER_MINUTE_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-QUARTER-MINUTE-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_MINUTE_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-MINUTE-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_MINUTE_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-MINUTE-PANEL-INSTANCE");

    static private final SubLList $list_alt412 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("HALF-MINUTE")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym413$OUTER_CATCH_FOR_CYBLACK_HALF_MINUTE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-HALF-MINUTE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_HALF_MINUTE_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-HALF-MINUTE-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MINUTE_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MINUTE-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MINUTE_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MINUTE-PANEL-INSTANCE");

    static private final SubLList $list_alt417 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("MINUTE")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym418$OUTER_CATCH_FOR_CYBLACK_MINUTE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MINUTE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_MINUTE_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-MINUTE-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUARTER_HOUR_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUARTER-HOUR-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUARTER_HOUR_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUARTER-HOUR-PANEL-INSTANCE");

    static private final SubLList $list_alt422 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("QUARTER-HOUR")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym423$OUTER_CATCH_FOR_CYBLACK_QUARTER_HOUR_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-QUARTER-HOUR-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_QUARTER_HOUR_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-QUARTER-HOUR-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_HOUR_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-HOUR-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_HOUR_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-HOUR-PANEL-INSTANCE");

    static private final SubLList $list_alt427 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("HALF-HOUR")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym428$OUTER_CATCH_FOR_CYBLACK_HALF_HOUR_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-HALF-HOUR-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_HALF_HOUR_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-HALF-HOUR-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HOUR_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HOUR-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HOUR_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HOUR-PANEL-INSTANCE");

    static private final SubLList $list_alt432 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), $HOUR), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym433$OUTER_CATCH_FOR_CYBLACK_HOUR_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-HOUR-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_HOUR_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-HOUR-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TWO_HOURS_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TWO-HOURS-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TWO_HOURS_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TWO-HOURS-PANEL-INSTANCE");

    static private final SubLList $list_alt437 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("TWO-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym438$OUTER_CATCH_FOR_CYBLACK_TWO_HOURS_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TWO-HOURS-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_TWO_HOURS_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-TWO-HOURS-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_THREE_HOURS_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-THREE-HOURS-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_THREE_HOURS_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-THREE-HOURS-PANEL-INSTANCE");

    static private final SubLList $list_alt442 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("THREE-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym443$OUTER_CATCH_FOR_CYBLACK_THREE_HOURS_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-THREE-HOURS-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_THREE_HOURS_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-THREE-HOURS-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FOUR_HOURS_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FOUR-HOURS-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FOUR_HOURS_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FOUR-HOURS-PANEL-INSTANCE");

    static private final SubLList $list_alt447 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("FOUR-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym448$OUTER_CATCH_FOR_CYBLACK_FOUR_HOURS_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FOUR-HOURS-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_FOUR_HOURS_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-FOUR-HOURS-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FIVE_HOURS_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FIVE-HOURS-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FIVE_HOURS_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FIVE-HOURS-PANEL-INSTANCE");

    static private final SubLList $list_alt452 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("FIVE-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym453$OUTER_CATCH_FOR_CYBLACK_FIVE_HOURS_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FIVE-HOURS-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_FIVE_HOURS_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-FIVE-HOURS-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SIX_HOURS_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SIX-HOURS-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SIX_HOURS_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SIX-HOURS-PANEL-INSTANCE");

    static private final SubLList $list_alt457 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("SIX-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym458$OUTER_CATCH_FOR_CYBLACK_SIX_HOURS_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SIX-HOURS-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_SIX_HOURS_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-SIX-HOURS-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SEVEN_HOURS_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SEVEN-HOURS-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SEVEN_HOURS_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SEVEN-HOURS-PANEL-INSTANCE");

    static private final SubLList $list_alt462 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("SEVEN-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym463$OUTER_CATCH_FOR_CYBLACK_SEVEN_HOURS_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SEVEN-HOURS-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_SEVEN_HOURS_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-SEVEN-HOURS-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EIGHT_HOURS_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EIGHT-HOURS-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EIGHT_HOURS_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EIGHT-HOURS-PANEL-INSTANCE");

    static private final SubLList $list_alt467 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("EIGHT-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym468$OUTER_CATCH_FOR_CYBLACK_EIGHT_HOURS_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EIGHT-HOURS-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_EIGHT_HOURS_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-EIGHT-HOURS-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_NINE_HOURS_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-NINE-HOURS-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_NINE_HOURS_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-NINE-HOURS-PANEL-INSTANCE");

    static private final SubLList $list_alt472 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("NINE-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym473$OUTER_CATCH_FOR_CYBLACK_NINE_HOURS_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-NINE-HOURS-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_NINE_HOURS_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-NINE-HOURS-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TEN_HOURS_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TEN-HOURS-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TEN_HOURS_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TEN-HOURS-PANEL-INSTANCE");

    static private final SubLList $list_alt477 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("TEN-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym478$OUTER_CATCH_FOR_CYBLACK_TEN_HOURS_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TEN-HOURS-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_TEN_HOURS_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-TEN-HOURS-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ELEVEN_HOURS_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ELEVEN-HOURS-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ELEVEN_HOURS_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ELEVEN-HOURS-PANEL-INSTANCE");

    static private final SubLList $list_alt482 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("ELEVEN-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym483$OUTER_CATCH_FOR_CYBLACK_ELEVEN_HOURS_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ELEVEN-HOURS-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_ELEVEN_HOURS_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-ELEVEN-HOURS-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_DAY_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-DAY-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_DAY_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-DAY-PANEL-INSTANCE");

    static private final SubLList $list_alt487 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("HALF-DAY")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym488$OUTER_CATCH_FOR_CYBLACK_HALF_DAY_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-HALF-DAY-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_HALF_DAY_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-HALF-DAY-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DAY_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DAY-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DAY_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DAY-PANEL-INSTANCE");

    static private final SubLList $list_alt492 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("DAY")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym493$OUTER_CATCH_FOR_CYBLACK_DAY_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DAY-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_DAY_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-DAY-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_WEEK_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-WEEK-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_WEEK_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-WEEK-PANEL-INSTANCE");

    static private final SubLList $list_alt497 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), $WEEK), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym498$OUTER_CATCH_FOR_CYBLACK_WEEK_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-WEEK-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_WEEK_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-WEEK-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MONTH_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MONTH-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MONTH_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MONTH-PANEL-INSTANCE");

    static private final SubLList $list_alt502 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("MONTH")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym503$OUTER_CATCH_FOR_CYBLACK_MONTH_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MONTH-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_MONTH_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-MONTH-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_YEAR_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-YEAR-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_YEAR_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-YEAR-PANEL-INSTANCE");

    static private final SubLList $list_alt507 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), $YEAR), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym508$OUTER_CATCH_FOR_CYBLACK_YEAR_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-YEAR-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_YEAR_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-YEAR-PANEL-INITIALIZE-METHOD");

    // // Internal Constant Initializer Methods
    private static final SubLObject _constant_123_initializer() {
        return list(new SubLObject[]{ list(makeSymbol("MARKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-MARKABLE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MARKS-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MARKS-INTERNAL"), list(makeSymbol("NEW-MARKS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR-ALL-MARKS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-MARK"), list(makeSymbol("MARK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-MARK"), list(makeSymbol("MARK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-MARK-P"), list(makeSymbol("MARK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("CURRENT-POSTING"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("SUPER-PANELS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("SUB-PANELS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DATATYPE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("POSTING-DAEMONS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STIMULATION-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STIMULATION-TYPE"), list(makeSymbol("NEW-STIMULATION-TYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUPER-PANELS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUB-PANELS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-SUB-PANELS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("EXCLUDED-PANELS"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUPER-PANEL"), list(makeSymbol("NEW-SUPER-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUB-PANEL"), list(makeSymbol("NEW-SUB-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUPER-PANEL"), list(makeSymbol("OLD-SUPER-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUB-PANEL"), list(makeSymbol("OLD-SUB-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-ALL-MONITORS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENTS"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-ALL-POSTING-DAEMONS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"))), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATATYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DATATYPE"), list(makeSymbol("NEW-DATATYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD-FIRST-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-REMOVE-LAST-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("KNOWLEDGE-SOURCES")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-POSTINGS"), list(makeSymbol("POSTINGS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-ACTIVE-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-POSTINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-ACTIVE-POSTINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTINGS"), list(makeSymbol("POSTING-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-POSTINGS"), list(makeSymbol("POSTING-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("KS-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("KS-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING-DAEMON"), list(makeSymbol("NEW-POSTING-DAEMON")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-POSTING-DAEMON"), list(makeSymbol("OLD-POSTING-DAEMON")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING-DAEMONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-DIRECT-POSTING-DAEMONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS"), list(makeSymbol("DAEMON-VISITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-POSTING-DAEMONS"), list(makeSymbol("DAEMON-VISITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEACTIVATE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ACTIVATE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET"), list(makeSymbol("KEY")), makeKeyword("PUBLIC")), list(makeSymbol("INTERVAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TICKING"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STARTED-UP"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DO-TICK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BACKGROUND-PROCESS"), NIL, makeKeyword("PROTECTED")) });
    }

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_cyblack_timer_panel_file();
    }

    @Override
    public void initializeVariables() {
        init_cyblack_timer_panel_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cyblack_timer_panel_file();
    }
}

