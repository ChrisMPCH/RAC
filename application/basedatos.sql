CREATE TABLE Usuarios4 (
    id_usuario INT(11) PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL,
    a_paterno VARCHAR(20) NOT NULL,
    a_materno VARCHAR(20) NOT NULL,
    no_control INT(8) UNIQUE,
    RFID_llave VARCHAR(12) UNIQUE,
    tipo VARCHAR(10),
    correo VARCHAR(30) UNIQUE,
    genero CHAR(1),
    CONSTRAINT chk_tipo CHECK (tipo IN ('Docente', 'Alumno')),
    CONSTRAINT chk_genero CHECK (genero IN ('F', 'M'))
);

CREATE TABLE Historial4 (
    id_historial INT(11) PRIMARY KEY,
    fecha_entrada DATETIME,
    fecha_salida DATETIME,
    id_usuario INT(11),
    FOREIGN KEY (id_usuario) REFERENCES Usuarios4(id_usuario)
);