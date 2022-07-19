package hanged_game;

import java.io.IOException;
import java.util.Scanner;

public class GameLogicHanged {
    Scanner read = new Scanner(System.in);
    
    public static String getWordFromFile(int amountChar) throws IOException { //this method gets a random word from the file, with X number of characters
        ArchiveReader archiveReader = new ArchiveReader();
        archiveReader.createFile();
        String word = archiveReader.readInFile(amountChar);
        return word;
    }
    
    
    public static String makeIncognito(String originalWord) { //Transforms the originalWord for a word of same lenght, filled with *
        String incognitoWord = "";
        for (int i = originalWord.length(); i > 0; i--) {
            incognitoWord += " _ ";
        }
        return incognitoWord;
    }
    
    public static String checkChar(String letter, String userWord, String shownWord) { //this method verifies a char input from the user is in the word, and returns the string without those blank spaces
        
        letter = letter.toUpperCase();
        userWord = userWord.toUpperCase(); //I uppercased everything to maintaing homogeneity
        String[] wordArray = shownWord.split(""); //make an array to show eventually to the user
        
        int position = userWord.indexOf(letter);
        
        if (userWord.contains(letter)) {
            for(int i = 0; userWord.length() > i; i++) {
                if (i == position) {  // The index is the same position as one of the char
                    wordArray[i] = " " + letter + " ";
                    position = userWord.indexOf(letter, position + 1);
                }
           }
        }
        return convertToString(wordArray);
    }

    
    public static String convertToString(String[] array){ //Converts the array to a String, without the brakets
        String temporalWord = "";
        for (int i = 0; array.length > i; i ++) {
            temporalWord += array[i];
        }
        return temporalWord;
    }
    
    
    public static void main(String[] args) throws IOException {
        String newWord = getWordFromFile(5);
        String shownWord = makeIncognito(newWord);
        shownWord = checkChar("a", newWord, shownWord);
        System.out.println(shownWord);
        
        shownWord = checkChar("b", newWord, shownWord);
        System.out.println(shownWord);
        
        shownWord = checkChar("c", newWord, shownWord);
        System.out.println(shownWord);
        
        shownWord = checkChar("d", newWord, shownWord);
        System.out.println(shownWord);
        
        shownWord = checkChar("e", newWord, shownWord);
        System.out.println(shownWord);
    }
}
