package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * @author ourzh
 * @version 1.0.0
 * @ClassName SuccessKilledDao.java
 * @createTime 2019年04月27日 14:38:00
 */
public interface SuccessKilledDao {
    /**
     * 插入购买明细，可以过滤重复
     * @param seckillId
     * @param userPhone
     * @return 插入的行数
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
     * 根据id 查询SuccessKilled并携带秒杀商品对象实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
}
