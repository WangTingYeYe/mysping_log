package com.micheal.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wangting
 * @version 1.0
 * @ClassName: SL4JLogTest
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019/5/23 0023 上午 11:11
 */
public class SL4JLogTest {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("SL4J");
        logger.info("SL4J 测试开始");
    }
}
