package WrapperClasses;
public class Wrapper1
{
	public static void main(String[] args) 
	{
		byte ab=45;
		Byte ob1=new Byte(ab);
		Byte ob2=new Byte("3");
		short b=34;
		Short ob3=new Short(b);
		Short ob4=new Short("56");
		Integer ob5=new Integer(89);
		Integer ob6=new Integer("98");
		Long ob7=new Long(7789);
		Long ob8=new Long("7789");
		Float ob9=new Float(45);
		Float bo1=new Float(45.778f);
		Float bo2=new Float("34.7839");
		Double bo3=new Double(45.449);
		Double bo4=new Double("34.678");
		Character bo5=new Character('7');
		Boolean bool1=new Boolean(true);
		Boolean bool2=new Boolean("true");
		byte b1=ob1.byteValue();
		byte b2=ob2.byteValue();
		short s1=ob3.shortValue();
	}

}
