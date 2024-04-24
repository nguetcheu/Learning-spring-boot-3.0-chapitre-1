package com.learning.spring.boot3.chapitre1.Controller;

import com.learning.spring.boot3.chapitre1.Video;
import com.learning.spring.boot3.chapitre1.VideoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    private  VideoService videoService;

    public HomeController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/api/videos")
    public List<Video> all(){
        return videoService.getVideos();
    }

    @PostMapping("/new-video")
    public Video newVideo(@RequestBody Video video) {
        return videoService.create(video);
    }

}
