package org.seckill.exception;

/**
 * 秒杀相关业务异常
 * Created by ZhengBoyi on 2017/6/24.
 */
public class SeckillException extends RuntimeException{
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
