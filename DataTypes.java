
/**
 * Write a description of class DataTypes here.
 *
 * @author (Parker)
 * @version (14/02/2023)
 */
public class DataTypes
{
    public int x1 = 1;
    public int x2 = 2;
    public float f1 = 1.1f;
    public float f2 = 2.1f;
    public long l1 = 1000000000000000000l;
    public long l2 = 2000000000000000000l;
    public double d1 = 1.99999999999999;
    public double d2 = 2.99999999999999;
    public byte b1 = 127;
    public byte b2 = 100;
    public short s1 = 32767;
    public short s2 = 32700;
    public char cA = 'A';
    public char cB = 'B';
    public boolean bT = true;
    public boolean bF = false;
    
    public DataTypes()
    {
        System.out.println(x1 + x2);
        //System.out.println(l1 + bF); doesnt work
        System.out.println(f1 + x2);
        System.out.println(b2 * f2);//??? max value for byte is 127 but prints 209
        System.out.println(l1 * d2);//turns into float?
        System.out.println(cA + cB);//adds together ASCII values of the characters to get 131
        System.out.println(d1 * d2);
        System.out.println(cA * b2);
        //System.out.println(bF * cB); doesnt work
        
    }
}
