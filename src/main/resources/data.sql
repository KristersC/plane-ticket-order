DROP TABLE flight;
CREATE TABLE flight(
    id int,
    destination varchar(255),
    time varchar(255),
    eta varchar(255),
    price varchar(255),
    seats varchar(255),
    description varchar(255)
);
INSERT INTO flight (id, destination, time, eta, price, seats, description)
VALUES
('1', 'Berlin', '17:00', '3 hours', '42 EUR', '100', 'Capital of Germany'),
('2', 'Mexico', '03:00', '20 hours', '269 EUR', '200', 'Capital of Mexico'),
('3', 'Madrid', '06:00', '5 hours', '75 EUR', '50', 'Capital of Spain'),
('4', 'Amsterdam', '07:00', '4 hours', '54 EUR', '87', 'Capital of Amsterdam');