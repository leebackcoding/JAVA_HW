package com.changyoun.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Application6 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> phones = new HashMap<>();

        while (true) {
            String[] str = null;
            try {
                System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
                str = br.readLine().split("\\s+");
                if (str.length == 1) {
                    if (str[0].equals("search")) {
                        System.out.print("검색할 이름 : ");
                        String searchName = br.readLine();
                        if (phones.containsKey(searchName)) {
                            System.out.println(searchName + "씨의 전화번호 : " +  phones.get(searchName));
                        } else {
                            System.out.println(searchName + "씨의 번호는 등록 되어 있지 않습니다.");
                        }
                    } else if (str[0].equals("exit")) {
                        break;
                    } else {
                        System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                    }
                } else {
                    phones.put(str[0], str[1]);
                    System.out.println("추가 완료 : " + str[0] + " " + str[1]);
                }


            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
