--liquibase formatted sql

--changeset formationreact:1 dbms:h2
insert into application(nom, version, etat) VALUES ('GAIA', '1.0.0', 'ACTIVE');