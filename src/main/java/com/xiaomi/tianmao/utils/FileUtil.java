package com.xiaomi.tianmao.utils;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

/**
 * Description: <br>
 * User: dell - XiaomiLi<br>
 * Date: 2018-06-26<br>
 * Time: 8:45<br>
 * UpdateDescription：<br>
 */
public class FileUtil {

    /**
     * 保存文件
     *
     * @param session
     * @param file
     * @return
     * @throws IOException
     */
    public static String saveFile(HttpSession session, MultipartFile file) throws IOException {
        String rootPath = session.getServletContext().getRealPath("/");
        String savePath = "static/" + System.currentTimeMillis() + ".jpg";
        FileUtils.copyInputStreamToFile(file.getInputStream(), new File(rootPath + savePath));
        return savePath;
    }


    /**
     * 保存文件
     *
     * @param session
     * @param files
     * @return
     * @throws IOException
     */
    public static String saveFile(HttpSession session, MultipartFile[] files) throws IOException {
        String rootPath = session.getServletContext().getRealPath("/");
        String realPath = "";
        for (MultipartFile file : files) {
            String savePath = "static/" + System.currentTimeMillis() + ".jpg";
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File(rootPath + savePath));
            realPath += savePath + ",";
        }
        realPath = realPath.length() > 0 ? realPath.substring(0, realPath.length() - 1) : realPath;
        return realPath;
    }
}
