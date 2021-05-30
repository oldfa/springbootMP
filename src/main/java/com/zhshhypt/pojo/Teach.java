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
@EqualsAndHashCode(callSuper = false)
@TableName("tb_teach")
public class Teach  {

    private static final long serialVersionUID = 1L;

    private String id;

    private String teach_name;

    private String teach_age;

    private String teach_address;

    private String teach_status;

    private String teach_curros;


}
