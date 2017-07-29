package kr.uniton.Api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import kr.uniton.Domain.faceApi.FaceApiService;
import kr.uniton.Domain.file.FileService;
import kr.uniton.Domain.menu.Menu;
import kr.uniton.Domain.menu.MenuService;
import kr.uniton.Domain.photo.PhotoService;
import kr.uniton.Domain.playList.PlayList;
import kr.uniton.Domain.playList.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    private PlayListService playListService;

    @Autowired
    private PhotoService photoService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ApiOperation(value = "난 누군가" ,notes = "여긴 어딘가")
    public String index(){
        return "유니톤을 왜 했을까?";
    }

    @RequestMapping(value = "/inputPlaylist", method = RequestMethod.POST)
    @ApiOperation(value = "input playlist" ,notes = "playlist input")
    public String inputPlaylist(@ApiParam("emotion") @RequestParam Long emotion, @ApiParam("제목") @RequestParam String title
    , @ApiParam("가수") @RequestParam String artist, @ApiParam("이미지 URL") @RequestParam String imageUrl, @ApiParam("유투브 URL") @RequestParam String youtubeUrl)
    {
        try {
            playListService.save(PlayList.build(emotion, title, artist, imageUrl, youtubeUrl));
            return "save success";
        } catch (Exception e) {
            e.printStackTrace();
            return "save fail";
        }
    }

    @RequestMapping(value = "/inputMenu", method = RequestMethod.POST)
    @ApiOperation(value = "input Menu" ,notes = "menu input")
    public String inputMenu(@ApiParam("emotion") @RequestParam Long emotion, @ApiParam("이름") @RequestParam String name,
                            @ApiParam("이미지 URL") @RequestParam String imageUrl)
    {
        try {
            menuService.save(Menu.build(emotion, name, imageUrl));
            return "save success";
        } catch (Exception e) {
            e.printStackTrace();
            return "save fail";
        }
    }

    @RequestMapping(value = "/inputPhoto", method = RequestMethod.POST)
    @ApiOperation(value = "input Photo" ,notes = "photo input")
    public String inputPhoto(@ApiParam("emotion") @RequestParam Long emotion, @ApiParam("이름") @RequestParam String name,
                            @ApiParam("이미지 URL") @RequestParam String imageUrl)
    {
        try {
            menuService.save(Menu.build(emotion, name, imageUrl));
            return "save success";
        } catch (Exception e) {
            e.printStackTrace();
            return "save fail";
        }
    }

}
