package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {
    //Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
    public static String pigIt(String originalStr) {
        String[] specialMarks={".",",","-",":",";","!","?"};
        String[] splitWord = originalStr.split(" ");
        char word;
        boolean flag = true;

        for (int i = 0; i < splitWord.length; i++){
            for (String specialMark : specialMarks) {
                if (splitWord[i].contains(specialMark)) {
                    flag = false;
                }
            }

            if (flag){
                word = splitWord[i].charAt(0);
                splitWord[i] = splitWord[i].substring(1);
                splitWord[i] = splitWord[i].replace(splitWord[i], splitWord[i] + word + "ay");
            }
            flag = true;
        }

        return String.join(" ", splitWord);
    }
}
