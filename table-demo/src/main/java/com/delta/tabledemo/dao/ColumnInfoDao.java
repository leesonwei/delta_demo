package com.delta.tabledemo.dao;

import com.delta.tabledemo.entity.ColumnInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author LIZONG.WEI
 * @version V1.0
 * @description
 * @date 2019/9/10 15:10
 */
@Mapper
public interface ColumnInfoDao {
    List<ColumnInfo> getColumnInfoInAllUser(ColumnInfo columnInfo);
}
