package com.joe;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.joe.mapper.UserMapper;
import com.joe.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoMybatisPlusApplicationTests {



    @Autowired
    private UserMapper userMapper;

    @Test
    void seelectALlTest() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
    //插入测试
    @Test
    void addTest(){
        User user=new User();
        user.setName("luck");
        user.setAge(16);
        user.setEmail("ww99@qq.com");
        userMapper.insert(user);
    }
    //更新测试
    @Test
    void updateTest(){
        User user=new User();
        user.setId(6L);
        user.setName("sharelock");
        user.setAge(16);
        user.setEmail("ss99@qq.com");
        int i = userMapper.updateById(user);
    }
    //乐观锁测试
    @Test
    void  versionTest(){
        User user=userMapper.selectById(6L);
        user.setName("sharelock");
        user.setAge(22);
        user.setEmail("shxx99@qq.com");
        userMapper.updateById(user);
    }
    //分页测试
    @Test
    void  pageTest(){
        Page<User> page=new Page<>(1,2);
        userMapper.selectPage(page,null);
        page.getRecords().forEach(System.out::println);
        System.out.println(page.getRecords());
        System.out.println(page.getTotal());
    }

    @Test
    void  deleteTest(){
       userMapper.deleteById(1424907041917235204L);
    }
}
