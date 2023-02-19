package bodycator.bodycator.controller;

import bodycator.bodycator.domain.bodycatorReQVo;
import bodycator.bodycator.domain.bodycatorReSVo;
import bodycator.bodycator.service.bodycatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/bodycator")
public class bodycatorController {


    @GetMapping("/getData")
    public String getData(@RequestParam String userId){



        return "ID is "+userId;
    }

}
