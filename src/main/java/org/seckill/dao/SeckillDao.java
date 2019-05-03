package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * @author ourzh
 * @version 1.0.0
 * @ClassName SeckillDao.java
 * @createTime 2019年04月27日 14:37:00
 */
public interface SeckillDao {
    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return 更新的记录行数
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     *  根据id查询秒杀商品
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @param offset
     * @param limit
     * @return
     */
    // java，没有保存形参的记录: queryAll(int offset, int limit) -> queryAll(arg[0], arg[1])
    // 用@Param进行注解，MyBatis才能识别
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
