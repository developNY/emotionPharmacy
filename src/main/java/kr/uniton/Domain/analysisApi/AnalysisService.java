package kr.uniton.Domain.analysisApi;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by ByeongChan on 2017. 7. 29..
 */
@Service
public class AnalysisService {

    public Long emotionAnalysis(JSONObject jsonObject){

        double[] emotions = new double[8];
        String[] keyString = {"anger", "contempt", "disgust", "fear", "happiness", "neutral", "sadness", "surprise"};

        for (int i = 0; i < emotions.length; i++) {
            emotions[i] = jsonObject.getDouble(keyString[i]) * 100;
        }


    }
}
