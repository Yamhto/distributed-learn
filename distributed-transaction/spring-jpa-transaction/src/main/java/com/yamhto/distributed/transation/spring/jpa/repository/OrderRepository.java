package com.yamhto.distributed.transation.spring.jpa.repository;

import com.yamhto.distributed.transation.spring.jpa.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author yamhto
 * @className: OrderRepository.java
 * @package com.yamhto.distributed.transation.spring.jpa.repository
 * @description:
 * @date 2020/5/28 10:51
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long>, JpaSpecificationExecutor<Order> {
}
