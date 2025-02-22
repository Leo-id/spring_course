package com.zaurtregulov.spring.aop.aspects;

public class Student {
    private System nameSurname;
    private int course;
    private double avgGrade;

    public Student(System nameSurname, int course, double avgGrade) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public System getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(System nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname=" + nameSurname +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
