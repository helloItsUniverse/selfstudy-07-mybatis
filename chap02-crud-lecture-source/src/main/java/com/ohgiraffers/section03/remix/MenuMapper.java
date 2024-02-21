package com.ohgiraffers.section03.remix;

import java.util.List;

/* 설명. DAO 이자 쿼리이자 ... 암튼 좋은 거임 ㅎ */
public interface MenuMapper {
    List<MenuDTO> selectAllMenus();

    MenuDTO selectMenu(int menuCode);

    int insertMenu(MenuDTO menu);

    int updateMenu(MenuDTO menu);

    int deleteMenu(int menuCode);
}
