package com.delta.tabledemo.entity;

import lombok.Data;

/**
 * @author LIZONG.WEI
 * @version V1.0
 * @description
 * @date 2019/9/11 15:06
 */
@Data
public class FindTableColumnByValueVO {
    private String findvalue;
    private String resultjson;
    private Integer resultcount;
}
