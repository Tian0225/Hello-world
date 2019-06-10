package com.com.qianfeng.itemreaderdb;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;
/**
 * @author tian
 * @date 2019/
 */

@Component("dbJdbcWriter")
public class DbJdbcWriter implements ItemWriter<User> {


    @Override
    public void write(List<? extends User> items) throws Exception {
        for (User user:items){
            System.out.println(user);
        }
    }
}
