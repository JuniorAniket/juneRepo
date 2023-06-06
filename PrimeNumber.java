package Java50Codes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimeNumber {
	static Logger log = LoggerFactory.getLogger(PrimeNumber.class);

	public static void main(String[] args) {

		int num = 20;
		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2) {
				log.info("Prime Number");
			} else {
				log.info("Not a Prime Number");

			}
		} else {

			log.info("Not a Prime Number");
		}

	}

}
