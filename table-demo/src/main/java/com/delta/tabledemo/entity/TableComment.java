package com.delta.tabledemo.entity;

import lombok.Data;

/**
 * @author LIZONG.WEI
 * @version V1.0
 * @description
 * @date 2019/9/9 13:34
 */
@Data
public class TableComment {
    private String owner;
    private String tableName;
    private String tableType;
    private String comments;
    private Integer originConId;
}
