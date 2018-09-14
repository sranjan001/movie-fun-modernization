package org.superbiz.moviefun.sample;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test2")
public class TestController2 {

    public TestController2() {
        System.out.println(">>>>>>>>>>>> 2222222 Inside TestController <<<<<<<<<<<<<<<<<<<");
    }

    @GetMapping("/count")
    public int count() {
        return 122;
    }
}
