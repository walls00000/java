package spring;

import java.math.BigInteger;

public final class Hello {

	
	public static void main(String[] args) throws Exception {
		
		BigInteger a = new BigInteger("2");
		int b = 0;
		Double x = new Double(Math.pow(a.intValue(), b));
		System.out.println(String.format("a=%d, b=%d, x=%d", a,b,x.intValue()));
	}
}
