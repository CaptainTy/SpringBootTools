package com.tionsy.springbootcomponents.service.impl;

import com.tionsy.springbootcomponents.entity.UseEntity;
import com.tionsy.springbootcomponents.mapper.UserMapper;
import com.tionsy.springbootcomponents.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author tianyun
 * @version 1.0
 * @date Created in 2020年07月12日 17:49
 * @since 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UseEntity login(int id){
        return userMapper.login(id);
    }

}
