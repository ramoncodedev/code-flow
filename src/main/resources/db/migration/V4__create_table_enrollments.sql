CREATE TABLE enrollments (
    id BIGSERIAL PRIMARY KEY,
    student_id BIGINT NOT NULL REFERENCES users(id) ON DELETE CASCADE,
    course_id BIGINT NOT NULL REFERENCES courses(id) ON DELETE CASCADE,
    registration_process VARCHAR(20) NOT NULL DEFAULT 'ACTIVE'
        CHECK (registration_process IN ('ACTIVE', 'COMPLETED', 'DROPPED')),
    CONSTRAINT uk_student_course UNIQUE (student_id, course_id)
);