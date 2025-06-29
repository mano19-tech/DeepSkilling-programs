package com.example;

public class FileService {
    private final FileManager manager;

    public FileService(FileManager manager) {
        this.manager = manager;
    }

    public boolean safelyDelete(String path) {
        try {
            manager.deleteFile(path);
            return true;
        } catch (RuntimeException ex) {
            System.out.println("Error: " + ex.getMessage());
            return false;
        }
    }
}
