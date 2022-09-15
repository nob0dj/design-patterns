package com.sh.adapter.usage;

import java.io.*;
import java.util.*;

public class AdapterInJava {

    public static void main(String[] args) {
        // collections
        // String[](가변인자) -> List
        List<String> strings = Arrays.asList("a", "b", "c");
        // List -> Enumeration
        Enumeration<String> enumeration = Collections.enumeration(strings);
        // Enumberation -> List
        ArrayList<String> list = Collections.list(enumeration);

        // io
        try(InputStream is = new FileInputStream("input.txt"); // String -> InputStream
            InputStreamReader isr = new InputStreamReader(is); // InputStream -> InputStreamReader
            BufferedReader reader = new BufferedReader(isr)) { // InputStreamReader -> BufferedReader
            while(reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
