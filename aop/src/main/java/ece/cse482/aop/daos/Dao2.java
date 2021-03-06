package ece.cse482.aop.daos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public String retrieveData() {
        logger.info("Calling Dao-2 retrieveData");
        return "Dao-2";
    }
}
