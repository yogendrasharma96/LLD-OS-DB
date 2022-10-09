package com.dp.creational.prototype;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BackGroundObject implements GraphicalObject{
//Either implement cloneable or Graphical interface
    private Integer x;
    private Integer y;
    private Integer width;
    private Integer height;
    private BackGroundType type;
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<Integer> pixels;

    @Override
    public GraphicalObject clone() {
        return new BackGroundObject(x,y,width,height,type,pixels);
    }
}
