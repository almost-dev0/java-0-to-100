//This program explores the calculation of volume of sphere through hardcoded radius value

public class vol_sphere_hardcoded 
{
    public static void main(String[] args) 
    {
        double dRadius = 15;
        double dVolume = (4.0 * Math.PI * Math.pow(dRadius, 3) )/3.0;
        
        System.out.println("Volume of sphere is : "+dVolume);
    }    
}
