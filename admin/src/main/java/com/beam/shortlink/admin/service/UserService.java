package com.beam.shortlink.admin.service;

import com.beam.shortlink.admin.dto.resp.UserRespDTO;

public interface UserService {

    UserRespDTO getUserByUsername(String Username);
}
