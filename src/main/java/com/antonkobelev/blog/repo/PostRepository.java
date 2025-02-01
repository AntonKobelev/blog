package com.antonkobelev.blog.repo;

import com.antonkobelev.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long>  {
}
