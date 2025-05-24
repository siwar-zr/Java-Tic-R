package CollectionApi;

import java.util.*;

public class Demo {

    public static void main(String[] args){

        Set<Integer> nums = new TreeSet<>();

        nums.add(16);
        nums.add(25);
        nums.add(88);
        nums.add(92);
        nums.add(61);

        //System.out.println(nums.get(2));
        //System.out.println(nums.indexOf(6));
        //System.out.println(nums.lastIndexOf(6));

        System.out.println(nums);

        for(int n : nums){

            System.out.println(n*2);
        }
    }
}
