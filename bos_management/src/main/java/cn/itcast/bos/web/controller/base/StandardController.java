package cn.itcast.bos.web.controller.base;

import cn.itcast.bos.pojo.base.Standard;
import cn.itcast.bos.service.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by 31364 on 2018/2/5.
 * description:
 */
@Controller
@RequestMapping(value = "/standard")
public class StandardController {

    @Autowired
    private StandardService standardService;

    @RequestMapping(value = {"/getAllStandard.action", "/getAllStandard"})
    @ResponseBody
    public List<Standard> getAllStandard(HttpServletResponse response) {
        List<Standard> list = standardService.getAllStandard();
        response.setCharacterEncoding("utf-8");
        return list;
    }

    @RequestMapping(value = {"/addStandard.action", "/addStandard"})
    public void addStandard(Standard standard) {
        standardService.addStandard(standard);
    }
}
