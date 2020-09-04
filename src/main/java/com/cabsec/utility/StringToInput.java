package com.cabsec.utility;

import com.cabsec.beans.Pixel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToInput {

    private int unitStringLength = 3;
    private String inputString = "";

    public StringToInput( String inputString) {
        this.inputString = inputString;
    }

    public List<List<Pixel>> getInputPixelData(){

        if(2 < unitStringLength && 1 == unitStringLength%2 && null != inputString && inputString.trim()!=""){
            List<List<Character>> elements = new ArrayList<List<Character>>();
            for (String e : Arrays.asList(inputString.split("\n"))) {
                char[] array = e.toCharArray();
                List<Character> currentRowChars = new ArrayList<Character>();
                for (char x : array) {
                    currentRowChars.add(x);
                }
                elements.add(currentRowChars);
            }
            printCharListOfList(elements);
            System.out.println();
            for(int characterLine = 0; characterLine < elements.size(); characterLine++){
                if(characterLine%unitStringLength==0){
                    for(int i = unitStringLength-1 ; i < elements.get(0).size()-1; i+=(unitStringLength+1)){
                        System.out.print(elements.get(characterLine).get(i));
                    }
                    System.out.println();
                }else{
                    for(int i = unitStringLength-1 ; i < elements.get(0).size()-1; i+=(unitStringLength+1)){
                        System.out.print(elements.get(characterLine).get(i));
                    }
                    System.out.println();
                }
            }
        }


        return null;
    }

    public void printCharListOfList(List<List<Character>> elements) {
        elements.stream().forEach(e -> {
            e.stream().forEach(f -> System.out.print(f));
                    System.out.println();
        }
        );
    }
}
