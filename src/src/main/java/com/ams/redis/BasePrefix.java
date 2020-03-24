package com.ams.redis;
/**
 * @Description 实现KeyPrefix的虚拟类，redis数据库的key分类
 * @author darksouls_lzy
 * @date 2020/3/20
 * @version 0.0.1
 */
public abstract class BasePrefix implements KeyPrefix{
	
	private int expireSeconds;
	
	private String prefix;

	/**
	 * 0默认永不过期
	 * 永不过期的构造方法
	 * @param prefix
	 */
	public BasePrefix(String prefix) {//0代表永不过期
		this(0, prefix);
	}

	/**
	 * 带有过期时间的构造方法
	 * @param expireSeconds 过期时间
	 * @param prefix 用户自定键
	 */
	public BasePrefix(int expireSeconds, String prefix) {
		this.expireSeconds = expireSeconds;
		this.prefix = prefix;
	}

	@Override
	public int expireSeconds() {
		return expireSeconds;
	}

	/**
	 * 默认组成为类名加键名
	 * @return
	 */
	@Override
	public String getPrefix() {
		String className = getClass().getSimpleName();
		return className+":" + prefix;
	}

}
