
package com.platform.modules.system.service;

import java.util.Map;

/**
 * @author AllDataDC
 * @date 2022-10-27 
 */
public interface MonitorService {

    /**
    * 查询数据分页
    * @return Map<String,Object>
    */
    Map<String,Object> getServers();
}
