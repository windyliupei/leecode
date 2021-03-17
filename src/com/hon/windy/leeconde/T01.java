package com.hon.windy.leeconde;

import com.sun.javafx.collections.UnmodifiableListSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


//Arrays 二分查找
public class T01 {

    public static void main(String[] args){
        List<SortDTO> list = new ArrayList<>();
        list.add(new SortDTO(300));
        list.add(new SortDTO(50));
        list.add(new SortDTO(200));
        list.add(new SortDTO(220));

        SortDTO[] array = new SortDTO[list.size()];
        list.toArray(array);

        //必须排序，否则 binarySearch 返回结果小于零
        Arrays.sort(array, Comparator.comparing(SortDTO::getSortTarget));

        int binarySearch = Arrays.binarySearch(array, new SortDTO(200), Comparator.comparing(SortDTO::getSortTarget));

        UnmodifiableListSet s = new UnmodifiableListSet(list);
        s.remove(null);

    }

}



 class SortDTO {

     public Integer getSortTarget() {
         return sortTarget;
     }

     public void setSortTarget(Integer sortTarget) {
         this.sortTarget = sortTarget;
     }

     private Integer sortTarget;

    public SortDTO(Integer sortTarget) {
        this.sortTarget = sortTarget;
    }
}
