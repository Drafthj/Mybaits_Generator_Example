package com.drafthj.model;

public class Course {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.id
     *
     * @mbggenerated Thu Mar 17 13:37:34 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.course_name
     *
     * @mbggenerated Thu Mar 17 13:37:34 CST 2016
     */
    private String courseName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.teacher_id
     *
     * @mbggenerated Thu Mar 17 13:37:34 CST 2016
     */
    private Integer teacherId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Thu Mar 17 13:37:34 CST 2016
     */
    public Course(Integer id, String courseName, Integer teacherId) {
        this.id = id;
        this.courseName = courseName;
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Thu Mar 17 13:37:34 CST 2016
     */
    public Course() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.id
     *
     * @return the value of course.id
     *
     * @mbggenerated Thu Mar 17 13:37:34 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.id
     *
     * @param id the value for course.id
     *
     * @mbggenerated Thu Mar 17 13:37:34 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.course_name
     *
     * @return the value of course.course_name
     *
     * @mbggenerated Thu Mar 17 13:37:34 CST 2016
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.course_name
     *
     * @param courseName the value for course.course_name
     *
     * @mbggenerated Thu Mar 17 13:37:34 CST 2016
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.teacher_id
     *
     * @return the value of course.teacher_id
     *
     * @mbggenerated Thu Mar 17 13:37:34 CST 2016
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.teacher_id
     *
     * @param teacherId the value for course.teacher_id
     *
     * @mbggenerated Thu Mar 17 13:37:34 CST 2016
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}