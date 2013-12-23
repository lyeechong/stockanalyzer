/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototyping.YahooSingleThreadTest;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author shen
 */
public class temp
{

    public static void main(String[] args) throws Exception
    {
        Scanner file = new Scanner(new File("temp"));
        while (file.hasNextLine())
        {
            String line = file.nextLine();
            String symbol = line.substring(0, 2).trim();
            String desc = line.substring(3).trim();
            String id = desc.trim().replaceAll("\\W", "_").toUpperCase();
            System.out.println(id + "(\"" + symbol + "\", \"" + desc + "\"),");
        }
    }
}
