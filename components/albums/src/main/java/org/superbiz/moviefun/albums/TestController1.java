package org.superbiz.moviefun.albums;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class TestController1 {

    public TestController1() {
        System.out.println(">>>>>>>>>>>> 1111 Inside TestController <<<<<<<<<<<<<<<<<<<");
    }

    @GetMapping("/count")
    public int count() {
        return 10;
    }
}
