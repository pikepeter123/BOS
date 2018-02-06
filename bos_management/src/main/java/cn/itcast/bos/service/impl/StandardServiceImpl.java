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
 * description:
 */
@Service
@Transactional
public class StandardServiceImpl implements StandardService {

    @Autowired
    private StandardDao standardDao;

    public List<Standard> getAllStandard() {
        return standardDao.getAllStandard();
    }

    public void addStandard(Standard standard) {
        standardDao.addStandard(standard);
    }
}
