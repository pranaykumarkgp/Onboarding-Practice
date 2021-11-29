package com.java8.behaviourParametirization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class MoreExamples {
    public static void main(String[] args) throws  IOException{
        processFile2((BufferedReader br) -> br.readLine());



    }

//    public static String processFile() throws IOException{
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("data.txt")){
//                return "hello";
//            };
//        }catch(Exception e){
//
//        }
//
//    }


    //Working with primitive types
    //Boxing/UnBoxing
    public interface intPredicate{
        public Boolean test(int i);
    }
    
    public interface BufferedReaderInterface{
        String process(BufferedReader b) throws IOException;
    }
    public static String processFile2(BufferedReaderInterface b) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return b.process(br);
        }
    }

}
