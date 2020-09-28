package com.tionsy.springbootcomponents.entity;

import lombok.Data;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author tianyun
 * @version 1.0
 * @date Created in 2020年07月12日 17:59
 * @since 1.0
 */
@Data
public class UseEntity {

    private Long id;

    private String userName;

    private String passWord;

    private String realName;
}
