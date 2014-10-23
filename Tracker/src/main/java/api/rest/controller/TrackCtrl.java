package api.rest.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import api.rest.model.Track;


@Controller
@RequestMapping("track")
public class TrackCtrl {

    private static final Logger logger = LoggerFactory.getLogger(TrackCtrl.class);
    List<Track> trackData = new ArrayList<Track>();

    @RequestMapping(method = RequestMethod.GET)
    public void checkIsAllive(HttpServletResponse response) {
        logger.info("check Allive");
        response.setStatus(HttpServletResponse.SC_OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createTrack(@RequestBody Track track, HttpServletResponse response){
        logger.info("Create track");
        trackData.add(track);
        response.setStatus(HttpServletResponse.SC_OK);
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public @ResponseBody List<Track> showTrack(){
        Track tMock = new Track();
        tMock.setDateTrackStart(new Date());
        tMock.setDateTrackStop(new Date());
        trackData.add(tMock);
        return trackData;
    }
}
