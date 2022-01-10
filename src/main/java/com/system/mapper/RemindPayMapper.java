package com.system.mapper;

import com.system.po.*;

import java.util.List;

public interface RemindPayMapper {
    int insert (RemindPay remindPay);
    int deleteByID(Integer id);
    void updateByID(Integer id, String username);

    List<LessRemind> selectAllByPay(PagingVO pagingVO);  //分页
    List<LessRemind> selectAllByPayAuth(PagingVO pagingVO);  //分页

    List<StuCustom> selectAllRemindPay();  //全部
    int countRemindPay();
    int countRemindPayAuth(String teacherName);
}
