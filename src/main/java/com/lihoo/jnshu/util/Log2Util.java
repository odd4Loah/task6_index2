package com.lihoo.jnshu.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.stereotype.Component;

/**
 * #Title: Log4Util
 * #ProjectName task6_index2
 * #Description: 我的通用日志工具
 * #author lihoo
 * #date 2018/9/15-15:17
 */

@Component
public class Log2Util {
    public static Logger logger = (Logger) LogManager.getLogger(Log2Util.class);
}
