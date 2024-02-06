package com.beam.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("t_user")
public class UserDO {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String password;

    private String realName;

    private String phone;

    private String mail;

    private Long deletionTime;

    private Date createTime;

    private Date updateTime;

    /**
     * 0：未删除 1：已删除
     */
    private int delFlag;
}
