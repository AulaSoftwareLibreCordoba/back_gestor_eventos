-- Crear tabla Usuario
CREATE TABLE Usuario (
    IDUsuario INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50),
    Apellido1 VARCHAR(50),
    Apellido2 VARCHAR(50),
    CorreoElectronico VARCHAR(100) UNIQUE,
    Contrasena VARCHAR(255)
);

-- Crear tabla Organizador
CREATE TABLE Organizador (
    IDOrganizador INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50),
    Apellido1 VARCHAR(50),
    Apellido2 VARCHAR(50)
);

-- Crear tabla Categoria
CREATE TABLE Categoria (
    IDCategoria INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100)
);

-- Crear tabla Evento
CREATE TABLE Evento (
    IDEvento INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100),
    Fecha DATE,
    Aforo INT,
    Lugar VARCHAR(100),
    IDCategoria INT,
    FOREIGN KEY (IDCategoria) REFERENCES Categoria(IDCategoria)
);

-- Tabla intermedia Usuario - Evento (U-E)
CREATE TABLE U_E (
    IDUsuario INT,
    IDEvento INT,
    PRIMARY KEY (IDUsuario, IDEvento),
    FOREIGN KEY (IDUsuario) REFERENCES Usuario(IDUsuario),
    FOREIGN KEY (IDEvento) REFERENCES Evento(IDEvento)
);

-- Tabla intermedia Organizador - Evento (O-E)
CREATE TABLE O_E (
    IDEvento INT,
    IDOrganizador INT,
    PRIMARY KEY (IDEvento, IDOrganizador),
    FOREIGN KEY (IDEvento) REFERENCES Evento(IDEvento),
    FOREIGN KEY (IDOrganizador) REFERENCES Organizador(IDOrganizador)
);
