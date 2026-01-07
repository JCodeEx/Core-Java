package Core.Java.com.java6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindIndicesUsingJava6 {
    public static void main(String[] args) {
         List<Integer> numberList= Arrays.asList(10, 2, 9, 7, 3, 5, 6);
       // FindIndicesUsingJava6.findTwoSumIndicesUsingLoop(numberList,12);
        FindIndicesUsingJava6.findTwoSumIndicesUsingMap(numberList,12);

    }


    public static void findTwoSumIndicesUsingLoop(List<Integer>numberList,int target){
        for (int i=0;i<numberList.size();i++){
            for (int j=i+1;j<numberList.size();j++){
                if(numberList.get(i)+numberList.get(j)==target)
                    System.out.println("the indeces are.."+i+" "+j);
            }
        }
    }
    public static void findTwoSumIndicesUsingMap(List<Integer>numberList,int target){
        System.out.println("called ......");
        Map<Integer,Integer > numMap=new HashMap<>();
        for (int i =0;i < numberList.size();i++){
            int currentNum=numberList.get(i);
            int neededNum=target-currentNum;
            if(numMap.containsKey(neededNum)){
                System.out.println("Indices: " +numMap.get(neededNum)+","+i);
            }
            numMap.put(currentNum, i);
        }

    }
}
