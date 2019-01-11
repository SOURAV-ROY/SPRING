package ece.cse482.aop.services;

import ece.cse482.aop.daos.Dao2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service2 {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Dao2 dao2;

    public String performService() {
        logger.info("Calling service-2 perform service {}",dao2.retrieveData());
        return "Service-2";
    }
}
