/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class nicslulibJNI {
  public final static native long new_uintArray(int jarg1);
  public final static native void delete_uintArray(long jarg1);
  public final static native int uintArray_getitem(long jarg1, uintArray jarg1_, int jarg2);
  public final static native void uintArray_setitem(long jarg1, uintArray jarg1_, int jarg2, int jarg3);
  public final static native long uintArray_cast(long jarg1, uintArray jarg1_);
  public final static native long uintArray_frompointer(long jarg1);
  public final static native long new_doubleArray(int jarg1);
  public final static native void delete_doubleArray(long jarg1);
  public final static native double doubleArray_getitem(long jarg1, doubleArray jarg1_, int jarg2);
  public final static native void doubleArray_setitem(long jarg1, doubleArray jarg1_, int jarg2, double jarg3);
  public final static native long doubleArray_cast(long jarg1, doubleArray jarg1_);
  public final static native long doubleArray_frompointer(long jarg1);
  public final static native int NICSLU_GENERAL_FAIL_get();
  public final static native int NICSLU_ARGUMENT_ERROR_get();
  public final static native int NICSLU_MEMORY_OVERFLOW_get();
  public final static native int NICSLU_FILE_CANNOT_OPEN_get();
  public final static native int NICSLU_MATRIX_STRUCTURAL_SINGULAR_get();
  public final static native int NICSLU_MATRIX_NUMERIC_SINGULAR_get();
  public final static native int NICSLU_MATRIX_INVALID_get();
  public final static native int NICSLU_MATRIX_ENTRY_DUPLICATED_get();
  public final static native int NICSLU_THREADS_NOT_INITIALIZED_get();
  public final static native int NICSLU_MATRIX_NOT_INITIALIZED_get();
  public final static native int NICSLU_SCHEDULER_NOT_INITIALIZED_get();
  public final static native int NICSLU_SINGLE_THREAD_get();
  public final static native int NICSLU_THREADS_INIT_FAIL_get();
  public final static native int NICSLU_MATRIX_NOT_ANALYZED_get();
  public final static native int NICSLU_MATRIX_NOT_FACTORIZED_get();
  public final static native int NICSLU_NUMERIC_OVERFLOW_get();
  public final static native int NICSLU_USE_SEQUENTIAL_FACTORIZATION_get();
  public final static native int NICSLU_BIND_THREADS_FAIL_get();
  public final static native void SNicsLU_flag_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_flag_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_stat_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_stat_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_cfgi_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_cfgi_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_cfgf_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_cfgf_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_n_set(long jarg1, SNicsLU jarg1_, int jarg2);
  public final static native int SNicsLU_n_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_nnz_set(long jarg1, SNicsLU jarg1_, int jarg2);
  public final static native int SNicsLU_nnz_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_ax_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_ax_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_ai_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_ai_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_ap_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_ap_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_rhs_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_rhs_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_row_perm_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_row_perm_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_row_perm_inv_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_row_perm_inv_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_col_perm_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_col_perm_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_col_perm_inv_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_col_perm_inv_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_col_scale_perm_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_col_scale_perm_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_row_scale_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_row_scale_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_cscale_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_cscale_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_pivot_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_pivot_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_pivot_inv_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_pivot_inv_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_lu_nnz_est_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_lu_nnz_est_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_lu_nnz_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_lu_nnz_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_l_nnz_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_l_nnz_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_u_nnz_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_u_nnz_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_ldiag_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_ldiag_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_lu_array_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_lu_array_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_up_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_up_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_llen_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_llen_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_ulen_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_ulen_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_len_est_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_len_est_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_wkld_est_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_wkld_est_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_row_state_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_row_state_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_lu_array2_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_lu_array2_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_workspace_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_workspace_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_workspace_mt1_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_workspace_mt1_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_workspace_mt2_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_workspace_mt2_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_thread_work_set(long jarg1, SNicsLU jarg1_, int jarg2);
  public final static native int SNicsLU_thread_work_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_thread_id_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_thread_id_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_thread_arg_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_thread_arg_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_thread_active_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_thread_active_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_thread_finish_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_thread_finish_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_cluster_start_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_cluster_start_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_cluster_end_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_cluster_end_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_pipeline_start_set(long jarg1, SNicsLU jarg1_, int jarg2);
  public final static native int SNicsLU_pipeline_start_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_pipeline_end_set(long jarg1, SNicsLU jarg1_, int jarg2);
  public final static native int SNicsLU_pipeline_end_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_last_busy_set(long jarg1, SNicsLU jarg1_, int jarg2);
  public final static native int SNicsLU_last_busy_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_aeg_level_set(long jarg1, SNicsLU jarg1_, int jarg2);
  public final static native int SNicsLU_aeg_level_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_aeg_data_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_aeg_data_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_aeg_header_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_aeg_header_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_aeg_refact_level_set(long jarg1, SNicsLU jarg1_, int jarg2);
  public final static native int SNicsLU_aeg_refact_level_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_aeg_refact_data_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_aeg_refact_data_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_aeg_refact_header_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_aeg_refact_header_get(long jarg1, SNicsLU jarg1_);
  public final static native void SNicsLU_timer_set(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native long SNicsLU_timer_get(long jarg1, SNicsLU jarg1_);
  public final static native long new_SNicsLU();
  public final static native void delete_SNicsLU(long jarg1);
  public final static native int NicsLU_Initialize(long jarg1, SNicsLU jarg1_);
  public final static native int NicsLU_Destroy(long jarg1, SNicsLU jarg1_);
  public final static native int NicsLU_CreateMatrix(long jarg1, SNicsLU jarg1_, int jarg2, int jarg3, long jarg4, long jarg5, long jarg6);
  public final static native int NicsLU_CreateScheduler(long jarg1, SNicsLU jarg1_);
  public final static native int NicsLU_CreateThreads(long jarg1, SNicsLU jarg1_, long jarg2, boolean jarg3);
  public final static native int NicsLU_BindThreads(long jarg1, SNicsLU jarg1_, boolean jarg2);
  public final static native int NicsLU_DestroyThreads(long jarg1, SNicsLU jarg1_);
  public final static native int NicsLU_Analyze(long jarg1, SNicsLU jarg1_);
  public final static native int NicsLU_Factorize(long jarg1, SNicsLU jarg1_);
  public final static native int NicsLU_ReFactorize(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native int NicsLU_Factorize_MT(long jarg1, SNicsLU jarg1_);
  public final static native int NicsLU_ReFactorize_MT(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native int NicsLU_Solve(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native int NicsLU_SolveFast(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native int NicsLU_ResetMatrixValues(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native int NicsLU_Refine(long jarg1, SNicsLU jarg1_, long jarg2, long jarg3, double jarg4, int jarg5);
  public final static native int NicsLU_Throughput(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native int NicsLU_Flops(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native int NicsLU_ThreadLoad(long jarg1, SNicsLU jarg1_, long jarg2, long jarg3);
  public final static native int NicsLU_DumpA(long jarg1, SNicsLU jarg1_, long jarg2, long jarg3, long jarg4);
  public final static native int NicsLU_DumpLU(long jarg1, SNicsLU jarg1_, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7);
  public final static native int NicsLU_ConditionNumber(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native int NicsLU_MemoryUsage(long jarg1, SNicsLU jarg1_, long jarg2);
  public final static native int NicsLU_Residual(int jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7, int jarg8, int jarg9);
  public final static native int NicsLU_Transpose(int jarg1, int jarg2, long jarg3, long jarg4, long jarg5);
  public final static native int NicsLU_Sort(int jarg1, int jarg2, long jarg3, long jarg4, long jarg5);
  public final static native int NicsLU_MergeDuplicateEntries(int jarg1, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native int readFromFile(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7, long jarg8);
}
