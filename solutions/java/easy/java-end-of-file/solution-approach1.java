// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
// Problem     Java End-of-file
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-27, 07:31 p.m.
// Technique   scanner-has-next-line-loop
// Time        O(N)
// Space       O(1)
// Insight     The implementation uses a scanner to continuously poll for available lines until the end-of-file condition is met, incrementing a counter for each successful read.
// Interview   Before: "I would read the input using a fixed-size array." After: "Using Scanner.hasNextLine() allows for O(N) time complexity where N is the total number of lines, effectively handling an unknown input size until EOF is reached."
// Pitfalls    (1) Using hasNext() instead of hasNextLine() may cause the scanner to skip whitespace or fail to process entire lines correctly.  (2) Failing to increment the line counter inside the loop results in incorrect line numbering for the output format.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linecount = 1;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(linecount+" "+line);
            linecount++;
        }
        sc.close();
    }
}
