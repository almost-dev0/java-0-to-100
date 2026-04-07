/*
this program explores how we can perform mathematical operations on 
char, and it will yield result in ASCII values
*/

public class char_operations 
{
    public static void main(String[] args) 
    {
        char ch = 'a';
        ch++;               //this will output next alphabet
        System.out.println(ch);

        /*
        if we try to add/subtract/multiply/divide INTEGER FROM CHARACTER, it will just perform
        the operations on the character's ASCII value, and also OUTPUT AN ASCII VALUE
        */
        System.out.println(ch+1);
        System.out.println(ch-1);
        System.out.println(ch*2);
        System.out.println(ch/2);

        
    }
}
