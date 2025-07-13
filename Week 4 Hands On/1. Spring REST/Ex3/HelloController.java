package com.example.loggingdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Logger instance
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String home() {
        logger.trace("TRACE log: Entered home()");
        logger.debug("DEBUG log: Preparing response...");
        logger.info("INFO log: Home endpoint hit");
        logger.warn("WARN log: No specific warnings");
        logger.error("ERROR log: Sample error message");

        return "Check console for log output.";

    }
    @GetMapping("/hello")
    public String hello() {
        logger.info("INFO: Hello endpoint hit");
        return "Hello from Spring Boot!";
    }

}
