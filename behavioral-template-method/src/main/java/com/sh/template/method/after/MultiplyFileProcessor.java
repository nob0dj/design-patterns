package com.sh.template.method.after;

public class MultiplyFileProcessor extends FileProcessor {
    public MultiplyFileProcessor(String path) {
        super(path, 1);
    }

    @Override
    protected int getResult(int result, int n) {
        return result *= n;
    }
}
