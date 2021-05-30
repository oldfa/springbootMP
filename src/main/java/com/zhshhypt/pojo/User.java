package com.zhshhypt.pojo;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2021-05-29
 */
@Data
@EqualsAndHashCode(callSuper =false)
@TableName("tb_user")
public class User  {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String age;

    private String address;


}
