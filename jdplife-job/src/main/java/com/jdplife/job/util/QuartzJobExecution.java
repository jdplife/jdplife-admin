package com.jdplife.job.util;

import com.jdplife.job.entity.SysJob;
import org.quartz.JobExecutionContext;

/**
 * 定时任务执行（允许并发执行）
 */
public class QuartzJobExecution extends AbstractQuartzJob {
    
    @Override
    protected void doExecute(JobExecutionContext context, SysJob job) throws Exception {
        JobInvokeUtil.invokeMethod(job);
    }
}
