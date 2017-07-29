package kr.uniton.Api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kr.uniton.Domain.analysisApi.AnalysisService;
import kr.uniton.Domain.faceApi.FaceApiService;
import org.json.JSONObject;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/analysisPost", method = RequestMethod.POST)
    @ApiOperation(value = "analysisPost", notes = "analysis Face")
    public @ResponseBody Double analysisPOST(@RequestBody String faceImageUrl)
    {
        String jsonString = faceApiService.faceAnalysis(faceImageUrl);

        JSONArray json = new JSONArray(jsonString);
        JSONObject tempObject = json.getJSONObject(0);

        JSONObject jsonObject = tempObject.getJSONObject("faceAttributes").getJSONObject("emotion");

        Long emotion = analysisService.emotionAnalysis(jsonObject);

        // Double resultHappiness = jsonObject.getDouble("happiness");

        return resultHappiness;
    }
}
