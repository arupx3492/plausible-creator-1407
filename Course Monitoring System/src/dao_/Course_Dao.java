package dao_;

import bean_.Course;

import java.util.List;

public interface Course_Dao {
    public void createCourse(Course course);
    public List<Course> viewCourse();
    public void updateCourse(int ci,String f, String s);
}
