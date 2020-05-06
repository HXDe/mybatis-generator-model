package com.hxd.mgm.mapper;

import com.hxd.mgm.model.User;
import com.hxd.mgm.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020/05/06
*/
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}