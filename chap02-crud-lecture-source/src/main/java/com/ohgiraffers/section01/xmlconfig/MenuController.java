package com.ohgiraffers.section01.xmlconfig;

import java.util.List;
import java.util.Map;

public class MenuController {

    private final MenuService menuService;  // 아주 강한 간결함, 강결합: 무조건 컨트롤러에게 주입을 받아야한다.
    private final PrintResult printResult;      // 결과 페이지에 해당하는 (View 개념) 클래스

    public MenuController() {
        menuService = new MenuService();
        printResult = new PrintResult();
    }

    public void findAllMenus() {

        List<MenuDTO> menuList = menuService.findAllMenus();

        if (!menuList.isEmpty()) {
            printResult.printMenus(menuList);
        } else {
            printResult.printErrorMessage("\n텅~ 조회할 메뉴가 없습니다.\n");
        }
    }

    public void findMenuByMenuCode(Map<String, String> parameter) {

        int menuCode = Integer.valueOf(parameter.get("menuCode"));

        MenuDTO menu = menuService.findMenuByMenuCode(menuCode);

        if (menu != null) {
            printResult.printMenu(menu);
        } else {
            printResult.printErrorMessage(menuCode + "번의 메뉴는 없습니다.");
        }
    }
}
