package com.company.service.iservice;

import com.company.service.vo.PageVO;

import java.util.List;

public interface UserService {
    /**
     *
     * @param userId
     * @return
     */
    public User findById(Integer userId);
    public String save(User user);
    public String update(User user);
    public String delete(User user);
    public List<User> findByPage(PageVO pageVO);
    public List<User> findAll();
    public List<User> findByName(String username);
    public void sessionCache();
}
