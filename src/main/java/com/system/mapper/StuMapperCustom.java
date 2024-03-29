package com.system.mapper;

import com.system.po.LessonCustom;
import com.system.po.PagingVO;
import com.system.po.Stu;
import com.system.po.StuCustom;
import org.apache.ibatis.annotations.Param;


import java.util.Date;
import java.util.List;
import java.util.Map;

public interface StuMapperCustom {

    //根据姓名查找信息
    List<StuCustom> selectByName(String name) throws Exception;

    List<StuCustom> selectByNameAuth(String stuName, String teacherName) throws Exception;

    List<StuCustom> selectByLister(PagingVO pagingVO) throws Exception;

    List<StuCustom> selectByUpdater(PagingVO pagingVO) throws Exception;

    //分页显示检验查询（起始时间，终止时间，专业）
    List<StuCustom> selectByCheck(PagingVO pagingVO) throws Exception;

    //分页显示学生信息
    List<StuCustom> findByPaging(PagingVO pagingVO) throws Exception;

    //分页显示学生信息（根据年级排序）
    List<StuCustom> findByGrade(PagingVO pagingVO) throws Exception;

    List<StuCustom> selectByGrade(PagingVO pagingVO) throws Exception;

    List<StuCustom> selectByCampus(PagingVO pagingVO) throws Exception;

    //根据年级搜索全部的学生
    List<StuCustom> selectAllByGrade(Integer gradeid) throws Exception;
    List<StuCustom> selectAllByCampus(Integer campusid) throws Exception;

    StuCustom selectByPrimaryKey(Integer stuid);

    //搜索日期（分页）
    List<StuCustom> selectByDate(PagingVO pagingVO);

    //搜索日期（全部）
    List<StuCustom> selectAllByDate(Date startdate, Date enddate);

    //生日提醒（提前7天）
    List<StuCustom> selectByBirth();

    List<StuCustom> selectByFatherBirth();

    List<StuCustom> selectByMotherBirth();

    //搜索专业( 全部)
    List<StuCustom> selectAllByMajor(String majorName);

    //搜索专业（分页显示）
    List<StuCustom> selectByMajor(PagingVO pagingVO);

    //搜索学校(全部)
    List<StuCustom> selectAllBySchool(String schoolName);

    //搜索学校（分页显示）
    List<StuCustom> selectBySchool(PagingVO pagingVO);

    //缴费提醒(提前7天)
    List<StuCustom> selectByPay(PagingVO pagingVO);

    //缴费提醒(提前7天全部)
    List<StuCustom> selectAllByPay();

    ////////////////////////已缴费查看  按照lesson.lessonStart降序排序///////////////////////////////////

    //缴费学员(全部学科 全部类型 全部年级) 分页显示
    List<LessonCustom> selectByPayStu(PagingVO pagingVO);
    List<LessonCustom> selectByPayStuAuth(PagingVO pagingVO);

    //缴费学员(全部学科 全部类型 全部年级) 全部显示
    List<LessonCustom> selectAllByPayStu( Integer campusid);

    // 缴费学员1 （学科 类型）分页显示
    List<LessonCustom> selectPayStuBySubAndType(PagingVO pagingVO);
    List<LessonCustom> selectPayStuBySubAndTypeAuth(PagingVO pagingVO);

    // 缴费学员1 （学科 类型）全部显示
    List<LessonCustom> selectAllPayStuBySubAndType(PagingVO pagingVO);

    //缴费学员2 （年级 类型）分页显示
    List<LessonCustom> selectPayStuByGradeAndType(PagingVO pagingVO);

    //缴费学员2 （年级 类型）全部显示
    List<LessonCustom> selectAllPayStuByGradeAndType(PagingVO pagingVO);

    //缴费学员3 （年级 学科）分页显示
    List<LessonCustom> selectPayStuByGradeAndSub(PagingVO pagingVO);

    //缴费学员3 （年级 学科）全部显示
    List<LessonCustom> selectAllPayStuByGradeAndSub(PagingVO pagingVO);

    //缴费学员4 （年级）分页显示
    List<LessonCustom> selectPayStuByGrade(PagingVO pagingVO);

    //缴费学员4 （年级）全部显示
    List<LessonCustom> selectAllPayStuByGrade(PagingVO pagingVO);

    //缴费学员5 （学科）分页显示
    List<LessonCustom> selectPayStuBySub(PagingVO pagingVO);
    List<LessonCustom> selectPayStuBySubAuth(PagingVO pagingVO);

    //缴费学员5 （学科）全部显示
    List<LessonCustom> selectAllPayStuBySub(PagingVO pagingVO);

    //缴费学员6 （类型）分页显示
    List<LessonCustom> selectPayStuByType(PagingVO pagingVO);
    List<LessonCustom> selectPayStuByTypeAuth(PagingVO pagingVO);

    //缴费学员6 （类型）全部显示
    List<LessonCustom> selectAllPayStuByType(PagingVO pagingVO);

    //缴费学员7 （年级 学科 类型）分页显示
    List<LessonCustom> selectPayStuByGradeSubType(PagingVO pagingVO);

    //缴费学员7 （年级 学科 类型）全部显示
    List<LessonCustom> selectAllPayStuByGradeSubType(PagingVO pagingVO);


////////////////////////预缴费查看  按照lesson.lessonStart降序排序/////////////////////////////////////////////////////

    //预缴费学员(全部学科 全部类型 全部年级) 分页显示 //
    List<LessonCustom> selectByPrePayStu(PagingVO pagingVO);
    List<LessonCustom> selectByPrePayStuAuth(PagingVO pagingVO);

    List<LessonCustom> selectAllByPrePayStu(Integer campusid);

    // 预缴费学员1 （学科 类型）分页显示
    List<LessonCustom> selectPrePayStuBySubAndType(PagingVO pagingVO);
    List<LessonCustom> selectPrePayStuBySubAndTypeAuth(PagingVO pagingVO);

    // 预缴费学员1 （学科 类型）全部显示
    List<LessonCustom> selectAllPrePayStuBySubAndType(PagingVO pagingVO);

    //预缴费学员2 （年级 类型）分页显示
    List<LessonCustom> selectPrePayStuByGradeAndType(PagingVO pagingVO);

    //预缴费学员2 （年级 类型）全部显示
    List<LessonCustom> selectAllPrePayStuByGradeAndType(PagingVO pagingVO);

    //预缴费学员3 （年级 学科）分页显示
    List<LessonCustom> selectPrePayStuByGradeAndSub(PagingVO pagingVO);

    //预缴费学员3 （年级 学科）全部显示
    List<LessonCustom> selectAllPrePayStuByGradeAndSub(PagingVO pagingVO);

    //预缴费学员4 （年级）分页显示
    List<LessonCustom> selectPrePayStuByGrade(PagingVO pagingVO);

    //预缴费学员4 （年级）全部显示
    List<LessonCustom> selectAllPrePayStuByGrade(PagingVO pagingVO);

    //预缴费学员5 （学科）分页显示
    List<LessonCustom> selectPrePayStuBySub(PagingVO pagingVO);
    List<LessonCustom> selectPrePayStuBySubAuth(PagingVO pagingVO);

    //预缴费学员5 （学科）全部显示
    List<LessonCustom> selectAllPrePayStuBySub(PagingVO pagingVO);

    //缴费学员6 （类型）分页显示
    List<LessonCustom> selectPrePayStuByType(PagingVO pagingVO);
    List<LessonCustom> selectPrePayStuByTypeAuth(PagingVO pagingVO);

    //预缴费学员6 （类型）全部显示
    List<LessonCustom> selectAllPrePayStuByType(PagingVO pagingVO);

    //预缴费学员7 （年级 学科 类型）分页显示
    List<LessonCustom> selectPrePayStuByGradeSubType(PagingVO pagingVO);

    //预缴费学员7 （年级 学科 类型）全部显示
    List<LessonCustom> selectAllPrePayStuByGradeSubType(PagingVO pagingVO);

////////////////////////未缴费查看/////////////////////////////////////////////////////////

    //未缴费学员 （分页 //全部 全部）
    List<StuCustom> selectByUnPayStu(PagingVO pagingVO);
    List<StuCustom> selectByUnPayStuAuth(PagingVO pagingVO);

    //全部未缴费学员  （不分页 //全部 全部）
    List<StuCustom> selectAllByUnPayStu(Integer campusid);

    //分页 全部 有电话
    List<StuCustom> selectByUnPayStuTel(PagingVO pagingVO);
    List<StuCustom> selectByUnPayStuTelAuth(PagingVO pagingVO);

    //不分页 全部 有电话
    List<StuCustom> selectAllByUnPayStuTel(Integer campusid);

    //分页 全部 无电话
    List<StuCustom> selectByUnPayStuNoTel(PagingVO pagingVO);
    List<StuCustom> selectByUnPayStuNoTelAuth(PagingVO pagingVO);
    //不分页 全部 无有电话
    List<StuCustom> selectAllByUnPayStuNoTel(Integer campusid);

    //未缴费学生（分页，分年级  全部）
    List<StuCustom> selectUnPayStuByGrade(PagingVO pagingVO);

    //未缴费学生（全部，分年级  全部）
    List<StuCustom> selectAllUnPayStuByGrade(Integer gradeid, Integer campusid);

    //分页 分年级 有电话
    List<StuCustom> selectUnPayStuByGradeTel(PagingVO pagingVO);

    //不分页 分年级 有电话
    List<StuCustom> selectAllUnPayStuByGradeTel(Integer gradeid, Integer campusid);

    //分页 分年级 没有电话
    List<StuCustom> selectUnPayStuByGradeNoTel(PagingVO pagingVO);

    //不分页 分年级 没有电话
    List<StuCustom> selectAllUnPayStuByGradeNoTel(Integer gradeid, Integer campusid);


//////////////////////////////////////////////////////
    //搜索优秀的学生(分页显示)
    List<StuCustom> selectOutstandStu(PagingVO pagingVO);

    //搜索全部的优秀学生
    List<StuCustom> selectAllOutstandStu();

    /////////////////////////////////////////////////////负责人新录入信息提醒//////////////////////////////////////////
    //负责人新录入信息提醒  <!--新录入信息，根据年纪，已经缴费-->
    List<StuCustom> selectLeaderReceiveByGradePay(PagingVO pagingVO);

    //负责人新录入信息提醒  <!--新录入信息，根据年纪，没有缴费-->
    List<StuCustom> selectLeaderReceiveByGradeUnPay(PagingVO pagingVO);

    //负责人新录入信息提醒  <!--新录入信息，根据年纪，缴费和未交费-->
    List<StuCustom> selectLeaderReceiveByGrade(PagingVO pagingVO);

    /////////////////////////////////////////////////////校长新录入信息提醒//////////////////////////////////////////
    //校长新录入信息提醒  <!--新录入信息，根据年纪，已经缴费-->
    List<StuCustom> selectMasterReceiveByGradePay(PagingVO pagingVO);

    //校长新录入信息提醒  <!--新录入信息，根据年纪，没有缴费-->
    List<StuCustom> selectMasterReceiveByGradeUnPay(PagingVO pagingVO);

    //校长新录入信息提醒  <!--新录入信息，根据年纪，缴费和未交费-->
    List<StuCustom> selectMasterReceiveByGrade(PagingVO pagingVO);

    /////////////////////////////////////////////////////负责人更新信息提醒//////////////////////////////////////////
    //负责人更新信息提醒  <!--更新信息，根据年纪，已经缴费-->
    List<StuCustom> selectLeaderUpdateByGradePay(PagingVO pagingVO);

    //负责人更新信息提醒  <!--更新信息，根据年纪，没有缴费-->
    List<StuCustom> selectLeaderUpdateByGradeUnPay(PagingVO pagingVO);

    //负责人更新信息提醒  <!--更新信息，根据年纪，缴费和未交费-->
    List<StuCustom> selectLeaderUpdateByGrade(PagingVO pagingVO);

    /////////////////////////////////////////////////////校长更新信息提醒//////////////////////////////////////////
    //校长更新信息提醒  <!--更新信息，根据年纪，已经缴费-->
    List<StuCustom> selectMasterUpdateByGradePay(PagingVO pagingVO);

    //校长更新信息提醒  <!--更新信息，根据年纪，没有缴费-->
    List<StuCustom> selectMasterUpdateByGradeUnPay(PagingVO pagingVO);

    //校长更新信息提醒  <!--更新信息，根据年纪，缴费和未交费-->
    List<StuCustom> selectMasterUpdateByGrade(PagingVO pagingVO);


    /////////////////////////////////////////////////////管理员录入信息提醒//////////////////////////////////////////
    List<StuCustom> selectAdminReceive(PagingVO pagingVO);
    List<StuCustom> selectAdminReceiveUnsign(PagingVO pagingVO);
    /////////////////////////////////////////////////////管理员更新信息提醒//////////////////////////////////////////
    List<StuCustom> selectAdminUpdate(PagingVO pagingVO);
    List<StuCustom> selectAdminUpdateUnsign(PagingVO pagingVO);

    //选出姓名相同的信息
    List<StuCustom> selectSameName(PagingVO pagingVO);
}
