
CREATE EXTENSION  IF NOT EXISTS pgcrypto;
-----------------------------------------------
CREATE SEQUENCE IF NOT EXISTS tb_users_seq;

CREATE TABLE IF NOT EXISTS tb_users (
    id integer DEFAULT nextval('tb_users_seq') NOT NULL PRIMARY KEY,
    email TEXT NOT NULL UNIQUE ,
    password TEXT NOT NULL
);


-----------------------------------------------
CREATE SEQUENCE IF NOT EXISTS tb_address_seq;
CREATE TABLE IF NOT EXISTS tb_address (
    id integer DEFAULT nextval('tb_address_seq') NOT NULL PRIMARY KEY,
    title TEXT,
    first_name TEXT,
    last_name TEXT,
    company TEXT,
    address1 TEXT,
    address2 TEXT,
    city TEXT,
    postcode TEXT,
    state_cuntry TEXT,
    country TEXT,
    phone TEXT,
    fax TEXT
);


-----------------------------------------------
CREATE SEQUENCE IF NOT EXISTS tb_customer_seq;

CREATE TABLE IF NOT EXISTS tb_customer(
    id integer DEFAULT nextval('tb_customer_seq') NOT NULL PRIMARY KEY,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    deleted_at TIMESTAMP,
    number_code TEXT,
    expiry_month interval,
    expiry_year interval,
    start_month interval,
    start_year interval,
    issue_number int,
    email TEXT,
    birth_day TIMESTAMP,
    gender TEXT CHECK (gender IN ('m', 'f')),
    billing_id integer,
    shipping_id integer,
    CONSTRAINT tb_customer_billing_id_fk FOREIGN KEY (billing_id) REFERENCES tb_address(id),
    CONSTRAINT tb_customer_shipping_id_fk FOREIGN KEY (shipping_id) REFERENCES tb_address(id)
);