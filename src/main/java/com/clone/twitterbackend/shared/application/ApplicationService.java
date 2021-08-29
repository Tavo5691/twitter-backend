package com.clone.twitterbackend.shared.application;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Service;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface ApplicationService {
    @AliasFor(
            annotation = Service.class
    )
    String value() default "";
}
