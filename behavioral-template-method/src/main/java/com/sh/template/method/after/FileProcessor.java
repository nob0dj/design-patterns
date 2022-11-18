package com.sh.template.method.after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class FileProcessor {
    private String path;
    private int initialValue;

    public FileProcessor(String path) {
        this.path = path;
    }

    public FileProcessor(String path, int initialValue) {
        this(path);
        this.initialValue = initialValue;
    }

    public final int process(){
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = this.initialValue;
            String line = null;
            while((line = reader.readLine()) != null) {
                result = getResult(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }

    protected abstract int getResult(int result, int n);
}
