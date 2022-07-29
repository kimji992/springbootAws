package com.springbootAws.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 메소드의 PARAMETER로 선언된 객체에서만 사용 가능
@Target(ElementType.PARAMETER)
// 메모리가 RUNTIME 종료시 까지
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {
}
