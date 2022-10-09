package com.dp.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class BackGroundObjectRegistry {
    //    private Map<BackGroundType, GraphicalObject> objects = new HashMap<>();
//
//    public void addObjectsInRegistry(GraphicalObject ob) {
//        if(ob instanceof BackGroundObject) {
//            BackGroundObject bg = (BackGroundObject) ob;
//            objects.put(bg.getType(), ob);
//        }
//    }
//
//    public GraphicalObject getObjectFromRegistry(BackGroundType type) {
//        if (objects.containsKey(type))
//            return objects.get(type);
//        return null;
//
//    }
    private Map<BackGroundType, BackGroundObject> objects = new HashMap<>();

    public void addObjectsInRegistry(BackGroundObject ob) {

        objects.put(ob.getType(), ob);
    }

    public BackGroundObject getObjectFromRegistry(BackGroundType type) {
        if (objects.containsKey(type))
            return objects.get(type);
        return null;

    }

}
