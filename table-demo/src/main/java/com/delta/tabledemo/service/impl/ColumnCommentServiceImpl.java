package com.delta.tabledemo.service.impl;

import com.delta.tabledemo.dao.ColumnCommentDao;
import com.delta.tabledemo.entity.ColumnComment;
import com.delta.tabledemo.service.ColumnCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LIZONG.WEI
 * @version V1.0
 * @description
 * @date 2019/9/9 13:35
 */
@Service
public class ColumnCommentServiceImpl implements ColumnCommentService {
    private ColumnCommentDao columnCommentDao;

    @Autowired
    public ColumnCommentServiceImpl(ColumnCommentDao columnCommentDao){
        this.columnCommentDao = columnCommentDao;
    }

    @Override
    public Map<String,Object> getTableCommentInAllUser(String tableName) {
        Map<String, Object> result = new HashMap<>();
        if (StringUtils.isEmpty(tableName)) {
            result.put("status",1);
            result.put("msg","参数错误,tableName不能为空");
            return result;
        }
        List<ColumnComment> data = columnCommentDao.getColumnCommentInAllUser(tableName);
        result.put("status",0);
        result.put("msg","success");
        result.put("data",data);
        return result;
    }
}
