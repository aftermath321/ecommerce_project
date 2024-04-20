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

INSERT INTO product (description, name, price, producer, quantity_available, released, image_path) VALUES
('Elegant and ergonomic, perfect for long working hours.', 'Executive Chair', 99.99, 'ComfortWorks', 100, '2022-01-01', './src/main/static/public/chair.jpeg'),
('Modern design with premium materials.', 'Office Chair Deluxe', 149.99, 'ModernFurn', 50, '2022-02-01', './src/main/static/public/chair2.jpeg'),
('Minimalist yet functional, ideal for compact spaces.', 'SpaceSaver Desk', 199.99, 'Minimalistic Designs', 75, '2022-03-01', './src/main/static/public/chair3.jpeg'),
('Luxurious and spacious, enhances productivity.', 'Executive Desk', 249.99, 'LuxoLiving', 60, '2022-04-01', './src/main/static/public/chair4.jpeg'),
('Sleek and stylish, enhances any workspace.', 'Contemporary Desk', 299.99, 'Trendy Home', 90, '2022-05-01', './src/main/static/public/desk.jpeg'),
('Versatile and durable, perfect for multi-tasking.', 'Multi-Purpose Desk', 349.99, 'VersaFurn', 80, '2022-06-01', './src/main/static/public/desk2.jpeg'),
('Classic design with modern functionality.', 'Vintage Desk', 399.99, 'Retro Designs', 70, '2022-07-01', './src/main/static/public/desk3.jpeg'),
('Chic and space-saving, ideal for small offices.', 'Compact Office Desk', 449.99, 'SpaceSolutions', 85, '2022-08-01', './src/main/static/public/desk4.jpeg'),
('Professional and elegant, suitable for corporate settings.', 'Corporate Office Set', 499.99, 'ProFurniture', 55, '2022-09-01', './src/main/static/public/office.jpg'),
('Modern and sleek, adds sophistication to any office.', 'Contemporary Office Set', 549.99, 'ModaFurn', 95, '2022-10-01', './src/main/static/public/office1.jpg'),
('Functional and stylish, perfect for home offices.', 'Home Office Set', 599.99, 'CozyNook', 65, '2022-11-01', './src/main/static/public/office2.jpg'),
('Ergonomic and practical, designed for comfort.', 'Ergo Office Set', 649.99, 'ErgoComfort', 75, '2022-12-01', './src/main/static/public/office3.jpg'),
('Spacious and efficient, suitable for large workspaces.', 'Executive Office Set', 699.99, 'EliteOffice', 100, '2023-01-01', './src/main/static/public/office.jpg'),
('Modern and innovative, designed for dynamic work environments.', 'Innovative Office Set', 749.99, 'TechTrend', 40, '2023-02-01', './src/main/static/public/office1.jpg'),
('Sleek and contemporary, offers versatility and style.', 'Versatile Office Set', 799.99, 'UrbanTrend', 80, '2023-03-01', './src/main/static/public/office2.jpg');


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
-- Insert queries for opinions for product IDs 6 to 15
INSERT INTO opinion (body, posted, rating, title, my_user, product) VALUES
('Great addition to my home office setup.', '2023-01-11', 4.8, 'Highly recommended', 1, 6),
('Sleek design and good quality materials.', '2023-01-12', 4.6, 'Impressive', 2, 6),
('Could use some improvement in ergonomics.', '2023-01-13', 3.7, 'Average', 3, 6),
('Comfortable and sturdy.', '2023-01-14', 4.9, 'Love it', 4, 7),
('Not as described in the specifications.', '2023-01-15', 3.2, 'Disappointing', 5, 7),
('Fast delivery, but packaging was damaged.', '2023-01-16', 3.9, 'Fair', 6, 7),
('Excellent value for the price.', '2023-01-17', 4.7, 'Satisfied', 7, 8),
('Best desk I ever had.', '2023-01-18', 4.9, 'Perfect', 8, 8),
('Too small for my needs.', '2023-01-19', 3.4, 'Could be better', 9, 8),
('Great customer service.', '2023-01-20', 4.8, 'Highly recommended', 10, 9),
('Poor assembly instructions.', '2023-01-21', 3.1, 'Average', 1, 9),
('Very pleased with the purchase.', '2023-01-22', 4.5, 'Impressed', 2, 9),
('Stylish and practical.', '2023-01-23', 4.7, 'Love it', 3, 10),
('Received damaged item, but resolved quickly.', '2023-01-24', 3.6, 'Fair', 4, 10),
('Decent quality for the price.', '2023-01-25', 4.2, 'Satisfied', 5, 10),
('Great addition to my workspace.', '2023-01-26', 4.6, 'Impressive', 6, 11),
('Easy to assemble.', '2023-01-27', 4.8, 'Perfect', 7, 11),
('Expected better quality.', '2023-01-28', 3.3, 'Average', 8, 11),
('Very comfortable chair.', '2023-01-29', 4.9, 'Love it', 9, 12),
('Not durable, broke within a month.', '2023-01-30', 2.7, 'Disappointing', 10, 12),
('Average quality for the price.', '2023-01-31', 3.8, 'Fair', 1, 12),
('Excellent service from the seller.', '2023-02-01', 4.9, 'Highly recommended', 2, 13),
('Could improve packaging.', '2023-02-02', 3.5, 'Satisfied', 3, 13),
('Highly satisfied with the product.', '2023-02-03', 4.7, 'Impressed', 4, 13),
('Sturdy and well-built.', '2023-02-04', 4.8, 'Perfect', 5, 14),
('Not suitable for tall individuals.', '2023-02-05', 3.4, 'Average', 6, 14),
('Fast delivery, but missing parts.', '2023-02-06', 3.9, 'Fair', 7, 14),
('Great value for money.', '2023-02-07', 4.6, 'Satisfied', 8, 15),
('Expected better quality for the price.', '2023-02-08', 3.3, 'Average', 9, 15),
('Prompt customer support.', '2023-02-09', 4.8, 'Impressed', 10, 15);



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

