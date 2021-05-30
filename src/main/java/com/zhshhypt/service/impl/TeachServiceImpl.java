package com.zhshhypt.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zhshhypt.mapper.TeachMapper;
import com.zhshhypt.pojo.Teach;
import com.zhshhypt.service.ITeachService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2021-05-29
 */
@Service
@Transactional
public class TeachServiceImpl extends ServiceImpl<TeachMapper, Teach> implements ITeachService {

}
