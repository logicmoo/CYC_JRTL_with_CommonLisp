
#ifdef __cplusplus
extern "C" {
#endif
#define VT1
#define VLEX1
#define CLSR1
#define STCK1
static cl_object Cblock;
#define VM1 0
#define VM 1
#define VMtemp 8
#ifdef ECL_DYNAMIC_VV
static cl_object *VV;
#else
static cl_object VV[VM];
#endif
#ifdef __cplusplus
}
#endif
/*
 * Exported Lisp functions
 */
#define compiler_cfuns_size 0
#define compiler_cfuns NULL
