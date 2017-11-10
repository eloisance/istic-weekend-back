insert into user (firstname, lastname, email, password, enabled, role) values ('test 1', 'DUPOND', 'user1@gmail.com', 'user1', true, 'ROLE_USER');
insert into user (firstname, lastname, email, password, enabled, role) values ('test 2', 'DUPOND', 'user2@gmail.com', 'user2', true, 'ROLE_USER');
insert into user (firstname, lastname, email, password, enabled, role) values ('test 3', 'DUPOND', 'user3@gmail.com', 'user3', true, 'ROLE_USER');

insert into place (name) values ('Rennes');
insert into place (name) values ('Saint-Malo');
insert into place (name) values ('Brest');
insert into place (name) values ('Mont Blanc');

insert into sport (name) values ('Vélo');
insert into sport (name) values ('Voile');
insert into sport (name) values ('Surf');
insert into sport (name) values ('Ski');
insert into sport (name) values ('Randonnée');
insert into sport (name) values ('Poney');

insert into level (name, sport_id, rank) values ('noob', 1, 1);
insert into level (name, sport_id, rank) values ('medium', 1, 2);
insert into level (name, sport_id, rank) values ('expert', 1, 3);
insert into level (name, sport_id, rank) values ('ourson', 4, 2);
insert into level (name, sport_id, rank) values ('piou piou', 4, 1);
insert into level (name, sport_id, rank) values ('flocon', 4, 3);
insert into level (name, sport_id, rank) values ('galop 1', 6, 1);
insert into level (name, sport_id, rank) values ('galop 2', 6, 2);
insert into level (name, sport_id, rank) values ('galop 3', 6, 3);
insert into level (name, sport_id, rank) values ('Niveau 1', 2, 1);
insert into level (name, sport_id, rank) values ('Vague de bronze', 3, 1);
insert into level (name, sport_id, rank) values ('Niveau 1', 5, 1);

insert into activity (level_id, user_id) values (2, 1);
insert into activity (level_id, user_id) values (3, 1);