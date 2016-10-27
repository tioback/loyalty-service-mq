package br.ufsc.grad.renatoback.tcc.loyalty.service.mq;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service
public class LoyaltyService {

	private Log logger = LogFactory.getLog(LoyaltyService.class);

	AtomicInteger counter = new AtomicInteger();

	public void createPointsBalance(String time) {
		logger.info(String.format("OK Loyalty #%d after %d ns", counter.incrementAndGet(),
				System.nanoTime() - Long.parseLong(time)));
	}

}
