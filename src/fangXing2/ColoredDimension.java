package fangXing2;

import java.awt.*;

/**
 * Created by kang on 17/3/24.
 */
public class ColoredDimension<T extends Dimesion & HasColor> {

    T item;
    ColoredDimension(T item){
        this.item = item;
    }

    Color getColor(){
        return  item.getColor();
    }

     int getX(){
        return T.x;
    }
    int getY(){
         return T.y;
    }

    int getZ(){
        return T.z;
    }

}
