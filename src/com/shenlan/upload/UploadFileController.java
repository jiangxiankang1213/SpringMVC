package com.shenlan.upload;

import com.shenlan.model.File;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.UUID;

@Controller
public class UploadFileController {
    /**
     * RequestMapping 用来映射一个请求和请求的方法
     * value="/register" 表示请求由 register 方法进行处理
     *//*
    @RequestMapping(value="/upload")
    public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest req)
            throws IllegalStateException, IOException {

        // 判断文件是否为空，空则返回失败页面
        if (file.isEmpty()) {
            return "failed";
        }
        // 获取文件存储路径（绝对路径）
        String path = req.getServletContext().getRealPath("/WEB-INF/file");
        // 获取原文件名
        String fileName = file.getOriginalFilename();
        // 创建文件实例
        File filePath = new File(path, fileName);
        // 如果文件目录不存在，创建目录
        if (!filePath.getParentFile().exists()) {
            filePath.getParentFile().mkdirs();
            System.out.println("创建目录" + filePath);
        }
        // 写入文件
        file.transferTo(filePath);
        return "success";
    }*/

}
