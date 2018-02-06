package cn.itcast.bos.web.controller.base;

import cn.itcast.bos.pojo.base.Standard;
import cn.itcast.bos.service.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 31364 on 2018/2/5.
 * description: 收派标准的Controller
 */
@Controller
@RequestMapping(value = "/standard")
public class StandardController {

    @Autowired
    private StandardService standardService;

    /**
     * 分页查询所有的收派标准的方法
     * 目前分页功能未实现
     *
     * @return 收派标准的列表
     */
    @RequestMapping(value = {"/getAllStandard.action", "/getAllStandard"})
    @ResponseBody
    public List<Standard> getAllStandard() {
        List<Standard> list = standardService.getAllStandards();
        return list;
    }

    /**
     * 添加收派标准的方法
     *
     * @param standard 传过来的收派标准对象
     */
    @RequestMapping(value = {"/addStandard.action", "/addStandard"})
    public void addStandard(Standard standard, HttpServletResponse response) throws IOException {
        standardService.addStandard(standard);
//        重定向到收派标准列表
        response.sendRedirect("/bos_management/standard/getAllStandard.action");
    }
}
