#creo base de datos
CREATE DATABASE superheroes;

#pongo en uso la base de datos para avisar que la voy a modificar
USE superheroes;

#creo una tabla
CREATE TABLE creador(
	id_creador INT NOT NULL,
    nombre VARCHAR(20) NOT NULL,
    PRIMARY KEY(id_creador)
);
# Para eliminar tablas ---> DROP TABLE creador
CREATE TABLE personajes(
	id_personaje INT NOT NULL,
    nombre_real VARCHAR(20) NOT NULL,
    personaje VARCHAR(20) NOT NULL,
    inteligencia INT NOT NULL,
    fuerza VARCHAR(10) NOT NULL,
    velocidad INT NOT NULL,
    poder INT NOT NULL,
    aparicion INT NOT NULL,
    ocupacion VARCHAR(30),
    id_creador INT NOT NULL,
    PRIMARY KEY(id_personaje),
    FOREIGN KEY(id_creador) REFERENCES creador (id_creador) #aca lo que pongo es que lo que conecta
);															#una tabla con la otra, no necesariamente
                                                            #se deben llamar igual
INSERT INTO creador VALUES (1, 'Marvel');
INSERT INTO creador VALUES (2, 'DC');

select * from personajes;

INSERT INTO personajes VALUES (1, 'Bruce Banner', 'Hulk', 160, '600mil', 75, 98, 1962, 'Fisico Nuclear', 1);
INSERT INTO personajes VALUES (2, 'Tony Stark', 'Iron Man', 170, '200mil', 70, 123, 1963, 'Inventor Industrial', 1);
INSERT INTO personajes VALUES (3, 'Thor Ordinson', 'Thor', 145, 'infinita', 100, 235, 1962, 'Rey de Asgard', 1);
INSERT INTO personajes VALUES (4, 'Wanda Maximoff', 'Bruja Escarlata', 170, '100mil', 90, 345, 1964, 'Bruja', 1);
INSERT INTO personajes VALUES (5, 'Carol Danvers', 'Capitana Marvel', 157, '250mil', 85, 128, 1968, 'Oficial de inteligencia', 1);
INSERT INTO personajes VALUES (6, 'Thanos', 'Thanos', 170, 'infinita', 40, 306, 1973, 'Adorador de la muerte', 1);
INSERT INTO personajes VALUES (7, 'Peter Parker', 'Spiderman', 165, '25mil', 80, 74, 1962, 'Fotografo', 1);
INSERT INTO personajes VALUES (8, 'Steve Rogers', 'Capitan America', 145, '600', 45, 60, 1941, 'Oficial Federal', 1);
INSERT INTO personajes VALUES (9, 'Bobby Drake', 'Ice Man', 140, '2mil', 64, 122, 1963, 'Contador', 1);
INSERT INTO personajes VALUES (10, 'Barry Allen', 'Flash', 160, '10mil', 120, 168, 1956, 'Cientifico Forence', 2);
INSERT INTO personajes VALUES (11, 'Bruce Wayne', 'Batman', 170, '500', 32, 47, 1939, 'Hombre de Negocios', 2);
INSERT INTO personajes VALUES (12, 'Clarck Kent', 'Superman', 165, 'infinita', 120, 182, 1948, 'Reportero', 2);
INSERT INTO personajes VALUES (13, 'Diana Prince', 'Mujer Maravilla', 160, 'infinita', 95, 127, 1949, 'Princesa Guerrera', 2);

#Punto A, setear la fecha de aparicion de superamn a 1938
select * from personajes where personaje = 'Superman';
update personajes set aparicion = 1938 where id_personaje = 12;
select * from personajes;

#Punto B, eliminar a Flash
select * from personajes where personaje = 'Flash';
delete from personajes where id_personaje = 10;
select * from personajes;

#Punto C, borrar base de datos
DROP DATABASE superheroes;
#la vuelvo a crear para verla



