DROP DATABASE IF EXISTS library;
CREATE DATABASE library;
\c library;

CREATE TABLE books(
    id INTEGER NOT NULL UNIQUE PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    author VARCHAR(100) NOT NULL,
    publisher VARCHAR(100),
    year INTEGER NOT NULL
);

CREATE TABLE users(
    id INTEGER NOT NULL UNIQUE PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INTEGER NOT NULL
);

CREATE TABLE reservations(
    id INTEGER NOT NULL UNIQUE PRIMARY KEY,
    book_id INTEGER NOT NULL,
    user_id INTEGER NOT NULL,
    status BOOLEAN NOT NULL,
    FOREIGN KEY (book_id) REFERENCES books(id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);

INSERT INTO books(id, title, author, publisher, year) VALUES
(1, 'O Primo Basílio', 'Eça de Queirós', 'Porto Editora', 1974),
(2, 'Guerra e Paz', 'Liev Tolstoi', 'Null', 1867),
(3, '1984', 'George Orwell', 'Companhia das Letras', 1949),
(4, 'Dom Casmurro', 'Machado de Assis', 'Editora Record', 1899),
(5, 'O Senhor dos Anéis', 'J.R.R. Tolkien', 'HarperCollins', 1954),
(6, 'Cem Anos de Solidão', 'Gabriel García Márquez', 'Editora Globo', 1967),
(7, 'O Hobbit', 'J.R.R. Tolkien', 'HarperCollins', 1937),
(8, 'Kamasutra', 'Vatsyayana', 'Plátano', 1883),
(9, 'Pai rico, Pai pobre', 'Robert Kiyosaki', 'Pinguim', 2018),
(10, 'O Código da Vinci', 'Dan Brown', 'Bertrand', 2003);

INSERT INTO users(id, name, age) VALUES
(1, 'Marcelo', 37),
(2, 'Ricardo', 30),
(3, 'Luis', 36),
(4, 'Joana', 25),
(5, 'Mafralda', 14),
(6, 'Alvarinho', 78);

INSERT INTO reservations (id, book_id, user_id, status) VALUES
(1, 1, 2, TRUE),
(2, 10, 1, FALSE),
(3, 5, 3, TRUE),
(4, 7, 4, TRUE),
(5, 4, 5, FALSE),
(6, 8, 5, TRUE),
(7, 8, 6, FALSE);

SELECT * FROM books WHERE author = 'Liev Tolstoi';

SELECT COUNT(status) FROM reservations WHERE status = true;

SELECT publisher FROM books WHERE title = 'O Primo Basílio';

SELECT users.name FROM users, books, reservations
WHERE reservations.user_id = users.id AND books.year < 1974 AND books.id = reservations.book_id;



