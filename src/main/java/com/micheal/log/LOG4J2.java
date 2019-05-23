package com.micheal.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author wangting
 * @version 1.0
 * @ClassName: LOG4J2
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019/5/23 0023 上午 11:49
 */
public class LOG4J2 {
    public static void main(String[] args) {
        Logger log4J2 = LogManager.getLogger("LOG4J2");
        log4J2.error("log4J2 测试");

    }
}
