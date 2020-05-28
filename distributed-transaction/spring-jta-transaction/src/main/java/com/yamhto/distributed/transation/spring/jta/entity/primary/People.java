package com.yamhto.distributed.transation.spring.jta.entity.primary;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author yamhto
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("people")
public class People implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String age;

    private String higher;

    private String password;

    private String username;


}
