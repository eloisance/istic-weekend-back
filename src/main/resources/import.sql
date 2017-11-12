insert into user (firstname, lastname, email, password, lat, lng, enabled, role) values ('test 1', 'DUPOND', 'user1@gmail.com', 'user1', 48.6462606, -2.0773425, true, 'ROLE_USER');
insert into user (firstname, lastname, email, password, lat, lng, enabled, role) values ('test 2', 'DUPOND', 'user2@gmail.com', 'user2', 48.8588376, 2.2768483, true, 'ROLE_USER');
insert into user (firstname, lastname, email, password, lat, lng, enabled, role) values ('test 3', 'DUPOND', 'user3@gmail.com', 'user3', 43.703169, 7.1826053, true, 'ROLE_USER');

insert into place (name) values ('Rennes');
insert into place (name) values ('Saint-Malo');
insert into place (name) values ('Brest');
insert into place (name) values ('Mont Blanc');

insert into sport (name, image) values ('Vélo', 'bike.jpeg');
insert into sport (name, image) values ('Voile', 'sailboat.jpeg');
insert into sport (name, image) values ('Surf', 'surf.jpeg');
insert into sport (name, image) values ('Ski', 'ski.jpeg');
insert into sport (name, image) values ('Randonnée', 'hiking.jpeg');
insert into sport (name, image) values ('Poney', 'pony.jpeg');

insert into level (name, sport_id, rank) values ('Noob', 1, 1);
insert into level (name, sport_id, rank) values ('Medium', 1, 2);
insert into level (name, sport_id, rank) values ('Expert', 1, 3);
insert into level (name, sport_id, rank) values ('Ourson', 4, 2);
insert into level (name, sport_id, rank) values ('Piou piou', 4, 1);
insert into level (name, sport_id, rank) values ('Flocon', 4, 3);
insert into level (name, sport_id, rank) values ('Galop 1', 6, 1);
insert into level (name, sport_id, rank) values ('Galop 2', 6, 2);
insert into level (name, sport_id, rank) values ('Galop 3', 6, 3);
insert into level (name, sport_id, rank) values ('Niveau 1', 2, 1);
insert into level (name, sport_id, rank) values ('Vague de bronze', 3, 1);
insert into level (name, sport_id, rank) values ('Niveau 1', 5, 1);

insert into activity (level_id, user_id) values (2, 1);
insert into activity (level_id, user_id) values (3, 1);