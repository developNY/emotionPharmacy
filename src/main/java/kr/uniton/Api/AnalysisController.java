package kr.uniton.Api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kr.uniton.Domain.menu.Menu;
import kr.uniton.Domain.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ByeongChan on 2017. 7. 29..
 */
@Controller
@RequestMapping(value="/api/v1/analysis")
@Api(value = "AnalysisController", description = "Analysis API", basePath = "/api/v1/analysis")
public class AnalysisController {

    @Autowired
    private MenuService analyService;

    @RequestMapping(value = "/analysisPOST", method = RequestMethod.POST)
    @ApiOperation(value = "analysis POST", notes = "analysis PHOTO")
    public @ResponseBody analysisData analysisPOST(@RequestBody String photoUrl)
    {


        return null;
    }

    @RequestMapping(value = "/analysisGET", method = RequestMethod.GET)
    @ApiOperation(value = "jpaTest", notes = "jpaTest")
    public List<Menu> test(){
    }
}
