package kr.uniton.Api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by iljun on 2017-07-29.
 */
@Controller
@RequestMapping("test")
public class testController {

    @RequestMapping("/test")
    public String test(){
        return "/index";
    }
}
