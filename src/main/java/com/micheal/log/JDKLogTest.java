package com.micheal.log;

import java.util.logging.Logger;

/**
 * @author wangting
 * @version 1.0
 * @ClassName: JDKLogTest
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019/5/23 0023 上午 11:41
 */
public class JDKLogTest {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("JDKLOG");

        logger.info("JDK Log 测试");
    }
}
