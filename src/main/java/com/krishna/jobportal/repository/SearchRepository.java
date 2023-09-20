package com.krishna.jobportal.repository;

import com.krishna.jobportal.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
