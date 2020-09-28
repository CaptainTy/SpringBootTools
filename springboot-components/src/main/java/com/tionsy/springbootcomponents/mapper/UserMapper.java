package com.tionsy.springbootcomponents.mapper;

import com.tionsy.springbootcomponents.entity.UseEntity;

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
 * @date Created in 2020年07月12日 17:49
 * @since 1.0
 */
public interface UserMapper {

    UseEntity login(int id);
}
