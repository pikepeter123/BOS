package cn.itcast.bos.dao;

import cn.itcast.bos.pojo.base.Standard;

import java.util.List;

/**
 * Created by 31364 on 2018/2/5.
 * description: 收派标准持久层接口
 */
public interface StandardDao {

    List<Standard> getAllStandards();

    void addStandard(Standard standard);

    void updateStandard(Standard standard);
}
