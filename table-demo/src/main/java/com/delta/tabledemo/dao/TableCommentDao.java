package com.delta.tabledemo.dao;

import com.delta.tabledemo.entity.FindTableColumnByValueVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author LIZONG.WEI
 * @version V1.0
 * @description
 * @date 2019/9/9 13:34
 */
@Mapper
public interface TableCommentDao {
    FindTableColumnByValueVO findTableColumnByValue(FindTableColumnByValueVO vo);
}
