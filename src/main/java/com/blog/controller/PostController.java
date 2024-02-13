package com.blog.controller;
import com.blog.payload.PostDto;
import com.blog.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {


    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

//    @PostMapping
//    public void createPost(@RequestBody PostDto postDto){
//        postService.createPost(postDto);
//
//    }

//    @PostMapping
//    public ResponseEntity<String> createPost(@RequestBody PostDto postDto) {
//       postService.createPost((postDto));
//
//       return new ResponseEntity<>("Post is created",HttpStatus.CREATED);
//    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public ResponseEntity<?> createPost(@Valid @RequestBody PostDto postDto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return  new ResponseEntity<>(bindingResult.getFieldError().getDefaultMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        PostDto dto = postService.createPost(postDto);
        return new ResponseEntity<>(dto,HttpStatus.CREATED);
    }


//
//    public List<PostDto> getAllPosts(){
//        List<PostDto> postDtos = postService. getAllPosts();
//        return postDtos;

    //http://localhost:8080/api/posts?pageNo=1&pagesize=5&sortBy=title&sortDir=desc

    @GetMapping
    public ResponseEntity<List<PostDto>> getAllPosts(
            @RequestParam(name = "pageNo",defaultValue = "0", required = false) int pageNo,
            @RequestParam(name = "pagesize", defaultValue = "3",required = false) int pagesize,
            @RequestParam(name = "sortBy", defaultValue = "id", required = false) String sortBy,
            @RequestParam(name = "sortDir",defaultValue = "asc", required = false) String sortDir
    ){
        List<PostDto> postDtos = postService.getAllPosts(pageNo,pagesize,sortBy,sortDir);
        return new ResponseEntity<>(postDtos,HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable long id){
        postService.deletePost(id);
        return new ResponseEntity<>("Post is deleted!!",HttpStatus.OK);
    }

   // http://localhost:8080/api/posts?postId=1
   @PreAuthorize("hasRole('ADMIN')")
    @PutMapping
    public ResponseEntity<PostDto> updatePost(
            @RequestParam("postId") long postId,
            @RequestBody PostDto postDto
        ) {
        PostDto dto = postService.updatePost(postId, postDto);
        return new ResponseEntity<>(dto, HttpStatus.OK);

    }
}
