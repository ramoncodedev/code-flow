CREATE TABLE lesson_quiz_answers (
    id BIGSERIAL PRIMARY KEY,
    attempt_id BIGINT NOT NULL REFERENCES lesson_quiz_attempts(id) ON DELETE CASCADE,
    question_id BIGINT NOT NULL REFERENCES lesson_quiz_questions(id) ON DELETE CASCADE,
    selected_option_id BIGINT REFERENCES lesson_quiz_options(id) ON DELETE SET NULL,
    is_correct BOOLEAN NOT NULL,
    awarded_points INT NOT NULL DEFAULT 0
);