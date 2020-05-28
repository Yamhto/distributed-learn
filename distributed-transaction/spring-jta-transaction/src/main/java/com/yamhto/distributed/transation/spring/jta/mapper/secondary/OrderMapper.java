package com.yamhto.distributed.transation.spring.jta.mapper.secondary;

import com.yamhto.distributed.transation.spring.jta.entity.secondary.Order;
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
public interface OrderMapper extends BaseMapper<Order> {

    @Insert("INSERT INTO `order`(ordername,num,price) VALUES(#{ordername},#{num},#{price})")
    public void saveOne(@Param("ordername") String ordername, @Param("num") String num, @Param("price") String price);

}
