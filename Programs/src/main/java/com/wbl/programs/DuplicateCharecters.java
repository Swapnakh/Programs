package com.wbl.programs;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;
 
public class DuplicateCharecters
{
    public static void main(String args[])
    {
        String str= "abaracadabra";
        char[] chars = str.toCharArray();
         
        Map<Character, Integer> map = new HashMap<>();
        for(char c : chars)
        {
            if(map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }
         
        System.out.println("Duplicate characters: ");
         
        //Print duplicate characters
        for(char c : map.keySet()) {
            if(map.get(c) > 1) {
                System.out.println(c);
            }
        }
         
  }
        
}