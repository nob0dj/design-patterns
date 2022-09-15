package com.sh.flyweight.after;

/**
 * intrinsit class는 immutable 이다.
 */
public final class Font {
    private final String fontFamily;
    private final int size;

    public Font(String fontFamily, int size) {
        this.fontFamily = fontFamily;
        this.size = size;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public int getSize() {
        return size;
    }
}
