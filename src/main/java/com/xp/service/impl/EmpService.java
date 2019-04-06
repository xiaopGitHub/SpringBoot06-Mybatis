package com.xp.service.impl;

import com.xp.dao.UserMapper;
import com.xp.pojo.User;
import com.xp.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Author xp
 * @CreateTime 2019/03/20  23:45
 * @Function ${VAR}
 */
@Service
public class EmpService implements IEmpService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Cacheable(value = "user")  //在缓存区域开辟了一块名称为employee的缓存空间
    public User selectByPrimaryKey(Integer id) {
        System.out.println("第二次进入此方法,没有查询缓存............");
        return userMapper.selectByPrimaryKey(id);
    }
}
