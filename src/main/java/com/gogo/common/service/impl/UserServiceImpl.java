package com.gogo.common.service.impl;

import com.gogo.common.entity.User;
import com.gogo.common.mapper.UserMapper;
import com.gogo.common.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gj
 * @since 2019-11-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
