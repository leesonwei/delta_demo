package com.delta.tabledemo.entity;

import lombok.Data;

/**
 * @author LIZONG.WEI
 * @version V1.0
 * @description
 * @date 2019/9/10 14:52
 */
@Data
public class ColumnInfo {
    private String owner;
    private String tableName;
    private String columnName;
    private String dataType;
    private Integer dataLength;
    private Boolean nullable;

    public String isNullAble() {
        return nullable?"Y":"N";
    }

    public void setNullAble(String nullable) {
        this.nullable = "Y".equals(nullable) ? true : "N".equals(nullable) ? false: null;
    }
}
