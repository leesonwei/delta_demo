package com.delta.tabledemo.service.impl;

import com.delta.tabledemo.dao.TableCommentDao;
import com.delta.tabledemo.entity.FindTableColumnByValueVO;
import com.delta.tabledemo.service.TableCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LIZONG.WEI
 * @version V1.0
 * @description
 * @date 2019/9/9 13:35
 */
@Service
public class TableCommentServiceImpl implements TableCommentService {
    private TableCommentDao tableCommentDao;

    @Autowired
    public TableCommentServiceImpl(TableCommentDao tableCommentDao){
        this.tableCommentDao = tableCommentDao;
    }

    @Override
    public FindTableColumnByValueVO findTableColumnByValue(FindTableColumnByValueVO vo) {
        return tableCommentDao.findTableColumnByValue(vo);
    }
}
