package org.snow.auspicious.leecode.solution.MyHashMap;

import java.util.LinkedList;

/**
 * @Author chaixiaoxue
 * @Date: 2021/3/14 16:50
 */
class MyHashMap {
    private static final int BASE = 987;//初始化最初容量
    LinkedList[] list;
    /** Initialize your data structure here. */
    public MyHashMap() {
        list = new LinkedList[BASE];
        for(int i =0;i<BASE;i++){
            list[i] = new LinkedList<Data>();
        }

    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        LinkedList<Data> data = list[hash(key)];
        for(Data d : data){
            if(d.key == key){
                d.value = value;
                return;
            }
        }
        data.add(new Data(key,value));

    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        LinkedList<Data> data = list[hash(key)];
        for(Data d : data){
            if(d.key == key){

                return d.value;
            }
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        LinkedList<Data> data = list[hash(key)];
        for(Data d : data){
            if(d.key == key){

                data.remove(d);
                //如果不加 return 则会报错
                return;
            }
        }
    }

    public static class Data{
        int key;
        int value;
        public Data (int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    private static int hash(int key) {
        return key % BASE;
    }
}
