
import java.math.BigInteger;
public class App {
	public static void main(String[] args)
	{
		BigInteger first = BigInteger.valueOf(0);
		BigInteger second = BigInteger.valueOf(1);
		BigInteger third = BigInteger.valueOf(1);
		int counter = 4;
		for(int i=0; i<900000;i++){
			
			first=second;
			second=third;
			third = first.add(second);
			System.out.println(third);
			System.out.println(counter+": ");
			counter++;
		}
	}
}
