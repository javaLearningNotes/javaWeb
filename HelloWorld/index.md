### hello world接口



```java
package com.example.demo7;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//将Java类标记为处理http请求的Controller
public class helloWorld {
//
    @RequestMapping(value = "hello")
//    将http请求映射到hello上
//    通过http://localhost:8080/hello访问
    public String hello(){
        return "hello world";
    }
}

```


