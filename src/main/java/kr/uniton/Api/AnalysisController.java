package kr.uniton.Api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kr.uniton.Domain.analysisApi.AnalysisService;
import kr.uniton.Domain.faceApi.FaceApiService;
import kr.uniton.Domain.menu.Menu;
import kr.uniton.Domain.menu.MenuService;
import kr.uniton.Domain.playList.PlayList;
import kr.uniton.Domain.playList.PlayListService;
import org.json.JSONObject;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ByeongChan on 2017. 7. 29..
 */
@RestController
@RequestMapping(value="/api/v1/analysis")
@Api(value = "AnalysisController", description = "Analysis API", basePath = "/api/v1/analysis")
public class AnalysisController {

    @Autowired
    private FaceApiService faceApiService;

    @Autowired
    private AnalysisService analysisService;

    @Autowired
    private PlayListService playListService;

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/analysisPost", method = RequestMethod.POST)
    @ApiOperation(value = "analysisPost", notes = "analysis Face")
    public @ResponseBody Long analysisPOST(@RequestBody String faceImageUrl, Model model)
    {
        String jsonString = faceApiService.faceAnalysis(faceImageUrl);

        JSONArray json = new JSONArray(jsonString);
        JSONObject tempObject = json.getJSONObject(0);

        JSONObject jsonObject = tempObject.getJSONObject("faceAttributes").getJSONObject("emotion");

        Long emotion = analysisService.emotionAnalysis(jsonObject);

        int n = (int) (Math.random()*3);
        if(n == 0){
            Menu menu = menuService.findByEmotion(emotion);
            model.addAttribute("menu",menu);

        } else if (n == 1) {
            List<PlayList> playlist = playListService.findByEmotion(emotion);

            int musicNum = (int)Math.random()*5;
            model.addAttribute("playlist", playlist);
            model.addAttribute("musicNum", musicNum);
        }

        // Double resultHappiness = jsonObject.getDouble("happiness");

        return emotion;
    }
}
