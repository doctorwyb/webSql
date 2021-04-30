package com.common.dao;

import com.common.model.entity.AuthMenu;
import com.common.model.entity.AuthMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AuthMenuMapper {
    int countByExample(AuthMenuExample example);

    int deleteByExample(AuthMenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuthMenu record);

    int insertSelective(AuthMenu record);

    List<AuthMenu> selectByExampleWithRowbounds(AuthMenuExample example, RowBounds rowBounds);

    List<AuthMenu> selectByExample(AuthMenuExample example);

    AuthMenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuthMenu record, @Param("example") AuthMenuExample example);

    int updateByExample(@Param("record") AuthMenu record, @Param("example") AuthMenuExample example);

    int updateByPrimaryKeySelective(AuthMenu record);

    int updateByPrimaryKey(AuthMenu record);
}