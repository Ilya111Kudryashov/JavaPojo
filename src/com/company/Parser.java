package com.company;

public class Parser implements Pojo{
    @Override
    public void printFunction(String[] arr) {

    }

    @Override
    public String[] keywordSelection(String[] arr) {
        for(int i = 0; i < arr.length ; i++) {
            for(int j = 0; j < JavaPojo.keywordArr.length; j++) {
                if( arr[i].equals(JavaPojo.keywordArr[j]) ) {
                    arr[i] = Decorator.Decorator(arr[i]);
                }
            }
        }

        return arr;

    }

    @Override
    public String[] Parser(String str) {
        String[] arr = str.split(" ");
        return arr;
    }
}
