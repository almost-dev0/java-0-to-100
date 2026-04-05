//In this program we explore types of int data type, i.e byte, short, int, long

class int_types 
{
    public static void main(String[] args) 
    {
        /*
        byte size     : 1 byte
        byte range    : -2^7 to 2^7 - 1
        Numeric value : -128 to 127
        */
        byte num1 = 45;
        System.out.println(num1);


        /*
        short size    :  2 bytes
        short range   : -2^15 to 2^15 - 1
        Numeric value : -32768 to 32767
        */
        short num2 = 32767;
        System.out.println(num2);


        /*
        int size      :  4 bytes
        int range     : -2^31 to 2^31 - 1
        Numeric value : -2,147,483,648 to 2,147,483,647
        */
        int num3 = 2045575554;
        System.out.println(num3);


        /*
        long size     : 8 bytes
        long range    : -2^63 to 2^63 - 1
        Numeric value : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        */
        long num4 = 494643151565L;  //in case of long use L at end of number
        System.out.println(num4);
    }
}
