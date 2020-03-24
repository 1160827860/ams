package com.ams.repository;

import java.util.List;

import com.ams.domain.User;

/**
 * User Repository 接口.
 */
public interface UserRepository {
	/**
	 * 新增或者修改用户
	 * @param user
	 * @return
	 */
	User saveOrUpateUser(User user);
	
	/**
	 * 删除用户
	 * @param id
	 */
	void deleteUser(Long id);
	
	/**
	 * 根据用户id获取用户
	 * @param id
	 * @return
	 */
	User getUserById(Long id);
	
	/**
	 * 获取所有用户的列表
	 * @return
	 */
	List<User> listUser();
}
