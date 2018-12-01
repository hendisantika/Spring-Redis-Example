package com.hendisantika.springredisexample.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-redis-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-02
 * Time: 06:14
 * To change this template use File | Settings | File Templates.
 */
@ControllerAdvice
public class ServiceExceptionHandler {
    @ExceptionHandler(ServiceException.class)
    public ModelAndView handelException(ServiceException ex) {
        ModelAndView mav = new ModelAndView("serviceError");
        mav.addObject("errorMessage", ex.getMessage());
        return mav;
    }
}