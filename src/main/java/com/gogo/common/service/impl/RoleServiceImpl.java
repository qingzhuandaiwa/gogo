package com.gogo.common.service.impl;

import com.gogo.common.entity.Role;
import com.gogo.common.mapper.RoleMapper;
import com.gogo.common.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
