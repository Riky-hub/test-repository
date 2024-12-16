import org.junit.Assert;
import org.junit.Test;


public class testCalcolatrice {
	public void testSomma()
	{
		Calcolatrice c= new Calcolatrice();
		double res = c.somma(5,6);
		Assert.assertEquals(11,res,0);
	}
	
	public void testSomma2()
	{
		Calcolatrice c= new Calcolatrice();
		double res = c.somma(5,6);
		Assert.assertEquals(11,res,0);
	}

}
