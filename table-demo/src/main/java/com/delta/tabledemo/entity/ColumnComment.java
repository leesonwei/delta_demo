package com.delta.tabledemo.entity;

import lombok.Data;

/**
 * @author LIZONG.WEI
 * @version V1.0
 * @description
 * @date 2019/9/9 13:33
 */
@Data
public class ColumnComment {
    private String owner;
    private String tableName;
    private String columnName;
    private String comments;
    private Integer originConId;
}
