package csdc.info.spider.service;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 *  Used for configure the spider setting and define the way of process the page.
 */
@Service
public class PageServiceImpl implements PageService{

    /**
     * crawl data from the website parsed from the url.
     *
     * @param url
     */
    public void crawlData(String url) throws Exception {
        // todo verify the url.

        // crawl the data
//        String charSet = "gbk";
//        //String charSet = "gb2312";
//        //String charSet = "utf-8";
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        try {
//            HttpGet httpGet = new HttpGet("http://www.people.com.cn/");
//            System.out.println("Executing request: " + httpGet.getRequestLine());
//            ResponseHandler<String> responseHandler = httpResponse -> {
//                int status = httpResponse.getStatusLine().getStatusCode();
//                if (status >= 200 && status < 300) {
//                    HttpEntity model = httpResponse.getEntity();
//                    return model != null ? EntityUtils.toString(model, charSet) : null;
//                } else {
//                    throw new ClientProtocolException("Unexpected response status: " + status);
//                }
//            };
//            String responseBody = httpClient.execute(httpGet, responseHandler);
//            System.out.println("--------------------------------------------");
//            System.out.println(responseBody);
//        } finally {
//            httpClient.close();
//        }
    }


}
