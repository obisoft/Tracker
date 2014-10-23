package api.rest.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("track")
public class TrackCtrl {

    @RequestMapping(method = RequestMethod.GET)
    public void checkIsAllive(HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
