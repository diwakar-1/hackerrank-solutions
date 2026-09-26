// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/welcome-to-java/problem?isFullScreen=true
// Problem     Welcome to Java!
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-26, 02:45 p.m.
// Technique   standard-output-printing
// Time        O(1)
// Space       O(1)
// Insight     The program executes two sequential print operations to the standard output stream to display the required strings.
// Interview   Before: "How do I output text in Java?" After: "You use System.out.println to print strings to the console. This approach has O(1) time and space complexity as it performs a fixed number of operations regardless of input."
// Pitfalls    (1) Failing to include the exact punctuation required in the strings "Hello, World." and "Hello, Java."  (2) Omitting the semicolon at the end of each statement, which causes a compilation error in Java.
// ──────────────────────────────────────────────────

public class Solution {

    public static void main(String[] args) {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");   
    }
}
