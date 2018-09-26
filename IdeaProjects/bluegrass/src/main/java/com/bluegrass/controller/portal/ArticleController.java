package com.bluegrass.controller.portal;

import com.bluegrass.common.Const;
import com.bluegrass.common.ServerResponse;
import com.bluegrass.pojo.Article;
import com.bluegrass.pojo.User;
import com.bluegrass.service.IArticleService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/article/")
public class ArticleController {

    @Autowired
    IArticleService iArticleService;

    @RequestMapping(value = "save.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> saveArticle(HttpSession session, Article article){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null){
            return ServerResponse.createByErrorMessage("用户未登录,请登录");
        }
        return iArticleService.saveOrUpdateArticle(user,article);
    }

    @RequestMapping(value = "update.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> updateArticle(HttpSession session, Article article){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null){
            return ServerResponse.createByErrorMessage("用户未登录,请登录");
        }
        return iArticleService.saveOrUpdateArticle(user,article);
    }

    @RequestMapping(value = "search_by_userId.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<PageInfo> searchByUserId(HttpSession session, Integer userId, @RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null){
            return ServerResponse.createByErrorMessage("用户未登录,请登录");
        }
        return iArticleService.searchByUserId(userId,pageNum,pageSize);
    }

    @RequestMapping(value = "search_my_article.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<PageInfo> searchMyArticle(HttpSession session, @RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null){
            return ServerResponse.createByErrorMessage("用户未登录,请登录");
        }
        return iArticleService.searchByUserId(user.getId(),pageNum,pageSize);
    }

    @RequestMapping(value = "search_by_article_title.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<PageInfo> searchByArticleTitle(HttpSession session,String articleTitle, @RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null){
            return ServerResponse.createByErrorMessage("用户未登录,请登录");
        }
        return iArticleService.searchByArticleTitle(articleTitle,pageNum,pageSize);
    }


    @RequestMapping(value = "delete_by_article_id.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> deleteByArticleId(HttpSession session,Integer articleId){

        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null){
            return ServerResponse.createByErrorMessage("用户未登录,请登录");
        }
        return iArticleService.deleteByArticleId(articleId);

    }





}
