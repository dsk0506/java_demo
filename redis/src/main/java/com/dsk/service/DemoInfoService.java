package com.dsk.service;

import com.dsk.bean.DemoInfo;

/**
 * demoInfo 服务接口
 *
 * @author dsk(QQ:393573645)
 * @version v.0.1
 */
public interface DemoInfoService {

    public DemoInfo findById(long id);

    public void deleteFromCache(long id);

    void test();
}