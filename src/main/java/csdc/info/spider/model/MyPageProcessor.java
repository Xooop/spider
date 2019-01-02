package csdc.info.spider.model;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

public class MyPageProcessor implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setUseGzip(true);

    @Override
    public void process(Page page) {
        page.putField("name", page.getHtml().css("dl.lemmaWgt-lemmaTitle h1","text").toString());
        page.putField("description", page.getHtml().xpath("//div[@class='lemma-summary']/allText()"));
    }

    @Override
    public Site getSite() {
        return site;
    }
}
