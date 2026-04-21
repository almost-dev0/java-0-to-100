//This program explores the calculation of total surface area of cuboid through hardcoded l,b,h value

public class tsa_cuboid_hardcoded
{
    public static void main(String[] args) 
    {
        double dLength = 5;
        double dWidth  = 10;
        double dHeight  = 15;
        double dTSA = 2*((dLength * dWidth) + (dWidth * dHeight) + (dLength * dHeight));
        
        System.out.println("Total Surface Area of Cuboid is : "+dTSA);
    }    
}
