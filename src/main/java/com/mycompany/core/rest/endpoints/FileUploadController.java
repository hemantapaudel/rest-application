package com.mycompany.core.rest.endpoints;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
public class FileUploadController {

	public static final String uploadingdir = System.getProperty("user.dir") + "/uploadingdir/";

   

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String uploadingPost(@RequestParam("file") MultipartFile[] uploadingFiles) throws IOException {
        for(MultipartFile uploadedFile : uploadingFiles) {
            File file = new File(uploadingdir + uploadedFile.getOriginalFilename());
            uploadedFile.transferTo(file);
        }
        return "redirect:/";
    }
	
	
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String submit(@RequestParam("file") MultipartFile file) {
      
        return "fileUploadView";
    }
    
    
    
    @RequestMapping(value = "/fileupload", headers=("content-type=multipart/*"),
    		method = RequestMethod.POST)
    public String upload(@RequestParam("file") MultipartFile inputFile) throws UnsupportedEncodingException, IOException {
    	
    	/*String content = new String(inputFile.getBytes(), "UTF-8");
    	System.out.println(content);
    	*/
    	
    	byte[] bytes = inputFile.getBytes();
    	String UPLOADED_FOLDER = "C://upload//";
        Path path = Paths.get(UPLOADED_FOLDER + inputFile.getOriginalFilename());
        //System.out.println(path.getParent());
        Files.write(path, bytes);
    	
    	return "fileupload";
    }
    
    
    
}
