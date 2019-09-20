package com.delta.tabledemo.dao;

import com.delta.tabledemo.entity.ColumnComment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author LIZONG.WEI
 * @version V1.0
 * @description
 * @date 2019/9/9 13:33
 */
@Mapper
public interface ColumnCommentDao {
    List<ColumnComment> getColumnCommentInAllUser(String tableName);
}
