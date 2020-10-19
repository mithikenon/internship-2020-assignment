package com.intern.file.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.intern.file.constant.GlobalConstant;
import com.intern.file.entity.UserEntity;
import com.intern.file.repository.UserRepository;

@Service
public class FileService {
	
	@Autowired
	UserRepository userRepository;
	Logger logger = org.slf4j.LoggerFactory.getLogger(FileService.class);
	
	   public String getFolderPath(Integer lo,String name) {

	        StringBuilder path = new StringBuilder();
	        
	        path.append(GlobalConstant.FolderName.FOLDER_ROOT).append("/");
	
	        String nextFolder;
	      
	        if (lo.equals(GlobalConstant.FolderLocation.LOCATION_NRC)) {
	            nextFolder = GlobalConstant.FolderName.NRC;
	        } else if (lo.equals(GlobalConstant.FolderLocation.LOCATION_PROFILE)) {
	            nextFolder = GlobalConstant.FolderName.PROFILE;
	        }
	       else {
	            nextFolder = GlobalConstant.FolderName.FOLDER_OTHER;
	        }
	      
	        path.append(nextFolder).append("/").append(name).append("/");
	       
	        Double ra = Math.random();
	        Long random=(long) (ra*10000);
	   
	        path.append(random);
	        path.append(System.currentTimeMillis());
	       
	        return path.toString();
	    }
	 public Long saveFile(MultipartFile file, String path) throws IOException {
	       
		 if (file.isEmpty()) {
	            throw new RuntimeException("File is empty");
	        }
	        
	        Path location = Paths.get(path);
	        
	        if (Files.notExists(location)) {
	            new File(location.toString()).mkdirs();
	        }
	        return Files.copy(file.getInputStream(),
	                location.resolve(file.getOriginalFilename()),
	                StandardCopyOption.REPLACE_EXISTING);
	    }
	public List<UserEntity> getUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	public UserEntity addUser(UserEntity user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	public UserEntity findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElse(null);
	}

}
