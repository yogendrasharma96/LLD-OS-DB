package com.db.creational.builder;

import com.dp.creational.builder.NewStudent;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class NewStudentTest {

    @Test
    public void builderTest(){
        NewStudent newStudentBuilder1 =NewStudent.getNewStudentBuilder()
                .setFname("Yogendra")
                .setLname("Sharma")
                .setPhone("7737721865")
                .setAge(26).build();
        //to avoid this make inner class constructor private
        //NewStudent newStudentBuilder2 = new NewStudent.NewStudentBuilder()
        NewStudent newStudentBuilder2 = NewStudent.getNewStudentBuilder()
                .setFname("Yogendra")
                .setLname("Sharma")
                .setFname("Ram")
                .setPhone("7737721865")
                .setAge(26).build();
//        NewStudent newStudentBuilder = new NewStudent.NewStudentBuilder()
//                .setFname("Yogendra")
//                .setPhone("7737721865")
//                .setAge(26).build();
        assertNotEquals(newStudentBuilder2.getFname(),"Yogendra");
        assertNotEquals(newStudentBuilder1,newStudentBuilder2);



    }

}
