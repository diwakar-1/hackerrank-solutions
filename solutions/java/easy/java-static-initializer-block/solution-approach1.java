// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
// Problem     Java Static Initializer Block
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-27, 08:02 p.m.
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

