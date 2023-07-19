package com.haloz.lists.impl;

import com.haloz.exception.ElementIsNotFoundException;
import com.haloz.lists.api.IntegerList;
import lombok.NonNull;

import java.util.Arrays;

public class IntegerListImpl implements IntegerList {
    private Integer[] array;
    public IntegerListImpl(){
        this.array = new Integer[0];
    }
    @NonNull
    public IntegerListImpl(Integer... values){
        this.array = values;
    }
    @NonNull
    public IntegerListImpl(IntegerList stringList){
        this.array = stringList.toArray();
    }
    @NonNull
    @Override
    public Integer add(Integer item) {
        Integer[] buff = new Integer[this.array.length + 1];
        System.arraycopy(this.array, 0, buff, 0, this.array.length);
        buff[this.array.length] = item;
        this.array = buff;
        return item;
    }
    @NonNull
    @Override
    public Integer add(int index, Integer item) {
        Integer[] buff = new Integer[this.array.length + 1];
        if (index > 0) {
            System.arraycopy(this.array, 0, buff, 0, index);
        }
        buff[index] = item;
        if (this.array.length + 1 - (index + 1) >= 0)
        {
            System.arraycopy(this.array, index + 1 - 1, buff, index + 1, this.array.length + 1 - (index + 1));
        }
        this.array = buff;
        return item;
    }
    @NonNull
    @Override
    public Integer set(int index, Integer item) {
        this.array[index] = item;
        return item;
    }
    @NonNull
    @Override
    public Integer remove(Integer item) {
        int el = -1;
        for(int i = 0; i < this.array.length; i++){
            if(this.array[i].equals(item)) {
                this.array[i] = null;
                el = i;
                break;
            }
        }
        if(el == -1) {
            throw new ElementIsNotFoundException("Element {" + item + "} is not found");
        }
        this.array = copyArrayWithoutElement();
        return item;
    }
    @Override
    public Integer remove(int index) {
        Integer res = this.array[index];
        this.array[index] = null;
        this.array = copyArrayWithoutElement();
        return res;
    }
    @NonNull
    @Override
    public boolean contains(Integer item) {
        return Arrays.binarySearch(this.sort(), item) >= 0;
    }
    @NonNull
    @Override
    public int indexOf(Integer item) {
        int el = -1;
        for(int i = 0; i < this.array.length; i++){
            if(this.array[i].equals(item)) {
                el = i;
                break;
            }
        }
        return el;
    }
    @NonNull
    @Override
    public int lastIndexOf(Integer item) {
        int el = -1;
        for(int i = 0; i < this.array.length; i++){
            if(this.array[i].equals(item)) {
                el = i;
            }
        }
        return el;
    }

    @Override
    public Integer get(int index) {
        return array[index];
    }
    @NonNull
    @Override
    public boolean equals(IntegerList otherList) {
        if (this.size() != otherList.size()) {
            return false;
        }

        for(int i = 0; i < this.size(); i++) {
            if (!this.array[i].equals(otherList.get(i))) {
                return false;
            }
        }
        return true;
    }
    @Override
    public int size() {
        return this.array.length;
    }
    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }
    @Override
    public void clear() {
        this.array = new Integer[0];
    }
    @Override
    public Integer[] toArray() {
        Integer[] res = new Integer[this.size()];
        System.arraycopy(this.array, 0, res, 0, this.size());
        return res;
    }
    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    private Integer[] copyArrayWithoutElement() {
        Integer[] buff = new Integer[this.array.length - 1];
        for (int i = 0, j = 0; i < this.array.length; i++) {
            if (this.array[i] == null) {
                continue;
            }
            buff[j++] = this.array[i];
        }
        return buff;
    }
    private Integer[] sort() {
        Integer[] integers = this.toArray();
        quickSort(integers, 0, integers.length - 1);
        return integers;
    }
    private void quickSort(Integer[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr,partitionIndex+1, end);
        }

    }
    private int partition(Integer[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
