public class float_ 
{
    public static void main(String[] args) 
    {
        //DOUBLE occupies 8 bytes
        double num = 58.55997;
        System.out.println(num);
        
        /*
        Since default for decimal numbers in java is double, below code will show error
        float num2 =5.885;
        
        IF YOU WANT TO USE FLOAT INSTEAD OF DOUBLE,
        EXPLICITLY MENTION 'f' AT THE END OF NUMBER
        see the code below
        */

        //FLOAT occupies 4 bytes 
        float num2 =5.5646f;            //explicit 'f' after 5.5646
        System.out.println(num2);

    }
}
