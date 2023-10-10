package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        long count = 0;
        while(true){
            System.out.print("명령 >> ");
            String a = sc.nextLine();
            if(a.equals("등록")){
                System.out.print("명언 >> ");
                String content = sc.nextLine();
                System.out.print("작가 >> ");
                String author = sc.nextLine();
                count++;
                System.out.printf("%d번 명언이 등록되었습니다.\n",count);
            } else if (a.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("---------------------");
                System.out.printf("%d, %s, %s\n",wiseSaying.getId());
            } else if (a.equals("종료")) {
                System.out.println("종료");
                break;
            }
        }

    }
}