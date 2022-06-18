package hello.upload.controller;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.nio.channels.MulticastChannel;
import java.util.List;

@Data
public class ItemForm {
    Long itemId;
    String itemName;
    MultipartFile attachFile;
    List<MultipartFile> imageFiles;

}
