package com.system.po;

public class RemindPay {
    Integer remindid;
    Integer lessonid;
    String teachername;

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }



    public Integer getRemindid() {
        return remindid;
    }

    public void setRemindid(Integer remindid) {
        this.remindid = remindid;
    }

    public Integer getLessonid() {
        return lessonid;
    }

    public void setLessonid(Integer lessonid) {
        this.lessonid = lessonid;
    }
}
