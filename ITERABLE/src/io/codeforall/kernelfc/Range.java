package io.codeforall.kernelfc;

import java.util.ArrayList;
import java.util.Iterator;

public class Range implements Iterable <Integer>{
    public int min;
    public int max;
    ArrayList<Range> myLittleRange = new ArrayList<>();



    public Range(int min, int max){
        this.min = min;
        this.max = max;

        myLittleRange.add(this);
    }


    @Override
    public Iterator iterator() {
       return new myIterator(min, max, myLittleRange);
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "Range{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
