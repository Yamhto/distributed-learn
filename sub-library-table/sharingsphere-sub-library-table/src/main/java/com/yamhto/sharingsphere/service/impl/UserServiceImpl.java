package com.yamhto.sharingsphere.service.impl;

import com.yamhto.sharingsphere.entity.User;
import com.yamhto.sharingsphere.mapper.UserMapper;
import com.yamhto.sharingsphere.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yamhto
 * @since 2020-06-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void saveOne(User user) {
         userMapper.saveOne(user.getUsername(), user.getCityId(), user.getSex());
    }
}
