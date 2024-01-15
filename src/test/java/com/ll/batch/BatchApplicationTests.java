package com.ll.batch;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@SpringBatchTest
@ActiveProfiles("test")
class BatchApplicationTests {
    @Autowired
    public JobLauncherTestUtils helloJobLauncherTestUtils;
    @Autowired
    public JobLauncherTestUtils hello2JobLauncherTestUtils;
    @Autowired
    public JobLauncherTestUtils hello3JobLauncherTestUtils;

    @DisplayName("t1")
    @Test
    public void t1() throws  Exception{
        helloJobLauncherTestUtils.launchJob();
    }

    @DisplayName("t2")
    @Test
    public void t2() throws  Exception{
        hello2JobLauncherTestUtils.launchJob();
    }

    @DisplayName("t3")
    @Test
    public void t3() throws  Exception{
        hello3JobLauncherTestUtils.launchJob();
    }

}
