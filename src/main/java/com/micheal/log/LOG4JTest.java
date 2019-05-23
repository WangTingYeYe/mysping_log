package com.micheal.log;

import org.apache.log4j.Logger;

/**
 * @author wangting
 * @version 1.0
 * @ClassName: LOG4JTest
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019/5/23 0023 上午 11:15
 */
public class LOG4JTest {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("LO4J");
        logger.info("LO4J 测试");
    }
}
