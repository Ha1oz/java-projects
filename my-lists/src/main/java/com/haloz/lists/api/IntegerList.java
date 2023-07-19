package com.haloz.lists.api;

import lombok.NonNull;

public interface IntegerList {
    @NonNull Integer add(Integer item);

    @NonNull Integer add(int index, Integer item);

    @NonNull Integer set(int index, Integer item);

    @NonNull Integer remove(Integer item);

    Integer remove(int index);

    @NonNull boolean contains(Integer item);

    @NonNull int indexOf(Integer item);

    @NonNull int lastIndexOf(Integer item);
    Integer get(int index);
    @NonNull boolean equals(IntegerList otherList);
    int size();
    boolean isEmpty();
    void clear();

    Integer[] toArray();
}
