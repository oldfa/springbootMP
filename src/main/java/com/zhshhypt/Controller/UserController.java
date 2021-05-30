package com.zhshhypt.Controller;


import com.zhshhypt.pojo.User;
import com.zhshhypt.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2021-05-29
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService iUserService;

    @RequestMapping(value="/getData")
    public List<User> getData(){
        List<User> list=iUserService.selectList(null);
        return list;
    }

    /**
     * @Description:根据id查询用户数据
     * @params: []
     * @return: com.zhshhypt.pojo.User
     * @Author: Administrator
     * @Date: 2021/5/30 0030
     */
    @RequestMapping(value="/getDataById")
    public User getDataById(){
        User user = iUserService.selectById("23432");
        return user;
    }

}
