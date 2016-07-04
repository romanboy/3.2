/*************************************************************************************
 About: This program is written as part of the fulfilment for the ‘Data Structure and Algorithms’
 Course - HND in CSD at Icon College, London.
 Date : June 2016
 By : Radu Ciuca. Student ID: 13448
 *************************************************************************************/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Program {
    public static boolean isPalindrome(String strInput, boolean isCaseSensitive) throws Exception {
        // var to return
        boolean isPalindrome = false;
        //remove spaces
        strInput = strInput.replace(" ", "");
        //If not case sensitive then convert the entire string to uppercase
        if (!isCaseSensitive)
        {
            strInput = strInput.toUpperCase();
        }
        else
        {

        }

        int strLength = strInput.length();
        for (int start = 0, end = strLength - 1;start < end;start++, end--)
        {
            if (strInput.charAt(start) != strInput.charAt(end))
            {
                isPalindrome = false;

                break;
            }
            else
            {
                isPalindrome = true;

            }
        }
        return isPalindrome;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String");
        String userInputString = br.readLine();
        try {
            isPalindrome(userInputString, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("done.");
    }

}