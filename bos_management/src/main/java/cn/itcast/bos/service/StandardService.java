package cn.itcast.bos.service;

import cn.itcast.bos.pojo.base.Standard;

import java.util.List;

/**
 * Created by 31364 on 2018/2/5.
 * description:
 */
public interface StandardService {
    
    List<Standard> getAllStandards();

    void addStandard(Standard standard);
}
