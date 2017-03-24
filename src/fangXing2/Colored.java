package fangXing2;

import java.awt.*;

/**
 * Created by kang on 17/3/24.
 */
public class Colored<T extends HasColor> {

    T item;
    Colored(T item){
        this.item = item;
    }
    T getItem(){
        return item;
    }

    Color getColor(){
        return  item.getColor();
    }


}
