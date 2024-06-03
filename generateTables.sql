\c ecommerce;

CREATE TABLE user_entity (
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

CREATE TABLE product_entity (
                                            id SERIAL PRIMARY KEY,
                                            name VARCHAR(255) NOT NULL,
                                            description TEXT,
                                            price DECIMAL(10, 2) NOT NULL,
                                            created_at DATE,
                                            updated_at DATE
);

CREATE TABLE opinion_entity (
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


INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Smartphone', 'A high-performance smartphone with advanced features.', 699.99, 50, '2023-01-15');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Laptop', 'A powerful laptop for work and entertainment.', 1299.99, 30, '2023-02-20');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Headphones', 'Wireless headphones with noise-cancelling technology.', 199.99, 100, '2023-03-10');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Smart Watch', 'A stylish smartwatch with fitness tracking features.', 149.99, 75, '2023-04-05');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Tablet', 'A portable tablet for productivity and entertainment.', 399.99, 60, '2023-05-18');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Camera', 'A high-resolution digital camera.', 499.99, 40, '2023-06-12');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Speaker', 'A portable Bluetooth speaker.', 89.99, 150, '2023-07-19');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Gaming Console', 'A next-gen gaming console.', 399.99, 20, '2023-08-25');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('VR Headset', 'A virtual reality headset.', 299.99, 25, '2023-09-15');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('E-Reader', 'A lightweight e-reader with a high-resolution display.', 129.99, 80, '2023-10-10');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Smart Thermostat', 'A smart thermostat for home automation.', 199.99, 35, '2023-11-05');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Fitness Tracker', 'A fitness tracker with heart rate monitoring.', 99.99, 120, '2023-12-01');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Smart Light Bulb', 'A smart light bulb with color-changing features.', 29.99, 200, '2024-01-12');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Robot Vacuum', 'An automated robot vacuum cleaner.', 249.99, 50, '2024-02-15');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Drone', 'A drone with a 4K camera.', 599.99, 15, '2024-03-18');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Electric Scooter', 'An electric scooter with a long battery life.', 299.99, 25, '2024-04-22');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Wireless Charger', 'A fast wireless charger for smartphones.', 49.99, 90, '2024-05-14');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Bluetooth Earbuds', 'Compact Bluetooth earbuds with great sound quality.', 79.99, 110, '2024-06-21');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Smart Doorbell', 'A smart doorbell with video capabilities.', 149.99, 60, '2024-07-16');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Home Security Camera', 'A home security camera with night vision.', 99.99, 70, '2024-08-18');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Smart Lock', 'A smart lock for keyless entry.', 199.99, 45, '2024-09-12');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Portable Power Bank', 'A high-capacity portable power bank.', 39.99, 130, '2024-10-15');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Smart Glasses', 'Smart glasses with augmented reality features.', 499.99, 20, '2024-11-08');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Action Camera', 'A durable action camera for extreme sports.', 299.99, 40, '2024-12-20');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Smart Display', 'A smart display with voice assistant.', 129.99, 50, '2025-01-22');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Streaming Stick', 'A streaming stick for your TV.', 49.99, 90, '2025-02-25');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Smart Plug', 'A smart plug for home automation.', 19.99, 150, '2025-03-28');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Portable Speaker', 'A waterproof portable speaker.', 59.99, 85, '2025-04-30');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Electric Toothbrush', 'An electric toothbrush with multiple modes.', 79.99, 60, '2025-05-29');
INSERT INTO product_entity (name, description, price, quantity_available, released) VALUES ('Smart Scale', 'A smart scale that tracks body metrics.', 49.99, 75, '2025-06-22');
