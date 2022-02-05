package com.codewars.ramamike;
/* *****************************************************************************
Your task is to write a function that takes a string and return a new string
 with all vowels removed. For example, the string
 "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.
 */
public class CommWithoutVowels1 {
    public static String disemvowel(String str) {
        char [] vowels = {'a','e','i','u','o','A','E','I','U','O'};
        char [] arrStr = str.toCharArray();
        int k =0;
        char [] arrRes = new char[arrStr.length];
        for(int i=0; i< arrStr.length; i++) {
           for (int j=0; j< vowels.length; j++) {
               if(arrStr[i]==vowels[j]) {
                   break;
               } else if(j==vowels.length-1) {
                   arrRes[k++]=arrStr[i];
               }
           }
        }
        String result =new String(arrRes);
        return result.substring(0,k);
    }
}
