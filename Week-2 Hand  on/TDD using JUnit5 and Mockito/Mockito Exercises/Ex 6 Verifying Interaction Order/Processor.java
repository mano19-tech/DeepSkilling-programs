package com.example;

public class Processor {
    private final Workflow workflow;

    public Processor(Workflow workflow) {
        this.workflow = workflow;
    }

    public void runProcess() {
        workflow.start();
        workflow.process();
        workflow.finish();
    }
}
