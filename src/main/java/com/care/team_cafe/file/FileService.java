package com.care.team_cafe.file;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	String IMAGE_REPO="c:/spring/image_repo";
	public String saveFile(MultipartFile file);
	//public void deleteImage(String delImage);
}
