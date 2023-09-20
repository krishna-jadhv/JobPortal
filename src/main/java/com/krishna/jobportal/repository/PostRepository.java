package com.krishna.jobportal.repository;

import com.krishna.jobportal.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{

}
