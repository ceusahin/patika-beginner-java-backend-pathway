package com.practices.OBS;

public class OBS {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut hoca", "1111", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "2222", "FZK");
        Teacher t3 = new Teacher("Albert Einstein", "3333", "MAT");
        Teacher kaan = new Teacher("Kaan Okurlar", "4444", "TRH");

        Course tarih = new Course("Tarih", "101", "TRH");
        Course fizik = new Course("Fizik", "102", "FZK");
        Course mat = new Course("Matematik", "103", "MAT");

        tarih.addTeacher(kaan);

        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        mat.addTeacher(t3);

        Student omer = new Student("Ömer", "000", "9", tarih, fizik, mat);
        omer.addBlukExamNote(100, 100, 100, 100, 100, 100);
        omer.isPass();

        System.out.println("=======================");

        Student s1 = new Student("Hakan", "001", "9", tarih, fizik, mat);
        s1.addBlukExamNote(100, 88, 50, 50, 70, 95);
        s1.isPass();

        System.out.println("=======================");

        Student s2 = new Student("Mahmut", "002", "9", tarih, fizik, mat);
        s2.addBlukExamNote(85, 85, 100, 98, 88, 70);
        s2.isPass();

        System.out.println("=======================");

        Student s3 = new Student("Sengul", "003", "9", tarih, fizik, mat);
        s3.addBlukExamNote(100,90,50,44,25,45);
        s3.isPass();


    }
}
