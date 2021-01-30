//Write a JAVA program that swaps the case of the alphabets of the string,
//
//For eg,  => “heLLo WOrLd” => “HEllO woRlD”.

import java.util.*;

public class taskfivesix
{
public static void main(String[] args)
{
    String str ="heLLO WOrLd";
    String result = " ";


    for( int i=0; i<str.length(); i++)
    {
        char ch = str.charAt(i);
        if(Character.isUpperCase(ch))
        {
            result = result + Character.toLowerCase(ch);
        }
        else
        {
            result = result + Character.toUpperCase(ch);
        }
    }
    System.out.println(" Original String:" + str);
    System.out.println(" The result is:" + result);
}
}
