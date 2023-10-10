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
            }
        }
//        System.out.print("명령 >> ");
//        String M = sc.nextLine();
//        if(M.equals("종료")) {
//            System.out.println("종료");
//        } else {
//            System.out.println("명언 : " + M);
//        }
    }


}