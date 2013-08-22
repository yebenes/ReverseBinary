
public class ReverseBinary {
	
	public static int reverseNumber(Integer number) throws IllegalArgumentException {
		if(number == null) throw new IllegalArgumentException()
		Integer.parseInt(Integer.toString(number, 2).reverse(), 2)
	}
}
