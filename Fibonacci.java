package Java50Codes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fibonacci {
	static Logger log = LoggerFactory.getLogger(Fibonacci.class);

	public static void main(String[] args) {

		int n1 = 0, n2 = 1, sum = 0;
		log.info(n1 + " " + n2);
		for (int i = 2; i <= 10; i++) {
			sum = n1 + n2;
			log.info("" + sum);
			n1 = n2;
			n2 = sum;
		}

	}

}
