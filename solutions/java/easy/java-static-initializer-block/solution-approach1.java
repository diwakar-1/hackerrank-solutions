// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
// Problem     Java Static Initializer Block
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-27, 08:02 p.m.
// Technique   static-initialization-block-validation
// Time        O(1)
// Space       O(1)
// Insight     The static initialization block executes once when the class is loaded, validating input constraints before the main method proceeds.
// Pitfalls    (1) Failing to handle the specific exception message format required by the problem statement.  (2) Incorrectly assuming the static block can throw a checked exception without a try-catch block.  (3) Neglecting to set the boolean flag correctly, which prevents the main method from knowing if the area calculation is valid.
// ──────────────────────────────────────────────────



static int B;
static int H;
static boolean flag;

static {
    Scanner sc = new Scanner(System.in);
    B = sc.nextInt();
    H = sc.nextInt();
    if(B <= 0 || H<= 0){
        System.out.print("java.lang.Exception: Breadth and height must be positive");
    flag = false;
    }
    else{
        flag = true;
    }
}

