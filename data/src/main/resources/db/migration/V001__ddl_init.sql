
CREATE EXTENSION pgcrypto;

CREATE SEQUENCE user_seq;

CREATE TABLE IF NOT EXISTS tb_users (
    id integer DEFAULT nextval('user_seq') NOT NULL PRIMARY KEY,
    email TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL
);