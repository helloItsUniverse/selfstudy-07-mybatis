package com.ohgiraffers.section01.xmlconfig;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do {
            System.out.println("================ 메뉴 관리 ================");
            System.out.println("1. 메뉴 전체 조회");
            System.out.println("2. 메뉴 코드로 메뉴 조회");
            System.out.println("3. 신규 메뉴 추가");
            System.out.println("4. 메뉴 수정");
            System.out.println("5. 메뉴 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 관리 번호를 입력하세요: ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    menuController.findAllMenus();  // 사용자가 get 요청을 보내고 이러한 핸들러 메소드가 요청됐구나~
                    break;
                case 2:
                    menuController.findMenuByMenuCode(inputMenuCode());
                    break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 메뉴를 입력하셨습니다.");
            }
        } while (true);
    }


    /* 설명. 사용자의 입력값을 Map 형태로 반환(web 에서는 key 와 value 형태로 request 객체에 담기는 parameter 로 생각) */
    private static Map<String, String> inputMenuCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("\n메뉴 코드를 입력하세요: ");
        String menuCode = sc.nextLine();        // web 에서 parameter 들은 실제로 모두 String 형이므로 여기서도.

        Map<String, String> parameter = new HashMap<>();
        parameter.put("menuCode", menuCode);

        return parameter;
    }
}
