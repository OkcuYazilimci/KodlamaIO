package Entities;

public class Product {
    private Course course;
    private Teacher teacher;
    private Category category;

    public Product (Category category, Course course, Teacher teacher) {
        this.category = category;
        this.course = course;
        this.teacher = teacher;
    }


    // GETTER & SETTER
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
