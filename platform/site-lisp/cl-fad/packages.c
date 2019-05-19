/*	Compiler: ECL 9.8.4                                           */
/*	Date: 2009/8/29 12:25 (yyyy/mm/dd)                            */
/*	Machine: NT 5.0 x86                                           */
/*	Source: C:/Users/Seth/workspace/jasko.tim.lisp/lisp-extensions/cl-fad/packages.lisp */
#include <ecl/ecl-cmp.h>
#include "C:/Users/Seth/workspace/jasko.tim.lisp/lisp-extensions/cl-fad/packages.h"
	
#include "C:/Users/Seth/workspace/jasko.tim.lisp/lisp-extensions/cl-fad/packages.data"
#ifdef __cplusplus
extern "C"
#endif
ECL_DLLEXPORT void _eclwEERkWF_YdLmLvy(cl_object flag)
{ VT1 VLEX1 CLSR1 STCK1
	const cl_env_ptr cl_env_copy = ecl_process_env();
	cl_object value0;
	cl_object *VVtemp;
	if (!FIXNUMP(flag)){
	Cblock=flag;
	#ifndef ECL_DYNAMIC_VV
	flag->cblock.data = VV;
	#endif
	flag->cblock.data_size = VM;
	flag->cblock.temp_data_size = VMtemp;
	flag->cblock.data_text = compiler_data_text;
	flag->cblock.data_text_size = compiler_data_text_size;
	flag->cblock.cfuns_size = compiler_cfuns_size;
	flag->cblock.cfuns = compiler_cfuns;
	flag->cblock.source = make_constant_base_string("C:/Users/Seth/workspace/jasko.tim.lisp/lisp-extensions/cl-fad/packages.lisp");
	return;}
	#ifdef ECL_DYNAMIC_VV
	VV = Cblock->cblock.data;
	#endif
	Cblock->cblock.data_text = "@EcLtAg:_eclwEERkWF_YdLmLvy@";
	VVtemp = Cblock->cblock.temp_data;
	(void)si_select_package(VVtemp[0])        /*  SELECT-PACKAGE  */;
	(void)ecl_function_dispatch(cl_env_copy,VV[0])(10,VVtemp[1],VVtemp[2],Cnil,VVtemp[3],Cnil,Cnil,VVtemp[4],Cnil,Cnil,Cnil) /*  DODEFPACKAGE */;
	(void)ecl_function_dispatch(cl_env_copy,VV[0])(10,VVtemp[5],Cnil,Cnil,VVtemp[6],Cnil,Cnil,VVtemp[7],Cnil,Cnil,Cnil) /*  DODEFPACKAGE */;
}
