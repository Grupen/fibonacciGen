
public class Main {
	public static void main(String[] args)
	{
		long first = 0;
		long second = 1;
		long third = 1;
		int counter = 4;
		for(int i=0; i<90;i++){
			
			first=second;
			second=third;
			third=first+second;
			System.out.println(third);
			System.out.println(counter+": ");
			counter++;
		}
	}
}
