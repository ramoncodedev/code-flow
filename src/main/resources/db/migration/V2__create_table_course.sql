CREATE TABLE courses (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    description TEXT,
    category VARCHAR(50),
    level VARCHAR(50),
    duration_hours INT,
    thumbnail_url VARCHAR(255),
    is_premium BOOLEAN DEFAULT FALSE,
    order_index INT,
    professor_id BIGINT REFERENCES users(id) ON DELETE SET NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);