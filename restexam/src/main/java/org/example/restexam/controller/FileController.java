package org.example.restexam.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.example.restexam.domain.UploadInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class FileController {
    @GetMapping("/download")
    public void downloadFile(HttpServletResponse response) {
        Path filePath = Paths.get("C:\\Temp\\upload\\cat.jpg");
        response.setContentType("image/jpeg");
        try{
            InputStream inputStream = Files.newInputStream(filePath);
            StreamUtils.copy(inputStream,response.getOutputStream());
            response.flushBuffer();
        }catch(IOException e){
            e.getStackTrace();
        }
    }
    @PostMapping("/upload")
    public ResponseEntity<String> handleFileUpload(
            @RequestParam("file") MultipartFile file,
            @RequestPart("info") UploadInfo uploadInfo
    ) {
        String message = "";

        System.out.println(file.getOriginalFilename() + ":::::::::::::::::::::");
        System.out.println(uploadInfo.getDescription() + ":::::::::::::::::::::");
        System.out.println(uploadInfo.getTag() + ":::::::::::::::::::::");

        try {
            // 업로드 디렉토리 확인
            File uploadDir = new File("C:\\Temp\\upload");
            if (!uploadDir.exists()) {
                uploadDir.mkdirs(); // 디렉토리가 없으면 생성
            }

            if (!uploadDir.canWrite()) {
                throw new IOException("업로드 디렉토리에 쓰기 권한이 없습니다.");
            }

            InputStream inputStream = file.getInputStream();
            StreamUtils.copy(inputStream, new FileOutputStream(new File(uploadDir, file.getOriginalFilename())));
            message = "성공 !!  " + file.getOriginalFilename();
            return ResponseEntity.ok().body(message);
        } catch (IOException e) {
            e.printStackTrace();
            message = " 실패 ..  " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(message);
        }
    }
}
