package com.dp.creational.factory.simple;

public class Userfactory {
    public static User createUser(UserRole role) {
        switch (role) {
            case STUDENT:
                return new Student();
            case ADMIN:
                return new Admin();
            case TEACHER:
                return new Teacher();

        }
        throw new IllegalArgumentException();
    }
}
