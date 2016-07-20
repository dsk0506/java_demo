package com.dsk.repository;

import org.springframework.data.repository.CrudRepository;

import com.dsk.bean.DemoInfo;

/**
 * DemoInfo持久化类
 *
 * @author dsk(QQ:393573645)
 * @version v.0.1
 */
public interface DemoInfoRepository extends CrudRepository<DemoInfo, Long> {

}
