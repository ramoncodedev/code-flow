package com.inova.code_flow.controller;


import com.inova.code_flow.dto.request.CourseRequest;
import com.inova.code_flow.dto.response.CourseResponse;
import com.inova.code_flow.service.CourseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/course")
@RequiredArgsConstructor
public class CourseController {


    private final CourseService courseService;

    @PostMapping("/create")
    public ResponseEntity<CourseResponse> create(@RequestBody @Valid CourseRequest courseRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(courseService.create(courseRequest));
    }


    public Page<CourseResponse> getAll(
            @RequestParam(value = "page" ,defaultValue = "0")int page,
            @RequestParam(value = "size", defaultValue = "10") int size
    ){


        return courseService.findAll(page, size);
    }

}
