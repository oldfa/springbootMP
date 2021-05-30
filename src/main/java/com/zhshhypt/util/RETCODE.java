package com.zhshhypt.util;

/**
 *  @Description:
 *  @Author: RETCODE
 *  @Date: 2021/5/30 0030
 */
public enum RETCODE {
    R200("R200","操作成功"), R400("R400","数据校验错误"), R500("R500","系统错误，请联系管理员"), R503("R503","登陆失效，请重新登陆后操作");

    String code = null;
    String msg = null;

    RETCODE(String code,String msg) {
        this.code = code;
        this.msg = msg;
    }




    public String getCode() {
        return code;
    }




    public String getMsg() {
        return msg;
    }




    /**
     *
     * Description: {重写tostring方法}
     *
     * @param:
     * @return: String
     * @throws:
     * @see: com.zhsh.base.utils
     * @author: zhsh
     * @date: 2019-12-16 Note: Nothing much.
     */
    @Override
    public String toString() {
        return this.code;
    }

};

