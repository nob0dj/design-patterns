package com.sh.template.method.after;

public class SumFileProcessor extends FileProcessor {
    public SumFileProcessor(String path) {
        super(path, 0);
    }

    @Override
    protected int getResult(int result, int n) {
        return result += n;
    }
}
