CREATE TABLE lessons (
    id BIGSERIAL PRIMARY KEY,
    module_id BIGINT NOT NULL REFERENCES course_modules(id) ON DELETE CASCADE,
    title VARCHAR(255) NOT NULL,
    order_index INT,
    duration_minutes INT,
    video_url VARCHAR(500),
    content_type VARCHAR(20) CHECK (content_type IN ('MARKDOWN', 'HTML')),
    content TEXT,
    status VARCHAR(20) NOT NULL DEFAULT 'DRAFT' CHECK (status IN ('DRAFT', 'PUBLISHED', 'ARCHIVED'))
);