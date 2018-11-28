package com.codeclan.relationships.DBrelationships.Components;
import com.codeclan.relationships.DBrelationships.Models.File;
import com.codeclan.relationships.DBrelationships.Models.Folder;
import com.codeclan.relationships.DBrelationships.Models.User;
import com.codeclan.relationships.DBrelationships.Repositories.FileRepository;
import com.codeclan.relationships.DBrelationships.Repositories.FolderRepository;
import com.codeclan.relationships.DBrelationships.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){


    }

    @Override
    public void run (ApplicationArguments args) throws Exception{
        User user = new User ("Joe");
        userRepository.save(user);

        Folder folder = new Folder ("New Folder", user);
        folderRepository.save(folder);

        File file = new File("file1", "txt", 10, folder);
        fileRepository.save(file);
    }

}
