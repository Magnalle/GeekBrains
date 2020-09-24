/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Valentina
 */
public class Task6 {

    /**
     * @param args the command line arguments
     */
    static int fileLength = 200;
    public static void createRandomFile(String fileName) throws FileNotFoundException, IOException
    {    
        PrintStream printStream = new PrintStream(new FileOutputStream(fileName), true, "windows-1251");
        StringBuilder string = new StringBuilder();
       
        Random rand = new Random();
        for(int i = 0; i < fileLength; i++)
            string.append((char)(rand.nextInt('Я' - 'А') + 'А'));
        printStream.print(string.toString());
        printStream.close();
    }
    public static void MergeFiles(String mergedFile, String fileName1, String fileName2) throws FileNotFoundException
    {
        Scanner[] scanners = new Scanner[2];
        
        scanners[0] = new Scanner(new FileInputStream(fileName1));
        scanners[1] = new Scanner(new FileInputStream(fileName2));
 
        PrintStream printStream = new PrintStream(new FileOutputStream(mergedFile));
        for(int i = 0; i < 2; i++)
        {
            while(scanners[i].hasNextLine())
                printStream.print(scanners[i].nextLine());                
            scanners[i].close();
        }
        printStream.close();
    }
    
    public static boolean findWordInFile(String fileName, String word, String dividers) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(new FileInputStream(fileName));
        StringBuilder curString = new StringBuilder("");
        //for(int i = 0; i < dividers.length(); i++)
        scanner.useDelimiter("");
        while(scanner.hasNext())
        {
            String cur = scanner.next();
            //cur.toUpperCase()
            if(dividers.indexOf(cur) != -1)
            {
                if(curString.toString().toUpperCase().equals(word.toUpperCase()))
                {
                    scanner.close();
                    return true;
                }
                curString.delete(0, curString.length());
            }
            else
                curString.append(cur);
        }
        scanner.close();
        return false;
    }
    
    public static boolean findWordInFolder(ArrayList<String> foundInFiles, String fileName, String word, String dividers) throws FileNotFoundException
    {
        File folder = new File(fileName);
        if(!folder.isDirectory())
        {
            if (findWordInFile(fileName, word, dividers))
            {
                foundInFiles.add(fileName);
                return true;
            }
        }
        else
        {
            boolean result = false;
            File[] folderEntries = folder.listFiles();
            for (File entry : folderEntries)
            {
                result = findWordInFolder(foundInFiles, entry.getPath(), word, dividers) || result;          
            }
            return result;
        }
        return false;
    }
    public static void main(String[] args) {
        String fileName1 = "I:\\Java Projects\\Task6\\src\\task6\\file1.txt",
                fileName2 = "I:\\Java Projects\\Task6\\src\\task6\\file2.txt",
                mergedFile = "I:\\Java Projects\\Task6\\src\\task6\\mergedFile.txt",
                fileName3 = "I:\\Java Projects\\Task6\\src\\task6\\file3.txt",
                dividers = " ,.;\n\t()",
                folderName = "I:\\Java Projects\\Task6\\src\\task6",
                word = "слово";
         
        try
        {
            word = new String("слово".getBytes("windows-1251"), "windows-1251");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            createRandomFile(fileName1);
            createRandomFile(fileName2);
        }
        catch(Exception e)
        {
            System.out.println("Ошибка при создании случайных файлов!");
            e.printStackTrace();
        }
        
        try
        {
            MergeFiles(mergedFile, fileName1, fileName2);
        }
        catch(Exception e)
        {
            System.out.println("Ошибка при слиянии файлов!");
            e.printStackTrace();
        }
        
        try
        {
            boolean result = findWordInFile(fileName3, word, dividers);
            
            System.out.println("Слово '" + word + (result ? "' успешно " : "' не ") + "найдено в файле " + fileName3);
        }
        catch(Exception e)
        {
            System.out.println("Ошибка при открытии файла!");
            e.printStackTrace();
        }
        
        try
        {
            ArrayList<String> foundInFiles = new ArrayList<>();
            boolean result = findWordInFolder(foundInFiles, folderName, word, dividers);
            
            System.out.println("Слово '" + word + (result ? "' успешно " : "' не ") + "найдено в каталоге " + folderName + " в файлах:");
            for(String file : foundInFiles)
                System.out.println(file);
        }
        catch(Exception e)
        {
            System.out.println("Ошибка при открытии файла!");
            e.printStackTrace();
        }
        
    }
    
}
