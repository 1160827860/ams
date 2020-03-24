package com.ams.redis;
/**
 * @Description redis键的顶类
 * @author darksouls_lzy
 * @date 2020/3/20
 * @version 0.0.1
 */
public interface KeyPrefix {
    /**
     * 设计过期时间，单位秒
     * @return 过期时间
     */
    int expireSeconds();

    /**
     * 获取键的内容
     * @return 键的内容
     */
    String getPrefix();
}
