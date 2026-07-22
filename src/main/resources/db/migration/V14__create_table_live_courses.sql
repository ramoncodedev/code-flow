CREATE TABLE live_courses (
    id BIGSERIAL PRIMARY KEY,
    live_id BIGINT NOT NULL REFERENCES lives(id) ON DELETE CASCADE,
    course_id BIGINT NOT NULL REFERENCES courses(id) ON DELETE CASCADE,
    CONSTRAINT uk_live_course UNIQUE (live_id, course_id)
);