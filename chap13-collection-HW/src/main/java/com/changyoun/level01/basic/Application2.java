package com.changyoun.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Application2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String url = "";
        Stack<String> recentURL = new Stack<>();
        while(true) {
            try {
                System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
                url = br.readLine();
                if(url.equalsIgnoreCase("exit")){
                    break;
                }
                recentURL.push(url);
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                for (int i = recentURL.size() - 1; i >= 0 && i >= recentURL.size() - 5; i--){
                    sb.append(recentURL.get(i));
                    if (i != recentURL.size() - 5 && i != 0){
                        sb.append(", ");
                    }
                }
                sb.append("]");

                System.out.println(sb);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
