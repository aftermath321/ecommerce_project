\c ecommerce;

CREATE TABLE main_domain.user_entity (
                                         id SERIAL PRIMARY KEY,
                                         username VARCHAR(255) NOT NULL UNIQUE,
                                         password_hash VARCHAR(255) NOT NULL,
                                         email VARCHAR(255) NOT NULL UNIQUE,
                                         first_name VARCHAR(255),
                                         last_name VARCHAR(255),
                                         created_at DATE,
                                         last_login DATE,
                                         activated_account BOOLEAN DEFAULT FALSE,
                                         role VARCHAR(255),
                                         bio TEXT
);

CREATE TABLE main_domain.product_entity (
                                            id SERIAL PRIMARY KEY,
                                            name VARCHAR(255) NOT NULL,
                                            description TEXT,
                                            price DECIMAL(10, 2) NOT NULL,
                                            created_at DATE,
                                            updated_at DATE
);

CREATE TABLE main_domain.opinion_entity (
                                            id SERIAL PRIMARY KEY,
                                            user_id BIGINT NOT NULL,
                                            product_id BIGINT NOT NULL,
                                            content TEXT NOT NULL,
                                            rating DOUBLE PRECISION NOT NULL,
                                            created_at DATE,
                                            updated_at DATE,
                                            FOREIGN KEY (user_id) REFERENCES main_domain.user_entity(id),
                                            FOREIGN KEY (product_id) REFERENCES main_domain.product_entity(id)
);
