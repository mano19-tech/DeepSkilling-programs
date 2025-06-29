package com.example;

public class StatusService {
    private final ExternalApi api;

    public StatusService(ExternalApi api) {
        this.api = api;
    }

    public String[] checkStatusTwice() {
        return new String[] { api.getStatus(), api.getStatus() };
    }
}
