package com.yamhto.distributed.transation.spring.jpa.repository;

import com.yamhto.distributed.transation.spring.jpa.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author yamhto
 * @className: PeopleRepository.java
 * @package com.yamhto.distributed.transation.spring.jpa.repository
 * @description:
 * @date 2020/5/28 10:50
 */
@Repository
public interface PeopleRepository extends JpaRepository<People, Long>, JpaSpecificationExecutor<People> {
}
