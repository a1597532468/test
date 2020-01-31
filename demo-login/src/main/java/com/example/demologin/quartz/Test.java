/*package com.example.demologin.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception {
        JobDetail jobDetail=new JobDetail("a",MyJob.class);
       *//* SimpleTrigger trigger=new SimpleTrigger("t1",SimpleTrigger.REPEAT_INDEFINITELY,3000);
        trigger.setStartTime(new Date(System.currentTimeMillis()+2000));
        trigger.setEndTime(new Date(System.currentTimeMillis()+20000));*//*

        CronTrigger trigger=new CronTrigger("t2",null,"0/3 42 11 * * ?");
        SchedulerFactory factory=new StdSchedulerFactory();
        Scheduler s1=factory.getScheduler();
        s1.scheduleJob(jobDetail,trigger);
        s1.start();

    }
}*/
