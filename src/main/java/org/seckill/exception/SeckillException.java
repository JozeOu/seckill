package org.seckill.exception;

/**
 * @author ourzh
 * @version 1.0.0
 * @ClassName SeckillException.java
 * @Description 秒杀相关业务异常
 * @createTime 2019年04月30日 22:59:00
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
