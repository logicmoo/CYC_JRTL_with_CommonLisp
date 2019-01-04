package org.appdapter.core.convert;

public interface OptionalArg {

	static short NO_OPTIONAL_DEFAULTS = 0;
	static short OPTIONAL_FROM_CLIPBOARD = 1;
	static short OPTIONAL_FROM_RESULTS = 2;
	static short OPTIONAL_FROM_SINGLETON = 4;
	static short OPTIONAL_FROM_LOADED = 8;
	static short OPTIONAL_FROM_DEFAULTS = OPTIONAL_FROM_CLIPBOARD | OPTIONAL_FROM_RESULTS | OPTIONAL_FROM_SINGLETON;
	static short OPTIONAL_FROM_EVERYYWHERE = OPTIONAL_FROM_CLIPBOARD | OPTIONAL_FROM_RESULTS | OPTIONAL_FROM_SINGLETON | OPTIONAL_FROM_LOADED;

	OptionalArg NONE = new OptionalArg() {

		public String toString() {
			return "OptionalArg.NONE";
		}

		@Override public void reset() {
		}

		@Override public Object getArg(Class pt) throws NoSuchConversionException {
			if (true)
				throw new NoSuchConversionException("no extra args of type " + pt);
			return null;
		}
	};

	OptionalArg JUST_NULLS = new OptionalArg() {

		public String toString() {
			return "OptionalArg.JUST_NULLS";
		}

		@Override public void reset() {
		}

		@Override public Object getArg(Class pt) throws NoSuchConversionException {
			return null;
		}
	};

	Object getArg(Class pt) throws NoSuchConversionException;

	void reset();
}
