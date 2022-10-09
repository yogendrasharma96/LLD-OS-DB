package com.db.creational.factory;

import com.dp.creational.factory.simple.Student;
import com.dp.creational.factory.simple.User;
import com.dp.creational.factory.simple.UserRole;
import com.dp.creational.factory.simple.Userfactory;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SimpleFactoryTest {

    @Test
    public void simpleFactoryTest() {
        User u = Userfactory.createUser(UserRole.STUDENT);
        assertTrue( u instanceof Student);
    }

}
