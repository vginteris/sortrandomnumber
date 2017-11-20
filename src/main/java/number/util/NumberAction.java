package number.util;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberAction {
    List<Integer> mylist;

    public List<Integer> getRandomNumberList(int minnumber, int maxnumber, int numbercount){
        mylist = new ArrayList<>();
        for (int i = 0; i < numbercount; i++) {
            mylist.add((int) (Math.random() * ((maxnumber - minnumber) + 1) + minnumber));
        }
        return mylist;
    }

    public List<Integer> getSortedList(List<Integer> unsortedList){
        int listSize = unsortedList.size();
        Integer[] numberArray = new Integer[listSize];
        numberArray = unsortedList.toArray(numberArray);
        boolean sorted = true;
        while (sorted){
            int tempnumbr=0;
            int tempSortNumber = 0;
            for (int i = 0; i <listSize-1 ; i++) {
                if (numberArray[i] > numberArray[i+1]){
                    tempnumbr = numberArray[i];
                    numberArray[i]=numberArray[i+1];
                    numberArray[i+1]=tempnumbr;
                    tempSortNumber ++;
                }
            }
            if (tempSortNumber ==0) sorted = false;
        }
        List<Integer> newList = Arrays.asList(numberArray);
        return newList;
    }



}
