package com.delta.tabledemo.service;

/**
 * @author LIZONG.WEI
 * @version V1.0
 * @description
 * @date 2019/9/9 13:33
 */

import java.util.Map;


public interface ColumnCommentService {
    Map<String,Object> getTableCommentInAllUser(String tableName);
}
