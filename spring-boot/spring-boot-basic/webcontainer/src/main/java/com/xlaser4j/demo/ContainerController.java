package com.xlaser4j.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @package: com.xlaser4j.demo
 * @author: Elijah.D
 * @time: 2019/12/9 17:37
 * @description:
 * @modified: Elijah.D
 */
@RestController
public class ContainerController {
    /**
     * /haha/hello
     *
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        return "tomcat change to undertow!";
    }
}
