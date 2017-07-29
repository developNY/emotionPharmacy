package kr.uniton.Api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kr.uniton.Domain.analysisApi.AnalysisService;
import kr.uniton.Domain.faceApi.FaceApiService;
import kr.uniton.Domain.menu.Menu;
import kr.uniton.Domain.menu.MenuService;
import kr.uniton.Domain.photo.Photo;
import kr.uniton.Domain.photo.PhotoService;
import kr.uniton.Domain.playList.PlayList;
import kr.uniton.Domain.playList.PlayListService;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
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

    @Autowired
    private PhotoService photoService;

    @RequestMapping(value = "/analysisPost", method = RequestMethod.POST)
    @ApiOperation(value = "analysisPost", notes = "analysis Face")

<<<<<<< HEAD
 public @ResponseBody Long analysisPOST(@RequestBody String faceImageUrl, Model model) throws JSONException

    {
=======
    public @ResponseBody Long analysisPOST(@RequestBody String faceImageUrl, Model model) throws JSONException {
>>>>>>> 69a304c05f41b322c058638178cd61e57304a0a9
        String jsonString = faceApiService.faceAnalysis(faceImageUrl);

        JSONArray json = new JSONArray(jsonString);
        JSONObject tempObject = json.getJSONObject(0);
        JSONObject jsonObject = tempObject.getJSONObject("faceAttributes").getJSONObject("emotion");

        Long emotion = analysisService.emotionAnalysis(jsonObject);

        int n = (int)(Math.random() * 3);

        if(n == 0){
            List<Menu> menulist = menuService.findByEmotion(emotion);
            model.addAttribute("menulist", menulist);

        } else if (n == 1){
            List<PlayList> playlist = playListService.findByEmotion(emotion);

            int musicNum = (int)Math.random() * playlist.size();

            model.addAttribute("playlist", playlist);
            model.addAttribute("musicNum", musicNum);

        } else if (n == 2){
            List<Photo> photolist = photoService.findByEmotion(emotion);
            model.addAttribute("photolist", photolist);
        } else{
            return null;
        }

        return null;
        // Double resultHappiness = jsonObject.getDouble("happiness");

    }
}
