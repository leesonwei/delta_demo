package com.delta.tabledemo.controller;

import com.delta.tabledemo.entity.FindTableColumnByValueVO;
import com.delta.tabledemo.service.ColumnCommentService;
import com.delta.tabledemo.service.TableCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author LIZONG.WEI
 * @version V1.0
 * @description
 * @date 2019/9/9 11:57
 */
@Controller
public class IndexController {
    private ColumnCommentService columnCommentService;
    private TableCommentService tableCommentService;

    @Autowired
    public IndexController(ColumnCommentService columnCommentService, TableCommentService tableCommentService){
        this.columnCommentService = columnCommentService;
        this.tableCommentService = tableCommentService;
    }

    @RequestMapping("index")
    public ModelAndView index(String tableName, ModelAndView modelAndView){
        Map<String, Object> result = columnCommentService.getTableCommentInAllUser(tableName);
        modelAndView.setStatus(HttpStatus.OK);
        modelAndView.setViewName("index");
        modelAndView.addObject("result",result);
        return modelAndView;
    }

    @RequestMapping("findTableColumnByValue")
    @ResponseBody
    public String findTableColumnByValue(String findvalue){
        FindTableColumnByValueVO vo = new FindTableColumnByValueVO();
        vo.setFindvalue(findvalue);
        tableCommentService.findTableColumnByValue(vo);
        return vo.toString();
    }
}
