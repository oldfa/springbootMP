package com.zhshhypt.Controller;


import com.zhshhypt.pojo.User;
import com.zhshhypt.service.IUserService;
import com.zhshhypt.util.BaseControl;
import com.zhshhypt.util.RETCODE;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.UUID;

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
public class UserController extends BaseControl {
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
    /**
     * @Description:用户添加信息
     * @params: [response, request]
     * @return: void
     * @Author: Administrator
     * @Date: 2021/5/30 0030
     */
    @RequestMapping(value ="/InserLine")
    public void InsertData(HttpServletResponse response, HttpServletRequest request){
        JSONObject ret=new JSONObject();
        User user= null;
        try {
            user = new User();
            user.setId(UUID.randomUUID().toString().replaceAll("-",""));
            user.setName("cyz");
            user.setAge("25");
            user.setAddress("兰州");
            iUserService.insert(user);
            ret.put("code", RETCODE.R200);
            ret.put("msg","插入成功...");
        } catch (Exception e) {
            e.printStackTrace();
            ret.put("code",RETCODE.R400);
            ret.put("msg",e.getMessage());
        }
        write(response,ret.toString());
    }

}
