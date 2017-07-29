package kr.uniton.Domain.analysisApi;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * Created by ByeongChan on 2017. 7. 29..
 */
@Service
public class AnalysisService {


    public Long emotionAnalysis(JSONObject jsonObject) throws JSONException{


        double[] emotions = new double[7];
        String[] keyString = {"anger", "disgust", "fear", "happiness", "neutral", "sadness", "surprise"};

        double max = 0;
        int index = 0;

        for (int i = 0; i < emotions.length; i++) {
            emotions[i] = jsonObject.getDouble(keyString[i]) * 100;
        }

        for (int i = 0; i < emotions.length; i++) {
            if(emotions[i] > max){
                max = emotions[i];
                index = i;
            }
        }

        int range = 0;

        if(emotions[index] > 75){
            range = 4;
        } else if(emotions[index] > 50){
            range = 3;
        } else if(emotions[index] > 25){
            range = 2;
        } else if(emotions[index] > 0){
            range = 1;
        } else{
            range = 0;
        }

        if(range == 0){
            return new Long(-1);
        }

        Long result = new Long((range * (index + 1)) - 1);

        return result;
    }
}
