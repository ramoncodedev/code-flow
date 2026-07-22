CREATE TABLE lesson_quiz_attempts (
    id BIGSERIAL PRIMARY KEY,
    quiz_id BIGINT NOT NULL REFERENCES lesson_quizzes(id) ON DELETE CASCADE,
    student_id BIGINT NOT NULL REFERENCES users(id) ON DELETE CASCADE,
    attempt_number INT NOT NULL,
    score INT NOT NULL,
    max_score INT NOT NULL,
    passed BOOLEAN NOT NULL,
    submitted_at TIMESTAMP NOT NULL,
    CONSTRAINT uk_quiz_student_attempt UNIQUE (quiz_id, student_id, attempt_number)
);