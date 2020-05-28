package com.yamhto.distributed.transation.spring.jta.mapper.primary;

import com.yamhto.distributed.transation.spring.jta.entity.primary.People;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yamhto
 * @since 2020-05-28
 */
public interface PeopleMapper extends BaseMapper<People> {
    @Insert("INSERT INTO people(username,password,age,higher) VALUES(#{username},#{password},#{age},#{higher})")
    public void saveOne(@Param("username") String username, @Param("password") String password, @Param("age") String age, @Param("higher") String higher);
}
