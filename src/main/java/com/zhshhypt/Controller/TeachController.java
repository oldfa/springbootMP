package com.zhshhypt.Controller;


import com.zhshhypt.pojo.Teach;
import com.zhshhypt.service.ITeachService;
import com.zhshhypt.util.BaseControl;
import com.zhshhypt.util.RETCODE;
import net.sf.json.JSONArray;
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
 * 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2021-05-29
 */
@RestController
@RequestMapping("/teach")
public class TeachController  extends BaseControl {
    @Resource
    private ITeachService iTeachService;

    @RequestMapping(value = "/getData")
    public JSONArray getData() {
        List<Teach> list = iTeachService.selectList(null);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray;
    }
        /**
         * @Description:
         * @params: []
         * @return: com.zhshhypt.pojo.Teach
         * @Author: Administrator
         * @Date: 2021/5/30 0030
         */
    @RequestMapping(value="/getDataById")
    public Teach getDatas(){
        Teach teach=iTeachService.selectById("123");
        return teach;
    }

    @RequestMapping(value ="/InserLine")
    public void InsertData(HttpServletResponse response, HttpServletRequest request){
        JSONObject ret=new JSONObject();
        Teach teach= null;
        try {
            teach = new Teach();
            teach.setId(UUID.randomUUID().toString().replaceAll("-",""));
            teach.setTeach_name("车老师");
            teach.setTeach_age("26");
            teach.setTeach_address("兰州");
            teach.setTeach_curros("语文");
            teach.setTeach_status("执行");
            iTeachService.insert(teach);
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
