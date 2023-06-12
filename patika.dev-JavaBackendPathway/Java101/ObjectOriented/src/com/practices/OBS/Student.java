package com.practices.OBS;

public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBlukExamNote(int note1, int quizNote1, int note2, int quizNote2, int note3, int quizNote3){
        if (note1 >= 0 && note1 <= 100){
            c1.note = note1;
        }
        if (quizNote1 >= 0 && quizNote1 <= 100){
            c1.quizNote = quizNote1;
        }
        if (note2 >= 0 && note2 <= 100){
            c2.note = note2;
        }
        if (quizNote2 >= 0 && quizNote2 <= 100){
            c2.quizNote = quizNote2;
        }
        if (note3 >= 0 && note3 <= 100){
            c3.note = note3;
        }
        if (quizNote3 >= 0 && quizNote3 <= 100){
            c3.quizNote = quizNote3;
        }
    }

    void calcAverage(){
        double avg1, avg2, avg3;
        avg1 = (this.c1.quizNote * 0.2) + (this.c1.note * 0.8);
        avg2 = (this.c2.quizNote * 0.2) + (this.c2.note * 0.8);
        avg3 = (this.c3.quizNote * 0.2) + (this.c3.note * 0.8);
        this.average = (avg1 + avg2 + avg3) / 3.0;
    }

    void isPass(){
        calcAverage();
        printNote();
        if (this.average > 55){
            System.out.println("Tebrikler! Geçtiniz.");
            isPass = true;
        } else {
            System.out.println("Üzgünüm, kaldınız!");
            isPass = false;
        }
    }

    void printNote(){
        System.out.println(this.c1.name + "'s quiz note\t\t:\t" + this.c1.quizNote);
        System.out.println(this.c1.name + "'s exam note\t\t:\t" + this.c1.note);

        System.out.println(this.c2.name + "'s quiz note\t\t:\t" + this.c2.quizNote);
        System.out.println(this.c2.name + "'s exam note\t\t:\t" + this.c2.note);

        System.out.println(this.c3.name + "'s quiz note\t:\t" + this.c3.quizNote);
        System.out.println(this.c3.name + "'s exam note\t:\t" + this.c3.note);
        System.out.println();
        System.out.println(this.name + "'s avg is\t\t\t:\t" + this.average);
        System.out.println();
    }
}
