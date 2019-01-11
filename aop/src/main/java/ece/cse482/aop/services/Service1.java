package ece.cse482.aop.services;

import ece.cse482.aop.aspects.TrackTime;
import ece.cse482.aop.daos.Dao1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service1 {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Dao1 dao1;

    @TrackTime
    public String performService() {
        logger.info("Calling service-1 perform service {}",dao1.retrieveData());
        return "Service-1";
    }
}
