package fun.xiebug.simplejdbc;

import lombok.Builder;
import lombok.Data;

/**
 * 描述:
 *
 * @author YI
 * @date 2021/5/12 11:11
 */

@Data
@Builder
public class Foo {

    private Long id;

    private String bar;
}
