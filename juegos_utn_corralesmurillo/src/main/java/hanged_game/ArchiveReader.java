/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hanged_game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArchiveReader {
    File theWords;
    
    
    public void createFile() throws IOException {
        theWords = new File("wordList.txt");
    }
    
    
    public String readInFile(int numberLetter) throws FileNotFoundException, IOException {
        FileReader reader = new FileReader(theWords);
        String word = "";
        String line;
        BufferedReader bufferReader = new BufferedReader(reader);
        while ("".equals(word)) {
            while ((line = bufferReader.readLine()) != null) {
                if (numberLetter == line.length()) {
                    int doIchooseIt = (int) (Math.random() * 10) + 1;
                    if (doIchooseIt == 5) {
                        word = line;
                    }
                }
            }
        }
        bufferReader.close();
        return word;
    }
}
