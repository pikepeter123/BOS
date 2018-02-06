package cn.itcast.bos.service.impl;

import cn.itcast.bos.dao.StandardDao;
import cn.itcast.bos.pojo.base.Standard;
import cn.itcast.bos.service.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 31364 on 2018/2/5.
 * description: 收派标准业务层接口实现类
 */
@Service
@Transactional
public class StandardServiceImpl implements StandardService {

    @Autowired
    private StandardDao standardDao;

    public List<Standard> getAllStandards() {
        return standardDao.getAllStandards();
    }

    public void addStandard(Standard standard) {
        if(standard.getId() == null) {
//            如果id字段没有值
            standardDao.addStandard(standard);
        } else {
//            id字段有值，执行更新操作
            standardDao.updateStandard(standard);
        }
    }
}
