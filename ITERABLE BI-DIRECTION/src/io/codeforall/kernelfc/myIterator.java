package io.codeforall.kernelfc;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;

public class myIterator implements Iterator {


    int min;
    int max;
    int i = 0;
    ArrayList<Range> myLittleRange = new ArrayList<>();
    ArrayList<Range> myLittleReversedRanged = new ArrayList<>();

    Integer current = Integer.MIN_VALUE;
    public myIterator(int min, int max,ArrayList<Range> myLittleRange){
        this.max = max;
        this.min = min;
        this.myLittleReversedRanged = myLittleReversedRanged;
        this.myLittleRange = myLittleRange;
    }

    @Override
    public boolean hasNext() {
        if (current + 1 > max){
            return false;
        }
        return true;

    }

    @Override
    public Integer next() {
        if (current == Integer.MIN_VALUE){
            current = myLittleRange.get(i).min;
        } else if (current == myLittleRange.get(i).max){
            i++;
            current = myLittleRange.get(i).min;
        } else {
           current += 1;
        }
        return current;
    }

    public Integer Reversed() {
        if (current == Integer.MAX_VALUE) {
            i = myLittleRange.size() - 1;
            current = myLittleRange.get(i).max;
        } else if (current == myLittleRange.get(i).min) {
            i--;
            current = myLittleRange.get(i).max;
        } else {
            current -= 1;
        }
        return current;
    }


    //1
    //-5 : 0 - 1 : 5
    // remove index 0
   public void remove(){
        Range rangeToRemove = null;
        for (Range currentRange : myLittleRange){
           if (currentRange.min <= current && currentRange.max >= current){
              rangeToRemove = currentRange;
               break;
           }
        }

        if (current != rangeToRemove.min) {
            Range previousRange = new Range(rangeToRemove.min, current - 1);
            myLittleRange.add(previousRange);
        }

        if (current != rangeToRemove.max){
            Range nextRange = new Range(current + 1, rangeToRemove.max);
            myLittleRange.add(nextRange);
        }

       myLittleRange.remove(myLittleRange.indexOf(rangeToRemove));

    }

}
