-- Insert queries for users
INSERT INTO my_user (email, password, role, username) VALUES
('user1@example.com', '$2a$10$zWdNzoZ87WlNOc04pZ2dfuYgZv8iFdpUMj1vtMWfKwtCjJWqgODWG', 'USER', 'user1'),
('user2@example.com', '$2a$10$zWdNzoZ87WlNOc04pZ2dfuYgZv8iFdpUMj1vtMWfKwtCjJWqgODWG', 'USER', 'user2'),
('user3@example.com', '$2a$10$zWdNzoZ87WlNOc04pZ2dfuYgZv8iFdpUMj1vtMWfKwtCjJWqgODWG', 'USER', 'user3'),
('user4@example.com', '$2a$10$zWdNzoZ87WlNOc04pZ2dfuYgZv8iFdpUMj1vtMWfKwtCjJWqgODWG', 'USER', 'user4'),
('user5@example.com', '$2a$10$zWdNzoZ87WlNOc04pZ2dfuYgZv8iFdpUMj1vtMWfKwtCjJWqgODWG', 'USER', 'user5'),
('user6@example.com', '$2a$10$zWdNzoZ87WlNOc04pZ2dfuYgZv8iFdpUMj1vtMWfKwtCjJWqgODWG', 'USER', 'user6'),
('user7@example.com', '$2a$10$zWdNzoZ87WlNOc04pZ2dfuYgZv8iFdpUMj1vtMWfKwtCjJWqgODWG', 'USER', 'user7'),
('user8@example.com', '$2a$10$zWdNzoZ87WlNOc04pZ2dfuYgZv8iFdpUMj1vtMWfKwtCjJWqgODWG', 'USER', 'user8'),
('user9@example.com', '$2a$10$zWdNzoZ87WlNOc04pZ2dfuYgZv8iFdpUMj1vtMWfKwtCjJWqgODWG', 'USER', 'user9'),
('user10@example.com', '$2a$10$zWdNzoZ87WlNOc04pZ2dfuYgZv8iFdpUMj1vtMWfKwtCjJWqgODWG', 'USER', 'user10');

-- Insert queries for user details
INSERT INTO my_user_details (address, city, first_name, last_name, phone_number, zipcode, my_user_id) VALUES
('123 Main St', 'City1', 'John', 'Doe', 1234567890, '12345', 1),
('456 Elm St', 'City2', 'Jane', 'Smith', 9876543210, '67890', 2),
('789 Oak St', 'City3', 'Alice', 'Johnson', 5678901234, '54321', 3),
('321 Pine St', 'City4', 'Bob', 'Brown', 3456789012, '98765', 4),
('654 Maple St', 'City5', 'Emily', 'Jones', 2109876543, '45678', 5),
('987 Cedar St', 'City6', 'Michael', 'Davis', 7890123456, '87654', 6),
('234 Birch St', 'City7', 'Sarah', 'Wilson', 9012345678, '23456', 7),
('567 Walnut St', 'City8', 'David', 'Taylor', 1234509876, '76543', 8),
('890 Cherry St', 'City9', 'Emma', 'Martinez', 6543210987, '34567', 9),
('123 Pineapple St', 'City10', 'James', 'Garcia', 2345678901, '65432', 10);

INSERT INTO product (description, name, price, producer, quantity_available, rating, released, image_path) VALUES
('Description 1', 'Product 1', 99.99, 'Producer 1', 100, 4.5, '2022-01-01', './src/main/static/public/chair.jpeg'),
('Description 2', 'Product 2', 149.99, 'Producer 2', 50, 4.0, '2022-02-01', './src/main/static/public/chair2.jpeg'),
('Description 3', 'Product 3', 199.99, 'Producer 3', 75, 3.8, '2022-03-01', './src/main/static/public/chair3.jpeg'),
('Description 4', 'Product 4', 249.99, 'Producer 4', 60, 4.2, '2022-04-01', './src/main/static/public/chair4.jpeg'),
('Description 5', 'Product 5', 299.99, 'Producer 5', 90, 4.8, '2022-05-01', './src/main/static/public/desk.jpeg'),
('Description 6', 'Product 6', 349.99, 'Producer 6', 80, 4.3, '2022-06-01', './src/main/static/public/desk2.jpeg'),
('Description 7', 'Product 7', 399.99, 'Producer 7', 70, 3.9, '2022-07-01', './src/main/static/public/desk3.jpeg'),
('Description 8', 'Product 8', 449.99, 'Producer 8', 85, 4.6, '2022-08-01', './src/main/static/public/desk4.jpeg'),
('Description 9', 'Product 9', 499.99, 'Producer 9', 55, 3.5, '2022-09-01', './src/main/static/public/office.jpg'),
('Description 10', 'Product 10', 549.99, 'Producer 10', 95, 4.7, '2022-10-01', './src/main/static/public/office1.jpg'),
('Description 11', 'Product 11', 599.99, 'Producer 11', 65, 4.1, '2022-11-01', './src/main/static/public/office2.jpg'),
('Description 12', 'Product 12', 649.99, 'Producer 12', 75, 3.7, '2022-12-01', './src/main/static/public/office3.jpg'),
('Description 13', 'Product 13', 699.99, 'Producer 13', 100, 4.0, '2023-01-01', './src/main/static/public/office.jpg'),
('Description 14', 'Product 14', 749.99, 'Producer 14', 40, 4.4, '2023-02-01', './src/main/static/public/office1.jpg'),
('Description 15', 'Product 15', 799.99, 'Producer 15', 80, 3.6, '2023-03-01', './src/main/static/public/office2.jpg');

-- Insert queries for orders
INSERT INTO my_order (date_ordered, date_sent, order_status, price, shipping_address, orders) VALUES
('2023-01-01', '2023-01-02', 'DELIVERED', 199.99, '123 Main St, City1, 12345', 1),
('2023-01-02', '2023-01-03', 'DELIVERED', 299.99, '456 Elm St, City2, 67890', 2),
('2023-01-03', '2023-01-04', 'DELIVERED', 399.99, '789 Oak St, City3, 54321', 3),
('2023-01-04', '2023-01-05', 'DELIVERED', 499.99, '321 Pine St, City4, 98765', 4),
('2023-01-05', '2023-01-06', 'DELIVERED', 599.99, '654 Maple St, City5, 45678', 5),
('2023-01-06', '2023-01-07', 'DELIVERED', 699.99, '987 Cedar St, City6, 87654', 6),
('2023-01-07', '2023-01-08', 'DELIVERED', 799.99, '234 Birch St, City7, 23456', 7),
('2023-01-08', '2023-01-09', 'DELIVERED', 899.99, '567 Walnut St, City8, 76543', 8),
('2023-01-09', '2023-01-10', 'DELIVERED', 999.99, '890 Cherry St, City9, 34567', 9),
('2023-01-10', '2023-01-11', 'DELIVERED', 1099.99, '123 Pineapple St, City10, 65432', 10);

-- Insert queries for opinions
INSERT INTO opinion (body, posted, rating, title, my_user, product) VALUES
('Great product!', '2023-01-01', 5.0, 'Excellent', 1, 1),
('Not satisfied with the quality.', '2023-01-02', 2.5, 'Disappointing', 2, 1),
('Good value for the price.', '2023-01-03', 4.0, 'Satisfied', 3, 2),
('Excellent customer service.', '2023-01-04', 5.0, 'Highly recommended', 4, 2),
('Could be better.', '2023-01-05', 3.0, 'Average', 5, 3),
('Fast shipping.', '2023-01-06', 4.5, 'Impressed', 6, 3),
('Not what I expected.', '2023-01-07', 2.0, 'Poor quality', 7, 4),
('Amazing!', '2023-01-08', 5.0, 'Love it', 8, 4),
('Needs improvement.', '2023-01-09', 3.5, 'Fair', 9, 5),
('Perfect!', '2023-01-10', 5.0, 'Best purchase ever', 10, 5);

-- Insert queries for item orders
INSERT INTO item_order (quantity, items_ordered, products_ordered) VALUES
(2, 1, 1),
(1, 2, 2),
(3, 3, 3),
(1, 4, 4),
(2, 5, 5),
(1, 6, 6),
(3, 7, 7),
(2, 8, 8),
(1, 9, 9),
(2, 10, 10),
(1, 1, 11),
(2, 2, 12),
(1, 3, 13),
(3, 4, 14),
(2, 5, 15);

