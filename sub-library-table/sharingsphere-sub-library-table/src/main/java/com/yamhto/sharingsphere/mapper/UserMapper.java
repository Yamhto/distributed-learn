package com.yamhto.sharingsphere.mapper;

import com.yamhto.sharingsphere.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yamhto
 * @since 2020-06-02
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Insert("INSERT INTO user(city_id,sex,username) VALUES(#{city_id},#{sex},#{username})")
    public void saveOne(@Param("username") String username, @Param("city_id") Integer city_id, @Param("sex") String sex);
}
