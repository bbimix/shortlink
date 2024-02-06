package com.beam.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.beam.shortlink.admin.dao.entity.UserDO;
import com.beam.shortlink.admin.dao.mapper.UserMapper;
import com.beam.shortlink.admin.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

}
