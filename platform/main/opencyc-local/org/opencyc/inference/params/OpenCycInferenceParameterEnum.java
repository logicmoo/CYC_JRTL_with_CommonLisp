package org.opencyc.inference.params;

import java.util.Arrays;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycFort;
import org.opencyc.api.CycObjectFactory;
import java.util.List;

public enum OpenCycInferenceParameterEnum
{
    INFERENCE_MODE {
        @Override
        InferenceParameter getInferenceParameter() {
            return OpenCycInferenceParameterEnum.INFERERNCE_MODE_PARAM;
        }
    }, 
    MAX_NUMBER {
        @Override
        InferenceParameter getInferenceParameter() {
            return OpenCycInferenceParameterEnum.MAX_NUMBER_PARAM;
        }
    }, 
    MAX_TIME {
        @Override
        InferenceParameter getInferenceParameter() {
            return OpenCycInferenceParameterEnum.MAX_TIME_PARAM;
        }
    }, 
    MAX_TRANSFORMATION_DEPTH {
        @Override
        InferenceParameter getInferenceParameter() {
            return OpenCycInferenceParameterEnum.MAX_TRANSFORMATION_DEPTH_PARAM;
        }
    }, 
    CONTINUABLE {
        @Override
        InferenceParameter getInferenceParameter() {
            return OpenCycInferenceParameterEnum.CONTINUABLE_PARAM;
        }
    }, 
    ALLOW_INDETERMINATE_RESULTS {
        @Override
        InferenceParameter getInferenceParameter() {
            return OpenCycInferenceParameterEnum.ALLOW_INDETERMINATE_RESULTS_PARAM;
        }
    };
    
    private static final InferenceParameter CONTINUABLE_PARAM;
    private static final InferenceParameter ALLOW_INDETERMINATE_RESULTS_PARAM;
    private static final InferenceParameter MAX_NUMBER_PARAM;
    private static final InferenceParameter MAX_TIME_PARAM;
    private static final InferenceParameter MAX_TRANSFORMATION_DEPTH_PARAM;
    private static final InferenceParameterValueDescription MINIMAL;
    private static final InferenceParameterValueDescription SHALLOW;
    private static final InferenceParameterValueDescription EXTENDED;
    private static final InferenceParameterValueDescription MAXIMAL;
    private static final List<InferenceParameterValueDescription> INFERENCE_MODES;
    private static final InferenceParameter INFERERNCE_MODE_PARAM;
    
    abstract InferenceParameter getInferenceParameter();
    
    static {
        CONTINUABLE_PARAM = (InferenceParameter)new DefaultBooleanInferenceParameter(true, InferenceParameters.CONTINUABLE, (CycFort)null, "Continuable", "This controls whether the inference is continuable or not.", CycObjectFactory.nil, CycObjectFactory.nil, (CycList)null);
        ALLOW_INDETERMINATE_RESULTS_PARAM = (InferenceParameter)new DefaultBooleanInferenceParameter(false, InferenceParameters.ALLOW_INDETERMINATE_RESULTS, (CycFort)null, "Allow result bindings to indeterminates", "Whether it is permissible to use instances of #$IndeterminateTerm for result bindings. Note that instances of #$IndeterminateTerm will always be used for explicitly scoped variables (e.g. scoped by #$thereExists, etc.).", CycObjectFactory.nil, CycObjectFactory.t, (CycList)null);
        MAX_NUMBER_PARAM = (InferenceParameter)new DefaultIntegerInferenceParameter((Object)null, InferenceParameters.MAX_NUMBER, (CycFort)null, "Maximum number of results", "This controls how many answers we want to find before suspending.", CycObjectFactory.t, CycObjectFactory.nil, (CycList)null, (Number)0, (Number)Long.MAX_VALUE);
        MAX_TIME_PARAM = (InferenceParameter)new DefaultIntegerInferenceParameter((Object)null, InferenceParameters.MAX_TIME, (CycFort)null, "Maximum run time (sec)", "This controls how long we allow an inference to run before suspending.", CycObjectFactory.t, CycObjectFactory.nil, (CycList)null, (Number)0, (Number)Long.MAX_VALUE);
        MAX_TRANSFORMATION_DEPTH_PARAM = (InferenceParameter)new DefaultIntegerInferenceParameter((Object)0, InferenceParameters.MAX_TRANSFORMATION_DEPTH, (CycFort)null, "Maximum number of transformation steps", "This specifies the maximum allowable number of transformation steps in answers.", CycObjectFactory.t, CycObjectFactory.nil, (CycList)null, (Number)0, (Number)Long.MAX_VALUE);
        MINIMAL = (InferenceParameterValueDescription)new DefaultInferenceParameterValueDescription((Object)CycObjectFactory.makeCycSymbol(":MINIMAL"), "Minimal", "Sets up minimal defaults for several other inference parameters, including no transformation and no new terms.");
        SHALLOW = (InferenceParameterValueDescription)new DefaultInferenceParameterValueDescription((Object)CycObjectFactory.makeCycSymbol(":SHALLOW"), "Shallow", "Sets up shallow defaults for several other inference parameters, including a max transformation depth of 1 and no new terms.");
        EXTENDED = (InferenceParameterValueDescription)new DefaultInferenceParameterValueDescription((Object)CycObjectFactory.makeCycSymbol(":EXTENDED"), "Extended", "Sets up extended defaults for several other inference parameters, including a max transformation depth of 2 and new terms allowed.");
        MAXIMAL = (InferenceParameterValueDescription)new DefaultInferenceParameterValueDescription((Object)CycObjectFactory.makeCycSymbol(":MAXIMAL"), "Maximal", "Sets up maximal defaults for several other inference parameters, including unbounded transformation depth and no restrictions on various other resource constraints.");
        INFERENCE_MODES = Arrays.asList(OpenCycInferenceParameterEnum.MINIMAL, OpenCycInferenceParameterEnum.SHALLOW, OpenCycInferenceParameterEnum.EXTENDED, OpenCycInferenceParameterEnum.MAXIMAL);
        INFERERNCE_MODE_PARAM = (InferenceParameter)new DefaultEnumerationInferenceParameter((Object)OpenCycInferenceParameterEnum.SHALLOW, CycObjectFactory.makeCycSymbol(":INFERENCE-MODE"), (CycFort)null, "Inference engine mode", "This controls what mode the inference engine will operate under; roughly, how deep it will search for an answer before giving up.  This is a meta-property that controls many other low-level inference settings.", CycObjectFactory.t, CycObjectFactory.nil, (CycList)null, (List)OpenCycInferenceParameterEnum.INFERENCE_MODES);
    }
    
    public enum OpenCycInferenceMode
    {
        MINIMAL_MODE(OpenCycInferenceParameterEnum.MINIMAL), 
        SHALLOW_MODE(OpenCycInferenceParameterEnum.SHALLOW), 
        EXTENDED_MODE(OpenCycInferenceParameterEnum.EXTENDED), 
        MAXIMAL_MODE(OpenCycInferenceParameterEnum.MAXIMAL);
        
        private final InferenceParameterValueDescription description;
        
        private OpenCycInferenceMode(final InferenceParameterValueDescription description) {
            this.description = description;
        }
        
        public InferenceParameterValueDescription getDescription() {
            return this.description;
        }
        
        public static OpenCycInferenceMode fromString(final String modeName) {
            for (final OpenCycInferenceMode mode : values()) {
                if (mode.getDescription().getValue().toString().equalsIgnoreCase(modeName)) {
                    return mode;
                }
            }
            return null;
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 66 ms
	
	Decompiled with Procyon 0.5.32.
*/