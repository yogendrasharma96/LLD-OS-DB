package com.db.creational.prototype;

import com.dp.creational.prototype.BackGroundObject;
import com.dp.creational.prototype.BackGroundObjectRegistry;
import com.dp.creational.prototype.BackGroundType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ProtoTypeTest {
    @Test
    public void backGroundObjectTest(){
        BackGroundObject proto=new BackGroundObject(100,200,3,4, BackGroundType.TREE,null);
        BackGroundObject clone = (BackGroundObject) proto.clone();
        clone.setWidth(10);
        BackGroundObjectRegistry reg=new BackGroundObjectRegistry();
        reg.addObjectsInRegistry(clone);
        assertNotEquals(proto.getWidth(),clone.getWidth());
        BackGroundObject objectFromRegistry = reg.getObjectFromRegistry(clone.getType());
        assertEquals(proto.getType(),objectFromRegistry.getType());
    }
}
