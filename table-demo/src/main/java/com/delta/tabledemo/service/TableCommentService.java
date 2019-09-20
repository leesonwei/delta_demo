package com.delta.tabledemo.service;

import com.delta.tabledemo.entity.FindTableColumnByValueVO;
import org.springframework.stereotype.Service;

/**
 * @author LIZONG.WEI
 * @version V1.0
 * @description
 * @date 2019/9/9 13:35
 */
@Service
public interface TableCommentService {
    FindTableColumnByValueVO findTableColumnByValue(FindTableColumnByValueVO vo);
}
