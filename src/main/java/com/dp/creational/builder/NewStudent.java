package com.dp.creational.builder;

import lombok.Getter;

@Getter
public class NewStudent {
    private String fname;
    private String lname;
    private String phone;
    private int age;

    // constructor hiding so ,no one can directly create object of NewStudent
    //no setter for outer class to achieve immutability
    private NewStudent() {
    }

    public static NewStudentBuilder getNewStudentBuilder() {
        return new NewStudentBuilder();
    }

    @Getter
    public static class NewStudentBuilder {
        //To remove duplicate code
//        private String fname;
//        private String lname;
//        private String phone;

        NewStudent student;


        //no one can access create object of outer class directly
        private NewStudentBuilder() {
            student = new NewStudent();
        }

        public NewStudentBuilder setLname(String lname) {
            student.lname = lname;
            return this;
        }


        public NewStudentBuilder setPhone(String phone) {
            student.phone = phone;
            return this;
        }


        public NewStudentBuilder setAge(int age) {
            student.age = age;
            return this;
        }


        public NewStudentBuilder setFname(String fname) {
            student.fname = fname;
            return this;
        }

        private boolean validate() {
            if (student.fname == null || student.lname == null)
                return false;
            return true;
        }

        //Add a build method to create object of outer class
        public NewStudent build() {
            if (!validate())
                throw new IllegalArgumentException("Invalid Student");
            NewStudent otherStudent = new NewStudent();
            otherStudent.fname = student.fname;
            otherStudent.lname = student.lname;
            otherStudent.phone = student.phone;
            otherStudent.age = student.age;
            return otherStudent;
        }
    }
}
