package com.zhshhypt.config;/**
 * @description:
 * @author: cyz
 * @time: 2021/5/29 0029
 */

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  @Description:
 *  @Author: MybatisPlusConfig
 *  @Date: 2021/5/29 0029
 */
    @Configuration
    public class MybatisPlusConfig {

        @Bean
        public PaginationInterceptor paginationInterceptor(){
            PaginationInterceptor page = new PaginationInterceptor();
            //设置方言类型
            page.setDialectType("mysql");
            return page;
        }
}
