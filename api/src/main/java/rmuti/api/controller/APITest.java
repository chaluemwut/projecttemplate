package rmuti.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rmuti.api.bean.APIResponse;

@RestController
@RequestMapping("/test")
public class APITest {

    @RequestMapping(value = "/info", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, method = {RequestMethod.POST, RequestMethod.GET})
    public Object test(){
        APIResponse res = new APIResponse();
        return res;
    }

}
