package com.huseynovvusal.springblogapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

/** Data transfer object for updating an existing blog post. */
@Data
@EqualsAndHashCode(callSuper = false)
public class UpdateBlog extends CreateBlog {

  public UpdateBlog() {
    super();
  }

  public UpdateBlog(String title, String content) {
    super(title, content);
  }

  @Override
  @NotBlank(message = "Title is required")
  @Size(min = 5, max = 150, message = "Title must be between 5 and 150 characters")
  public String getTitle() {
    return super.getTitle();
  }

  @Override
  @NotBlank(message = "Content is required")
  @Size(max = 50000, message = "Content must not exceed 50,000 characters")
  public String getContent() {
    return super.getContent();
  }
}
