package com.bili.service;

import java.util.List;

import com.bili.model.User;

public interface IUserService {

	/**
	 * 获取个人明细
	 * @param userId
	 * @return
	 */
	public User getUserInfoById(int userId);
	
	/**
	 * 添加个人明细
	 * @param user
	 * @return
	 */
	public int addUser(User user);
	
	/**
	 * 删除个人明细
	 * @param userId
	 * @return
	 */
	public boolean delUser(int userId);
	
	/**
	 * 更新个人信息
	 * @param user
	 * @return
	 */
	public boolean updateUser(User user);
	
	/**
	 * 获取个人信息
	 * @return
	 */
	public List<User> getUsersInfo();
}
