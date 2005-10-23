/*
 * RandomState.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: RandomState.java,v 1.6 2005-10-23 18:44:50 piso Exp $
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

package org.armedbear.lisp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Random;

public final class RandomState extends LispObject
{
    private Random random;

    public RandomState()
    {
        random = new Random();
    }

    public RandomState(RandomState rs) throws ConditionThrowable
    {
        try {
            File file = File.createTempFile("MAKE-RANDOM-STATE", null);
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(rs.random);
            out.close();
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            random = (Random) in.readObject();
            in.close();
            file.delete();
        }
        catch (Throwable t) {
            signal(new LispError("Unable to copy random state."));
        }
    }

    public LispObject typeOf()
    {
        return Symbol.RANDOM_STATE;
    }

    public LispObject classOf()
    {
        return BuiltInClass.RANDOM_STATE;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.RANDOM_STATE)
            return T;
        if (type == BuiltInClass.RANDOM_STATE)
            return T;
        return super.typep(type);
    }

    public String writeToString()
    {
        return unreadableString("RANDOM-STATE");
    }

    public LispObject random(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof Fixnum) {
            int limit = ((Fixnum)arg).getValue();
            if (limit > 0) {
                int n = random.nextInt((int)limit);
                return new Fixnum(n);
            }
        } else if (arg instanceof Bignum) {
            BigInteger limit = ((Bignum)arg).getValue();
            if (limit.signum() > 0) {
                int bitLength = limit.bitLength();
                BigInteger rand = new BigInteger(bitLength + 1, random);
                BigInteger remainder = rand.remainder(limit);
                return number(remainder);
            }
        } else if (arg instanceof SingleFloat) {
            float limit = ((SingleFloat)arg).value;
            if (limit > 0) {
                float rand = random.nextFloat();
                return new SingleFloat(rand * limit);
            }
        } else if (arg instanceof DoubleFloat) {
            double limit = ((DoubleFloat)arg).value;
            if (limit > 0) {
                double rand = random.nextDouble();
                return new DoubleFloat(rand * limit);
            }
        }
        return signal(new TypeError(arg, "positive integer or positive float"));
    }

    // ### random limit &optional random-state => random-number
    private static final Primitive RANDOM =
        new Primitive("random", "limit &optional random-state")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            RandomState randomState =
                (RandomState) Symbol._RANDOM_STATE_.symbolValue();
            return randomState.random(arg);
        }
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (second instanceof RandomState) {
                RandomState randomState = (RandomState) second;
                return randomState.random(first);
            }
            return signalTypeError(first, Symbol.RANDOM_STATE);
        }
    };

    // ### make-random-state
    // make-random-state &optional state
    private static final Primitive MAKE_RANDOM_STATE =
        new Primitive("make-random-state", "&optional state") {
        public LispObject execute() throws ConditionThrowable
        {
            return new RandomState((RandomState)Symbol._RANDOM_STATE_.symbolValue());
        }
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            if (arg == NIL)
                return new RandomState((RandomState)Symbol._RANDOM_STATE_.symbolValue());
            if (arg == T)
                return new RandomState();
            if (arg instanceof RandomState)
                return new RandomState((RandomState)arg);
            return signalTypeError(arg, Symbol.RANDOM_STATE);
        }
    };

    // ### random-state-p
    private static final Primitive RANDOM_STATE_P =
        new Primitive("random-state-p", "object")
    {
        public LispObject execute(LispObject arg)
        {
            return arg instanceof RandomState ? T : NIL;
        }
    };
}
