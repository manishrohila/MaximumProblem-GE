package org.example;

import java.util.Arrays;
import java.util.List;

public class FloatMax {
    public static float floatMax(List<Float> list){
        float max = Float.NEGATIVE_INFINITY;
        //System.out.println(max);
        for(float f : list){
            if(max<f){
                max = f;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        List<Float> list = Arrays.asList(-10.5f, -20.5f, -5.5f);
        float max = floatMax(list);
        System.out.println("Maximum value: " + max);
    }
}
