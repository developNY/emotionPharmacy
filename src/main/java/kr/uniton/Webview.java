package kr.uniton;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import kr.uniton.Domain.analysisApi.AnalysisService;
import kr.uniton.Domain.faceApi.FaceApiService;
import kr.uniton.Domain.file.FileService;
import kr.uniton.Domain.menu.Menu;
import kr.uniton.Domain.menu.MenuService;
import kr.uniton.Domain.photo.Photo;
import kr.uniton.Domain.photo.PhotoService;
import kr.uniton.Domain.playList.PlayList;
import kr.uniton.Domain.playList.PlayListService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    private FileService fileService;

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
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "/home";
    }

    @RequestMapping(value = "/picture", method = RequestMethod.GET)
    public String index(){
        return "/picture";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestParam("multipartFile") MultipartFile multipartFile, Model model) throws JSONException{

        String faceImageUrl = fileService.save(multipartFile);

        String jsonString = faceApiService.faceAnalysis(faceImageUrl);

        JSONArray json = new JSONArray(jsonString);
        JSONObject tempObject = json.getJSONObject(0);
        JSONObject jsonObject = tempObject.getJSONObject("faceAttributes").getJSONObject("emotion");

        Long emotion = analysisService.emotionAnalysis(jsonObject);
        String[] emotionText = {"약간 화가났네요", "화.가.난.다..!!!", "매우 빡ㅋ침ㅋ", "매우 으와왁!! 하네요",
                                "헉....O.O", "조금 무서워 하네요", "매우 무서워 하네요", "매우 덜덜덜 하네요",
                                "행복 하네요", "매우행복 하네요", "개행복 하네요", "개짱행복 하네요",
                                "약간 평온 하네요", "평온 하네요", "매우 평온 하네요", "부처님 미소만큼 평온 하네요",
                                "매우 T.T 합니다", "매우 슬픔슬픔 합니다", "광광울었다고 합니다", "멘탈바사삭!!",
                                "깜짝 놀랐네요!", "매우 놀란 토끼눈!", "매우 우르르 쾅쾅 하네요", "롤러코스터를 타네요!",
                                "조금 짜증났어요!", "짜증났어요", "혐오감이 극도에 달했네요", "지구 뿌셔 우주 뿌셔 !"};

        model.addAttribute("emotion", emotion);
        model.addAttribute("emotionText", emotionText[new Integer(emotion.intValue())]);
<<<<<<< HEAD
   
=======
        int n = (int) (Math.random() * 3);
        model.addAttribute("n", n);
        /*if(emotionId)
            model.add(emotionId) --> emotionId 저장
        */
>>>>>>> 4a2e587bc3a1103a5fdd9943b75adfe65c146a33
        return "/status";
    }

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String result(@RequestParam Long emotion, Model model){

<<<<<<< HEAD
        //int n = (int)(Math.random() * 3);
        int n = 1;
=======
        int n = (int) (Math.random() * 3);

>>>>>>> 4a2e587bc3a1103a5fdd9943b75adfe65c146a33
        if(n == 0){
            List<Menu> menulist = menuService.findByEmotion(emotion);
            model.addAttribute("menulist", menulist);

            return "/menu";
        } else if (n == 1){
            List<PlayList> playlist = playListService.findByEmotion(emotion);

            int musicNum = (int)Math.random() * playlist.size();

            model.addAttribute("playlist", playlist);
            model.addAttribute("musicNum", musicNum);
 
            return "/playList";
        } else if (n == 2){
            List<Photo> photolist = photoService.findByEmotion(emotion);
            model.addAttribute("photolist", photolist);

            return "/image";
        } else{
            return null;
        }

        // Double resultHappiness = jsonObject.getDouble("happiness");

        //if(model.==1)
           // return "playList.jsp";
        //else if(model==?)
        //return "/menu.jsp";
        //else
        // return "image.jsp";
    }

}
