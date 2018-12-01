package com.hendisantika.springredisexample.exception;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-redis-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-02
 * Time: 06:12
 * To change this template use File | Settings | File Templates.
 */
public class ServiceException extends Exception {

    private static final long serialVersionUID = 1394741313777420805L;

    public ServiceException(String message) {
        super(message);
    }
}
