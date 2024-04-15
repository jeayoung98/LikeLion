package com.example.day14;

public class Box<V> {
    private V value;

    public Box(V value) {
        this.value = value;
    }

    public V getValue(){
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("hello");
        String strValue = stringBox.getValue();
        Box<Integer> integerBox = new Box<>(123);
        int intValue = integerBox.getValue();
    }

}
