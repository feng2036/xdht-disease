package com.xdht.disease.common.configure;

import org.apache.log4j.Logger;

/**
 *
 * @author lzf
 * @date 2017/9/4
 */
public class DataSourceContextHolder {

    private static final Logger log=Logger.getLogger(DataSourceContextHolder.class);

    public static final String DATA_SOURCE_WRITE = "WRITE";
    public static final String DATA_SOURCE_READ = "READ";

    /**
     * 线程本地环境
     */
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();
    /**
     * 设置数据源类型
     */
    public static void setType(String type) {
        if(log.isDebugEnabled()) {
            log.debug("==============切换数据源，类型：" + type + "================");
        }
        CONTEXT_HOLDER.set(type);
    }
    /**
     *获取数据源类型
     */
    public static String getType() {
        return (CONTEXT_HOLDER.get());
    }
    /**
     * 清除数据源类型
     */
    public static void clearType() {
        CONTEXT_HOLDER.remove();
    }
}