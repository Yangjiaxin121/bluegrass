package com.bluegrass.service.impl;

import com.bluegrass.common.ServerResponse;
import com.bluegrass.dao.DepressionTestMapper;
import com.bluegrass.dao.UserMapper;
import com.bluegrass.pojo.DepressionTest;
import com.bluegrass.pojo.User;
import com.bluegrass.service.ITestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    DepressionTestMapper depressionTestMapper;

    @Autowired
    UserMapper userMapper;


    /**
     * 增加题目
     * @param depressionTest
     * @return
     */
    public ServerResponse add(DepressionTest depressionTest){
        if (depressionTest.getQuestion() == null){
            return ServerResponse.createByErrorMessage("question不能为空");
        }
        int count = depressionTestMapper.insert(depressionTest);
        if (count > 0){
            return ServerResponse.createBySuccess("插入成功");
        }
        return ServerResponse.createByErrorMessage("插入失败");
    }


    /**
     * 删除题目
     * @param testId
     * @return
     */
    public ServerResponse delete(Integer testId){
        if (testId == null){
            return ServerResponse.createByErrorMessage("testId不能为空");
        }
        int count = depressionTestMapper.deleteByPrimaryKey(testId);
        if (count > 0){
            return ServerResponse.createBySuccess("删除成功");
        }
        return ServerResponse.createByErrorMessage("删除失败");
    }


    /**
     * 更新题目信息
     * @param depressionTest
     * @return
     */
    public ServerResponse update(DepressionTest depressionTest){
        int count = depressionTestMapper.updateByPrimaryKeySelective(depressionTest);
        if (count > 0){
            return ServerResponse.createBySuccess("修改成功");
        }
        return ServerResponse.createByErrorMessage("修改失败");
    }


    /**
     * 获取测试问题及答案
     * @param pageNum
     * @param pageSize
     * @return
     */
    public ServerResponse getTest(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<DepressionTest> depressionTestList = depressionTestMapper.selectAll();

        PageInfo pageInfo = new PageInfo(depressionTestList);
        return ServerResponse.createBySuccess(pageInfo);
    }


    /**
     * 保存result
     * @param user
     * @param result
     * @return
     */
    public ServerResponse saveResult(User user, Integer result){
        if (result == null){
            return ServerResponse.createByErrorMessage("result不能为空");
        }
        int count  = userMapper.updateResultByUserId(user.getUserId(),String.valueOf(result));
        if (count > 0){
            return ServerResponse.createBySuccess("保存成功");
        }
        return ServerResponse.createByErrorMessage("保存失败");
    }







//    public ServerResponse checkTestId(Integer testId){
//        if (testId == null){
//            return ServerResponse.createByErrorMessage("testId不能为空");
//        }
//        int count =
//    }
}






















