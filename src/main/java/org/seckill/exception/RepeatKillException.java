package org.seckill.exception;

import org.seckill.dto.SeckillExecution;

/**
 * @author ourzh
 * @version 1.0.0
 * @ClassName RepeatKillException.java
 * @Description 重复秒杀异常（运行期异常）
 * @createTime 2019年04月30日 22:54:00
 */
public class RepeatKillException extends SeckillException {
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
