package com.tionsy.springbootcomponents;

import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSDownloadStream;
import com.mongodb.client.gridfs.model.GridFSFile;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.util.HashMap;
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
 * @date Created in 2021年01月20日 15:02
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringbootComponentsApplication.class)
public class TestMongo {

    @Autowired
    GridFsTemplate gridFsTemplate;

    @Autowired
    private GridFSBucket gridFSBucket;

    @Autowired
    private GridFsOperations gridFsOperations;

    @Test
    public void testUploadFile(){
        String path = "E:/myProjiect/springboot-components/src/main/resources/META-INF/tempfile/notepad批操作.txt";
        try {
            File file = new File(path);
            InputStream inputStream = new FileInputStream(file);

            Map<String,String> map = new HashMap<>();
            map.put("tags","test");
            ObjectId store = gridFsTemplate.store(inputStream, file.getName(),map);
            System.out.println(store);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testDownloadFile(){
        String path = "E:/myProjiect/springboot-components/src/main/resources/META-INF/testfile";
        try {
            GridFSFile fsFile = gridFsTemplate.findOne(new Query(Criteria.where("_id").is(new ObjectId("6007dd8950673a34d061cf6a"))));

            GridFSDownloadStream fsDownloadStream = gridFSBucket.openDownloadStream(new ObjectId("6007dd8950673a34d061cf6a"));

            GridFsResource gridFsResource = new GridFsResource(fsFile, fsDownloadStream);

            InputStream inputStream = gridFsResource.getInputStream();

            File file = new File(path+"/"+gridFsResource.getFilename());


            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
