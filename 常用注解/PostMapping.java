/*
Author:steam-404
 */
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//标记一个类作为Spring MVC控制器，用于处理HTTP请求和响应。
public class postMapping{
    @PostMapping(value = "testPost")
//    Post请求
    public void testPost(){

    }
}
