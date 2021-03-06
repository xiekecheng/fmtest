package com.learn.fmtest3.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @description: 多文件上传
 * @author: Kecheng Xie
 * @since: 2019-07-27 12:49
 **/
@RestController
public class FileUploadsController {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

    @PostMapping("/uploads")
    public String uploads(MultipartFile[] uploadFiles, HttpServletRequest request) {
        for (MultipartFile uploadFile : uploadFiles) {
//配置穿上文件的路径
            String realPath = request.getSession().getServletContext().getRealPath("/uploadFile/");
            //格式化日期
            String format = sdf.format(new Date());
            File folder = new File(realPath + format);

            if (!folder.isDirectory()) {
                folder.mkdirs();
            }
            System.out.println(folder);

            String oldName = uploadFile.getOriginalFilename();
            String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());

            try {
                uploadFile.transferTo(new File(folder, newName));
                String filePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/uploadFile/" + format + newName;
                return filePath;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "上传失败";


    }

}
