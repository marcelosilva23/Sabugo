package io.codeforall.kernelfc;

import java.util.ArrayList;
import java.util.Iterator;

public class Range implements Iterable<Integer> {
    public int min;
    public int max;
    ArrayList<Range> myLittleRange = new ArrayList<>();
    ArrayList<Range> myLittleReversedRanged = new ArrayList<>();


    public Range(int min, int max) {
        this.min = min;
        this.max = max;


        myLittleRange.add(this);
    }


    @Override
    public Iterator iterator() {

        if (!getReversed()) {
            return new myIterator(min, max, myLittleRange);
        }
        return new myIterator(min, max, myLittleReversedRanged);
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

    public boolean getReversed() {
        return false;
    }

    public void setReversed(boolean reversed) {
        reversed = true;
    }

    @Override
    public String toString() {
        return "Range{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
