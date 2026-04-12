//this program explores how typecasting works in java

class typecasting 
{
    public static void main(String[] args) 
    {
        int a =10;
        byte b = 25; 
        /*
            here we say typecast 'a' to byte (change its datatype) and store value into b
            now this will result in 'a' being 'downcasted'
        */
        b = (byte) a;
        System.out.println(b);



        int  c = 1500;
        byte d = 85;

        /*
            now this here will not generate error but false value; because even though you downcast int to byte,
            the value of c , i.e. 1500 will still remain above the byte range so it will just print a random number 
            instead of 1000
        */
        d = (byte) c;
        System.out.println(d);


        //UPCASTING is done IMPLICITLY, no need to write it explicitly in your code
        
    }    
}
