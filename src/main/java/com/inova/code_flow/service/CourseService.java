package com.inova.code_flow.service;


import com.inova.code_flow.dto.request.CourseRequest;
import com.inova.code_flow.dto.response.CourseResponse;
import com.inova.code_flow.entity.Course;
import com.inova.code_flow.entity.User;
import com.inova.code_flow.enums.Role;
import com.inova.code_flow.mapper.CourseMapper;
import com.inova.code_flow.repository.CourseRepository;
import com.inova.code_flow.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private final UserRepository userRepository;

    @Transactional
    public CourseResponse create(CourseRequest courseRequest) {

        User professor = userRepository.findById(courseRequest.professorId())
                .orElseThrow(() -> new RuntimeException("Professor não foi encontrado"));

        if (!professor.getRole().equals(Role.PROFESSOR)) {
            throw new RuntimeException("O usuário não é um professor");
        }

        Course course = CourseMapper.toEntity(courseRequest, professor);
        course.setProfessor(professor);

        if (course.getOrderIndex() == null) {
            Integer maxOrderIndex = courseRepository.findMaxOrderIndexByCategory(course.getCategory()).orElse(0) + 1;
            course.setOrderIndex(maxOrderIndex);

        }

        Course savedCourse = courseRepository.save(course);
        return CourseMapper.toResponse(savedCourse);
    }


    @Transactional
    public Page<CourseResponse> findAll(int page, int size){
       Pageable pageRequest = PageRequest.of(page, size);
        return courseRepository.findAll(pageRequest)
                .map(CourseMapper::toResponse);
    }

    public CourseResponse findByName(String title){

        Course course = courseRepository.findByTitle(title);

        if (course == null) {
            throw new RuntimeException("Curso não encontrado");
        }

        return CourseMapper.toResponse(course);
    }

    @Transactional
    public CourseResponse update(String title, CourseRequest courseRequest){

        Course course = courseRepository.findByTitle(title);

        if (course == null) {
            throw new RuntimeException("Curso não encontrado");
        }

        if (courseRequest.professorId() != null && !courseRequest.professorId().equals(course.getProfessor().getId())) {
            User professor = userRepository.findById(courseRequest.professorId())
                    .orElseThrow(() -> new RuntimeException("Professor não foi encontrado"));

            if (!professor.getRole().equals(Role.PROFESSOR)) {
                throw new RuntimeException("O usuário não é um professor");
            }

            course.setProfessor(professor);
        }

        CourseMapper.toEntity(courseRequest, course.getProfessor());

        Course update = courseRepository.save(course);
        return CourseMapper.toResponse(update);


    }

    public void delete(Long id){
        if (!courseRepository.existsById(id)) {
            throw new RuntimeException("Curso não encontrado");
        }
        courseRepository.deleteById(id);
    }




}



