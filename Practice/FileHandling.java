package com.company.Practice;

// Creating a text File using FileWriter
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.FileWriter;
import java.io.IOException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;
import java.util.Scanner.*;

class FileHandling
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        // Accept a string
        //String str = "File Handling in Java using "+
        //        " FileWriter and FileReader";

        // attach a file to FileWriter
        FileWriter fw=new FileWriter("output.txt");


        // into FileWriter
        for (int i = 0; i < msg.length(); i++)
            fw.write(msg.charAt(i));

        System.out.println("Writing successful!");
        //close the file
        fw.close();

        // variable declaration
        int ch;

        // check if File exists or not
        FileReader fr=null;
        try
        {
            fr = new FileReader("output.txt");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
        System.out.println("Wait, reading...");
        while ((ch=fr.read())!=-1)
            System.out.print((char)ch);
        fr.close();

    }
}

