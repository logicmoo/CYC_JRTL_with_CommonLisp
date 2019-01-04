package org.appdapter.core.math.number;

public interface Numeric<N>
{
    boolean isScalar();
    
    boolean isZero();
    
    boolean isPositive();
    
    boolean isNonnegative();
    
    boolean isFinite();
    
    Nonnegative<N> asNonnegative();
    
    Positive<N> asPositive();
    
    Zero<N> asZero();
    
    Finite<N> asFinite();
    
    public abstract static class Basic<BN> implements Numeric<BN>
    {
        protected RuntimeException downcastFailureException(final Class targetType) {
            return new RuntimeException("Cannot treat [" + this + "] as " + targetType);
        }
    }
    
    public interface Comparable<CN> extends java.lang.Comparable<CN>
    {
    }
    
    public interface Scalar<SN> extends Numeric<SN>
    {
        public interface Finite<FSN> extends Scalar<FSN>, Numeric.Finite<FSN>
        {
        }
    }
    
    public interface Finite<FN> extends Numeric<FN>
    {
        public interface Positive<PFN> extends Finite.Nonnegative<PFN>, Numeric.Positive<PFN>
        {
            public abstract static class Basic<BPFN> extends Numeric.Positive.Basic<BPFN> implements Finite.Positive<BPFN>
            {
                @Override
                public boolean isFinite() {
                    return true;
                }
                
                @Override
                public Finite<BPFN> asFinite() {
                    return this;
                }
            }
        }
        
        public interface Nonnegative<NNFN> extends Finite<NNFN>, Numeric.Nonnegative<NNFN>
        {
            public abstract static class Basic<BNNFN> extends Numeric.Nonnegative.Basic<BNNFN> implements Finite.Nonnegative<BNNFN>
            {
                @Override
                public boolean isFinite() {
                    return true;
                }
                
                @Override
                public Finite<BNNFN> asFinite() {
                    return this;
                }
            }
        }
    }
    
    public interface Positive<PN> extends Nonnegative<PN>
    {
        public abstract static class Basic<BPN> extends Nonnegative.Basic<BPN> implements Positive<BPN>
        {
            @Override
            public boolean isPositive() {
                return true;
            }
            
            @Override
            public boolean isZero() {
                return false;
            }
            
            @Override
            public Positive<BPN> asPositive() {
                return this;
            }
            
            @Override
            public Zero<BPN> asZero() {
                throw this.downcastFailureException(Zero.class);
            }
        }
    }
    
    public interface Zero<ZN> extends Numeric.Nonnegative<ZN>, Finite<ZN>
    {
        public abstract static class Basic<BZN> extends Numeric.Nonnegative.Basic<BZN> implements Zero<BZN>
        {
            @Override
            public boolean isZero() {
                return true;
            }
            
            @Override
            public boolean isPositive() {
                return false;
            }
            
            @Override
            public boolean isFinite() {
                return true;
            }
            
            @Override
            public Zero<BZN> asZero() {
                return this;
            }
            
            @Override
            public Finite<BZN> asFinite() {
                return this;
            }
            
            @Override
            public Numeric.Positive<BZN> asPositive() {
                throw this.downcastFailureException(Numeric.Positive.class);
            }
        }
    }
    
    public interface Nonnegative<NNN> extends Numeric<NNN>
    {
        public abstract static class Basic<BNNN> extends Numeric.Basic<BNNN> implements Nonnegative<BNNN>
        {
            @Override
            public boolean isNonnegative() {
                return true;
            }
            
            @Override
            public Nonnegative<BNNN> asNonnegative() {
                return this;
            }
        }
    }
    
    public interface Infinite<IN> extends Numeric<IN>
    {
        public abstract static class Basic<BIN> extends Numeric.Basic<BIN> implements Finite.Nonnegative<BIN>
        {
            @Override
            public boolean isFinite() {
                return false;
            }
            
            @Override
            public Finite<BIN> asFinite() {
                throw this.downcastFailureException(Finite.class);
            }
        }
    }
}

/*

	Total time: 38 ms
	
*/