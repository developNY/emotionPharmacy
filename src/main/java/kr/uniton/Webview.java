package kr.uniton;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import kr.uniton.Domain.faceApi.FaceApiService;
import kr.uniton.Domain.file.FileService;
import kr.uniton.Domain.menu.Menu;
import kr.uniton.Domain.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by donggun on 2017-07-29.
 */
@Controller
@RequestMapping(value="/")
public class Webview {

    @Autowired
    private MenuService menuService;

    @Autowired
    private FaceApiService faceApiService;

    @Autowired
    private FileService fileService;
    
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "/index";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ApiOperation(value = "사진저장 api" ,notes = "사진저장 api")
    public String save(
            @ApiParam("사진 파일")
            @RequestParam("multipartFile") MultipartFile multipartFile){
        return fileService.save(multipartFile);
    }
    @RequestMapping(value = "/emot", method = RequestMethod.GET)
    public String emotionView(){
        return "/emotion";
    }
}
