/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.simple.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sample.simple.rest.dto.ParamObject;
import sample.simple.rest.dto.RetObject;
import sample.simple.service.SampleService;

@Api(tags = "测试操作接口", description = "提供CI的增加、修改、删除、查询等操作的rest接口。")
@Controller("SampleController")
@RequestMapping(value = "/api/hello")
public class SampleController {

    @Autowired
    private SampleService SampleService;
    
    @ApiOperation(value = "这是一个测试接口", notes = "测试说明。。。")
    @RequestMapping(value = "/test/{id}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    @ResponseBody RetObject testId(@ApiParam(required = true, value = "id") @PathVariable String id) {
      RetObject ret = new RetObject();
      try {
        String content = this.SampleService.getHelloMessage();
        ret.setContent(content);
        ret.setMessage(id);
        ret.setStatus("success");
      } catch (Exception e) {
        e.printStackTrace();
      }
      
        return ret;
    }

    @ApiOperation(value = "ty的dome" , notes = "实例")
    @RequestMapping(value = "/test3",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
    @ResponseBody
    public RetObject testMyself(){
        RetObject ret = new RetObject();
        try {
            ret.setContent("001");
            ret.setMessage("helllo");
            ret.setStatus("1");
        }catch (Exception e){
            e.printStackTrace();
        }
        return ret;
    }
    
    @ApiOperation(value = "这是一个测试接口2", notes = "测试说明2。。。")
    @RequestMapping(value = "/test2", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    @ResponseBody RetObject test2(@ApiParam(required = true, value = "id") @RequestBody ParamObject param) {
      RetObject ret = new RetObject();
      try {
        ret.setContent(param.getName());
        ret.setMessage(param.getStatus());
        ret.setStatus("success");
      } catch (Exception e) {
        e.printStackTrace();
      }
      
      return ret;
    }

}
