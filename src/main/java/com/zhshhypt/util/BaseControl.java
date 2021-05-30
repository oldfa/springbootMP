package com.zhshhypt.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * Description: {基本控制器实现,包括自定义参数的获取与response的写出格式}
 *
 * @throws:
 * @see: com.zhshhypt.util
 * @author: zhsh
 * @date: 2019-12-16 Note:
 */
public class BaseControl{
    /**
     *
     * Description: {通过key值获取请求传输过来的value}
     *
     * @param: HttpServletRequest request,String param,String defauleValue
     *         param:key值;defauleValue:默认值
     * @return: String getRequestParameter
     * @throws:
     * @see: com.zhshhypt.util
     * @author: zhsh
     * @date: 2019-12-16 Note: 当key对应的value为null时，返回defauleValue
     */
    public String getRequestParameter(HttpServletRequest request, String param, String defauleValue) {
        return request.getParameter(param) == null ? defauleValue : request.getParameter(param);
    }

    /**
     *
     * Description: {response写出html}
     *
     * @param: HttpServletResponse response,String outStr outStr:需要写出的字符串
     * @return:
     * @throws: IOException
     * @see: com.zhshhypt.util
     * @author: zhsh
     * @date: 2019-12-16 Note: Nothing much.
     */
    public void write(HttpServletResponse response, String outStr) {
        response.setContentType("text/html;charset=UTF-8");
        try {
            PrintWriter writer = response.getWriter();
            writer.write(outStr);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     *
     * Description: {response写出xml}
     *
     * @param: HttpServletResponse response,String outStr outStr:需要写出的字符串
     * @return:
     * @throws: IOException
     * @see: com.zhshhypt.util
     * @author: zhsh
     * @date: 2019-12-16 Note: Nothing much.
     */
    public void writeXml(HttpServletResponse response, String outStr) {
        response.setContentType("text/xml;charset=UTF-8");
        try {
            PrintWriter writer = response.getWriter();
            writer.write(outStr);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}