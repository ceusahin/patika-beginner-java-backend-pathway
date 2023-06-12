package com.practices.OBS;

public class Course {
    String name;
    String code;
    String prefix;
    int quizNote;
    int note;
    Teacher teacher;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int quizNote = 0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        } else {
            System.out.println("Ogretmen ve ders secimi uyusmuyor! HATA!");
        }
    }

    void printTeacherInfo(){
        this.teacher.printInfo();
    }
}
