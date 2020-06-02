package com.yamhto.sharingsphere.service;

import com.yamhto.sharingsphere.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yamhto.sharingsphere.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yamhto
 * @since 2020-06-02
 */
public interface UserService extends IService<User> {

   void saveOne(User user);

}
