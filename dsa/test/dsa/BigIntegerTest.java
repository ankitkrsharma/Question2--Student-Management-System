package dsa;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import biginteger.BigPrimeCheck;

class BigIntegerTest {

	@Test
	void test() {
		assertEquals(true,BigPrimeCheck.primeCheck(BigInteger.valueOf(2)));
	}

}
