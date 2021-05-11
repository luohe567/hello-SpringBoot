package fun.xiebug.druid;

import com.alibaba.druid.filter.FilterChain;
import com.alibaba.druid.filter.FilterEventAdapter;
import com.alibaba.druid.proxy.jdbc.ConnectionProxy;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

/**
 * 描述: 连接日志过滤器
 *
 * @author YI
 * @date 2021/5/11 17:19
 */

@Slf4j
public class ConnectLogFilter extends FilterEventAdapter {

    @Override
    public void connection_connectBefore(FilterChain chain, Properties info) {
        log.info("Before Connection!");
    }

    @Override
    public void connection_connectAfter(ConnectionProxy connection) {
        log.info("After Connection!");
    }
}
