package com.ams.redis.keys;


import com.ams.redis.BasePrefix;

/**
 * @Description 存储用户信息的key
 * @author darksouls_lzy
 * @date 2020/3/20
 * @version 0.0.1
 */
public class UserKey extends BasePrefix {
	/**
	 * token的过期时间
	 */
	public static final int TOKEN_EXPIRE = 3600*24 * 2;
	public static UserKey getById = new UserKey(0,"id");
	public static UserKey token = new UserKey(TOKEN_EXPIRE,"tk");
	public static UserKey getByPh = new UserKey(0,"ph");
	/**
	 * 防止缓存穿透
	 */
	public static UserKey getByPhNull = new UserKey(10,"ph");

	public UserKey(int expireSeconds, String prefix) {
		super(expireSeconds, prefix);
	}

	private UserKey(String prefix) {
		super(prefix);
	}


}
