package com.aleengo.peank.uiadapters.recyclerview;


import java.util.Collection;

/**
 * Copyright Aleengo 2019. All rights reserved.
 * Created by bau.cj on 22/06/2019.
 */
public interface AdapterBase<E> {

    void clear();
    int getItemPosition(final E item);
    E getItem(int position);
    void addItem(E item);
    void addItem(int position, E item);
    void removeItem(int position);
    void updateItem(int position, E item);
    void addItems(Collection<E> collection);
    void addItems(Collection<E> collection, boolean extend);

}
