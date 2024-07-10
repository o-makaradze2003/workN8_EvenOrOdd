package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EvenOrOdd {
Scanner scan = new Scanner(System.in);
String word=scan.nextLine();
public void EvenOrOdd(){
    if(word.length()%2==0){
        ArrayList<String> odd=new ArrayList<>();
        for( int i=0;i<word.length();i+=2){   odd.add(word.substring(i, i + 2)); }
        System.out.println(odd);
    }else{
        String newWord=word+"_";
        ArrayList<String> even=new ArrayList<>();
        for( int i=0;i<newWord.length();i+=2){   even.add(newWord.substring(i, i + 2)); }
        System.out.println(even);
    }
}
}

