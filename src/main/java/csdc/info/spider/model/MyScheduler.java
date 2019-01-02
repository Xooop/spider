package csdc.info.spider.model;

import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.scheduler.Scheduler;

public class MyScheduler implements Scheduler {
    @Override
    public void push(Request request, Task task) {

    }

    @Override
    public Request poll(Task task) {
        return null;
    }
}
