package csdc.info.spider.controller;

import csdc.info.spider.service.PageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpiderController {
    @Autowired
    PageServiceImpl pageServiceImpl;

    @GetMapping(value = "/spider")
    public void fetchData(
            //@RequestParam(value = "url") String url
    ) {
        try {
            pageServiceImpl.crawlData(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
