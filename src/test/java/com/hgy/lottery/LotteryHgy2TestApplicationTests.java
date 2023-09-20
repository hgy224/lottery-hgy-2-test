package com.hgy.lottery;

import cn.hutool.json.JSONUtil;
import com.hgy.lottery.rpc.IActivityBooth;
import com.hgy.lottery.rpc.req.ActivityReq;
import com.hgy.lottery.rpc.res.ActivityRes;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class LotteryHgy2TestApplicationTests {

    @DubboReference(interfaceClass = IActivityBooth.class, url = "dubbo://127.0.0.1:20880")
    private IActivityBooth activityBooth;

    @Test
    void contextLoads() {
        ActivityReq activityReq = new ActivityReq();
        activityReq.setActivityId(10000L);
        ActivityRes activityRes = activityBooth.queryActivityById(activityReq);
        log.info(JSONUtil.toJsonStr(activityRes));
    }

}
