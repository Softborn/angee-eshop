package e_shop.controller;

import e_shop.model.Watch;
import e_shop.service.EShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/watch")
public class EShopWebServiceController {

    @Autowired
    private EShopService eShopService;

    @RequestMapping(method = RequestMethod.GET)
    public Watch getWatch() {
        return eShopService.getWatch();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Watch uploadWatch(@RequestBody Watch watch) {
        return eShopService.uploadWatch(watch);
    }

}
