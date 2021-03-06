package com.nepxion.discovery.plugin.framework.listener.loadbalance;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import com.nepxion.discovery.plugin.framework.listener.BasicListener;
import org.springframework.core.Ordered;

public abstract class AbstractLoadBalanceListener extends BasicListener implements LoadBalanceListener,Ordered {


    @Override
    public int getOrder() {
        return 0;
    }
}