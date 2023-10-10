package org.example;

import java.util.Scanner;

public class App {
    private final Scanner sc;
    public App(Scanner sc){
        this.sc = sc;
    }
    public void run() {
        System.out.println("== 명언 앱 ==");

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("명령 >> ");
            String cmd = sc.nextLine();

            if (cmd.equals("종료")) {
                System.out.println(cmd);
                break;
            } else if (cmd.equals("등록")) {
                System.out.print("작가 >> ");
                String A = sc.nextLine();
                System.out.print("명언 >> ");
                String B = sc.nextLine();
                System.out.println("작가 >> " + A);
                System.out.println("명언 >> " + B);
                break;
            }
        }
    }
}