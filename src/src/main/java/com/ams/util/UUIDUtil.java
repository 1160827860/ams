package com.ams.util;

import java.util.UUID;

/**
 * @Description 用于生成UUID
 * @author darksouls_lzy
 * @date 2020/3/20
 * @version 0.0.1
 */
public class UUIDUtil {
	public static String uuid() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}
