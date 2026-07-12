-- FTSBlogArticle: PostgreSQL uses tsvector + GIN index for full-text search
CREATE TABLE fts_blog_article (
    id TEXT NOT NULL PRIMARY KEY,
    title TEXT,
    content TEXT,
    search_vector tsvector GENERATED ALWAYS AS (
        to_tsvector('english', coalesce(id, '') || ' ' || coalesce(title, '') || ' ' || coalesce(content, ''))
    ) STORED
);

CREATE INDEX idx_fts_blog_article_search ON fts_blog_article USING GIN (search_vector);

-- FTSDocsArticle
CREATE TABLE fts_docs_article (
    id TEXT NOT NULL PRIMARY KEY,
    product TEXT,
    title TEXT,
    content TEXT,
    search_vector tsvector GENERATED ALWAYS AS (
        to_tsvector('english', coalesce(id, '') || ' ' || coalesce(product, '') || ' ' || coalesce(title, '') || ' ' || coalesce(content, ''))
    ) STORED
);

CREATE INDEX idx_fts_docs_article_search ON fts_docs_article USING GIN (search_vector);

-- FTSSampleProject
CREATE TABLE fts_sample_project (
    id TEXT NOT NULL PRIMARY KEY,
    product TEXT,
    title TEXT,
    description TEXT,
    files TEXT,
    search_vector tsvector GENERATED ALWAYS AS (
        to_tsvector('english', coalesce(id, '') || ' ' || coalesce(product, '') || ' ' || coalesce(title, '') || ' ' || coalesce(description, '') || ' ' || coalesce(files, ''))
    ) STORED
);

CREATE INDEX idx_fts_sample_project_search ON fts_sample_project USING GIN (search_vector);

-- State
CREATE TABLE state (
    id TEXT NOT NULL PRIMARY KEY,
    key TEXT NOT NULL,
    value TEXT NOT NULL
);

