package com.ll.batch;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.stereotype.Service;


    @Service
    @RequiredArgsConstructor
    public class BatchService {
        private final JobLauncher jobLauncher;
        private final Job helloJob;

        public void runhelloJob() {
            try {
                JobParameters jobParameters = new JobParametersBuilder()
                        .toJobParameters();
                jobLauncher.run(helloJob, jobParameters);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

