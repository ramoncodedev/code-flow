CREATE TABLE lesson_quiz_questions (
    id BIGSERIAL PRIMARY KEY,
    quiz_id BIGINT NOT NULL REFERENCES lesson_quizzes(id) ON DELETE CASCADE,
    prompt TEXT NOT NULL,
    question_type VARCHAR(30) NOT NULL CHECK (question_type IN ('SINGLE_CHOICE')),
    order_index INT NOT NULL DEFAULT 0,
    points INT NOT NULL DEFAULT 1,
    explanation TEXT
);