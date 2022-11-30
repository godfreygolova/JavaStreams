package com.mycode.streams;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;


public class JavaStreams
{
    public static void main(String[] args) throws IOException
    {
        String[] names = {"SLSLLS","DJDJJJSJSS", "SJJSJS", "SJJSJJSJ", "NMSJSJJ", "SNNSNNS"};
        Arrays.stream(names)
        .filter(x -> x.startsWith("S"))
        .sorted()
        .forEach(System.out::println);
    }
}
