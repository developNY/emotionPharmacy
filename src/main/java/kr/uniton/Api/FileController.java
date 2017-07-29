/*package kr.uniton.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import kr.uniton.Domain.file.FileService;

*//**
 * Created by iljun on 2017-07-29.
 *//*
@Controller
@RequestMapping("/api/v1/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @RequestMapping(value = "save", method = RequestMethod.POST)
    @ApiOperation(value = "사진저장 api" ,notes = "사진저장 api")
    public String save(
            @ApiParam("사진 파일")
            @RequestParam("multipartFile") MultipartFile multipartFile){
        return fileService.save(multipartFile);
    }
}
*/