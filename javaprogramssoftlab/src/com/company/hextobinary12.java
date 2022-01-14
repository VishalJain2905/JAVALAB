package com.company;

class GFG1 {

    // method to convert Decimal to Binary
    String decimalToBinary(int decimal)
    {

        // variable to store the converted
        // binary string
        String binaryString = "";

        // loop to generate the binary
        while (decimal != 0) {

            // concatenating the remainder
            // on dividing by 2 to the
            // binary string
            binaryString = (decimal % 2) + binaryString;

            // updating the decimal integer
            // by dividing by 2 in each iteration
            decimal /= 2;
        }

        // loop to ensure that each
        // Hexadecimal character is
        // represented by 4 bits
        while (binaryString.length() % 4 != 0) {
            // adding leading 0's if the
            // character is represented by less
            // than 4 bits
            binaryString = "0" + binaryString;
        }

        // returning the converted binary string
        return binaryString;
    }

    // method to convert Hexadecimal to Binary
    String hexToBinary(String hexadecimal)
    {

        // declaring the variables
        int i;
        char ch;
        String binary = "";
        int returnedBinary;

        // converting the accepted Hexadecimal
        // String to upper case
        hexadecimal = hexadecimal.toUpperCase();

        // loop to iterate through the length
        // of the Hexadecimal String
        for (i = 0; i < hexadecimal.length(); i++) {

            // extracting the characters
            ch = hexadecimal.charAt(i);

            // condition to check if
            // the character is not a valid Hexadecimal
            // character
            if (Character.isDigit(ch) == false
                    && ((int)ch >= 65 && (int)ch <= 70)
                    == false) {

                // returning Invalid Hexadecimal
                // String for the invalid Hexadecimal
                // character
                binary = "Invalid Hexadecimal String";
                return binary;
            }

            // checking if the character is a valid
            // Hexadecimal alphabet
            else if ((int)ch >= 65 && (int)ch <= 70)

                // converting alphabet to
                // corresponding value such as 10
                // for A and so on using ASCII code
                returnedBinary = (int)ch - 55;
            else
                returnedBinary
                        = Integer.parseInt(String.valueOf(ch));

            // converting the decimal to binary
            // by calling the decimalToBinary() method
            binary += decimalToBinary(returnedBinary);
        }

        // returning the converted binary sequence
        return binary;
    }

    // Driver Code
    public static void main(String[] args)
    {

        // instantiating the class
        GFG2 ob = new GFG2();

        String hex = "abcfde";

        System.out.println(hex);

        // printing and calling the
        // hexToBinary() function to display the
        // output
        System.out.println(ob.hexToBinary(hex));
    }
}
