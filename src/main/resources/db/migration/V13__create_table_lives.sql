CREATE TABLE lives (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    link TEXT NOT NULL,
    scheduled_at TIMESTAMP NOT NULL,
    is_global BOOLEAN NOT NULL DEFAULT FALSE,
    created_by BIGINT NOT NULL REFERENCES users(id) ON DELETE RESTRICT
);