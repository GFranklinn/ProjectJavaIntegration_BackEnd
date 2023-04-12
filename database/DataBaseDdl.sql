DROP TABLE IF EXISTS table_line;
DROP TABLE IF EXISTS table_category;
DROP TABLE IF EXISTS table_model;

CREATE TABLE table_line(
	id SERIAL PRIMARY KEY,
	name text NOT NULL
);

CREATE TABLE table_category(
	id SERIAL PRIMARY KEY,
	name text NOT NULL,
	id_line int NOT NULL,
	FOREIGN KEY(id_line)
		REFERENCES table_line(id)
);

CREATE TABLE table_model(
	id SERIAL PRIMARY KEY,
	name text NOT NULL,
	id_category int NOT NULL,
	FOREIGN KEY(id_category)
		REFERENCES table_category(id)
);
