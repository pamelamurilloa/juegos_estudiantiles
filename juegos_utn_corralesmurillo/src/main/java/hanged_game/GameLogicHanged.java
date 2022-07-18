package hanged_game;

import java.io.IOException;
import java.util.Scanner;

public class GameLogicHanged {
    Scanner read = new Scanner(System.in);
    
    public static String getWordFromFile(int amountChar) throws IOException { //this method gets a random word from the file, with X number of characters
        ArchiveReader archiveReader = new ArchiveReader();
        archiveReader.createFile();
        return archiveReader.readInFile(amountChar);
    }
    
    
    public static String convertToString(String[] array){ //Converts the array to a String, without the brakets
        String temporalWord = "";
        for (int i = 0; array.length > i; i ++) {
            temporalWord += array[i];
        }
        return temporalWord;
    }
    
    
    public static String checkChar(String letter, String userWord, String shownWord) { //this method verifies a char input from the user is in the word, and returns the string without those blank spaces
        
        letter = letter.toUpperCase();
        userWord = userWord.toUpperCase(); //I uppercased everything to maintaing homogeneity
        String[] wordArray = shownWord.split(""); //make an array to show eventually to the user
        
        int position = userWord.indexOf(letter);
        
        if (userWord.contains(letter)) {
            for(int i = 0; userWord.length() > i; i++) {
                if (i == position) {  // The index is the same position as one of the char
                    wordArray[i] = letter;
                    position = userWord.indexOf(letter, position + 1);
                }
           }
        }
        return convertToString(wordArray);
    }

    
    public static void main(String[] args) throws IOException {
        String shownWord = "***********";
        shownWord = checkChar("A", "Mississippi", shownWord);
        System.out.println(shownWord);
        
        shownWord = checkChar("P", "Mississippi", shownWord);
        System.out.println(shownWord);
        
        shownWord = checkChar("o", "Mississippi", shownWord);
        System.out.println(shownWord);
        
        shownWord = checkChar("M", "Mississippi", shownWord);
        System.out.println(shownWord);
        
        shownWord = checkChar("s", "Mississippi", shownWord);
        System.out.println(shownWord);
        
        String a = getWordFromFile(5);
        System.out.println(a);
    }
    
    
}
