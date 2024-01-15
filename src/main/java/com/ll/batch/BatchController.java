package com.ll.batch;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

    @Controller
    @RequestMapping("/batch")
    @RequiredArgsConstructor
    public class BatchController {
        private final BatchService batchService;

        @GetMapping("/hello")
        @ResponseBody
        public String runhelloJob() {
            batchService.runhelloJob();

            return "runhelloJob OK";
        }
    }

