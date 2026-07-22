CREATE TABLE lesson_progress (
    id BIGSERIAL PRIMARY KEY,
    lesson_id BIGINT NOT NULL REFERENCES lessons(id) ON DELETE CASCADE,
    student_id BIGINT NOT NULL REFERENCES users(id) ON DELETE CASCADE,
    completed_at TIMESTAMP NOT NULL,
    CONSTRAINT uk_lesson_student UNIQUE (lesson_id, student_id)
);