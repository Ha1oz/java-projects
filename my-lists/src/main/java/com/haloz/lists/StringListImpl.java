package com.haloz.lists;

import java.util.Arrays;

public class StringListImpl implements StringList {
    private String[] array;
    public StringListImpl(){
        this.array = new String[0];
    }
    public StringListImpl(String... strings){
        this.array = strings;
    }
    public StringListImpl(StringList stringList){
        this.array = stringList.toArray();
    }
    @Override
    public String add(String item) {
        String[] buff = new String[this.array.length + 1];
        System.arraycopy(this.array, 0, buff, 0, this.array.length);
        buff[this.array.length] = item;
        this.array = buff;
        return item;
    }
    @Override
    public String add(int index, String item) {
        String[] buff = new String[this.array.length + 1];
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
    @Override
    public String set(int index, String item) {
        this.array[index] = item;
        return item;
    }
    @Override
    public String remove(String item) {
        int el = -1;
        for(int i = 0; i < this.array.length; i++){
            if(this.array[i].equals(item)) {
                this.array[i] = null;
                el = i;
                break;
            }
        }
        if(el == -1) {
            return null;
        }
        this.array = copyArrayWithoutElement();
        return item;
    }
    @Override
    public String remove(int index) {
        String res = this.array[index];
        this.array[index] = null;
        this.array = copyArrayWithoutElement();
        return res;
    }
    @Override
    public boolean contains(String item) {
        boolean res = false;
        for (String s : this.array) {
            if (s.equals(item)) {
                res = true;
                break;
            }
        }
        return res;
    }
    @Override
    public int indexOf(String item) {
        int el = -1;
        for(int i = 0; i < this.array.length; i++){
            if(this.array[i].equals(item)) {
                el = i;
                break;
            }
        }
        return el;
    }

    @Override
    public int lastIndexOf(String item) {
        int el = -1;
        for(int i = 0; i < this.array.length; i++){
            if(this.array[i].equals(item)) {
                el = i;
            }
        }
        return el;
    }

    @Override
    public String get(int index) {
        return array[index];
    }

    @Override
    public boolean equals(StringList otherList) {
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
        this.array = new String[0];
    }
    @Override
    public String[] toArray() {
        return this.array;
    }
    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    private String[] copyArrayWithoutElement() {
        String[] buff = new String[this.array.length - 1];
        for (int i = 0, j = 0; i < this.array.length; i++) {
            if (this.array[i] == null) {
                continue;
            }
            buff[j++] = this.array[i];
        }
        return buff;
    }
}
