package com.tinku.documentqa;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class DocumentController {

    @PostMapping(value = "/upload", produces = "text/plain;charset=UTF-8")
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {
        return new String(file.getBytes(), StandardCharsets.UTF_8);
        //hey
    }
}