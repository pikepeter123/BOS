package cn.itcast.bos.dao;

import cn.itcast.bos.pojo.base.Standard;

import java.util.List;

/**
 * Created by 31364 on 2018/2/5.
 * description:
 */
public interface StandardDao {

    List<Standard> getAllStandard();

    void addStandard(Standard standard);
}
