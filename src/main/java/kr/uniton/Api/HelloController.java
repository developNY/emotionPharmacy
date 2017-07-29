package kr.uniton.Api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kr.uniton.Domain.faceApi.FaceApiService;
import kr.uniton.Domain.faceApi.ImageApisService;
import kr.uniton.Domain.file.FileService;
import kr.uniton.Domain.menu.Menu;
import kr.uniton.Domain.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by iljun on 2017-07-29.
 */
@RestController
@RequestMapping(value="/api/v1/hello")
@Api(value = "HelloController", description = "헬로 API", basePath = "/api/v1/hello")
public class HelloController {

    @Autowired
    private MenuService menuService;

    @Autowired
    private FaceApiService faceApiService;

    @Autowired
    private ImageApisService imageApisService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ApiOperation(value = "난 누군가" ,notes = "여긴 어딘가")
    public String index(){
        return "유니톤을 왜 했을까?";
    }

    @RequestMapping(value = "jpaTest", method = RequestMethod.GET)
    @ApiOperation(value = "jpaTest", notes = "jpaTest")
    public List<Menu> test(){
        return menuService.test();
    }

    @RequestMapping(value = "/apiTest", method = RequestMethod.GET)
    public String apiTest(){
        return faceApiService.test();
    }

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public String api(@RequestParam("title") String title){
        return imageApisService.api(title);
    }
}
