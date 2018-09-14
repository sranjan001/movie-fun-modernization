package org.superbiz.moviefun.albums;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    public TestController() {
        System.out.println(">>>>>>>>>>>> Inside TestController <<<<<<<<<<<<<<<<<<<");
    }

    @GetMapping("/count")
    public int count() {
        return 10;
    }
}
