/*
 * ControlC.c
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: ControlC.c,v 1.1 2004-04-30 01:45:44 piso Exp $
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
 */

#include "ControlC.h"
#include <signal.h>

JNIEnv *_env;
jclass _cls;
jmethodID _mid;

void ctrl_c_handler()
{
    (*_env)->CallStaticVoidMethod(_env, _cls, _mid);
}

JNIEXPORT void JNICALL
Java_org_armedbear_lisp_ControlC_installControlCHandler(JNIEnv *env, jclass cls)
{
    _env = env;
    _cls = cls;
    _mid = (*env)->GetStaticMethodID(env, cls, "callback", "()V");
    signal(SIGINT, ctrl_c_handler);
    while (1)
        sleep(31536000);
}
