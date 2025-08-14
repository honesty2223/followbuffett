package com.followbuffett.application.port.out;

public interface BatchLogPort {
    boolean exists(String batchId);
    void save(String batchId);
}
