package com.zhshhypt.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zhshhypt.mapper.UserMapper;
import com.zhshhypt.pojo.User;
import com.zhshhypt.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2021-05-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
