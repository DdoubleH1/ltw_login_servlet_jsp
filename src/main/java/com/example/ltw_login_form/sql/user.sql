CREATE TABLE users(
  id INT PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
);

INSERT INTO users (id, username, password) VALUES (1, 'admin', 'admin');
