package com.tionsy.springbootcomponents.mongo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Map;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author tiany
 * @version 1.0
 * @date Created in 2021年01月20日 14:58
 * @since 1.0
 */
@Component
public class MongoGridFS {

    @Autowired
    GridFsTemplate gridFsTemplate;

    public String uploadFile(InputStream inputStream, String fileName, Map<String,String> metaData){

        ObjectId store = gridFsTemplate.store(inputStream, fileName, metaData);
        return null;
    }
}
