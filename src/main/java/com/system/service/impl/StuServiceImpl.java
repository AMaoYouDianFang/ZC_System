package com.system.service.impl;

import com.system.mapper.StuMapper;
import com.system.mapper.StuMapperCustom;
import com.system.po.*;
import com.system.service.StuService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StuServiceImpl implements StuService {

    @Autowired
    private StuMapper stuMapper;

    @Autowired
    private StuMapperCustom stuMapperCustom;

    public void checkUpdatePerson(Integer stuid) throws Exception {
        //若录入人为空，更新录入人

        if (stuMapper.selectRecordPersonByIndex(stuid).equals("")) {
            Subject subject = SecurityUtils.getSubject();
            String username = (String) subject.getPrincipal();
            stuMapper.updateRecordPersonByIndex(stuid,username);
        }
    }

    public void save(Stu stu) throws Exception {


       /* stu.setAddresshis("");
        stu.setMothercompanyhis("");
        stu.setMotherjobhis("");
        stu.setFathercompanyhis("");
        stu.setFatherjobhis("");
        stu.setMasternamehis("");
        stu.setMastertelhis("");
        stu.setSchoolhis("");*/


       // stu.s
        if (stu.getSchooltext()!="")
            stu.setSchooltext(stu.getSchooltext()+"\n");
        if (stu.getFamilytext()!="")
            stu.setFamilytext(stu.getFamilytext()+"\n");
        if (stu.getStudytext()!="")
            stu.setStudytext(stu.getStudytext()+"\n");
        if (stu.getEducationtext()!="")
            stu.setEducationtext(stu.getEducationtext()+"\n");
        if (stu.getSupporttext()!="")
            stu.setSupporttext(stu.getSupporttext()+"\n");
        if (stu.getImprovetext()!="")
            stu.setImprovetext(stu.getImprovetext()+"\n");


        stuMapper.insert(stu);

    }

    public void update(Stu stu) throws  Exception{
        stuMapper.updateByStuID(stu);
    }

    public StuCustom findById(Integer id) throws Exception {

        StuCustom stuCustom = stuMapperCustom.selectByPrimaryKey(id);

        return stuCustom;
    }

    //添加姓名
    public void addStuNameByID (Integer id, String str) throws Exception{
        checkUpdatePerson(id);
        stuMapper.addStuNameByPrimaryKey(id, str);
    }
    //添加生日
    public void addStuBirthByID(Integer id, Date date, String str) throws Exception{
        checkUpdatePerson(id);
        stuMapper.addStuBirthByPrimaryKey(id, date, str);
    }

    public void addFatherBirthByID(Integer id, Date date, String str) throws Exception{
        checkUpdatePerson(id);
        stuMapper.addFatherBirthByPrimaryKey(id, date, str);
    }

    public void addMotherBirthByID(Integer id, Date date, String str) throws Exception{
        checkUpdatePerson(id);
        stuMapper.addMotherBirthByPrimaryKey(id, date, str);
    }
    //添加专业
    public void addMajorByID(Integer id, String str) throws Exception{
        checkUpdatePerson(id);
        stuMapper.addMajorByPrimaryKey(id, str);
    }
    //添加学校
    public void addSchoolByID(Integer id, String school) throws Exception {
        checkUpdatePerson(id);
        stuMapper.addSchoolByPrimaryKey(id, school);
    }
    //学生电话
    public void addStuTelByID(Integer id, String str) throws Exception{
        checkUpdatePerson(id);
        stuMapper.addStuTelByPrimaryKey(id, str);
    }
    //母亲姓名
    public void addMotherNameByID(Integer id, String str) throws Exception{
        checkUpdatePerson(id);
        stuMapper.addMotherNameByPrimaryKey(id, str);
    }
    //母亲公司
    public void addMoCompanyByID(Integer id, String str) throws Exception {
        checkUpdatePerson(id);
        stuMapper.addMoCompanyByPrimaryKey(id, str);
    }
    //母亲职位
    public void addMoJobByID(Integer id, String str) throws Exception {
        checkUpdatePerson(id);
        stuMapper.addMoJobByPrimaryKey(id, str);
    }
    //母亲电话
    public void addMoTelByID(Integer id, String str) throws Exception{
        checkUpdatePerson(id);
        stuMapper.addMoTelByPrimaryKey(id, str);
    }
    //父亲姓名
    public void addFaNameByID(Integer id, String str) throws Exception{
        checkUpdatePerson(id);
        stuMapper.addFaNameByPrimaryKey(id, str);
    }
    //父亲公司
    public void addFaCompanyByID(Integer id, String str) throws Exception {
        checkUpdatePerson(id);
        stuMapper.addFaCompanyByPrimaryKey(id, str);
    }
    //父亲职位
    public void addFaJobByID(Integer id, String str) throws Exception {
        checkUpdatePerson(id);
        stuMapper.addFaJobByPrimaryKey(id, str);
    }
    //父亲电话
    public void addFaTelByID(Integer id, String str) throws Exception{
        checkUpdatePerson(id);
        stuMapper.addFaTelByPrimaryKey(id, str);
    }
    //家庭地址
    public void addAddressByID(Integer id, String str) throws Exception {
        checkUpdatePerson(id);
        stuMapper.addAddressByPrimaryKey(id, str);
    }
    //教师
    public void addMasterByID(Integer id, String str) throws Exception {
        checkUpdatePerson(id);
        stuMapper.addMasterByPrimaryKey(id, str);
    }
    //教师电话
    public void addMasterTelByID(Integer id, String str) throws Exception {
        checkUpdatePerson(id);
        stuMapper.addMasterTelByPrimaryKey(id, str);
    }

    public void addSchoolTextByID(Integer id, String str) throws Exception {
        checkUpdatePerson(id);
        stuMapper.addSchoolTextByPrimaryKey(id, str);
    }

    public void addFamilyTextByID(Integer id, String str) throws Exception {
        checkUpdatePerson(id);
        stuMapper.addFamilyTextByPrimaryKey(id, str);
    }

    public void addStudyTextByID(Integer id, String str) throws Exception {
        checkUpdatePerson(id);
        stuMapper.addStudyTextByPrimaryKey(id, str);
    }

    public void addEducationTextByID(Integer id, String str) throws Exception {
        checkUpdatePerson(id);
        stuMapper.addEducationTextByPrimaryKey(id, str);
    }

    public void addSupportTextByID(Integer id, String str) throws Exception {
        checkUpdatePerson(id);
        stuMapper.addSupportTextByPrimaryKey(id, str);

    }

    public Date getBirthByID(Integer id) throws Exception {
        return stuMapper.selectBirthByPrimaryKey(id);
    }

    public Date getMoBirthByID(Integer id) throws Exception {
        return stuMapper.selectMoBirthByPrimaryKey(id);
    }

    public Date getFaBirthByID(Integer id) throws Exception {
        return stuMapper.selectFaBirthByPrimaryKey(id);
    }


    public Date getMasterBirthByID(Integer id) throws Exception{
        return stuMapper.selectMasterBirthByPrimaryKey(id);
    }

    public Date getCheckDateByID(Integer id) throws Exception{
        return stuMapper.selectCheckDateByPrimaryKey(id);
    }

    public void addImproveTextByID(Integer id, String str) throws Exception {
        checkUpdatePerson(id);
        stuMapper.addImproveTextByPrimaryKey(id, str);
    }

    public void addMotherDegreeByID (Integer id, String str) throws Exception{
        checkUpdatePerson(id);
        stuMapper.addMoDegreeByPrimaryKey(id,str);
    }

    public void addFatherDegreeByID (Integer id, String str) throws Exception{
        checkUpdatePerson(id);
        stuMapper.addFaDegreeByPrimaryKey(id,str);
    }

    public void addStuSexByID(Integer id, String str) throws Exception{
        checkUpdatePerson(id);
        stuMapper.addStuSexByPrimaryKey(id, str);
    }

    public void addMasterAddressByID(Integer id, String str) throws Exception{
        checkUpdatePerson(id);
        stuMapper.addMasterAddressByPrimaryKey(id, str);
    }

    public void addMasterDegreeByID(Integer id, String str) throws Exception{
        checkUpdatePerson(id);
        stuMapper.addMasterDegreeByPrimaryKey(id, str);
    }

    public void addMasterSexByID(Integer id, String str) throws Exception{
        checkUpdatePerson(id);
        stuMapper.addMasterSexByPrimaryKey(id, str);
    }

    public void addMasterBirthByID(Integer stuid, Date date, String str) throws Exception{
        checkUpdatePerson(stuid);
        stuMapper.addMasterBirthByPrimaryKey(stuid,date,str);
    }

    public void addCheckDateByID(Integer stuid, Date date, String str) throws Exception{
        checkUpdatePerson(stuid);
        stuMapper.addCheckDateByPrimaryKey(stuid,date,str);
    }

    public List<StuCustom> findByPaging(Integer toPageNo) throws Exception {
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);

        List<StuCustom> list =stuMapperCustom.findByPaging(pagingVO);

        return list;
    }


    public List<StuCustom> findOrderByGrade(Integer toPageNo) throws Exception {

        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        List<StuCustom> list = stuMapperCustom.findByGrade(pagingVO);

        return list;
    }


    public List<StuCustom> findByName(String name) throws Exception {

        List<StuCustom> list = stuMapperCustom.selectByName(name);

        return list;
    }

    public List<StuCustom> findByNameAuth(String stuName, String teacherName) throws Exception {

        List<StuCustom> list = stuMapperCustom.selectByNameAuth(stuName, teacherName);

        return list;
    }


    public int getCountStudent() throws Exception {

        return stuMapper.countStu();
    }

    public int getCountByGrade(Integer gradeid) throws Exception {

        return stuMapper.countStuByGrade(gradeid);
    }

    public int getCountByCampus(Integer campusid) throws Exception {

        return stuMapper.countStuByCampus(campusid);
    }

    public int getCountByBirth() throws Exception {

        return stuMapper.countStuByBirth();
    }

    public int getCountByPayStu(Integer campusid) throws Exception {

        return stuMapper.countStuByPayStu(campusid);
    }

    //统计未缴费学生人数
    public int getCountByUnPayStu(Integer gradeid, Integer teleType, Integer campusid) throws Exception {

        if(gradeid==-1 && teleType==0){  //全部 全部
            return stuMapper.countStuByUnPayStu(campusid);
        }
        else if(gradeid==-1 && teleType==1) { //全部 有电话
           return stuMapper.countStuByUnPayStuTel(campusid);
        }
        else if(gradeid==-1 && teleType==2){  //全部 没有电弧
            return stuMapper.countStuByUnPayStuNoTel(campusid);
        }
        else if (gradeid!=-1 && teleType==0){ //分年级 全部

            return stuMapper.countUnPayStuByGrade(gradeid, campusid);

        }
        else if(gradeid!=-1 && teleType==1){ //分年级 有电话
            return stuMapper.countUnPayStuByGradeTel(gradeid, campusid);
        }
        else if (gradeid!=-1 && teleType==2) //分年级 没有电话

        {
            return stuMapper.countUnPayStuByGradeNoTel(gradeid, campusid);
        }
        else {
            return 0;
        }
    }

    public int getCountByUnPayStuAuth(Integer gradeid, Integer teleType, Integer campusid, String name) throws Exception {

        if(gradeid==-1 && teleType==0){  //全部 全部
            return stuMapper.countStuByUnPayStuAuth(campusid, name);
        }
        else if(gradeid==-1 && teleType==1) { //全部 有电话
            return stuMapper.countStuByUnPayStuTelAuth(campusid,name);
        }
        else if(gradeid==-1 && teleType==2){  //全部 没有电话
            return stuMapper.countStuByUnPayStuNoTelAuth(campusid, name);
        }
        else if (gradeid!=-1 && teleType==0){ //分年级 全部

            return stuMapper.countUnPayStuByGrade(gradeid, campusid);

        }
        else if(gradeid!=-1 && teleType==1){ //分年级 有电话
            return stuMapper.countUnPayStuByGradeTel(gradeid, campusid);
        }
        else if (gradeid!=-1 && teleType==2) //分年级 没有电话

        {
            return stuMapper.countUnPayStuByGradeNoTel(gradeid, campusid);
        }
        else {
            return 0;
        }
    }

    public int getCountByPay() throws Exception {

        return stuMapper.countStuByPay();
    }

    public int getCountByPayAndGrade(Integer gradeid) throws Exception {

        return stuMapper.countStuByPayAndGrade(gradeid);
    }

    public int getCountBySchool(String schoolName) throws Exception{
        return stuMapper.countStuBySchool(schoolName);

    }

    public int getCountByMajor(String majorName) throws Exception{
        return stuMapper.countStuByMajor(majorName);
    }

    public int getCountBySameStu() throws Exception{
        return stuMapper.countStuBySameName();
    }

    public List<StuCustom> findStuByGrade(Integer toPageNo, Integer gradeid) throws Exception{

        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        pagingVO.setIntergertemp(gradeid);
        return stuMapperCustom.selectByGrade(pagingVO);
    }

    public List<StuCustom> findStuByCampus(Integer toPageNo, Integer campusid) throws Exception{

        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        pagingVO.setIntergertemp(campusid);
        return stuMapperCustom.selectByCampus(pagingVO);
    }

    public List<StuCustom> findAllStuByGrade(Integer gradeid) throws Exception{


        return stuMapperCustom.selectAllByGrade(gradeid);
    }

    public List<StuCustom> findAllStuByCampus(Integer campusid) throws Exception{


        return stuMapperCustom.selectAllByCampus(campusid);
    }


    public int getCountByDate(Date startdate, Date enddate) throws Exception {

        return stuMapper.countStuByDate(startdate,enddate);
    }

    public List<StuCustom> findStuByDate(Integer toPageNo, Date startdate, Date enddate) throws Exception{

        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        pagingVO.setStartdate(startdate);
        pagingVO.setEnddate(enddate);
        return stuMapperCustom.selectByDate(pagingVO);
    }

    public List<StuCustom> findAllStuByDate(Date startdate, Date enddate) throws Exception{

        return stuMapperCustom.selectAllByDate(startdate,enddate);
    }

    public List<StuCustom> findStuByBirth( ) throws Exception{

        return stuMapperCustom.selectByBirth();
    }

    public List<StuCustom> findStuByFaBirth() throws Exception{

        return stuMapperCustom.selectByFatherBirth();
    }

    public List<StuCustom> findStuByMoBirth() throws Exception{

        return stuMapperCustom.selectByMotherBirth();
    }

    public List<StuCustom> findAllStuByMajor( String majorName) throws Exception{
        return stuMapperCustom.selectAllByMajor(majorName);
    }

    public List<StuCustom> findStuByMajor(Integer toPageNo, String majorName) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        pagingVO.setStringtemp(majorName);
        return stuMapperCustom.selectByMajor(pagingVO);
    }

    public List<StuCustom> findAllStuBySchool(String schoolName) throws Exception{
        return stuMapperCustom.selectAllBySchool(schoolName);
    }

    public List<StuCustom> findStuBySchool(Integer toPageNo, String schoolName) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        pagingVO.setStringtemp(schoolName);
        return stuMapperCustom.selectBySchool(pagingVO);
    }

    public List<StuCustom> findStuBySameName (Integer toPageNo) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        return stuMapperCustom.selectSameName(pagingVO);
    }
    public List<StuCustom> findStuByPay(Integer toPageNo) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        return stuMapperCustom.selectByPay(pagingVO);
    }


    public List<StuCustom> findAllStuByPay( ) throws Exception{

        return stuMapperCustom.selectAllByPay();
    }


    //根据选项分页查找已经缴费的学生
    public List<LessonCustom> findStuByPayStuAndSelect(Integer toPageNo, Integer gradeid, Integer subjectid, Integer typeid, Integer campusid) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        //pagingVO.setIntergertemp(gradeid);
        if(gradeid==-1 && subjectid !=-1 && typeid!=-1) {    //学科 类型 完成
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPayStuBySubAndType(pagingVO);

        }
        else if (gradeid!=-1 && subjectid ==-1 && typeid!=-1){    //年级 类型 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPayStuByGradeAndType(pagingVO);
        }
        else if(gradeid!=-1 && subjectid !=-1 && typeid==-1){ //年级 学科 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPayStuByGradeAndSub(pagingVO);
        }
        else if(gradeid!=-1 && subjectid ==-1 && typeid==-1){  //年级 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPayStuByGrade(pagingVO);

        }
        else if(gradeid==-1 && subjectid !=-1 && typeid==-1){  //学科 完成
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPayStuBySub(pagingVO);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid!=-1){  //类型 完成
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPayStuByType(pagingVO);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid==-1){  //全部 完成
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectByPayStu(pagingVO);
        }
        else {  //学科 类型 类型 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPayStuByGradeSubType(pagingVO);
        }
    }

    public List<LessonCustom> findStuByPayStuAndSelectAuth(Integer toPageNo, Integer gradeid, Integer subjectid, Integer typeid, Integer campusid, String name) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);

        if(gradeid==-1 && subjectid !=-1 && typeid!=-1) {    //学科 类型  完成
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            pagingVO.setStringtemp(name);
            return stuMapperCustom.selectPayStuBySubAndTypeAuth(pagingVO);

        }
        else if (gradeid!=-1 && subjectid ==-1 && typeid!=-1){    //年级 类型 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPayStuByGradeAndType(pagingVO);
        }
        else if(gradeid!=-1 && subjectid !=-1 && typeid==-1){ //年级 学科 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPayStuByGradeAndSub(pagingVO);
        }
        else if(gradeid!=-1 && subjectid ==-1 && typeid==-1){  //年级 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPayStuByGrade(pagingVO);

        }
        else if(gradeid==-1 && subjectid !=-1 && typeid==-1){  //学科 完成
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerfour(campusid);
            pagingVO.setStringtemp(name);
            return stuMapperCustom.selectPayStuBySubAuth(pagingVO);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid!=-1){  //类型 完成
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            pagingVO.setStringtemp(name);
            return stuMapperCustom.selectPayStuByTypeAuth(pagingVO);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid==-1){  //全部 完成
            pagingVO.setIntergerfour(campusid);
            pagingVO.setStringtemp(name);
            return stuMapperCustom.selectByPayStuAuth(pagingVO);
        }
        else {  //学科 类型 类型 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPayStuByGradeSubType(pagingVO);
        }
    }

    //根据选项全部查找已经缴费的学生
    public List<LessonCustom> findAllStuByPayStuAndSelect(Integer gradeid, Integer subjectid, Integer typeid, Integer campusid) throws Exception{
        PagingVO pagingVO = new PagingVO();
        if(gradeid==-1 && subjectid !=-1 && typeid!=-1) {    //学科 类型 完成
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectAllPayStuBySubAndType(pagingVO);

        }
        else if (gradeid!=-1 && subjectid ==-1 && typeid!=-1){    //年级 类型 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectAllPayStuByGradeAndType(pagingVO);
        }
        else if(gradeid!=-1 && subjectid !=-1 && typeid==-1){ //年级 学科 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectAllPayStuByGradeAndSub(pagingVO);
        }
        else if(gradeid!=-1 && subjectid ==-1 && typeid==-1){  //年级 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectAllPayStuByGrade(pagingVO);

        }
        else if(gradeid==-1 && subjectid !=-1 && typeid==-1){  //学科 完成
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectAllPayStuBySub(pagingVO);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid!=-1){  //类型 完成
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectAllPayStuByType(pagingVO);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid==-1){  //全部 和其他的不一样 完成
            return stuMapperCustom.selectAllByPayStu(campusid);
        }
        else {  //学科 类型 类型
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectAllPayStuByGradeSubType(pagingVO);
        }
    }


    public int countPayStuBySelect(Integer gradeid, Integer subjectid, Integer typeid, Integer campusid) throws  Exception{
        if(gradeid==-1 && subjectid !=-1 && typeid!=-1) {    //学科 类型
            return stuMapper.countPayBySubAndType(subjectid, typeid, campusid);
        }
        else if (gradeid!=-1 && subjectid ==-1 && typeid!=-1){    //年级 类型
            return stuMapper.countPayByGradeAndType(gradeid,typeid, campusid);
        }
        else if(gradeid!=-1 && subjectid !=-1 && typeid==-1){ //年级 学科
            return stuMapper.countPayByGradeAndSub(gradeid,subjectid, campusid);
        }
        else if(gradeid!=-1 && subjectid ==-1 && typeid==-1){  //年级
            return stuMapper.countPayByGrade(gradeid, campusid);
        }
        else if(gradeid==-1 && subjectid !=-1 && typeid==-1){  //学科
            return stuMapper.countPayBySub(subjectid, campusid);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid!=-1){  //类型
            return stuMapper.countPayByType(typeid, campusid);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid==-1){  //全部
            return stuMapper.countStuByPayStu(campusid);
        }
        else {  //学科 类型 类型
            return stuMapper.countPayByGradeSubType(gradeid,subjectid,typeid, campusid);
        }
    }

    public int countPayStuBySelectAuth(Integer gradeid, Integer subjectid, Integer typeid, Integer campusid, String name) throws  Exception{
        if(gradeid==-1 && subjectid !=-1 && typeid!=-1) {    //学科 类型 完成
            return stuMapper.countPayBySubAndTypeAuth(subjectid, typeid, campusid, name);
        }
        else if (gradeid!=-1 && subjectid ==-1 && typeid!=-1){    //年级 类型 完成
            return stuMapper.countPayByGradeAndType(gradeid,typeid, campusid);
        }
        else if(gradeid!=-1 && subjectid !=-1 && typeid==-1){ //年级 学科 完成
            return stuMapper.countPayByGradeAndSub(gradeid,subjectid, campusid);
        }
        else if(gradeid!=-1 && subjectid ==-1 && typeid==-1){  //年级 完成
            return stuMapper.countPayByGrade(gradeid, campusid);
        }
        else if(gradeid==-1 && subjectid !=-1 && typeid==-1){  //学科 完成
            return stuMapper.countPayBySubAuth(subjectid, campusid, name);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid!=-1){  //类型 完成
            return stuMapper.countPayByTypeAuth(typeid, campusid, name);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid==-1){  //全部 完成
            return stuMapper.countStuByPayStuAuth(campusid, name);
        }
        else {  //学科 类型 类型 完成
            return stuMapper.countPayByGradeSubType(gradeid,subjectid,typeid, campusid);
        }
    }


    //根据选项分页查找预缴费的学生
    public List<LessonCustom> findStuByPrePayStuAndSelect(Integer toPageNo, Integer gradeid, Integer subjectid, Integer typeid, Integer campusid) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        //pagingVO.setIntergertemp(gradeid);
        if(gradeid==-1 && subjectid !=-1 && typeid!=-1) {    //学科 类型 完成
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPrePayStuBySubAndType(pagingVO);

        }
        else if (gradeid!=-1 && subjectid ==-1 && typeid!=-1){    //年级 类型 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPrePayStuByGradeAndType(pagingVO);
        }
        else if(gradeid!=-1 && subjectid !=-1 && typeid==-1){ //年级 学科 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPrePayStuByGradeAndSub(pagingVO);
        }
        else if(gradeid!=-1 && subjectid ==-1 && typeid==-1){  //年级 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPrePayStuByGrade(pagingVO);

        }
        else if(gradeid==-1 && subjectid !=-1 && typeid==-1){  //学科 完成
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPrePayStuBySub(pagingVO);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid!=-1){  //类型 完成
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPrePayStuByType(pagingVO);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid==-1){  //全部 完成
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectByPrePayStu(pagingVO);
        }
        else {  //学科 类型 类型 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPrePayStuByGradeSubType(pagingVO);
        }
    }

    public List<LessonCustom> findStuByPrePayStuAndSelectAuth(Integer toPageNo, Integer gradeid, Integer subjectid, Integer typeid, Integer campusid, String name) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        //pagingVO.setIntergertemp(gradeid);
        if(gradeid==-1 && subjectid !=-1 && typeid!=-1) {    //学科 类型 完成
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            pagingVO.setStringtemp(name);
            return stuMapperCustom.selectPrePayStuBySubAndTypeAuth(pagingVO);

        }
        else if (gradeid!=-1 && subjectid ==-1 && typeid!=-1){    //年级 类型 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPrePayStuByGradeAndType(pagingVO);
        }
        else if(gradeid!=-1 && subjectid !=-1 && typeid==-1){ //年级 学科 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPrePayStuByGradeAndSub(pagingVO);
        }
        else if(gradeid!=-1 && subjectid ==-1 && typeid==-1){  //年级 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPrePayStuByGrade(pagingVO);

        }
        else if(gradeid==-1 && subjectid !=-1 && typeid==-1){  //学科 完成
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerfour(campusid);
            pagingVO.setStringtemp(name);
            return stuMapperCustom.selectPrePayStuBySubAuth(pagingVO);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid!=-1){  //类型 完成
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            pagingVO.setStringtemp(name);
            return stuMapperCustom.selectPrePayStuByTypeAuth(pagingVO);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid==-1){  //全部 完成
            pagingVO.setIntergerfour(campusid);
            pagingVO.setStringtemp(name);
            return stuMapperCustom.selectByPrePayStuAuth(pagingVO);
        }
        else {  //学科 类型 类型 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectPrePayStuByGradeSubType(pagingVO);
        }
    }

    //根据选项全部查找预缴费的学生
    public List<LessonCustom> findAllStuByPrePayStuAndSelect(Integer gradeid, Integer subjectid, Integer typeid, Integer campusid) throws Exception{
        PagingVO pagingVO = new PagingVO();
        if(gradeid==-1 && subjectid !=-1 && typeid!=-1) {    //学科 类型 完成
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectAllPrePayStuBySubAndType(pagingVO);

        }
        else if (gradeid!=-1 && subjectid ==-1 && typeid!=-1){    //年级 类型 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectAllPrePayStuByGradeAndType(pagingVO);
        }
        else if(gradeid!=-1 && subjectid !=-1 && typeid==-1){ //年级 学科 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectAllPrePayStuByGradeAndSub(pagingVO);
        }
        else if(gradeid!=-1 && subjectid ==-1 && typeid==-1){  //年级 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectAllPrePayStuByGrade(pagingVO);

        }
        else if(gradeid==-1 && subjectid !=-1 && typeid==-1){  //学科 完成
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectAllPrePayStuBySub(pagingVO);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid!=-1){  //类型  完成
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectAllPrePayStuByType(pagingVO);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid==-1){  //全部  完成

            return stuMapperCustom.selectAllByPrePayStu(campusid);
        }
        else {  //学科 类型 类型 完成
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergertwo(subjectid);
            pagingVO.setIntergerthree(typeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectAllPrePayStuByGradeSubType(pagingVO);
        }
    }


    public int countPrePayStuBySelect(Integer gradeid, Integer subjectid, Integer typeid, Integer campusid) throws  Exception{
        if(gradeid==-1 && subjectid !=-1 && typeid!=-1) {    //学科 类型 完成
            return stuMapper.countPrePayBySubAndType(subjectid, typeid, campusid);
        }
        else if (gradeid!=-1 && subjectid ==-1 && typeid!=-1){    //年级 类型 完成
            return stuMapper.countPrePayByGradeAndType(gradeid,typeid, campusid);
        }
        else if(gradeid!=-1 && subjectid !=-1 && typeid==-1){ //年级 学科 完成
            return stuMapper.countPrePayByGradeAndSub(gradeid,subjectid, campusid);
        }
        else if(gradeid!=-1 && subjectid ==-1 && typeid==-1){  //年级 完成
            return stuMapper.countPrePayByGrade(gradeid, campusid);
        }
        else if(gradeid==-1 && subjectid !=-1 && typeid==-1){  //学科  完成
            return stuMapper.countPrePayBySub(subjectid, campusid);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid!=-1){  //类型  完成
            return stuMapper.countPrePayByType(typeid, campusid);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid==-1){  //全部  完成
            return stuMapper.countPreStuByPayStu(campusid);
        }
        else {  //学科 类型 类型 完成
            return stuMapper.countPrePayByGradeSubType(gradeid,subjectid,typeid, campusid);
        }
    }

    public int countPrePayStuBySelectAuth(Integer gradeid, Integer subjectid, Integer typeid, Integer campusid, String name) throws  Exception{

        if(gradeid==-1 && subjectid !=-1 && typeid!=-1) {    //学科 类型 完成
            return stuMapper.countPrePayBySubAndTypeAuth(subjectid, typeid, campusid, name);
        }
        else if (gradeid!=-1 && subjectid ==-1 && typeid!=-1){    //年级 类型 完成
            return stuMapper.countPrePayByGradeAndType(gradeid,typeid, campusid);
        }
        else if(gradeid!=-1 && subjectid !=-1 && typeid==-1){ //年级 学科 完成
            return stuMapper.countPrePayByGradeAndSub(gradeid,subjectid, campusid);
        }
        else if(gradeid!=-1 && subjectid ==-1 && typeid==-1){  //年级 完成
            return stuMapper.countPrePayByGrade(gradeid, campusid);
        }
        else if(gradeid==-1 && subjectid !=-1 && typeid==-1){  //学科 完成
            return stuMapper.countPrePayBySubAuth(subjectid, campusid, name);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid!=-1){  //类型 完成
            return stuMapper.countPrePayByTypeAuth(typeid, campusid, name);
        }
        else if(gradeid==-1 && subjectid ==-1 && typeid==-1){  //全部 完成
            return stuMapper.countPreStuByPayStuAuth(campusid, name);
        }
        else {  //学科 类型 类型
            return stuMapper.countPrePayByGradeSubType(gradeid,subjectid,typeid, campusid);
        }
    }



    public List<StuCustom> findAllStuByUnPayStu(Integer gradeid , Integer teleType, Integer campusid) throws Exception{

        if(gradeid==-1 && teleType==0){  //全部 全部
            return stuMapperCustom.selectAllByUnPayStu(campusid);
        }
        else if(gradeid==-1 && teleType==1) { //全部 有电话
            return stuMapperCustom.selectAllByUnPayStuTel(campusid);
        }
        else if(gradeid==-1 && teleType==2){  //全部 没有电弧
            return stuMapperCustom.selectAllByUnPayStuNoTel(campusid);
        }
        else if (gradeid!=-1 && teleType==0){ //分年级 全部
            return stuMapperCustom.selectAllUnPayStuByGrade(gradeid, campusid);

        }
        else if(gradeid!=-1 && teleType==1){ //分年级 有电话
            return stuMapperCustom.selectAllUnPayStuByGradeTel(gradeid, campusid);
        }
        else if (gradeid!=-1 && teleType==2) //分年级 没有电话

        {
            return stuMapperCustom.selectAllUnPayStuByGradeNoTel(gradeid, campusid);
        }
        else {
            return null;
        }
    }

    public List<StuCustom> findStuByUnPayStuAuth(Integer toPageNo, Integer gradeid, Integer teleType, Integer campusid, String name) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);

        if(gradeid==-1 && teleType==0){  //全部 全部
            pagingVO.setIntergerfour(campusid);
            pagingVO.setStringtemp(name);
            return stuMapperCustom.selectByUnPayStuAuth(pagingVO);
        }
        else if(gradeid==-1 && teleType==1) { //全部 有电话
            pagingVO.setIntergerfour(campusid);
            pagingVO.setStringtemp(name);
            return stuMapperCustom.selectByUnPayStuTelAuth(pagingVO);
        }
        else if(gradeid==-1 && teleType==2){  //全部 没有电弧
            pagingVO.setIntergerfour(campusid);
            pagingVO.setStringtemp(name);
            return stuMapperCustom.selectByUnPayStuNoTelAuth(pagingVO);
        }
        else if (gradeid!=-1 && teleType==0){ //分年级 全部
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectUnPayStuByGrade(pagingVO);

        }
        else if(gradeid!=-1 && teleType==1){ //分年级 有电话
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectUnPayStuByGradeTel(pagingVO);
        }
        else if (gradeid!=-1 && teleType==2) //分年级 没有电话

        {
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerfour(campusid);
           return stuMapperCustom.selectUnPayStuByGradeNoTel(pagingVO);
        }
        else {
            return null;
        }
    }

    public List<StuCustom> findStuByUnPayStu(Integer toPageNo, Integer gradeid, Integer teleType, Integer campusid) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);

        if(gradeid==-1 && teleType==0){  //全部 全部
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectByUnPayStu(pagingVO);
        }
        else if(gradeid==-1 && teleType==1) { //全部 有电话
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectByUnPayStuTel(pagingVO);
        }
        else if(gradeid==-1 && teleType==2){  //全部 没有电弧
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectByUnPayStuNoTel(pagingVO);
        }
        else if (gradeid!=-1 && teleType==0){ //分年级 全部
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectUnPayStuByGrade(pagingVO);

        }
        else if(gradeid!=-1 && teleType==1){ //分年级 有电话
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectUnPayStuByGradeTel(pagingVO);
        }
        else if (gradeid!=-1 && teleType==2) //分年级 没有电话

        {
            pagingVO.setIntergertemp(gradeid);
            pagingVO.setIntergerfour(campusid);
            return stuMapperCustom.selectUnPayStuByGradeNoTel(pagingVO);
        }
        else {
            return null;
        }
    }


    public void removeStuByID(Integer stuID) throws Exception{
        stuMapper.deleteByStuID(stuID);
    }

    public void updataStuHisByID(Integer stuid) throws Exception{
        stuMapper.updataStuHis(stuid);
    }

    //更新学生的年级信息+1
    public void updateStuGrade( ) throws Exception{
        stuMapper.updataGradeID();
    }

    //更新学生的年级信息-1
    public void updateStuGradeDec( ) throws Exception{
        stuMapper.updataGradeDec();
    }

    //获取优秀学生信息 分页显示
    public  List<StuCustom> findOutStandStu(Integer toPageNo ) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        return stuMapperCustom.selectOutstandStu(pagingVO);
    }
    //获取优秀学生信息 全部
    public  List<StuCustom> findAllOutStandStu() throws Exception{

        return stuMapperCustom.selectAllOutstandStu();
    }

    public  int getCountByOutstand() throws Exception{
        return stuMapper.countOutstandStu();
    }

    public  List<Stu> findStuByStuTel(String stutel) throws Exception{
        return  stuMapper.selectStuTel(stutel);
    }

    public  List<Stu> findStuByMoTel(String mothertel) throws Exception{
        return  stuMapper.selectMotherTel(mothertel);
    }

    public  List<Stu> findStuByFaTel(String fathertel) throws Exception{
        return  stuMapper.selectFatherTel(fathertel);
    }

    public List<StuCustom> findLister(Integer toPageNo, String name, Date startdate, Date enddate) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        pagingVO.setStringtemp(name);
        pagingVO.setStartdate(startdate);
        pagingVO.setEnddate(enddate);
        return stuMapperCustom.selectByLister(pagingVO);
    }

    public  int getCountLister(String name, Date startdate, Date enddate) throws Exception{
        return stuMapper.countLister(name,startdate,enddate);
    }

    public List<StuCustom> findUpdater(Integer toPageNo, String name, Date startdate, Date enddate) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        pagingVO.setStringtemp(name);
        pagingVO.setStartdate(startdate);
        pagingVO.setEnddate(enddate);
        return stuMapperCustom.selectByUpdater(pagingVO);
    }

    public  int getCountUpdater(String name, Date startdate, Date enddate) throws Exception{
        return stuMapper.countUpdater(name,startdate,enddate);
    }

    //检验查询（起始时间，终止时间，专业）
    public List<StuCustom> findCheck(Integer toPageNo, String majorName, Date startdate, Date enddate) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        pagingVO.setStringtemp(majorName);
        pagingVO.setStartdate(startdate);
        pagingVO.setEnddate(enddate);
        return stuMapperCustom.selectByCheck(pagingVO);
    }

    public int getCountCheck(String majorName, Date startdate, Date enddate) throws Exception{
        return stuMapper.countCheck(majorName,startdate,enddate);
    }

    //负责人新录入信息提醒
    public List<StuCustom> leaderReceiveRemind(Integer toPageNo,Integer permission, String username) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        pagingVO.setStringtemp(username);

        if(permission==0){  //pay
            return stuMapperCustom.selectLeaderReceiveByGradePay(pagingVO);
        }
        else if(permission ==1){  //unpay
            return stuMapperCustom.selectLeaderReceiveByGradeUnPay(pagingVO);
        }else {     //pay and unpay
            return stuMapperCustom.selectLeaderReceiveByGrade(pagingVO);
        }
    }

    // 计数 负责人新录入信息提醒
    public int countLeaderReceiveRemind(Integer permission, String username) throws Exception{
        if(permission==0){  //pay
            return stuMapper.countLeaderReceiveByGradePay(username);
        }
        else if(permission ==1){  //unpay
            return stuMapper.countLeaderReceiveByGradeUnPay(username);
        }else {     //pay and unpay
            return stuMapper.countLeaderReceiveByGrade(username);
        }
    }

    //校长新录入信息提醒
    public List<StuCustom> masterReceiveRemind(Integer toPageNo, Integer permission, String name) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        pagingVO.setStringtemp(name);

        if(permission==0){  //pay
            return stuMapperCustom.selectMasterReceiveByGradePay(pagingVO);
        }
        else if(permission ==1){  //unpay
            return stuMapperCustom.selectMasterReceiveByGradeUnPay(pagingVO);
        }else {     //pay and unpay
            return stuMapperCustom.selectMasterReceiveByGrade(pagingVO);
        }
    }

    // 计数
    public int countMasterReceiveRemind(Integer permission, String name) throws Exception{
        if(permission==0){  //pay
            return stuMapper.countMasterReceiveByGradePay(name);
        }
        else if(permission ==1){  //unpay
            return stuMapper.countMasterReceiveByGradeUnPay(name);
        }else {     //pay and unpay
            return stuMapper.countMasterReceiveByGrade(name);
        }
    }

    //负责人更新提醒
    public List<StuCustom> leaderUpdateRemind(Integer toPageNo,Integer permission, String username) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        pagingVO.setStringtemp(username);


        if(permission==0){  //pay
            return stuMapperCustom.selectLeaderUpdateByGradePay(pagingVO);
        }
        else if(permission ==1){  //unpay
            return stuMapperCustom.selectLeaderUpdateByGradeUnPay(pagingVO);
        }else {     //pay and unpay
            return stuMapperCustom.selectLeaderUpdateByGrade(pagingVO);
        }
    }

    // 计数
    public int countLeaderUpdateRemind(Integer permission, String name) throws Exception{
        if(permission==0){  //pay
            return stuMapper.countLeaderUpdateByGradePay(name);
        }
        else if(permission ==1){  //unpay
            return stuMapper.countLeaderUpdateByGradeUnPay(name);
        }else {     //pay and unpay
            return stuMapper.countLeaderUpdateByGrade(name);
        }
    }

    //校长更新提醒
    public List<StuCustom> masterUpdateRemind(Integer toPageNo,Integer permission, String name) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        pagingVO.setStringtemp(name);

        if(permission==0){  //pay
            return stuMapperCustom.selectMasterUpdateByGradePay(pagingVO);
        }
        else if(permission ==1){  //unpay
            return stuMapperCustom.selectMasterUpdateByGradeUnPay(pagingVO);
        }else {     //pay and unpay
            return stuMapperCustom.selectMasterUpdateByGrade(pagingVO);
        }
    }

    // 计数
    public int countMasterUpdateRemind(Integer permission, String name) throws Exception{
        if(permission==0){  //pay
            return stuMapper.countMasterUpdateByGradePay(name);
        }
        else if(permission ==1){  //unpay
            return stuMapper.countMasterUpdateByGradeUnPay(name);
        }else {     //pay and unpay
            return stuMapper.countMasterUpdateByGrade(name);
        }
    }

    public   List<StuCustom> adminReceiveRemind(Integer toPageNo) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        return stuMapperCustom.selectAdminReceive(pagingVO);
    }

    public   List<StuCustom> adminReceiveRemindUnsign(Integer toPageNo) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        return stuMapperCustom.selectAdminReceiveUnsign(pagingVO);
    }

    public   List<StuCustom> adminUpdateRemind(Integer toPageNo) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        return stuMapperCustom.selectAdminUpdate(pagingVO);
    }

    public   List<StuCustom> adminUpdateRemindUnsign(Integer toPageNo) throws Exception{
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);
        return stuMapperCustom.selectAdminUpdateUnsign(pagingVO);
    }

     //查找录入人
    public String findRecordPerson(Integer stuid) throws Exception{
        return stuMapper.selectRecordPersonByIndex(stuid);
    }

    //更新录入人
    public void updateRecordPerson(Integer stuid, String name) throws Exception{
        stuMapper.updateRecordPersonByIndex(stuid,name);
    }



}
