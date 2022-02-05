package com.codewars.ramamike;
/* *****************************************************************************
Your task is to write a function that takes a string and return a new string
 with all vowels removed. For example, the string
 "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.
 */
public class CommWithoutVowels2 {
    public static String disemvowel(String str) {
        return str.replaceAll( "[aeiuoAEIUO]","");
    }
}
/*
codewars source
public class Troll {
    public static String disemvowel(String str) {
        return  str.replaceAll("(?i)[aeiouâãäåæçèéêëìíîïðñòóôõøùúûü]", "");
    }
}
 */
