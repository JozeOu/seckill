package org.seckill.exception;

import org.seckill.dto.SeckillExecution;

/**
 * @author ourzh
 * @version 1.0.0
 * @ClassName SeckillCloseException.java
 * @Description 秒杀关闭异常
 * @createTime 2019年04月30日 22:57:00
 */
public class SeckillCloseException extends SeckillException {
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
